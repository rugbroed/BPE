/**
 */
package dk.itu.mdd.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.TimeExpression#getTimeAmount <em>Time Amount</em>}</li>
 *   <li>{@link dk.itu.mdd.PolicyEngine.TimeExpression#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Time Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Amount</em>' attribute.
	 * @see #setTimeAmount(int)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getTimeExpression_TimeAmount()
	 * @model required="true"
	 * @generated
	 */
	int getTimeAmount();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.TimeExpression#getTimeAmount <em>Time Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Amount</em>' attribute.
	 * @see #getTimeAmount()
	 * @generated
	 */
	void setTimeAmount(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(Timer)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getTimeExpression_Time()
	 * @model required="true"
	 * @generated
	 */
	Timer getTime();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.TimeExpression#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Timer value);

} // TimeExpression
