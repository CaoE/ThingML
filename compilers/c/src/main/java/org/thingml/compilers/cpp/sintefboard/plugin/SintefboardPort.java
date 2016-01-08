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
package org.thingml.compilers.cpp.sintefboard.plugin;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.sintef.thingml.Configuration;
import org.sintef.thingml.ExternalConnector;
import org.sintef.thingml.Message;
import org.sintef.thingml.Port;
import org.sintef.thingml.Thing;
import org.thingml.compilers.c.CCompilerContext;
import org.thingml.compilers.c.CNetworkLibraryGenerator;

/**
 *
 * @author sintef
 */
public class SintefboardPort extends CNetworkLibraryGenerator {

    public SintefboardPort(Configuration cfg, CCompilerContext ctx) {
        super(cfg, ctx);
    }
    public SintefboardPort(Configuration cfg, CCompilerContext ctx, Set<ExternalConnector> ExternalConnectors) {
        super(cfg, ctx, ExternalConnectors);
    }

    @Override
    public boolean isGeneratingCpp() {
        return true;
    }

    @Override
    public String getCppNameScope() {
        return "/*CFG_CPPNAME_SCOPE*/";
    }

    
    @Override
    public void generateNetworkLibrary() {
        CCompilerContext ctx = (CCompilerContext) this.ctx;
        for(ExternalConnector eco : this.getExternalConnectors()) {
            //boolean ring = false;
            String ctemplate = ctx.getNetworkLibPortTemplate();
            String htemplate = ctx.getNetworkLibPortHeaderTemplate();

            String portName;
            if(eco.hasAnnotation("port_name")) {
                portName = eco.annotation("port_name").iterator().next();
            } else {
                portName = eco.getProtocol();
            }

            eco.setName(portName);
            //System.out.println("eco name:"+eco.getName());

            //Integer baudrate;
            //if(eco.hasAnnotation("serial_baudrate")) {
            //    baudrate = Integer.parseInt(eco.annotation("serial_baudrate").iterator().next());
            //} else {
            //    baudrate = 115200;
            //}
            //ctemplate = ctemplate.replace("/*BAUDRATE*/", baudrate.toString());

            ctemplate = ctemplate.replace("/*PORT_NAME*/", portName);
            htemplate = htemplate.replace("/*PORT_NAME*/", portName);

            //String startByte;
            //if(eco.hasAnnotation("serial_start_byte")) {
            //    startByte = eco.annotation("serial_start_byte").iterator().next();
            //} else {
            //    startByte = "18";
            //}
            //ctemplate = ctemplate.replace("/*START_BYTE*/", startByte);

            //String stopByte;
            //if(eco.hasAnnotation("serial_stop_byte")) {
            //    stopByte = eco.annotation("serial_stop_byte").iterator().next();
            //} else {
            //    stopByte = "19";
            //}
            //ctemplate = ctemplate.replace("/*STOP_BYTE*/", stopByte);

            //String escapeByte;
            //if(eco.hasAnnotation("serial_escape_byte")) {
            //    escapeByte = eco.annotation("serial_escape_byte").iterator().next();
            //} else {
            //    escapeByte = "125";
            //}
            //ctemplate = ctemplate.replace("/*ESCAPE_BYTE*/", escapeByte);

            //Integer maxMsgSize = 0;
            //for(Message m : eco.getPort().getReceives()) {
            //    if(ctx.getMessageSerializationSize(m) > maxMsgSize) {
            //        maxMsgSize = ctx.getMessageSerializationSize(m);
            //    }
            //}
            //maxMsgSize = maxMsgSize - 2;

            //ctemplate = ctemplate.replace("/*MAX_MSG_SIZE*/", maxMsgSize.toString());

            //if(ring) {
            //    maxMsgSize++;
            //}

            //String limitBytePerLoop;
            //if(eco.hasAnnotation("serial_limit_byte_per_loop")) {
            //    limitBytePerLoop = eco.annotation("serial_limit_byte_per_loop").iterator().next();
            //} else {
            //    Integer tmp = maxMsgSize*2;
            //    limitBytePerLoop = tmp.toString();
            //}
            //ctemplate = ctemplate.replace("/*LIMIT_BYTE_PER_LOOP*/", limitBytePerLoop);



            //String msgBufferSize;
            //if(eco.hasAnnotation("serial_msg_buffer_size")) {
            //    msgBufferSize = eco.annotation("serial_limit_byte_per_loop").iterator().next();
            //    Integer tmp = Integer.parseInt(msgBufferSize);
            //    if(tmp != null) {
            //        if(tmp < maxMsgSize) {
            //            System.err.println("Warning: @serial_limit_byte_per_loop should specify a size greater than the maximal size of a message.");
            //            msgBufferSize = maxMsgSize.toString();
            //        }
            //    }
            //} else {
            //    Integer tmp = maxMsgSize*2;
            //    msgBufferSize = tmp.toString();
            //}
            //ctemplate = ctemplate.replace("/*MSG_BUFFER_SIZE*/", msgBufferSize);

            //Connector Instanciation
            StringBuilder eco_instance = new StringBuilder();
            eco_instance.append("//Connector");
            Port p = eco.getPort();
            if(!p.getReceives().isEmpty()) {
            //if(!p.getSends().isEmpty()) {
                eco_instance.append("// Pointer to receiver list\n");
                eco_instance.append("struct Msg_Handler ** ");
                eco_instance.append(p.getName());
                eco_instance.append("_receiver_list_head;\n");

                eco_instance.append("struct Msg_Handler ** ");
                eco_instance.append(p.getName());
                eco_instance.append("_receiver_list_tail;\n");
            }


            if(!p.getSends().isEmpty()) {
            //if(!p.getReceives().isEmpty()) {
                eco_instance.append("// Handler Array\n");
                eco_instance.append("struct Msg_Handler * ");
                eco_instance.append(p.getName());
                eco_instance.append("_handlers;\n");//[");
                //builder.append(p.getReceives().size() + "];");
            }
            ctemplate = ctemplate.replace("/*INSTANCE_INFORMATION*/", eco_instance);



            ctx.getBuilder(eco.getInst().getInstance().getName() + "_" + eco.getPort().getName() + "_" + eco.getProtocol() + ".c").append(ctemplate);
            ctx.getBuilder(eco.getInst().getInstance().getName() + "_" + eco.getPort().getName() + "_" + eco.getProtocol() + ".h").append(htemplate);

        }
    }

    @Override
    public void generateMessageForwarders(StringBuilder builder, StringBuilder headerbuilder) {
        CCompilerContext ctx = (CCompilerContext) this.ctx;
        if(!this.getExternalConnectors().isEmpty()) {

            //************ Generate methods for sending meassages to ports
            for (ExternalConnector eco : this.getExternalConnectors()) {
                //if (eco.hasAnnotation("c_external_send")) {
                Thing t = eco.getInst().getInstance().getType();
                Port p = eco.getPort();

                for (Message m : p.getSends()) {
                    Set<String> ignoreList = new HashSet<String>();
                    List<String> paramList;

                    headerbuilder.append("// Forwarding of messages " + eco.getName() + "::" + t.getName() + "::" + p.getName() + "::" + m.getName() + "\n");
                    headerbuilder.append("void " + "forward_" + eco.getName() + "_" + ctx.getSenderName(t, p, m));
                    ctx.appendFormalParameters(t, headerbuilder, m);
                    headerbuilder.append(";\n");

                    builder.append("// Forwarding of messages " + eco.getName() + "::" + t.getName() + "::" + p.getName() + "::" + m.getName() + "\n");
                    builder.append("void " + getCppNameScope() + "forward_" + eco.getName() + "_" + ctx.getSenderName(t, p, m));
                    ctx.appendFormalParameters(t, builder, m);
                    builder.append("{\n");

                    //builder.append("//eco.getname is() " + eco.getName() + "\n");
                    String portname = eco.getName();
                    String portnum = portname.replace("Port", "");
                    //builder.append("//portnum is() " + portnum + "\n");
                    //builder.append("//eco.getProtocol() is " + eco.getProtocol() + "\n");
                    //builder.append("//m.getname is() " + m.getName() + "\n");
                    String msgid = m.annotation("rcdport_msgid").iterator().next();
                    //builder.append("//m.annotation(rcdport_msgid) is " +  msgid + "\n");
                    //String composeproto = m.annotation("rcdport_composeproto").iterator().next();
                    //builder.append("//m.annotation(rcdport_composeproto) is " +  composeproto + "\n");
                    //String composestr = composeproto.replace("/*MSG_PTR*/", "&msg_out").replace("/*MSGID*/", msgid);

                    //paramList = ctx.getFormalParameterNamelist(t, m);
                    //for (int i = 0; i < paramList.size(); i++){
                    //    builder.append("//ctx.getFormalParameterNamelist(" + i + ") is " +  paramList.get(i) + "\n");
                    //}

                    //builder.append("// TODO This code will be added later\n");
                    builder.append("msgc_t   msg_out;      // Outgoing message\n");
                    builder.append("if( Ports_ptr->IsConnected(" + portnum + ") ) {\n");
                    builder.append("APP_MSGC_comp" + ctx.getConcatenatedParameterTypes(m) + "(&msg_out, " + msgid + ctx.getActualParametersSection(m) + ");\n");
                    //builder.append(composestr + "\n");
                    builder.append("Ports_ptr->SendMsgc(" + portnum + ", &msg_out);\n");
                    builder.append("}\n");

                    //ctx.generateSerializationForForwarder(m, builder, ctx.getHandlerCode(cfg, m), ignoreList);

                    //builder.append("\n//Forwarding with specified function \n");
                    //builder.append(eco.getName() + "_forwardMessage(forward_buf, " + (ctx.getMessageSerializationSize(m) - 2) + ");\n");

            //builder.append(eco.annotation("c_external_send").iterator().next() + "(forward_buf, " + (ctx.getMessageSerializationSize(m) - 2) + ");\n");
                    builder.append("}\n\n");
                }
            }

            //************ Generate methods for receiving messages from ports

            //This header is part of the "sintefboard_main_header.h" template file
            //headerbuilder.append("// Receive forwarding of messages from ports\n");
            //headerbuilder.append("void " + "receive_forward(msgc_t *msg_in_ptr, int16_t from_port)");
            //headerbuilder.append(";\n");
            builder.append("// Receive forwarding of messages from ports\n");
            builder.append("void " + getCppNameScope() + "receive_forward(msgc_t *msg_in_ptr, int16_t from_port)");
            builder.append("{\n");
            builder.append("switch (from_port) {\n");
            for (ExternalConnector eco : this.getExternalConnectors()) {
                //if (eco.hasAnnotation("c_external_send")) {
                Thing t = eco.getInst().getInstance().getType();
                Port p = eco.getPort();
                String portname = eco.getName();
                String portnum = portname.replace("Port", "");
                builder.append("//portnum is() " + portnum + "\n");
                builder.append("case " + portnum + ":\n");
                generatePortReceiver(portname, p, builder);
                builder.append("break;\n");
            }
            builder.append("} // switch from port\n");
            builder.append("}\n");
        }
    }

    private void generatePortReceiver(String portname, Port p, StringBuilder builder) {
        CCompilerContext ctx = (CCompilerContext) this.ctx;
        
        builder.append("switch (msg_in_ptr->MsgId) {\n");
        for (Message m : p.getReceives()) {
            Set<String> ignoreList = new HashSet<String>();
            String msgid = m.annotation("rcdport_msgid").iterator().next();
            builder.append("//m.annotation(rcdport_msgid) is " +  msgid + "\n");
            String decompproto = m.annotation("rcdport_decompproto").iterator().next();
            builder.append("//m.annotation(rcdport_decompproto) is " +  decompproto + "\n");
            builder.append("case " + msgid + ":\n");
            builder.append("{\n");
            ctx.appendFormalParameterDeclarations(builder, m);
            //String decompstr = decompproto.replace("/*MSG_PTR*/", "msg_in_ptr").replace("/*MSGID*/", msgid);
            //builder.append(decompstr + "\n");
            builder.append("APP_MSGC_decomp" + ctx.getConcatenatedParameterTypes(m) + "(&msg_out, " + msgid + ctx.getActualPtrParametersSection(m) + ");\n");
            builder.append("{\n");
            ctx.generateSerializationForForwarder(m, builder, ctx.getHandlerCode(cfg, m), ignoreList);
            builder.append("externalMessageEnqueue(forward_buf, " + (ctx.getMessageSerializationSize(m) - 2) + ", " + portname + "_instance.listener_id);\n");
            builder.append("}\n");
            builder.append("}\n");
            builder.append("break;\n");
        }
        builder.append("} // switch MsgId \n");
    }

}
