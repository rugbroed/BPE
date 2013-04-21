/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getBuildings <em>Buildings</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getPredefinedRooms <em>Predefined Rooms</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getPolicyDefinition <em>Policy Definition</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getStateDefinition <em>State Definition</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getTimers <em>Timers</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Model#getSchedules <em>Schedules</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Buildings</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Building}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildings</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getModel_Buildings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Building> getBuildings();

	/**
	 * Returns the value of the '<em><b>Predefined Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Rooms</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getModel_PredefinedRooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getPredefinedRooms();

	/**
	 * Returns the value of the '<em><b>Policy Definition</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Policy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Definition</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getModel_PolicyDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Policy> getPolicyDefinition();

	/**
	 * Returns the value of the '<em><b>State Definition</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Definition</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getModel_StateDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStateDefinition();

	/**
	 * Returns the value of the '<em><b>Timers</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Timer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timers</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getModel_Timers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Timer> getTimers();

	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Schedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getModel_Schedules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedules();

} // Model
