/**
 */
package dk.itu.mdd.PolicyEngine.tests;

import dk.itu.mdd.PolicyEngine.Building;
import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildingTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BuildingTest.class);
	}

	/**
	 * Constructs a new Building test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Building test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Building getFixture() {
		return (Building)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PolicyEngineFactory.eINSTANCE.createBuilding());
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

} //BuildingTest
