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
 * Implementations of this interface are used store the result of resolving a
 * token.
 */
public interface IThingmlTokenResolveResult {
	
	/**
	 * Returns the error message that describes what went wrong while resolving a
	 * token.
	 */
	public String getErrorMessage();
	
	/**
	 * Sets the error message that describes what went wrong while resolving a token.
	 * If a mapping for the token was already found (i.e., setResult() was called
	 * before), the call to this method is ignored. If setResult() is called
	 * afterwards, the error message is also discarded.
	 * 
	 * @param message the error that prevented resolving the token
	 */
	public void setErrorMessage(String message);
	
	/**
	 * Sets the result of resolving a token.
	 * 
	 * @param resolvedToken the object the token was resolved to
	 */
	public void setResolvedToken(Object resolvedToken);
	
	/**
	 * Returns the result of resolving a token or null if it could not be resolved
	 * correctly.
	 * 
	 * @return the object the token was resolved to
	 */
	public Object getResolvedToken();
	
}
