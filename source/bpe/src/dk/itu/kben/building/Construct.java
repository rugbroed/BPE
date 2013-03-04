/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.kben.building.Construct#getRooms <em>Rooms</em>}</li>
 *   <li>{@link dk.itu.kben.building.Construct#getWindows <em>Windows</em>}</li>
 *   <li>{@link dk.itu.kben.building.Construct#getDoors <em>Doors</em>}</li>
 *   <li>{@link dk.itu.kben.building.Construct#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.kben.building.Construct#getDoorHandles <em>Door Handles</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.kben.building.BuildingPackage#getConstruct()
 * @model
 * @generated
 */
public interface Construct extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.kben.building.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getConstruct_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.kben.building.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getConstruct_Windows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Window> getWindows();

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.kben.building.Door}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' containment reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getConstruct_Doors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dk.itu.kben.building.BuildingPackage#getConstruct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.itu.kben.building.Construct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Door Handles</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.kben.building.DoorHandle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door Handles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Handles</em>' containment reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getConstruct_DoorHandles()
	 * @model containment="true"
	 * @generated
	 */
	EList<DoorHandle> getDoorHandles();

} // Construct
