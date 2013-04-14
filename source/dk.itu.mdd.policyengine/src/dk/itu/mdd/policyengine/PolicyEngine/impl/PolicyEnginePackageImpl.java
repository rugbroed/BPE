/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.AccessControl;
import dk.itu.mdd.policyengine.PolicyEngine.Actuator;
import dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent;
import dk.itu.mdd.policyengine.PolicyEngine.AudioAlarmActuator;
import dk.itu.mdd.policyengine.PolicyEngine.Building;
import dk.itu.mdd.policyengine.PolicyEngine.CO2Sensor;
import dk.itu.mdd.policyengine.PolicyEngine.CalendarSystem;
import dk.itu.mdd.policyengine.PolicyEngine.Conditions;
import dk.itu.mdd.policyengine.PolicyEngine.DoorActuator;
import dk.itu.mdd.policyengine.PolicyEngine.Floor;
import dk.itu.mdd.policyengine.PolicyEngine.HasActuators;
import dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue;
import dk.itu.mdd.policyengine.PolicyEngine.HasSensors;
import dk.itu.mdd.policyengine.PolicyEngine.HumidifierActuator;
import dk.itu.mdd.policyengine.PolicyEngine.HumiditySensor;
import dk.itu.mdd.policyengine.PolicyEngine.InfraredLightSensor;
import dk.itu.mdd.policyengine.PolicyEngine.LightSensor;
import dk.itu.mdd.policyengine.PolicyEngine.LightSwitchActuator;
import dk.itu.mdd.policyengine.PolicyEngine.MeetingScheduleSystem;
import dk.itu.mdd.policyengine.PolicyEngine.Model;
import dk.itu.mdd.policyengine.PolicyEngine.MotionSensor;
import dk.itu.mdd.policyengine.PolicyEngine.NamedElement;
import dk.itu.mdd.policyengine.PolicyEngine.Policy;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEngineFactory;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.PressureSensor;
import dk.itu.mdd.policyengine.PolicyEngine.RadiatorActuator;
import dk.itu.mdd.policyengine.PolicyEngine.Room;
import dk.itu.mdd.policyengine.PolicyEngine.Sensor;
import dk.itu.mdd.policyengine.PolicyEngine.SensorComponent;
import dk.itu.mdd.policyengine.PolicyEngine.SmokeSensor;
import dk.itu.mdd.policyengine.PolicyEngine.State;
import dk.itu.mdd.policyengine.PolicyEngine.TemperatureSensor;
import dk.itu.mdd.policyengine.PolicyEngine.TouchSensor;
import dk.itu.mdd.policyengine.PolicyEngine.WindowActuator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyEnginePackageImpl extends EPackageImpl implements PolicyEnginePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSwitchActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humidifierActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetingScheduleSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radiatorActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smokeSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasSensorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasActuatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass co2SensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infraredLightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioAlarmActuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolicyEnginePackageImpl() {
		super(eNS_URI, PolicyEngineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PolicyEnginePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolicyEnginePackage init() {
		if (isInited) return (PolicyEnginePackage)EPackage.Registry.INSTANCE.getEPackage(PolicyEnginePackage.eNS_URI);

		// Obtain or create and register package
		PolicyEnginePackageImpl thePolicyEnginePackage = (PolicyEnginePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolicyEnginePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolicyEnginePackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePolicyEnginePackage.createPackageContents();

		// Initialize created meta-data
		thePolicyEnginePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolicyEnginePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolicyEnginePackage.eNS_URI, thePolicyEnginePackage);
		return thePolicyEnginePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilding() {
		return buildingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilding_CtsSystem() {
		return (EReference)buildingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilding_AccessControl() {
		return (EReference)buildingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilding_CalendarSystem() {
		return (EReference)buildingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilding_MeetingScheduleSystem() {
		return (EReference)buildingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilding_Floors() {
		return (EReference)buildingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Buildings() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_PredefinedRooms() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_PolicyDefinition() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_StateDefinition() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSwitchActuator() {
		return lightSwitchActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorComponent() {
		return sensorComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionSensor() {
		return motionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperatureSensor() {
		return temperatureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensor() {
		return pressureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchSensor() {
		return touchSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindowActuator() {
		return windowActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumidifierActuator() {
		return humidifierActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSensor() {
		return lightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTS() {
		return ctsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTS_TemperatureSensors() {
		return (EReference)ctsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTS_CtsActuators() {
		return (EReference)ctsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControl() {
		return accessControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_AccessControlSensors() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_AccessControlDoorLockActuator() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoorActuator() {
		return doorActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarSystem() {
		return calendarSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeetingScheduleSystem() {
		return meetingScheduleSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadiatorActuator() {
		return radiatorActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmokeSensor() {
		return smokeSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasSensors() {
		return hasSensorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasSensors_Sensors() {
		return (EReference)hasSensorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasActuators() {
		return hasActuatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasActuators_Actuators() {
		return (EReference)hasActuatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCO2Sensor() {
		return co2SensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfraredLightSensor() {
		return infraredLightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumiditySensor() {
		return humiditySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioAlarmActuator() {
		return audioAlarmActuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasIntegerValue() {
		return hasIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasIntegerValue_ValueState() {
		return (EAttribute)hasIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_DeclareSensor() {
		return (EReference)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_DeclareActuator() {
		return (EReference)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Extends() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloor() {
		return floorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_Rooms() {
		return (EReference)floorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorComponent() {
		return actuatorComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_Uses() {
		return (EReference)policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_SpecifiedBy() {
		return (EReference)policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_UsesSensors() {
		return (EReference)policyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_ValueState() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditions() {
		return conditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEngineFactory getPolicyEngineFactory() {
		return (PolicyEngineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		buildingEClass = createEClass(BUILDING);
		createEReference(buildingEClass, BUILDING__CTS_SYSTEM);
		createEReference(buildingEClass, BUILDING__ACCESS_CONTROL);
		createEReference(buildingEClass, BUILDING__CALENDAR_SYSTEM);
		createEReference(buildingEClass, BUILDING__MEETING_SCHEDULE_SYSTEM);
		createEReference(buildingEClass, BUILDING__FLOORS);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__BUILDINGS);
		createEReference(modelEClass, MODEL__PREDEFINED_ROOMS);
		createEReference(modelEClass, MODEL__POLICY_DEFINITION);
		createEReference(modelEClass, MODEL__STATE_DEFINITION);

		lightSwitchActuatorEClass = createEClass(LIGHT_SWITCH_ACTUATOR);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		sensorComponentEClass = createEClass(SENSOR_COMPONENT);

		motionSensorEClass = createEClass(MOTION_SENSOR);

		temperatureSensorEClass = createEClass(TEMPERATURE_SENSOR);

		pressureSensorEClass = createEClass(PRESSURE_SENSOR);

		touchSensorEClass = createEClass(TOUCH_SENSOR);

		windowActuatorEClass = createEClass(WINDOW_ACTUATOR);

		humidifierActuatorEClass = createEClass(HUMIDIFIER_ACTUATOR);

		lightSensorEClass = createEClass(LIGHT_SENSOR);

		ctsEClass = createEClass(CTS);
		createEReference(ctsEClass, CTS__TEMPERATURE_SENSORS);
		createEReference(ctsEClass, CTS__CTS_ACTUATORS);

		accessControlEClass = createEClass(ACCESS_CONTROL);
		createEReference(accessControlEClass, ACCESS_CONTROL__ACCESS_CONTROL_SENSORS);
		createEReference(accessControlEClass, ACCESS_CONTROL__ACCESS_CONTROL_DOOR_LOCK_ACTUATOR);

		doorActuatorEClass = createEClass(DOOR_ACTUATOR);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		calendarSystemEClass = createEClass(CALENDAR_SYSTEM);

		meetingScheduleSystemEClass = createEClass(MEETING_SCHEDULE_SYSTEM);

		radiatorActuatorEClass = createEClass(RADIATOR_ACTUATOR);

		smokeSensorEClass = createEClass(SMOKE_SENSOR);

		hasSensorsEClass = createEClass(HAS_SENSORS);
		createEReference(hasSensorsEClass, HAS_SENSORS__SENSORS);

		hasActuatorsEClass = createEClass(HAS_ACTUATORS);
		createEReference(hasActuatorsEClass, HAS_ACTUATORS__ACTUATORS);

		co2SensorEClass = createEClass(CO2_SENSOR);

		infraredLightSensorEClass = createEClass(INFRARED_LIGHT_SENSOR);

		humiditySensorEClass = createEClass(HUMIDITY_SENSOR);

		audioAlarmActuatorEClass = createEClass(AUDIO_ALARM_ACTUATOR);

		hasIntegerValueEClass = createEClass(HAS_INTEGER_VALUE);
		createEAttribute(hasIntegerValueEClass, HAS_INTEGER_VALUE__VALUE_STATE);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__DECLARE_SENSOR);
		createEReference(roomEClass, ROOM__DECLARE_ACTUATOR);
		createEReference(roomEClass, ROOM__EXTENDS);

		floorEClass = createEClass(FLOOR);
		createEReference(floorEClass, FLOOR__ROOMS);

		actuatorComponentEClass = createEClass(ACTUATOR_COMPONENT);

		policyEClass = createEClass(POLICY);
		createEReference(policyEClass, POLICY__USES);
		createEReference(policyEClass, POLICY__SPECIFIED_BY);
		createEReference(policyEClass, POLICY__USES_SENSORS);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__VALUE_STATE);

		conditionsEClass = createEClass(CONDITIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		buildingEClass.getESuperTypes().add(this.getNamedElement());
		modelEClass.getESuperTypes().add(this.getNamedElement());
		lightSwitchActuatorEClass.getESuperTypes().add(this.getActuator());
		sensorEClass.getESuperTypes().add(this.getHasIntegerValue());
		actuatorEClass.getESuperTypes().add(this.getHasIntegerValue());
		sensorComponentEClass.getESuperTypes().add(this.getHasSensors());
		sensorComponentEClass.getESuperTypes().add(this.getNamedElement());
		motionSensorEClass.getESuperTypes().add(this.getSensor());
		temperatureSensorEClass.getESuperTypes().add(this.getSensor());
		pressureSensorEClass.getESuperTypes().add(this.getSensor());
		touchSensorEClass.getESuperTypes().add(this.getSensor());
		windowActuatorEClass.getESuperTypes().add(this.getActuator());
		humidifierActuatorEClass.getESuperTypes().add(this.getActuator());
		lightSensorEClass.getESuperTypes().add(this.getSensor());
		doorActuatorEClass.getESuperTypes().add(this.getActuator());
		radiatorActuatorEClass.getESuperTypes().add(this.getActuator());
		smokeSensorEClass.getESuperTypes().add(this.getSensor());
		co2SensorEClass.getESuperTypes().add(this.getSensor());
		infraredLightSensorEClass.getESuperTypes().add(this.getSensor());
		humiditySensorEClass.getESuperTypes().add(this.getSensor());
		audioAlarmActuatorEClass.getESuperTypes().add(this.getActuator());
		roomEClass.getESuperTypes().add(this.getNamedElement());
		floorEClass.getESuperTypes().add(this.getNamedElement());
		actuatorComponentEClass.getESuperTypes().add(this.getHasActuators());
		actuatorComponentEClass.getESuperTypes().add(this.getNamedElement());
		policyEClass.getESuperTypes().add(this.getNamedElement());
		stateEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(buildingEClass, Building.class, "Building", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilding_CtsSystem(), this.getCTS(), null, "ctsSystem", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_CalendarSystem(), this.getCalendarSystem(), null, "calendarSystem", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_MeetingScheduleSystem(), this.getMeetingScheduleSystem(), null, "meetingScheduleSystem", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_Floors(), this.getFloor(), null, "floors", null, 0, -1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Buildings(), this.getBuilding(), null, "buildings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_PredefinedRooms(), this.getRoom(), null, "predefinedRooms", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_PolicyDefinition(), this.getPolicy(), null, "policyDefinition", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_StateDefinition(), this.getState(), null, "stateDefinition", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightSwitchActuatorEClass, LightSwitchActuator.class, "LightSwitchActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorComponentEClass, SensorComponent.class, "SensorComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionSensorEClass, MotionSensor.class, "MotionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperatureSensorEClass, TemperatureSensor.class, "TemperatureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressureSensorEClass, PressureSensor.class, "PressureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchSensorEClass, TouchSensor.class, "TouchSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(windowActuatorEClass, WindowActuator.class, "WindowActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humidifierActuatorEClass, HumidifierActuator.class, "HumidifierActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightSensorEClass, LightSensor.class, "LightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctsEClass, dk.itu.mdd.policyengine.PolicyEngine.CTS.class, "CTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCTS_TemperatureSensors(), this.getSensor(), null, "temperatureSensors", null, 0, -1, dk.itu.mdd.policyengine.PolicyEngine.CTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTS_CtsActuators(), this.getActuator(), null, "ctsActuators", null, 0, -1, dk.itu.mdd.policyengine.PolicyEngine.CTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlEClass, AccessControl.class, "AccessControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControl_AccessControlSensors(), this.getSensor(), null, "accessControlSensors", null, 0, -1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControl_AccessControlDoorLockActuator(), this.getActuator(), null, "accessControlDoorLockActuator", null, 0, -1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorActuatorEClass, DoorActuator.class, "DoorActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarSystemEClass, CalendarSystem.class, "CalendarSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meetingScheduleSystemEClass, MeetingScheduleSystem.class, "MeetingScheduleSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radiatorActuatorEClass, RadiatorActuator.class, "RadiatorActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smokeSensorEClass, SmokeSensor.class, "SmokeSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hasSensorsEClass, HasSensors.class, "HasSensors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasSensors_Sensors(), this.getSensor(), null, "sensors", null, 0, -1, HasSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasActuatorsEClass, HasActuators.class, "HasActuators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasActuators_Actuators(), this.getActuator(), null, "actuators", null, 0, -1, HasActuators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(co2SensorEClass, CO2Sensor.class, "CO2Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infraredLightSensorEClass, InfraredLightSensor.class, "InfraredLightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditySensorEClass, HumiditySensor.class, "HumiditySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(audioAlarmActuatorEClass, AudioAlarmActuator.class, "AudioAlarmActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hasIntegerValueEClass, HasIntegerValue.class, "HasIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasIntegerValue_ValueState(), ecorePackage.getEInt(), "valueState", null, 0, 1, HasIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_DeclareSensor(), this.getSensorComponent(), null, "declareSensor", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_DeclareActuator(), this.getActuatorComponent(), null, "declareActuator", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Extends(), this.getRoom(), null, "extends", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloor_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorComponentEClass, ActuatorComponent.class, "ActuatorComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicy_Uses(), this.getActuator(), null, "uses", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_SpecifiedBy(), this.getConditions(), null, "specifiedBy", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_UsesSensors(), this.getSensor(), null, "usesSensors", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_ValueState(), ecorePackage.getEBoolean(), "valueState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionsEClass, Conditions.class, "Conditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PolicyEnginePackageImpl
