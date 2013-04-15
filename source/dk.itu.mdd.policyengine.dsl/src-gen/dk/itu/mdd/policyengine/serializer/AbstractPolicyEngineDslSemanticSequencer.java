package dk.itu.mdd.policyengine.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.mdd.policyengine.PolicyEngine.AccessControl;
import dk.itu.mdd.policyengine.PolicyEngine.ActuatorComponent;
import dk.itu.mdd.policyengine.PolicyEngine.AudioAlarmActuator;
import dk.itu.mdd.policyengine.PolicyEngine.Building;
import dk.itu.mdd.policyengine.PolicyEngine.CO2Sensor;
import dk.itu.mdd.policyengine.PolicyEngine.CTS;
import dk.itu.mdd.policyengine.PolicyEngine.CalendarSystem;
import dk.itu.mdd.policyengine.PolicyEngine.Conditions;
import dk.itu.mdd.policyengine.PolicyEngine.DoorActuator;
import dk.itu.mdd.policyengine.PolicyEngine.Floor;
import dk.itu.mdd.policyengine.PolicyEngine.HasIntegerValue;
import dk.itu.mdd.policyengine.PolicyEngine.HumidifierActuator;
import dk.itu.mdd.policyengine.PolicyEngine.HumiditySensor;
import dk.itu.mdd.policyengine.PolicyEngine.InfraredLightSensor;
import dk.itu.mdd.policyengine.PolicyEngine.LightSensor;
import dk.itu.mdd.policyengine.PolicyEngine.LightSwitchActuator;
import dk.itu.mdd.policyengine.PolicyEngine.MeetingScheduleSystem;
import dk.itu.mdd.policyengine.PolicyEngine.Model;
import dk.itu.mdd.policyengine.PolicyEngine.MotionSensor;
import dk.itu.mdd.policyengine.PolicyEngine.Policy;
import dk.itu.mdd.policyengine.PolicyEngine.PolicyEnginePackage;
import dk.itu.mdd.policyengine.PolicyEngine.PressureSensor;
import dk.itu.mdd.policyengine.PolicyEngine.RadiatorActuator;
import dk.itu.mdd.policyengine.PolicyEngine.Room;
import dk.itu.mdd.policyengine.PolicyEngine.Schedule;
import dk.itu.mdd.policyengine.PolicyEngine.SensorComponent;
import dk.itu.mdd.policyengine.PolicyEngine.SmokeSensor;
import dk.itu.mdd.policyengine.PolicyEngine.State;
import dk.itu.mdd.policyengine.PolicyEngine.TemperatureSensor;
import dk.itu.mdd.policyengine.PolicyEngine.Time;
import dk.itu.mdd.policyengine.PolicyEngine.TouchSensor;
import dk.itu.mdd.policyengine.PolicyEngine.WindowActuator;
import dk.itu.mdd.policyengine.services.PolicyEngineDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractPolicyEngineDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PolicyEngineDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PolicyEnginePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PolicyEnginePackage.ACCESS_CONTROL:
				if(context == grammarAccess.getAccessControlRule()) {
					sequence_AccessControl(context, (AccessControl) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.ACTUATOR_COMPONENT:
				if(context == grammarAccess.getActuatorComponentRule()) {
					sequence_ActuatorComponent(context, (ActuatorComponent) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.AUDIO_ALARM_ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getAudioAlarmActuatorRule()) {
					sequence_AudioAlarmActuator(context, (AudioAlarmActuator) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.BUILDING:
				if(context == grammarAccess.getBuildingRule()) {
					sequence_Building(context, (Building) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.CO2_SENSOR:
				if(context == grammarAccess.getCO2SensorRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_CO2Sensor(context, (CO2Sensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.CTS:
				if(context == grammarAccess.getCTSRule()) {
					sequence_CTS(context, (CTS) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.CALENDAR_SYSTEM:
				if(context == grammarAccess.getCalendarSystemRule()) {
					sequence_CalendarSystem(context, (CalendarSystem) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.CONDITIONS:
				if(context == grammarAccess.getConditionsRule()) {
					sequence_Conditions(context, (Conditions) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.DOOR_ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getDoorActuatorRule()) {
					sequence_DoorActuator(context, (DoorActuator) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.FLOOR:
				if(context == grammarAccess.getFloorRule()) {
					sequence_Floor(context, (Floor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.HAS_INTEGER_VALUE:
				if(context == grammarAccess.getHasIntegerValueRule()) {
					sequence_HasIntegerValue(context, (HasIntegerValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getHasIntegerValue_ImplRule()) {
					sequence_HasIntegerValue_Impl(context, (HasIntegerValue) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.HUMIDIFIER_ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getHumidifierActuatorRule()) {
					sequence_HumidifierActuator(context, (HumidifierActuator) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.HUMIDITY_SENSOR:
				if(context == grammarAccess.getHumiditySensorRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_HumiditySensor(context, (HumiditySensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.INFRARED_LIGHT_SENSOR:
				if(context == grammarAccess.getInfraredLightSensorRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_InfraredLightSensor(context, (InfraredLightSensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.LIGHT_SENSOR:
				if(context == grammarAccess.getLightSensorRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_LightSensor(context, (LightSensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.LIGHT_SWITCH_ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getLightSwitchActuatorRule()) {
					sequence_LightSwitchActuator(context, (LightSwitchActuator) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.MEETING_SCHEDULE_SYSTEM:
				if(context == grammarAccess.getMeetingScheduleSystemRule()) {
					sequence_MeetingScheduleSystem(context, (MeetingScheduleSystem) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.MOTION_SENSOR:
				if(context == grammarAccess.getMotionSensorRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_MotionSensor(context, (MotionSensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.POLICY:
				if(context == grammarAccess.getPolicyRule()) {
					sequence_Policy(context, (Policy) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.PRESSURE_SENSOR:
				if(context == grammarAccess.getPressureSensorRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_PressureSensor(context, (PressureSensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.RADIATOR_ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getRadiatorActuatorRule()) {
					sequence_RadiatorActuator(context, (RadiatorActuator) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.ROOM:
				if(context == grammarAccess.getRoomRule()) {
					sequence_Room(context, (Room) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.SCHEDULE:
				if(context == grammarAccess.getScheduleRule()) {
					sequence_Schedule(context, (Schedule) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.SENSOR_COMPONENT:
				if(context == grammarAccess.getSensorComponentRule()) {
					sequence_SensorComponent(context, (SensorComponent) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.SMOKE_SENSOR:
				if(context == grammarAccess.getSensorRule() ||
				   context == grammarAccess.getSmokeSensorRule()) {
					sequence_SmokeSensor(context, (SmokeSensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.TEMPERATURE_SENSOR:
				if(context == grammarAccess.getSensorRule() ||
				   context == grammarAccess.getTemperatureSensorRule()) {
					sequence_TemperatureSensor(context, (TemperatureSensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.TIME:
				if(context == grammarAccess.getTimeRule()) {
					sequence_Time(context, (Time) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.TOUCH_SENSOR:
				if(context == grammarAccess.getSensorRule() ||
				   context == grammarAccess.getTouchSensorRule()) {
					sequence_TouchSensor(context, (TouchSensor) semanticObject); 
					return; 
				}
				else break;
			case PolicyEnginePackage.WINDOW_ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getWindowActuatorRule()) {
					sequence_WindowActuator(context, (WindowActuator) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (accessControlSensors+=Sensor accessControlSensors+=Sensor*)? 
	 *         (accessControlDoorLockActuator+=Actuator accessControlDoorLockActuator+=Actuator*)?
	 *     )
	 */
	protected void sequence_AccessControl(EObject context, AccessControl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (actuators+=Actuator actuators+=Actuator*)?)
	 */
	protected void sequence_ActuatorComponent(EObject context, ActuatorComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_AudioAlarmActuator(EObject context, AudioAlarmActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ctsSystem=CTS? 
	 *         accessControl=AccessControl? 
	 *         calendarSystem=CalendarSystem? 
	 *         meetingScheduleSystem=MeetingScheduleSystem? 
	 *         (floors+=Floor floors+=Floor*)?
	 *     )
	 */
	protected void sequence_Building(EObject context, Building semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_CO2Sensor(EObject context, CO2Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((temperatureSensors+=Sensor temperatureSensors+=Sensor*)? (ctsActuators+=Actuator ctsActuators+=Actuator*)?)
	 */
	protected void sequence_CTS(EObject context, CTS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CalendarSystem}
	 */
	protected void sequence_CalendarSystem(EObject context, CalendarSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Conditions}
	 */
	protected void sequence_Conditions(EObject context, Conditions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_DoorActuator(EObject context, DoorActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (rooms+=Room rooms+=Room*)?)
	 */
	protected void sequence_Floor(EObject context, Floor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_HasIntegerValue(EObject context, HasIntegerValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_HasIntegerValue_Impl(EObject context, HasIntegerValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_HumidifierActuator(EObject context, HumidifierActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_HumiditySensor(EObject context, HumiditySensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_InfraredLightSensor(EObject context, InfraredLightSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_LightSensor(EObject context, LightSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_LightSwitchActuator(EObject context, LightSwitchActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MeetingScheduleSystem}
	 */
	protected void sequence_MeetingScheduleSystem(EObject context, MeetingScheduleSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (stateDefinition+=State stateDefinition+=State*)? 
	 *         (policyDefinition+=Policy policyDefinition+=Policy*)? 
	 *         (schedules+=Schedule schedules+=Schedule*)? 
	 *         predefinedRooms+=Room* 
	 *         (buildings+=Building buildings+=Building*)?
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_MotionSensor(EObject context, MotionSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (usesSensors+=Sensor usesSensors+=Sensor*)? (uses+=Actuator uses+=Actuator*)? (specifiedBy+=Conditions specifiedBy+=Conditions*)?)
	 */
	protected void sequence_Policy(EObject context, Policy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_PressureSensor(EObject context, PressureSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_RadiatorActuator(EObject context, RadiatorActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (extends+=[Room|EString] extends+=[Room|EString]*)? 
	 *         (policies+=[Policy|EString] policies+=[Policy|EString]* (during+=[Schedule|EString] during+=[Schedule|EString]*)?)? 
	 *         (declareSensor+=SensorComponent declareSensor+=SensorComponent*)? 
	 *         (declareActuator+=ActuatorComponent declareActuator+=ActuatorComponent*)?
	 *     )
	 */
	protected void sequence_Room(EObject context, Room semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (weekdays+=Weekdays weekdays+=Weekdays*)? (from=Time to=Time)?)
	 */
	protected void sequence_Schedule(EObject context, Schedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (sensors+=Sensor sensors+=Sensor*)?)
	 */
	protected void sequence_SensorComponent(EObject context, SensorComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_SmokeSensor(EObject context, SmokeSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString valueState?='=')
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PolicyEnginePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolicyEnginePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PolicyEnginePackage.Literals.STATE__VALUE_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolicyEnginePackage.Literals.STATE__VALUE_STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateAccess().getValueStateEqualsSignKeyword_3_0(), semanticObject.isValueState());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_TemperatureSensor(EObject context, TemperatureSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((hours=EShort minutes=EShort)?)
	 */
	protected void sequence_Time(EObject context, Time semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_TouchSensor(EObject context, TouchSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueState=EInt?)
	 */
	protected void sequence_WindowActuator(EObject context, WindowActuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
