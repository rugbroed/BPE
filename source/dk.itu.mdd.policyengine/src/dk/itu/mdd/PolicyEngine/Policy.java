/**
 */
package dk.itu.mdd.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getUsesActuators <em>Uses Actuators</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getSpecifiedBy <em>Specified By</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getControlledBy <em>Controlled By</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getDefineState <em>Define State</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getDuring <em>During</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getUsesRooms <em>Uses Rooms</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getDefineLocalState <em>Define Local State</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.Policy#getUsesSensors <em>Uses Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Uses Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Actuators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Actuators</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_UsesActuators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActuatorType> getUsesActuators();

	/**
	 * Returns the value of the '<em><b>Specified By</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.If}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified By</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_SpecifiedBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<If> getSpecifiedBy();

	/**
	 * Returns the value of the '<em><b>Controlled By</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.Timer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_ControlledBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Timer> getControlledBy();

	/**
	 * Returns the value of the '<em><b>Define State</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define State</em>' reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_DefineState()
	 * @model
	 * @generated
	 */
	EList<State> getDefineState();

	/**
	 * Returns the value of the '<em><b>During</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.Schedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>During</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>During</em>' reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_During()
	 * @model
	 * @generated
	 */
	EList<Schedule> getDuring();

	/**
	 * Returns the value of the '<em><b>Uses Rooms</b></em>' reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Rooms</em>' reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_UsesRooms()
	 * @model
	 * @generated
	 */
	EList<Room> getUsesRooms();

	/**
	 * Returns the value of the '<em><b>Define Local State</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define Local State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define Local State</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_DefineLocalState()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getDefineLocalState();

	/**
	 * Returns the value of the '<em><b>Uses Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Sensors</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getPolicy_UsesSensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorType> getUsesSensors();

} // Policy
