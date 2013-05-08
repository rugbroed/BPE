/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Actuator#getActuatorTypes <em>Actuator Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends NamedElement, Component {
	/**
	 * Returns the value of the '<em><b>Actuator Types</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Types</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getActuator_ActuatorTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActuatorType> getActuatorTypes();

} // Actuator
