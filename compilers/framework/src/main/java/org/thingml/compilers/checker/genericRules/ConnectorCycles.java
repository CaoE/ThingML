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
package org.thingml.compilers.checker.genericRules;

import org.sintef.thingml.Configuration;
import org.sintef.thingml.Instance;
import org.thingml.compilers.checker.Checker;
import org.thingml.compilers.checker.Rule;
import org.thingml.compilers.checker.Tarjan;

import java.util.List;

/**
 *
 * @author sintef
 */
public class ConnectorCycles extends Rule {

    public ConnectorCycles() {
        super();
    }

    @Override
    public Checker.InfoType getHighestLevel() {
        return Checker.InfoType.NOTICE;
    }

    @Override
    public String getName() {
        return "Connector Cycles";
    }

    @Override
    public String getDescription() {
        return "Check that the configuration does not contains dependancis cycles";
    }

    @Override
    public void check(Configuration cfg, Checker checker) {

        Tarjan<Instance> t = new Tarjan(cfg, cfg.allInstances());
        List<List<Instance>> cycles = t.findStronglyConnectedComponents();

        for (List<Instance> cycle : cycles) {
            if (cycle != null) {
                if (cycle.size() != 1) {
                    String msg = "Dependancies cycle: (";
                    boolean first = true;
                    for (Instance j : cycle) {
                        if (first) {
                            first = false;
                        } else {
                            msg += ", ";
                        }
                        msg += j.getName();
                    }

                    checker.addGenericNotice(msg + ")", cfg);
                } else {
                    //System.out.println("Mono state: " + cycle.get(0).getName());
                }
            }
        }
    }

}
