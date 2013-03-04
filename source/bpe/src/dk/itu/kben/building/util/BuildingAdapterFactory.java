/**
 */
package dk.itu.kben.building.util;

import dk.itu.kben.building.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.kben.building.BuildingPackage
 * @generated
 */
public class BuildingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BuildingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BuildingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingSwitch<Adapter> modelSwitch =
		new BuildingSwitch<Adapter>() {
			@Override
			public Adapter caseDoor(Door object) {
				return createDoorAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseWindow(Window object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseConstruct(Construct object) {
				return createConstructAdapter();
			}
			@Override
			public Adapter caseDoorHandle(DoorHandle object) {
				return createDoorHandleAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseAccessControl(AccessControl object) {
				return createAccessControlAdapter();
			}
			@Override
			public Adapter caseLightSensor(LightSensor object) {
				return createLightSensorAdapter();
			}
			@Override
			public Adapter caseMobilePhone(MobilePhone object) {
				return createMobilePhoneAdapter();
			}
			@Override
			public Adapter caseAlarm(Alarm object) {
				return createAlarmAdapter();
			}
			@Override
			public Adapter caseMotionSensor(MotionSensor object) {
				return createMotionSensorAdapter();
			}
			@Override
			public Adapter caseHumanMotionSensor(HumanMotionSensor object) {
				return createHumanMotionSensorAdapter();
			}
			@Override
			public Adapter caseComputer(Computer object) {
				return createComputerAdapter();
			}
			@Override
			public Adapter caseBikeTyreHolder(BikeTyreHolder object) {
				return createBikeTyreHolderAdapter();
			}
			@Override
			public Adapter casePressureSensor(PressureSensor object) {
				return createPressureSensorAdapter();
			}
			@Override
			public Adapter casePetBottle(PetBottle object) {
				return createPetBottleAdapter();
			}
			@Override
			public Adapter caseCoffeeMachine(CoffeeMachine object) {
				return createCoffeeMachineAdapter();
			}
			@Override
			public Adapter caseCalendar(Calendar object) {
				return createCalendarAdapter();
			}
			@Override
			public Adapter caseKitchenTable(KitchenTable object) {
				return createKitchenTableAdapter();
			}
			@Override
			public Adapter caseLamp(Lamp object) {
				return createLampAdapter();
			}
			@Override
			public Adapter caseMeetingSchedule(MeetingSchedule object) {
				return createMeetingScheduleAdapter();
			}
			@Override
			public Adapter caseDishWasher(DishWasher object) {
				return createDishWasherAdapter();
			}
			@Override
			public Adapter casePrinter(Printer object) {
				return createPrinterAdapter();
			}
			@Override
			public Adapter caseRadio(Radio object) {
				return createRadioAdapter();
			}
			@Override
			public Adapter caseToiletSeat(ToiletSeat object) {
				return createToiletSeatAdapter();
			}
			@Override
			public Adapter caseSMS(SMS object) {
				return createSMSAdapter();
			}
			@Override
			public Adapter caseBlinds(Blinds object) {
				return createBlindsAdapter();
			}
			@Override
			public Adapter casePhone(Phone object) {
				return createPhoneAdapter();
			}
			@Override
			public Adapter caseTemperatureSensor(TemperatureSensor object) {
				return createTemperatureSensorAdapter();
			}
			@Override
			public Adapter caseHeater(Heater object) {
				return createHeaterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Construct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Construct
	 * @generated
	 */
	public Adapter createConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.DoorHandle <em>Door Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.DoorHandle
	 * @generated
	 */
	public Adapter createDoorHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.AccessControl
	 * @generated
	 */
	public Adapter createAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.MobilePhone <em>Mobile Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.MobilePhone
	 * @generated
	 */
	public Adapter createMobilePhoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Alarm
	 * @generated
	 */
	public Adapter createAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.MotionSensor <em>Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.MotionSensor
	 * @generated
	 */
	public Adapter createMotionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.HumanMotionSensor <em>Human Motion Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.HumanMotionSensor
	 * @generated
	 */
	public Adapter createHumanMotionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Computer
	 * @generated
	 */
	public Adapter createComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.BikeTyreHolder <em>Bike Tyre Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.BikeTyreHolder
	 * @generated
	 */
	public Adapter createBikeTyreHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.PressureSensor
	 * @generated
	 */
	public Adapter createPressureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.PetBottle <em>Pet Bottle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.PetBottle
	 * @generated
	 */
	public Adapter createPetBottleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.CoffeeMachine <em>Coffee Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.CoffeeMachine
	 * @generated
	 */
	public Adapter createCoffeeMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.KitchenTable <em>Kitchen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.KitchenTable
	 * @generated
	 */
	public Adapter createKitchenTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Lamp <em>Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Lamp
	 * @generated
	 */
	public Adapter createLampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.MeetingSchedule <em>Meeting Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.MeetingSchedule
	 * @generated
	 */
	public Adapter createMeetingScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.DishWasher <em>Dish Washer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.DishWasher
	 * @generated
	 */
	public Adapter createDishWasherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Printer <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Printer
	 * @generated
	 */
	public Adapter createPrinterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Radio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Radio
	 * @generated
	 */
	public Adapter createRadioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.ToiletSeat <em>Toilet Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.ToiletSeat
	 * @generated
	 */
	public Adapter createToiletSeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.SMS <em>SMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.SMS
	 * @generated
	 */
	public Adapter createSMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Blinds <em>Blinds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Blinds
	 * @generated
	 */
	public Adapter createBlindsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Phone
	 * @generated
	 */
	public Adapter createPhoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.TemperatureSensor
	 * @generated
	 */
	public Adapter createTemperatureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.itu.kben.building.Heater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.itu.kben.building.Heater
	 * @generated
	 */
	public Adapter createHeaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BuildingAdapterFactory
