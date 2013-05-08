/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.ResetExpression#getReset <em>Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getResetExpression()
 * @model
 * @generated
 */
public interface ResetExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' reference.
	 * @see #setReset(Timer)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getResetExpression_Reset()
	 * @model required="true"
	 * @generated
	 */
	Timer getReset();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.ResetExpression#getReset <em>Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset</em>' reference.
	 * @see #getReset()
	 * @generated
	 */
	void setReset(Timer value);

} // ResetExpression
