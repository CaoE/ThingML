/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.sintef.thingml.resource.thingml;

/**
 * A common interface for token styles. Text resources must return style
 * information using classes that implement this interface.
 */
public interface IThingmlTokenStyle {
	
	/**
	 * Returns the color of the token as array of length 3.
	 */
	public int[] getColorAsRGB();
	
	/**
	 * Returns the background color of the token as array of length 3. This method can
	 * return <code>null</code> if no background color is set.
	 */
	public int[] getBackgroundColorAsRGB();
	
	/**
	 * Returns true if the token must be displayed in bold face.
	 */
	public boolean isBold();
	
	/**
	 * Returns true if the token must be displayed in italic face.
	 */
	public boolean isItalic();
	
	/**
	 * Returns true if the token must be displayed in strike through style.
	 */
	public boolean isStrikethrough();
	
	/**
	 * Returns true if the token must be displayed underlined.
	 */
	public boolean isUnderline();
	
}
