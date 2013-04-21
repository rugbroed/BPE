/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine.util;

import dk.itu.mdd.policyengine.expressions.PolicyEngine.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage
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
			public Adapter caseTimer(Timer object) {
				return createTimerAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseCompExpression(CompExpression object) {
				return createCompExpressionAdapter();
			}
			@Override
			public Adapter caseTimeExpression(TimeExpression object) {
				return createTimeExpressionAdapter();
			}
			@Override
			public Adapter caseResetExpression(ResetExpression object) {
				return createResetExpressionAdapter();
			}
			@Override
			public Adapter caseAudioAlarmTimer(AudioAlarmTimer object) {
				return createAudioAlarmTimerAdapter();
			}
			@Override
			public Adapter caseClause(Clause object) {
				return createClauseAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseManyExpressions(ManyExpressions object) {
				return createManyExpressionsAdapter();
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
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building
	 * @generated
	 */
	public Adapter createBuildingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSwitchActuator <em>Light Switch Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSwitchActuator
	 * @generated
	 */
	public Adapter createLightSwitchActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.SensorComponent <em>Sensor Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.SensorComponent
	 * @generated
	 */
	public Adapter createSensorComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.MotionSensor <em>Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.MotionSensor
	 * @generated
	 */
	public Adapter createMotionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TemperatureSensor
	 * @generated
	 */
	public Adapter createTemperatureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PressureSensor
	 * @generated
	 */
	public Adapter createPressureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TouchSensor <em>Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TouchSensor
	 * @generated
	 */
	public Adapter createTouchSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.WindowActuator <em>Window Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.WindowActuator
	 * @generated
	 */
	public Adapter createWindowActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HumidifierActuator <em>Humidifier Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HumidifierActuator
	 * @generated
	 */
	public Adapter createHumidifierActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS <em>CTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS
	 * @generated
	 */
	public Adapter createCTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl
	 * @generated
	 */
	public Adapter createAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.DoorActuator <em>Door Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.DoorActuator
	 * @generated
	 */
	public Adapter createDoorActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CalendarSystem <em>Calendar System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CalendarSystem
	 * @generated
	 */
	public Adapter createCalendarSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.MeetingScheduleSystem <em>Meeting Schedule System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.MeetingScheduleSystem
	 * @generated
	 */
	public Adapter createMeetingScheduleSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.RadiatorActuator <em>Radiator Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.RadiatorActuator
	 * @generated
	 */
	public Adapter createRadiatorActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.SmokeSensor <em>Smoke Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.SmokeSensor
	 * @generated
	 */
	public Adapter createSmokeSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasSensors <em>Has Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasSensors
	 * @generated
	 */
	public Adapter createHasSensorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasActuators <em>Has Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasActuators
	 * @generated
	 */
	public Adapter createHasActuatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CO2Sensor <em>CO2 Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CO2Sensor
	 * @generated
	 */
	public Adapter createCO2SensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.InfraredLightSensor <em>Infrared Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.InfraredLightSensor
	 * @generated
	 */
	public Adapter createInfraredLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HumiditySensor
	 * @generated
	 */
	public Adapter createHumiditySensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmActuator <em>Audio Alarm Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmActuator
	 * @generated
	 */
	public Adapter createAudioAlarmActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasIntegerValue <em>Has Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasIntegerValue
	 * @generated
	 */
	public Adapter createHasIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor
	 * @generated
	 */
	public Adapter createFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ActuatorComponent <em>Actuator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ActuatorComponent
	 * @generated
	 */
	public Adapter createActuatorComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Timer
	 * @generated
	 */
	public Adapter createTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression <em>Comp Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression
	 * @generated
	 */
	public Adapter createCompExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression
	 * @generated
	 */
	public Adapter createTimeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression <em>Reset Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression
	 * @generated
	 */
	public Adapter createResetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmTimer <em>Audio Alarm Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmTimer
	 * @generated
	 */
	public Adapter createAudioAlarmTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions <em>Many Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions
	 * @generated
	 */
	public Adapter createManyExpressionsAdapter() {
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
