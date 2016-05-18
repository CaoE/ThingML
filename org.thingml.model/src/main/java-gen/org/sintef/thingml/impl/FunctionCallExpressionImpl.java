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
package org.sintef.thingml.impl;

import org.eclipse.emf.ecore.EClass;

import org.sintef.thingml.Expression;
import org.sintef.thingml.FunctionCallExpression;
import org.sintef.thingml.ThingmlPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionCallExpressionImpl extends FunctionCallImpl implements FunctionCallExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingmlPackage.Literals.FUNCTION_CALL_EXPRESSION;
	}

	/**
	 * @generated NOT
	 * @return
	 */
	@Override
	public List<Expression> getAllExpressions() {
		List<Expression> result = new ArrayList<Expression>();
		result.add(this);
		for(Expression e : getParameters()) {
			result.addAll(e.getAllExpressions());
		}
		return  result;
	}

	/**
	 * @generated NOT
	 * @return
	 */
	@Override
	public List<Expression> getAllExpressions(Class clazz) {
		List<Expression> result = new ArrayList<Expression>();
		if(clazz.isInstance(this))
			result.add(this);
		for(Expression e : getParameters()) {
			result.addAll(e.getAllExpressions(clazz));
		}return  result;
	}
} //FunctionCallExpressionImpl
