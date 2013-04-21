/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine.impl;

import dk.itu.mdd.policyengine.expressions.PolicyEngine.AccessControl;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Actuator;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.ActuatorComponent;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmActuator;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmTimer;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Building;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.CO2Sensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.CalendarSystem;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Clause;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.DoorActuator;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Expression;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Floor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.HasActuators;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.HasIntegerValue;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.HasSensors;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.HumidifierActuator;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.HumiditySensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.If;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.InfraredLightSensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.LightSwitchActuator;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.MeetingScheduleSystem;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Model;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.MotionSensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.NamedElement;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEngineFactory;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.PressureSensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.RadiatorActuator;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Room;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Sensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.SensorComponent;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.SmokeSensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.State;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.TemperatureSensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Time;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Timer;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.TouchSensor;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.WindowActuator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioAlarmTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyExpressionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekdaysEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compOpsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorsEEnum = null;

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
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#eNS_URI
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
	public EReference getBuilding_Timers() {
		return (EReference)buildingEClass.getEStructuralFeatures().get(5);
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
	public EReference getModel_Timers() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Schedules() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
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
	public EReference getRoom_Timers() {
		return (EReference)roomEClass.getEStructuralFeatures().get(3);
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
	public EReference getFloor_Timers() {
		return (EReference)floorEClass.getEStructuralFeatures().get(1);
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
	public EReference getPolicy_UsesSensors() {
		return (EReference)policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_SpecifiedBy() {
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
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Weekdays() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_From() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_To() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Hours() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Minutes() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Cond() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Then() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Else() {
		return (EReference)ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompExpression() {
		return compExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompExpression_Expr() {
		return (EReference)compExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompExpression_Compare() {
		return (EAttribute)compExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompExpression_Constant() {
		return (EAttribute)compExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeExpression_Seconds() {
		return (EAttribute)timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Time() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetExpression() {
		return resetExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResetExpression_Reset() {
		return (EReference)resetExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioAlarmTimer() {
		return audioAlarmTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Sen() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Act() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyExpressions() {
		return manyExpressionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyExpressions_Expression() {
		return (EReference)manyExpressionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyExpressions_Operator() {
		return (EAttribute)manyExpressionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyExpressions_Manyexpr() {
		return (EReference)manyExpressionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeekdays() {
		return weekdaysEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompOps() {
		return compOpsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperators() {
		return operatorsEEnum;
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
		createEReference(buildingEClass, BUILDING__TIMERS);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__BUILDINGS);
		createEReference(modelEClass, MODEL__PREDEFINED_ROOMS);
		createEReference(modelEClass, MODEL__POLICY_DEFINITION);
		createEReference(modelEClass, MODEL__STATE_DEFINITION);
		createEReference(modelEClass, MODEL__TIMERS);
		createEReference(modelEClass, MODEL__SCHEDULES);

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
		createEReference(roomEClass, ROOM__TIMERS);

		floorEClass = createEClass(FLOOR);
		createEReference(floorEClass, FLOOR__ROOMS);
		createEReference(floorEClass, FLOOR__TIMERS);

		actuatorComponentEClass = createEClass(ACTUATOR_COMPONENT);

		policyEClass = createEClass(POLICY);
		createEReference(policyEClass, POLICY__USES);
		createEReference(policyEClass, POLICY__USES_SENSORS);
		createEReference(policyEClass, POLICY__SPECIFIED_BY);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__VALUE_STATE);

		timerEClass = createEClass(TIMER);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__WEEKDAYS);
		createEReference(scheduleEClass, SCHEDULE__FROM);
		createEReference(scheduleEClass, SCHEDULE__TO);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__HOURS);
		createEAttribute(timeEClass, TIME__MINUTES);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__COND);
		createEReference(ifEClass, IF__THEN);
		createEReference(ifEClass, IF__ELSE);

		compExpressionEClass = createEClass(COMP_EXPRESSION);
		createEReference(compExpressionEClass, COMP_EXPRESSION__EXPR);
		createEAttribute(compExpressionEClass, COMP_EXPRESSION__COMPARE);
		createEAttribute(compExpressionEClass, COMP_EXPRESSION__CONSTANT);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEAttribute(timeExpressionEClass, TIME_EXPRESSION__SECONDS);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__TIME);

		resetExpressionEClass = createEClass(RESET_EXPRESSION);
		createEReference(resetExpressionEClass, RESET_EXPRESSION__RESET);

		audioAlarmTimerEClass = createEClass(AUDIO_ALARM_TIMER);

		clauseEClass = createEClass(CLAUSE);
		createEReference(clauseEClass, CLAUSE__SEN);
		createEReference(clauseEClass, CLAUSE__ACT);

		expressionEClass = createEClass(EXPRESSION);

		manyExpressionsEClass = createEClass(MANY_EXPRESSIONS);
		createEReference(manyExpressionsEClass, MANY_EXPRESSIONS__EXPRESSION);
		createEAttribute(manyExpressionsEClass, MANY_EXPRESSIONS__OPERATOR);
		createEReference(manyExpressionsEClass, MANY_EXPRESSIONS__MANYEXPR);

		// Create enums
		weekdaysEEnum = createEEnum(WEEKDAYS);
		compOpsEEnum = createEEnum(COMP_OPS);
		operatorsEEnum = createEEnum(OPERATORS);
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
		timerEClass.getESuperTypes().add(this.getNamedElement());
		scheduleEClass.getESuperTypes().add(this.getNamedElement());
		ifEClass.getESuperTypes().add(this.getExpression());
		compExpressionEClass.getESuperTypes().add(this.getExpression());
		timeExpressionEClass.getESuperTypes().add(this.getExpression());
		resetExpressionEClass.getESuperTypes().add(this.getExpression());
		manyExpressionsEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(buildingEClass, Building.class, "Building", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilding_CtsSystem(), this.getCTS(), null, "ctsSystem", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_CalendarSystem(), this.getCalendarSystem(), null, "calendarSystem", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_MeetingScheduleSystem(), this.getMeetingScheduleSystem(), null, "meetingScheduleSystem", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_Floors(), this.getFloor(), null, "floors", null, 0, -1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_Timers(), this.getTimer(), null, "timers", null, 0, -1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Buildings(), this.getBuilding(), null, "buildings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_PredefinedRooms(), this.getRoom(), null, "predefinedRooms", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_PolicyDefinition(), this.getPolicy(), null, "policyDefinition", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_StateDefinition(), this.getState(), null, "stateDefinition", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Timers(), this.getTimer(), null, "timers", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(ctsEClass, dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS.class, "CTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCTS_TemperatureSensors(), this.getSensor(), null, "temperatureSensors", null, 0, -1, dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTS_CtsActuators(), this.getActuator(), null, "ctsActuators", null, 0, -1, dk.itu.mdd.policyengine.expressions.PolicyEngine.CTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getRoom_Timers(), this.getTimer(), null, "timers", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloor_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloor_Timers(), this.getTimer(), null, "timers", null, 0, -1, Floor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorComponentEClass, ActuatorComponent.class, "ActuatorComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicy_Uses(), this.getActuator(), null, "uses", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_UsesSensors(), this.getSensor(), null, "usesSensors", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_SpecifiedBy(), this.getIf(), null, "specifiedBy", null, 1, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_ValueState(), ecorePackage.getEBoolean(), "valueState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_Weekdays(), this.getWeekdays(), "weekdays", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_From(), this.getTime(), null, "from", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_To(), this.getTime(), null, "to", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Hours(), ecorePackage.getEShort(), "hours", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Minutes(), ecorePackage.getEShort(), "minutes", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Cond(), this.getExpression(), null, "cond", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Then(), this.getExpression(), null, "then", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Else(), this.getExpression(), null, "else", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compExpressionEClass, CompExpression.class, "CompExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompExpression_Expr(), this.getClause(), null, "expr", null, 1, 1, CompExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompExpression_Compare(), this.getCompOps(), "compare", null, 1, 1, CompExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompExpression_Constant(), ecorePackage.getEInt(), "constant", null, 1, 1, CompExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeExpression_Seconds(), ecorePackage.getEInt(), "seconds", null, 1, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeExpression_Time(), this.getAudioAlarmTimer(), null, "time", null, 1, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetExpressionEClass, ResetExpression.class, "ResetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResetExpression_Reset(), this.getAudioAlarmTimer(), null, "reset", null, 1, -1, ResetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioAlarmTimerEClass, AudioAlarmTimer.class, "AudioAlarmTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClause_Sen(), this.getSensor(), null, "sen", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_Act(), this.getActuator(), null, "act", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manyExpressionsEClass, ManyExpressions.class, "ManyExpressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManyExpressions_Expression(), this.getCompExpression(), null, "expression", null, 1, 1, ManyExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyExpressions_Operator(), this.getOperators(), "Operator", null, 0, 1, ManyExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyExpressions_Manyexpr(), this.getManyExpressions(), null, "manyexpr", null, 0, -1, ManyExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(weekdaysEEnum, Weekdays.class, "Weekdays");
		addEEnumLiteral(weekdaysEEnum, Weekdays.MONDAY);
		addEEnumLiteral(weekdaysEEnum, Weekdays.TUESDAY);
		addEEnumLiteral(weekdaysEEnum, Weekdays.WEDENSDAY);
		addEEnumLiteral(weekdaysEEnum, Weekdays.THURSDAY);
		addEEnumLiteral(weekdaysEEnum, Weekdays.FRIDAY);
		addEEnumLiteral(weekdaysEEnum, Weekdays.SATURDAY);
		addEEnumLiteral(weekdaysEEnum, Weekdays.SUNDAY);

		initEEnum(compOpsEEnum, CompOps.class, "CompOps");
		addEEnumLiteral(compOpsEEnum, CompOps.GREATER);
		addEEnumLiteral(compOpsEEnum, CompOps.GREATEROREQUAL);
		addEEnumLiteral(compOpsEEnum, CompOps.EQUAL);
		addEEnumLiteral(compOpsEEnum, CompOps.LESSOREQUAL);
		addEEnumLiteral(compOpsEEnum, CompOps.LESS);
		addEEnumLiteral(compOpsEEnum, CompOps.NOTEQUAL);

		initEEnum(operatorsEEnum, Operators.class, "Operators");
		addEEnumLiteral(operatorsEEnum, Operators.AND);
		addEEnumLiteral(operatorsEEnum, Operators.OR);
		addEEnumLiteral(operatorsEEnum, Operators.EQUAL);
		addEEnumLiteral(operatorsEEnum, Operators.NOTEQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //PolicyEnginePackageImpl
