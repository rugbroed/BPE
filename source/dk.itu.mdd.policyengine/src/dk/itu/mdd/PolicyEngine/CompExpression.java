/**
 */
package dk.itu.mdd.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.CompExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.CompExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getCompExpression()
 * @model
 * @generated
 */
public interface CompExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(RoomUsage)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getCompExpression_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RoomUsage getExpr();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.CompExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(RoomUsage value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.itu.mdd.PolicyEngine.CompOps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' attribute.
	 * @see dk.itu.mdd.PolicyEngine.CompOps
	 * @see #setOperand(CompOps)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getCompExpression_Operand()
	 * @model required="true"
	 * @generated
	 */
	CompOps getOperand();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.CompExpression#getOperand <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' attribute.
	 * @see dk.itu.mdd.PolicyEngine.CompOps
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(CompOps value);

} // CompExpression
