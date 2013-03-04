/**
 */
package dk.itu.kben.building;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.kben.building.Model#getConstructs <em>Constructs</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.kben.building.BuildingPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Constructs</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.kben.building.Construct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructs</em>' containment reference list.
	 * @see dk.itu.kben.building.BuildingPackage#getModel_Constructs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Construct> getConstructs();

} // Model
