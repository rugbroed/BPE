/**
 */
package dk.itu.mdd.PolicyEngine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.mdd.PolicyEngine.HasIntegerValue#getValueState <em>Value State</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getHasIntegerValue()
 * @model
 * @generated
 */
public interface HasIntegerValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value State</em>' attribute.
	 * @see #setValueState(int)
	 * @see dk.itu.mdd.PolicyEngine.PolicyEnginePackage#getHasIntegerValue_ValueState()
	 * @model
	 * @generated
	 */
	int getValueState();

	/**
	 * Sets the value of the '{@link dk.itu.mdd.PolicyEngine.HasIntegerValue#getValueState <em>Value State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value State</em>' attribute.
	 * @see #getValueState()
	 * @generated
	 */
	void setValueState(int value);

} // HasIntegerValue
