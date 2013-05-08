/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getRightExpr <em>Right Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Expr</em>' containment reference.
	 * @see #setLeftExpr(Expression)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBinaryExpression_LeftExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftExpr();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getLeftExpr <em>Left Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Expr</em>' containment reference.
	 * @see #getLeftExpr()
	 * @generated
	 */
	void setLeftExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Expr</em>' containment reference.
	 * @see #setRightExpr(Expression)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBinaryExpression_RightExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightExpr();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getRightExpr <em>Right Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expr</em>' containment reference.
	 * @see #getRightExpr()
	 * @generated
	 */
	void setRightExpr(Expression value);

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
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // BinaryExpression
