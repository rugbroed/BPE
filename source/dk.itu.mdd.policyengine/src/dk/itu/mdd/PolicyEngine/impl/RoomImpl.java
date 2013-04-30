/**
 */
package dk.itu.mdd.PolicyEngine.impl;

import dk.itu.mdd.PolicyEngine.Actuator;
import dk.itu.mdd.PolicyEngine.Policy;
import dk.itu.mdd.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.PolicyEngine.Room;
import dk.itu.mdd.PolicyEngine.Schedule;
import dk.itu.mdd.PolicyEngine.Sensor;
import dk.itu.mdd.PolicyEngine.Timer;

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
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomImpl#getDeclareSensor <em>Declare Sensor</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomImpl#getDeclareActuator <em>Declare Actuator</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomImpl#getTimers <em>Timers</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomImpl#getDuring <em>During</em>}</li>
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
	protected EList<Sensor> declareSensor;

	/**
	 * The cached value of the '{@link #getDeclareActuator() <em>Declare Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> declareActuator;

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
	 * The cached value of the '{@link #getTimers() <em>Timers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimers()
	 * @generated
	 * @ordered
	 */
	protected EList<Timer> timers;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<Policy> policies;

	/**
	 * The cached value of the '{@link #getDuring() <em>During</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuring()
	 * @generated
	 * @ordered
	 */
	protected EList<Schedule> during;

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
	public EList<Sensor> getDeclareSensor() {
		if (declareSensor == null) {
			declareSensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, PolicyEnginePackage.ROOM__DECLARE_SENSOR);
		}
		return declareSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getDeclareActuator() {
		if (declareActuator == null) {
			declareActuator = new EObjectContainmentEList<Actuator>(Actuator.class, this, PolicyEnginePackage.ROOM__DECLARE_ACTUATOR);
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
	public EList<Timer> getTimers() {
		if (timers == null) {
			timers = new EObjectContainmentEList<Timer>(Timer.class, this, PolicyEnginePackage.ROOM__TIMERS);
		}
		return timers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Policy> getPolicies() {
		if (policies == null) {
			policies = new EObjectResolvingEList<Policy>(Policy.class, this, PolicyEnginePackage.ROOM__POLICIES);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schedule> getDuring() {
		if (during == null) {
			during = new EObjectResolvingEList<Schedule>(Schedule.class, this, PolicyEnginePackage.ROOM__DURING);
		}
		return during;
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
			case PolicyEnginePackage.ROOM__TIMERS:
				return ((InternalEList<?>)getTimers()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.ROOM__TIMERS:
				return getTimers();
			case PolicyEnginePackage.ROOM__POLICIES:
				return getPolicies();
			case PolicyEnginePackage.ROOM__DURING:
				return getDuring();
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
				getDeclareSensor().addAll((Collection<? extends Sensor>)newValue);
				return;
			case PolicyEnginePackage.ROOM__DECLARE_ACTUATOR:
				getDeclareActuator().clear();
				getDeclareActuator().addAll((Collection<? extends Actuator>)newValue);
				return;
			case PolicyEnginePackage.ROOM__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Room>)newValue);
				return;
			case PolicyEnginePackage.ROOM__TIMERS:
				getTimers().clear();
				getTimers().addAll((Collection<? extends Timer>)newValue);
				return;
			case PolicyEnginePackage.ROOM__POLICIES:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends Policy>)newValue);
				return;
			case PolicyEnginePackage.ROOM__DURING:
				getDuring().clear();
				getDuring().addAll((Collection<? extends Schedule>)newValue);
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
			case PolicyEnginePackage.ROOM__TIMERS:
				getTimers().clear();
				return;
			case PolicyEnginePackage.ROOM__POLICIES:
				getPolicies().clear();
				return;
			case PolicyEnginePackage.ROOM__DURING:
				getDuring().clear();
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
			case PolicyEnginePackage.ROOM__TIMERS:
				return timers != null && !timers.isEmpty();
			case PolicyEnginePackage.ROOM__POLICIES:
				return policies != null && !policies.isEmpty();
			case PolicyEnginePackage.ROOM__DURING:
				return during != null && !during.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
