/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ResetExpression#getReset <em>Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getResetExpression()
 * @model
 * @generated
 */
public interface ResetExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Reset</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.AudioAlarmTimer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getResetExpression_Reset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AudioAlarmTimer> getReset();

} // ResetExpression
