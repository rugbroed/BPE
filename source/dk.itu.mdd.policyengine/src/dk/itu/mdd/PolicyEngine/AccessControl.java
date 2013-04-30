/**
 */
package dk.itu.mdd.PolicyEngine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.AccessControl#getAccessControlSensors <em>Access Control Sensors</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.AccessControl#getAccessControlDoorLockActuator <em>Access Control Door Lock Actuator</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getAccessControl()
 * @model
 * @generated
 */
public interface AccessControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Control Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control Sensors</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getAccessControl_AccessControlSensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorType> getAccessControlSensors();

	/**
	 * Returns the value of the '<em><b>Access Control Door Lock Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.PolicyEngine.DoorActuator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control Door Lock Actuator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control Door Lock Actuator</em>' containment reference list.
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getAccessControl_AccessControlDoorLockActuator()
	 * @model containment="true"
	 * @generated
	 */
	EList<DoorActuator> getAccessControlDoorLockActuator();

} // AccessControl
