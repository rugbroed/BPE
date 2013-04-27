/**
 */
package dk.itu.mdd.PolicyEngine.tests;

import dk.itu.mdd.PolicyEngine.CalendarSystem;
import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Calendar System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalendarSystemTest extends TestCase {

	/**
	 * The fixture for this Calendar System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CalendarSystemTest.class);
	}

	/**
	 * Constructs a new Calendar System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Calendar System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CalendarSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Calendar System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarSystem getFixture() {
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
		setFixture(PolicyEngineFactory.eINSTANCE.createCalendarSystem());
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

} //CalendarSystemTest
