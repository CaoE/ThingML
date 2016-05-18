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
package org.sintef.thingml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sintef.thingml.PrimitiveType#getByteSize <em>Byte Size</em>}</li>
 * </ul>
 *
 * @see org.sintef.thingml.ThingmlPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {

    /**
	 * Returns the value of the '<em><b>Byte Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Size</em>' attribute.
	 * @see #setByteSize(int)
	 * @see org.sintef.thingml.ThingmlPackage#getPrimitiveType_ByteSize()
	 * @model default="0" unique="false" required="true"
	 * @generated
	 */
	int getByteSize();

	/**
	 * Sets the value of the '{@link org.sintef.thingml.PrimitiveType#getByteSize <em>Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Size</em>' attribute.
	 * @see #getByteSize()
	 * @generated
	 */
	void setByteSize(int value);

				/**
     * @generated NOT
     */
    boolean isNumber();

    /**
     * @generated NOT
     */
    boolean isBoolean();

    /**
     * @generated NOT
     */
    boolean isString();

    /**
     * @generated NOT
     */
    boolean isChar();


    /**
     * @generated NOT
     */
    boolean isByte();

} // PrimitiveType
