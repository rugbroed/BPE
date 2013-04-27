/**
 */
package dk.itu.mdd.PolicyEngine.tests;

import dk.itu.mdd.PolicyEngine.MeetingScheduleSystem;
import dk.itu.mdd.PolicyEngine.PolicyEngineFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meeting Schedule System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeetingScheduleSystemTest extends TestCase {

	/**
	 * The fixture for this Meeting Schedule System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeetingScheduleSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeetingScheduleSystemTest.class);
	}

	/**
	 * Constructs a new Meeting Schedule System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetingScheduleSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Meeting Schedule System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MeetingScheduleSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Meeting Schedule System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeetingScheduleSystem getFixture() {
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
		setFixture(PolicyEngineFactory.eINSTANCE.createMeetingScheduleSystem());
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

} //MeetingScheduleSystemTest
