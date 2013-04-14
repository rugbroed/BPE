/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getCtsSystem <em>Cts System</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getCalendarSystem <em>Calendar System</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getMeetingScheduleSystem <em>Meeting Schedule System</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getFloors <em>Floors</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBuilding()
 * @model
 * @generated
 */
public interface Building extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cts System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cts System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cts System</em>' containment reference.
	 * @see #setCtsSystem(CTS)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBuilding_CtsSystem()
	 * @model containment="true"
	 * @generated
	 */
	CTS getCtsSystem();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getCtsSystem <em>Cts System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cts System</em>' containment reference.
	 * @see #getCtsSystem()
	 * @generated
	 */
	void setCtsSystem(CTS value);

	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' containment reference.
	 * @see #setAccessControl(AccessControl)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBuilding_AccessControl()
	 * @model containment="true"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

	/**
	 * Returns the value of the '<em><b>Calendar System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar System</em>' containment reference.
	 * @see #setCalendarSystem(CalendarSystem)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBuilding_CalendarSystem()
	 * @model containment="true"
	 * @generated
	 */
	CalendarSystem getCalendarSystem();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getCalendarSystem <em>Calendar System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar System</em>' containment reference.
	 * @see #getCalendarSystem()
	 * @generated
	 */
	void setCalendarSystem(CalendarSystem value);

	/**
	 * Returns the value of the '<em><b>Meeting Schedule System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meeting Schedule System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting Schedule System</em>' containment reference.
	 * @see #setMeetingScheduleSystem(MeetingScheduleSystem)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBuilding_MeetingScheduleSystem()
	 * @model containment="true"
	 * @generated
	 */
	MeetingScheduleSystem getMeetingScheduleSystem();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.Building#getMeetingScheduleSystem <em>Meeting Schedule System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting Schedule System</em>' containment reference.
	 * @see #getMeetingScheduleSystem()
	 * @generated
	 */
	void setMeetingScheduleSystem(MeetingScheduleSystem value);

	/**
	 * Returns the value of the '<em><b>Floors</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Floor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floors</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBuilding_Floors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Floor> getFloors();

} // Building
