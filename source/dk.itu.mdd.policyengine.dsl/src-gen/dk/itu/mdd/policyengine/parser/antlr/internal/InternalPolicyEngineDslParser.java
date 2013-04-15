package dk.itu.mdd.policyengine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.mdd.policyengine.services.PolicyEngineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolicyEngineDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'room-type'", "'}'", "'schedule'", "'days'", "','", "'from'", "'to'", "':'", "'-'", "'state'", "'='", "'policy'", "'uses sensors'", "'uses actuators'", "'is specified by'", "'building'", "'floor'", "'room'", "'is of type'", "'CTS'", "'temperatureSensors'", "'ctsActuators'", "'AccessControl'", "'accessControlSensors'", "'accessControlDoorLockActuator'", "'CalendarSystem'", "'MeetingScheduleSystem'", "'MotionSensor'", "'valueState'", "'TemperatureSensor'", "'PressureSensor'", "'TouchSensor'", "'LightSensor'", "'SmokeSensor'", "'CO2Sensor'", "'InfraredLightSensor'", "'HumiditySensor'", "'LightSwitchActuator'", "'WindowActuator'", "'HumidifierActuator'", "'DoorActuator'", "'RadiatorActuator'", "'AudioAlarmActuator'", "'sensor '", "'is a '", "'actuator'", "'Conditions'", "'true'", "'false'", "'MONDAY'", "'TUESDAY'", "'WEDENSDAY'", "'THURSDAY'", "'FRIDAY'", "'SATURDAY'", "'SUNDAY'"
    };
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPolicyEngineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPolicyEngineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPolicyEngineDslParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g"; }



     	private PolicyEngineDslGrammarAccess grammarAccess;
     	
        public InternalPolicyEngineDslParser(TokenStream input, PolicyEngineDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PolicyEngineDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:77:1: ruleModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) ( (lv_predefinedRooms_11_0= ruleRoom ) )* )? ( ( (lv_buildings_12_0= ruleBuilding ) ) ( (lv_buildings_13_0= ruleBuilding ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_stateDefinition_3_0 = null;

        EObject lv_stateDefinition_4_0 = null;

        EObject lv_policyDefinition_5_0 = null;

        EObject lv_policyDefinition_6_0 = null;

        EObject lv_schedules_7_0 = null;

        EObject lv_schedules_8_0 = null;

        EObject lv_predefinedRooms_10_0 = null;

        EObject lv_predefinedRooms_11_0 = null;

        EObject lv_buildings_12_0 = null;

        EObject lv_buildings_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) ( (lv_predefinedRooms_11_0= ruleRoom ) )* )? ( ( (lv_buildings_12_0= ruleBuilding ) ) ( (lv_buildings_13_0= ruleBuilding ) )* )? otherlv_14= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) ( (lv_predefinedRooms_11_0= ruleRoom ) )* )? ( ( (lv_buildings_12_0= ruleBuilding ) ) ( (lv_buildings_13_0= ruleBuilding ) )* )? otherlv_14= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) ( (lv_predefinedRooms_11_0= ruleRoom ) )* )? ( ( (lv_buildings_12_0= ruleBuilding ) ) ( (lv_buildings_13_0= ruleBuilding ) )* )? otherlv_14= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) ( (lv_predefinedRooms_11_0= ruleRoom ) )* )? ( ( (lv_buildings_12_0= ruleBuilding ) ) ( (lv_buildings_13_0= ruleBuilding ) )* )? otherlv_14= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:87:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:88:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:88:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:89:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModel140);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel152); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:109:1: ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:109:2: ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:109:2: ( (lv_stateDefinition_3_0= ruleState ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:110:1: (lv_stateDefinition_3_0= ruleState )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:110:1: (lv_stateDefinition_3_0= ruleState )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:111:3: lv_stateDefinition_3_0= ruleState
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getStateDefinitionStateParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleModel174);
                    lv_stateDefinition_3_0=ruleState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"stateDefinition",
                            		lv_stateDefinition_3_0, 
                            		"State");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:127:2: ( (lv_stateDefinition_4_0= ruleState ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==21) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:128:1: (lv_stateDefinition_4_0= ruleState )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:128:1: (lv_stateDefinition_4_0= ruleState )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:129:3: lv_stateDefinition_4_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getStateDefinitionStateParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleModel195);
                    	    lv_stateDefinition_4_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"stateDefinition",
                    	            		lv_stateDefinition_4_0, 
                    	            		"State");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:145:5: ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:145:6: ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:145:6: ( (lv_policyDefinition_5_0= rulePolicy ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:146:1: (lv_policyDefinition_5_0= rulePolicy )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:146:1: (lv_policyDefinition_5_0= rulePolicy )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:147:3: lv_policyDefinition_5_0= rulePolicy
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPolicyDefinitionPolicyParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePolicy_in_ruleModel220);
                    lv_policyDefinition_5_0=rulePolicy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"policyDefinition",
                            		lv_policyDefinition_5_0, 
                            		"Policy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:163:2: ( (lv_policyDefinition_6_0= rulePolicy ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==23) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:164:1: (lv_policyDefinition_6_0= rulePolicy )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:164:1: (lv_policyDefinition_6_0= rulePolicy )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:165:3: lv_policyDefinition_6_0= rulePolicy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPolicyDefinitionPolicyParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePolicy_in_ruleModel241);
                    	    lv_policyDefinition_6_0=rulePolicy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"policyDefinition",
                    	            		lv_policyDefinition_6_0, 
                    	            		"Policy");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:181:5: ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:181:6: ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:181:6: ( (lv_schedules_7_0= ruleSchedule ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:182:1: (lv_schedules_7_0= ruleSchedule )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:182:1: (lv_schedules_7_0= ruleSchedule )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:183:3: lv_schedules_7_0= ruleSchedule
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getSchedulesScheduleParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSchedule_in_ruleModel266);
                    lv_schedules_7_0=ruleSchedule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"schedules",
                            		lv_schedules_7_0, 
                            		"Schedule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:199:2: ( (lv_schedules_8_0= ruleSchedule ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:200:1: (lv_schedules_8_0= ruleSchedule )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:200:1: (lv_schedules_8_0= ruleSchedule )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:201:3: lv_schedules_8_0= ruleSchedule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getSchedulesScheduleParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSchedule_in_ruleModel287);
                    	    lv_schedules_8_0=ruleSchedule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"schedules",
                    	            		lv_schedules_8_0, 
                    	            		"Schedule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:217:5: (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) ( (lv_predefinedRooms_11_0= ruleRoom ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:217:7: otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) ( (lv_predefinedRooms_11_0= ruleRoom ) )*
                    {
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel303); 

                        	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRoomTypeKeyword_6_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:221:1: ( (lv_predefinedRooms_10_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:222:1: (lv_predefinedRooms_10_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:222:1: (lv_predefinedRooms_10_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:223:3: lv_predefinedRooms_10_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel324);
                    lv_predefinedRooms_10_0=ruleRoom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"predefinedRooms",
                            		lv_predefinedRooms_10_0, 
                            		"Room");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:239:2: ( (lv_predefinedRooms_11_0= ruleRoom ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:240:1: (lv_predefinedRooms_11_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:240:1: (lv_predefinedRooms_11_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:241:3: lv_predefinedRooms_11_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel345);
                    	    lv_predefinedRooms_11_0=ruleRoom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"predefinedRooms",
                    	            		lv_predefinedRooms_11_0, 
                    	            		"Room");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:257:5: ( ( (lv_buildings_12_0= ruleBuilding ) ) ( (lv_buildings_13_0= ruleBuilding ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:257:6: ( (lv_buildings_12_0= ruleBuilding ) ) ( (lv_buildings_13_0= ruleBuilding ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:257:6: ( (lv_buildings_12_0= ruleBuilding ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:258:1: (lv_buildings_12_0= ruleBuilding )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:258:1: (lv_buildings_12_0= ruleBuilding )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:259:3: lv_buildings_12_0= ruleBuilding
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel370);
                    lv_buildings_12_0=ruleBuilding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"buildings",
                            		lv_buildings_12_0, 
                            		"Building");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:275:2: ( (lv_buildings_13_0= ruleBuilding ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:276:1: (lv_buildings_13_0= ruleBuilding )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:276:1: (lv_buildings_13_0= ruleBuilding )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:277:3: lv_buildings_13_0= ruleBuilding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel391);
                    	    lv_buildings_13_0=ruleBuilding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"buildings",
                    	            		lv_buildings_13_0, 
                    	            		"Building");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel406); 

                	newLeafNode(otherlv_14, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:305:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:306:2: (iv_ruleActuator= ruleActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:307:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator442);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:314:1: ruleActuator returns [EObject current=null] : (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_LightSwitchActuator_0 = null;

        EObject this_WindowActuator_1 = null;

        EObject this_HumidifierActuator_2 = null;

        EObject this_DoorActuator_3 = null;

        EObject this_RadiatorActuator_4 = null;

        EObject this_AudioAlarmActuator_5 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:317:28: ( (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:318:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:318:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt11=1;
                }
                break;
            case 50:
                {
                alt11=2;
                }
                break;
            case 51:
                {
                alt11=3;
                }
                break;
            case 52:
                {
                alt11=4;
                }
                break;
            case 53:
                {
                alt11=5;
                }
                break;
            case 54:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:319:5: this_LightSwitchActuator_0= ruleLightSwitchActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getLightSwitchActuatorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_ruleActuator499);
                    this_LightSwitchActuator_0=ruleLightSwitchActuator();

                    state._fsp--;

                     
                            current = this_LightSwitchActuator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:329:5: this_WindowActuator_1= ruleWindowActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getWindowActuatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_ruleActuator526);
                    this_WindowActuator_1=ruleWindowActuator();

                    state._fsp--;

                     
                            current = this_WindowActuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:339:5: this_HumidifierActuator_2= ruleHumidifierActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getHumidifierActuatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_ruleActuator553);
                    this_HumidifierActuator_2=ruleHumidifierActuator();

                    state._fsp--;

                     
                            current = this_HumidifierActuator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:349:5: this_DoorActuator_3= ruleDoorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getDoorActuatorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_ruleActuator580);
                    this_DoorActuator_3=ruleDoorActuator();

                    state._fsp--;

                     
                            current = this_DoorActuator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:359:5: this_RadiatorActuator_4= ruleRadiatorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getRadiatorActuatorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_ruleActuator607);
                    this_RadiatorActuator_4=ruleRadiatorActuator();

                    state._fsp--;

                     
                            current = this_RadiatorActuator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:369:5: this_AudioAlarmActuator_5= ruleAudioAlarmActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getAudioAlarmActuatorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_ruleActuator634);
                    this_AudioAlarmActuator_5=ruleAudioAlarmActuator();

                    state._fsp--;

                     
                            current = this_AudioAlarmActuator_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:385:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:386:2: (iv_ruleSensor= ruleSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:387:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor669);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor679); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:394:1: ruleSensor returns [EObject current=null] : (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_MotionSensor_0 = null;

        EObject this_TemperatureSensor_1 = null;

        EObject this_PressureSensor_2 = null;

        EObject this_TouchSensor_3 = null;

        EObject this_LightSensor_4 = null;

        EObject this_SmokeSensor_5 = null;

        EObject this_CO2Sensor_6 = null;

        EObject this_InfraredLightSensor_7 = null;

        EObject this_HumiditySensor_8 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:397:28: ( (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:398:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:398:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 42:
                {
                alt12=3;
                }
                break;
            case 43:
                {
                alt12=4;
                }
                break;
            case 44:
                {
                alt12=5;
                }
                break;
            case 45:
                {
                alt12=6;
                }
                break;
            case 46:
                {
                alt12=7;
                }
                break;
            case 47:
                {
                alt12=8;
                }
                break;
            case 48:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:399:5: this_MotionSensor_0= ruleMotionSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getMotionSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_ruleSensor726);
                    this_MotionSensor_0=ruleMotionSensor();

                    state._fsp--;

                     
                            current = this_MotionSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:409:5: this_TemperatureSensor_1= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTemperatureSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleSensor753);
                    this_TemperatureSensor_1=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:419:5: this_PressureSensor_2= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getPressureSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleSensor780);
                    this_PressureSensor_2=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:429:5: this_TouchSensor_3= ruleTouchSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTouchSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_ruleSensor807);
                    this_TouchSensor_3=ruleTouchSensor();

                    state._fsp--;

                     
                            current = this_TouchSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:439:5: this_LightSensor_4= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleSensor834);
                    this_LightSensor_4=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:449:5: this_SmokeSensor_5= ruleSmokeSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getSmokeSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_ruleSensor861);
                    this_SmokeSensor_5=ruleSmokeSensor();

                    state._fsp--;

                     
                            current = this_SmokeSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:459:5: this_CO2Sensor_6= ruleCO2Sensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getCO2SensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_ruleSensor888);
                    this_CO2Sensor_6=ruleCO2Sensor();

                    state._fsp--;

                     
                            current = this_CO2Sensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:469:5: this_InfraredLightSensor_7= ruleInfraredLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getInfraredLightSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_ruleSensor915);
                    this_InfraredLightSensor_7=ruleInfraredLightSensor();

                    state._fsp--;

                     
                            current = this_InfraredLightSensor_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:479:5: this_HumiditySensor_8= ruleHumiditySensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getHumiditySensorParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_ruleSensor942);
                    this_HumiditySensor_8=ruleHumiditySensor();

                    state._fsp--;

                     
                            current = this_HumiditySensor_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSchedule"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:495:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:496:2: (iv_ruleSchedule= ruleSchedule EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:497:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchedule_in_entryRuleSchedule977);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSchedule987); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:504:1: ruleSchedule returns [EObject current=null] : ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_weekdays_4_0 = null;

        Enumerator lv_weekdays_6_0 = null;

        EObject lv_from_8_0 = null;

        EObject lv_to_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:507:28: ( ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:508:1: ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:508:1: ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:508:2: () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:508:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:509:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getScheduleAccess().getScheduleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSchedule1033); 

                	newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getScheduleKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:518:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:519:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:519:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:520:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScheduleAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSchedule1054);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:536:2: (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:536:4: otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )*
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSchedule1067); 

                        	newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getDaysKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:540:1: ( (lv_weekdays_4_0= ruleWeekdays ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:541:1: (lv_weekdays_4_0= ruleWeekdays )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:541:1: (lv_weekdays_4_0= ruleWeekdays )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:542:3: lv_weekdays_4_0= ruleWeekdays
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduleAccess().getWeekdaysWeekdaysEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWeekdays_in_ruleSchedule1088);
                    lv_weekdays_4_0=ruleWeekdays();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScheduleRule());
                    	        }
                           		add(
                           			current, 
                           			"weekdays",
                            		lv_weekdays_4_0, 
                            		"Weekdays");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:558:2: (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:558:4: otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchedule1101); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getScheduleAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:562:1: ( (lv_weekdays_6_0= ruleWeekdays ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:563:1: (lv_weekdays_6_0= ruleWeekdays )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:563:1: (lv_weekdays_6_0= ruleWeekdays )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:564:3: lv_weekdays_6_0= ruleWeekdays
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScheduleAccess().getWeekdaysWeekdaysEnumRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWeekdays_in_ruleSchedule1122);
                    	    lv_weekdays_6_0=ruleWeekdays();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScheduleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"weekdays",
                    	            		lv_weekdays_6_0, 
                    	            		"Weekdays");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:580:6: (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:580:8: otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) )
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSchedule1139); 

                        	newLeafNode(otherlv_7, grammarAccess.getScheduleAccess().getFromKeyword_4_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:584:1: ( (lv_from_8_0= ruleTime ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:585:1: (lv_from_8_0= ruleTime )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:585:1: (lv_from_8_0= ruleTime )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:586:3: lv_from_8_0= ruleTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduleAccess().getFromTimeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleSchedule1160);
                    lv_from_8_0=ruleTime();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScheduleRule());
                    	        }
                           		set(
                           			current, 
                           			"from",
                            		lv_from_8_0, 
                            		"Time");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSchedule1172); 

                        	newLeafNode(otherlv_9, grammarAccess.getScheduleAccess().getToKeyword_4_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:606:1: ( (lv_to_10_0= ruleTime ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:607:1: (lv_to_10_0= ruleTime )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:607:1: (lv_to_10_0= ruleTime )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:608:3: lv_to_10_0= ruleTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduleAccess().getToTimeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleSchedule1193);
                    lv_to_10_0=ruleTime();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScheduleRule());
                    	        }
                           		set(
                           			current, 
                           			"to",
                            		lv_to_10_0, 
                            		"Time");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleTime"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:632:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:633:2: (iv_ruleTime= ruleTime EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:634:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime1231);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime1241); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:641:1: ruleTime returns [EObject current=null] : ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_hours_1_0 = null;

        AntlrDatatypeRuleToken lv_minutes_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:644:28: ( ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:1: ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:1: ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:2: () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:646:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeAccess().getTimeAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:651:2: ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:651:3: ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:651:3: ( (lv_hours_1_0= ruleEShort ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:652:1: (lv_hours_1_0= ruleEShort )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:652:1: (lv_hours_1_0= ruleEShort )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:653:3: lv_hours_1_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeAccess().getHoursEShortParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleTime1297);
                    lv_hours_1_0=ruleEShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTimeRule());
                    	        }
                           		set(
                           			current, 
                           			"hours",
                            		lv_hours_1_0, 
                            		"EShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTime1309); 

                        	newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getColonKeyword_1_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:673:1: ( (lv_minutes_3_0= ruleEShort ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:674:1: (lv_minutes_3_0= ruleEShort )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:674:1: (lv_minutes_3_0= ruleEShort )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:675:3: lv_minutes_3_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeAccess().getMinutesEShortParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleTime1330);
                    lv_minutes_3_0=ruleEShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTimeRule());
                    	        }
                           		set(
                           			current, 
                           			"minutes",
                            		lv_minutes_3_0, 
                            		"EShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleEShort"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:699:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:700:2: (iv_ruleEShort= ruleEShort EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:701:2: iv_ruleEShort= ruleEShort EOF
            {
             newCompositeNode(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort1369);
            iv_ruleEShort=ruleEShort();

            state._fsp--;

             current =iv_ruleEShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort1380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEShort"


    // $ANTLR start "ruleEShort"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:708:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:711:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:712:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:712:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:712:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:712:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:713:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEShort1419); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEShort1436); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEShortAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEShort"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:733:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:734:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:735:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1482);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1493); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:742:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:745:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:746:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:746:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:746:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1533); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:754:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1559); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:769:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:770:2: (iv_ruleState= ruleState EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:771:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1604);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1614); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:778:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valueState_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:781:28: ( ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:782:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:782:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:782:2: () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:782:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:783:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleState1660); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:792:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:793:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:793:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:794:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1681);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:810:2: ( (lv_valueState_3_0= '=' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:811:1: (lv_valueState_3_0= '=' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:811:1: (lv_valueState_3_0= '=' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:812:3: lv_valueState_3_0= '='
            {
            lv_valueState_3_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState1699); 

                    newLeafNode(lv_valueState_3_0, grammarAccess.getStateAccess().getValueStateEqualsSignKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(current, "valueState", true, "=");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getStateAccess().getEBooleanParserRuleCall_4()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleState1728);
            ruleEBoolean();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRulePolicy"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:841:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:842:2: (iv_rulePolicy= rulePolicy EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:843:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePolicy_in_entryRulePolicy1763);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePolicy1773); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:850:1: rulePolicy returns [EObject current=null] : ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_usesSensors_4_0 = null;

        EObject lv_usesSensors_6_0 = null;

        EObject lv_uses_8_0 = null;

        EObject lv_uses_10_0 = null;

        EObject lv_specifiedBy_13_0 = null;

        EObject lv_specifiedBy_14_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:853:28: ( ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:854:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:854:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:854:2: () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:854:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:855:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolicyAccess().getPolicyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePolicy1819); 

                	newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getPolicyKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:864:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:865:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:865:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:866:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPolicyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePolicy1840);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:882:2: (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:882:4: otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )?
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePolicy1853); 

                        	newLeafNode(otherlv_3, grammarAccess.getPolicyAccess().getUsesSensorsKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:886:1: ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==39||(LA20_0>=41 && LA20_0<=48)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:886:2: ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:886:2: ( (lv_usesSensors_4_0= ruleSensor ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:887:1: (lv_usesSensors_4_0= ruleSensor )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:887:1: (lv_usesSensors_4_0= ruleSensor )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:888:3: lv_usesSensors_4_0= ruleSensor
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy1875);
                            lv_usesSensors_4_0=ruleSensor();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPolicyRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"usesSensors",
                                    		lv_usesSensors_4_0, 
                                    		"Sensor");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:904:2: (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==16) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:904:4: otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) )
                            	    {
                            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePolicy1888); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:908:1: ( (lv_usesSensors_6_0= ruleSensor ) )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:909:1: (lv_usesSensors_6_0= ruleSensor )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:909:1: (lv_usesSensors_6_0= ruleSensor )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:910:3: lv_usesSensors_6_0= ruleSensor
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy1909);
                            	    lv_usesSensors_6_0=ruleSensor();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"usesSensors",
                            	            		lv_usesSensors_6_0, 
                            	            		"Sensor");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:926:8: (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:926:10: otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )?
                    {
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePolicy1928); 

                        	newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getUsesActuatorsKeyword_4_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:930:1: ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=49 && LA23_0<=54)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:930:2: ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:930:2: ( (lv_uses_8_0= ruleActuator ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:931:1: (lv_uses_8_0= ruleActuator )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:931:1: (lv_uses_8_0= ruleActuator )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:932:3: lv_uses_8_0= ruleActuator
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1950);
                            lv_uses_8_0=ruleActuator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPolicyRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"uses",
                                    		lv_uses_8_0, 
                                    		"Actuator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:948:2: (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==16) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:948:4: otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) )
                            	    {
                            	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePolicy1963); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getCommaKeyword_4_1_1_0());
                            	        
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:952:1: ( (lv_uses_10_0= ruleActuator ) )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:953:1: (lv_uses_10_0= ruleActuator )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:953:1: (lv_uses_10_0= ruleActuator )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:954:3: lv_uses_10_0= ruleActuator
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_4_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1984);
                            	    lv_uses_10_0=ruleActuator();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"uses",
                            	            		lv_uses_10_0, 
                            	            		"Actuator");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:970:8: (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:970:10: otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePolicy2003); 

                        	newLeafNode(otherlv_11, grammarAccess.getPolicyAccess().getIsSpecifiedByKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePolicy2015); 

                        	newLeafNode(otherlv_12, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:978:1: ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==58) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:978:2: ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )*
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:978:2: ( (lv_specifiedBy_13_0= ruleConditions ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:979:1: (lv_specifiedBy_13_0= ruleConditions )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:979:1: (lv_specifiedBy_13_0= ruleConditions )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:980:3: lv_specifiedBy_13_0= ruleConditions
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_5_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy2037);
                            lv_specifiedBy_13_0=ruleConditions();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPolicyRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"specifiedBy",
                                    		lv_specifiedBy_13_0, 
                                    		"Conditions");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:996:2: ( (lv_specifiedBy_14_0= ruleConditions ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==58) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:997:1: (lv_specifiedBy_14_0= ruleConditions )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:997:1: (lv_specifiedBy_14_0= ruleConditions )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:998:3: lv_specifiedBy_14_0= ruleConditions
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_5_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy2058);
                            	    lv_specifiedBy_14_0=ruleConditions();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"specifiedBy",
                            	            		lv_specifiedBy_14_0, 
                            	            		"Conditions");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePolicy2073); 

                        	newLeafNode(otherlv_15, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleBuilding"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1026:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1027:2: (iv_ruleBuilding= ruleBuilding EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1028:2: iv_ruleBuilding= ruleBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_entryRuleBuilding2111);
            iv_ruleBuilding=ruleBuilding();

            state._fsp--;

             current =iv_ruleBuilding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuilding2121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuilding"


    // $ANTLR start "ruleBuilding"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1035:1: ruleBuilding returns [EObject current=null] : ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleBuilding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ctsSystem_4_0 = null;

        EObject lv_accessControl_5_0 = null;

        EObject lv_calendarSystem_6_0 = null;

        EObject lv_meetingScheduleSystem_7_0 = null;

        EObject lv_floors_8_0 = null;

        EObject lv_floors_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1038:28: ( ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1039:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1039:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1039:2: () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1039:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1040:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildingAccess().getBuildingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBuilding2167); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildingAccess().getBuildingKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1049:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1050:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1050:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1051:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBuilding2188);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBuildingRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBuilding2200); 

                	newLeafNode(otherlv_3, grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1071:1: ( (lv_ctsSystem_4_0= ruleCTS ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1072:1: (lv_ctsSystem_4_0= ruleCTS )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1072:1: (lv_ctsSystem_4_0= ruleCTS )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1073:3: lv_ctsSystem_4_0= ruleCTS
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCtsSystemCTSParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCTS_in_ruleBuilding2221);
                    lv_ctsSystem_4_0=ruleCTS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"ctsSystem",
                            		lv_ctsSystem_4_0, 
                            		"CTS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1089:3: ( (lv_accessControl_5_0= ruleAccessControl ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1090:1: (lv_accessControl_5_0= ruleAccessControl )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1090:1: (lv_accessControl_5_0= ruleAccessControl )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1091:3: lv_accessControl_5_0= ruleAccessControl
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getAccessControlAccessControlParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_ruleBuilding2243);
                    lv_accessControl_5_0=ruleAccessControl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"accessControl",
                            		lv_accessControl_5_0, 
                            		"AccessControl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1107:3: ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1108:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1108:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1109:3: lv_calendarSystem_6_0= ruleCalendarSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCalendarSystemCalendarSystemParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_ruleBuilding2265);
                    lv_calendarSystem_6_0=ruleCalendarSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"calendarSystem",
                            		lv_calendarSystem_6_0, 
                            		"CalendarSystem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1125:3: ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1126:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1126:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1127:3: lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getMeetingScheduleSystemMeetingScheduleSystemParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding2287);
                    lv_meetingScheduleSystem_7_0=ruleMeetingScheduleSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"meetingScheduleSystem",
                            		lv_meetingScheduleSystem_7_0, 
                            		"MeetingScheduleSystem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1143:3: ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1143:4: ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1143:4: ( (lv_floors_8_0= ruleFloor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1144:1: (lv_floors_8_0= ruleFloor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1144:1: (lv_floors_8_0= ruleFloor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1145:3: lv_floors_8_0= ruleFloor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding2310);
                    lv_floors_8_0=ruleFloor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		add(
                           			current, 
                           			"floors",
                            		lv_floors_8_0, 
                            		"Floor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1161:2: ( (lv_floors_9_0= ruleFloor ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==28) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1162:1: (lv_floors_9_0= ruleFloor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1162:1: (lv_floors_9_0= ruleFloor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1163:3: lv_floors_9_0= ruleFloor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding2331);
                    	    lv_floors_9_0=ruleFloor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"floors",
                    	            		lv_floors_9_0, 
                    	            		"Floor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBuilding2346); 

                	newLeafNode(otherlv_10, grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuilding"


    // $ANTLR start "entryRuleFloor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1191:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1192:2: (iv_ruleFloor= ruleFloor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1193:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloor_in_entryRuleFloor2382);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloor2392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1200:1: ruleFloor returns [EObject current=null] : ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rooms_5_0 = null;

        EObject lv_rooms_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1203:28: ( ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1204:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1204:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1204:2: () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1204:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1205:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloorAccess().getFloorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFloor2438); 

                	newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1214:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1215:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1215:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1216:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFloor2459);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFloorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFloor2471); 

                	newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1236:1: (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1236:3: otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    {
                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFloor2484); 

                        	newLeafNode(otherlv_4, grammarAccess.getFloorAccess().getRoomKeyword_4_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1240:1: ( (lv_rooms_5_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1241:1: (lv_rooms_5_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1241:1: (lv_rooms_5_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1242:3: lv_rooms_5_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor2505);
                    lv_rooms_5_0=ruleRoom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	        }
                           		add(
                           			current, 
                           			"rooms",
                            		lv_rooms_5_0, 
                            		"Room");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1258:2: (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1258:4: otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFloor2518); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getFloorAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1262:1: ( (lv_rooms_7_0= ruleRoom ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1263:1: (lv_rooms_7_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1263:1: (lv_rooms_7_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1264:3: lv_rooms_7_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor2539);
                    	    lv_rooms_7_0=ruleRoom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rooms",
                    	            		lv_rooms_7_0, 
                    	            		"Room");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFloor2555); 

                	newLeafNode(otherlv_8, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRuleRoom"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1292:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1293:2: (iv_ruleRoom= ruleRoom EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1294:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoom_in_entryRuleRoom2591);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoom2601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1301:1: ruleRoom returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_declareSensor_6_0 = null;

        EObject lv_declareSensor_7_0 = null;

        EObject lv_declareActuator_8_0 = null;

        EObject lv_declareActuator_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1304:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1305:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1305:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1305:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1305:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1306:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoomAccess().getRoomAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1311:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1312:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1312:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1313:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom2656);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoomRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1329:2: (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1329:4: otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRoom2669); 

                        	newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getIsOfTypeKeyword_2_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1333:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1334:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1334:1: ( ruleEString )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1335:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoomRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom2692);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1348:2: ( ( ruleEString ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1349:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1349:1: ( ruleEString )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1350:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoomRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_2_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom2715);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1363:5: (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1363:7: otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}'
            {
            otherlv_5=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoom2731); 

                	newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1367:1: ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1367:2: ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1367:2: ( (lv_declareSensor_6_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1368:1: (lv_declareSensor_6_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1368:1: (lv_declareSensor_6_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1369:3: lv_declareSensor_6_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom2753);
                    lv_declareSensor_6_0=ruleSensorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	        }
                           		add(
                           			current, 
                           			"declareSensor",
                            		lv_declareSensor_6_0, 
                            		"SensorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1385:2: ( (lv_declareSensor_7_0= ruleSensorComponent ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==55) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1386:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1386:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1387:3: lv_declareSensor_7_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom2774);
                    	    lv_declareSensor_7_0=ruleSensorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareSensor",
                    	            		lv_declareSensor_7_0, 
                    	            		"SensorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1403:5: ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1403:6: ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1403:6: ( (lv_declareActuator_8_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1404:1: (lv_declareActuator_8_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1404:1: (lv_declareActuator_8_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1405:3: lv_declareActuator_8_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_3_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom2799);
                    lv_declareActuator_8_0=ruleActuatorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	        }
                           		add(
                           			current, 
                           			"declareActuator",
                            		lv_declareActuator_8_0, 
                            		"ActuatorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1421:2: ( (lv_declareActuator_9_0= ruleActuatorComponent ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==57) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1422:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1422:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1423:3: lv_declareActuator_9_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom2820);
                    	    lv_declareActuator_9_0=ruleActuatorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareActuator",
                    	            		lv_declareActuator_9_0, 
                    	            		"ActuatorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoom2835); 

                	newLeafNode(otherlv_10, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_3_3());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleCTS"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1451:1: entryRuleCTS returns [EObject current=null] : iv_ruleCTS= ruleCTS EOF ;
    public final EObject entryRuleCTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTS = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1452:2: (iv_ruleCTS= ruleCTS EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1453:2: iv_ruleCTS= ruleCTS EOF
            {
             newCompositeNode(grammarAccess.getCTSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCTS_in_entryRuleCTS2872);
            iv_ruleCTS=ruleCTS();

            state._fsp--;

             current =iv_ruleCTS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCTS2882); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCTS"


    // $ANTLR start "ruleCTS"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1460:1: ruleCTS returns [EObject current=null] : ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleCTS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_temperatureSensors_5_0 = null;

        EObject lv_temperatureSensors_7_0 = null;

        EObject lv_ctsActuators_11_0 = null;

        EObject lv_ctsActuators_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1463:28: ( ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1464:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1464:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1464:2: () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1464:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1465:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCTSAccess().getCTSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCTS2928); 

                	newLeafNode(otherlv_1, grammarAccess.getCTSAccess().getCTSKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2940); 

                	newLeafNode(otherlv_2, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1478:1: (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1478:3: otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCTS2953); 

                        	newLeafNode(otherlv_3, grammarAccess.getCTSAccess().getTemperatureSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2965); 

                        	newLeafNode(otherlv_4, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1486:1: ( (lv_temperatureSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1487:1: (lv_temperatureSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1487:1: (lv_temperatureSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1488:3: lv_temperatureSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS2986);
                    lv_temperatureSensors_5_0=ruleSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCTSRule());
                    	        }
                           		add(
                           			current, 
                           			"temperatureSensors",
                            		lv_temperatureSensors_5_0, 
                            		"Sensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1504:2: (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==16) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1504:4: otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCTS2999); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCTSAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1508:1: ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1509:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1509:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1510:3: lv_temperatureSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS3020);
                    	    lv_temperatureSensors_7_0=ruleSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCTSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"temperatureSensors",
                    	            		lv_temperatureSensors_7_0, 
                    	            		"Sensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3034); 

                        	newLeafNode(otherlv_8, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1530:3: (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1530:5: otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCTS3049); 

                        	newLeafNode(otherlv_9, grammarAccess.getCTSAccess().getCtsActuatorsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS3061); 

                        	newLeafNode(otherlv_10, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1538:1: ( (lv_ctsActuators_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1539:1: (lv_ctsActuators_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1539:1: (lv_ctsActuators_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1540:3: lv_ctsActuators_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS3082);
                    lv_ctsActuators_11_0=ruleActuator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCTSRule());
                    	        }
                           		add(
                           			current, 
                           			"ctsActuators",
                            		lv_ctsActuators_11_0, 
                            		"Actuator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1556:2: (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==16) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1556:4: otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCTS3095); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCTSAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1560:1: ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1561:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1561:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1562:3: lv_ctsActuators_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS3116);
                    	    lv_ctsActuators_13_0=ruleActuator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCTSRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ctsActuators",
                    	            		lv_ctsActuators_13_0, 
                    	            		"Actuator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3130); 

                        	newLeafNode(otherlv_14, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3144); 

                	newLeafNode(otherlv_15, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCTS"


    // $ANTLR start "entryRuleAccessControl"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1594:1: entryRuleAccessControl returns [EObject current=null] : iv_ruleAccessControl= ruleAccessControl EOF ;
    public final EObject entryRuleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControl = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1595:2: (iv_ruleAccessControl= ruleAccessControl EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1596:2: iv_ruleAccessControl= ruleAccessControl EOF
            {
             newCompositeNode(grammarAccess.getAccessControlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_entryRuleAccessControl3180);
            iv_ruleAccessControl=ruleAccessControl();

            state._fsp--;

             current =iv_ruleAccessControl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessControl3190); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessControl"


    // $ANTLR start "ruleAccessControl"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1603:1: ruleAccessControl returns [EObject current=null] : ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleAccessControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_accessControlSensors_5_0 = null;

        EObject lv_accessControlSensors_7_0 = null;

        EObject lv_accessControlDoorLockActuator_11_0 = null;

        EObject lv_accessControlDoorLockActuator_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1606:28: ( ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1607:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1607:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1607:2: () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1607:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1608:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccessControlAccess().getAccessControlAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAccessControl3236); 

                	newLeafNode(otherlv_1, grammarAccess.getAccessControlAccess().getAccessControlKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3248); 

                	newLeafNode(otherlv_2, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1621:1: (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1621:3: otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAccessControl3261); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccessControlAccess().getAccessControlSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3273); 

                        	newLeafNode(otherlv_4, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1629:1: ( (lv_accessControlSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1630:1: (lv_accessControlSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1630:1: (lv_accessControlSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1631:3: lv_accessControlSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl3294);
                    lv_accessControlSensors_5_0=ruleSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccessControlRule());
                    	        }
                           		add(
                           			current, 
                           			"accessControlSensors",
                            		lv_accessControlSensors_5_0, 
                            		"Sensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1647:2: (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==16) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1647:4: otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAccessControl3307); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAccessControlAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1651:1: ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1652:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1652:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1653:3: lv_accessControlSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl3328);
                    	    lv_accessControlSensors_7_0=ruleSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAccessControlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"accessControlSensors",
                    	            		lv_accessControlSensors_7_0, 
                    	            		"Sensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3342); 

                        	newLeafNode(otherlv_8, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1673:3: (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==36) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1673:5: otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAccessControl3357); 

                        	newLeafNode(otherlv_9, grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3369); 

                        	newLeafNode(otherlv_10, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1681:1: ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1682:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1682:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1683:3: lv_accessControlDoorLockActuator_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl3390);
                    lv_accessControlDoorLockActuator_11_0=ruleActuator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccessControlRule());
                    	        }
                           		add(
                           			current, 
                           			"accessControlDoorLockActuator",
                            		lv_accessControlDoorLockActuator_11_0, 
                            		"Actuator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1699:2: (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==16) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1699:4: otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAccessControl3403); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAccessControlAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1703:1: ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1704:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1704:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1705:3: lv_accessControlDoorLockActuator_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl3424);
                    	    lv_accessControlDoorLockActuator_13_0=ruleActuator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAccessControlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"accessControlDoorLockActuator",
                    	            		lv_accessControlDoorLockActuator_13_0, 
                    	            		"Actuator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3438); 

                        	newLeafNode(otherlv_14, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3452); 

                	newLeafNode(otherlv_15, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessControl"


    // $ANTLR start "entryRuleCalendarSystem"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1737:1: entryRuleCalendarSystem returns [EObject current=null] : iv_ruleCalendarSystem= ruleCalendarSystem EOF ;
    public final EObject entryRuleCalendarSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1738:2: (iv_ruleCalendarSystem= ruleCalendarSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1739:2: iv_ruleCalendarSystem= ruleCalendarSystem EOF
            {
             newCompositeNode(grammarAccess.getCalendarSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem3488);
            iv_ruleCalendarSystem=ruleCalendarSystem();

            state._fsp--;

             current =iv_ruleCalendarSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarSystem3498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalendarSystem"


    // $ANTLR start "ruleCalendarSystem"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1746:1: ruleCalendarSystem returns [EObject current=null] : ( () otherlv_1= 'CalendarSystem' ) ;
    public final EObject ruleCalendarSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1749:28: ( ( () otherlv_1= 'CalendarSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1750:1: ( () otherlv_1= 'CalendarSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1750:1: ( () otherlv_1= 'CalendarSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1750:2: () otherlv_1= 'CalendarSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1750:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1751:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCalendarSystemAccess().getCalendarSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCalendarSystem3544); 

                	newLeafNode(otherlv_1, grammarAccess.getCalendarSystemAccess().getCalendarSystemKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalendarSystem"


    // $ANTLR start "entryRuleMeetingScheduleSystem"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1768:1: entryRuleMeetingScheduleSystem returns [EObject current=null] : iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF ;
    public final EObject entryRuleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingScheduleSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1769:2: (iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1770:2: iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF
            {
             newCompositeNode(grammarAccess.getMeetingScheduleSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem3580);
            iv_ruleMeetingScheduleSystem=ruleMeetingScheduleSystem();

            state._fsp--;

             current =iv_ruleMeetingScheduleSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeetingScheduleSystem"


    // $ANTLR start "ruleMeetingScheduleSystem"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1777:1: ruleMeetingScheduleSystem returns [EObject current=null] : ( () otherlv_1= 'MeetingScheduleSystem' ) ;
    public final EObject ruleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1780:28: ( ( () otherlv_1= 'MeetingScheduleSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1781:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1781:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1781:2: () otherlv_1= 'MeetingScheduleSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1781:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1782:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeetingScheduleSystemAccess().getMeetingScheduleSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMeetingScheduleSystem3636); 

                	newLeafNode(otherlv_1, grammarAccess.getMeetingScheduleSystemAccess().getMeetingScheduleSystemKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeetingScheduleSystem"


    // $ANTLR start "entryRuleMotionSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1799:1: entryRuleMotionSensor returns [EObject current=null] : iv_ruleMotionSensor= ruleMotionSensor EOF ;
    public final EObject entryRuleMotionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotionSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1800:2: (iv_ruleMotionSensor= ruleMotionSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1801:2: iv_ruleMotionSensor= ruleMotionSensor EOF
            {
             newCompositeNode(grammarAccess.getMotionSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3672);
            iv_ruleMotionSensor=ruleMotionSensor();

            state._fsp--;

             current =iv_ruleMotionSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMotionSensor3682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMotionSensor"


    // $ANTLR start "ruleMotionSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1808:1: ruleMotionSensor returns [EObject current=null] : ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleMotionSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1811:28: ( ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1812:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1812:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1812:2: () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1812:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1813:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMotionSensorAccess().getMotionSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMotionSensor3728); 

                	newLeafNode(otherlv_1, grammarAccess.getMotionSensorAccess().getMotionSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1822:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==11) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1822:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMotionSensor3741); 

                        	newLeafNode(otherlv_2, grammarAccess.getMotionSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMotionSensor3753); 

                        	newLeafNode(otherlv_3, grammarAccess.getMotionSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMotionSensor3765); 

                        	newLeafNode(otherlv_4, grammarAccess.getMotionSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1834:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1835:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1835:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1836:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMotionSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMotionSensor3786);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMotionSensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMotionSensor3798); 

                        	newLeafNode(otherlv_6, grammarAccess.getMotionSensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMotionSensor"


    // $ANTLR start "entryRuleTemperatureSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1864:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1865:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1866:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3836);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor3846); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemperatureSensor"


    // $ANTLR start "ruleTemperatureSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1873:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1876:28: ( ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1877:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1877:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1877:2: () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1877:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1878:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTemperatureSensor3892); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1887:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==11) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1887:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTemperatureSensor3905); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTemperatureSensor3917); 

                        	newLeafNode(otherlv_3, grammarAccess.getTemperatureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTemperatureSensor3929); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemperatureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1899:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1900:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1900:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1901:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemperatureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTemperatureSensor3950);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemperatureSensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTemperatureSensor3962); 

                        	newLeafNode(otherlv_6, grammarAccess.getTemperatureSensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemperatureSensor"


    // $ANTLR start "entryRulePressureSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1929:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1930:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1931:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor4000);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor4010); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePressureSensor"


    // $ANTLR start "rulePressureSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1938:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject rulePressureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1941:28: ( ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1942:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1942:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1942:2: () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1942:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1943:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePressureSensor4056); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1952:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1952:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePressureSensor4069); 

                        	newLeafNode(otherlv_2, grammarAccess.getPressureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePressureSensor4081); 

                        	newLeafNode(otherlv_3, grammarAccess.getPressureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePressureSensor4093); 

                        	newLeafNode(otherlv_4, grammarAccess.getPressureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1964:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1965:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1965:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1966:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPressureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePressureSensor4114);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPressureSensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePressureSensor4126); 

                        	newLeafNode(otherlv_6, grammarAccess.getPressureSensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePressureSensor"


    // $ANTLR start "entryRuleTouchSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1994:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1995:2: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1996:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor4164);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTouchSensor4174); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTouchSensor"


    // $ANTLR start "ruleTouchSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2003:1: ruleTouchSensor returns [EObject current=null] : ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleTouchSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2006:28: ( ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2007:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2007:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2007:2: () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2007:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2008:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTouchSensorAccess().getTouchSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTouchSensor4220); 

                	newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2017:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==11) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2017:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTouchSensor4233); 

                        	newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTouchSensor4245); 

                        	newLeafNode(otherlv_3, grammarAccess.getTouchSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTouchSensor4257); 

                        	newLeafNode(otherlv_4, grammarAccess.getTouchSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2029:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2030:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2030:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2031:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTouchSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTouchSensor4278);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTouchSensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTouchSensor4290); 

                        	newLeafNode(otherlv_6, grammarAccess.getTouchSensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTouchSensor"


    // $ANTLR start "entryRuleLightSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2059:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2060:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2061:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor4328);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor4338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLightSensor"


    // $ANTLR start "ruleLightSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2068:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleLightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2071:28: ( ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2072:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2072:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2072:2: () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2072:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2073:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleLightSensor4384); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2082:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2082:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSensor4397); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleLightSensor4409); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLightSensor4421); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2094:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2095:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2095:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2096:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSensor4442);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLightSensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSensor4454); 

                        	newLeafNode(otherlv_6, grammarAccess.getLightSensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLightSensor"


    // $ANTLR start "entryRuleSmokeSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2124:1: entryRuleSmokeSensor returns [EObject current=null] : iv_ruleSmokeSensor= ruleSmokeSensor EOF ;
    public final EObject entryRuleSmokeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmokeSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2125:2: (iv_ruleSmokeSensor= ruleSmokeSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2126:2: iv_ruleSmokeSensor= ruleSmokeSensor EOF
            {
             newCompositeNode(grammarAccess.getSmokeSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4492);
            iv_ruleSmokeSensor=ruleSmokeSensor();

            state._fsp--;

             current =iv_ruleSmokeSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSmokeSensor4502); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmokeSensor"


    // $ANTLR start "ruleSmokeSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2133:1: ruleSmokeSensor returns [EObject current=null] : ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleSmokeSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2136:28: ( ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2137:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2137:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2137:2: () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2137:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2138:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSmokeSensorAccess().getSmokeSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleSmokeSensor4548); 

                	newLeafNode(otherlv_1, grammarAccess.getSmokeSensorAccess().getSmokeSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2147:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==11) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2147:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSmokeSensor4561); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmokeSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSmokeSensor4573); 

                        	newLeafNode(otherlv_3, grammarAccess.getSmokeSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSmokeSensor4585); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmokeSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2159:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2160:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2160:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2161:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmokeSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSmokeSensor4606);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmokeSensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSmokeSensor4618); 

                        	newLeafNode(otherlv_6, grammarAccess.getSmokeSensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmokeSensor"


    // $ANTLR start "entryRuleCO2Sensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2189:1: entryRuleCO2Sensor returns [EObject current=null] : iv_ruleCO2Sensor= ruleCO2Sensor EOF ;
    public final EObject entryRuleCO2Sensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCO2Sensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2190:2: (iv_ruleCO2Sensor= ruleCO2Sensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2191:2: iv_ruleCO2Sensor= ruleCO2Sensor EOF
            {
             newCompositeNode(grammarAccess.getCO2SensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4656);
            iv_ruleCO2Sensor=ruleCO2Sensor();

            state._fsp--;

             current =iv_ruleCO2Sensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCO2Sensor4666); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCO2Sensor"


    // $ANTLR start "ruleCO2Sensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2198:1: ruleCO2Sensor returns [EObject current=null] : ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleCO2Sensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2201:28: ( ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2202:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2202:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2202:2: () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2202:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2203:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCO2SensorAccess().getCO2SensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleCO2Sensor4712); 

                	newLeafNode(otherlv_1, grammarAccess.getCO2SensorAccess().getCO2SensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2212:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==11) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2212:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCO2Sensor4725); 

                        	newLeafNode(otherlv_2, grammarAccess.getCO2SensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCO2Sensor4737); 

                        	newLeafNode(otherlv_3, grammarAccess.getCO2SensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCO2Sensor4749); 

                        	newLeafNode(otherlv_4, grammarAccess.getCO2SensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2224:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2225:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2225:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2226:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCO2SensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCO2Sensor4770);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCO2SensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCO2Sensor4782); 

                        	newLeafNode(otherlv_6, grammarAccess.getCO2SensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCO2Sensor"


    // $ANTLR start "entryRuleInfraredLightSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2254:1: entryRuleInfraredLightSensor returns [EObject current=null] : iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF ;
    public final EObject entryRuleInfraredLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraredLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2255:2: (iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2256:2: iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF
            {
             newCompositeNode(grammarAccess.getInfraredLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4820);
            iv_ruleInfraredLightSensor=ruleInfraredLightSensor();

            state._fsp--;

             current =iv_ruleInfraredLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfraredLightSensor4830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfraredLightSensor"


    // $ANTLR start "ruleInfraredLightSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2263:1: ruleInfraredLightSensor returns [EObject current=null] : ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleInfraredLightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2266:28: ( ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2267:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2267:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2267:2: () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2267:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2268:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleInfraredLightSensor4876); 

                	newLeafNode(otherlv_1, grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2277:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==11) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2277:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInfraredLightSensor4889); 

                        	newLeafNode(otherlv_2, grammarAccess.getInfraredLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInfraredLightSensor4901); 

                        	newLeafNode(otherlv_3, grammarAccess.getInfraredLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInfraredLightSensor4913); 

                        	newLeafNode(otherlv_4, grammarAccess.getInfraredLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2289:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2290:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2290:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2291:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfraredLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInfraredLightSensor4934);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInfraredLightSensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInfraredLightSensor4946); 

                        	newLeafNode(otherlv_6, grammarAccess.getInfraredLightSensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfraredLightSensor"


    // $ANTLR start "entryRuleHumiditySensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2321:1: entryRuleHumiditySensor returns [EObject current=null] : iv_ruleHumiditySensor= ruleHumiditySensor EOF ;
    public final EObject entryRuleHumiditySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumiditySensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2322:2: (iv_ruleHumiditySensor= ruleHumiditySensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2323:2: iv_ruleHumiditySensor= ruleHumiditySensor EOF
            {
             newCompositeNode(grammarAccess.getHumiditySensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor4986);
            iv_ruleHumiditySensor=ruleHumiditySensor();

            state._fsp--;

             current =iv_ruleHumiditySensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumiditySensor4996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHumiditySensor"


    // $ANTLR start "ruleHumiditySensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2330:1: ruleHumiditySensor returns [EObject current=null] : ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleHumiditySensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2333:28: ( ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:2: () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2335:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumiditySensorAccess().getHumiditySensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleHumiditySensor5042); 

                	newLeafNode(otherlv_1, grammarAccess.getHumiditySensorAccess().getHumiditySensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2344:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==11) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2344:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumiditySensor5055); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumiditySensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleHumiditySensor5067); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumiditySensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleHumiditySensor5079); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumiditySensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2356:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2357:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2357:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2358:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumiditySensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumiditySensor5100);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHumiditySensorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHumiditySensor5112); 

                        	newLeafNode(otherlv_6, grammarAccess.getHumiditySensorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHumiditySensor"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2386:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2387:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2388:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5151);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2395:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2398:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2399:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2399:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2399:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2399:2: (kw= '-' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==20) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2400:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEInt5201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5218); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLightSwitchActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2420:1: entryRuleLightSwitchActuator returns [EObject current=null] : iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF ;
    public final EObject entryRuleLightSwitchActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSwitchActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2421:2: (iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2422:2: iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF
            {
             newCompositeNode(grammarAccess.getLightSwitchActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5263);
            iv_ruleLightSwitchActuator=ruleLightSwitchActuator();

            state._fsp--;

             current =iv_ruleLightSwitchActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSwitchActuator5273); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLightSwitchActuator"


    // $ANTLR start "ruleLightSwitchActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2429:1: ruleLightSwitchActuator returns [EObject current=null] : ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleLightSwitchActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2432:28: ( ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2433:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2433:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2433:2: () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2433:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2434:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleLightSwitchActuator5319); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2443:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==11) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2443:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSwitchActuator5332); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSwitchActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleLightSwitchActuator5344); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSwitchActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLightSwitchActuator5356); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSwitchActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2455:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2456:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2456:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2457:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSwitchActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSwitchActuator5377);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLightSwitchActuatorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSwitchActuator5389); 

                        	newLeafNode(otherlv_6, grammarAccess.getLightSwitchActuatorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLightSwitchActuator"


    // $ANTLR start "entryRuleWindowActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2485:1: entryRuleWindowActuator returns [EObject current=null] : iv_ruleWindowActuator= ruleWindowActuator EOF ;
    public final EObject entryRuleWindowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2486:2: (iv_ruleWindowActuator= ruleWindowActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2487:2: iv_ruleWindowActuator= ruleWindowActuator EOF
            {
             newCompositeNode(grammarAccess.getWindowActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5427);
            iv_ruleWindowActuator=ruleWindowActuator();

            state._fsp--;

             current =iv_ruleWindowActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWindowActuator5437); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindowActuator"


    // $ANTLR start "ruleWindowActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2494:1: ruleWindowActuator returns [EObject current=null] : ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleWindowActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2497:28: ( ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2498:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2498:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2498:2: () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2498:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2499:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWindowActuatorAccess().getWindowActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleWindowActuator5483); 

                	newLeafNode(otherlv_1, grammarAccess.getWindowActuatorAccess().getWindowActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2508:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==11) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2508:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWindowActuator5496); 

                        	newLeafNode(otherlv_2, grammarAccess.getWindowActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleWindowActuator5508); 

                        	newLeafNode(otherlv_3, grammarAccess.getWindowActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWindowActuator5520); 

                        	newLeafNode(otherlv_4, grammarAccess.getWindowActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2520:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2521:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2521:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2522:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getWindowActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWindowActuator5541);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWindowActuatorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWindowActuator5553); 

                        	newLeafNode(otherlv_6, grammarAccess.getWindowActuatorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowActuator"


    // $ANTLR start "entryRuleHumidifierActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2550:1: entryRuleHumidifierActuator returns [EObject current=null] : iv_ruleHumidifierActuator= ruleHumidifierActuator EOF ;
    public final EObject entryRuleHumidifierActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumidifierActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2551:2: (iv_ruleHumidifierActuator= ruleHumidifierActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2552:2: iv_ruleHumidifierActuator= ruleHumidifierActuator EOF
            {
             newCompositeNode(grammarAccess.getHumidifierActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5591);
            iv_ruleHumidifierActuator=ruleHumidifierActuator();

            state._fsp--;

             current =iv_ruleHumidifierActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumidifierActuator5601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHumidifierActuator"


    // $ANTLR start "ruleHumidifierActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2559:1: ruleHumidifierActuator returns [EObject current=null] : ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleHumidifierActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2562:28: ( ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2563:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2563:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2563:2: () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2563:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2564:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleHumidifierActuator5647); 

                	newLeafNode(otherlv_1, grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2573:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==11) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2573:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumidifierActuator5660); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumidifierActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleHumidifierActuator5672); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumidifierActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleHumidifierActuator5684); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumidifierActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2585:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2586:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2586:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2587:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumidifierActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumidifierActuator5705);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHumidifierActuatorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHumidifierActuator5717); 

                        	newLeafNode(otherlv_6, grammarAccess.getHumidifierActuatorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHumidifierActuator"


    // $ANTLR start "entryRuleDoorActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2615:1: entryRuleDoorActuator returns [EObject current=null] : iv_ruleDoorActuator= ruleDoorActuator EOF ;
    public final EObject entryRuleDoorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2616:2: (iv_ruleDoorActuator= ruleDoorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2617:2: iv_ruleDoorActuator= ruleDoorActuator EOF
            {
             newCompositeNode(grammarAccess.getDoorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5755);
            iv_ruleDoorActuator=ruleDoorActuator();

            state._fsp--;

             current =iv_ruleDoorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoorActuator5765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoorActuator"


    // $ANTLR start "ruleDoorActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2624:1: ruleDoorActuator returns [EObject current=null] : ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleDoorActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2627:28: ( ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2628:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2628:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2628:2: () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2628:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2629:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoorActuatorAccess().getDoorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleDoorActuator5811); 

                	newLeafNode(otherlv_1, grammarAccess.getDoorActuatorAccess().getDoorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2638:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==11) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2638:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDoorActuator5824); 

                        	newLeafNode(otherlv_2, grammarAccess.getDoorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDoorActuator5836); 

                        	newLeafNode(otherlv_3, grammarAccess.getDoorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDoorActuator5848); 

                        	newLeafNode(otherlv_4, grammarAccess.getDoorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2650:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2651:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2651:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2652:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDoorActuator5869);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDoorActuatorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDoorActuator5881); 

                        	newLeafNode(otherlv_6, grammarAccess.getDoorActuatorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoorActuator"


    // $ANTLR start "entryRuleRadiatorActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2680:1: entryRuleRadiatorActuator returns [EObject current=null] : iv_ruleRadiatorActuator= ruleRadiatorActuator EOF ;
    public final EObject entryRuleRadiatorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiatorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2681:2: (iv_ruleRadiatorActuator= ruleRadiatorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2682:2: iv_ruleRadiatorActuator= ruleRadiatorActuator EOF
            {
             newCompositeNode(grammarAccess.getRadiatorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5919);
            iv_ruleRadiatorActuator=ruleRadiatorActuator();

            state._fsp--;

             current =iv_ruleRadiatorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadiatorActuator5929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadiatorActuator"


    // $ANTLR start "ruleRadiatorActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2689:1: ruleRadiatorActuator returns [EObject current=null] : ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleRadiatorActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2692:28: ( ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2693:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2693:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2693:2: () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2693:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2694:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleRadiatorActuator5975); 

                	newLeafNode(otherlv_1, grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2703:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==11) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2703:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRadiatorActuator5988); 

                        	newLeafNode(otherlv_2, grammarAccess.getRadiatorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRadiatorActuator6000); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadiatorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRadiatorActuator6012); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadiatorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2715:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2716:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2716:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2717:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRadiatorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRadiatorActuator6033);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRadiatorActuatorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRadiatorActuator6045); 

                        	newLeafNode(otherlv_6, grammarAccess.getRadiatorActuatorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadiatorActuator"


    // $ANTLR start "entryRuleAudioAlarmActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2745:1: entryRuleAudioAlarmActuator returns [EObject current=null] : iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF ;
    public final EObject entryRuleAudioAlarmActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioAlarmActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2746:2: (iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2747:2: iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF
            {
             newCompositeNode(grammarAccess.getAudioAlarmActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator6083);
            iv_ruleAudioAlarmActuator=ruleAudioAlarmActuator();

            state._fsp--;

             current =iv_ruleAudioAlarmActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAudioAlarmActuator6093); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAudioAlarmActuator"


    // $ANTLR start "ruleAudioAlarmActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2754:1: ruleAudioAlarmActuator returns [EObject current=null] : ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleAudioAlarmActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2757:28: ( ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2758:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2758:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2758:2: () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2758:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2759:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAudioAlarmActuator6139); 

                	newLeafNode(otherlv_1, grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2768:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==11) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2768:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAudioAlarmActuator6152); 

                        	newLeafNode(otherlv_2, grammarAccess.getAudioAlarmActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAudioAlarmActuator6164); 

                        	newLeafNode(otherlv_3, grammarAccess.getAudioAlarmActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAudioAlarmActuator6176); 

                        	newLeafNode(otherlv_4, grammarAccess.getAudioAlarmActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2780:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2781:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2781:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2782:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAudioAlarmActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAudioAlarmActuator6197);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAudioAlarmActuatorRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAudioAlarmActuator6209); 

                        	newLeafNode(otherlv_6, grammarAccess.getAudioAlarmActuatorAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAudioAlarmActuator"


    // $ANTLR start "entryRuleSensorComponent"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2812:1: entryRuleSensorComponent returns [EObject current=null] : iv_ruleSensorComponent= ruleSensorComponent EOF ;
    public final EObject entryRuleSensorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2813:2: (iv_ruleSensorComponent= ruleSensorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2814:2: iv_ruleSensorComponent= ruleSensorComponent EOF
            {
             newCompositeNode(grammarAccess.getSensorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent6249);
            iv_ruleSensorComponent=ruleSensorComponent();

            state._fsp--;

             current =iv_ruleSensorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorComponent6259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorComponent"


    // $ANTLR start "ruleSensorComponent"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2821:1: ruleSensorComponent returns [EObject current=null] : ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) ;
    public final EObject ruleSensorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2824:28: ( ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:2: () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2826:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorComponentAccess().getSensorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleSensorComponent6305); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorComponentAccess().getSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2835:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2836:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2836:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2837:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSensorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorComponent6326);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2853:2: (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==56) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2853:4: otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )*
                    {
                    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleSensorComponent6339); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2857:1: ( (lv_sensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2858:1: (lv_sensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2858:1: (lv_sensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2859:3: lv_sensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent6360);
                    lv_sensors_4_0=ruleSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSensorComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"sensors",
                            		lv_sensors_4_0, 
                            		"Sensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2875:2: ( (lv_sensors_5_0= ruleSensor ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==39||(LA66_0>=41 && LA66_0<=48)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2876:1: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2876:1: (lv_sensors_5_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2877:3: lv_sensors_5_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent6381);
                    	    lv_sensors_5_0=ruleSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSensorComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sensors",
                    	            		lv_sensors_5_0, 
                    	            		"Sensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorComponent"


    // $ANTLR start "entryRuleActuatorComponent"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2901:1: entryRuleActuatorComponent returns [EObject current=null] : iv_ruleActuatorComponent= ruleActuatorComponent EOF ;
    public final EObject entryRuleActuatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2902:2: (iv_ruleActuatorComponent= ruleActuatorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2903:2: iv_ruleActuatorComponent= ruleActuatorComponent EOF
            {
             newCompositeNode(grammarAccess.getActuatorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent6420);
            iv_ruleActuatorComponent=ruleActuatorComponent();

            state._fsp--;

             current =iv_ruleActuatorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuatorComponent6430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuatorComponent"


    // $ANTLR start "ruleActuatorComponent"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2910:1: ruleActuatorComponent returns [EObject current=null] : ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) ;
    public final EObject ruleActuatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2913:28: ( ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2914:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2914:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2914:2: () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2914:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2915:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorComponentAccess().getActuatorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleActuatorComponent6476); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorComponentAccess().getActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2924:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2925:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2925:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2926:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActuatorComponent6497);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActuatorComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2942:2: (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==56) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2942:4: otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )*
                    {
                    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleActuatorComponent6510); 

                        	newLeafNode(otherlv_3, grammarAccess.getActuatorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2946:1: ( (lv_actuators_4_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2947:1: (lv_actuators_4_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2947:1: (lv_actuators_4_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2948:3: lv_actuators_4_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent6531);
                    lv_actuators_4_0=ruleActuator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActuatorComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"actuators",
                            		lv_actuators_4_0, 
                            		"Actuator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2964:2: ( (lv_actuators_5_0= ruleActuator ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( ((LA68_0>=49 && LA68_0<=54)) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2965:1: (lv_actuators_5_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2965:1: (lv_actuators_5_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2966:3: lv_actuators_5_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent6552);
                    	    lv_actuators_5_0=ruleActuator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActuatorComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actuators",
                    	            		lv_actuators_5_0, 
                    	            		"Actuator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuatorComponent"


    // $ANTLR start "entryRuleConditions"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2990:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2991:2: (iv_ruleConditions= ruleConditions EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2992:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_entryRuleConditions6591);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditions6601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2999:1: ruleConditions returns [EObject current=null] : ( () otherlv_1= 'Conditions' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3002:28: ( ( () otherlv_1= 'Conditions' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3003:1: ( () otherlv_1= 'Conditions' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3003:1: ( () otherlv_1= 'Conditions' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3003:2: () otherlv_1= 'Conditions'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3003:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3004:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionsAccess().getConditionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleConditions6647); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionsAccess().getConditionsKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleEBoolean"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3021:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3022:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3023:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean6684);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean6695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3030:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3033:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3034:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3034:1: (kw= 'true' | kw= 'false' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                alt70=1;
            }
            else if ( (LA70_0==60) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3035:2: kw= 'true'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEBoolean6733); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3042:2: kw= 'false'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEBoolean6752); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleWeekdays"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3055:1: ruleWeekdays returns [Enumerator current=null] : ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) ) ;
    public final Enumerator ruleWeekdays() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3057:28: ( ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3058:1: ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3058:1: ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) )
            int alt71=7;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt71=1;
                }
                break;
            case 62:
                {
                alt71=2;
                }
                break;
            case 63:
                {
                alt71=3;
                }
                break;
            case 64:
                {
                alt71=4;
                }
                break;
            case 65:
                {
                alt71=5;
                }
                break;
            case 66:
                {
                alt71=6;
                }
                break;
            case 67:
                {
                alt71=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3058:2: (enumLiteral_0= 'MONDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3058:2: (enumLiteral_0= 'MONDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3058:4: enumLiteral_0= 'MONDAY'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleWeekdays6806); 

                            current = grammarAccess.getWeekdaysAccess().getMONDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWeekdaysAccess().getMONDAYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3064:6: (enumLiteral_1= 'TUESDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3064:6: (enumLiteral_1= 'TUESDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3064:8: enumLiteral_1= 'TUESDAY'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleWeekdays6823); 

                            current = grammarAccess.getWeekdaysAccess().getTUESDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWeekdaysAccess().getTUESDAYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3070:6: (enumLiteral_2= 'WEDENSDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3070:6: (enumLiteral_2= 'WEDENSDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3070:8: enumLiteral_2= 'WEDENSDAY'
                    {
                    enumLiteral_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleWeekdays6840); 

                            current = grammarAccess.getWeekdaysAccess().getWEDENSDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWeekdaysAccess().getWEDENSDAYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3076:6: (enumLiteral_3= 'THURSDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3076:6: (enumLiteral_3= 'THURSDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3076:8: enumLiteral_3= 'THURSDAY'
                    {
                    enumLiteral_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleWeekdays6857); 

                            current = grammarAccess.getWeekdaysAccess().getTHURSDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getWeekdaysAccess().getTHURSDAYEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3082:6: (enumLiteral_4= 'FRIDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3082:6: (enumLiteral_4= 'FRIDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3082:8: enumLiteral_4= 'FRIDAY'
                    {
                    enumLiteral_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleWeekdays6874); 

                            current = grammarAccess.getWeekdaysAccess().getFRIDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getWeekdaysAccess().getFRIDAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3088:6: (enumLiteral_5= 'SATURDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3088:6: (enumLiteral_5= 'SATURDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3088:8: enumLiteral_5= 'SATURDAY'
                    {
                    enumLiteral_5=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleWeekdays6891); 

                            current = grammarAccess.getWeekdaysAccess().getSATURDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getWeekdaysAccess().getSATURDAYEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3094:6: (enumLiteral_6= 'SUNDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3094:6: (enumLiteral_6= 'SUNDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3094:8: enumLiteral_6= 'SUNDAY'
                    {
                    enumLiteral_6=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleWeekdays6908); 

                            current = grammarAccess.getWeekdaysAccess().getSUNDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getWeekdaysAccess().getSUNDAYEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeekdays"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModel140 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleModel152 = new BitSet(new long[]{0x0000000008A07000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel174 = new BitSet(new long[]{0x0000000008A07000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel195 = new BitSet(new long[]{0x0000000008A07000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel220 = new BitSet(new long[]{0x0000000008807000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel241 = new BitSet(new long[]{0x0000000008807000L});
        public static final BitSet FOLLOW_ruleSchedule_in_ruleModel266 = new BitSet(new long[]{0x0000000008007000L});
        public static final BitSet FOLLOW_ruleSchedule_in_ruleModel287 = new BitSet(new long[]{0x0000000008007000L});
        public static final BitSet FOLLOW_12_in_ruleModel303 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel324 = new BitSet(new long[]{0x0000000008002060L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel345 = new BitSet(new long[]{0x0000000008002060L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel370 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel391 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_13_in_ruleModel406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_ruleActuator499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_ruleActuator526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_ruleActuator553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_ruleActuator580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_ruleActuator607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_ruleActuator634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_ruleSensor726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleSensor753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleSensor780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_ruleSensor807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleSensor834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_ruleSensor861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_ruleSensor888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_ruleSensor915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_ruleSensor942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSchedule_in_entryRuleSchedule977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSchedule987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleSchedule1033 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSchedule1054 = new BitSet(new long[]{0x0000000000028002L});
        public static final BitSet FOLLOW_15_in_ruleSchedule1067 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_ruleWeekdays_in_ruleSchedule1088 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_16_in_ruleSchedule1101 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_ruleWeekdays_in_ruleSchedule1122 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_17_in_ruleSchedule1139 = new BitSet(new long[]{0x0000000000140010L});
        public static final BitSet FOLLOW_ruleTime_in_ruleSchedule1160 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSchedule1172 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleTime_in_ruleSchedule1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime1231 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleTime1297 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTime1309 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleTime1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort1369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEShort1419 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEShort1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleState1660 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1681 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleState1699 = new BitSet(new long[]{0x1800000000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleState1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy1763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePolicy1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePolicy1819 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePolicy1840 = new BitSet(new long[]{0x0000000007000002L});
        public static final BitSet FOLLOW_24_in_rulePolicy1853 = new BitSet(new long[]{0x0001FE8006000002L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy1875 = new BitSet(new long[]{0x0000000006010002L});
        public static final BitSet FOLLOW_16_in_rulePolicy1888 = new BitSet(new long[]{0x0001FE8000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy1909 = new BitSet(new long[]{0x0000000006010002L});
        public static final BitSet FOLLOW_25_in_rulePolicy1928 = new BitSet(new long[]{0x007E000004000002L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1950 = new BitSet(new long[]{0x0000000004010002L});
        public static final BitSet FOLLOW_16_in_rulePolicy1963 = new BitSet(new long[]{0x007E000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1984 = new BitSet(new long[]{0x0000000004010002L});
        public static final BitSet FOLLOW_26_in_rulePolicy2003 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulePolicy2015 = new BitSet(new long[]{0x0400000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy2037 = new BitSet(new long[]{0x0400000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy2058 = new BitSet(new long[]{0x0400000000002000L});
        public static final BitSet FOLLOW_13_in_rulePolicy2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuilding_in_entryRuleBuilding2111 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuilding2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleBuilding2167 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBuilding2188 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleBuilding2200 = new BitSet(new long[]{0x0000006490002000L});
        public static final BitSet FOLLOW_ruleCTS_in_ruleBuilding2221 = new BitSet(new long[]{0x0000006410002000L});
        public static final BitSet FOLLOW_ruleAccessControl_in_ruleBuilding2243 = new BitSet(new long[]{0x0000006010002000L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_ruleBuilding2265 = new BitSet(new long[]{0x0000004010002000L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding2287 = new BitSet(new long[]{0x0000000010002000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding2310 = new BitSet(new long[]{0x0000000010002000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding2331 = new BitSet(new long[]{0x0000000010002000L});
        public static final BitSet FOLLOW_13_in_ruleBuilding2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloor_in_entryRuleFloor2382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloor2392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleFloor2438 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFloor2459 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleFloor2471 = new BitSet(new long[]{0x0000000020002000L});
        public static final BitSet FOLLOW_29_in_ruleFloor2484 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor2505 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleFloor2518 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor2539 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleFloor2555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom2591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoom2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom2656 = new BitSet(new long[]{0x0000000040000800L});
        public static final BitSet FOLLOW_30_in_ruleRoom2669 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom2692 = new BitSet(new long[]{0x0000000000000860L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom2715 = new BitSet(new long[]{0x0000000000000860L});
        public static final BitSet FOLLOW_11_in_ruleRoom2731 = new BitSet(new long[]{0x0280000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom2753 = new BitSet(new long[]{0x0280000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom2774 = new BitSet(new long[]{0x0280000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom2799 = new BitSet(new long[]{0x0200000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom2820 = new BitSet(new long[]{0x0200000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRoom2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCTS_in_entryRuleCTS2872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCTS2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCTS2928 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2940 = new BitSet(new long[]{0x0000000300002000L});
        public static final BitSet FOLLOW_32_in_ruleCTS2953 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2965 = new BitSet(new long[]{0x0001FE8000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS2986 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleCTS2999 = new BitSet(new long[]{0x0001FE8000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS3020 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3034 = new BitSet(new long[]{0x0000000200002000L});
        public static final BitSet FOLLOW_33_in_ruleCTS3049 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS3061 = new BitSet(new long[]{0x007E000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS3082 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleCTS3095 = new BitSet(new long[]{0x007E000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS3116 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3130 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessControl_in_entryRuleAccessControl3180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessControl3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAccessControl3236 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3248 = new BitSet(new long[]{0x0000001800002000L});
        public static final BitSet FOLLOW_35_in_ruleAccessControl3261 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3273 = new BitSet(new long[]{0x0001FE8000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl3294 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleAccessControl3307 = new BitSet(new long[]{0x0001FE8000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl3328 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3342 = new BitSet(new long[]{0x0000001000002000L});
        public static final BitSet FOLLOW_36_in_ruleAccessControl3357 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3369 = new BitSet(new long[]{0x007E000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl3390 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleAccessControl3403 = new BitSet(new long[]{0x007E000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl3424 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3438 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem3488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarSystem3498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCalendarSystem3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem3580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMeetingScheduleSystem3636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMotionSensor3682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMotionSensor3728 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleMotionSensor3741 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleMotionSensor3753 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMotionSensor3765 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMotionSensor3786 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMotionSensor3798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor3846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTemperatureSensor3892 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTemperatureSensor3905 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleTemperatureSensor3917 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTemperatureSensor3929 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTemperatureSensor3950 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTemperatureSensor3962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor4000 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePressureSensor4056 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulePressureSensor4069 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_rulePressureSensor4081 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePressureSensor4093 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePressureSensor4114 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePressureSensor4126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor4164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTouchSensor4174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleTouchSensor4220 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTouchSensor4233 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleTouchSensor4245 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTouchSensor4257 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTouchSensor4278 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTouchSensor4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor4328 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor4338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleLightSensor4384 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSensor4397 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleLightSensor4409 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLightSensor4421 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSensor4442 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSensor4454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSmokeSensor4502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleSmokeSensor4548 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleSmokeSensor4561 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSmokeSensor4573 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSmokeSensor4585 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSmokeSensor4606 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSmokeSensor4618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCO2Sensor4666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleCO2Sensor4712 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleCO2Sensor4725 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCO2Sensor4737 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCO2Sensor4749 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCO2Sensor4770 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCO2Sensor4782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfraredLightSensor4830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleInfraredLightSensor4876 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleInfraredLightSensor4889 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleInfraredLightSensor4901 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInfraredLightSensor4913 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInfraredLightSensor4934 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInfraredLightSensor4946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor4986 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumiditySensor4996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleHumiditySensor5042 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumiditySensor5055 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleHumiditySensor5067 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleHumiditySensor5079 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumiditySensor5100 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHumiditySensor5112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5151 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEInt5201 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSwitchActuator5273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleLightSwitchActuator5319 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSwitchActuator5332 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleLightSwitchActuator5344 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLightSwitchActuator5356 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSwitchActuator5377 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSwitchActuator5389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWindowActuator5437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleWindowActuator5483 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleWindowActuator5496 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleWindowActuator5508 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleWindowActuator5520 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWindowActuator5541 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWindowActuator5553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumidifierActuator5601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleHumidifierActuator5647 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumidifierActuator5660 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleHumidifierActuator5672 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleHumidifierActuator5684 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumidifierActuator5705 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHumidifierActuator5717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5755 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoorActuator5765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleDoorActuator5811 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleDoorActuator5824 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleDoorActuator5836 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDoorActuator5848 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDoorActuator5869 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDoorActuator5881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadiatorActuator5929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleRadiatorActuator5975 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleRadiatorActuator5988 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRadiatorActuator6000 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRadiatorActuator6012 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRadiatorActuator6033 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRadiatorActuator6045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator6083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAudioAlarmActuator6093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAudioAlarmActuator6139 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAudioAlarmActuator6152 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAudioAlarmActuator6164 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAudioAlarmActuator6176 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAudioAlarmActuator6197 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAudioAlarmActuator6209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent6249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorComponent6259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleSensorComponent6305 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorComponent6326 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_56_in_ruleSensorComponent6339 = new BitSet(new long[]{0x0001FE8000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent6360 = new BitSet(new long[]{0x0001FE8000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent6381 = new BitSet(new long[]{0x0001FE8000000002L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent6420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuatorComponent6430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleActuatorComponent6476 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActuatorComponent6497 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_56_in_ruleActuatorComponent6510 = new BitSet(new long[]{0x007E000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent6531 = new BitSet(new long[]{0x007E000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent6552 = new BitSet(new long[]{0x007E000000000002L});
        public static final BitSet FOLLOW_ruleConditions_in_entryRuleConditions6591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditions6601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleConditions6647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean6684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean6695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEBoolean6733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEBoolean6752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleWeekdays6806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleWeekdays6823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleWeekdays6840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleWeekdays6857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleWeekdays6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleWeekdays6891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleWeekdays6908 = new BitSet(new long[]{0x0000000000000002L});
    }


}