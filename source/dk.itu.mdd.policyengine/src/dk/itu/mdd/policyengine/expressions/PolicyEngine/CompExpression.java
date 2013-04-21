/**
 */
package dk.itu.mdd.policyengine.expressions.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getCompare <em>Compare</em>}</li>
 *   <li>{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getCompExpression()
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
	 * @see #setExpr(Clause)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getCompExpression_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Clause getExpr();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Clause value);

	/**
	 * Returns the value of the '<em><b>Compare</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare</em>' attribute.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps
	 * @see #setCompare(CompOps)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getCompExpression_Compare()
	 * @model required="true"
	 * @generated
	 */
	CompOps getCompare();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getCompare <em>Compare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare</em>' attribute.
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.CompOps
	 * @see #getCompare()
	 * @generated
	 */
	void setCompare(CompOps value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(int)
	 * @see dk.itu.mdd.policyengine.expressions.PolicyEngine.PolicyEnginePackage#getCompExpression_Constant()
	 * @model required="true"
	 * @generated
	 */
	int getConstant();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.expressions.PolicyEngine.CompExpression#getConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(int value);

} // CompExpression
