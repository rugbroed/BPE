/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getDeclareSensor <em>Declare Sensor</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getDeclareActuator <em>Declare Actuator</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getExtends <em>Extends</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getTimers <em>Timers</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Room#getPolicies <em>Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Declare Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.SensorComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declare Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare Sensor</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoom_DeclareSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorComponent> getDeclareSensor();

	/**
	 * Returns the value of the '<em><b>Declare Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declare Actuator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare Actuator</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoom_DeclareActuator()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActuatorComponent> getDeclareActuator();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoom_Extends()
	 * @model
	 * @generated
	 */
	EList<Room> getExtends();

	/**
	 * Returns the value of the '<em><b>Timers</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Timer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timers</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoom_Timers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Timer> getTimers();

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Policy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getRoom_Policies()
	 * @model
	 * @generated
	 */
	EList<Policy> getPolicies();

} // Room
