/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getUses <em>Uses</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getSpecifiedBy <em>Specified By</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.Policy#getUsesSensors <em>Uses Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Actuator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getPolicy_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getUses();

	/**
	 * Returns the value of the '<em><b>Specified By</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Conditions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified By</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getPolicy_SpecifiedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conditions> getSpecifiedBy();

	/**
	 * Returns the value of the '<em><b>Uses Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.PolicyEngine.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Sensors</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getPolicy_UsesSensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getUsesSensors();

} // Policy
