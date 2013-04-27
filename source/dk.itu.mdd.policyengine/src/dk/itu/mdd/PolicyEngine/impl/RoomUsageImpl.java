/**
 */
package dk.itu.mdd.PolicyEngine.impl;

import dk.itu.mdd.PolicyEngine.Actuator;
import dk.itu.mdd.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.PolicyEngine.RoomUsage;
import dk.itu.mdd.PolicyEngine.Sensor;
import dk.itu.mdd.PolicyEngine.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomUsageImpl#getSen <em>Sen</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomUsageImpl#getAct <em>Act</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.impl.RoomUsageImpl#getDefineState <em>Define State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomUsageImpl extends MinimalEObjectImpl.Container implements RoomUsage {
	/**
	 * The cached value of the '{@link #getSen() <em>Sen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSen()
	 * @generated
	 * @ordered
	 */
	protected Sensor sen;

	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected Actuator act;

	/**
	 * The cached value of the '{@link #getDefineState() <em>Define State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineState()
	 * @generated
	 * @ordered
	 */
	protected State defineState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.ROOM_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSen() {
		return sen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSen(Sensor newSen, NotificationChain msgs) {
		Sensor oldSen = sen;
		sen = newSen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ROOM_USAGE__SEN, oldSen, newSen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSen(Sensor newSen) {
		if (newSen != sen) {
			NotificationChain msgs = null;
			if (sen != null)
				msgs = ((InternalEObject)sen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.ROOM_USAGE__SEN, null, msgs);
			if (newSen != null)
				msgs = ((InternalEObject)newSen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.ROOM_USAGE__SEN, null, msgs);
			msgs = basicSetSen(newSen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ROOM_USAGE__SEN, newSen, newSen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getAct() {
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAct(Actuator newAct, NotificationChain msgs) {
		Actuator oldAct = act;
		act = newAct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ROOM_USAGE__ACT, oldAct, newAct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAct(Actuator newAct) {
		if (newAct != act) {
			NotificationChain msgs = null;
			if (act != null)
				msgs = ((InternalEObject)act).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.ROOM_USAGE__ACT, null, msgs);
			if (newAct != null)
				msgs = ((InternalEObject)newAct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.ROOM_USAGE__ACT, null, msgs);
			msgs = basicSetAct(newAct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ROOM_USAGE__ACT, newAct, newAct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDefineState() {
		if (defineState != null && defineState.eIsProxy()) {
			InternalEObject oldDefineState = (InternalEObject)defineState;
			defineState = (State)eResolveProxy(oldDefineState);
			if (defineState != oldDefineState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PolicyEnginePackage.ROOM_USAGE__DEFINE_STATE, oldDefineState, defineState));
			}
		}
		return defineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetDefineState() {
		return defineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefineState(State newDefineState) {
		State oldDefineState = defineState;
		defineState = newDefineState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ROOM_USAGE__DEFINE_STATE, oldDefineState, defineState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.ROOM_USAGE__SEN:
				return basicSetSen(null, msgs);
			case PolicyEnginePackage.ROOM_USAGE__ACT:
				return basicSetAct(null, msgs);
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
			case PolicyEnginePackage.ROOM_USAGE__SEN:
				return getSen();
			case PolicyEnginePackage.ROOM_USAGE__ACT:
				return getAct();
			case PolicyEnginePackage.ROOM_USAGE__DEFINE_STATE:
				if (resolve) return getDefineState();
				return basicGetDefineState();
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
			case PolicyEnginePackage.ROOM_USAGE__SEN:
				setSen((Sensor)newValue);
				return;
			case PolicyEnginePackage.ROOM_USAGE__ACT:
				setAct((Actuator)newValue);
				return;
			case PolicyEnginePackage.ROOM_USAGE__DEFINE_STATE:
				setDefineState((State)newValue);
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
			case PolicyEnginePackage.ROOM_USAGE__SEN:
				setSen((Sensor)null);
				return;
			case PolicyEnginePackage.ROOM_USAGE__ACT:
				setAct((Actuator)null);
				return;
			case PolicyEnginePackage.ROOM_USAGE__DEFINE_STATE:
				setDefineState((State)null);
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
			case PolicyEnginePackage.ROOM_USAGE__SEN:
				return sen != null;
			case PolicyEnginePackage.ROOM_USAGE__ACT:
				return act != null;
			case PolicyEnginePackage.ROOM_USAGE__DEFINE_STATE:
				return defineState != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomUsageImpl
