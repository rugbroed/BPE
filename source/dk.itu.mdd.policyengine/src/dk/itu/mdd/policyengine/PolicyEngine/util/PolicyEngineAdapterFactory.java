/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.util;

import dk.itu.mdd.policyengine.PolicyEngine.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage
 * @generated
 */
public class PolicyEngineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolicyEnginePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEngineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PolicyEnginePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyEngineSwitch<Adapter> modelSwitch =
		new PolicyEngineSwitch<Adapter>() {
			@Override
			public Adapter caseBuilding(Building object) {
				return createBuildingAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseLightSwitchActuator(LightSwitchActuator object) {
				return createLightSwitchActuatorAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseSensorComponent(SensorComponent object) {
				return createSensorComponentAdapter();
			}
			@Override
			public Adapter caseMotionSensor(MotionSensor object) {
				return createMotionSensorAdapter();
			}
			@Override
			public Adapter caseTemperatureSensor(TemperatureSensor object) {
				return createTemperatureSensorAdapter();
			}
			@Override
			public Adapter casePressureSensor(PressureSensor object) {
				return createPressureSensorAdapter();
			}
			@Override
			public Adapter caseTouchSensor(TouchSensor object) {
				return createTouchSensorAdapter();
			}
			@Override
			public Adapter caseWindowActuator(WindowActuator object) {
				return createWindowActuatorAdapter();
			}
			@Override
			public Adapter caseHumidifierActuator(HumidifierActuator object) {
				return createHumidifierActuatorAdapter();
			}
			@Override
			public Adapter caseLightSensor(LightSensor object) {
				return createLightSensorAdapter();
			}
			@Override
			public Adapter caseCTS(CTS object) {
				return createCTSAdapter();
			}
			@Override
			public Adapter caseAccessControl(AccessControl object) {
				return createAccessControlAdapter();
			}
			@Override
			public Adapter caseDoorActuator(DoorActuator object) {
				return createDoorActuatorAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCalendarSystem(CalendarSystem object) {
				return createCalendarSystemAdapter();
			}
			@Override
			public Adapter caseMeetingScheduleSystem(MeetingScheduleSystem object) {
				return createMeetingScheduleSystemAdapter();
			}
			@Override
			public Adapter caseRadiatorActuator(RadiatorActuator object) {
				return createRadiatorActuatorAdapter();
			}
			@Override
			public Adapter caseSmokeSensor(SmokeSensor object) {
				return createSmokeSensorAdapter();
			}
			@Override
			public Adapter caseHasSensors(HasSensors object) {
				return createHasSensorsAdapter();
			}
			@Override
			public Adapter caseHasActuators(HasActuators object) {
				return createHasActuatorsAdapter();
			}
			@Override
			public Adapter caseCO2Sensor(CO2Sensor object) {
				return createCO2SensorAdapter();
			}
			@Override
			public Adapter caseInfraredLightSensor(InfraredLightSensor object) {
				return createInfraredLightSensorAdapter();
			}
			@Override
			public Adapter caseHumiditySensor(HumiditySensor object) {
				return createHumiditySensorAdapter();
			}
			@Override
			public Adapter caseAudioAlarmActuator(AudioAlarmActuator object) {
				return createAudioAlarmActuatorAdapter();
			}
			@Override
			public Adapter caseHasIntegerValue(HasIntegerValue object) {
				return createHasIntegerValueAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseFloor(Floor object) {
				return createFloorAdapter();
			}
			@Override
			public Adapter caseActuatorComponent(ActuatorComponent object) {
				return createActuatorComponentAdapter();
			}
			@Override
			public Adapter casePolicy(Policy object) {
				return createPolicyAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseConditions(Conditions object) {
				return createConditionsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building
	 * @generated
	 */
	public Adapter createBuildingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.LightSwitchActuator <em>Light Switch Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.LightSwitchActuator
	 * @generated
	 */
	public Adapter createLightSwitchActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.SensorComponent <em>Sensor Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.SensorComponent
	 * @generated
	 */
	public Adapter createSensorComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.MotionSensor <em>Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.MotionSensor
	 * @generated
	 */
	public Adapter createMotionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.TemperatureSensor
	 * @generated
	 */
	public Adapter createTemperatureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PressureSensor
	 * @generated
	 */
	public Adapter createPressureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.TouchSensor <em>Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.TouchSensor
	 * @generated
	 */
	public Adapter createTouchSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.WindowActuator <em>Window Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.WindowActuator
	 * @generated
	 */
	public Adapter createWindowActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.HumidifierActuator <em>Humidifier Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HumidifierActuator
	 * @generated
	 */
	public Adapter createHumidifierActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.CTS <em>CTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CTS
	 * @generated
	 */
	public Adapter createCTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.AccessControl
	 * @generated
	 */
	public Adapter createAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.DoorActuator <em>Door Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.DoorActuator
	 * @generated
	 */
	public Adapter createDoorActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.CalendarSystem <em>Calendar System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CalendarSystem
	 * @generated
	 */
	public Adapter createCalendarSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.MeetingScheduleSystem <em>Meeting Schedule System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.MeetingScheduleSystem
	 * @generated
	 */
	public Adapter createMeetingScheduleSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.RadiatorActuator <em>Radiator Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.RadiatorActuator
	 * @generated
	 */
	public Adapter createRadiatorActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.SmokeSensor <em>Smoke Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.SmokeSensor
	 * @generated
	 */
	public Adapter createSmokeSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.HasSensors <em>Has Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasSensors
	 * @generated
	 */
	public Adapter createHasSensorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.HasActuators <em>Has Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasActuators
	 * @generated
	 */
	public Adapter createHasActuatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.CO2Sensor <em>CO2 Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CO2Sensor
	 * @generated
	 */
	public Adapter createCO2SensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.InfraredLightSensor <em>Infrared Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.InfraredLightSensor
	 * @generated
	 */
	public Adapter createInfraredLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HumiditySensor
	 * @generated
	 */
	public Adapter createHumiditySensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.AudioAlarmActuator <em>Audio Alarm Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.AudioAlarmActuator
	 * @generated
	 */
	public Adapter createAudioAlarmActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue <em>Has Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue
	 * @generated
	 */
	public Adapter createHasIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Floor
	 * @generated
	 */
	public Adapter createFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent <em>Actuator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent
	 * @generated
	 */
	public Adapter createActuatorComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.PolicyEngine.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Conditions
	 * @generated
	 */
	public Adapter createConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PolicyEngineAdapterFactory
