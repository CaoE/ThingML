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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.sintef.thingml.Handler;
import org.sintef.thingml.Message;
import org.sintef.thingml.Port;
import org.sintef.thingml.Property;
import org.sintef.thingml.Region;
import org.sintef.thingml.Session;
import org.sintef.thingml.StateMachine;
import org.sintef.thingml.Thing;
import org.sintef.thingml.constraints.ThingMLHelpers;
import org.sintef.thingml.helpers.CompositeStateHelper;
import org.sintef.thingml.helpers.RegionHelper;
import org.sintef.thingml.helpers.StateHelper;
import org.sintef.thingml.helpers.ThingHelper;
import org.thingml.compilers.DebugProfile;
import org.thingml.compilers.c.CCompilerContext;
import org.thingml.compilers.c.CThingApiCompiler;

/**
 *
 * @author sintef
 */
public class PosixMTThingApiCompiler extends CThingApiCompiler {
    @Override
    protected void generateCHeaderAnnotation(Thing thing, StringBuilder builder, CCompilerContext ctx) {
        builder.append("#include \"runtime.h\"\n");

        super.generateCHeaderAnnotation(thing, builder, ctx);
    }
    
    protected List<Region> regionSession(Region r) {
        List<Region> res = new ArrayList<Region>();
        res.addAll(RegionHelper.allContainedSessions(r));
        for(Session s : RegionHelper.allContainedSessions(r)) res.addAll(regionSession(s));
        return res;
    }
    
    @Override
    protected void generateInstanceStruct(Thing thing, StringBuilder builder, CCompilerContext ctx, DebugProfile debugProfile) {
        builder.append("// Definition of the sessions stuct:\n\n");
        StateMachine sm = ThingMLHelpers.allStateMachines(thing).get(0);
        if(!CompositeStateHelper.allContainedSessions(sm).isEmpty()) {
            builder.append("struct session_t;\n\n");
        }
        
        builder.append("// Definition of the instance stuct:\n");
        builder.append("struct " + ctx.getInstanceStructName(thing) + " {\n");
        builder.append("bool active;\n");
        builder.append("bool alive;\n");

        //builder.append("// Variables for the ID of the instance\n");
        //builder.append("int id;\n");
        
        builder.append("// Variables for the ID of the ports of the instance\n");
        
        //if(ctx.containsDebug(ctx.getCurrentConfiguration(), thing)) {
        if(debugProfile.isActive()) {
            builder.append("bool debug;\n");
            builder.append("char * name;\n");
        }
        
        for (Port p : ThingMLHelpers.allPorts(thing)) {
            builder.append("uint16_t id_");
            builder.append(p.getName());
            builder.append(";\n");
        }
        
        //fifo
        builder.append("struct instance_fifo fifo;\n");
        
        //Sessions
        builder.append("\n// Instances of different sessions\n");
        for(Session s : CompositeStateHelper.allContainedSessions(sm)) {
            builder.append("struct session_t * sessions_" + s.getName() + ";\n");
        }
        
        
        // Variables for each region to store its current state
        builder.append("\n// Variables for the current instance state\n");

        // This should normally be checked before and should never be true
        if (ThingMLHelpers.allStateMachines(thing).size() > 1) {
            throw new Error("Info: Thing " + thing.getName() + " has " + ThingMLHelpers.allStateMachines(thing).size() + " state machines. " + "Error: Code generation for Things with several state machines not implemented.");
        }

        if (ThingMLHelpers.allStateMachines(thing).size() > 0) {
            for (Region r : RegionHelper.allContainedRegionsAndSessions(sm)) {
                builder.append("int " + ctx.getStateVarName(r) + ";\n");
            }
        }

        // Create variables for all the properties defined in the Thing and States
        builder.append("// Variables for the properties of the instance\n");
        for (Property p : ThingHelper.allPropertiesInDepth(thing)) {
            builder.append(ctx.getCType(p.getType()) + " ");
            if (p.getCardinality() != null) {//array
                builder.append("* ");
            }
            builder.append(ctx.getCVarName(p));
            
            builder.append(";\n");
            if(p.getCardinality() != null) {//array
                builder.append("uint16_t ");
                builder.append(ctx.getCVarName(p));
                builder.append("_size;\n");
            }
        }
        builder.append("\n};\n");
        
        if(!CompositeStateHelper.allContainedSessions(ThingMLHelpers.allStateMachines(thing).get(0)).isEmpty()) {
            builder.append("struct session_t {\n");
            builder.append("    struct " + ctx.getInstanceStructName(thing) + " s;\n");
            builder.append("    pthread_t thread;\n");
            builder.append("    byte fifo_array[65535];\n");
            builder.append("    struct session_t * next;\n");
            
            builder.append("};\n\n");
        }
    }
    
    @Override
    protected void generatePublicPrototypes(Thing thing, StringBuilder builder, CCompilerContext cctx) {
        PosixMTCompilerContext ctx = (PosixMTCompilerContext) cctx;
        
        builder.append("// Message enqueue\n");
        for (Port p : ThingMLHelpers.allPorts(thing)) {
            for (Message m : p.getReceives()) {
                if(StateHelper.canHandle(ThingMLHelpers.allStateMachines(thing).get(0), p, m)) {
                    builder.append("void enqueue_" + thing.getName() + "_" + p.getName() + "_" + m.getName());
                    ctx.appendFormalParametersForEnqueue(builder, thing, m);
                    builder.append(";\n");
                }
            }
        }
        
        builder.append("\n// Fork Sessions\n");
        for(Session s : RegionHelper.allContainedSessions(ThingMLHelpers.allStateMachines(thing).get(0))) {
            builder.append("void fork_" + s.getName() + "(struct " + ctx.getInstanceStructName(thing) + " * _instance);\n\n");
        }
        
        builder.append("\n// ProcessMessageQueue\n");
        builder.append("int " + thing.getName() + "_processMessageQueue(struct " + ctx.getInstanceStructName(thing) + " * _instance);\n\n");
        builder.append("// Run\n");
        builder.append("void " + thing.getName() + "_run(struct " + ctx.getInstanceStructName(thing) + " * _instance);\n\n");
        
    }
}
