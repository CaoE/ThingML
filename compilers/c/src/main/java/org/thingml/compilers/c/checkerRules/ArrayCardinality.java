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
package org.thingml.compilers.c.checkerRules;

import org.sintef.thingml.Configuration;
import org.sintef.thingml.Property;
import org.sintef.thingml.Thing;
import org.sintef.thingml.helpers.ConfigurationHelper;
import org.sintef.thingml.helpers.ThingHelper;
import org.thingml.compilers.checker.Checker;
import org.thingml.compilers.checker.Rule;


/**
 *
 * @author sintef
 */
public class ArrayCardinality extends Rule {


    @Override
    public Checker.InfoType getHighestLevel() {
        return Checker.InfoType.ERROR;
    }

    @Override
    public String getName() {
        return "Array Cardinality";
    }

    @Override
    public String getDescription() {
        return "Check that arrays cardinalities are defined.";
    }

    @Override
    public void check(Configuration cfg, Checker checker) {
        for (Thing t : ConfigurationHelper.allThings(cfg)) {
            for (Property p : ThingHelper.allPropertiesInDepth(t)) {
                if (p.isIsArray()) {
                    if (p.getCardinality() == null) {
                        checker.addError("C", "Array declared without cardinality is not allowed with C compiler.", p);
                    }
                }
            }
        }
    }

}