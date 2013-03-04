/**
 */
package dk.itu.kben.building.impl;

import dk.itu.kben.building.*;

import org.eclipse.emf.ecore.EClass;
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
public class BuildingFactoryImpl extends EFactoryImpl implements BuildingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuildingFactory init() {
		try {
			BuildingFactory theBuildingFactory = (BuildingFactory)EPackage.Registry.INSTANCE.getEFactory("http://building/1.0"); 
			if (theBuildingFactory != null) {
				return theBuildingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuildingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingFactoryImpl() {
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
			case BuildingPackage.DOOR: return createDoor();
			case BuildingPackage.ROOM: return createRoom();
			case BuildingPackage.WINDOW: return createWindow();
			case BuildingPackage.CONSTRUCT: return createConstruct();
			case BuildingPackage.DOOR_HANDLE: return createDoorHandle();
			case BuildingPackage.MODEL: return createModel();
			case BuildingPackage.ACCESS_CONTROL: return createAccessControl();
			case BuildingPackage.LIGHT_SENSOR: return createLightSensor();
			case BuildingPackage.MOBILE_PHONE: return createMobilePhone();
			case BuildingPackage.ALARM: return createAlarm();
			case BuildingPackage.MOTION_SENSOR: return createMotionSensor();
			case BuildingPackage.HUMAN_MOTION_SENSOR: return createHumanMotionSensor();
			case BuildingPackage.COMPUTER: return createComputer();
			case BuildingPackage.BIKE_TYRE_HOLDER: return createBikeTyreHolder();
			case BuildingPackage.PRESSURE_SENSOR: return createPressureSensor();
			case BuildingPackage.PET_BOTTLE: return createPetBottle();
			case BuildingPackage.COFFEE_MACHINE: return createCoffeeMachine();
			case BuildingPackage.CALENDAR: return createCalendar();
			case BuildingPackage.KITCHEN_TABLE: return createKitchenTable();
			case BuildingPackage.LAMP: return createLamp();
			case BuildingPackage.MEETING_SCHEDULE: return createMeetingSchedule();
			case BuildingPackage.DISH_WASHER: return createDishWasher();
			case BuildingPackage.PRINTER: return createPrinter();
			case BuildingPackage.RADIO: return createRadio();
			case BuildingPackage.TOILET_SEAT: return createToiletSeat();
			case BuildingPackage.SMS: return createSMS();
			case BuildingPackage.BLINDS: return createBlinds();
			case BuildingPackage.PHONE: return createPhone();
			case BuildingPackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case BuildingPackage.HEATER: return createHeater();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
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
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Construct createConstruct() {
		ConstructImpl construct = new ConstructImpl();
		return construct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorHandle createDoorHandle() {
		DoorHandleImpl doorHandle = new DoorHandleImpl();
		return doorHandle;
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
	public AccessControl createAccessControl() {
		AccessControlImpl accessControl = new AccessControlImpl();
		return accessControl;
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
	public MobilePhone createMobilePhone() {
		MobilePhoneImpl mobilePhone = new MobilePhoneImpl();
		return mobilePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alarm createAlarm() {
		AlarmImpl alarm = new AlarmImpl();
		return alarm;
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
	public HumanMotionSensor createHumanMotionSensor() {
		HumanMotionSensorImpl humanMotionSensor = new HumanMotionSensorImpl();
		return humanMotionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer createComputer() {
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeTyreHolder createBikeTyreHolder() {
		BikeTyreHolderImpl bikeTyreHolder = new BikeTyreHolderImpl();
		return bikeTyreHolder;
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
	public PetBottle createPetBottle() {
		PetBottleImpl petBottle = new PetBottleImpl();
		return petBottle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeMachine createCoffeeMachine() {
		CoffeeMachineImpl coffeeMachine = new CoffeeMachineImpl();
		return coffeeMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenTable createKitchenTable() {
		KitchenTableImpl kitchenTable = new KitchenTableImpl();
		return kitchenTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lamp createLamp() {
		LampImpl lamp = new LampImpl();
		return lamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetingSchedule createMeetingSchedule() {
		MeetingScheduleImpl meetingSchedule = new MeetingScheduleImpl();
		return meetingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DishWasher createDishWasher() {
		DishWasherImpl dishWasher = new DishWasherImpl();
		return dishWasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printer createPrinter() {
		PrinterImpl printer = new PrinterImpl();
		return printer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Radio createRadio() {
		RadioImpl radio = new RadioImpl();
		return radio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToiletSeat createToiletSeat() {
		ToiletSeatImpl toiletSeat = new ToiletSeatImpl();
		return toiletSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMS createSMS() {
		SMSImpl sms = new SMSImpl();
		return sms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blinds createBlinds() {
		BlindsImpl blinds = new BlindsImpl();
		return blinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phone createPhone() {
		PhoneImpl phone = new PhoneImpl();
		return phone;
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
	public Heater createHeater() {
		HeaterImpl heater = new HeaterImpl();
		return heater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingPackage getBuildingPackage() {
		return (BuildingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuildingPackage getPackage() {
		return BuildingPackage.eINSTANCE;
	}

} //BuildingFactoryImpl
