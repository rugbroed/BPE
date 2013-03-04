/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dk.itu.kben.building.BuildingFactory
 * @model kind="package"
 * @generated
 */
public interface BuildingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "building";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://building/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "building";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildingPackage eINSTANCE = dk.itu.kben.building.impl.BuildingPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.IdentifiableImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__UUID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.DoorImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ROOMS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Door Handles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__DOOR_HANDLES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.RoomImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WINDOWS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DOORS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.WindowImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__UUID = IDENTIFIABLE__UUID;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.ConstructImpl <em>Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.ConstructImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getConstruct()
	 * @generated
	 */
	int CONSTRUCT = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__ROOMS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__WINDOWS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__DOORS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__NAME = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Door Handles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__DOOR_HANDLES = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.DoorHandleImpl <em>Door Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.DoorHandleImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getDoorHandle()
	 * @generated
	 */
	int DOOR_HANDLE = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_HANDLE__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_HANDLE__DOOR = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Door Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_HANDLE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.ModelImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 6;

	/**
	 * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONSTRUCTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link dk.itu.kben.building.Sensor <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.Sensor
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 7;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.Actuator <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.Actuator
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 8;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.AccessControlImpl <em>Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.AccessControlImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getAccessControl()
	 * @generated
	 */
	int ACCESS_CONTROL = 9;

	/**
	 * The number of structural features of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.LightSensorImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 10;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.MobilePhoneImpl <em>Mobile Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.MobilePhoneImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getMobilePhone()
	 * @generated
	 */
	int MOBILE_PHONE = 11;

	/**
	 * The number of structural features of the '<em>Mobile Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PHONE_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.AlarmImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 12;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.MotionSensorImpl <em>Motion Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.MotionSensorImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getMotionSensor()
	 * @generated
	 */
	int MOTION_SENSOR = 13;

	/**
	 * The number of structural features of the '<em>Motion Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.HumanMotionSensorImpl <em>Human Motion Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.HumanMotionSensorImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getHumanMotionSensor()
	 * @generated
	 */
	int HUMAN_MOTION_SENSOR = 14;

	/**
	 * The number of structural features of the '<em>Human Motion Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_MOTION_SENSOR_FEATURE_COUNT = MOTION_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.ComputerImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 15;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.PressureSensorImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPressureSensor()
	 * @generated
	 */
	int PRESSURE_SENSOR = 17;

	/**
	 * The number of structural features of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.BikeTyreHolderImpl <em>Bike Tyre Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.BikeTyreHolderImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getBikeTyreHolder()
	 * @generated
	 */
	int BIKE_TYRE_HOLDER = 16;

	/**
	 * The number of structural features of the '<em>Bike Tyre Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_TYRE_HOLDER_FEATURE_COUNT = PRESSURE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.PetBottleImpl <em>Pet Bottle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.PetBottleImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPetBottle()
	 * @generated
	 */
	int PET_BOTTLE = 18;

	/**
	 * The number of structural features of the '<em>Pet Bottle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_BOTTLE_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.CoffeeMachineImpl <em>Coffee Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.CoffeeMachineImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getCoffeeMachine()
	 * @generated
	 */
	int COFFEE_MACHINE = 19;

	/**
	 * The number of structural features of the '<em>Coffee Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.CalendarImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 20;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.KitchenTableImpl <em>Kitchen Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.KitchenTableImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getKitchenTable()
	 * @generated
	 */
	int KITCHEN_TABLE = 21;

	/**
	 * The number of structural features of the '<em>Kitchen Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TABLE_FEATURE_COUNT = PRESSURE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.LampImpl <em>Lamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.LampImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getLamp()
	 * @generated
	 */
	int LAMP = 22;

	/**
	 * The number of structural features of the '<em>Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.MeetingScheduleImpl <em>Meeting Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.MeetingScheduleImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getMeetingSchedule()
	 * @generated
	 */
	int MEETING_SCHEDULE = 23;

	/**
	 * The number of structural features of the '<em>Meeting Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_SCHEDULE_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.DishWasherImpl <em>Dish Washer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.DishWasherImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getDishWasher()
	 * @generated
	 */
	int DISH_WASHER = 24;

	/**
	 * The number of structural features of the '<em>Dish Washer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.PrinterImpl <em>Printer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.PrinterImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPrinter()
	 * @generated
	 */
	int PRINTER = 25;

	/**
	 * The number of structural features of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.RadioImpl <em>Radio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.RadioImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getRadio()
	 * @generated
	 */
	int RADIO = 26;

	/**
	 * The number of structural features of the '<em>Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.ToiletSeatImpl <em>Toilet Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.ToiletSeatImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getToiletSeat()
	 * @generated
	 */
	int TOILET_SEAT = 27;

	/**
	 * The number of structural features of the '<em>Toilet Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET_SEAT_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.SMSImpl <em>SMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.SMSImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getSMS()
	 * @generated
	 */
	int SMS = 28;

	/**
	 * The number of structural features of the '<em>SMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.BlindsImpl <em>Blinds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.BlindsImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getBlinds()
	 * @generated
	 */
	int BLINDS = 29;

	/**
	 * The number of structural features of the '<em>Blinds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINDS_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.PhoneImpl <em>Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.PhoneImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPhone()
	 * @generated
	 */
	int PHONE = 30;

	/**
	 * The number of structural features of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.TemperatureSensorImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getTemperatureSensor()
	 * @generated
	 */
	int TEMPERATURE_SENSOR = 31;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.kben.building.impl.HeaterImpl <em>Heater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.kben.building.impl.HeaterImpl
	 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getHeater()
	 * @generated
	 */
	int HEATER = 32;

	/**
	 * The number of structural features of the '<em>Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see dk.itu.kben.building.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.kben.building.Door#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see dk.itu.kben.building.Door#getRooms()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_Rooms();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.kben.building.Door#getDoorHandles <em>Door Handles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Door Handles</em>'.
	 * @see dk.itu.kben.building.Door#getDoorHandles()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_DoorHandles();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see dk.itu.kben.building.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.kben.building.Room#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doors</em>'.
	 * @see dk.itu.kben.building.Room#getDoors()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Doors();

	/**
	 * Returns the meta object for the reference list '{@link dk.itu.kben.building.Room#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Windows</em>'.
	 * @see dk.itu.kben.building.Room#getWindows()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Windows();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see dk.itu.kben.building.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Construct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct</em>'.
	 * @see dk.itu.kben.building.Construct
	 * @generated
	 */
	EClass getConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.kben.building.Construct#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see dk.itu.kben.building.Construct#getRooms()
	 * @see #getConstruct()
	 * @generated
	 */
	EReference getConstruct_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.kben.building.Construct#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see dk.itu.kben.building.Construct#getWindows()
	 * @see #getConstruct()
	 * @generated
	 */
	EReference getConstruct_Windows();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.kben.building.Construct#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doors</em>'.
	 * @see dk.itu.kben.building.Construct#getDoors()
	 * @see #getConstruct()
	 * @generated
	 */
	EReference getConstruct_Doors();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.kben.building.Construct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.itu.kben.building.Construct#getName()
	 * @see #getConstruct()
	 * @generated
	 */
	EAttribute getConstruct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.kben.building.Construct#getDoorHandles <em>Door Handles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Door Handles</em>'.
	 * @see dk.itu.kben.building.Construct#getDoorHandles()
	 * @see #getConstruct()
	 * @generated
	 */
	EReference getConstruct_DoorHandles();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.DoorHandle <em>Door Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Handle</em>'.
	 * @see dk.itu.kben.building.DoorHandle
	 * @generated
	 */
	EClass getDoorHandle();

	/**
	 * Returns the meta object for the reference '{@link dk.itu.kben.building.DoorHandle#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Door</em>'.
	 * @see dk.itu.kben.building.DoorHandle#getDoor()
	 * @see #getDoorHandle()
	 * @generated
	 */
	EReference getDoorHandle_Door();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see dk.itu.kben.building.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.kben.building.Identifiable#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dk.itu.kben.building.Identifiable#getUuid()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Uuid();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see dk.itu.kben.building.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.kben.building.Model#getConstructs <em>Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructs</em>'.
	 * @see dk.itu.kben.building.Model#getConstructs()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Constructs();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see dk.itu.kben.building.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see dk.itu.kben.building.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control</em>'.
	 * @see dk.itu.kben.building.AccessControl
	 * @generated
	 */
	EClass getAccessControl();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see dk.itu.kben.building.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.MobilePhone <em>Mobile Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Phone</em>'.
	 * @see dk.itu.kben.building.MobilePhone
	 * @generated
	 */
	EClass getMobilePhone();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see dk.itu.kben.building.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.MotionSensor <em>Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Sensor</em>'.
	 * @see dk.itu.kben.building.MotionSensor
	 * @generated
	 */
	EClass getMotionSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.HumanMotionSensor <em>Human Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Motion Sensor</em>'.
	 * @see dk.itu.kben.building.HumanMotionSensor
	 * @generated
	 */
	EClass getHumanMotionSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see dk.itu.kben.building.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.BikeTyreHolder <em>Bike Tyre Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bike Tyre Holder</em>'.
	 * @see dk.itu.kben.building.BikeTyreHolder
	 * @generated
	 */
	EClass getBikeTyreHolder();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see dk.itu.kben.building.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.PetBottle <em>Pet Bottle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pet Bottle</em>'.
	 * @see dk.itu.kben.building.PetBottle
	 * @generated
	 */
	EClass getPetBottle();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.CoffeeMachine <em>Coffee Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Machine</em>'.
	 * @see dk.itu.kben.building.CoffeeMachine
	 * @generated
	 */
	EClass getCoffeeMachine();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see dk.itu.kben.building.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.KitchenTable <em>Kitchen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen Table</em>'.
	 * @see dk.itu.kben.building.KitchenTable
	 * @generated
	 */
	EClass getKitchenTable();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Lamp <em>Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lamp</em>'.
	 * @see dk.itu.kben.building.Lamp
	 * @generated
	 */
	EClass getLamp();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.MeetingSchedule <em>Meeting Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting Schedule</em>'.
	 * @see dk.itu.kben.building.MeetingSchedule
	 * @generated
	 */
	EClass getMeetingSchedule();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.DishWasher <em>Dish Washer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dish Washer</em>'.
	 * @see dk.itu.kben.building.DishWasher
	 * @generated
	 */
	EClass getDishWasher();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Printer <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer</em>'.
	 * @see dk.itu.kben.building.Printer
	 * @generated
	 */
	EClass getPrinter();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Radio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio</em>'.
	 * @see dk.itu.kben.building.Radio
	 * @generated
	 */
	EClass getRadio();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.ToiletSeat <em>Toilet Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toilet Seat</em>'.
	 * @see dk.itu.kben.building.ToiletSeat
	 * @generated
	 */
	EClass getToiletSeat();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.SMS <em>SMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMS</em>'.
	 * @see dk.itu.kben.building.SMS
	 * @generated
	 */
	EClass getSMS();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Blinds <em>Blinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blinds</em>'.
	 * @see dk.itu.kben.building.Blinds
	 * @generated
	 */
	EClass getBlinds();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone</em>'.
	 * @see dk.itu.kben.building.Phone
	 * @generated
	 */
	EClass getPhone();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see dk.itu.kben.building.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link dk.itu.kben.building.Heater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heater</em>'.
	 * @see dk.itu.kben.building.Heater
	 * @generated
	 */
	EClass getHeater();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuildingFactory getBuildingFactory();

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
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.DoorImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__ROOMS = eINSTANCE.getDoor_Rooms();

		/**
		 * The meta object literal for the '<em><b>Door Handles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__DOOR_HANDLES = eINSTANCE.getDoor_DoorHandles();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.RoomImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Doors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DOORS = eINSTANCE.getRoom_Doors();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WINDOWS = eINSTANCE.getRoom_Windows();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.WindowImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.ConstructImpl <em>Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.ConstructImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getConstruct()
		 * @generated
		 */
		EClass CONSTRUCT = eINSTANCE.getConstruct();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCT__ROOMS = eINSTANCE.getConstruct_Rooms();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCT__WINDOWS = eINSTANCE.getConstruct_Windows();

		/**
		 * The meta object literal for the '<em><b>Doors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCT__DOORS = eINSTANCE.getConstruct_Doors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCT__NAME = eINSTANCE.getConstruct_Name();

		/**
		 * The meta object literal for the '<em><b>Door Handles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCT__DOOR_HANDLES = eINSTANCE.getConstruct_DoorHandles();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.DoorHandleImpl <em>Door Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.DoorHandleImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getDoorHandle()
		 * @generated
		 */
		EClass DOOR_HANDLE = eINSTANCE.getDoorHandle();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_HANDLE__DOOR = eINSTANCE.getDoorHandle_Door();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.IdentifiableImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__UUID = eINSTANCE.getIdentifiable_Uuid();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.ModelImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Constructs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONSTRUCTS = eINSTANCE.getModel_Constructs();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.Sensor <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.Sensor
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.Actuator <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.Actuator
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.AccessControlImpl <em>Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.AccessControlImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getAccessControl()
		 * @generated
		 */
		EClass ACCESS_CONTROL = eINSTANCE.getAccessControl();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.LightSensorImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.MobilePhoneImpl <em>Mobile Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.MobilePhoneImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getMobilePhone()
		 * @generated
		 */
		EClass MOBILE_PHONE = eINSTANCE.getMobilePhone();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.AlarmImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.MotionSensorImpl <em>Motion Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.MotionSensorImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getMotionSensor()
		 * @generated
		 */
		EClass MOTION_SENSOR = eINSTANCE.getMotionSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.HumanMotionSensorImpl <em>Human Motion Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.HumanMotionSensorImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getHumanMotionSensor()
		 * @generated
		 */
		EClass HUMAN_MOTION_SENSOR = eINSTANCE.getHumanMotionSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.ComputerImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.BikeTyreHolderImpl <em>Bike Tyre Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.BikeTyreHolderImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getBikeTyreHolder()
		 * @generated
		 */
		EClass BIKE_TYRE_HOLDER = eINSTANCE.getBikeTyreHolder();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.PressureSensorImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.PetBottleImpl <em>Pet Bottle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.PetBottleImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPetBottle()
		 * @generated
		 */
		EClass PET_BOTTLE = eINSTANCE.getPetBottle();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.CoffeeMachineImpl <em>Coffee Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.CoffeeMachineImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getCoffeeMachine()
		 * @generated
		 */
		EClass COFFEE_MACHINE = eINSTANCE.getCoffeeMachine();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.CalendarImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.KitchenTableImpl <em>Kitchen Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.KitchenTableImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getKitchenTable()
		 * @generated
		 */
		EClass KITCHEN_TABLE = eINSTANCE.getKitchenTable();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.LampImpl <em>Lamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.LampImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getLamp()
		 * @generated
		 */
		EClass LAMP = eINSTANCE.getLamp();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.MeetingScheduleImpl <em>Meeting Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.MeetingScheduleImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getMeetingSchedule()
		 * @generated
		 */
		EClass MEETING_SCHEDULE = eINSTANCE.getMeetingSchedule();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.DishWasherImpl <em>Dish Washer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.DishWasherImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getDishWasher()
		 * @generated
		 */
		EClass DISH_WASHER = eINSTANCE.getDishWasher();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.PrinterImpl <em>Printer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.PrinterImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPrinter()
		 * @generated
		 */
		EClass PRINTER = eINSTANCE.getPrinter();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.RadioImpl <em>Radio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.RadioImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getRadio()
		 * @generated
		 */
		EClass RADIO = eINSTANCE.getRadio();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.ToiletSeatImpl <em>Toilet Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.ToiletSeatImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getToiletSeat()
		 * @generated
		 */
		EClass TOILET_SEAT = eINSTANCE.getToiletSeat();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.SMSImpl <em>SMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.SMSImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getSMS()
		 * @generated
		 */
		EClass SMS = eINSTANCE.getSMS();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.BlindsImpl <em>Blinds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.BlindsImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getBlinds()
		 * @generated
		 */
		EClass BLINDS = eINSTANCE.getBlinds();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.PhoneImpl <em>Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.PhoneImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getPhone()
		 * @generated
		 */
		EClass PHONE = eINSTANCE.getPhone();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.TemperatureSensorImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link dk.itu.kben.building.impl.HeaterImpl <em>Heater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.kben.building.impl.HeaterImpl
		 * @see dk.itu.kben.building.impl.BuildingPackageImpl#getHeater()
		 * @generated
		 */
		EClass HEATER = eINSTANCE.getHeater();

	}

} //BuildingPackage
