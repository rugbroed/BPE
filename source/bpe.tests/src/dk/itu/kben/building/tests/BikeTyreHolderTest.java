/**
 */
package dk.itu.kben.building.tests;

import dk.itu.kben.building.BikeTyreHolder;
import dk.itu.kben.building.BuildingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bike Tyre Holder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BikeTyreHolderTest extends PressureSensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BikeTyreHolderTest.class);
	}

	/**
	 * Constructs a new Bike Tyre Holder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeTyreHolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bike Tyre Holder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BikeTyreHolder getFixture() {
		return (BikeTyreHolder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BuildingFactory.eINSTANCE.createBikeTyreHolder());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BikeTyreHolderTest
