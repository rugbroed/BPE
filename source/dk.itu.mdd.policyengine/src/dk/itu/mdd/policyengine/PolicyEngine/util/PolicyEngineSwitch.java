/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.util;

import dk.itu.mdd.policyengine.PolicyEngine.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage
 * @generated
 */
public class PolicyEngineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolicyEnginePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEngineSwitch() {
		if (modelPackage == null) {
			modelPackage = PolicyEnginePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PolicyEnginePackage.BUILDING: {
				Building building = (Building)theEObject;
				T result = caseBuilding(building);
				if (result == null) result = caseNamedElement(building);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseNamedElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.LIGHT_SWITCH_ACTUATOR: {
				LightSwitchActuator lightSwitchActuator = (LightSwitchActuator)theEObject;
				T result = caseLightSwitchActuator(lightSwitchActuator);
				if (result == null) result = caseActuator(lightSwitchActuator);
				if (result == null) result = caseHasIntegerValue(lightSwitchActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseHasIntegerValue(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseHasIntegerValue(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.SENSOR_COMPONENT: {
				SensorComponent sensorComponent = (SensorComponent)theEObject;
				T result = caseSensorComponent(sensorComponent);
				if (result == null) result = caseHasSensors(sensorComponent);
				if (result == null) result = caseNamedElement(sensorComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.MOTION_SENSOR: {
				MotionSensor motionSensor = (MotionSensor)theEObject;
				T result = caseMotionSensor(motionSensor);
				if (result == null) result = caseSensor(motionSensor);
				if (result == null) result = caseHasIntegerValue(motionSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.TEMPERATURE_SENSOR: {
				TemperatureSensor temperatureSensor = (TemperatureSensor)theEObject;
				T result = caseTemperatureSensor(temperatureSensor);
				if (result == null) result = caseSensor(temperatureSensor);
				if (result == null) result = caseHasIntegerValue(temperatureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.PRESSURE_SENSOR: {
				PressureSensor pressureSensor = (PressureSensor)theEObject;
				T result = casePressureSensor(pressureSensor);
				if (result == null) result = caseSensor(pressureSensor);
				if (result == null) result = caseHasIntegerValue(pressureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.TOUCH_SENSOR: {
				TouchSensor touchSensor = (TouchSensor)theEObject;
				T result = caseTouchSensor(touchSensor);
				if (result == null) result = caseSensor(touchSensor);
				if (result == null) result = caseHasIntegerValue(touchSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.WINDOW_ACTUATOR: {
				WindowActuator windowActuator = (WindowActuator)theEObject;
				T result = caseWindowActuator(windowActuator);
				if (result == null) result = caseActuator(windowActuator);
				if (result == null) result = caseHasIntegerValue(windowActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.HUMIDIFIER_ACTUATOR: {
				HumidifierActuator humidifierActuator = (HumidifierActuator)theEObject;
				T result = caseHumidifierActuator(humidifierActuator);
				if (result == null) result = caseActuator(humidifierActuator);
				if (result == null) result = caseHasIntegerValue(humidifierActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.LIGHT_SENSOR: {
				LightSensor lightSensor = (LightSensor)theEObject;
				T result = caseLightSensor(lightSensor);
				if (result == null) result = caseSensor(lightSensor);
				if (result == null) result = caseHasIntegerValue(lightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.CTS: {
				CTS cts = (CTS)theEObject;
				T result = caseCTS(cts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.ACCESS_CONTROL: {
				AccessControl accessControl = (AccessControl)theEObject;
				T result = caseAccessControl(accessControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.DOOR_ACTUATOR: {
				DoorActuator doorActuator = (DoorActuator)theEObject;
				T result = caseDoorActuator(doorActuator);
				if (result == null) result = caseActuator(doorActuator);
				if (result == null) result = caseHasIntegerValue(doorActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.CALENDAR_SYSTEM: {
				CalendarSystem calendarSystem = (CalendarSystem)theEObject;
				T result = caseCalendarSystem(calendarSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.MEETING_SCHEDULE_SYSTEM: {
				MeetingScheduleSystem meetingScheduleSystem = (MeetingScheduleSystem)theEObject;
				T result = caseMeetingScheduleSystem(meetingScheduleSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.RADIATOR_ACTUATOR: {
				RadiatorActuator radiatorActuator = (RadiatorActuator)theEObject;
				T result = caseRadiatorActuator(radiatorActuator);
				if (result == null) result = caseActuator(radiatorActuator);
				if (result == null) result = caseHasIntegerValue(radiatorActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.SMOKE_SENSOR: {
				SmokeSensor smokeSensor = (SmokeSensor)theEObject;
				T result = caseSmokeSensor(smokeSensor);
				if (result == null) result = caseSensor(smokeSensor);
				if (result == null) result = caseHasIntegerValue(smokeSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.HAS_SENSORS: {
				HasSensors hasSensors = (HasSensors)theEObject;
				T result = caseHasSensors(hasSensors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.HAS_ACTUATORS: {
				HasActuators hasActuators = (HasActuators)theEObject;
				T result = caseHasActuators(hasActuators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.CO2_SENSOR: {
				CO2Sensor co2Sensor = (CO2Sensor)theEObject;
				T result = caseCO2Sensor(co2Sensor);
				if (result == null) result = caseSensor(co2Sensor);
				if (result == null) result = caseHasIntegerValue(co2Sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.INFRARED_LIGHT_SENSOR: {
				InfraredLightSensor infraredLightSensor = (InfraredLightSensor)theEObject;
				T result = caseInfraredLightSensor(infraredLightSensor);
				if (result == null) result = caseSensor(infraredLightSensor);
				if (result == null) result = caseHasIntegerValue(infraredLightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.HUMIDITY_SENSOR: {
				HumiditySensor humiditySensor = (HumiditySensor)theEObject;
				T result = caseHumiditySensor(humiditySensor);
				if (result == null) result = caseSensor(humiditySensor);
				if (result == null) result = caseHasIntegerValue(humiditySensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.AUDIO_ALARM_ACTUATOR: {
				AudioAlarmActuator audioAlarmActuator = (AudioAlarmActuator)theEObject;
				T result = caseAudioAlarmActuator(audioAlarmActuator);
				if (result == null) result = caseActuator(audioAlarmActuator);
				if (result == null) result = caseHasIntegerValue(audioAlarmActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.HAS_INTEGER_VALUE: {
				HasIntegerValue hasIntegerValue = (HasIntegerValue)theEObject;
				T result = caseHasIntegerValue(hasIntegerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = caseNamedElement(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.FLOOR: {
				Floor floor = (Floor)theEObject;
				T result = caseFloor(floor);
				if (result == null) result = caseNamedElement(floor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.ACTUATOR_COMPONENT: {
				ActuatorComponent actuatorComponent = (ActuatorComponent)theEObject;
				T result = caseActuatorComponent(actuatorComponent);
				if (result == null) result = caseHasActuators(actuatorComponent);
				if (result == null) result = caseNamedElement(actuatorComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.POLICY: {
				Policy policy = (Policy)theEObject;
				T result = casePolicy(policy);
				if (result == null) result = caseNamedElement(policy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PolicyEnginePackage.CONDITIONS: {
				Conditions conditions = (Conditions)theEObject;
				T result = caseConditions(conditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilding(Building object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Switch Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Switch Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSwitchActuator(LightSwitchActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorComponent(SensorComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motion Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotionSensor(MotionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperatureSensor(TemperatureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensor(PressureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchSensor(TouchSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowActuator(WindowActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Humidifier Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Humidifier Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumidifierActuator(HumidifierActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSensor(LightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTS(CTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControl(AccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorActuator(DoorActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarSystem(CalendarSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meeting Schedule System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meeting Schedule System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeetingScheduleSystem(MeetingScheduleSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radiator Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radiator Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadiatorActuator(RadiatorActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smoke Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smoke Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmokeSensor(SmokeSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Sensors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Sensors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasSensors(HasSensors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Actuators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Actuators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasActuators(HasActuators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CO2 Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CO2 Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCO2Sensor(CO2Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrared Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrared Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfraredLightSensor(InfraredLightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Humidity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Humidity Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumiditySensor(HumiditySensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Alarm Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Alarm Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioAlarmActuator(AudioAlarmActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasIntegerValue(HasIntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloor(Floor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorComponent(ActuatorComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicy(Policy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditions(Conditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PolicyEngineSwitch
