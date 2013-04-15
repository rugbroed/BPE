/*
* generated by Xtext
*/
package dk.itu.mdd.policyengine.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.itu.mdd.policyengine.services.PolicyEngineDslGrammarAccess;

public class PolicyEngineDslParser extends AbstractContentAssistParser {
	
	@Inject
	private PolicyEngineDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.itu.mdd.policyengine.ui.contentassist.antlr.internal.InternalPolicyEngineDslParser createParser() {
		dk.itu.mdd.policyengine.ui.contentassist.antlr.internal.InternalPolicyEngineDslParser result = new dk.itu.mdd.policyengine.ui.contentassist.antlr.internal.InternalPolicyEngineDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActuatorAccess().getAlternatives(), "rule__Actuator__Alternatives");
					put(grammarAccess.getSensorAccess().getAlternatives(), "rule__Sensor__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getWeekdaysAccess().getAlternatives(), "rule__Weekdays__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_3(), "rule__Model__Group_3__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getModelAccess().getGroup_5(), "rule__Model__Group_5__0");
					put(grammarAccess.getModelAccess().getGroup_6(), "rule__Model__Group_6__0");
					put(grammarAccess.getModelAccess().getGroup_7(), "rule__Model__Group_7__0");
					put(grammarAccess.getScheduleAccess().getGroup(), "rule__Schedule__Group__0");
					put(grammarAccess.getScheduleAccess().getGroup_3(), "rule__Schedule__Group_3__0");
					put(grammarAccess.getScheduleAccess().getGroup_3_2(), "rule__Schedule__Group_3_2__0");
					put(grammarAccess.getScheduleAccess().getGroup_4(), "rule__Schedule__Group_4__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getTimeAccess().getGroup_1(), "rule__Time__Group_1__0");
					put(grammarAccess.getEShortAccess().getGroup(), "rule__EShort__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getPolicyAccess().getGroup_3(), "rule__Policy__Group_3__0");
					put(grammarAccess.getPolicyAccess().getGroup_3_1(), "rule__Policy__Group_3_1__0");
					put(grammarAccess.getPolicyAccess().getGroup_3_1_1(), "rule__Policy__Group_3_1_1__0");
					put(grammarAccess.getPolicyAccess().getGroup_4(), "rule__Policy__Group_4__0");
					put(grammarAccess.getPolicyAccess().getGroup_4_1(), "rule__Policy__Group_4_1__0");
					put(grammarAccess.getPolicyAccess().getGroup_4_1_1(), "rule__Policy__Group_4_1_1__0");
					put(grammarAccess.getPolicyAccess().getGroup_5(), "rule__Policy__Group_5__0");
					put(grammarAccess.getPolicyAccess().getGroup_5_2(), "rule__Policy__Group_5_2__0");
					put(grammarAccess.getBuildingAccess().getGroup(), "rule__Building__Group__0");
					put(grammarAccess.getBuildingAccess().getGroup_8(), "rule__Building__Group_8__0");
					put(grammarAccess.getFloorAccess().getGroup(), "rule__Floor__Group__0");
					put(grammarAccess.getFloorAccess().getGroup_4(), "rule__Floor__Group_4__0");
					put(grammarAccess.getFloorAccess().getGroup_4_2(), "rule__Floor__Group_4_2__0");
					put(grammarAccess.getRoomAccess().getGroup(), "rule__Room__Group__0");
					put(grammarAccess.getRoomAccess().getGroup_2(), "rule__Room__Group_2__0");
					put(grammarAccess.getRoomAccess().getGroup_3(), "rule__Room__Group_3__0");
					put(grammarAccess.getRoomAccess().getGroup_3_1(), "rule__Room__Group_3_1__0");
					put(grammarAccess.getRoomAccess().getGroup_3_2(), "rule__Room__Group_3_2__0");
					put(grammarAccess.getCTSAccess().getGroup(), "rule__CTS__Group__0");
					put(grammarAccess.getCTSAccess().getGroup_3(), "rule__CTS__Group_3__0");
					put(grammarAccess.getCTSAccess().getGroup_3_3(), "rule__CTS__Group_3_3__0");
					put(grammarAccess.getCTSAccess().getGroup_4(), "rule__CTS__Group_4__0");
					put(grammarAccess.getCTSAccess().getGroup_4_3(), "rule__CTS__Group_4_3__0");
					put(grammarAccess.getAccessControlAccess().getGroup(), "rule__AccessControl__Group__0");
					put(grammarAccess.getAccessControlAccess().getGroup_3(), "rule__AccessControl__Group_3__0");
					put(grammarAccess.getAccessControlAccess().getGroup_3_3(), "rule__AccessControl__Group_3_3__0");
					put(grammarAccess.getAccessControlAccess().getGroup_4(), "rule__AccessControl__Group_4__0");
					put(grammarAccess.getAccessControlAccess().getGroup_4_3(), "rule__AccessControl__Group_4_3__0");
					put(grammarAccess.getCalendarSystemAccess().getGroup(), "rule__CalendarSystem__Group__0");
					put(grammarAccess.getMeetingScheduleSystemAccess().getGroup(), "rule__MeetingScheduleSystem__Group__0");
					put(grammarAccess.getMotionSensorAccess().getGroup(), "rule__MotionSensor__Group__0");
					put(grammarAccess.getMotionSensorAccess().getGroup_2(), "rule__MotionSensor__Group_2__0");
					put(grammarAccess.getTemperatureSensorAccess().getGroup(), "rule__TemperatureSensor__Group__0");
					put(grammarAccess.getTemperatureSensorAccess().getGroup_2(), "rule__TemperatureSensor__Group_2__0");
					put(grammarAccess.getPressureSensorAccess().getGroup(), "rule__PressureSensor__Group__0");
					put(grammarAccess.getPressureSensorAccess().getGroup_2(), "rule__PressureSensor__Group_2__0");
					put(grammarAccess.getTouchSensorAccess().getGroup(), "rule__TouchSensor__Group__0");
					put(grammarAccess.getTouchSensorAccess().getGroup_2(), "rule__TouchSensor__Group_2__0");
					put(grammarAccess.getLightSensorAccess().getGroup(), "rule__LightSensor__Group__0");
					put(grammarAccess.getLightSensorAccess().getGroup_2(), "rule__LightSensor__Group_2__0");
					put(grammarAccess.getSmokeSensorAccess().getGroup(), "rule__SmokeSensor__Group__0");
					put(grammarAccess.getSmokeSensorAccess().getGroup_2(), "rule__SmokeSensor__Group_2__0");
					put(grammarAccess.getCO2SensorAccess().getGroup(), "rule__CO2Sensor__Group__0");
					put(grammarAccess.getCO2SensorAccess().getGroup_2(), "rule__CO2Sensor__Group_2__0");
					put(grammarAccess.getInfraredLightSensorAccess().getGroup(), "rule__InfraredLightSensor__Group__0");
					put(grammarAccess.getInfraredLightSensorAccess().getGroup_2(), "rule__InfraredLightSensor__Group_2__0");
					put(grammarAccess.getHasIntegerValue_ImplAccess().getGroup(), "rule__HasIntegerValue_Impl__Group__0");
					put(grammarAccess.getHasIntegerValue_ImplAccess().getGroup_2(), "rule__HasIntegerValue_Impl__Group_2__0");
					put(grammarAccess.getHumiditySensorAccess().getGroup(), "rule__HumiditySensor__Group__0");
					put(grammarAccess.getHumiditySensorAccess().getGroup_2(), "rule__HumiditySensor__Group_2__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getLightSwitchActuatorAccess().getGroup(), "rule__LightSwitchActuator__Group__0");
					put(grammarAccess.getLightSwitchActuatorAccess().getGroup_2(), "rule__LightSwitchActuator__Group_2__0");
					put(grammarAccess.getWindowActuatorAccess().getGroup(), "rule__WindowActuator__Group__0");
					put(grammarAccess.getWindowActuatorAccess().getGroup_2(), "rule__WindowActuator__Group_2__0");
					put(grammarAccess.getHumidifierActuatorAccess().getGroup(), "rule__HumidifierActuator__Group__0");
					put(grammarAccess.getHumidifierActuatorAccess().getGroup_2(), "rule__HumidifierActuator__Group_2__0");
					put(grammarAccess.getDoorActuatorAccess().getGroup(), "rule__DoorActuator__Group__0");
					put(grammarAccess.getDoorActuatorAccess().getGroup_2(), "rule__DoorActuator__Group_2__0");
					put(grammarAccess.getRadiatorActuatorAccess().getGroup(), "rule__RadiatorActuator__Group__0");
					put(grammarAccess.getRadiatorActuatorAccess().getGroup_2(), "rule__RadiatorActuator__Group_2__0");
					put(grammarAccess.getAudioAlarmActuatorAccess().getGroup(), "rule__AudioAlarmActuator__Group__0");
					put(grammarAccess.getAudioAlarmActuatorAccess().getGroup_2(), "rule__AudioAlarmActuator__Group_2__0");
					put(grammarAccess.getHasIntegerValueAccess().getGroup(), "rule__HasIntegerValue__Group__0");
					put(grammarAccess.getHasIntegerValueAccess().getGroup_2(), "rule__HasIntegerValue__Group_2__0");
					put(grammarAccess.getSensorComponentAccess().getGroup(), "rule__SensorComponent__Group__0");
					put(grammarAccess.getSensorComponentAccess().getGroup_3(), "rule__SensorComponent__Group_3__0");
					put(grammarAccess.getActuatorComponentAccess().getGroup(), "rule__ActuatorComponent__Group__0");
					put(grammarAccess.getActuatorComponentAccess().getGroup_3(), "rule__ActuatorComponent__Group_3__0");
					put(grammarAccess.getConditionsAccess().getGroup(), "rule__Conditions__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getStateDefinitionAssignment_3_0(), "rule__Model__StateDefinitionAssignment_3_0");
					put(grammarAccess.getModelAccess().getStateDefinitionAssignment_3_1(), "rule__Model__StateDefinitionAssignment_3_1");
					put(grammarAccess.getModelAccess().getPolicyDefinitionAssignment_4_0(), "rule__Model__PolicyDefinitionAssignment_4_0");
					put(grammarAccess.getModelAccess().getPolicyDefinitionAssignment_4_1(), "rule__Model__PolicyDefinitionAssignment_4_1");
					put(grammarAccess.getModelAccess().getSchedulesAssignment_5_0(), "rule__Model__SchedulesAssignment_5_0");
					put(grammarAccess.getModelAccess().getSchedulesAssignment_5_1(), "rule__Model__SchedulesAssignment_5_1");
					put(grammarAccess.getModelAccess().getPredefinedRoomsAssignment_6_1(), "rule__Model__PredefinedRoomsAssignment_6_1");
					put(grammarAccess.getModelAccess().getPredefinedRoomsAssignment_6_2(), "rule__Model__PredefinedRoomsAssignment_6_2");
					put(grammarAccess.getModelAccess().getBuildingsAssignment_7_0(), "rule__Model__BuildingsAssignment_7_0");
					put(grammarAccess.getModelAccess().getBuildingsAssignment_7_1(), "rule__Model__BuildingsAssignment_7_1");
					put(grammarAccess.getScheduleAccess().getNameAssignment_2(), "rule__Schedule__NameAssignment_2");
					put(grammarAccess.getScheduleAccess().getWeekdaysAssignment_3_1(), "rule__Schedule__WeekdaysAssignment_3_1");
					put(grammarAccess.getScheduleAccess().getWeekdaysAssignment_3_2_1(), "rule__Schedule__WeekdaysAssignment_3_2_1");
					put(grammarAccess.getScheduleAccess().getFromAssignment_4_1(), "rule__Schedule__FromAssignment_4_1");
					put(grammarAccess.getScheduleAccess().getToAssignment_4_3(), "rule__Schedule__ToAssignment_4_3");
					put(grammarAccess.getTimeAccess().getHoursAssignment_1_0(), "rule__Time__HoursAssignment_1_0");
					put(grammarAccess.getTimeAccess().getMinutesAssignment_1_2(), "rule__Time__MinutesAssignment_1_2");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getStateAccess().getValueStateAssignment_3(), "rule__State__ValueStateAssignment_3");
					put(grammarAccess.getPolicyAccess().getNameAssignment_2(), "rule__Policy__NameAssignment_2");
					put(grammarAccess.getPolicyAccess().getUsesSensorsAssignment_3_1_0(), "rule__Policy__UsesSensorsAssignment_3_1_0");
					put(grammarAccess.getPolicyAccess().getUsesSensorsAssignment_3_1_1_1(), "rule__Policy__UsesSensorsAssignment_3_1_1_1");
					put(grammarAccess.getPolicyAccess().getUsesAssignment_4_1_0(), "rule__Policy__UsesAssignment_4_1_0");
					put(grammarAccess.getPolicyAccess().getUsesAssignment_4_1_1_1(), "rule__Policy__UsesAssignment_4_1_1_1");
					put(grammarAccess.getPolicyAccess().getSpecifiedByAssignment_5_2_0(), "rule__Policy__SpecifiedByAssignment_5_2_0");
					put(grammarAccess.getPolicyAccess().getSpecifiedByAssignment_5_2_1(), "rule__Policy__SpecifiedByAssignment_5_2_1");
					put(grammarAccess.getBuildingAccess().getNameAssignment_2(), "rule__Building__NameAssignment_2");
					put(grammarAccess.getBuildingAccess().getCtsSystemAssignment_4(), "rule__Building__CtsSystemAssignment_4");
					put(grammarAccess.getBuildingAccess().getAccessControlAssignment_5(), "rule__Building__AccessControlAssignment_5");
					put(grammarAccess.getBuildingAccess().getCalendarSystemAssignment_6(), "rule__Building__CalendarSystemAssignment_6");
					put(grammarAccess.getBuildingAccess().getMeetingScheduleSystemAssignment_7(), "rule__Building__MeetingScheduleSystemAssignment_7");
					put(grammarAccess.getBuildingAccess().getFloorsAssignment_8_0(), "rule__Building__FloorsAssignment_8_0");
					put(grammarAccess.getBuildingAccess().getFloorsAssignment_8_1(), "rule__Building__FloorsAssignment_8_1");
					put(grammarAccess.getFloorAccess().getNameAssignment_2(), "rule__Floor__NameAssignment_2");
					put(grammarAccess.getFloorAccess().getRoomsAssignment_4_1(), "rule__Floor__RoomsAssignment_4_1");
					put(grammarAccess.getFloorAccess().getRoomsAssignment_4_2_1(), "rule__Floor__RoomsAssignment_4_2_1");
					put(grammarAccess.getRoomAccess().getNameAssignment_1(), "rule__Room__NameAssignment_1");
					put(grammarAccess.getRoomAccess().getExtendsAssignment_2_1(), "rule__Room__ExtendsAssignment_2_1");
					put(grammarAccess.getRoomAccess().getExtendsAssignment_2_2(), "rule__Room__ExtendsAssignment_2_2");
					put(grammarAccess.getRoomAccess().getDeclareSensorAssignment_3_1_0(), "rule__Room__DeclareSensorAssignment_3_1_0");
					put(grammarAccess.getRoomAccess().getDeclareSensorAssignment_3_1_1(), "rule__Room__DeclareSensorAssignment_3_1_1");
					put(grammarAccess.getRoomAccess().getDeclareActuatorAssignment_3_2_0(), "rule__Room__DeclareActuatorAssignment_3_2_0");
					put(grammarAccess.getRoomAccess().getDeclareActuatorAssignment_3_2_1(), "rule__Room__DeclareActuatorAssignment_3_2_1");
					put(grammarAccess.getCTSAccess().getTemperatureSensorsAssignment_3_2(), "rule__CTS__TemperatureSensorsAssignment_3_2");
					put(grammarAccess.getCTSAccess().getTemperatureSensorsAssignment_3_3_1(), "rule__CTS__TemperatureSensorsAssignment_3_3_1");
					put(grammarAccess.getCTSAccess().getCtsActuatorsAssignment_4_2(), "rule__CTS__CtsActuatorsAssignment_4_2");
					put(grammarAccess.getCTSAccess().getCtsActuatorsAssignment_4_3_1(), "rule__CTS__CtsActuatorsAssignment_4_3_1");
					put(grammarAccess.getAccessControlAccess().getAccessControlSensorsAssignment_3_2(), "rule__AccessControl__AccessControlSensorsAssignment_3_2");
					put(grammarAccess.getAccessControlAccess().getAccessControlSensorsAssignment_3_3_1(), "rule__AccessControl__AccessControlSensorsAssignment_3_3_1");
					put(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorAssignment_4_2(), "rule__AccessControl__AccessControlDoorLockActuatorAssignment_4_2");
					put(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorAssignment_4_3_1(), "rule__AccessControl__AccessControlDoorLockActuatorAssignment_4_3_1");
					put(grammarAccess.getMotionSensorAccess().getValueStateAssignment_2_3(), "rule__MotionSensor__ValueStateAssignment_2_3");
					put(grammarAccess.getTemperatureSensorAccess().getValueStateAssignment_2_3(), "rule__TemperatureSensor__ValueStateAssignment_2_3");
					put(grammarAccess.getPressureSensorAccess().getValueStateAssignment_2_3(), "rule__PressureSensor__ValueStateAssignment_2_3");
					put(grammarAccess.getTouchSensorAccess().getValueStateAssignment_2_3(), "rule__TouchSensor__ValueStateAssignment_2_3");
					put(grammarAccess.getLightSensorAccess().getValueStateAssignment_2_3(), "rule__LightSensor__ValueStateAssignment_2_3");
					put(grammarAccess.getSmokeSensorAccess().getValueStateAssignment_2_3(), "rule__SmokeSensor__ValueStateAssignment_2_3");
					put(grammarAccess.getCO2SensorAccess().getValueStateAssignment_2_3(), "rule__CO2Sensor__ValueStateAssignment_2_3");
					put(grammarAccess.getInfraredLightSensorAccess().getValueStateAssignment_2_3(), "rule__InfraredLightSensor__ValueStateAssignment_2_3");
					put(grammarAccess.getHasIntegerValue_ImplAccess().getValueStateAssignment_2_3(), "rule__HasIntegerValue_Impl__ValueStateAssignment_2_3");
					put(grammarAccess.getHumiditySensorAccess().getValueStateAssignment_2_3(), "rule__HumiditySensor__ValueStateAssignment_2_3");
					put(grammarAccess.getLightSwitchActuatorAccess().getValueStateAssignment_2_3(), "rule__LightSwitchActuator__ValueStateAssignment_2_3");
					put(grammarAccess.getWindowActuatorAccess().getValueStateAssignment_2_3(), "rule__WindowActuator__ValueStateAssignment_2_3");
					put(grammarAccess.getHumidifierActuatorAccess().getValueStateAssignment_2_3(), "rule__HumidifierActuator__ValueStateAssignment_2_3");
					put(grammarAccess.getDoorActuatorAccess().getValueStateAssignment_2_3(), "rule__DoorActuator__ValueStateAssignment_2_3");
					put(grammarAccess.getRadiatorActuatorAccess().getValueStateAssignment_2_3(), "rule__RadiatorActuator__ValueStateAssignment_2_3");
					put(grammarAccess.getAudioAlarmActuatorAccess().getValueStateAssignment_2_3(), "rule__AudioAlarmActuator__ValueStateAssignment_2_3");
					put(grammarAccess.getHasIntegerValueAccess().getValueStateAssignment_2_3(), "rule__HasIntegerValue__ValueStateAssignment_2_3");
					put(grammarAccess.getSensorComponentAccess().getNameAssignment_2(), "rule__SensorComponent__NameAssignment_2");
					put(grammarAccess.getSensorComponentAccess().getSensorsAssignment_3_1(), "rule__SensorComponent__SensorsAssignment_3_1");
					put(grammarAccess.getSensorComponentAccess().getSensorsAssignment_3_2(), "rule__SensorComponent__SensorsAssignment_3_2");
					put(grammarAccess.getActuatorComponentAccess().getNameAssignment_2(), "rule__ActuatorComponent__NameAssignment_2");
					put(grammarAccess.getActuatorComponentAccess().getActuatorsAssignment_3_1(), "rule__ActuatorComponent__ActuatorsAssignment_3_1");
					put(grammarAccess.getActuatorComponentAccess().getActuatorsAssignment_3_2(), "rule__ActuatorComponent__ActuatorsAssignment_3_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.itu.mdd.policyengine.ui.contentassist.antlr.internal.InternalPolicyEngineDslParser typedParser = (dk.itu.mdd.policyengine.ui.contentassist.antlr.internal.InternalPolicyEngineDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PolicyEngineDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PolicyEngineDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
