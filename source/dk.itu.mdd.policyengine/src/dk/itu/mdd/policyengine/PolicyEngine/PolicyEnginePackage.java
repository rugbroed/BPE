/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEngineFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyEnginePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PolicyEngine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/dk.itu.mdd.policyengine/model/PolicyEngine.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "policyengine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyEnginePackage eINSTANCE = dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.NamedElementImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ACCESS_CONTROL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__FLOORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__TIMERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BUILDINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predefined Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PREDEFINED_ROOMS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policy Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__POLICY_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STATE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TIMERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCHEDULES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorTypeImpl <em>Actuator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorTypeImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 17;

	/**
	 * The number of structural features of the '<em>Actuator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.LightSwitchActuatorImpl <em>Light Switch Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.LightSwitchActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSwitchActuator()
	 * @generated
	 */
	int LIGHT_SWITCH_ACTUATOR = 2;

	/**
	 * The number of structural features of the '<em>Light Switch Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SWITCH_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actuator Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTUATOR_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorTypeImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 35;

	/**
	 * The number of structural features of the '<em>Sensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.MotionSensorImpl <em>Motion Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.MotionSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getMotionSensor()
	 * @generated
	 */
	int MOTION_SENSOR = 5;

	/**
	 * The number of structural features of the '<em>Motion Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TemperatureSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTemperatureSensor()
	 * @generated
	 */
	int TEMPERATURE_SENSOR = 6;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RainSensorImpl <em>Rain Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RainSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRainSensor()
	 * @generated
	 */
	int RAIN_SENSOR = 7;

	/**
	 * The number of structural features of the '<em>Rain Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TouchSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTouchSensor()
	 * @generated
	 */
	int TOUCH_SENSOR = 8;

	/**
	 * The number of structural features of the '<em>Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.WindowActuatorImpl <em>Window Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.WindowActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWindowActuator()
	 * @generated
	 */
	int WINDOW_ACTUATOR = 9;

	/**
	 * The number of structural features of the '<em>Window Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HumidifierActuatorImpl <em>Humidifier Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HumidifierActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHumidifierActuator()
	 * @generated
	 */
	int HUMIDIFIER_ACTUATOR = 10;

	/**
	 * The number of structural features of the '<em>Humidifier Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.LightSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 11;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.AccessControlImpl <em>Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.AccessControlImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getAccessControl()
	 * @generated
	 */
	int ACCESS_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Access Control Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__ACCESS_CONTROL_SENSORS = 0;

	/**
	 * The feature id for the '<em><b>Access Control Door Lock Actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR = 1;

	/**
	 * The number of structural features of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.DoorActuatorImpl <em>Door Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.DoorActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getDoorActuator()
	 * @generated
	 */
	int DOOR_ACTUATOR = 13;

	/**
	 * The number of structural features of the '<em>Door Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RadiatorActuatorImpl <em>Radiator Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RadiatorActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRadiatorActuator()
	 * @generated
	 */
	int RADIATOR_ACTUATOR = 15;

	/**
	 * The number of structural features of the '<em>Radiator Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SmokeSensorImpl <em>Smoke Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SmokeSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSmokeSensor()
	 * @generated
	 */
	int SMOKE_SENSOR = 16;

	/**
	 * The number of structural features of the '<em>Smoke Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.CO2SensorImpl <em>CO2 Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.CO2SensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getCO2Sensor()
	 * @generated
	 */
	int CO2_SENSOR = 18;

	/**
	 * The number of structural features of the '<em>CO2 Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.InfraredLightSensorImpl <em>Infrared Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.InfraredLightSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getInfraredLightSensor()
	 * @generated
	 */
	int INFRARED_LIGHT_SENSOR = 19;

	/**
	 * The number of structural features of the '<em>Infrared Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_LIGHT_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HumiditySensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHumiditySensor()
	 * @generated
	 */
	int HUMIDITY_SENSOR = 20;

	/**
	 * The number of structural features of the '<em>Humidity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.AudioAlarmActuatorImpl <em>Audio Alarm Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.AudioAlarmActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getAudioAlarmActuator()
	 * @generated
	 */
	int AUDIO_ALARM_ACTUATOR = 21;

	/**
	 * The number of structural features of the '<em>Audio Alarm Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ALARM_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Declare Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DECLARE_SENSOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declare Actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DECLARE_ACTUATOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__EXTENDS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TIMERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__POLICIES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>During</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DURING = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.FloorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__ROOMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uses Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__USES_ACTUATORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specified By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__SPECIFIED_BY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Define State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DEFINE_STATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>During</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__DURING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uses Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__USES_ROOMS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uses Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__USES_SENSORS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.StateImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getState()
	 * @generated
	 */
	int STATE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VALUE_STATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimerImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ScheduleImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Weekdays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__WEEKDAYS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__FROM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TO = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimeImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 28;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__HOURS = 0;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MINUTES = 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.StatementImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 40;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getIf()
	 * @generated
	 */
	int IF = 29;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSEIF = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 32;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimeExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTimeExpression()
	 * @generated
	 */
	int TIME_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Time Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__TIME_AMOUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__TIME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ResetExpressionImpl <em>Reset Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ResetExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getResetExpression()
	 * @generated
	 */
	int RESET_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_EXPRESSION__RESET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.UnaryExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ElectricalSwitchActuatorImpl <em>Electrical Switch Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ElectricalSwitchActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getElectricalSwitchActuator()
	 * @generated
	 */
	int ELECTRICAL_SWITCH_ACTUATOR = 36;

	/**
	 * The number of structural features of the '<em>Electrical Switch Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SWITCH_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.WaterValveActuatorImpl <em>Water Valve Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.WaterValveActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWaterValveActuator()
	 * @generated
	 */
	int WATER_VALVE_ACTUATOR = 37;

	/**
	 * The number of structural features of the '<em>Water Valve Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_VALVE_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.GasValveActuatorImpl <em>Gas Valve Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.GasValveActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getGasValveActuator()
	 * @generated
	 */
	int GAS_VALVE_ACTUATOR = 38;

	/**
	 * The number of structural features of the '<em>Gas Valve Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_VALVE_ACTUATOR_FEATURE_COUNT = ACTUATOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.Component <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Component
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 39;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ComponentExpressionImpl <em>Component Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ComponentExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getComponentExpression()
	 * @generated
	 */
	int COMPONENT_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXPRESSION__INSTANCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StateExpressionImpl <em>State Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.StateExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getStateExpression()
	 * @generated
	 */
	int STATE_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Define State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EXPRESSION__DEFINE_STATE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomExpressionImpl <em>Room Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RoomExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRoomExpression()
	 * @generated
	 */
	int ROOM_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Room Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPRESSION__ROOM_INSTANCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ValueExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 44;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorExpressionImpl <em>Sensor Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorExpression()
	 * @generated
	 */
	int SENSOR_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Sen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_EXPRESSION__SEN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorExpressionImpl <em>Actuator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorExpressionImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorExpression()
	 * @generated
	 */
	int ACTUATOR_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_EXPRESSION__ACT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryMethodImpl <em>Binary Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryMethodImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBinaryMethod()
	 * @generated
	 */
	int BINARY_METHOD = 47;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_METHOD__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_METHOD__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_METHOD__OPERATOR = BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Binary Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_METHOD_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BoolValueImpl <em>Bool Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BoolValueImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBoolValue()
	 * @generated
	 */
	int BOOL_VALUE = 48;

	/**
	 * The number of structural features of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.IntValueImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 49;

	/**
	 * The number of structural features of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.WindowSensorImpl <em>Window Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.WindowSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWindowSensor()
	 * @generated
	 */
	int WINDOW_SENSOR = 50;

	/**
	 * The number of structural features of the '<em>Window Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.DoorSensorImpl <em>Door Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.DoorSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getDoorSensor()
	 * @generated
	 */
	int DOOR_SENSOR = 51;

	/**
	 * The number of structural features of the '<em>Door Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_SENSOR_FEATURE_COUNT = SENSOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.Weekdays <em>Weekdays</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Weekdays
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWeekdays()
	 * @generated
	 */
	int WEEKDAYS = 52;


	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building#getAccessControl()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_AccessControl();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floors</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building#getFloors()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Floors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building#getTimers()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Timers();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Model#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model#getBuildings()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Buildings();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Model#getPredefinedRooms <em>Predefined Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefined Rooms</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model#getPredefinedRooms()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_PredefinedRooms();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Model#getPolicyDefinition <em>Policy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Definition</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model#getPolicyDefinition()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_PolicyDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Model#getStateDefinition <em>State Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Definition</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model#getStateDefinition()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_StateDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Model#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model#getTimers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Timers();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Model#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Model#getSchedules()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Schedules();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.LightSwitchActuator <em>Light Switch Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Switch Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.LightSwitchActuator
	 * @generated
	 */
	EClass getLightSwitchActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Sensor#getSensorTypes <em>Sensor Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Types</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Sensor#getSensorTypes()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SensorTypes();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Actuator#getActuatorTypes <em>Actuator Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuator Types</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Actuator#getActuatorTypes()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_ActuatorTypes();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.MotionSensor <em>Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.MotionSensor
	 * @generated
	 */
	EClass getMotionSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.RainSensor <em>Rain Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rain Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.RainSensor
	 * @generated
	 */
	EClass getRainSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.TouchSensor <em>Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.TouchSensor
	 * @generated
	 */
	EClass getTouchSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.WindowActuator <em>Window Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.WindowActuator
	 * @generated
	 */
	EClass getWindowActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.HumidifierActuator <em>Humidifier Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidifier Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HumidifierActuator
	 * @generated
	 */
	EClass getHumidifierActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.AccessControl
	 * @generated
	 */
	EClass getAccessControl();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.AccessControl#getAccessControlSensors <em>Access Control Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Control Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.AccessControl#getAccessControlSensors()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_AccessControlSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.AccessControl#getAccessControlDoorLockActuator <em>Access Control Door Lock Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Control Door Lock Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.AccessControl#getAccessControlDoorLockActuator()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_AccessControlDoorLockActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.DoorActuator <em>Door Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.DoorActuator
	 * @generated
	 */
	EClass getDoorActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.RadiatorActuator <em>Radiator Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radiator Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.RadiatorActuator
	 * @generated
	 */
	EClass getRadiatorActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.SmokeSensor <em>Smoke Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smoke Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.SmokeSensor
	 * @generated
	 */
	EClass getSmokeSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Type</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ActuatorType
	 * @generated
	 */
	EClass getActuatorType();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.CO2Sensor <em>CO2 Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CO2 Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CO2Sensor
	 * @generated
	 */
	EClass getCO2Sensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.InfraredLightSensor <em>Infrared Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrared Light Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.InfraredLightSensor
	 * @generated
	 */
	EClass getInfraredLightSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HumiditySensor
	 * @generated
	 */
	EClass getHumiditySensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.AudioAlarmActuator <em>Audio Alarm Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Alarm Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.AudioAlarmActuator
	 * @generated
	 */
	EClass getAudioAlarmActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getDeclareSensor <em>Declare Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declare Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room#getDeclareSensor()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_DeclareSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getDeclareActuator <em>Declare Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declare Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room#getDeclareActuator()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_DeclareActuator();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room#getExtends()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room#getTimers()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Timers();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Policies</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room#getPolicies()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Policies();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getDuring <em>During</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>During</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Room#getDuring()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_During();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Floor#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Floor#getRooms()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Rooms();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getUsesActuators <em>Uses Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Actuators</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy#getUsesActuators()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_UsesActuators();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getSpecifiedBy <em>Specified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified By</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy#getSpecifiedBy()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_SpecifiedBy();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getDefineState <em>Define State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Define State</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy#getDefineState()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_DefineState();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getDuring <em>During</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>During</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy#getDuring()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_During();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getUsesRooms <em>Uses Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Rooms</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy#getUsesRooms()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_UsesRooms();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getUsesSensors <em>Uses Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy#getUsesSensors()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_UsesSensors();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.State#isValueState <em>Value State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value State</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.State#isValueState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_ValueState();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute list '{@link dk.itu.mdd.policyengine.PolicyEngine.Schedule#getWeekdays <em>Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weekdays</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Schedule#getWeekdays()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Weekdays();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.Schedule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Schedule#getFrom()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_From();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.Schedule#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Schedule#getTo()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_To();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.Time#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Time#getHours()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Hours();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.Time#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Time#getMinutes()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Minutes();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.If#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.If#getCond()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Cond();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.If#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elseif</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.If#getElseif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elseif();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.TimeExpression
	 * @generated
	 */
	EClass getTimeExpression();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.TimeExpression#getTimeAmount <em>Time Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Amount</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.TimeExpression#getTimeAmount()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EAttribute getTimeExpression_TimeAmount();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.mdd.policyengine.PolicyEngine.TimeExpression#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.TimeExpression#getTime()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EReference getTimeExpression_Time();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.ResetExpression <em>Reset Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ResetExpression
	 * @generated
	 */
	EClass getResetExpression();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.mdd.policyengine.PolicyEngine.ResetExpression#getReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ResetExpression#getReset()
	 * @see #getResetExpression()
	 * @generated
	 */
	EReference getResetExpression_Reset();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getLeftExpr <em>Left Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expr</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getLeftExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftExpr();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getRightExpr <em>Right Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expr</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getRightExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightExpr();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getExpr()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expr();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Type</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.SensorType
	 * @generated
	 */
	EClass getSensorType();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.ElectricalSwitchActuator <em>Electrical Switch Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Switch Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ElectricalSwitchActuator
	 * @generated
	 */
	EClass getElectricalSwitchActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.WaterValveActuator <em>Water Valve Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Valve Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.WaterValveActuator
	 * @generated
	 */
	EClass getWaterValveActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.GasValveActuator <em>Gas Valve Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gas Valve Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.GasValveActuator
	 * @generated
	 */
	EClass getGasValveActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.ComponentExpression <em>Component Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ComponentExpression
	 * @generated
	 */
	EClass getComponentExpression();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.mdd.policyengine.PolicyEngine.ComponentExpression#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ComponentExpression#getInstance()
	 * @see #getComponentExpression()
	 * @generated
	 */
	EReference getComponentExpression_Instance();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.StateExpression <em>State Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.StateExpression
	 * @generated
	 */
	EClass getStateExpression();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.mdd.policyengine.PolicyEngine.StateExpression#getDefineState <em>Define State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Define State</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.StateExpression#getDefineState()
	 * @see #getStateExpression()
	 * @generated
	 */
	EReference getStateExpression_DefineState();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.RoomExpression <em>Room Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.RoomExpression
	 * @generated
	 */
	EClass getRoomExpression();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.mdd.policyengine.PolicyEngine.RoomExpression#getRoomInstance <em>Room Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Instance</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.RoomExpression#getRoomInstance()
	 * @see #getRoomExpression()
	 * @generated
	 */
	EReference getRoomExpression_RoomInstance();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.SensorExpression <em>Sensor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.SensorExpression
	 * @generated
	 */
	EClass getSensorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.SensorExpression#getSen <em>Sen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sen</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.SensorExpression#getSen()
	 * @see #getSensorExpression()
	 * @generated
	 */
	EReference getSensorExpression_Sen();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorExpression <em>Actuator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Expression</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ActuatorExpression
	 * @generated
	 */
	EClass getActuatorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorExpression#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Act</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ActuatorExpression#getAct()
	 * @see #getActuatorExpression()
	 * @generated
	 */
	EReference getActuatorExpression_Act();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryMethod <em>Binary Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Method</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.BinaryMethod
	 * @generated
	 */
	EClass getBinaryMethod();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.BoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Value</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.BoolValue
	 * @generated
	 */
	EClass getBoolValue();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.WindowSensor <em>Window Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.WindowSensor
	 * @generated
	 */
	EClass getWindowSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.DoorSensor <em>Door Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.DoorSensor
	 * @generated
	 */
	EClass getDoorSensor();

	/**
	 * Returns the meta object for enum '{@link dk.itu.mdd.policyengine.PolicyEngine.Weekdays <em>Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weekdays</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Weekdays
	 * @generated
	 */
	EEnum getWeekdays();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolicyEngineFactory getPolicyEngineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__ACCESS_CONTROL = eINSTANCE.getBuilding_AccessControl();

		/**
		 * The meta object literal for the '<em><b>Floors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__FLOORS = eINSTANCE.getBuilding_Floors();

		/**
		 * The meta object literal for the '<em><b>Timers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__TIMERS = eINSTANCE.getBuilding_Timers();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ModelImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BUILDINGS = eINSTANCE.getModel_Buildings();

		/**
		 * The meta object literal for the '<em><b>Predefined Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PREDEFINED_ROOMS = eINSTANCE.getModel_PredefinedRooms();

		/**
		 * The meta object literal for the '<em><b>Policy Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__POLICY_DEFINITION = eINSTANCE.getModel_PolicyDefinition();

		/**
		 * The meta object literal for the '<em><b>State Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__STATE_DEFINITION = eINSTANCE.getModel_StateDefinition();

		/**
		 * The meta object literal for the '<em><b>Timers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TIMERS = eINSTANCE.getModel_Timers();

		/**
		 * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCHEDULES = eINSTANCE.getModel_Schedules();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.LightSwitchActuatorImpl <em>Light Switch Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.LightSwitchActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSwitchActuator()
		 * @generated
		 */
		EClass LIGHT_SWITCH_ACTUATOR = eINSTANCE.getLightSwitchActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSOR_TYPES = eINSTANCE.getSensor_SensorTypes();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Actuator Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ACTUATOR_TYPES = eINSTANCE.getActuator_ActuatorTypes();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.MotionSensorImpl <em>Motion Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.MotionSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getMotionSensor()
		 * @generated
		 */
		EClass MOTION_SENSOR = eINSTANCE.getMotionSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TemperatureSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RainSensorImpl <em>Rain Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RainSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRainSensor()
		 * @generated
		 */
		EClass RAIN_SENSOR = eINSTANCE.getRainSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TouchSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTouchSensor()
		 * @generated
		 */
		EClass TOUCH_SENSOR = eINSTANCE.getTouchSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.WindowActuatorImpl <em>Window Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.WindowActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWindowActuator()
		 * @generated
		 */
		EClass WINDOW_ACTUATOR = eINSTANCE.getWindowActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HumidifierActuatorImpl <em>Humidifier Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HumidifierActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHumidifierActuator()
		 * @generated
		 */
		EClass HUMIDIFIER_ACTUATOR = eINSTANCE.getHumidifierActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.LightSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.AccessControlImpl <em>Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.AccessControlImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getAccessControl()
		 * @generated
		 */
		EClass ACCESS_CONTROL = eINSTANCE.getAccessControl();

		/**
		 * The meta object literal for the '<em><b>Access Control Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__ACCESS_CONTROL_SENSORS = eINSTANCE.getAccessControl_AccessControlSensors();

		/**
		 * The meta object literal for the '<em><b>Access Control Door Lock Actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR = eINSTANCE.getAccessControl_AccessControlDoorLockActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.DoorActuatorImpl <em>Door Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.DoorActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getDoorActuator()
		 * @generated
		 */
		EClass DOOR_ACTUATOR = eINSTANCE.getDoorActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.NamedElementImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RadiatorActuatorImpl <em>Radiator Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RadiatorActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRadiatorActuator()
		 * @generated
		 */
		EClass RADIATOR_ACTUATOR = eINSTANCE.getRadiatorActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SmokeSensorImpl <em>Smoke Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SmokeSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSmokeSensor()
		 * @generated
		 */
		EClass SMOKE_SENSOR = eINSTANCE.getSmokeSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorTypeImpl <em>Actuator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorTypeImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorType()
		 * @generated
		 */
		EClass ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.CO2SensorImpl <em>CO2 Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.CO2SensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getCO2Sensor()
		 * @generated
		 */
		EClass CO2_SENSOR = eINSTANCE.getCO2Sensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.InfraredLightSensorImpl <em>Infrared Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.InfraredLightSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getInfraredLightSensor()
		 * @generated
		 */
		EClass INFRARED_LIGHT_SENSOR = eINSTANCE.getInfraredLightSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HumiditySensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHumiditySensor()
		 * @generated
		 */
		EClass HUMIDITY_SENSOR = eINSTANCE.getHumiditySensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.AudioAlarmActuatorImpl <em>Audio Alarm Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.AudioAlarmActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getAudioAlarmActuator()
		 * @generated
		 */
		EClass AUDIO_ALARM_ACTUATOR = eINSTANCE.getAudioAlarmActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Declare Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DECLARE_SENSOR = eINSTANCE.getRoom_DeclareSensor();

		/**
		 * The meta object literal for the '<em><b>Declare Actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DECLARE_ACTUATOR = eINSTANCE.getRoom_DeclareActuator();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__EXTENDS = eINSTANCE.getRoom_Extends();

		/**
		 * The meta object literal for the '<em><b>Timers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__TIMERS = eINSTANCE.getRoom_Timers();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__POLICIES = eINSTANCE.getRoom_Policies();

		/**
		 * The meta object literal for the '<em><b>During</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DURING = eINSTANCE.getRoom_During();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.FloorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__ROOMS = eINSTANCE.getFloor_Rooms();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Uses Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__USES_ACTUATORS = eINSTANCE.getPolicy_UsesActuators();

		/**
		 * The meta object literal for the '<em><b>Specified By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__SPECIFIED_BY = eINSTANCE.getPolicy_SpecifiedBy();

		/**
		 * The meta object literal for the '<em><b>Define State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__DEFINE_STATE = eINSTANCE.getPolicy_DefineState();

		/**
		 * The meta object literal for the '<em><b>During</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__DURING = eINSTANCE.getPolicy_During();

		/**
		 * The meta object literal for the '<em><b>Uses Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__USES_ROOMS = eINSTANCE.getPolicy_UsesRooms();

		/**
		 * The meta object literal for the '<em><b>Uses Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__USES_SENSORS = eINSTANCE.getPolicy_UsesSensors();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.StateImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Value State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__VALUE_STATE = eINSTANCE.getState_ValueState();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimerImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ScheduleImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Weekdays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__WEEKDAYS = eINSTANCE.getSchedule_Weekdays();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__FROM = eINSTANCE.getSchedule_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__TO = eINSTANCE.getSchedule_To();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimeImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__HOURS = eINSTANCE.getTime_Hours();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__MINUTES = eINSTANCE.getTime_Minutes();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.IfImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__COND = eINSTANCE.getIf_Cond();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSEIF = eINSTANCE.getIf_Elseif();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimeExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTimeExpression()
		 * @generated
		 */
		EClass TIME_EXPRESSION = eINSTANCE.getTimeExpression();

		/**
		 * The meta object literal for the '<em><b>Time Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EXPRESSION__TIME_AMOUNT = eINSTANCE.getTimeExpression_TimeAmount();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EXPRESSION__TIME = eINSTANCE.getTimeExpression_Time();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ResetExpressionImpl <em>Reset Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ResetExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getResetExpression()
		 * @generated
		 */
		EClass RESET_EXPRESSION = eINSTANCE.getResetExpression();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET_EXPRESSION__RESET = eINSTANCE.getResetExpression_Reset();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_EXPR = eINSTANCE.getBinaryExpression_LeftExpr();

		/**
		 * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_EXPR = eINSTANCE.getBinaryExpression_RightExpr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.UnaryExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getUnaryExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorTypeImpl <em>Sensor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorTypeImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorType()
		 * @generated
		 */
		EClass SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ElectricalSwitchActuatorImpl <em>Electrical Switch Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ElectricalSwitchActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getElectricalSwitchActuator()
		 * @generated
		 */
		EClass ELECTRICAL_SWITCH_ACTUATOR = eINSTANCE.getElectricalSwitchActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.WaterValveActuatorImpl <em>Water Valve Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.WaterValveActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWaterValveActuator()
		 * @generated
		 */
		EClass WATER_VALVE_ACTUATOR = eINSTANCE.getWaterValveActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.GasValveActuatorImpl <em>Gas Valve Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.GasValveActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getGasValveActuator()
		 * @generated
		 */
		EClass GAS_VALVE_ACTUATOR = eINSTANCE.getGasValveActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.Component <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.Component
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.StatementImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ComponentExpressionImpl <em>Component Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ComponentExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getComponentExpression()
		 * @generated
		 */
		EClass COMPONENT_EXPRESSION = eINSTANCE.getComponentExpression();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXPRESSION__INSTANCE = eINSTANCE.getComponentExpression_Instance();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StateExpressionImpl <em>State Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.StateExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getStateExpression()
		 * @generated
		 */
		EClass STATE_EXPRESSION = eINSTANCE.getStateExpression();

		/**
		 * The meta object literal for the '<em><b>Define State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_EXPRESSION__DEFINE_STATE = eINSTANCE.getStateExpression_DefineState();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomExpressionImpl <em>Room Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RoomExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRoomExpression()
		 * @generated
		 */
		EClass ROOM_EXPRESSION = eINSTANCE.getRoomExpression();

		/**
		 * The meta object literal for the '<em><b>Room Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EXPRESSION__ROOM_INSTANCE = eINSTANCE.getRoomExpression_RoomInstance();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ValueExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getValueExpression()
		 * @generated
		 */
		EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorExpressionImpl <em>Sensor Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorExpression()
		 * @generated
		 */
		EClass SENSOR_EXPRESSION = eINSTANCE.getSensorExpression();

		/**
		 * The meta object literal for the '<em><b>Sen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_EXPRESSION__SEN = eINSTANCE.getSensorExpression_Sen();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorExpressionImpl <em>Actuator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorExpressionImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorExpression()
		 * @generated
		 */
		EClass ACTUATOR_EXPRESSION = eINSTANCE.getActuatorExpression();

		/**
		 * The meta object literal for the '<em><b>Act</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_EXPRESSION__ACT = eINSTANCE.getActuatorExpression_Act();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryMethodImpl <em>Binary Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BinaryMethodImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBinaryMethod()
		 * @generated
		 */
		EClass BINARY_METHOD = eINSTANCE.getBinaryMethod();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BoolValueImpl <em>Bool Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.BoolValueImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getBoolValue()
		 * @generated
		 */
		EClass BOOL_VALUE = eINSTANCE.getBoolValue();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.IntValueImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getIntValue()
		 * @generated
		 */
		EClass INT_VALUE = eINSTANCE.getIntValue();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.WindowSensorImpl <em>Window Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.WindowSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWindowSensor()
		 * @generated
		 */
		EClass WINDOW_SENSOR = eINSTANCE.getWindowSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.DoorSensorImpl <em>Door Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.DoorSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getDoorSensor()
		 * @generated
		 */
		EClass DOOR_SENSOR = eINSTANCE.getDoorSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.Weekdays <em>Weekdays</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.Weekdays
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWeekdays()
		 * @generated
		 */
		EEnum WEEKDAYS = eINSTANCE.getWeekdays();

	}

} //PolicyEnginePackage
