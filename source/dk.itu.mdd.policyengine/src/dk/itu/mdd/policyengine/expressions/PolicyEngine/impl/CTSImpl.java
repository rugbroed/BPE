/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine.impl;

import dk.itu.mdd.policyengine.expressions.PolicyEngine.Actuator;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Sensor;

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
 * An implementation of the model object '<em><b>CTS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CTSImpl#getTemperatureSensors <em>Temperature Sensors</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CTSImpl#getCtsActuators <em>Cts Actuators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CTSImpl extends MinimalEObjectImpl.Container implements CTS {
	/**
	 * The cached value of the '{@link #getTemperatureSensors() <em>Temperature Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> temperatureSensors;

	/**
	 * The cached value of the '{@link #getCtsActuators() <em>Cts Actuators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtsActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> ctsActuators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.CTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getTemperatureSensors() {
		if (temperatureSensors == null) {
			temperatureSensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, PolicyEnginePackage.CTS__TEMPERATURE_SENSORS);
		}
		return temperatureSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getCtsActuators() {
		if (ctsActuators == null) {
			ctsActuators = new EObjectContainmentEList<Actuator>(Actuator.class, this, PolicyEnginePackage.CTS__CTS_ACTUATORS);
		}
		return ctsActuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.CTS__TEMPERATURE_SENSORS:
				return ((InternalEList<?>)getTemperatureSensors()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.CTS__CTS_ACTUATORS:
				return ((InternalEList<?>)getCtsActuators()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.CTS__TEMPERATURE_SENSORS:
				return getTemperatureSensors();
			case PolicyEnginePackage.CTS__CTS_ACTUATORS:
				return getCtsActuators();
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
			case PolicyEnginePackage.CTS__TEMPERATURE_SENSORS:
				getTemperatureSensors().clear();
				getTemperatureSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case PolicyEnginePackage.CTS__CTS_ACTUATORS:
				getCtsActuators().clear();
				getCtsActuators().addAll((Collection<? extends Actuator>)newValue);
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
			case PolicyEnginePackage.CTS__TEMPERATURE_SENSORS:
				getTemperatureSensors().clear();
				return;
			case PolicyEnginePackage.CTS__CTS_ACTUATORS:
				getCtsActuators().clear();
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
			case PolicyEnginePackage.CTS__TEMPERATURE_SENSORS:
				return temperatureSensors != null && !temperatureSensors.isEmpty();
			case PolicyEnginePackage.CTS__CTS_ACTUATORS:
				return ctsActuators != null && !ctsActuators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CTSImpl
