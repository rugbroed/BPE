/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage
 * @generated
 */
public interface PolicyEngineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyEngineFactory eINSTANCE = dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEngineFactoryImpl.init();

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
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

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
	 * Returns a new object of class '<em>Rain Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rain Sensor</em>'.
	 * @generated
	 */
	RainSensor createRainSensor();

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
	 * Returns a new object of class '<em>Instance Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Expression</em>'.
	 * @generated
	 */
	InstanceExpression createInstanceExpression();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Electrical Switch Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Switch Actuator</em>'.
	 * @generated
	 */
	ElectricalSwitchActuator createElectricalSwitchActuator();

	/**
	 * Returns a new object of class '<em>Water Valve Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Valve Actuator</em>'.
	 * @generated
	 */
	WaterValveActuator createWaterValveActuator();

	/**
	 * Returns a new object of class '<em>Gas Valve Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gas Valve Actuator</em>'.
	 * @generated
	 */
	GasValveActuator createGasValveActuator();

	/**
	 * Returns a new object of class '<em>Component Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Expression</em>'.
	 * @generated
	 */
	ComponentExpression createComponentExpression();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>State Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Instance</em>'.
	 * @generated
	 */
	StateInstance createStateInstance();

	/**
	 * Returns a new object of class '<em>Room Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Instance</em>'.
	 * @generated
	 */
	RoomInstance createRoomInstance();

	/**
	 * Returns a new object of class '<em>Int Bool Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Bool Value</em>'.
	 * @generated
	 */
	IntBoolValue createIntBoolValue();

	/**
	 * Returns a new object of class '<em>Sensor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Expression</em>'.
	 * @generated
	 */
	SensorExpression createSensorExpression();

	/**
	 * Returns a new object of class '<em>Actuator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Expression</em>'.
	 * @generated
	 */
	ActuatorExpression createActuatorExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolicyEnginePackage getPolicyEnginePackage();

} //PolicyEngineFactory
