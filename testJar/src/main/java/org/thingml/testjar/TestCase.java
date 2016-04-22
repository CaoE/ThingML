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
package org.thingml.testjar;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.thingml.testjar.lang.TargetedLanguage;

/**
 *
 * @author sintef
 */
public class TestCase {
    public TargetedLanguage lang;
    public int status;
    public boolean isLastStepASuccess = true;
    public File complerJar;
    public File srcTestCase;
    public File genCfgDir;
    public File genCfg;
    public File genCodeDir;
    public File logFile;
    public String log;
    public String result;
    public String name;
    public Command ongoingCmd;
    
    public TestCase(File srcTestCase, File complerJar, TargetedLanguage lang, File genCodeDir, File genCfgDir, File logDir) {
        this.lang = lang;
        this.status = 0;
        this.complerJar = complerJar;
        this.srcTestCase = srcTestCase;
        this.genCfgDir = genCfgDir;
        this.genCodeDir = genCodeDir;
        this.logFile = logDir;
        this.log = "";
        this.result = "";
        this.name = srcTestCase.getName().split("\\.thingml")[0];
        this.ongoingCmd = lang.generateThingML(this);
    }
    
    public TestCase(File genCfg, TestCase t) {
        this.name = genCfg.getName().split("\\.thingml")[0];
        this.genCfg = genCfg;
        this.lang = t.lang;
        this.status = 1;
        this.complerJar = t.complerJar;
        this.srcTestCase = t.srcTestCase;
        this.genCfgDir = t.genCfgDir;
        this.genCodeDir = t.genCodeDir;
        this.logFile = new File(t.logFile, "_" + lang.compilerID + "/" + name);
        this.log = "Test: " + name + "\n"
                + " '-> Source: " + genCfg.getAbsolutePath() + "\n"
                + "Generated from: " + t.srcTestCase.getName() + "\n"
                + " '-> Source: " + t.srcTestCase.getAbsolutePath() + "\n";
        this.result = t.result;
        this.ongoingCmd = lang.generateTargeted(this);
    }
    
    public Set<TestCase> generateChildren() {
        HashSet<TestCase> res = new HashSet<>();
        
        String testConfigPattern = upperFirstChar(name) + "_([0-9]+)\\.thingml";
        File dir = new File(genCfgDir, "_" + lang.compilerID);
        //System.out.println("[genCfgDir] " + dir.getAbsolutePath());
        //System.out.println("[pattern] " + testConfigPattern);
        for(File f : listTestFiles(dir, testConfigPattern)) {
            res.add(new TestCase(f, this));
        }
        
        return res;
    }
    
    public void collectResults() {
        if(isLastStepASuccess) {
            isLastStepASuccess = ongoingCmd.isSuccess;
            log += "\n\n[Cmd] ";
            for(String str : ongoingCmd.cmd) {
                log += str + " ";
            }
            log += "\n\n[stdout] ";
            log += ongoingCmd.stdlog;
            log += "\n\n[sterr] ";
            log += ongoingCmd.errlog;
            if(!isLastStepASuccess) {
                if(status == 0) {
                    result = "Error at ThingML generation";
                } else if (status == 1) {
                    result = "Error at ThingML compilation";
                } else if (status == 2) {
                    result = "Error at " + lang.compilerID + " compilation ";
                } else if (status == 3) {
                    result = "Error at " + lang.compilerID + " execution ";
                } else {
                    result = "Unknown Error";
                }
                log = result + "\n" + log;
                writeLogFile();
            } else {
                if (status == 1) {
                    ongoingCmd = lang.compileTargeted(this);
                    status = 2;
                } else if (status == 2) {
                    ongoingCmd = lang.execTargeted(this);
                    status = 3;
                } else if (status == 3) {
                    result = "Success";
                    log = result + "\n" + log;
                    writeLogFile();
                } else {
                    result = "Unknown Error";
                    log = result + "\n" + log;
                    writeLogFile();
                }
            }
        }
    }
    
    public static String upperFirstChar(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    public static Set<File> listTestFiles(final File folder, String pattern) {
        Set<File> res = new HashSet<>();
        Pattern p = Pattern.compile(pattern);
        
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                res.addAll(listTestFiles(fileEntry, pattern));
            } else {
                Matcher m = p.matcher(fileEntry.getName());
                //System.out.println("[file] " + fileEntry.getName());
                if (m.matches()) {
                    res.add(fileEntry);
                }
            }
        }
        
        return res;
    }
    
    public void writeLogFile() {
        try {
            PrintWriter w = new PrintWriter(logFile);
            w.print(log);
            w.close();
        } catch (Exception ex) {
            System.err.println("Problem writting log");
            ex.printStackTrace();
        }
    }
    
    
}
