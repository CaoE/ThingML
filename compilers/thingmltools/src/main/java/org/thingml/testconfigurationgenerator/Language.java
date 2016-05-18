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
package org.thingml.testconfigurationgenerator;

import java.io.File;

/**
 *
 * @author sintef
 */
public class Language {
    public File outputDir;
    public String shortName;
    public String longName;

    public Language(File outputDir, String shortName, String longName) {
        this.outputDir = new File(outputDir.getAbsolutePath() + "/_" + longName);
        this.shortName = shortName;
        this.longName = longName;
    }
}
