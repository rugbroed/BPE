/**
 */
package dk.itu.kben.building.impl;

import dk.itu.kben.building.AccessControl;
import dk.itu.kben.building.Actuator;
import dk.itu.kben.building.Alarm;
import dk.itu.kben.building.BikeTyreHolder;
import dk.itu.kben.building.Blinds;
import dk.itu.kben.building.BuildingFactory;
import dk.itu.kben.building.BuildingPackage;
import dk.itu.kben.building.Calendar;
import dk.itu.kben.building.CoffeeMachine;
import dk.itu.kben.building.Computer;
import dk.itu.kben.building.Construct;
import dk.itu.kben.building.DishWasher;
import dk.itu.kben.building.Door;
import dk.itu.kben.building.DoorHandle;
import dk.itu.kben.building.Heater;
import dk.itu.kben.building.HumanMotionSensor;
import dk.itu.kben.building.Identifiable;
import dk.itu.kben.building.KitchenTable;
import dk.itu.kben.building.Lamp;
import dk.itu.kben.building.LightSensor;
import dk.itu.kben.building.MeetingSchedule;
import dk.itu.kben.building.MobilePhone;
import dk.itu.kben.building.Model;
import dk.itu.kben.building.MotionSensor;
import dk.itu.kben.building.PetBottle;
import dk.itu.kben.building.Phone;
import dk.itu.kben.building.PressureSensor;
import dk.itu.kben.building.Printer;
import dk.itu.kben.building.Radio;
import dk.itu.kben.building.Room;
import dk.itu.kben.building.Sensor;
import dk.itu.kben.building.TemperatureSensor;
import dk.itu.kben.building.ToiletSeat;
import dk.itu.kben.building.Window;

import dk.itu.kben.building.identifiable;
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
public class BuildingPackageImpl extends EPackageImpl implements BuildingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorEClass = null;

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
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

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
	private EClass accessControlEClass = null;

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
	private EClass mobilePhoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

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
	private EClass humanMotionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bikeTyreHolderEClass = null;

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
	private EClass petBottleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coffeeMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitchenTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetingScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dishWasherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toiletSeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blindsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phoneEClass = null;

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
	private EClass heaterEClass = null;

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
	 * @see dk.itu.kben.building.BuildingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuildingPackageImpl() {
		super(eNS_URI, BuildingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BuildingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuildingPackage init() {
		if (isInited) return (BuildingPackage)EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI);

		// Obtain or create and register package
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuildingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBuildingPackage.createPackageContents();

		// Initialize created meta-data
		theBuildingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuildingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuildingPackage.eNS_URI, theBuildingPackage);
		return theBuildingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoor() {
		return doorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoor_Rooms() {
		return (EReference)doorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoor_DoorHandles() {
		return (EReference)doorEClass.getEStructuralFeatures().get(1);
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
	public EReference getRoom_Doors() {
		return (EReference)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Windows() {
		return (EReference)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstruct() {
		return constructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstruct_Rooms() {
		return (EReference)constructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstruct_Windows() {
		return (EReference)constructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstruct_Doors() {
		return (EReference)constructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstruct_Name() {
		return (EAttribute)constructEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstruct_DoorHandles() {
		return (EReference)constructEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoorHandle() {
		return doorHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoorHandle_Door() {
		return (EReference)doorHandleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Uuid() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
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
	public EReference getModel_Constructs() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
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
	public EClass getAccessControl() {
		return accessControlEClass;
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
	public EClass getMobilePhone() {
		return mobilePhoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarm() {
		return alarmEClass;
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
	public EClass getHumanMotionSensor() {
		return humanMotionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputer() {
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBikeTyreHolder() {
		return bikeTyreHolderEClass;
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
	public EClass getPetBottle() {
		return petBottleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoffeeMachine() {
		return coffeeMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendar() {
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKitchenTable() {
		return kitchenTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLamp() {
		return lampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeetingSchedule() {
		return meetingScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDishWasher() {
		return dishWasherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinter() {
		return printerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadio() {
		return radioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToiletSeat() {
		return toiletSeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMS() {
		return smsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlinds() {
		return blindsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhone() {
		return phoneEClass;
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
	public EClass getHeater() {
		return heaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingFactory getBuildingFactory() {
		return (BuildingFactory)getEFactoryInstance();
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
		doorEClass = createEClass(DOOR);
		createEReference(doorEClass, DOOR__ROOMS);
		createEReference(doorEClass, DOOR__DOOR_HANDLES);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__WINDOWS);
		createEReference(roomEClass, ROOM__DOORS);

		windowEClass = createEClass(WINDOW);

		constructEClass = createEClass(CONSTRUCT);
		createEReference(constructEClass, CONSTRUCT__ROOMS);
		createEReference(constructEClass, CONSTRUCT__WINDOWS);
		createEReference(constructEClass, CONSTRUCT__DOORS);
		createEAttribute(constructEClass, CONSTRUCT__NAME);
		createEReference(constructEClass, CONSTRUCT__DOOR_HANDLES);

		doorHandleEClass = createEClass(DOOR_HANDLE);
		createEReference(doorHandleEClass, DOOR_HANDLE__DOOR);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__UUID);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONSTRUCTS);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		accessControlEClass = createEClass(ACCESS_CONTROL);

		lightSensorEClass = createEClass(LIGHT_SENSOR);

		mobilePhoneEClass = createEClass(MOBILE_PHONE);

		alarmEClass = createEClass(ALARM);

		motionSensorEClass = createEClass(MOTION_SENSOR);

		humanMotionSensorEClass = createEClass(HUMAN_MOTION_SENSOR);

		computerEClass = createEClass(COMPUTER);

		bikeTyreHolderEClass = createEClass(BIKE_TYRE_HOLDER);

		pressureSensorEClass = createEClass(PRESSURE_SENSOR);

		petBottleEClass = createEClass(PET_BOTTLE);

		coffeeMachineEClass = createEClass(COFFEE_MACHINE);

		calendarEClass = createEClass(CALENDAR);

		kitchenTableEClass = createEClass(KITCHEN_TABLE);

		lampEClass = createEClass(LAMP);

		meetingScheduleEClass = createEClass(MEETING_SCHEDULE);

		dishWasherEClass = createEClass(DISH_WASHER);

		printerEClass = createEClass(PRINTER);

		radioEClass = createEClass(RADIO);

		toiletSeatEClass = createEClass(TOILET_SEAT);

		smsEClass = createEClass(SMS);

		blindsEClass = createEClass(BLINDS);

		phoneEClass = createEClass(PHONE);

		temperatureSensorEClass = createEClass(TEMPERATURE_SENSOR);

		heaterEClass = createEClass(HEATER);
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
		doorEClass.getESuperTypes().add(this.getIdentifiable());
		roomEClass.getESuperTypes().add(this.getIdentifiable());
		windowEClass.getESuperTypes().add(this.getIdentifiable());
		windowEClass.getESuperTypes().add(this.getActuator());
		constructEClass.getESuperTypes().add(this.getIdentifiable());
		doorHandleEClass.getESuperTypes().add(this.getIdentifiable());
		doorHandleEClass.getESuperTypes().add(this.getPressureSensor());
		accessControlEClass.getESuperTypes().add(this.getSensor());
		lightSensorEClass.getESuperTypes().add(this.getSensor());
		mobilePhoneEClass.getESuperTypes().add(this.getActuator());
		alarmEClass.getESuperTypes().add(this.getActuator());
		motionSensorEClass.getESuperTypes().add(this.getSensor());
		humanMotionSensorEClass.getESuperTypes().add(this.getMotionSensor());
		computerEClass.getESuperTypes().add(this.getSensor());
		computerEClass.getESuperTypes().add(this.getActuator());
		bikeTyreHolderEClass.getESuperTypes().add(this.getPressureSensor());
		pressureSensorEClass.getESuperTypes().add(this.getSensor());
		petBottleEClass.getESuperTypes().add(this.getSensor());
		petBottleEClass.getESuperTypes().add(this.getActuator());
		coffeeMachineEClass.getESuperTypes().add(this.getActuator());
		calendarEClass.getESuperTypes().add(this.getSensor());
		kitchenTableEClass.getESuperTypes().add(this.getPressureSensor());
		lampEClass.getESuperTypes().add(this.getActuator());
		meetingScheduleEClass.getESuperTypes().add(this.getSensor());
		dishWasherEClass.getESuperTypes().add(this.getSensor());
		dishWasherEClass.getESuperTypes().add(this.getActuator());
		printerEClass.getESuperTypes().add(this.getSensor());
		printerEClass.getESuperTypes().add(this.getActuator());
		radioEClass.getESuperTypes().add(this.getActuator());
		toiletSeatEClass.getESuperTypes().add(this.getActuator());
		smsEClass.getESuperTypes().add(this.getActuator());
		blindsEClass.getESuperTypes().add(this.getActuator());
		phoneEClass.getESuperTypes().add(this.getActuator());
		temperatureSensorEClass.getESuperTypes().add(this.getSensor());
		heaterEClass.getESuperTypes().add(this.getActuator());

		// Initialize classes and features; add operations and parameters
		initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoor_Rooms(), this.getRoom(), this.getRoom_Doors(), "rooms", null, 2, 2, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoor_DoorHandles(), this.getDoorHandle(), this.getDoorHandle_Door(), "doorHandles", null, 2, 2, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Windows(), this.getWindow(), null, "windows", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Doors(), this.getDoor(), this.getDoor_Rooms(), "doors", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructEClass, Construct.class, "Construct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstruct_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, Construct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstruct_Windows(), this.getWindow(), null, "windows", null, 0, -1, Construct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstruct_Doors(), this.getDoor(), null, "doors", null, 0, -1, Construct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstruct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Construct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstruct_DoorHandles(), this.getDoorHandle(), null, "doorHandles", null, 0, -1, Construct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorHandleEClass, DoorHandle.class, "DoorHandle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorHandle_Door(), this.getDoor(), this.getDoor_DoorHandles(), "door", null, 1, 1, DoorHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Uuid(), ecorePackage.getEString(), "uuid", "", 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Constructs(), this.getConstruct(), null, "constructs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessControlEClass, AccessControl.class, "AccessControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightSensorEClass, LightSensor.class, "LightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobilePhoneEClass, MobilePhone.class, "MobilePhone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alarmEClass, Alarm.class, "Alarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionSensorEClass, MotionSensor.class, "MotionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humanMotionSensorEClass, HumanMotionSensor.class, "HumanMotionSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bikeTyreHolderEClass, BikeTyreHolder.class, "BikeTyreHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressureSensorEClass, PressureSensor.class, "PressureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petBottleEClass, PetBottle.class, "PetBottle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coffeeMachineEClass, CoffeeMachine.class, "CoffeeMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kitchenTableEClass, KitchenTable.class, "KitchenTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lampEClass, Lamp.class, "Lamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meetingScheduleEClass, MeetingSchedule.class, "MeetingSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dishWasherEClass, DishWasher.class, "DishWasher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printerEClass, Printer.class, "Printer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioEClass, Radio.class, "Radio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toiletSeatEClass, ToiletSeat.class, "ToiletSeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smsEClass, dk.itu.kben.building.SMS.class, "SMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blindsEClass, Blinds.class, "Blinds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phoneEClass, Phone.class, "Phone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperatureSensorEClass, TemperatureSensor.class, "TemperatureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(heaterEClass, Heater.class, "Heater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BuildingPackageImpl
