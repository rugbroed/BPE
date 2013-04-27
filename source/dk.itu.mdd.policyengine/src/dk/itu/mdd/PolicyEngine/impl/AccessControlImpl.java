/**
 */
package dk.itu.mdd.PolicyEngine.impl;

import dk.itu.mdd.PolicyEngine.AccessControl;
import dk.itu.mdd.PolicyEngine.Actuator;
import dk.itu.mdd.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.PolicyEngine.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.AccessControlImpl#getAccessControlSensors <em>Access Control Sensors</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.AccessControlImpl#getAccessControlDoorLockActuator <em>Access Control Door Lock Actuator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessControlImpl extends MinimalEObjectImpl.Container implements AccessControl {
	/**
	 * The cached value of the '{@link #getAccessControlSensors() <em>Access Control Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControlSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> accessControlSensors;

	/**
	 * The cached value of the '{@link #getAccessControlDoorLockActuator() <em>Access Control Door Lock Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControlDoorLockActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> accessControlDoorLockActuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.ACCESS_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getAccessControlSensors() {
		if (accessControlSensors == null) {
			accessControlSensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_SENSORS);
		}
		return accessControlSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getAccessControlDoorLockActuator() {
		if (accessControlDoorLockActuator == null) {
			accessControlDoorLockActuator = new EObjectContainmentEList<Actuator>(Actuator.class, this, PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR);
		}
		return accessControlDoorLockActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_SENSORS:
				return ((InternalEList<?>)getAccessControlSensors()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR:
				return ((InternalEList<?>)getAccessControlDoorLockActuator()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_SENSORS:
				return getAccessControlSensors();
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR:
				return getAccessControlDoorLockActuator();
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
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_SENSORS:
				getAccessControlSensors().clear();
				getAccessControlSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR:
				getAccessControlDoorLockActuator().clear();
				getAccessControlDoorLockActuator().addAll((Collection<? extends Actuator>)newValue);
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
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_SENSORS:
				getAccessControlSensors().clear();
				return;
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR:
				getAccessControlDoorLockActuator().clear();
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
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_SENSORS:
				return accessControlSensors != null && !accessControlSensors.isEmpty();
			case PolicyEnginePackage.ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR:
				return accessControlDoorLockActuator != null && !accessControlDoorLockActuator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessControlImpl
