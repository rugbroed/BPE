/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.Room;
import dk.itu.mdd.policyengine.PolicyEngine.RoomInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.RoomInstanceImpl#getRoomInstance <em>Room Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomInstanceImpl extends ExpressionImpl implements RoomInstance {
	/**
	 * The cached value of the '{@link #getRoomInstance() <em>Room Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomInstance()
	 * @generated
	 * @ordered
	 */
	protected Room roomInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.ROOM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoomInstance() {
		if (roomInstance != null && roomInstance.eIsProxy()) {
			InternalEObject oldRoomInstance = (InternalEObject)roomInstance;
			roomInstance = (Room)eResolveProxy(oldRoomInstance);
			if (roomInstance != oldRoomInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PolicyEnginePackage.ROOM_INSTANCE__ROOM_INSTANCE, oldRoomInstance, roomInstance));
			}
		}
		return roomInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoomInstance() {
		return roomInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomInstance(Room newRoomInstance) {
		Room oldRoomInstance = roomInstance;
		roomInstance = newRoomInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ROOM_INSTANCE__ROOM_INSTANCE, oldRoomInstance, roomInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolicyEnginePackage.ROOM_INSTANCE__ROOM_INSTANCE:
				if (resolve) return getRoomInstance();
				return basicGetRoomInstance();
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
			case PolicyEnginePackage.ROOM_INSTANCE__ROOM_INSTANCE:
				setRoomInstance((Room)newValue);
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
			case PolicyEnginePackage.ROOM_INSTANCE__ROOM_INSTANCE:
				setRoomInstance((Room)null);
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
			case PolicyEnginePackage.ROOM_INSTANCE__ROOM_INSTANCE:
				return roomInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomInstanceImpl
