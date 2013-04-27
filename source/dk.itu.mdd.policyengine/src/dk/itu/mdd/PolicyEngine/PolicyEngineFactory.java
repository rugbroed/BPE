/**
 */
package dk.itu.mdd.PolicyEngine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage
 * @generated
 */
public interface PolicyEngineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyEngineFactory eINSTANCE = dk.itu.mdd.PolicyEngine.impl.PolicyEngineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building</em>'.
	 * @generated
	 */
	Building createBuilding();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Light Switch Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Switch Actuator</em>'.
	 * @generated
	 */
	LightSwitchActuator createLightSwitchActuator();

	/**
	 * Returns a new object of class '<em>Sensor Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Component</em>'.
	 * @generated
	 */
	SensorComponent createSensorComponent();

	/**
	 * Returns a new object of class '<em>Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion Sensor</em>'.
	 * @generated
	 */
	MotionSensor createMotionSensor();

	/**
	 * Returns a new object of class '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Sensor</em>'.
	 * @generated
	 */
	TemperatureSensor createTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor</em>'.
	 * @generated
	 */
	PressureSensor createPressureSensor();

	/**
	 * Returns a new object of class '<em>Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touch Sensor</em>'.
	 * @generated
	 */
	TouchSensor createTouchSensor();

	/**
	 * Returns a new object of class '<em>Window Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window Actuator</em>'.
	 * @generated
	 */
	WindowActuator createWindowActuator();

	/**
	 * Returns a new object of class '<em>Humidifier Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Humidifier Actuator</em>'.
	 * @generated
	 */
	HumidifierActuator createHumidifierActuator();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>CTS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTS</em>'.
	 * @generated
	 */
	CTS createCTS();

	/**
	 * Returns a new object of class '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control</em>'.
	 * @generated
	 */
	AccessControl createAccessControl();

	/**
	 * Returns a new object of class '<em>Door Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Actuator</em>'.
	 * @generated
	 */
	DoorActuator createDoorActuator();

	/**
	 * Returns a new object of class '<em>Calendar System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar System</em>'.
	 * @generated
	 */
	CalendarSystem createCalendarSystem();

	/**
	 * Returns a new object of class '<em>Meeting Schedule System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meeting Schedule System</em>'.
	 * @generated
	 */
	MeetingScheduleSystem createMeetingScheduleSystem();

	/**
	 * Returns a new object of class '<em>Radiator Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radiator Actuator</em>'.
	 * @generated
	 */
	RadiatorActuator createRadiatorActuator();

	/**
	 * Returns a new object of class '<em>Smoke Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smoke Sensor</em>'.
	 * @generated
	 */
	SmokeSensor createSmokeSensor();

	/**
	 * Returns a new object of class '<em>Has Sensors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Sensors</em>'.
	 * @generated
	 */
	HasSensors createHasSensors();

	/**
	 * Returns a new object of class '<em>Has Actuators</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Actuators</em>'.
	 * @generated
	 */
	HasActuators createHasActuators();

	/**
	 * Returns a new object of class '<em>CO2 Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CO2 Sensor</em>'.
	 * @generated
	 */
	CO2Sensor createCO2Sensor();

	/**
	 * Returns a new object of class '<em>Infrared Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrared Light Sensor</em>'.
	 * @generated
	 */
	InfraredLightSensor createInfraredLightSensor();

	/**
	 * Returns a new object of class '<em>Humidity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Humidity Sensor</em>'.
	 * @generated
	 */
	HumiditySensor createHumiditySensor();

	/**
	 * Returns a new object of class '<em>Audio Alarm Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Alarm Actuator</em>'.
	 * @generated
	 */
	AudioAlarmActuator createAudioAlarmActuator();

	/**
	 * Returns a new object of class '<em>Has Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Integer Value</em>'.
	 * @generated
	 */
	HasIntegerValue createHasIntegerValue();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floor</em>'.
	 * @generated
	 */
	Floor createFloor();

	/**
	 * Returns a new object of class '<em>Actuator Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Component</em>'.
	 * @generated
	 */
	ActuatorComponent createActuatorComponent();

	/**
	 * Returns a new object of class '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy</em>'.
	 * @generated
	 */
	Policy createPolicy();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer</em>'.
	 * @generated
	 */
	Timer createTimer();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	Schedule createSchedule();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Expression</em>'.
	 * @generated
	 */
	TimeExpression createTimeExpression();

	/**
	 * Returns a new object of class '<em>Reset Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Expression</em>'.
	 * @generated
	 */
	ResetExpression createResetExpression();

	/**
	 * Returns a new object of class '<em>Room Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Usage</em>'.
	 * @generated
	 */
	RoomUsage createRoomUsage();

	/**
	 * Returns a new object of class '<em>Many Expressions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many Expressions</em>'.
	 * @generated
	 */
	ManyExpressions createManyExpressions();

	/**
	 * Returns a new object of class '<em>Comp Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Expression</em>'.
	 * @generated
	 */
	CompExpression createCompExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolicyEnginePackage getPolicyEnginePackage();

} //PolicyEngineFactory
