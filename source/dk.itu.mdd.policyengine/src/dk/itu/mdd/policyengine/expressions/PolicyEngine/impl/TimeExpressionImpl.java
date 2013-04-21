/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine.impl;

import dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmTimer;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.TimeExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeExpressionImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.TimeExpressionImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeExpressionImpl extends ExpressionImpl implements TimeExpression {
	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected int seconds = SECONDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected AudioAlarmTimer time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.TIME_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeconds(int newSeconds) {
		int oldSeconds = seconds;
		seconds = newSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.TIME_EXPRESSION__SECONDS, oldSeconds, seconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioAlarmTimer getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(AudioAlarmTimer newTime, NotificationChain msgs) {
		AudioAlarmTimer oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.TIME_EXPRESSION__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(AudioAlarmTimer newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.TIME_EXPRESSION__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.TIME_EXPRESSION__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.TIME_EXPRESSION__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.TIME_EXPRESSION__TIME:
				return basicSetTime(null, msgs);
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
			case PolicyEnginePackage.TIME_EXPRESSION__SECONDS:
				return getSeconds();
			case PolicyEnginePackage.TIME_EXPRESSION__TIME:
				return getTime();
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
			case PolicyEnginePackage.TIME_EXPRESSION__SECONDS:
				setSeconds((Integer)newValue);
				return;
			case PolicyEnginePackage.TIME_EXPRESSION__TIME:
				setTime((AudioAlarmTimer)newValue);
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
			case PolicyEnginePackage.TIME_EXPRESSION__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case PolicyEnginePackage.TIME_EXPRESSION__TIME:
				setTime((AudioAlarmTimer)null);
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
			case PolicyEnginePackage.TIME_EXPRESSION__SECONDS:
				return seconds != SECONDS_EDEFAULT;
			case PolicyEnginePackage.TIME_EXPRESSION__TIME:
				return time != null;
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
		result.append(" (seconds: ");
		result.append(seconds);
		result.append(')');
		return result.toString();
	}

} //TimeExpressionImpl
