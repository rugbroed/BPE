/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getUnaryExpression_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getUnaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.UnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // UnaryExpression
