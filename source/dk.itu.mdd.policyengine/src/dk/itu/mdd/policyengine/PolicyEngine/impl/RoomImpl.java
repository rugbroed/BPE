/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.Room;
import dk.itu.mdd.policyengine.PolicyEngine.SensorComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl#getDeclareSensor <em>Declare Sensor</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl#getDeclareActuator <em>Declare Actuator</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends NamedElementImpl implements Room {
	/**
	 * The cached value of the '{@link #getDeclareSensor() <em>Declare Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorComponent> declareSensor;

	/**
	 * The cached value of the '{@link #getDeclareActuator() <em>Declare Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorComponent> declareActuator;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorComponent> getDeclareSensor() {
		if (declareSensor == null) {
			declareSensor = new EObjectContainmentEList<SensorComponent>(SensorComponent.class, this, PolicyEnginePackage.ROOM__DECLARE_SENSOR);
		}
		return declareSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorComponent> getDeclareActuator() {
		if (declareActuator == null) {
			declareActuator = new EObjectContainmentEList<ActuatorComponent>(ActuatorComponent.class, this, PolicyEnginePackage.ROOM__DECLARE_ACTUATOR);
		}
		return declareActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<Room>(Room.class, this, PolicyEnginePackage.ROOM__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.ROOM__DECLARE_SENSOR:
				return ((InternalEList<?>)getDeclareSensor()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.ROOM__DECLARE_ACTUATOR:
				return ((InternalEList<?>)getDeclareActuator()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.ROOM__DECLARE_SENSOR:
				return getDeclareSensor();
			case PolicyEnginePackage.ROOM__DECLARE_ACTUATOR:
				return getDeclareActuator();
			case PolicyEnginePackage.ROOM__EXTENDS:
				return getExtends();
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
			case PolicyEnginePackage.ROOM__DECLARE_SENSOR:
				getDeclareSensor().clear();
				getDeclareSensor().addAll((Collection<? extends SensorComponent>)newValue);
				return;
			case PolicyEnginePackage.ROOM__DECLARE_ACTUATOR:
				getDeclareActuator().clear();
				getDeclareActuator().addAll((Collection<? extends ActuatorComponent>)newValue);
				return;
			case PolicyEnginePackage.ROOM__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Room>)newValue);
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
			case PolicyEnginePackage.ROOM__DECLARE_SENSOR:
				getDeclareSensor().clear();
				return;
			case PolicyEnginePackage.ROOM__DECLARE_ACTUATOR:
				getDeclareActuator().clear();
				return;
			case PolicyEnginePackage.ROOM__EXTENDS:
				getExtends().clear();
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
			case PolicyEnginePackage.ROOM__DECLARE_SENSOR:
				return declareSensor != null && !declareSensor.isEmpty();
			case PolicyEnginePackage.ROOM__DECLARE_ACTUATOR:
				return declareActuator != null && !declareActuator.isEmpty();
			case PolicyEnginePackage.ROOM__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
