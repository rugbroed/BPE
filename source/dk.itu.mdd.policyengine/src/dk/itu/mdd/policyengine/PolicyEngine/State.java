/**
 */
package dk.itu.mdd.policyengine.PolicyEngine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.policyengine.PolicyEngine.State#isValueState <em>Value State</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value State</em>' attribute.
	 * @see #setValueState(boolean)
	 * @see dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage#getState_ValueState()
	 * @model
	 * @generated
	 */
	boolean isValueState();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.policyengine.PolicyEngine.State#isValueState <em>Value State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value State</em>' attribute.
	 * @see #isValueState()
	 * @generated
	 */
	void setValueState(boolean value);

} // State
