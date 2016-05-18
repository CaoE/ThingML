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
package org.thingml.testjar.lang;

import java.util.HashSet;
import java.util.Set;
import org.thingml.testjar.Command;
import org.thingml.testjar.TestCase;

/**
 *
 * @author sintef
 */
public abstract class TargetedLanguage {
    
    public String compilerID;
    public Set<String> failedTest = new HashSet<>();
    public int testNb = 0;

    /**
     * Some languages might use multiple threads during compilation and/or execution.
     * Spare threads will not be allocated to commands, keeping some threads free to
     * do other stuff (and avoid allocating too many threads, hence reducing context switching, etc)
     **/
    public int spareThreads = 0;
    
    public Command generateThingML(TestCase t) {
        String[] execCmd = new String[11];
        execCmd[0] = "java";
        execCmd[1] = "-jar";
        execCmd[2] = t.complerJar.getAbsolutePath();
        execCmd[3] = "-t";
        execCmd[4] = "testconfigurationgen";
        execCmd[5] = "-s";
        execCmd[6] = t.srcTestCase.getAbsolutePath();
        execCmd[7] = "-o";
        execCmd[8] = t.genCfgDir.getAbsolutePath();
        execCmd[9] = "--options";
        execCmd[10] = compilerID;
        
        return new Command(execCmd, "(.)*SUCCESS(.)*", null, "Error at generation");
    }
    
    public Command generateTargeted(TestCase t) {
        String[] execCmd = new String[10];
        execCmd[0] = "java";
        execCmd[1] = "-jar";
        execCmd[2] = t.complerJar.getAbsolutePath();
        execCmd[3] = "-c";
        execCmd[4] = this.compilerID;
        execCmd[5] = "-s";
        execCmd[6] = t.genCfgDir.getAbsolutePath() + "/_" + compilerID + "/" + t.name + ".thingml";
        execCmd[7] = "-o";
        execCmd[8] = t.genCodeDir.getAbsolutePath() + "/_" + compilerID;
        execCmd[9] = "-d";
        
        return new Command(execCmd, "(.)*SUCCESS(.)*", "(.)*FATAL ERROR(.)*", "Error at ThingML compilation");
    }
    
    public abstract Command compileTargeted(TestCase t);
    public abstract Command execTargeted(TestCase t);
    
}
