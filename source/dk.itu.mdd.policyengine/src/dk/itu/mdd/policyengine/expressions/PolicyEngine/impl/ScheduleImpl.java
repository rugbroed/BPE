/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine.impl;

import dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Time;
import dk.itu.mdd.policyengine.expressions.PolicyEngine.Weekdays;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ScheduleImpl#getWeekdays <em>Weekdays</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ScheduleImpl#getFrom <em>From</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.impl.ScheduleImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleImpl extends NamedElementImpl implements Schedule {
	/**
	 * The cached value of the '{@link #getWeekdays() <em>Weekdays</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekdays()
	 * @generated
	 * @ordered
	 */
	protected EList<Weekdays> weekdays;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Time from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Time to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Weekdays> getWeekdays() {
		if (weekdays == null) {
			weekdays = new EDataTypeUniqueEList<Weekdays>(Weekdays.class, this, PolicyEnginePackage.SCHEDULE__WEEKDAYS);
		}
		return weekdays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Time newFrom, NotificationChain msgs) {
		Time oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.SCHEDULE__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Time newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.SCHEDULE__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.SCHEDULE__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.SCHEDULE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Time newTo, NotificationChain msgs) {
		Time oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.SCHEDULE__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Time newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.SCHEDULE__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.SCHEDULE__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.SCHEDULE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.SCHEDULE__FROM:
				return basicSetFrom(null, msgs);
			case PolicyEnginePackage.SCHEDULE__TO:
				return basicSetTo(null, msgs);
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
			case PolicyEnginePackage.SCHEDULE__WEEKDAYS:
				return getWeekdays();
			case PolicyEnginePackage.SCHEDULE__FROM:
				return getFrom();
			case PolicyEnginePackage.SCHEDULE__TO:
				return getTo();
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
			case PolicyEnginePackage.SCHEDULE__WEEKDAYS:
				getWeekdays().clear();
				getWeekdays().addAll((Collection<? extends Weekdays>)newValue);
				return;
			case PolicyEnginePackage.SCHEDULE__FROM:
				setFrom((Time)newValue);
				return;
			case PolicyEnginePackage.SCHEDULE__TO:
				setTo((Time)newValue);
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
			case PolicyEnginePackage.SCHEDULE__WEEKDAYS:
				getWeekdays().clear();
				return;
			case PolicyEnginePackage.SCHEDULE__FROM:
				setFrom((Time)null);
				return;
			case PolicyEnginePackage.SCHEDULE__TO:
				setTo((Time)null);
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
			case PolicyEnginePackage.SCHEDULE__WEEKDAYS:
				return weekdays != null && !weekdays.isEmpty();
			case PolicyEnginePackage.SCHEDULE__FROM:
				return from != null;
			case PolicyEnginePackage.SCHEDULE__TO:
				return to != null;
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
		result.append(" (weekdays: ");
		result.append(weekdays);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl
