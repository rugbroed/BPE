/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.State;
import dk.itu.mdd.policyengine.PolicyEngine.StateInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.StateInstanceImpl#getDefineState <em>Define State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateInstanceImpl extends ExpressionImpl implements StateInstance {
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
	protected StateInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.STATE_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PolicyEnginePackage.STATE_INSTANCE__DEFINE_STATE, oldDefineState, defineState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.STATE_INSTANCE__DEFINE_STATE, oldDefineState, defineState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolicyEnginePackage.STATE_INSTANCE__DEFINE_STATE:
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
			case PolicyEnginePackage.STATE_INSTANCE__DEFINE_STATE:
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
			case PolicyEnginePackage.STATE_INSTANCE__DEFINE_STATE:
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
			case PolicyEnginePackage.STATE_INSTANCE__DEFINE_STATE:
				return defineState != null;
		}
		return super.eIsSet(featureID);
	}

} //StateInstanceImpl
