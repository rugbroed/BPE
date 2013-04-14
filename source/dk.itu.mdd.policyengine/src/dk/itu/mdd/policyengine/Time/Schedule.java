/**
 */
package dk.itu.mdd.policyengine.Time;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.Time.Schedule#getWeekdays <em>Weekdays</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.Time.Schedule#getTo <em>To</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.Time.Schedule#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.Time.TimePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Weekdays</b></em>' attribute list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.Time.WeekDays}.
	 * The literals are from the enumeration {@link dk.itu.mdd.policyengine.Time.WeekDays}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weekdays</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekdays</em>' attribute list.
	 * @see dk.itu.mdd.policyengine.Time.WeekDays
	 * @see dk.itu.mdd.policyengine.Time.TimePackage#getSchedule_Weekdays()
	 * @model
	 * @generated
	 */
	EList<WeekDays> getWeekdays();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Time)
	 * @see dk.itu.mdd.policyengine.Time.TimePackage#getSchedule_To()
	 * @model containment="true"
	 * @generated
	 */
	Time getTo();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.Time.Schedule#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Time value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Time)
	 * @see dk.itu.mdd.policyengine.Time.TimePackage#getSchedule_From()
	 * @model containment="true"
	 * @generated
	 */
	Time getFrom();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.Time.Schedule#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Time value);

} // Schedule
