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

import java.util.Collection;
import java.util.*;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sintef.thingml.Region;
import org.sintef.thingml.State;
import org.sintef.thingml.ThingmlPackage;
import org.sintef.thingml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sintef.thingml.impl.RegionImpl#getSubstate <em>Substate</em>}</li>
 *   <li>{@link org.sintef.thingml.impl.RegionImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.sintef.thingml.impl.RegionImpl#isHistory <em>History</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RegionImpl extends AnnotatedElementImpl implements Region {
	/**
	 * The cached value of the '{@link #getSubstate() <em>Substate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstate()
	 * @generated
	 * @ordered
	 */
	protected EList<State> substate;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected State initial;

	/**
	 * The default value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean history = HISTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingmlPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSubstate() {
		if (substate == null) {
			substate = new EObjectContainmentEList<State>(State.class, this, ThingmlPackage.REGION__SUBSTATE);
		}
		return substate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject)initial;
			initial = (State)eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingmlPackage.REGION__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(State newInitial) {
		State oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingmlPackage.REGION__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(boolean newHistory) {
		boolean oldHistory = history;
		history = newHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingmlPackage.REGION__HISTORY, oldHistory, history));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingmlPackage.REGION__SUBSTATE:
				return ((InternalEList<?>)getSubstate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingmlPackage.REGION__SUBSTATE:
				return getSubstate();
			case ThingmlPackage.REGION__INITIAL:
				if (resolve) return getInitial();
				return basicGetInitial();
			case ThingmlPackage.REGION__HISTORY:
				return isHistory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThingmlPackage.REGION__SUBSTATE:
				getSubstate().clear();
				getSubstate().addAll((Collection<? extends State>)newValue);
				return;
			case ThingmlPackage.REGION__INITIAL:
				setInitial((State)newValue);
				return;
			case ThingmlPackage.REGION__HISTORY:
				setHistory((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ThingmlPackage.REGION__SUBSTATE:
				getSubstate().clear();
				return;
			case ThingmlPackage.REGION__INITIAL:
				setInitial((State)null);
				return;
			case ThingmlPackage.REGION__HISTORY:
				setHistory(HISTORY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ThingmlPackage.REGION__SUBSTATE:
				return substate != null && !substate.isEmpty();
			case ThingmlPackage.REGION__INITIAL:
				return initial != null;
			case ThingmlPackage.REGION__HISTORY:
				return history != HISTORY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (history: ");
		result.append(history);
		result.append(')');
		return result.toString();
	}

    //Derived properties

    /**
     *
     * @return
     * @generated NOT
     */
    public List<State> allContainedStates() {
        final List<State> result = new ArrayList<State>();
        for(Region r : allContainedRegions()) {
            if (r instanceof State) {
                result.add((State)r);
            }
            for(State s : r.getSubstate()) {
                if (! (s instanceof Region)) {
                    result.add(s);
                }
            }
        }
        return result;
    }

    /**
     *
     * @return
     * @generated NOT
     */
    public List<Region> allContainedRegions() {
        final List<Region> result = new ArrayList<Region>();
        result.add(this);
        if (this instanceof CompositeState) {
            for(Region r : ((CompositeState)this).getRegion()) {
                result.addAll(r.allContainedRegions());
            }
        }
        for (State s : getSubstate()) {
            if (s instanceof Region) {
                result.addAll(((Region)s).allContainedRegions());
            }
        }
        return result;
    }

    /**
     *
     * @return
     * @generated NOT
     */
    public List<Property> allContainedProperties() {
        final List<Property> result = new ArrayList<Property>();
        for(State s : allContainedStates()) {
            result.addAll(s.getProperties());
        }
        return result;
    }


    /**
     *
     * @return
     * @generated NOT
     */
    public List<Region> directSubRegions() {
        final List<Region> result = new ArrayList<Region>();
        result.add(this);
        if (this instanceof CompositeState) {
            for (Region r : ((CompositeState)this).getRegion()){
                result.addAll(r.allContainedRegions());
            }
        }
        return result;
    }

    /**
     *
     * @return
     * @generated NOT
     */
    public List<CompositeState> allContainedCompositeStates() {
        final List<CompositeState> result = new ArrayList<CompositeState>();
        for(State s : allContainedStates()) {
            if (s instanceof CompositeState) {
                result.add((CompositeState)s);
            }
        }
        return result;
    }

    /**
     *
     * @return
     * @generated NOT
     */
    public List<State> allContainedSimpleStates() {
        final List<State> result = allContainedStates();
        result.removeAll(allContainedCompositeStates());
        return result;
    }

    /**
     *
     * @return
     * @generated NOT
     */
    public Set<Type> allUsedTypes() {
        Set<Type> result = new HashSet<Type>();
        for(Property p : allContainedProperties()) {
            result.add(p.getType());
        }
        return result;
    }

    /**
     *
     * @param separator
     * @return
     * @generated NOT
     */
    public String qualifiedName(String separator) {
        if (eContainer() instanceof State) {
            return ((State)eContainer()).qualifiedName(separator) + separator + getName();
        } else {
            return getName();
        }
    }

} //RegionImpl
