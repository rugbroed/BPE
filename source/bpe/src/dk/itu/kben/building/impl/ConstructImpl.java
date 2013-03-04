/**
 */
package dk.itu.kben.building.impl;

import dk.itu.kben.building.BuildingPackage;
import dk.itu.kben.building.Construct;
import dk.itu.kben.building.Door;
import dk.itu.kben.building.DoorHandle;
import dk.itu.kben.building.Room;

import dk.itu.kben.building.Window;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.kben.building.impl.ConstructImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link dk.itu.kben.building.impl.ConstructImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link dk.itu.kben.building.impl.ConstructImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link dk.itu.kben.building.impl.ConstructImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.kben.building.impl.ConstructImpl#getDoorHandles <em>Door Handles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructImpl extends IdentifiableImpl implements Construct {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;
	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoorHandles() <em>Door Handles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorHandles()
	 * @generated
	 * @ordered
	 */
	protected EList<DoorHandle> doorHandles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, BuildingPackage.CONSTRUCT__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentEList<Window>(Window.class, this, BuildingPackage.CONSTRUCT__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Door> getDoors() {
		if (doors == null) {
			doors = new EObjectContainmentEList<Door>(Door.class, this, BuildingPackage.CONSTRUCT__DOORS);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.CONSTRUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DoorHandle> getDoorHandles() {
		if (doorHandles == null) {
			doorHandles = new EObjectContainmentEList<DoorHandle>(DoorHandle.class, this, BuildingPackage.CONSTRUCT__DOOR_HANDLES);
		}
		return doorHandles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.CONSTRUCT__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case BuildingPackage.CONSTRUCT__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
			case BuildingPackage.CONSTRUCT__DOORS:
				return ((InternalEList<?>)getDoors()).basicRemove(otherEnd, msgs);
			case BuildingPackage.CONSTRUCT__DOOR_HANDLES:
				return ((InternalEList<?>)getDoorHandles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildingPackage.CONSTRUCT__ROOMS:
				return getRooms();
			case BuildingPackage.CONSTRUCT__WINDOWS:
				return getWindows();
			case BuildingPackage.CONSTRUCT__DOORS:
				return getDoors();
			case BuildingPackage.CONSTRUCT__NAME:
				return getName();
			case BuildingPackage.CONSTRUCT__DOOR_HANDLES:
				return getDoorHandles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuildingPackage.CONSTRUCT__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case BuildingPackage.CONSTRUCT__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
				return;
			case BuildingPackage.CONSTRUCT__DOORS:
				getDoors().clear();
				getDoors().addAll((Collection<? extends Door>)newValue);
				return;
			case BuildingPackage.CONSTRUCT__NAME:
				setName((String)newValue);
				return;
			case BuildingPackage.CONSTRUCT__DOOR_HANDLES:
				getDoorHandles().clear();
				getDoorHandles().addAll((Collection<? extends DoorHandle>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuildingPackage.CONSTRUCT__ROOMS:
				getRooms().clear();
				return;
			case BuildingPackage.CONSTRUCT__WINDOWS:
				getWindows().clear();
				return;
			case BuildingPackage.CONSTRUCT__DOORS:
				getDoors().clear();
				return;
			case BuildingPackage.CONSTRUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BuildingPackage.CONSTRUCT__DOOR_HANDLES:
				getDoorHandles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuildingPackage.CONSTRUCT__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case BuildingPackage.CONSTRUCT__WINDOWS:
				return windows != null && !windows.isEmpty();
			case BuildingPackage.CONSTRUCT__DOORS:
				return doors != null && !doors.isEmpty();
			case BuildingPackage.CONSTRUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BuildingPackage.CONSTRUCT__DOOR_HANDLES:
				return doorHandles != null && !doorHandles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConstructImpl
