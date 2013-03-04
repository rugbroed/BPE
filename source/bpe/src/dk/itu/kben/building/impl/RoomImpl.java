/**
 */
package dk.itu.kben.building.impl;

import dk.itu.kben.building.BuildingPackage;
import dk.itu.kben.building.Door;
import dk.itu.kben.building.Room;
import dk.itu.kben.building.Window;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.kben.building.impl.RoomImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link dk.itu.kben.building.impl.RoomImpl#getDoors <em>Doors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends IdentifiableImpl implements Room {
	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;

	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Door> getDoors() {
		if (doors == null) {
			doors = new EObjectWithInverseResolvingEList.ManyInverse<Door>(Door.class, this, BuildingPackage.ROOM__DOORS, BuildingPackage.DOOR__ROOMS);
		}
		return doors;
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
			case BuildingPackage.ROOM__DOORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoors()).basicAdd(otherEnd, msgs);
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
			case BuildingPackage.ROOM__DOORS:
				return ((InternalEList<?>)getDoors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectResolvingEList<Window>(Window.class, this, BuildingPackage.ROOM__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildingPackage.ROOM__WINDOWS:
				return getWindows();
			case BuildingPackage.ROOM__DOORS:
				return getDoors();
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
			case BuildingPackage.ROOM__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
				return;
			case BuildingPackage.ROOM__DOORS:
				getDoors().clear();
				getDoors().addAll((Collection<? extends Door>)newValue);
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
			case BuildingPackage.ROOM__WINDOWS:
				getWindows().clear();
				return;
			case BuildingPackage.ROOM__DOORS:
				getDoors().clear();
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
			case BuildingPackage.ROOM__WINDOWS:
				return windows != null && !windows.isEmpty();
			case BuildingPackage.ROOM__DOORS:
				return doors != null && !doors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
