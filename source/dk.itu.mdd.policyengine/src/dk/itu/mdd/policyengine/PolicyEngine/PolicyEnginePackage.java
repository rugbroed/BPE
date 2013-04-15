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
 *   <li>each operation of each class,</li>
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
	int NAMED_ELEMENT = 16;

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
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Cts System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__CTS_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ACCESS_CONTROL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calendar System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__CALENDAR_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meeting Schedule System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__MEETING_SCHEDULE_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__FLOORS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__TIMERS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HasIntegerValueImpl <em>Has Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HasIntegerValueImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHasIntegerValue()
	 * @generated
	 */
	int HAS_INTEGER_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_INTEGER_VALUE__VALUE_STATE = 0;

	/**
	 * The number of structural features of the '<em>Has Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_INTEGER_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_INTEGER_VALUE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__VALUE_STATE = HAS_INTEGER_VALUE__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = HAS_INTEGER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = HAS_INTEGER_VALUE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SWITCH_ACTUATOR__VALUE_STATE = ACTUATOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Light Switch Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SWITCH_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light Switch Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SWITCH_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALUE_STATE = HAS_INTEGER_VALUE__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = HAS_INTEGER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = HAS_INTEGER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HasSensorsImpl <em>Has Sensors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HasSensorsImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHasSensors()
	 * @generated
	 */
	int HAS_SENSORS = 21;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SENSORS__SENSORS = 0;

	/**
	 * The number of structural features of the '<em>Has Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SENSORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SENSORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorComponentImpl <em>Sensor Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorComponentImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorComponent()
	 * @generated
	 */
	int SENSOR_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_COMPONENT__SENSORS = HAS_SENSORS__SENSORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_COMPONENT__NAME = HAS_SENSORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_COMPONENT_FEATURE_COUNT = HAS_SENSORS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_COMPONENT_OPERATION_COUNT = HAS_SENSORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.MotionSensorImpl <em>Motion Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.MotionSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getMotionSensor()
	 * @generated
	 */
	int MOTION_SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Motion Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motion Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TemperatureSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTemperatureSensor()
	 * @generated
	 */
	int TEMPERATURE_SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PressureSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getPressureSensor()
	 * @generated
	 */
	int PRESSURE_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TouchSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTouchSensor()
	 * @generated
	 */
	int TOUCH_SENSOR = 9;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.WindowActuatorImpl <em>Window Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.WindowActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWindowActuator()
	 * @generated
	 */
	int WINDOW_ACTUATOR = 10;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_ACTUATOR__VALUE_STATE = ACTUATOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Window Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Window Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HumidifierActuatorImpl <em>Humidifier Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HumidifierActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHumidifierActuator()
	 * @generated
	 */
	int HUMIDIFIER_ACTUATOR = 11;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER_ACTUATOR__VALUE_STATE = ACTUATOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Humidifier Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Humidifier Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.LightSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 12;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.CTSImpl <em>CTS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.CTSImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getCTS()
	 * @generated
	 */
	int CTS = 13;

	/**
	 * The feature id for the '<em><b>Temperature Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTS__TEMPERATURE_SENSORS = 0;

	/**
	 * The feature id for the '<em><b>Cts Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTS__CTS_ACTUATORS = 1;

	/**
	 * The number of structural features of the '<em>CTS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CTS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.AccessControlImpl <em>Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.AccessControlImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getAccessControl()
	 * @generated
	 */
	int ACCESS_CONTROL = 14;

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
	 * The number of operations of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.DoorActuatorImpl <em>Door Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.DoorActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getDoorActuator()
	 * @generated
	 */
	int DOOR_ACTUATOR = 15;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_ACTUATOR__VALUE_STATE = ACTUATOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Door Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Door Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.CalendarSystemImpl <em>Calendar System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.CalendarSystemImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getCalendarSystem()
	 * @generated
	 */
	int CALENDAR_SYSTEM = 17;

	/**
	 * The number of structural features of the '<em>Calendar System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_SYSTEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Calendar System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.MeetingScheduleSystemImpl <em>Meeting Schedule System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.MeetingScheduleSystemImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getMeetingScheduleSystem()
	 * @generated
	 */
	int MEETING_SCHEDULE_SYSTEM = 18;

	/**
	 * The number of structural features of the '<em>Meeting Schedule System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_SCHEDULE_SYSTEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Meeting Schedule System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_SCHEDULE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RadiatorActuatorImpl <em>Radiator Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RadiatorActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRadiatorActuator()
	 * @generated
	 */
	int RADIATOR_ACTUATOR = 19;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTUATOR__VALUE_STATE = ACTUATOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Radiator Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Radiator Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SmokeSensorImpl <em>Smoke Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SmokeSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSmokeSensor()
	 * @generated
	 */
	int SMOKE_SENSOR = 20;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Smoke Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smoke Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOKE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HasActuatorsImpl <em>Has Actuators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HasActuatorsImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHasActuators()
	 * @generated
	 */
	int HAS_ACTUATORS = 22;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ACTUATORS__ACTUATORS = 0;

	/**
	 * The number of structural features of the '<em>Has Actuators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ACTUATORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Actuators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ACTUATORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.CO2SensorImpl <em>CO2 Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.CO2SensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getCO2Sensor()
	 * @generated
	 */
	int CO2_SENSOR = 23;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>CO2 Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CO2 Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.InfraredLightSensorImpl <em>Infrared Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.InfraredLightSensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getInfraredLightSensor()
	 * @generated
	 */
	int INFRARED_LIGHT_SENSOR = 24;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_LIGHT_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Infrared Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_LIGHT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrared Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_LIGHT_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HumiditySensorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHumiditySensor()
	 * @generated
	 */
	int HUMIDITY_SENSOR = 25;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR__VALUE_STATE = SENSOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Humidity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Humidity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.AudioAlarmActuatorImpl <em>Audio Alarm Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.AudioAlarmActuatorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getAudioAlarmActuator()
	 * @generated
	 */
	int AUDIO_ALARM_ACTUATOR = 26;

	/**
	 * The feature id for the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ALARM_ACTUATOR__VALUE_STATE = ACTUATOR__VALUE_STATE;

	/**
	 * The number of structural features of the '<em>Audio Alarm Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ALARM_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Audio Alarm Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ALARM_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.RoomImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 28;

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
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.FloorImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 29;

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
	 * The feature id for the '<em><b>Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__TIMERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorComponentImpl <em>Actuator Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorComponentImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorComponent()
	 * @generated
	 */
	int ACTUATOR_COMPONENT = 30;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_COMPONENT__ACTUATORS = HAS_ACTUATORS__ACTUATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_COMPONENT__NAME = HAS_ACTUATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_COMPONENT_FEATURE_COUNT = HAS_ACTUATORS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_COMPONENT_OPERATION_COUNT = HAS_ACTUATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__USES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specified By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__SPECIFIED_BY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__USES_SENSORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.StateImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getState()
	 * @generated
	 */
	int STATE = 32;

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
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ConditionsImpl <em>Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ConditionsImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getConditions()
	 * @generated
	 */
	int CONDITIONS = 33;

	/**
	 * The number of structural features of the '<em>Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimerImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 34;

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
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ScheduleImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 35;

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
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.TimeImpl
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 36;

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
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.PolicyEngine.Weekdays <em>Weekdays</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Weekdays
	 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getWeekdays()
	 * @generated
	 */
	int WEEKDAYS = 37;


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
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getCtsSystem <em>Cts System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cts System</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building#getCtsSystem()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_CtsSystem();

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
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getCalendarSystem <em>Calendar System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendar System</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building#getCalendarSystem()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_CalendarSystem();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getMeetingScheduleSystem <em>Meeting Schedule System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meeting Schedule System</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Building#getMeetingScheduleSystem()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_MeetingScheduleSystem();

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
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.SensorComponent <em>Sensor Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Component</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.SensorComponent
	 * @generated
	 */
	EClass getSensorComponent();

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
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

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
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.CTS <em>CTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTS</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CTS
	 * @generated
	 */
	EClass getCTS();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.CTS#getTemperatureSensors <em>Temperature Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temperature Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CTS#getTemperatureSensors()
	 * @see #getCTS()
	 * @generated
	 */
	EReference getCTS_TemperatureSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.CTS#getCtsActuators <em>Cts Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cts Actuators</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CTS#getCtsActuators()
	 * @see #getCTS()
	 * @generated
	 */
	EReference getCTS_CtsActuators();

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
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.CalendarSystem <em>Calendar System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar System</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.CalendarSystem
	 * @generated
	 */
	EClass getCalendarSystem();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.MeetingScheduleSystem <em>Meeting Schedule System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting Schedule System</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.MeetingScheduleSystem
	 * @generated
	 */
	EClass getMeetingScheduleSystem();

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
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.HasSensors <em>Has Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasSensors
	 * @generated
	 */
	EClass getHasSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.HasSensors#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasSensors#getSensors()
	 * @see #getHasSensors()
	 * @generated
	 */
	EReference getHasSensors_Sensors();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.HasActuators <em>Has Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Actuators</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasActuators
	 * @generated
	 */
	EClass getHasActuators();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.HasActuators#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasActuators#getActuators()
	 * @see #getHasActuators()
	 * @generated
	 */
	EReference getHasActuators_Actuators();

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
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue <em>Has Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Integer Value</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue
	 * @generated
	 */
	EClass getHasIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue#getValueState <em>Value State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value State</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue#getValueState()
	 * @see #getHasIntegerValue()
	 * @generated
	 */
	EAttribute getHasIntegerValue_ValueState();

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
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Floor#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Floor#getTimers()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Timers();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent <em>Actuator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Component</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent
	 * @generated
	 */
	EClass getActuatorComponent();

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
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Policy#getUses()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Uses();

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
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.PolicyEngine.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditions</em>'.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.Conditions
	 * @generated
	 */
	EClass getConditions();

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
	 *   <li>each operation of each class,</li>
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
		 * The meta object literal for the '<em><b>Cts System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__CTS_SYSTEM = eINSTANCE.getBuilding_CtsSystem();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__ACCESS_CONTROL = eINSTANCE.getBuilding_AccessControl();

		/**
		 * The meta object literal for the '<em><b>Calendar System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__CALENDAR_SYSTEM = eINSTANCE.getBuilding_CalendarSystem();

		/**
		 * The meta object literal for the '<em><b>Meeting Schedule System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__MEETING_SCHEDULE_SYSTEM = eINSTANCE.getBuilding_MeetingScheduleSystem();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.SensorComponentImpl <em>Sensor Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.SensorComponentImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorComponent()
		 * @generated
		 */
		EClass SENSOR_COMPONENT = eINSTANCE.getSensorComponent();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PressureSensorImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.CTSImpl <em>CTS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.CTSImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getCTS()
		 * @generated
		 */
		EClass CTS = eINSTANCE.getCTS();

		/**
		 * The meta object literal for the '<em><b>Temperature Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTS__TEMPERATURE_SENSORS = eINSTANCE.getCTS_TemperatureSensors();

		/**
		 * The meta object literal for the '<em><b>Cts Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTS__CTS_ACTUATORS = eINSTANCE.getCTS_CtsActuators();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.CalendarSystemImpl <em>Calendar System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.CalendarSystemImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getCalendarSystem()
		 * @generated
		 */
		EClass CALENDAR_SYSTEM = eINSTANCE.getCalendarSystem();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.MeetingScheduleSystemImpl <em>Meeting Schedule System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.MeetingScheduleSystemImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getMeetingScheduleSystem()
		 * @generated
		 */
		EClass MEETING_SCHEDULE_SYSTEM = eINSTANCE.getMeetingScheduleSystem();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HasSensorsImpl <em>Has Sensors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HasSensorsImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHasSensors()
		 * @generated
		 */
		EClass HAS_SENSORS = eINSTANCE.getHasSensors();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_SENSORS__SENSORS = eINSTANCE.getHasSensors_Sensors();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HasActuatorsImpl <em>Has Actuators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HasActuatorsImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHasActuators()
		 * @generated
		 */
		EClass HAS_ACTUATORS = eINSTANCE.getHasActuators();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_ACTUATORS__ACTUATORS = eINSTANCE.getHasActuators_Actuators();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.HasIntegerValueImpl <em>Has Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.HasIntegerValueImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getHasIntegerValue()
		 * @generated
		 */
		EClass HAS_INTEGER_VALUE = eINSTANCE.getHasIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_INTEGER_VALUE__VALUE_STATE = eINSTANCE.getHasIntegerValue_ValueState();

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
		 * The meta object literal for the '<em><b>Timers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__TIMERS = eINSTANCE.getFloor_Timers();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorComponentImpl <em>Actuator Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorComponentImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorComponent()
		 * @generated
		 */
		EClass ACTUATOR_COMPONENT = eINSTANCE.getActuatorComponent();

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
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__USES = eINSTANCE.getPolicy_Uses();

		/**
		 * The meta object literal for the '<em><b>Specified By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__SPECIFIED_BY = eINSTANCE.getPolicy_SpecifiedBy();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ConditionsImpl <em>Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.ConditionsImpl
		 * @see dk.itu.mdd.policyengine.PolicyEngine.impl.PolicyEnginePackageImpl#getConditions()
		 * @generated
		 */
		EClass CONDITIONS = eINSTANCE.getConditions();

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
