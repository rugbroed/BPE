/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getCond <em>Cond</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getThen <em>Then</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getIf()
 * @model
 * @generated
 */
public interface If extends Expression {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Expression)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getIf_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCond();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Expression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getIf_Then()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Expression)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElse();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.If#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Expression value);

} // If
