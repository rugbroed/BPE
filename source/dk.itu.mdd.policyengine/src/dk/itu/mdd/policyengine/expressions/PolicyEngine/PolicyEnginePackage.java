/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;

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
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEngineFactory
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
	String eNS_URI = "platform:/resource/dk.itu.mdd.policyengine/model/PolicyEngineWithExpressions.ecore";

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
	PolicyEnginePackage eINSTANCE = dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.NamedElementImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.BuildingImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getBuilding()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ModelImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getModel()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasIntegerValueImpl <em>Has Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasIntegerValueImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHasIntegerValue()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getActuator()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSwitchActuatorImpl <em>Light Switch Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSwitchActuatorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSwitchActuator()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasSensorsImpl <em>Has Sensors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasSensorsImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHasSensors()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorComponentImpl <em>Sensor Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorComponentImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorComponent()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MotionSensorImpl <em>Motion Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MotionSensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getMotionSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TemperatureSensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTemperatureSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PressureSensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getPressureSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TouchSensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTouchSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.WindowActuatorImpl <em>Window Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.WindowActuatorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getWindowActuator()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumidifierActuatorImpl <em>Humidifier Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumidifierActuatorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHumidifierActuator()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CTSImpl <em>CTS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CTSImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCTS()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AccessControlImpl <em>Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AccessControlImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getAccessControl()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.DoorActuatorImpl <em>Door Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.DoorActuatorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getDoorActuator()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CalendarSystemImpl <em>Calendar System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CalendarSystemImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCalendarSystem()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MeetingScheduleSystemImpl <em>Meeting Schedule System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MeetingScheduleSystemImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getMeetingScheduleSystem()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RadiatorActuatorImpl <em>Radiator Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RadiatorActuatorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getRadiatorActuator()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SmokeSensorImpl <em>Smoke Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SmokeSensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSmokeSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasActuatorsImpl <em>Has Actuators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasActuatorsImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHasActuators()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CO2SensorImpl <em>CO2 Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CO2SensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCO2Sensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.InfraredLightSensorImpl <em>Infrared Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.InfraredLightSensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getInfraredLightSensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumiditySensorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHumiditySensor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmActuatorImpl <em>Audio Alarm Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmActuatorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getAudioAlarmActuator()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RoomImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getRoom()
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
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.FloorImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getFloor()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorComponentImpl <em>Actuator Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorComponentImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorComponent()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getPolicy()
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
	 * The feature id for the '<em><b>Uses Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__USES_SENSORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specified By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__SPECIFIED_BY = NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.StateImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getState()
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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimerImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 33;

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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ScheduleImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 34;

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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 35;

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
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ExpressionImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 42;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.IfImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getIf()
	 * @generated
	 */
	int IF = 36;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CompExpressionImpl <em>Comp Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CompExpressionImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCompExpression()
	 * @generated
	 */
	int COMP_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_EXPRESSION__COMPARE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_EXPRESSION__CONSTANT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comp Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comp Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeExpressionImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTimeExpression()
	 * @generated
	 */
	int TIME_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__SECONDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
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
	 * The number of operations of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ResetExpressionImpl <em>Reset Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ResetExpressionImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getResetExpression()
	 * @generated
	 */
	int RESET_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' containment reference list.
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
	 * The number of operations of the '<em>Reset Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmTimerImpl <em>Audio Alarm Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmTimerImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getAudioAlarmTimer()
	 * @generated
	 */
	int AUDIO_ALARM_TIMER = 40;

	/**
	 * The number of structural features of the '<em>Audio Alarm Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ALARM_TIMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Audio Alarm Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ALARM_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ClauseImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 41;

	/**
	 * The feature id for the '<em><b>Sen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__SEN = 0;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__ACT = 1;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ManyExpressionsImpl <em>Many Expressions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ManyExpressionsImpl
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getManyExpressions()
	 * @generated
	 */
	int MANY_EXPRESSIONS = 43;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_EXPRESSIONS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_EXPRESSIONS__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manyexpr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_EXPRESSIONS__MANYEXPR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Many Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_EXPRESSIONS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Many Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_EXPRESSIONS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays <em>Weekdays</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getWeekdays()
	 * @generated
	 */
	int WEEKDAYS = 44;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps <em>Comp Ops</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCompOps()
	 * @generated
	 */
	int COMP_OPS = 45;

	/**
	 * The meta object id for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators <em>Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getOperators()
	 * @generated
	 */
	int OPERATORS = 46;


	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getCtsSystem <em>Cts System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cts System</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getCtsSystem()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_CtsSystem();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getAccessControl()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_AccessControl();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getCalendarSystem <em>Calendar System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendar System</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getCalendarSystem()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_CalendarSystem();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getMeetingScheduleSystem <em>Meeting Schedule System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meeting Schedule System</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getMeetingScheduleSystem()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_MeetingScheduleSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floors</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getFloors()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Floors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Building#getTimers()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Timers();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getBuildings()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Buildings();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getPredefinedRooms <em>Predefined Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefined Rooms</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getPredefinedRooms()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_PredefinedRooms();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getPolicyDefinition <em>Policy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Definition</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getPolicyDefinition()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_PolicyDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getStateDefinition <em>State Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Definition</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getStateDefinition()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_StateDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getTimers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Timers();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getSchedules()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Schedules();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSwitchActuator <em>Light Switch Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Switch Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSwitchActuator
	 * @generated
	 */
	EClass getLightSwitchActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.SensorComponent <em>Sensor Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Component</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.SensorComponent
	 * @generated
	 */
	EClass getSensorComponent();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.MotionSensor <em>Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.MotionSensor
	 * @generated
	 */
	EClass getMotionSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TouchSensor <em>Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TouchSensor
	 * @generated
	 */
	EClass getTouchSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.WindowActuator <em>Window Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.WindowActuator
	 * @generated
	 */
	EClass getWindowActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HumidifierActuator <em>Humidifier Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidifier Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HumidifierActuator
	 * @generated
	 */
	EClass getHumidifierActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS <em>CTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTS</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS
	 * @generated
	 */
	EClass getCTS();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS#getTemperatureSensors <em>Temperature Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temperature Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS#getTemperatureSensors()
	 * @see #getCTS()
	 * @generated
	 */
	EReference getCTS_TemperatureSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS#getCtsActuators <em>Cts Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cts Actuators</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS#getCtsActuators()
	 * @see #getCTS()
	 * @generated
	 */
	EReference getCTS_CtsActuators();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl
	 * @generated
	 */
	EClass getAccessControl();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl#getAccessControlSensors <em>Access Control Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Control Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl#getAccessControlSensors()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_AccessControlSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl#getAccessControlDoorLockActuator <em>Access Control Door Lock Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Control Door Lock Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl#getAccessControlDoorLockActuator()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_AccessControlDoorLockActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.DoorActuator <em>Door Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.DoorActuator
	 * @generated
	 */
	EClass getDoorActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CalendarSystem <em>Calendar System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar System</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CalendarSystem
	 * @generated
	 */
	EClass getCalendarSystem();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.MeetingScheduleSystem <em>Meeting Schedule System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting Schedule System</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.MeetingScheduleSystem
	 * @generated
	 */
	EClass getMeetingScheduleSystem();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.RadiatorActuator <em>Radiator Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radiator Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.RadiatorActuator
	 * @generated
	 */
	EClass getRadiatorActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.SmokeSensor <em>Smoke Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smoke Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.SmokeSensor
	 * @generated
	 */
	EClass getSmokeSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasSensors <em>Has Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasSensors
	 * @generated
	 */
	EClass getHasSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasSensors#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasSensors#getSensors()
	 * @see #getHasSensors()
	 * @generated
	 */
	EReference getHasSensors_Sensors();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasActuators <em>Has Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Actuators</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasActuators
	 * @generated
	 */
	EClass getHasActuators();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasActuators#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasActuators#getActuators()
	 * @see #getHasActuators()
	 * @generated
	 */
	EReference getHasActuators_Actuators();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CO2Sensor <em>CO2 Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CO2 Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CO2Sensor
	 * @generated
	 */
	EClass getCO2Sensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.InfraredLightSensor <em>Infrared Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrared Light Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.InfraredLightSensor
	 * @generated
	 */
	EClass getInfraredLightSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HumiditySensor
	 * @generated
	 */
	EClass getHumiditySensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmActuator <em>Audio Alarm Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Alarm Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmActuator
	 * @generated
	 */
	EClass getAudioAlarmActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasIntegerValue <em>Has Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Integer Value</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasIntegerValue
	 * @generated
	 */
	EClass getHasIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.HasIntegerValue#getValueState <em>Value State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value State</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.HasIntegerValue#getValueState()
	 * @see #getHasIntegerValue()
	 * @generated
	 */
	EAttribute getHasIntegerValue_ValueState();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getDeclareSensor <em>Declare Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declare Sensor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getDeclareSensor()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_DeclareSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getDeclareActuator <em>Declare Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declare Actuator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getDeclareActuator()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_DeclareActuator();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getExtends()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Room#getTimers()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Timers();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor#getRooms()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor#getTimers()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Timers();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ActuatorComponent <em>Actuator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Component</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ActuatorComponent
	 * @generated
	 */
	EClass getActuatorComponent();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy#getUses()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy#getUsesSensors <em>Uses Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Sensors</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy#getUsesSensors()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_UsesSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy#getSpecifiedBy <em>Specified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified By</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy#getSpecifiedBy()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_SpecifiedBy();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.State#isValueState <em>Value State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value State</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.State#isValueState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_ValueState();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule#getWeekdays <em>Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weekdays</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule#getWeekdays()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Weekdays();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule#getFrom()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_From();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule#getTo()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_To();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Time#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Time#getHours()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Hours();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Time#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Time#getMinutes()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Minutes();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getCond()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Cond();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression <em>Comp Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Expression</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression
	 * @generated
	 */
	EClass getCompExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getExpr()
	 * @see #getCompExpression()
	 * @generated
	 */
	EReference getCompExpression_Expr();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getCompare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compare</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getCompare()
	 * @see #getCompExpression()
	 * @generated
	 */
	EAttribute getCompExpression_Compare();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getConstant()
	 * @see #getCompExpression()
	 * @generated
	 */
	EAttribute getCompExpression_Constant();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Expression</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression
	 * @generated
	 */
	EClass getTimeExpression();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getSeconds()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EAttribute getTimeExpression_Seconds();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression#getTime()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EReference getTimeExpression_Time();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression <em>Reset Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Expression</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression
	 * @generated
	 */
	EClass getResetExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression#getReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reset</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression#getReset()
	 * @see #getResetExpression()
	 * @generated
	 */
	EReference getResetExpression_Reset();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmTimer <em>Audio Alarm Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Alarm Timer</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmTimer
	 * @generated
	 */
	EClass getAudioAlarmTimer();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getSen <em>Sen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sen</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getSen()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Sen();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Act</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause#getAct()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Act();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions <em>Many Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Expressions</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions
	 * @generated
	 */
	EClass getManyExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getExpression()
	 * @see #getManyExpressions()
	 * @generated
	 */
	EReference getManyExpressions_Expression();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getOperator()
	 * @see #getManyExpressions()
	 * @generated
	 */
	EAttribute getManyExpressions_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getManyexpr <em>Manyexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manyexpr</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getManyexpr()
	 * @see #getManyExpressions()
	 * @generated
	 */
	EReference getManyExpressions_Manyexpr();

	/**
	 * Returns the meta object for enum '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays <em>Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weekdays</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays
	 * @generated
	 */
	EEnum getWeekdays();

	/**
	 * Returns the meta object for enum '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps <em>Comp Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comp Ops</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps
	 * @generated
	 */
	EEnum getCompOps();

	/**
	 * Returns the meta object for enum '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operators</em>'.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators
	 * @generated
	 */
	EEnum getOperators();

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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.BuildingImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getBuilding()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ModelImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getModel()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSwitchActuatorImpl <em>Light Switch Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSwitchActuatorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSwitchActuator()
		 * @generated
		 */
		EClass LIGHT_SWITCH_ACTUATOR = eINSTANCE.getLightSwitchActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorComponentImpl <em>Sensor Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SensorComponentImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSensorComponent()
		 * @generated
		 */
		EClass SENSOR_COMPONENT = eINSTANCE.getSensorComponent();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MotionSensorImpl <em>Motion Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MotionSensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getMotionSensor()
		 * @generated
		 */
		EClass MOTION_SENSOR = eINSTANCE.getMotionSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TemperatureSensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PressureSensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TouchSensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTouchSensor()
		 * @generated
		 */
		EClass TOUCH_SENSOR = eINSTANCE.getTouchSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.WindowActuatorImpl <em>Window Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.WindowActuatorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getWindowActuator()
		 * @generated
		 */
		EClass WINDOW_ACTUATOR = eINSTANCE.getWindowActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumidifierActuatorImpl <em>Humidifier Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumidifierActuatorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHumidifierActuator()
		 * @generated
		 */
		EClass HUMIDIFIER_ACTUATOR = eINSTANCE.getHumidifierActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.LightSensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CTSImpl <em>CTS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CTSImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCTS()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AccessControlImpl <em>Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AccessControlImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getAccessControl()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.DoorActuatorImpl <em>Door Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.DoorActuatorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getDoorActuator()
		 * @generated
		 */
		EClass DOOR_ACTUATOR = eINSTANCE.getDoorActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.NamedElementImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CalendarSystemImpl <em>Calendar System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CalendarSystemImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCalendarSystem()
		 * @generated
		 */
		EClass CALENDAR_SYSTEM = eINSTANCE.getCalendarSystem();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MeetingScheduleSystemImpl <em>Meeting Schedule System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.MeetingScheduleSystemImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getMeetingScheduleSystem()
		 * @generated
		 */
		EClass MEETING_SCHEDULE_SYSTEM = eINSTANCE.getMeetingScheduleSystem();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RadiatorActuatorImpl <em>Radiator Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RadiatorActuatorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getRadiatorActuator()
		 * @generated
		 */
		EClass RADIATOR_ACTUATOR = eINSTANCE.getRadiatorActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SmokeSensorImpl <em>Smoke Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.SmokeSensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSmokeSensor()
		 * @generated
		 */
		EClass SMOKE_SENSOR = eINSTANCE.getSmokeSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasSensorsImpl <em>Has Sensors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasSensorsImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHasSensors()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasActuatorsImpl <em>Has Actuators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasActuatorsImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHasActuators()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CO2SensorImpl <em>CO2 Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CO2SensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCO2Sensor()
		 * @generated
		 */
		EClass CO2_SENSOR = eINSTANCE.getCO2Sensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.InfraredLightSensorImpl <em>Infrared Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.InfraredLightSensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getInfraredLightSensor()
		 * @generated
		 */
		EClass INFRARED_LIGHT_SENSOR = eINSTANCE.getInfraredLightSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HumiditySensorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHumiditySensor()
		 * @generated
		 */
		EClass HUMIDITY_SENSOR = eINSTANCE.getHumiditySensor();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmActuatorImpl <em>Audio Alarm Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmActuatorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getAudioAlarmActuator()
		 * @generated
		 */
		EClass AUDIO_ALARM_ACTUATOR = eINSTANCE.getAudioAlarmActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasIntegerValueImpl <em>Has Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.HasIntegerValueImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getHasIntegerValue()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.RoomImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getRoom()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.FloorImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getFloor()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorComponentImpl <em>Actuator Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ActuatorComponentImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getActuatorComponent()
		 * @generated
		 */
		EClass ACTUATOR_COMPONENT = eINSTANCE.getActuatorComponent();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getPolicy()
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
		 * The meta object literal for the '<em><b>Uses Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__USES_SENSORS = eINSTANCE.getPolicy_UsesSensors();

		/**
		 * The meta object literal for the '<em><b>Specified By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__SPECIFIED_BY = eINSTANCE.getPolicy_SpecifiedBy();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.StateImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getState()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimerImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ScheduleImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getSchedule()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTime()
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
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.IfImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getIf()
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
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CompExpressionImpl <em>Comp Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.CompExpressionImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCompExpression()
		 * @generated
		 */
		EClass COMP_EXPRESSION = eINSTANCE.getCompExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_EXPRESSION__EXPR = eINSTANCE.getCompExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_EXPRESSION__COMPARE = eINSTANCE.getCompExpression_Compare();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_EXPRESSION__CONSTANT = eINSTANCE.getCompExpression_Constant();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeExpressionImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getTimeExpression()
		 * @generated
		 */
		EClass TIME_EXPRESSION = eINSTANCE.getTimeExpression();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EXPRESSION__SECONDS = eINSTANCE.getTimeExpression_Seconds();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EXPRESSION__TIME = eINSTANCE.getTimeExpression_Time();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ResetExpressionImpl <em>Reset Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ResetExpressionImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getResetExpression()
		 * @generated
		 */
		EClass RESET_EXPRESSION = eINSTANCE.getResetExpression();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET_EXPRESSION__RESET = eINSTANCE.getResetExpression_Reset();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmTimerImpl <em>Audio Alarm Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.AudioAlarmTimerImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getAudioAlarmTimer()
		 * @generated
		 */
		EClass AUDIO_ALARM_TIMER = eINSTANCE.getAudioAlarmTimer();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ClauseImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Sen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__SEN = eINSTANCE.getClause_Sen();

		/**
		 * The meta object literal for the '<em><b>Act</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__ACT = eINSTANCE.getClause_Act();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ExpressionImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ManyExpressionsImpl <em>Many Expressions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ManyExpressionsImpl
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getManyExpressions()
		 * @generated
		 */
		EClass MANY_EXPRESSIONS = eINSTANCE.getManyExpressions();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_EXPRESSIONS__EXPRESSION = eINSTANCE.getManyExpressions_Expression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_EXPRESSIONS__OPERATOR = eINSTANCE.getManyExpressions_Operator();

		/**
		 * The meta object literal for the '<em><b>Manyexpr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_EXPRESSIONS__MANYEXPR = eINSTANCE.getManyExpressions_Manyexpr();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays <em>Weekdays</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getWeekdays()
		 * @generated
		 */
		EEnum WEEKDAYS = eINSTANCE.getWeekdays();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps <em>Comp Ops</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getCompOps()
		 * @generated
		 */
		EEnum COMP_OPS = eINSTANCE.getCompOps();

		/**
		 * The meta object literal for the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators <em>Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators
		 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.PolicyEnginePackageImpl#getOperators()
		 * @generated
		 */
		EEnum OPERATORS = eINSTANCE.getOperators();

	}

} //PolicyEnginePackage
