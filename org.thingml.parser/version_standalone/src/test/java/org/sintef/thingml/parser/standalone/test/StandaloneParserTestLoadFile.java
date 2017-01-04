/**
 * Copyright (C) ${year} ${owner} <${email}>
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
/**
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
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.sintef.thingml.parser.standalone.test;

import java.io.IOException;
import junit.framework.TestCase;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.sintef.thingml.ThingMLModel;
import org.sintef.thingml.ThingmlPackage;
//import org.sintef.thingml.resource.thingml.mopp.ThingmlResourceFactory;

/**
 *
 * @author ffl
 */
public class StandaloneParserTestLoadFile extends TestCase {

    String model_path;

    public StandaloneParserTestLoadFile(String model_path) {
        this.model_path = model_path;
    }

    @Override
    public void runTest() throws IOException {
           // Register the generated package and the XMI Factory
            EPackage.Registry.INSTANCE.put(ThingmlPackage.eNS_URI, ThingmlPackage.eINSTANCE);
            //Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("thingml", new ThingmlResourceFactory());

            // Load the model
            ResourceSet rs = new ResourceSetImpl();
            URI xmiuri = URI.createFileURI(model_path);
            Resource model = rs.getResource(xmiuri, true);
            model.load(null);

            assert(model.getContents().size() > 0);

            assert(model.getErrors().size() == 0);

            assert ( model.getContents().get(0) instanceof ThingMLModel );
            
    }

    @Override
    public String getName() {
        return this.model_path;
    }



}