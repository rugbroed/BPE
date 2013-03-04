/**
 */
package dk.itu.kben.building.impl;

import dk.itu.kben.building.BuildingPackage;
import dk.itu.kben.building.Door;
import dk.itu.kben.building.DoorHandle;
import dk.itu.kben.building.Room;

import org.eclipse.emf.common.notify.Notification;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.kben.building.impl.DoorImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link dk.itu.kben.building.impl.DoorImpl#getDoorHandles <em>Door Handles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoorImpl extends IdentifiableImpl implements Door {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;
	/**
	 * The cached value of the '{@link #getDoorHandles() <em>Door Handles</em>}' reference list.
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
	protected DoorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.DOOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectWithInverseResolvingEList.ManyInverse<Room>(Room.class, this, BuildingPackage.DOOR__ROOMS, BuildingPackage.ROOM__DOORS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DoorHandle> getDoorHandles() {
		if (doorHandles == null) {
			doorHandles = new EObjectWithInverseResolvingEList<DoorHandle>(DoorHandle.class, this, BuildingPackage.DOOR__DOOR_HANDLES, BuildingPackage.DOOR_HANDLE__DOOR);
		}
		return doorHandles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.DOOR__ROOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRooms()).basicAdd(otherEnd, msgs);
			case BuildingPackage.DOOR__DOOR_HANDLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoorHandles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.DOOR__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case BuildingPackage.DOOR__DOOR_HANDLES:
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
			case BuildingPackage.DOOR__ROOMS:
				return getRooms();
			case BuildingPackage.DOOR__DOOR_HANDLES:
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
			case BuildingPackage.DOOR__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case BuildingPackage.DOOR__DOOR_HANDLES:
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
			case BuildingPackage.DOOR__ROOMS:
				getRooms().clear();
				return;
			case BuildingPackage.DOOR__DOOR_HANDLES:
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
			case BuildingPackage.DOOR__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case BuildingPackage.DOOR__DOOR_HANDLES:
				return doorHandles != null && !doorHandles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DoorImpl
