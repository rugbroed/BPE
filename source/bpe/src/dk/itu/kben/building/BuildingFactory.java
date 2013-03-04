/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.kben.building.BuildingPackage
 * @generated
 */
public interface BuildingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildingFactory eINSTANCE = dk.itu.kben.building.impl.BuildingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door</em>'.
	 * @generated
	 */
	Door createDoor();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window</em>'.
	 * @generated
	 */
	Window createWindow();

	/**
	 * Returns a new object of class '<em>Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Construct</em>'.
	 * @generated
	 */
	Construct createConstruct();

	/**
	 * Returns a new object of class '<em>Door Handle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door Handle</em>'.
	 * @generated
	 */
	DoorHandle createDoorHandle();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control</em>'.
	 * @generated
	 */
	AccessControl createAccessControl();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>Mobile Phone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Phone</em>'.
	 * @generated
	 */
	MobilePhone createMobilePhone();

	/**
	 * Returns a new object of class '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm</em>'.
	 * @generated
	 */
	Alarm createAlarm();

	/**
	 * Returns a new object of class '<em>Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion Sensor</em>'.
	 * @generated
	 */
	MotionSensor createMotionSensor();

	/**
	 * Returns a new object of class '<em>Human Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Motion Sensor</em>'.
	 * @generated
	 */
	HumanMotionSensor createHumanMotionSensor();

	/**
	 * Returns a new object of class '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer</em>'.
	 * @generated
	 */
	Computer createComputer();

	/**
	 * Returns a new object of class '<em>Bike Tyre Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bike Tyre Holder</em>'.
	 * @generated
	 */
	BikeTyreHolder createBikeTyreHolder();

	/**
	 * Returns a new object of class '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor</em>'.
	 * @generated
	 */
	PressureSensor createPressureSensor();

	/**
	 * Returns a new object of class '<em>Pet Bottle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pet Bottle</em>'.
	 * @generated
	 */
	PetBottle createPetBottle();

	/**
	 * Returns a new object of class '<em>Coffee Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coffee Machine</em>'.
	 * @generated
	 */
	CoffeeMachine createCoffeeMachine();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	Calendar createCalendar();

	/**
	 * Returns a new object of class '<em>Kitchen Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitchen Table</em>'.
	 * @generated
	 */
	KitchenTable createKitchenTable();

	/**
	 * Returns a new object of class '<em>Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lamp</em>'.
	 * @generated
	 */
	Lamp createLamp();

	/**
	 * Returns a new object of class '<em>Meeting Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meeting Schedule</em>'.
	 * @generated
	 */
	MeetingSchedule createMeetingSchedule();

	/**
	 * Returns a new object of class '<em>Dish Washer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dish Washer</em>'.
	 * @generated
	 */
	DishWasher createDishWasher();

	/**
	 * Returns a new object of class '<em>Printer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Printer</em>'.
	 * @generated
	 */
	Printer createPrinter();

	/**
	 * Returns a new object of class '<em>Radio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio</em>'.
	 * @generated
	 */
	Radio createRadio();

	/**
	 * Returns a new object of class '<em>Toilet Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toilet Seat</em>'.
	 * @generated
	 */
	ToiletSeat createToiletSeat();

	/**
	 * Returns a new object of class '<em>SMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SMS</em>'.
	 * @generated
	 */
	SMS createSMS();

	/**
	 * Returns a new object of class '<em>Blinds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blinds</em>'.
	 * @generated
	 */
	Blinds createBlinds();

	/**
	 * Returns a new object of class '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phone</em>'.
	 * @generated
	 */
	Phone createPhone();

	/**
	 * Returns a new object of class '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Sensor</em>'.
	 * @generated
	 */
	TemperatureSensor createTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heater</em>'.
	 * @generated
	 */
	Heater createHeater();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuildingPackage getBuildingPackage();

} //BuildingFactory
