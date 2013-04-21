/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many Expressions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getExpression <em>Expression</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getManyexpr <em>Manyexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getManyExpressions()
 * @model
 * @generated
 */
public interface ManyExpressions extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(CompExpression)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getManyExpressions_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompExpression getExpression();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CompExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators
	 * @see #setOperator(Operators)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getManyExpressions_Operator()
	 * @model
	 * @generated
	 */
	Operators getOperator();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.Operators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operators value);

	/**
	 * Returns the value of the '<em><b>Manyexpr</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.ManyExpressions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manyexpr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manyexpr</em>' containment reference list.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getManyExpressions_Manyexpr()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManyExpressions> getManyexpr();

} // ManyExpressions
