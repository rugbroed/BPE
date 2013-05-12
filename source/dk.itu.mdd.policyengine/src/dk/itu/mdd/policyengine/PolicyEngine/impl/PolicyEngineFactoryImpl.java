/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.*;

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
			PolicyEngineFactory thePolicyEngineFactory = (PolicyEngineFactory)EPackage.Registry.INSTANCE.getEFactory(PolicyEnginePackage.eNS_URI);
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
			case PolicyEnginePackage.SENSOR: return createSensor();
			case PolicyEnginePackage.ACTUATOR: return createActuator();
			case PolicyEnginePackage.MOTION_SENSOR: return createMotionSensor();
			case PolicyEnginePackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case PolicyEnginePackage.RAIN_SENSOR: return createRainSensor();
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
			case PolicyEnginePackage.CO2_SENSOR: return createCO2Sensor();
			case PolicyEnginePackage.INFRARED_LIGHT_SENSOR: return createInfraredLightSensor();
			case PolicyEnginePackage.HUMIDITY_SENSOR: return createHumiditySensor();
			case PolicyEnginePackage.AUDIO_ALARM_ACTUATOR: return createAudioAlarmActuator();
			case PolicyEnginePackage.ROOM: return createRoom();
			case PolicyEnginePackage.FLOOR: return createFloor();
			case PolicyEnginePackage.POLICY: return createPolicy();
			case PolicyEnginePackage.STATE: return createState();
			case PolicyEnginePackage.TIMER: return createTimer();
			case PolicyEnginePackage.SCHEDULE: return createSchedule();
			case PolicyEnginePackage.TIME: return createTime();
			case PolicyEnginePackage.IF: return createIf();
			case PolicyEnginePackage.TIME_EXPRESSION: return createTimeExpression();
			case PolicyEnginePackage.RESET_EXPRESSION: return createResetExpression();
			case PolicyEnginePackage.BINARY_EXPRESSION: return createBinaryExpression();
			case PolicyEnginePackage.UNARY_EXPRESSION: return createUnaryExpression();
			case PolicyEnginePackage.ELECTRICAL_SWITCH_ACTUATOR: return createElectricalSwitchActuator();
			case PolicyEnginePackage.WATER_VALVE_ACTUATOR: return createWaterValveActuator();
			case PolicyEnginePackage.GAS_VALVE_ACTUATOR: return createGasValveActuator();
			case PolicyEnginePackage.COMPONENT_EXPRESSION: return createComponentExpression();
			case PolicyEnginePackage.STATE_EXPRESSION: return createStateExpression();
			case PolicyEnginePackage.ROOM_EXPRESSION: return createRoomExpression();
			case PolicyEnginePackage.SENSOR_EXPRESSION: return createSensorExpression();
			case PolicyEnginePackage.ACTUATOR_EXPRESSION: return createActuatorExpression();
			case PolicyEnginePackage.BINARY_METHOD: return createBinaryMethod();
			case PolicyEnginePackage.BOOL_VALUE: return createBoolValue();
			case PolicyEnginePackage.INT_VALUE: return createIntValue();
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
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
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
	public RainSensor createRainSensor() {
		RainSensorImpl rainSensor = new RainSensorImpl();
		return rainSensor;
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
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalSwitchActuator createElectricalSwitchActuator() {
		ElectricalSwitchActuatorImpl electricalSwitchActuator = new ElectricalSwitchActuatorImpl();
		return electricalSwitchActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterValveActuator createWaterValveActuator() {
		WaterValveActuatorImpl waterValveActuator = new WaterValveActuatorImpl();
		return waterValveActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GasValveActuator createGasValveActuator() {
		GasValveActuatorImpl gasValveActuator = new GasValveActuatorImpl();
		return gasValveActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExpression createComponentExpression() {
		ComponentExpressionImpl componentExpression = new ComponentExpressionImpl();
		return componentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExpression createStateExpression() {
		StateExpressionImpl stateExpression = new StateExpressionImpl();
		return stateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExpression createRoomExpression() {
		RoomExpressionImpl roomExpression = new RoomExpressionImpl();
		return roomExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorExpression createSensorExpression() {
		SensorExpressionImpl sensorExpression = new SensorExpressionImpl();
		return sensorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorExpression createActuatorExpression() {
		ActuatorExpressionImpl actuatorExpression = new ActuatorExpressionImpl();
		return actuatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryMethod createBinaryMethod() {
		BinaryMethodImpl binaryMethod = new BinaryMethodImpl();
		return binaryMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolValue createBoolValue() {
		BoolValueImpl boolValue = new BoolValueImpl();
		return boolValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntValue createIntValue() {
		IntValueImpl intValue = new IntValueImpl();
		return intValue;
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
