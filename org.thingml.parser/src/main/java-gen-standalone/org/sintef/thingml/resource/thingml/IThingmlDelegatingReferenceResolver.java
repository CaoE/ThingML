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
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see org.sintef.thingml.resource.thingml.IThingmlOptions
 */
public interface IThingmlDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends org.sintef.thingml.resource.thingml.IThingmlReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(org.sintef.thingml.resource.thingml.IThingmlReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
