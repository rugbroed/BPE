/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.Actuator;
import dk.itu.mdd.policyengine.PolicyEngine.ActuatorType;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorImpl#getActuatorTypes <em>Actuator Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActuatorImpl extends NamedElementImpl implements Actuator {
	/**
	 * The cached value of the '{@link #getActuatorTypes() <em>Actuator Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorType> actuatorTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorType> getActuatorTypes() {
		if (actuatorTypes == null) {
			actuatorTypes = new EObjectContainmentEList<ActuatorType>(ActuatorType.class, this, PolicyEnginePackage.ACTUATOR__ACTUATOR_TYPES);
		}
		return actuatorTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.ACTUATOR__ACTUATOR_TYPES:
				return ((InternalEList<?>)getActuatorTypes()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.ACTUATOR__ACTUATOR_TYPES:
				return getActuatorTypes();
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
			case PolicyEnginePackage.ACTUATOR__ACTUATOR_TYPES:
				getActuatorTypes().clear();
				getActuatorTypes().addAll((Collection<? extends ActuatorType>)newValue);
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
			case PolicyEnginePackage.ACTUATOR__ACTUATOR_TYPES:
				getActuatorTypes().clear();
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
			case PolicyEnginePackage.ACTUATOR__ACTUATOR_TYPES:
				return actuatorTypes != null && !actuatorTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActuatorImpl
