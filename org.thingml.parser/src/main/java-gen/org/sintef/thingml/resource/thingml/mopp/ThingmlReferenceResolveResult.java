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
package org.sintef.thingml.resource.thingml.mopp;

/**
 * A basic implementation of the
 * org.sintef.thingml.resource.thingml.IThingmlReferenceResolveResult interface
 * that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class ThingmlReferenceResolveResult<ReferenceType> implements org.sintef.thingml.resource.thingml.IThingmlReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.sintef.thingml.resource.thingml.IThingmlReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.sintef.thingml.resource.thingml.IThingmlQuickFix> quickFixes;
	
	public ThingmlReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.sintef.thingml.resource.thingml.IThingmlQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.sintef.thingml.resource.thingml.IThingmlQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.sintef.thingml.resource.thingml.IThingmlQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.sintef.thingml.resource.thingml.IThingmlQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.sintef.thingml.resource.thingml.IThingmlReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.sintef.thingml.resource.thingml.IThingmlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.sintef.thingml.resource.thingml.mopp.ThingmlElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.sintef.thingml.resource.thingml.IThingmlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.sintef.thingml.resource.thingml.mopp.ThingmlURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
