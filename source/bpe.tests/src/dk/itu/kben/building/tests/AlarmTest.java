/**
 */
package dk.itu.kben.building.tests;

import dk.itu.kben.building.Alarm;
import dk.itu.kben.building.BuildingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlarmTest extends TestCase {

	/**
	 * The fixture for this Alarm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alarm fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlarmTest.class);
	}

	/**
	 * Constructs a new Alarm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Alarm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Alarm fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Alarm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alarm getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BuildingFactory.eINSTANCE.createAlarm());
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

} //AlarmTest
