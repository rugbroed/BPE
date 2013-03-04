/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.kben.building.Identifiable#getUuid <em>Uuid</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.kben.building.BuildingPackage#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #setUuid(String)
	 * @see dk.itu.kben.building.BuildingPackage#getIdentifiable_Uuid()
	 * @model default="" unsettable="true" id="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link dk.itu.kben.building.Identifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Unsets the value of the '{@link dk.itu.kben.building.Identifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	void unsetUuid();

	/**
	 * Returns whether the value of the '{@link dk.itu.kben.building.Identifiable#getUuid <em>Uuid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uuid</em>' attribute is set.
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	boolean isSetUuid();

} // Identifiable
