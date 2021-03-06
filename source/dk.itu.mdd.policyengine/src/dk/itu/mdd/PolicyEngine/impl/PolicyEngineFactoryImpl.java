/**
 */
package dk.itu.mdd.PolicyEngine.impl;

import dk.itu.mdd.PolicyEngine.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyEngineFactoryImpl extends EFactoryImpl implements PolicyEngineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolicyEngineFactory init() {
		try {
			PolicyEngineFactory thePolicyEngineFactory = (PolicyEngineFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/dk.itu.mdd.policyengine/model/PolicyEngine.ecore"); 
			if (thePolicyEngineFactory != null) {
				return thePolicyEngineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolicyEngineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEngineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PolicyEnginePackage.BUILDING: return createBuilding();
			case PolicyEnginePackage.MODEL: return createModel();
			case PolicyEnginePackage.LIGHT_SWITCH_ACTUATOR: return createLightSwitchActuator();
			case PolicyEnginePackage.SENSOR_COMPONENT: return createSensorComponent();
			case PolicyEnginePackage.MOTION_SENSOR: return createMotionSensor();
			case PolicyEnginePackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case PolicyEnginePackage.PRESSURE_SENSOR: return createPressureSensor();
			case PolicyEnginePackage.TOUCH_SENSOR: return createTouchSensor();
			case PolicyEnginePackage.WINDOW_ACTUATOR: return createWindowActuator();
			case PolicyEnginePackage.HUMIDIFIER_ACTUATOR: return createHumidifierActuator();
			case PolicyEnginePackage.LIGHT_SENSOR: return createLightSensor();
			case PolicyEnginePackage.CTS: return createCTS();
			case PolicyEnginePackage.ACCESS_CONTROL: return createAccessControl();
			case PolicyEnginePackage.DOOR_ACTUATOR: return createDoorActuator();
			case PolicyEnginePackage.CALENDAR_SYSTEM: return createCalendarSystem();
			case PolicyEnginePackage.MEETING_SCHEDULE_SYSTEM: return createMeetingScheduleSystem();
			case PolicyEnginePackage.RADIATOR_ACTUATOR: return createRadiatorActuator();
			case PolicyEnginePackage.SMOKE_SENSOR: return createSmokeSensor();
			case PolicyEnginePackage.HAS_SENSORS: return createHasSensors();
			case PolicyEnginePackage.HAS_ACTUATORS: return createHasActuators();
			case PolicyEnginePackage.CO2_SENSOR: return createCO2Sensor();
			case PolicyEnginePackage.INFRARED_LIGHT_SENSOR: return createInfraredLightSensor();
			case PolicyEnginePackage.HUMIDITY_SENSOR: return createHumiditySensor();
			case PolicyEnginePackage.AUDIO_ALARM_ACTUATOR: return createAudioAlarmActuator();
			case PolicyEnginePackage.HAS_INTEGER_VALUE: return createHasIntegerValue();
			case PolicyEnginePackage.ROOM: return createRoom();
			case PolicyEnginePackage.FLOOR: return createFloor();
			case PolicyEnginePackage.ACTUATOR_COMPONENT: return createActuatorComponent();
			case PolicyEnginePackage.POLICY: return createPolicy();
			case PolicyEnginePackage.STATE: return createState();
			case PolicyEnginePackage.TIMER: return createTimer();
			case PolicyEnginePackage.SCHEDULE: return createSchedule();
			case PolicyEnginePackage.TIME: return createTime();
			case PolicyEnginePackage.IF: return createIf();
			case PolicyEnginePackage.TIME_EXPRESSION: return createTimeExpression();
			case PolicyEnginePackage.RESET_EXPRESSION: return createResetExpression();
			case PolicyEnginePackage.ROOM_USAGE: return createRoomUsage();
			case PolicyEnginePackage.MANY_EXPRESSIONS: return createManyExpressions();
			case PolicyEnginePackage.COMP_EXPRESSION: return createCompExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PolicyEnginePackage.WEEKDAYS:
				return createWeekdaysFromString(eDataType, initialValue);
			case PolicyEnginePackage.COMP_OPS:
				return createCompOpsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PolicyEnginePackage.WEEKDAYS:
				return convertWeekdaysToString(eDataType, instanceValue);
			case PolicyEnginePackage.COMP_OPS:
				return convertCompOpsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSwitchActuator createLightSwitchActuator() {
		LightSwitchActuatorImpl lightSwitchActuator = new LightSwitchActuatorImpl();
		return lightSwitchActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorComponent createSensorComponent() {
		SensorComponentImpl sensorComponent = new SensorComponentImpl();
		return sensorComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionSensor createMotionSensor() {
		MotionSensorImpl motionSensor = new MotionSensorImpl();
		return motionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureSensor createTemperatureSensor() {
		TemperatureSensorImpl temperatureSensor = new TemperatureSensorImpl();
		return temperatureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensor createPressureSensor() {
		PressureSensorImpl pressureSensor = new PressureSensorImpl();
		return pressureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchSensor createTouchSensor() {
		TouchSensorImpl touchSensor = new TouchSensorImpl();
		return touchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowActuator createWindowActuator() {
		WindowActuatorImpl windowActuator = new WindowActuatorImpl();
		return windowActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumidifierActuator createHumidifierActuator() {
		HumidifierActuatorImpl humidifierActuator = new HumidifierActuatorImpl();
		return humidifierActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTS createCTS() {
		CTSImpl cts = new CTSImpl();
		return cts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControl createAccessControl() {
		AccessControlImpl accessControl = new AccessControlImpl();
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorActuator createDoorActuator() {
		DoorActuatorImpl doorActuator = new DoorActuatorImpl();
		return doorActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarSystem createCalendarSystem() {
		CalendarSystemImpl calendarSystem = new CalendarSystemImpl();
		return calendarSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetingScheduleSystem createMeetingScheduleSystem() {
		MeetingScheduleSystemImpl meetingScheduleSystem = new MeetingScheduleSystemImpl();
		return meetingScheduleSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadiatorActuator createRadiatorActuator() {
		RadiatorActuatorImpl radiatorActuator = new RadiatorActuatorImpl();
		return radiatorActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokeSensor createSmokeSensor() {
		SmokeSensorImpl smokeSensor = new SmokeSensorImpl();
		return smokeSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasSensors createHasSensors() {
		HasSensorsImpl hasSensors = new HasSensorsImpl();
		return hasSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasActuators createHasActuators() {
		HasActuatorsImpl hasActuators = new HasActuatorsImpl();
		return hasActuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CO2Sensor createCO2Sensor() {
		CO2SensorImpl co2Sensor = new CO2SensorImpl();
		return co2Sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfraredLightSensor createInfraredLightSensor() {
		InfraredLightSensorImpl infraredLightSensor = new InfraredLightSensorImpl();
		return infraredLightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumiditySensor createHumiditySensor() {
		HumiditySensorImpl humiditySensor = new HumiditySensorImpl();
		return humiditySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioAlarmActuator createAudioAlarmActuator() {
		AudioAlarmActuatorImpl audioAlarmActuator = new AudioAlarmActuatorImpl();
		return audioAlarmActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasIntegerValue createHasIntegerValue() {
		HasIntegerValueImpl hasIntegerValue = new HasIntegerValueImpl();
		return hasIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorComponent createActuatorComponent() {
		ActuatorComponentImpl actuatorComponent = new ActuatorComponentImpl();
		return actuatorComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression createTimeExpression() {
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetExpression createResetExpression() {
		ResetExpressionImpl resetExpression = new ResetExpressionImpl();
		return resetExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomUsage createRoomUsage() {
		RoomUsageImpl roomUsage = new RoomUsageImpl();
		return roomUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyExpressions createManyExpressions() {
		ManyExpressionsImpl manyExpressions = new ManyExpressionsImpl();
		return manyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompExpression createCompExpression() {
		CompExpressionImpl compExpression = new CompExpressionImpl();
		return compExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weekdays createWeekdaysFromString(EDataType eDataType, String initialValue) {
		Weekdays result = Weekdays.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekdaysToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOps createCompOpsFromString(EDataType eDataType, String initialValue) {
		CompOps result = CompOps.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompOpsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEnginePackage getPolicyEnginePackage() {
		return (PolicyEnginePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolicyEnginePackage getPackage() {
		return PolicyEnginePackage.eINSTANCE;
	}

} //PolicyEngineFactoryImpl
