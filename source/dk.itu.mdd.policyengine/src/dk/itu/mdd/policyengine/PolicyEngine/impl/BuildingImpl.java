/**
 */
package dk.itu.mdd.policyengine.PolicyEngine.impl;

import dk.itu.mdd.policyengine.PolicyEngine.AccessControl;
import dk.itu.mdd.policyengine.PolicyEngine.Building;
import dk.itu.mdd.policyengine.PolicyEngine.CTS;
import dk.itu.mdd.policyengine.PolicyEngine.CalendarSystem;
import dk.itu.mdd.policyengine.PolicyEngine.Floor;
import dk.itu.mdd.policyengine.PolicyEngine.MeetingScheduleSystem;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;

import dk.itu.mdd.policyengine.PolicyEngine.Timer;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl#getCtsSystem <em>Cts System</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl#getCalendarSystem <em>Calendar System</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl#getMeetingScheduleSystem <em>Meeting Schedule System</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl#getFloors <em>Floors</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.impl.BuildingImpl#getTimers <em>Timers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingImpl extends NamedElementImpl implements Building {
	/**
	 * The cached value of the '{@link #getCtsSystem() <em>Cts System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtsSystem()
	 * @generated
	 * @ordered
	 */
	protected CTS ctsSystem;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected AccessControl accessControl;

	/**
	 * The cached value of the '{@link #getCalendarSystem() <em>Calendar System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarSystem()
	 * @generated
	 * @ordered
	 */
	protected CalendarSystem calendarSystem;

	/**
	 * The cached value of the '{@link #getMeetingScheduleSystem() <em>Meeting Schedule System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingScheduleSystem()
	 * @generated
	 * @ordered
	 */
	protected MeetingScheduleSystem meetingScheduleSystem;

	/**
	 * The cached value of the '{@link #getFloors() <em>Floors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloors()
	 * @generated
	 * @ordered
	 */
	protected EList<Floor> floors;

	/**
	 * The cached value of the '{@link #getTimers() <em>Timers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimers()
	 * @generated
	 * @ordered
	 */
	protected EList<Timer> timers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyEnginePackage.Literals.BUILDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTS getCtsSystem() {
		return ctsSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtsSystem(CTS newCtsSystem, NotificationChain msgs) {
		CTS oldCtsSystem = ctsSystem;
		ctsSystem = newCtsSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__CTS_SYSTEM, oldCtsSystem, newCtsSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtsSystem(CTS newCtsSystem) {
		if (newCtsSystem != ctsSystem) {
			NotificationChain msgs = null;
			if (ctsSystem != null)
				msgs = ((InternalEObject)ctsSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__CTS_SYSTEM, null, msgs);
			if (newCtsSystem != null)
				msgs = ((InternalEObject)newCtsSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__CTS_SYSTEM, null, msgs);
			msgs = basicSetCtsSystem(newCtsSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__CTS_SYSTEM, newCtsSystem, newCtsSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControl getAccessControl() {
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessControl(AccessControl newAccessControl, NotificationChain msgs) {
		AccessControl oldAccessControl = accessControl;
		accessControl = newAccessControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__ACCESS_CONTROL, oldAccessControl, newAccessControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessControl(AccessControl newAccessControl) {
		if (newAccessControl != accessControl) {
			NotificationChain msgs = null;
			if (accessControl != null)
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarSystem getCalendarSystem() {
		return calendarSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalendarSystem(CalendarSystem newCalendarSystem, NotificationChain msgs) {
		CalendarSystem oldCalendarSystem = calendarSystem;
		calendarSystem = newCalendarSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM, oldCalendarSystem, newCalendarSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarSystem(CalendarSystem newCalendarSystem) {
		if (newCalendarSystem != calendarSystem) {
			NotificationChain msgs = null;
			if (calendarSystem != null)
				msgs = ((InternalEObject)calendarSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM, null, msgs);
			if (newCalendarSystem != null)
				msgs = ((InternalEObject)newCalendarSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM, null, msgs);
			msgs = basicSetCalendarSystem(newCalendarSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM, newCalendarSystem, newCalendarSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetingScheduleSystem getMeetingScheduleSystem() {
		return meetingScheduleSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeetingScheduleSystem(MeetingScheduleSystem newMeetingScheduleSystem, NotificationChain msgs) {
		MeetingScheduleSystem oldMeetingScheduleSystem = meetingScheduleSystem;
		meetingScheduleSystem = newMeetingScheduleSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM, oldMeetingScheduleSystem, newMeetingScheduleSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeetingScheduleSystem(MeetingScheduleSystem newMeetingScheduleSystem) {
		if (newMeetingScheduleSystem != meetingScheduleSystem) {
			NotificationChain msgs = null;
			if (meetingScheduleSystem != null)
				msgs = ((InternalEObject)meetingScheduleSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM, null, msgs);
			if (newMeetingScheduleSystem != null)
				msgs = ((InternalEObject)newMeetingScheduleSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM, null, msgs);
			msgs = basicSetMeetingScheduleSystem(newMeetingScheduleSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM, newMeetingScheduleSystem, newMeetingScheduleSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Floor> getFloors() {
		if (floors == null) {
			floors = new EObjectContainmentEList<Floor>(Floor.class, this, PolicyEnginePackage.BUILDING__FLOORS);
		}
		return floors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timer> getTimers() {
		if (timers == null) {
			timers = new EObjectContainmentEList<Timer>(Timer.class, this, PolicyEnginePackage.BUILDING__TIMERS);
		}
		return timers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PolicyEnginePackage.BUILDING__CTS_SYSTEM:
				return basicSetCtsSystem(null, msgs);
			case PolicyEnginePackage.BUILDING__ACCESS_CONTROL:
				return basicSetAccessControl(null, msgs);
			case PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM:
				return basicSetCalendarSystem(null, msgs);
			case PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM:
				return basicSetMeetingScheduleSystem(null, msgs);
			case PolicyEnginePackage.BUILDING__FLOORS:
				return ((InternalEList<?>)getFloors()).basicRemove(otherEnd, msgs);
			case PolicyEnginePackage.BUILDING__TIMERS:
				return ((InternalEList<?>)getTimers()).basicRemove(otherEnd, msgs);
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
			case PolicyEnginePackage.BUILDING__CTS_SYSTEM:
				return getCtsSystem();
			case PolicyEnginePackage.BUILDING__ACCESS_CONTROL:
				return getAccessControl();
			case PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM:
				return getCalendarSystem();
			case PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM:
				return getMeetingScheduleSystem();
			case PolicyEnginePackage.BUILDING__FLOORS:
				return getFloors();
			case PolicyEnginePackage.BUILDING__TIMERS:
				return getTimers();
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
			case PolicyEnginePackage.BUILDING__CTS_SYSTEM:
				setCtsSystem((CTS)newValue);
				return;
			case PolicyEnginePackage.BUILDING__ACCESS_CONTROL:
				setAccessControl((AccessControl)newValue);
				return;
			case PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM:
				setCalendarSystem((CalendarSystem)newValue);
				return;
			case PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM:
				setMeetingScheduleSystem((MeetingScheduleSystem)newValue);
				return;
			case PolicyEnginePackage.BUILDING__FLOORS:
				getFloors().clear();
				getFloors().addAll((Collection<? extends Floor>)newValue);
				return;
			case PolicyEnginePackage.BUILDING__TIMERS:
				getTimers().clear();
				getTimers().addAll((Collection<? extends Timer>)newValue);
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
			case PolicyEnginePackage.BUILDING__CTS_SYSTEM:
				setCtsSystem((CTS)null);
				return;
			case PolicyEnginePackage.BUILDING__ACCESS_CONTROL:
				setAccessControl((AccessControl)null);
				return;
			case PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM:
				setCalendarSystem((CalendarSystem)null);
				return;
			case PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM:
				setMeetingScheduleSystem((MeetingScheduleSystem)null);
				return;
			case PolicyEnginePackage.BUILDING__FLOORS:
				getFloors().clear();
				return;
			case PolicyEnginePackage.BUILDING__TIMERS:
				getTimers().clear();
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
			case PolicyEnginePackage.BUILDING__CTS_SYSTEM:
				return ctsSystem != null;
			case PolicyEnginePackage.BUILDING__ACCESS_CONTROL:
				return accessControl != null;
			case PolicyEnginePackage.BUILDING__CALENDAR_SYSTEM:
				return calendarSystem != null;
			case PolicyEnginePackage.BUILDING__MEETING_SCHEDULE_SYSTEM:
				return meetingScheduleSystem != null;
			case PolicyEnginePackage.BUILDING__FLOORS:
				return floors != null && !floors.isEmpty();
			case PolicyEnginePackage.BUILDING__TIMERS:
				return timers != null && !timers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuildingImpl
