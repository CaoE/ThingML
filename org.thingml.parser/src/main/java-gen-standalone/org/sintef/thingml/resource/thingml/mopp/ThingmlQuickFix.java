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

public abstract class ThingmlQuickFix implements org.sintef.thingml.resource.thingml.IThingmlQuickFix {
	
	private String displayString;
	private String imageKey;
	private org.eclipse.emf.ecore.resource.Resource resource;
	private java.util.Collection<org.eclipse.emf.ecore.EObject> contextObjects;
	
	public ThingmlQuickFix(String displayString, String imageKey, org.eclipse.emf.ecore.EObject contextObject) {
		this(displayString, imageKey, java.util.Collections.singleton(contextObject), contextObject.eResource());
	}
	
	public ThingmlQuickFix(String displayString, String imageKey, java.util.Collection<org.eclipse.emf.ecore.EObject> contextObjects) {
		this(displayString, imageKey, contextObjects, contextObjects.iterator().next().eResource());
	}
	
	public ThingmlQuickFix(String displayString, String imageKey, java.util.Collection<org.eclipse.emf.ecore.EObject> contextObjects, org.eclipse.emf.ecore.resource.Resource resource) {
		super();
		if (displayString == null) {
			throw new IllegalArgumentException("displayString must not be null.");
		}
		if (contextObjects == null) {
			throw new IllegalArgumentException("contextObjects must not be null.");
		}
		if (contextObjects.isEmpty()) {
			throw new IllegalArgumentException("contextObjects must not be empty.");
		}
		this.displayString = displayString;
		this.imageKey = imageKey;
		this.contextObjects = contextObjects;
		this.resource = resource;
	}
	
	public String apply(String currentText) {
		applyChanges();
		try {
			java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
			getResource().save(output, null);
			return output.toString();
		} catch (java.io.IOException e) {
			new org.sintef.thingml.resource.thingml.util.ThingmlRuntimeUtil().logError("Exception while applying quick fix", e);
		}
		return null;
	}
	
	public abstract void applyChanges();
	
	public org.eclipse.emf.ecore.resource.Resource getResource() {
		return resource;
	}
	
	public String getDisplayString() {
		return displayString;
	}
	
	public String getImageKey() {
		return imageKey;
	}
	
	public java.util.Collection<org.eclipse.emf.ecore.EObject> getContextObjects() {
		return contextObjects;
	}
	
	public String getContextAsString() {
		StringBuilder result = new StringBuilder();
		result.append(getType());
		result.append(",");
		for (org.eclipse.emf.ecore.EObject contextObject : contextObjects) {
			result.append(org.eclipse.emf.ecore.util.EcoreUtil.getURI(contextObject));
			result.append(",");
		}
		return result.toString();
	}
	
	private String getType() {
		return this.getClass().getName();
	}
	
}
