/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thingml.networkplugins.c.arduino;

import org.sintef.thingml.*;
import org.thingml.compilers.Context;
import org.thingml.compilers.c.CCompilerContext;
import org.thingml.compilers.spi.NetworkPlugin;
import org.thingml.compilers.spi.SerializationPlugin;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sintef
 */
public class ArduinoSerialPlugin extends NetworkPlugin {

    CCompilerContext ctx;

    public ArduinoSerialPlugin() {
        super();
    }

    public String getPluginID() {
        return "ArduinoSerialPlugin";
    }

    public List<String> getSupportedProtocols() {
        List<String> res = new ArrayList<>();
        res.add("Serial");
        res.add("Serial0");
        res.add("Serial1");
        res.add("Serial2");
        res.add("Serial3");
        return res;
    }

    public String getTargetedLanguage() {
        return "arduino";
    }

    public void generateNetworkLibrary(Configuration cfg, Context ctx, Set<Protocol> protocols) {
        this.ctx = (CCompilerContext) ctx;
        for (Protocol prot : protocols) {
            HWSerial port = new HWSerial();
            port.protocol = prot;
            try {
                port.sp = ctx.getSerializationPlugin(prot);
                for (ExternalConnector eco : this.getExternalConnectors(cfg, prot)) {
                    port.ecos.add(eco);
                    eco.setName(eco.getProtocol().getName());
                }
                port.generateNetworkLibrary(this.ctx, cfg);
            } catch (UnsupportedEncodingException uee) {
                System.err.println("Could not get serialization plugin... Expect some errors in the generated code");
                uee.printStackTrace();
                return;
            }
        }
    }


    private class HWSerial {
        Set<ExternalConnector> ecos;
        Protocol protocol;
        Set<Message> messages;
        SerializationPlugin sp;

        HWSerial() {
            ecos = new HashSet<>();
            messages = new HashSet<>();
        }

        public void generateMessageForwarders(StringBuilder builder, StringBuilder headerbuilder, Configuration cfg, Protocol prot) {
            try {
                final SerializationPlugin sp = ctx.getSerializationPlugin(prot);
            } catch (UnsupportedEncodingException uee) {
                System.err.println("Could not get serialization plugin... Expect some errors in the generated code");
                uee.printStackTrace();
                return;
            }

            for (ThingPortMessage tpm : getMessagesSent(cfg, prot)) {
                Thing t = tpm.t;
                Port p = tpm.p;
                Message m = tpm.m;

                builder.append("// Forwarding of messages " + prot.getName() + "::" + t.getName() + "::" + p.getName() + "::" + m.getName() + "\n");
                builder.append("void forward_" + prot.getName() + "_" + ctx.getSenderName(t, p, m));
                ctx.appendFormalParameters(t, builder, m);
                builder.append("{\n");

                String i = sp.generateSerialization(builder, "forward_buf", m);

                builder.append("\n//Forwarding with specified function \n");
                builder.append(prot.getName() + "_forwardMessage(forward_buf, " + i + ");\n");
                builder.append("}\n\n");

                headerbuilder.append("// Forwarding of messages " + prot.getName() + "::" + t.getName() + "::" + p.getName() + "::" + m.getName() + "\n");
                headerbuilder.append("void forward_" + prot.getName() + "_" + ctx.getSenderName(t, p, m));
                ctx.appendFormalParameters(t, headerbuilder, m);
                headerbuilder.append(";\n");

            }
        }


        void generateNetworkLibrary(CCompilerContext ctx, Configuration cfg) {
            if (!ecos.isEmpty()) {


                boolean ring = false;
                String ctemplate = ctx.getTemplateByID("templates/ArduinoSerialPlugin.c");
                String htemplate = ctx.getTemplateByID("templates/ArduinoSerialPlugin.h");


                String portName = protocol.getName();

                for (ExternalConnector eco : ecos) {
                    eco.setName(portName);
                }

                Integer baudrate;
                if (protocol.hasAnnotation("serial_baudrate")) {
                    baudrate = Integer.parseInt(protocol.annotation("serial_baudrate").iterator().next());
                } else {
                    baudrate = 115200;
                }
                ctemplate = ctemplate.replace("/*BAUDRATE*/", baudrate.toString());

                ctemplate = ctemplate.replace("/*PROTOCOL*/", portName);
                htemplate = htemplate.replace("/*PROTOCOL*/", portName);

                String startByte;
                if (protocol.hasAnnotation("serial_start_byte")) {
                    startByte = protocol.annotation("serial_start_byte").iterator().next();
                } else {
                    startByte = "18";
                }
                ctemplate = ctemplate.replace("/*START_BYTE*/", startByte);

                String stopByte;
                if (protocol.hasAnnotation("serial_stop_byte")) {
                    stopByte = protocol.annotation("serial_stop_byte").iterator().next();
                } else {
                    stopByte = "19";
                }
                ctemplate = ctemplate.replace("/*STOP_BYTE*/", stopByte);

                String escapeByte;
                if (protocol.hasAnnotation("serial_escape_byte")) {
                    escapeByte = protocol.annotation("serial_escape_byte").iterator().next();
                } else {
                    escapeByte = "125";
                }
                ctemplate = ctemplate.replace("/*ESCAPE_BYTE*/", escapeByte);

                Integer maxMsgSize = 0;
                for (ThingPortMessage tpm : getMessagesReceived(cfg, protocol)) {
                    Message m = tpm.m;
                    if (m != null)
                        System.out.print("m: " + m.getName());
                    messages.add(m);
                    if (ctx.getMessageSerializationSize(m) > maxMsgSize) {
                        maxMsgSize = ctx.getMessageSerializationSize(m);
                    }
                }
                maxMsgSize = maxMsgSize - 2; //FIXME @nicolas

                ctemplate = ctemplate.replace("/*MAX_MSG_SIZE*/", maxMsgSize.toString());

                if (ring) {
                    maxMsgSize++;
                }

                String limitBytePerLoop;
                if (protocol.hasAnnotation("serial_limit_byte_per_loop")) {
                    limitBytePerLoop = protocol.annotation("serial_limit_byte_per_loop").iterator().next();
                } else {
                    Integer tmp = maxMsgSize * 2;
                    limitBytePerLoop = tmp.toString();
                }
                ctemplate = ctemplate.replace("/*MAX_LOOP*/", limitBytePerLoop);


                String msgBufferSize;
                if (protocol.hasAnnotation("serial_msg_buffer_size")) {
                    msgBufferSize = protocol.annotation("serial_msg_buffer_size").iterator().next();
                    Integer tmp = Integer.parseInt(msgBufferSize);
                    if (tmp != null) {
                        if (tmp < maxMsgSize) {
                            System.err.println("Warning: @serial_limit_byte_per_loop should specify a size greater than the maximal size of a message.");
                            msgBufferSize = maxMsgSize.toString();
                        }
                    }
                } else {
                    Integer tmp = maxMsgSize * 2;
                    msgBufferSize = tmp.toString();
                }
                ctemplate = ctemplate.replace("/*MSG_MSG_SIZE*/", msgBufferSize);

                //Connector Instanciation
                StringBuilder eco_instance = new StringBuilder();
                eco_instance.append("//Connector");

                //De Serializer 
                StringBuilder ParserImplementation = new StringBuilder();
                ParserImplementation.append("void " + portName + "_parser(byte * msg, uint16_t size) {\n");
                sp.generateParserBody(ParserImplementation, "msg", "size", messages, portName + "_instance.listener_id");
                ParserImplementation.append("}\n");

                ctemplate = ctemplate.replace("/*PARSER_IMPLEMENTATION*/", sp.generateSubFunctions() + ParserImplementation);

                String ParserCall = portName + "_parser(" + portName + "_msg_buf, " + portName + "_msg_index);";
                ctemplate = ctemplate.replace("/*PARSER_CALL*/", ParserCall);
                //End De Serializer


                ctemplate = ctemplate.replace("/*INSTANCE_INFORMATION*/", eco_instance);

                ctx.addToInitCode("\n" + portName + "_instance.listener_id = add_instance(&" + portName + "_instance);\n");
                ctx.addToInitCode(portName + "_setup();\n");
                ctx.addToPollCode(portName + "_read();\n");

                StringBuilder b = new StringBuilder();
                StringBuilder h = new StringBuilder();
                generateMessageForwarders(b, h, cfg, protocol);

                ctemplate += b;
                htemplate += h;

                ctx.getBuilder(portName + ".c").append(ctemplate);
                ctx.getBuilder(portName + ".h").append(htemplate);
            }
        }
    }

}
