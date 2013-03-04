/**
 */
package dk.itu.kben.building.tests;

import dk.itu.kben.building.BuildingFactory;
import dk.itu.kben.building.MeetingSchedule;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meeting Schedule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeetingScheduleTest extends TestCase {

	/**
	 * The fixture for this Meeting Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeetingSchedule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeetingScheduleTest.class);
	}

	/**
	 * Constructs a new Meeting Schedule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetingScheduleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Meeting Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MeetingSchedule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Meeting Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeetingSchedule getFixture() {
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
		setFixture(BuildingFactory.eINSTANCE.createMeetingSchedule());
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

} //MeetingScheduleTest
