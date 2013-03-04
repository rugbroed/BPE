/**
 */
package dk.itu.kben.building.util;

import dk.itu.kben.building.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dk.itu.kben.building.BuildingPackage
 * @generated
 */
public class BuildingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BuildingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingSwitch() {
		if (modelPackage == null) {
			modelPackage = BuildingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BuildingPackage.DOOR: {
				Door door = (Door)theEObject;
				T result = caseDoor(door);
				if (result == null) result = caseIdentifiable(door);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = caseIdentifiable(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = caseIdentifiable(window);
				if (result == null) result = caseActuator(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.CONSTRUCT: {
				Construct construct = (Construct)theEObject;
				T result = caseConstruct(construct);
				if (result == null) result = caseIdentifiable(construct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.DOOR_HANDLE: {
				DoorHandle doorHandle = (DoorHandle)theEObject;
				T result = caseDoorHandle(doorHandle);
				if (result == null) result = caseIdentifiable(doorHandle);
				if (result == null) result = casePressureSensor(doorHandle);
				if (result == null) result = caseSensor(doorHandle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ACCESS_CONTROL: {
				AccessControl accessControl = (AccessControl)theEObject;
				T result = caseAccessControl(accessControl);
				if (result == null) result = caseSensor(accessControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.LIGHT_SENSOR: {
				LightSensor lightSensor = (LightSensor)theEObject;
				T result = caseLightSensor(lightSensor);
				if (result == null) result = caseSensor(lightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.MOBILE_PHONE: {
				MobilePhone mobilePhone = (MobilePhone)theEObject;
				T result = caseMobilePhone(mobilePhone);
				if (result == null) result = caseActuator(mobilePhone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ALARM: {
				Alarm alarm = (Alarm)theEObject;
				T result = caseAlarm(alarm);
				if (result == null) result = caseActuator(alarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.MOTION_SENSOR: {
				MotionSensor motionSensor = (MotionSensor)theEObject;
				T result = caseMotionSensor(motionSensor);
				if (result == null) result = caseSensor(motionSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.HUMAN_MOTION_SENSOR: {
				HumanMotionSensor humanMotionSensor = (HumanMotionSensor)theEObject;
				T result = caseHumanMotionSensor(humanMotionSensor);
				if (result == null) result = caseMotionSensor(humanMotionSensor);
				if (result == null) result = caseSensor(humanMotionSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.COMPUTER: {
				Computer computer = (Computer)theEObject;
				T result = caseComputer(computer);
				if (result == null) result = caseSensor(computer);
				if (result == null) result = caseActuator(computer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BIKE_TYRE_HOLDER: {
				BikeTyreHolder bikeTyreHolder = (BikeTyreHolder)theEObject;
				T result = caseBikeTyreHolder(bikeTyreHolder);
				if (result == null) result = casePressureSensor(bikeTyreHolder);
				if (result == null) result = caseSensor(bikeTyreHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.PRESSURE_SENSOR: {
				PressureSensor pressureSensor = (PressureSensor)theEObject;
				T result = casePressureSensor(pressureSensor);
				if (result == null) result = caseSensor(pressureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.PET_BOTTLE: {
				PetBottle petBottle = (PetBottle)theEObject;
				T result = casePetBottle(petBottle);
				if (result == null) result = caseSensor(petBottle);
				if (result == null) result = caseActuator(petBottle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.COFFEE_MACHINE: {
				CoffeeMachine coffeeMachine = (CoffeeMachine)theEObject;
				T result = caseCoffeeMachine(coffeeMachine);
				if (result == null) result = caseActuator(coffeeMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.CALENDAR: {
				Calendar calendar = (Calendar)theEObject;
				T result = caseCalendar(calendar);
				if (result == null) result = caseSensor(calendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.KITCHEN_TABLE: {
				KitchenTable kitchenTable = (KitchenTable)theEObject;
				T result = caseKitchenTable(kitchenTable);
				if (result == null) result = casePressureSensor(kitchenTable);
				if (result == null) result = caseSensor(kitchenTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.LAMP: {
				Lamp lamp = (Lamp)theEObject;
				T result = caseLamp(lamp);
				if (result == null) result = caseActuator(lamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.MEETING_SCHEDULE: {
				MeetingSchedule meetingSchedule = (MeetingSchedule)theEObject;
				T result = caseMeetingSchedule(meetingSchedule);
				if (result == null) result = caseSensor(meetingSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.DISH_WASHER: {
				DishWasher dishWasher = (DishWasher)theEObject;
				T result = caseDishWasher(dishWasher);
				if (result == null) result = caseSensor(dishWasher);
				if (result == null) result = caseActuator(dishWasher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.PRINTER: {
				Printer printer = (Printer)theEObject;
				T result = casePrinter(printer);
				if (result == null) result = caseSensor(printer);
				if (result == null) result = caseActuator(printer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.RADIO: {
				Radio radio = (Radio)theEObject;
				T result = caseRadio(radio);
				if (result == null) result = caseActuator(radio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.TOILET_SEAT: {
				ToiletSeat toiletSeat = (ToiletSeat)theEObject;
				T result = caseToiletSeat(toiletSeat);
				if (result == null) result = caseActuator(toiletSeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.SMS: {
				SMS sms = (SMS)theEObject;
				T result = caseSMS(sms);
				if (result == null) result = caseActuator(sms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BLINDS: {
				Blinds blinds = (Blinds)theEObject;
				T result = caseBlinds(blinds);
				if (result == null) result = caseActuator(blinds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.PHONE: {
				Phone phone = (Phone)theEObject;
				T result = casePhone(phone);
				if (result == null) result = caseActuator(phone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.TEMPERATURE_SENSOR: {
				TemperatureSensor temperatureSensor = (TemperatureSensor)theEObject;
				T result = caseTemperatureSensor(temperatureSensor);
				if (result == null) result = caseSensor(temperatureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.HEATER: {
				Heater heater = (Heater)theEObject;
				T result = caseHeater(heater);
				if (result == null) result = caseActuator(heater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoor(Door object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstruct(Construct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorHandle(DoorHandle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControl(AccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSensor(LightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobilePhone(MobilePhone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarm(Alarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motion Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotionSensor(MotionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Motion Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Motion Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanMotionSensor(HumanMotionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputer(Computer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bike Tyre Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bike Tyre Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBikeTyreHolder(BikeTyreHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensor(PressureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pet Bottle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pet Bottle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetBottle(PetBottle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coffee Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coffee Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoffeeMachine(CoffeeMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kitchen Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kitchen Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKitchenTable(KitchenTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLamp(Lamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meeting Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meeting Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeetingSchedule(MeetingSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dish Washer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dish Washer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDishWasher(DishWasher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Printer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Printer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrinter(Printer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadio(Radio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toilet Seat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toilet Seat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToiletSeat(ToiletSeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMS(SMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blinds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blinds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlinds(Blinds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhone(Phone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperatureSensor(TemperatureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeater(Heater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BuildingSwitch
