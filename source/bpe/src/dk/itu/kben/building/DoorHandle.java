/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.kben.building.DoorHandle#getDoor <em>Door</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.kben.building.BuildingPackage#getDoorHandle()
 * @model
 * @generated
 */
public interface DoorHandle extends Identifiable, PressureSensor {
	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.itu.kben.building.Door#getDoorHandles <em>Door Handles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference.
	 * @see #setDoor(Door)
	 * @see dk.itu.kben.building.BuildingPackage#getDoorHandle_Door()
	 * @see dk.itu.kben.building.Door#getDoorHandles
	 * @model opposite="doorHandles" required="true"
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '{@link dk.itu.kben.building.DoorHandle#getDoor <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

} // DoorHandle
