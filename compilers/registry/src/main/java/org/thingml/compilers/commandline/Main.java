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

package org.thingml.compilers.commandline;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.sintef.thingml.Configuration;
import org.sintef.thingml.ThingMLModel;
import org.sintef.thingml.constraints.ThingMLHelpers;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.registry.ThingMLCompilerRegistry;
import org.thingml.compilers.registry.ThingMLToolRegistry;
import org.thingml.thingmltools.ThingMLTool;

import java.io.File;

/**
 * Created by ffl on 15.06.15.
 */
public class Main {
    @Parameter(names = {"--source", "-s"}, description = "A thingml file to compile (should include at least one configuration)")
    String source;
    @Parameter(names = {"--output", "-o"}, description = "Optional output directory - by default current directory is used")
    String output;
    @Parameter(names = {"--compiler", "-c"}, description = "Compiler ID (Mandatory unless --tool (-t) is used)")
    String compiler;
    @Parameter(names = {"--tool", "-t"}, description = "Tool ID (Mandatory unless --compiler (-c) is used)")
    String tool;
    @Parameter(names = {"--options"}, description = "additional options for ThingML tools.")
    String tooloptions;
    boolean toolUsed, compilerUsed;
    @Parameter(names = {"--help", "-h"}, help = true, description = "Display this message.")
    private boolean help;
    @Parameter(names = {"--create-dir", "-d"}, description = "Create a new directory named after the configuration for the output")
    private boolean createDir;
    @Parameter(names = {"--list-plugins"}, description = "Display the list of available plugins")
    private boolean listPlugins;

    public static void printUsage(JCommander jcom, ThingMLCompilerRegistry registry, ThingMLToolRegistry toolregistry) {
        System.out.println(" --- ThingML help ---");

        System.out.println("Typical usages: ");
        System.out.println("    java -jar your-jar.jar -c <compiler> -s <source> [-o <output-dir>][-d]");
        System.out.println("    java -jar your-jar.jar -t <tool> -s <source> [-o <output-dir>] [--options <option>]");

        jcom.usage();

        System.out.println("Compiler Id must belong to the following list:");
        for (ThingMLCompiler c : registry.getCompilerPrototypes()) {
            System.out.println(" |     " + c.getID() + "\t- " + c.getDescription());
        }

        System.out.println();

        System.out.println("Tool Id must belong to the following list:");
        for (ThingMLTool t : toolregistry.getToolPrototypes()) {
            System.out.println(" |     " + t.getID() + "\t- " + t.getDescription());
        }
    }

    public static void printPluginList(JCommander jcom, ThingMLCompilerRegistry registry, ThingMLToolRegistry toolregistry) {
        registry.printNetworkPluginList();

        System.out.println();
        registry.printSerializationPluginList();
    }

    public static void main(String[] args) {
        Main main = new Main();
        ThingMLCompilerRegistry registry = ThingMLCompilerRegistry.getInstance();
        ThingMLToolRegistry toolregistry = ThingMLToolRegistry.getInstance();
        JCommander jcom = new JCommander(main, args);

        // HELP Handling
        if (main.help || ((main.compiler == null) && (main.tool == null) && (!main.listPlugins))) {
            printUsage(jcom, registry, toolregistry);
            if (main.listPlugins) {
                System.out.println();
                printPluginList(jcom, registry, toolregistry);
            }
            return;
        }

        if (main.listPlugins) {
            printPluginList(jcom, registry, toolregistry);
            return;
        }

        // COMPILER/TOOL Handling
        main.toolUsed = main.tool != null;
        main.compilerUsed = main.compiler != null;
        if (!((main.compiler != null) ^ (main.tool != null))) {
            System.out.println("One (and only one) of the option --compiler or --tool must be used (or their short version -c and -t).");
            return;
        }

        //SOURCE Handling
        File input = null;
        if (main.source != null) {
            input = new File(main.source);
        } else {
            System.out.println("--source (or -s) is a mandatory parameter.");
            return;
        }

        if (!input.exists() || !input.isFile() || !input.canRead()) {
            System.out.println("ERROR: Cannot find or read input file " + input.getAbsolutePath() + ".");
            return;
        }


        //OUTPUT Handling
        File outdir = null;

        if (main.output != null) {
            File o = new File(main.output);
            if (!o.exists()) {
                new File(main.output).mkdirs();
            }
            if (!o.exists() || !o.isDirectory() || !o.canWrite()) {
                System.out.println("ERROR: Cannot find or write in output dir " + o.getAbsolutePath() + ".");
                return;
            }
            outdir = o;
        } else {
            outdir = new File(System.getProperty("user.dir"));
        }

        //RECAP
        System.out.print("Running ThingML");

        if (main.compiler != null)
            System.out.print(" -c " + main.compiler);

        if (main.tool != null)
            System.out.print(" -t " + main.tool);

        System.out.print(" -s " + main.source);

        if (main.output != null)
            System.out.print(" -o " + main.output);

        System.out.println();

        //EXECUTION
        try {
            ThingMLModel input_model = ThingMLCompiler.loadModel(input);
            if (input_model == null) {
                System.out.println("ERROR: The input model contains errors.");
                return;
            }

            if (main.toolUsed) {

                ThingMLTool thingmlTool = toolregistry.createToolInstanceByName(main.tool.trim());
                if (thingmlTool == null) {
                    System.out.println("ERROR: Cannot find tool " + main.tool.trim() + ". Use --help (or -h) to check the list of registered compilers.");
                    return;
                }
                thingmlTool.setOutputDirectory(outdir);
                thingmlTool.options = main.tooloptions;
                System.out.println("Generating code for input model. ");
                thingmlTool.generateThingMLFrom(input_model);
            }

            if (main.compilerUsed) {
                if (ThingMLHelpers.allConfigurations(input_model).isEmpty()) {
                    System.out.println("ERROR: The input model does not contain any configuration to be compiled.");
                    return;
                }
                for (Configuration cfg : ThingMLHelpers.allConfigurations(input_model)) {
                    ThingMLCompiler thingmlCompiler = registry.createCompilerInstanceByName(main.compiler.trim());
                    if (thingmlCompiler == null) {
                        System.out.println("ERROR: Cannot find compiler " + main.compiler.trim() + ". Use --help (or -h) to check the list of registered compilers.");
                        return;
                    }
                    if (main.createDir)
                        outdir = new File(outdir, cfg.getName());
                    thingmlCompiler.setOutputDirectory(outdir);
                    System.out.println("Generating code for configuration: " + cfg.getName());
                    thingmlCompiler.compile(cfg);
                }
            }
            System.out.println("SUCCESS.");

        } catch (Exception e) {
            System.out.println("FATAL ERROR: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        return;
    }

}
