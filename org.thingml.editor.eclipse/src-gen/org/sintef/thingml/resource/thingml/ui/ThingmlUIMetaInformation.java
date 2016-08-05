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
package org.sintef.thingml.resource.thingml.ui;

public class ThingmlUIMetaInformation extends org.sintef.thingml.resource.thingml.mopp.ThingmlMetaInformation {
	
	public org.sintef.thingml.resource.thingml.IThingmlHoverTextProvider getHoverTextProvider() {
		return new org.sintef.thingml.resource.thingml.ui.ThingmlHoverTextProvider();
	}
	
	public org.sintef.thingml.resource.thingml.ui.ThingmlImageProvider getImageProvider() {
		return org.sintef.thingml.resource.thingml.ui.ThingmlImageProvider.INSTANCE;
	}
	
	public org.sintef.thingml.resource.thingml.ui.ThingmlColorManager createColorManager() {
		return new org.sintef.thingml.resource.thingml.ui.ThingmlColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.sintef.thingml.resource.thingml.IThingmlTextResource,
	 * org.sintef.thingml.resource.thingml.ui.ThingmlColorManager) instead.
	 */
	public org.sintef.thingml.resource.thingml.ui.ThingmlTokenScanner createTokenScanner(org.sintef.thingml.resource.thingml.ui.ThingmlColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.sintef.thingml.resource.thingml.ui.ThingmlTokenScanner createTokenScanner(org.sintef.thingml.resource.thingml.IThingmlTextResource resource, org.sintef.thingml.resource.thingml.ui.ThingmlColorManager colorManager) {
		return new org.sintef.thingml.resource.thingml.ui.ThingmlTokenScanner(resource, colorManager);
	}
	
	public org.sintef.thingml.resource.thingml.ui.ThingmlCodeCompletionHelper createCodeCompletionHelper() {
		return new org.sintef.thingml.resource.thingml.ui.ThingmlCodeCompletionHelper();
	}
	
}
