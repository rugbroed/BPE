/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.ActuatorExpression;
import dk.itu.mdd.policyengine.PolicyEngine.ActuatorType;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.ActuatorExpressionImpl#getAct <em>Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActuatorExpressionImpl extends ExpressionImpl implements ActuatorExpression {
	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected ActuatorType act;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.ACTUATOR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType getAct() {
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAct(ActuatorType newAct, NotificationChain msgs) {
		ActuatorType oldAct = act;
		act = newAct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT, oldAct, newAct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAct(ActuatorType newAct) {
		if (newAct != act) {
			NotificationChain msgs = null;
			if (act != null)
				msgs = ((InternalEObject)act).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT, null, msgs);
			if (newAct != null)
				msgs = ((InternalEObject)newAct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT, null, msgs);
			msgs = basicSetAct(newAct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT, newAct, newAct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT:
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
			case PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT:
				return getAct();
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
			case PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT:
				setAct((ActuatorType)newValue);
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
			case PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT:
				setAct((ActuatorType)null);
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
			case PolicyEnginePackage.ACTUATOR_EXPRESSION__ACT:
				return act != null;
		}
		return super.eIsSet(featureID);
	}

} //ActuatorExpressionImpl
