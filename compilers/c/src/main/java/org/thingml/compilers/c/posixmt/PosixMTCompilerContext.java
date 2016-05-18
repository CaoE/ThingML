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
package org.thingml.compilers.c.posixmt;

import java.util.HashMap;
import java.util.Map;
import org.sintef.thingml.Message;
import org.sintef.thingml.Parameter;
import org.sintef.thingml.Port;
import org.sintef.thingml.Thing;
import org.sintef.thingml.Type;
import org.thingml.compilers.Context;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.c.posix.CCompilerContextPosix;

/**
 *
 * @author sintef
 */
public class PosixMTCompilerContext extends CCompilerContextPosix{

    public PosixMTCompilerContext(ThingMLCompiler c) {
        super(c);
    }
    
    Map<Thing, Map<Port,Integer>> portIDs = new HashMap<>();
    Map<Thing,Integer> lastIDs = new HashMap<>();
    
    public int getPortID(Thing t, Port p) {
        Integer id, id2;
        id = new Integer(0);
        if(!portIDs.containsKey(t)) {
            portIDs.put(t, new HashMap<Port,Integer>());
        }
        Map<Port,Integer> ids = portIDs.get(t);
        if(!ids.containsKey(p)) {
            if(!lastIDs.containsKey(t)) {
                lastIDs.put(t, 0);
            }
            id = lastIDs.get(t);
            ids.put(p, id);
            id2 = lastIDs.get(t);
            id2++;
            lastIDs.put(t, id2);
        } else {
            id = ids.get(p);
        }
        return id;
    }
    
    public void bytesToSerialize(Type t, StringBuilder builder, String variable, Parameter pt, String instanceVarName) {
        int i = getCByteSize(t, 0);
        String v = variable;
        if (isPointer(t)) {
            // This should not happen and should be checked before.
            throw  new Error("ERROR: Attempting to deserialize a pointer (for type " + t.getName() + "). This is not allowed.");
        } else {
            //builder.append("byte * " + variable + "_serializer_pointer = (byte *) &" + v + ";\n");

            if(pt.isIsArray()) {
                builder.append("\n// cardinality: \n");
               throw new Error("ERROR: Attempting to serialize an array (for type " + t.getName() + "). This is not allowed.");
                
                //TODO enqueue dequeue of array
            } else {
                builder.append("union u_" + v + "_t {\n");
                builder.append(getCType(t) + " p;\n");
                builder.append("byte bytebuffer[" + getCByteSize(t, 0) + "];\n");
                builder.append("} u_" + v + ";\n");
                builder.append("u_" + v + ".p = " + v + ";\n");
            
                while (i > 0) {
                    i = i - 1;
                    //if (i == 0) 
                    //builder.append("_fifo_enqueue(" + variable + "_serializer_pointer[" + i + "] & 0xFF);\n");
                    builder.append("_fifo_enqueue(" + instanceVarName + ".fifo,  u_" + variable + ".bytebuffer[" + i + "] & 0xFF );\n");
                    //else builder.append("_fifo_enqueue((parameter_serializer_pointer[" + i + "]>>" + (8 * i) + ") & 0xFF);\n");
        }
            }
        }
    }
    
    @Override
    public void appendFormalParametersForDispatcher(StringBuilder builder, Message m) {
        builder.append("(");
        builder.append("uint16_t sender");
        for (Parameter p : m.getParameters()) {
            builder.append(", ");
            builder.append(getCType(p.getType()));
            if (p.getCardinality() != null) builder.append("*");
            builder.append(" " + p.getName());
        }
        builder.append(")");
    }
    
    @Override
    public void appendFormalParameters(Thing thing, StringBuilder builder, Message m) {
        builder.append("(");
        builder.append("struct " + getInstanceStructName(thing) + " *" + getInstanceVarName());
        for (Parameter p : m.getParameters()) {
            builder.append(", ");
            builder.append(getCType(p.getType()));
            if (p.getCardinality() != null) builder.append("*");
            builder.append(" " + p.getName());
        }
        builder.append(")");
    }

    @Override
    public void appendFormalParameterDeclarations(StringBuilder builder, Message m) {
        for (Parameter p : m.getParameters()) {
            builder.append(getCType(p.getType()));
            if (p.getCardinality() != null) builder.append("*");
            builder.append(" " + p.getName());
            builder.append(";\n");
        }
    }

    
    @Override
    public void appendActualParameters(Thing thing, StringBuilder builder, Message m, String instance_param) {
        if (instance_param == null) instance_param = getInstanceVarName();
        builder.append("(");
        builder.append(instance_param);
        for (Parameter p : m.getParameters()) {
            builder.append(", ");
            builder.append(p.getName());
        }
        builder.append(")");
    }

    @Override
    public void appendActualParametersForDispatcher(Thing thing, StringBuilder builder, Message m, String instance_param) {
        if (instance_param == null) instance_param = getInstanceVarName();
        builder.append("(");
        builder.append(instance_param);
        for (Parameter p : m.getParameters()) {
            builder.append(", ");
            builder.append(p.getName());
        }
        builder.append(")");
    }
}
