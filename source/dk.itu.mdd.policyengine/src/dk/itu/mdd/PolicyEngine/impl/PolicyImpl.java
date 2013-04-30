/**
 */
package dk.itu.mdd.PolicyEngine.impl;

import dk.itu.mdd.PolicyEngine.ActuatorType;
import dk.itu.mdd.PolicyEngine.If;
import dk.itu.mdd.PolicyEngine.Policy;
import dk.itu.mdd.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.PolicyEngine.Room;
import dk.itu.mdd.PolicyEngine.Schedule;
import dk.itu.mdd.PolicyEngine.SensorType;
import dk.itu.mdd.PolicyEngine.State;
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
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getUsesActuators <em>Uses Actuators</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getSpecifiedBy <em>Specified By</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getDefineState <em>Define State</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getDuring <em>During</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getUsesRooms <em>Uses Rooms</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getDefineLocalState <em>Define Local State</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.PolicyImpl#getUsesSensors <em>Uses Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends NamedElementImpl implements Policy {
	/**
	 * The cached value of the '{@link #getUsesActuators() <em>Uses Actuators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorType> usesActuators;

	/**
	 * The cached value of the '{@link #getSpecifiedBy() <em>Specified By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<If> specifiedBy;

	/**
	 * The cached value of the '{@link #getControlledBy() <em>Controlled By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Timer> controlledBy;

	/**
	 * The cached value of the '{@link #getDefineState() <em>Define State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> defineState;

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
	 * The cached value of the '{@link #getUsesRooms() <em>Uses Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> usesRooms;

	/**
	 * The cached value of the '{@link #getDefineLocalState() <em>Define Local State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineLocalState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> defineLocalState;

	/**
	 * The cached value of the '{@link #getUsesSensors() <em>Uses Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorType> usesSensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorType> getUsesActuators() {
		if (usesActuators == null) {
			usesActuators = new EObjectContainmentEList<ActuatorType>(ActuatorType.class, this, PolicyEnginePackage.POLICY__USES_ACTUATORS);
		}
		return usesActuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<If> getSpecifiedBy() {
		if (specifiedBy == null) {
			specifiedBy = new EObjectContainmentEList<If>(If.class, this, PolicyEnginePackage.POLICY__SPECIFIED_BY);
		}
		return specifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timer> getControlledBy() {
		if (controlledBy == null) {
			controlledBy = new EObjectContainmentEList<Timer>(Timer.class, this, PolicyEnginePackage.POLICY__CONTROLLED_BY);
		}
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getDefineState() {
		if (defineState == null) {
			defineState = new EObjectResolvingEList<State>(State.class, this, PolicyEnginePackage.POLICY__DEFINE_STATE);
		}
		return defineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schedule> getDuring() {
		if (during == null) {
			during = new EObjectResolvingEList<Schedule>(Schedule.class, this, PolicyEnginePackage.POLICY__DURING);
		}
		return during;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getUsesRooms() {
		if (usesRooms == null) {
			usesRooms = new EObjectResolvingEList<Room>(Room.class, this, PolicyEnginePackage.POLICY__USES_ROOMS);
		}
		return usesRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getDefineLocalState() {
		if (defineLocalState == null) {
			defineLocalState = new EObjectContainmentEList<State>(State.class, this, PolicyEnginePackage.POLICY__DEFINE_LOCAL_STATE);
		}
		return defineLocalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorType> getUsesSensors() {
		if (usesSensors == null) {
			usesSensors = new EObjectContainmentEList<SensorType>(SensorType.class, this, PolicyEnginePackage.POLICY__USES_SENSORS);
		}
		return usesSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.POLICY__USES_ACTUATORS:
				return ((InternalEList<?>)getUsesActuators()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				return ((InternalEList<?>)getSpecifiedBy()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.POLICY__CONTROLLED_BY:
				return ((InternalEList<?>)getControlledBy()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.POLICY__DEFINE_LOCAL_STATE:
				return ((InternalEList<?>)getDefineLocalState()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				return ((InternalEList<?>)getUsesSensors()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.POLICY__USES_ACTUATORS:
				return getUsesActuators();
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				return getSpecifiedBy();
			case PolicyEnginePackage.POLICY__CONTROLLED_BY:
				return getControlledBy();
			case PolicyEnginePackage.POLICY__DEFINE_STATE:
				return getDefineState();
			case PolicyEnginePackage.POLICY__DURING:
				return getDuring();
			case PolicyEnginePackage.POLICY__USES_ROOMS:
				return getUsesRooms();
			case PolicyEnginePackage.POLICY__DEFINE_LOCAL_STATE:
				return getDefineLocalState();
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				return getUsesSensors();
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
			case PolicyEnginePackage.POLICY__USES_ACTUATORS:
				getUsesActuators().clear();
				getUsesActuators().addAll((Collection<? extends ActuatorType>)newValue);
				return;
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				getSpecifiedBy().clear();
				getSpecifiedBy().addAll((Collection<? extends If>)newValue);
				return;
			case PolicyEnginePackage.POLICY__CONTROLLED_BY:
				getControlledBy().clear();
				getControlledBy().addAll((Collection<? extends Timer>)newValue);
				return;
			case PolicyEnginePackage.POLICY__DEFINE_STATE:
				getDefineState().clear();
				getDefineState().addAll((Collection<? extends State>)newValue);
				return;
			case PolicyEnginePackage.POLICY__DURING:
				getDuring().clear();
				getDuring().addAll((Collection<? extends Schedule>)newValue);
				return;
			case PolicyEnginePackage.POLICY__USES_ROOMS:
				getUsesRooms().clear();
				getUsesRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case PolicyEnginePackage.POLICY__DEFINE_LOCAL_STATE:
				getDefineLocalState().clear();
				getDefineLocalState().addAll((Collection<? extends State>)newValue);
				return;
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				getUsesSensors().clear();
				getUsesSensors().addAll((Collection<? extends SensorType>)newValue);
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
			case PolicyEnginePackage.POLICY__USES_ACTUATORS:
				getUsesActuators().clear();
				return;
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				getSpecifiedBy().clear();
				return;
			case PolicyEnginePackage.POLICY__CONTROLLED_BY:
				getControlledBy().clear();
				return;
			case PolicyEnginePackage.POLICY__DEFINE_STATE:
				getDefineState().clear();
				return;
			case PolicyEnginePackage.POLICY__DURING:
				getDuring().clear();
				return;
			case PolicyEnginePackage.POLICY__USES_ROOMS:
				getUsesRooms().clear();
				return;
			case PolicyEnginePackage.POLICY__DEFINE_LOCAL_STATE:
				getDefineLocalState().clear();
				return;
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				getUsesSensors().clear();
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
			case PolicyEnginePackage.POLICY__USES_ACTUATORS:
				return usesActuators != null && !usesActuators.isEmpty();
			case PolicyEnginePackage.POLICY__SPECIFIED_BY:
				return specifiedBy != null && !specifiedBy.isEmpty();
			case PolicyEnginePackage.POLICY__CONTROLLED_BY:
				return controlledBy != null && !controlledBy.isEmpty();
			case PolicyEnginePackage.POLICY__DEFINE_STATE:
				return defineState != null && !defineState.isEmpty();
			case PolicyEnginePackage.POLICY__DURING:
				return during != null && !during.isEmpty();
			case PolicyEnginePackage.POLICY__USES_ROOMS:
				return usesRooms != null && !usesRooms.isEmpty();
			case PolicyEnginePackage.POLICY__DEFINE_LOCAL_STATE:
				return defineLocalState != null && !defineLocalState.isEmpty();
			case PolicyEnginePackage.POLICY__USES_SENSORS:
				return usesSensors != null && !usesSensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolicyImpl
