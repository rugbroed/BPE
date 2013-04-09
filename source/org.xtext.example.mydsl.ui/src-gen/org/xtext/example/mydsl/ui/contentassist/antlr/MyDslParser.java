/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
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
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getModelAccess().getGroup_5(), "rule__Model__Group_5__0");
					put(grammarAccess.getModelAccess().getGroup_6(), "rule__Model__Group_6__0");
					put(grammarAccess.getModelAccess().getGroup_7(), "rule__Model__Group_7__0");
					put(grammarAccess.getBuildingAccess().getGroup(), "rule__Building__Group__0");
					put(grammarAccess.getBuildingAccess().getGroup_4(), "rule__Building__Group_4__0");
					put(grammarAccess.getBuildingAccess().getGroup_5(), "rule__Building__Group_5__0");
					put(grammarAccess.getBuildingAccess().getGroup_6(), "rule__Building__Group_6__0");
					put(grammarAccess.getBuildingAccess().getGroup_7(), "rule__Building__Group_7__0");
					put(grammarAccess.getBuildingAccess().getGroup_8(), "rule__Building__Group_8__0");
					put(grammarAccess.getBuildingAccess().getGroup_9(), "rule__Building__Group_9__0");
					put(grammarAccess.getBuildingAccess().getGroup_10(), "rule__Building__Group_10__0");
					put(grammarAccess.getModelDefinedComponentsAccess().getGroup(), "rule__ModelDefinedComponents__Group__0");
					put(grammarAccess.getModelDefinedComponentsAccess().getGroup_4(), "rule__ModelDefinedComponents__Group_4__0");
					put(grammarAccess.getLightSwitchActuatorAccess().getGroup(), "rule__LightSwitchActuator__Group__0");
					put(grammarAccess.getLightSwitchActuatorAccess().getGroup_4(), "rule__LightSwitchActuator__Group_4__0");
					put(grammarAccess.getWindowActuatorAccess().getGroup(), "rule__WindowActuator__Group__0");
					put(grammarAccess.getWindowActuatorAccess().getGroup_4(), "rule__WindowActuator__Group_4__0");
					put(grammarAccess.getHumidifierActuatorAccess().getGroup(), "rule__HumidifierActuator__Group__0");
					put(grammarAccess.getHumidifierActuatorAccess().getGroup_4(), "rule__HumidifierActuator__Group_4__0");
					put(grammarAccess.getDoorActuatorAccess().getGroup(), "rule__DoorActuator__Group__0");
					put(grammarAccess.getDoorActuatorAccess().getGroup_4(), "rule__DoorActuator__Group_4__0");
					put(grammarAccess.getSMSActuatorAccess().getGroup(), "rule__SMSActuator__Group__0");
					put(grammarAccess.getSMSActuatorAccess().getGroup_4(), "rule__SMSActuator__Group_4__0");
					put(grammarAccess.getRadiatorActuatorAccess().getGroup(), "rule__RadiatorActuator__Group__0");
					put(grammarAccess.getRadiatorActuatorAccess().getGroup_4(), "rule__RadiatorActuator__Group_4__0");
					put(grammarAccess.getDatabaseActuatorAccess().getGroup(), "rule__DatabaseActuator__Group__0");
					put(grammarAccess.getDatabaseActuatorAccess().getGroup_4(), "rule__DatabaseActuator__Group_4__0");
					put(grammarAccess.getAudioAlarmActuatorAccess().getGroup(), "rule__AudioAlarmActuator__Group__0");
					put(grammarAccess.getAudioAlarmActuatorAccess().getGroup_4(), "rule__AudioAlarmActuator__Group_4__0");
					put(grammarAccess.getSetsOpenCloseState_ImplAccess().getGroup(), "rule__SetsOpenCloseState_Impl__Group__0");
					put(grammarAccess.getSetsOpenCloseState_ImplAccess().getGroup_4(), "rule__SetsOpenCloseState_Impl__Group_4__0");
					put(grammarAccess.getSetsOnOffState_ImplAccess().getGroup(), "rule__SetsOnOffState_Impl__Group__0");
					put(grammarAccess.getSetsOnOffState_ImplAccess().getGroup_4(), "rule__SetsOnOffState_Impl__Group_4__0");
					put(grammarAccess.getSetStringState_ImplAccess().getGroup(), "rule__SetStringState_Impl__Group__0");
					put(grammarAccess.getSetStringState_ImplAccess().getGroup_4(), "rule__SetStringState_Impl__Group_4__0");
					put(grammarAccess.getMotionSensorAccess().getGroup(), "rule__MotionSensor__Group__0");
					put(grammarAccess.getTemperatureSensorAccess().getGroup(), "rule__TemperatureSensor__Group__0");
					put(grammarAccess.getTemperatureSensorAccess().getGroup_4(), "rule__TemperatureSensor__Group_4__0");
					put(grammarAccess.getPressureSensorAccess().getGroup(), "rule__PressureSensor__Group__0");
					put(grammarAccess.getPressureSensorAccess().getGroup_4(), "rule__PressureSensor__Group_4__0");
					put(grammarAccess.getTouchSensorAccess().getGroup(), "rule__TouchSensor__Group__0");
					put(grammarAccess.getLightSensorAccess().getGroup(), "rule__LightSensor__Group__0");
					put(grammarAccess.getLightSensorAccess().getGroup_4(), "rule__LightSensor__Group_4__0");
					put(grammarAccess.getSmokeSensorAccess().getGroup(), "rule__SmokeSensor__Group__0");
					put(grammarAccess.getSmokeSensorAccess().getGroup_4(), "rule__SmokeSensor__Group_4__0");
					put(grammarAccess.getCO2SensorAccess().getGroup(), "rule__CO2Sensor__Group__0");
					put(grammarAccess.getCO2SensorAccess().getGroup_4(), "rule__CO2Sensor__Group_4__0");
					put(grammarAccess.getInfraredLightSensorAccess().getGroup(), "rule__InfraredLightSensor__Group__0");
					put(grammarAccess.getInfraredLightSensorAccess().getGroup_4(), "rule__InfraredLightSensor__Group_4__0");
					put(grammarAccess.getHasIntegerValue_ImplAccess().getGroup(), "rule__HasIntegerValue_Impl__Group__0");
					put(grammarAccess.getHasIntegerValue_ImplAccess().getGroup_4(), "rule__HasIntegerValue_Impl__Group_4__0");
					put(grammarAccess.getHasBooleanValue_ImplAccess().getGroup(), "rule__HasBooleanValue_Impl__Group__0");
					put(grammarAccess.getHumiditySensorAccess().getGroup(), "rule__HumiditySensor__Group__0");
					put(grammarAccess.getHumiditySensorAccess().getGroup_4(), "rule__HumiditySensor__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
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
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getComponentAccess().getGroup_4(), "rule__Component__Group_4__0");
					put(grammarAccess.getComponentAccess().getGroup_5(), "rule__Component__Group_5__0");
					put(grammarAccess.getComponentAccess().getGroup_6(), "rule__Component__Group_6__0");
					put(grammarAccess.getComponentAccess().getGroup_7(), "rule__Component__Group_7__0");
					put(grammarAccess.getModelAccess().getNameAssignment_2(), "rule__Model__NameAssignment_2");
					put(grammarAccess.getModelAccess().getActuatorsAssignment_4_1(), "rule__Model__ActuatorsAssignment_4_1");
					put(grammarAccess.getModelAccess().getSensorsAssignment_5_1(), "rule__Model__SensorsAssignment_5_1");
					put(grammarAccess.getModelAccess().getDefineComponentsAssignment_6_0(), "rule__Model__DefineComponentsAssignment_6_0");
					put(grammarAccess.getModelAccess().getDefineComponentsAssignment_6_1(), "rule__Model__DefineComponentsAssignment_6_1");
					put(grammarAccess.getModelAccess().getBuildingsAssignment_7_0(), "rule__Model__BuildingsAssignment_7_0");
					put(grammarAccess.getModelAccess().getBuildingsAssignment_7_1(), "rule__Model__BuildingsAssignment_7_1");
					put(grammarAccess.getBuildingAccess().getNameAssignment_2(), "rule__Building__NameAssignment_2");
					put(grammarAccess.getBuildingAccess().getActuatorsAssignment_4_1(), "rule__Building__ActuatorsAssignment_4_1");
					put(grammarAccess.getBuildingAccess().getSensorsAssignment_5_1(), "rule__Building__SensorsAssignment_5_1");
					put(grammarAccess.getBuildingAccess().getCtsSystemAssignment_6_1(), "rule__Building__CtsSystemAssignment_6_1");
					put(grammarAccess.getBuildingAccess().getAccessControlAssignment_7_1(), "rule__Building__AccessControlAssignment_7_1");
					put(grammarAccess.getBuildingAccess().getCalendarSystemAssignment_8_1(), "rule__Building__CalendarSystemAssignment_8_1");
					put(grammarAccess.getBuildingAccess().getMeetingScheduleSystemAssignment_9_1(), "rule__Building__MeetingScheduleSystemAssignment_9_1");
					put(grammarAccess.getBuildingAccess().getDeclareComponentsAssignment_10_0(), "rule__Building__DeclareComponentsAssignment_10_0");
					put(grammarAccess.getBuildingAccess().getDeclareComponentsAssignment_10_1(), "rule__Building__DeclareComponentsAssignment_10_1");
					put(grammarAccess.getModelDefinedComponentsAccess().getNameAssignment_2(), "rule__ModelDefinedComponents__NameAssignment_2");
					put(grammarAccess.getModelDefinedComponentsAccess().getDeclareComponentsAssignment_4_0(), "rule__ModelDefinedComponents__DeclareComponentsAssignment_4_0");
					put(grammarAccess.getModelDefinedComponentsAccess().getDeclareComponentsAssignment_4_1(), "rule__ModelDefinedComponents__DeclareComponentsAssignment_4_1");
					put(grammarAccess.getLightSwitchActuatorAccess().getNameAssignment_2(), "rule__LightSwitchActuator__NameAssignment_2");
					put(grammarAccess.getLightSwitchActuatorAccess().getValueStateAssignment_4_1(), "rule__LightSwitchActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getWindowActuatorAccess().getNameAssignment_2(), "rule__WindowActuator__NameAssignment_2");
					put(grammarAccess.getWindowActuatorAccess().getValueStateAssignment_4_1(), "rule__WindowActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getHumidifierActuatorAccess().getNameAssignment_2(), "rule__HumidifierActuator__NameAssignment_2");
					put(grammarAccess.getHumidifierActuatorAccess().getValueStateAssignment_4_1(), "rule__HumidifierActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getDoorActuatorAccess().getNameAssignment_2(), "rule__DoorActuator__NameAssignment_2");
					put(grammarAccess.getDoorActuatorAccess().getValueStateAssignment_4_1(), "rule__DoorActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getSMSActuatorAccess().getNameAssignment_2(), "rule__SMSActuator__NameAssignment_2");
					put(grammarAccess.getSMSActuatorAccess().getValueStateAssignment_4_1(), "rule__SMSActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getRadiatorActuatorAccess().getNameAssignment_2(), "rule__RadiatorActuator__NameAssignment_2");
					put(grammarAccess.getRadiatorActuatorAccess().getValueStateAssignment_4_1(), "rule__RadiatorActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getDatabaseActuatorAccess().getNameAssignment_2(), "rule__DatabaseActuator__NameAssignment_2");
					put(grammarAccess.getDatabaseActuatorAccess().getValueStateAssignment_4_1(), "rule__DatabaseActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getAudioAlarmActuatorAccess().getNameAssignment_2(), "rule__AudioAlarmActuator__NameAssignment_2");
					put(grammarAccess.getAudioAlarmActuatorAccess().getValueStateAssignment_4_1(), "rule__AudioAlarmActuator__ValueStateAssignment_4_1");
					put(grammarAccess.getSetsOpenCloseState_ImplAccess().getNameAssignment_2(), "rule__SetsOpenCloseState_Impl__NameAssignment_2");
					put(grammarAccess.getSetsOpenCloseState_ImplAccess().getValueStateAssignment_4_1(), "rule__SetsOpenCloseState_Impl__ValueStateAssignment_4_1");
					put(grammarAccess.getSetsOnOffState_ImplAccess().getNameAssignment_2(), "rule__SetsOnOffState_Impl__NameAssignment_2");
					put(grammarAccess.getSetsOnOffState_ImplAccess().getValueStateAssignment_4_1(), "rule__SetsOnOffState_Impl__ValueStateAssignment_4_1");
					put(grammarAccess.getSetStringState_ImplAccess().getNameAssignment_2(), "rule__SetStringState_Impl__NameAssignment_2");
					put(grammarAccess.getSetStringState_ImplAccess().getValueStateAssignment_4_1(), "rule__SetStringState_Impl__ValueStateAssignment_4_1");
					put(grammarAccess.getMotionSensorAccess().getValueStateAssignment_1(), "rule__MotionSensor__ValueStateAssignment_1");
					put(grammarAccess.getMotionSensorAccess().getNameAssignment_3(), "rule__MotionSensor__NameAssignment_3");
					put(grammarAccess.getTemperatureSensorAccess().getNameAssignment_2(), "rule__TemperatureSensor__NameAssignment_2");
					put(grammarAccess.getTemperatureSensorAccess().getValueStateAssignment_4_1(), "rule__TemperatureSensor__ValueStateAssignment_4_1");
					put(grammarAccess.getPressureSensorAccess().getNameAssignment_2(), "rule__PressureSensor__NameAssignment_2");
					put(grammarAccess.getPressureSensorAccess().getValueStateAssignment_4_1(), "rule__PressureSensor__ValueStateAssignment_4_1");
					put(grammarAccess.getTouchSensorAccess().getValueStateAssignment_1(), "rule__TouchSensor__ValueStateAssignment_1");
					put(grammarAccess.getTouchSensorAccess().getNameAssignment_3(), "rule__TouchSensor__NameAssignment_3");
					put(grammarAccess.getLightSensorAccess().getNameAssignment_2(), "rule__LightSensor__NameAssignment_2");
					put(grammarAccess.getLightSensorAccess().getValueStateAssignment_4_1(), "rule__LightSensor__ValueStateAssignment_4_1");
					put(grammarAccess.getSmokeSensorAccess().getNameAssignment_2(), "rule__SmokeSensor__NameAssignment_2");
					put(grammarAccess.getSmokeSensorAccess().getValueStateAssignment_4_1(), "rule__SmokeSensor__ValueStateAssignment_4_1");
					put(grammarAccess.getCO2SensorAccess().getNameAssignment_2(), "rule__CO2Sensor__NameAssignment_2");
					put(grammarAccess.getCO2SensorAccess().getValueStateAssignment_4_1(), "rule__CO2Sensor__ValueStateAssignment_4_1");
					put(grammarAccess.getInfraredLightSensorAccess().getNameAssignment_2(), "rule__InfraredLightSensor__NameAssignment_2");
					put(grammarAccess.getInfraredLightSensorAccess().getValueStateAssignment_4_1(), "rule__InfraredLightSensor__ValueStateAssignment_4_1");
					put(grammarAccess.getHasIntegerValue_ImplAccess().getNameAssignment_2(), "rule__HasIntegerValue_Impl__NameAssignment_2");
					put(grammarAccess.getHasIntegerValue_ImplAccess().getValueStateAssignment_4_1(), "rule__HasIntegerValue_Impl__ValueStateAssignment_4_1");
					put(grammarAccess.getHasBooleanValue_ImplAccess().getValueStateAssignment_1(), "rule__HasBooleanValue_Impl__ValueStateAssignment_1");
					put(grammarAccess.getHasBooleanValue_ImplAccess().getNameAssignment_3(), "rule__HasBooleanValue_Impl__NameAssignment_3");
					put(grammarAccess.getHumiditySensorAccess().getNameAssignment_2(), "rule__HumiditySensor__NameAssignment_2");
					put(grammarAccess.getHumiditySensorAccess().getValueStateAssignment_4_1(), "rule__HumiditySensor__ValueStateAssignment_4_1");
					put(grammarAccess.getCTSAccess().getTemperatureSensorsAssignment_3_2(), "rule__CTS__TemperatureSensorsAssignment_3_2");
					put(grammarAccess.getCTSAccess().getTemperatureSensorsAssignment_3_3_1(), "rule__CTS__TemperatureSensorsAssignment_3_3_1");
					put(grammarAccess.getCTSAccess().getCtsActuatorsAssignment_4_2(), "rule__CTS__CtsActuatorsAssignment_4_2");
					put(grammarAccess.getCTSAccess().getCtsActuatorsAssignment_4_3_1(), "rule__CTS__CtsActuatorsAssignment_4_3_1");
					put(grammarAccess.getAccessControlAccess().getAccessControlSensorsAssignment_3_2(), "rule__AccessControl__AccessControlSensorsAssignment_3_2");
					put(grammarAccess.getAccessControlAccess().getAccessControlSensorsAssignment_3_3_1(), "rule__AccessControl__AccessControlSensorsAssignment_3_3_1");
					put(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorAssignment_4_2(), "rule__AccessControl__AccessControlDoorLockActuatorAssignment_4_2");
					put(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorAssignment_4_3_1(), "rule__AccessControl__AccessControlDoorLockActuatorAssignment_4_3_1");
					put(grammarAccess.getComponentAccess().getNameAssignment_2(), "rule__Component__NameAssignment_2");
					put(grammarAccess.getComponentAccess().getSensorsAssignment_4_1(), "rule__Component__SensorsAssignment_4_1");
					put(grammarAccess.getComponentAccess().getActuatorsAssignment_5_1(), "rule__Component__ActuatorsAssignment_5_1");
					put(grammarAccess.getComponentAccess().getDeclareComponentsAssignment_6_0(), "rule__Component__DeclareComponentsAssignment_6_0");
					put(grammarAccess.getComponentAccess().getDeclareComponentsAssignment_6_1(), "rule__Component__DeclareComponentsAssignment_6_1");
					put(grammarAccess.getComponentAccess().getExtendsAssignment_7_1(), "rule__Component__ExtendsAssignment_7_1");
					put(grammarAccess.getComponentAccess().getExtendsAssignment_7_2(), "rule__Component__ExtendsAssignment_7_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
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
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}