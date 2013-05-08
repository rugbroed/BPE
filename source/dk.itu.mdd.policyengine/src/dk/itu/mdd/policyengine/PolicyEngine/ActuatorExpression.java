/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorExpression#getAct <em>Act</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getActuatorExpression()
 * @model
 * @generated
 */
public interface ActuatorExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' containment reference.
	 * @see #setAct(ActuatorType)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getActuatorExpression_Act()
	 * @model containment="true"
	 * @generated
	 */
	ActuatorType getAct();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.ActuatorExpression#getAct <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act</em>' containment reference.
	 * @see #getAct()
	 * @generated
	 */
	void setAct(ActuatorType value);

} // ActuatorExpression
