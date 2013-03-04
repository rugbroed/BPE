/**
 */
package dk.itu.kben.building.impl;

import dk.itu.kben.building.BuildingPackage;
import dk.itu.kben.building.Door;
import dk.itu.kben.building.DoorHandle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Handle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.kben.building.impl.DoorHandleImpl#getDoor <em>Door</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoorHandleImpl extends IdentifiableImpl implements DoorHandle {
	/**
	 * The cached value of the '{@link #getDoor() <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected Door door;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorHandleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.DOOR_HANDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getDoor() {
		if (door != null && door.eIsProxy()) {
			InternalEObject oldDoor = (InternalEObject)door;
			door = (Door)eResolveProxy(oldDoor);
			if (door != oldDoor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildingPackage.DOOR_HANDLE__DOOR, oldDoor, door));
			}
		}
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door basicGetDoor() {
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor(Door newDoor, NotificationChain msgs) {
		Door oldDoor = door;
		door = newDoor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.DOOR_HANDLE__DOOR, oldDoor, newDoor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(Door newDoor) {
		if (newDoor != door) {
			NotificationChain msgs = null;
			if (door != null)
				msgs = ((InternalEObject)door).eInverseRemove(this, BuildingPackage.DOOR__DOOR_HANDLES, Door.class, msgs);
			if (newDoor != null)
				msgs = ((InternalEObject)newDoor).eInverseAdd(this, BuildingPackage.DOOR__DOOR_HANDLES, Door.class, msgs);
			msgs = basicSetDoor(newDoor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.DOOR_HANDLE__DOOR, newDoor, newDoor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.DOOR_HANDLE__DOOR:
				if (door != null)
					msgs = ((InternalEObject)door).eInverseRemove(this, BuildingPackage.DOOR__DOOR_HANDLES, Door.class, msgs);
				return basicSetDoor((Door)otherEnd, msgs);
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
			case BuildingPackage.DOOR_HANDLE__DOOR:
				return basicSetDoor(null, msgs);
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
			case BuildingPackage.DOOR_HANDLE__DOOR:
				if (resolve) return getDoor();
				return basicGetDoor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuildingPackage.DOOR_HANDLE__DOOR:
				setDoor((Door)newValue);
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
			case BuildingPackage.DOOR_HANDLE__DOOR:
				setDoor((Door)null);
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
			case BuildingPackage.DOOR_HANDLE__DOOR:
				return door != null;
		}
		return super.eIsSet(featureID);
	}

} //DoorHandleImpl
