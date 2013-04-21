/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Actuators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.HasActuators#getActuators <em>Actuators</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getHasActuators()
 * @model
 * @generated
 */
public interface HasActuators extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Actuator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getHasActuators_Actuators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

} // HasActuators
