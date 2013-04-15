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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'room-type'", "'}'", "'state'", "'='", "'schedule'", "'days'", "','", "'from'", "'to'", "'policy'", "'uses sensors'", "'uses actuators'", "'is specified by'", "'building'", "'floor'", "'room'", "'is-of-type'", "'is-controlled-by'", "':'", "'-'", "'CTS'", "'temperatureSensors'", "'ctsActuators'", "'AccessControl'", "'accessControlSensors'", "'accessControlDoorLockActuator'", "'CalendarSystem'", "'MeetingScheduleSystem'", "'MotionSensor'", "'valueState'", "'TemperatureSensor'", "'PressureSensor'", "'TouchSensor'", "'LightSensor'", "'SmokeSensor'", "'CO2Sensor'", "'InfraredLightSensor'", "'HumiditySensor'", "'LightSwitchActuator'", "'WindowActuator'", "'HumidifierActuator'", "'DoorActuator'", "'RadiatorActuator'", "'AudioAlarmActuator'", "'sensor '", "'is a '", "'actuator'", "'Conditions'", "'true'", "'false'", "'MONDAY'", "'TUESDAY'", "'WEDENSDAY'", "'THURSDAY'", "'FRIDAY'", "'SATURDAY'", "'SUNDAY'"
    };
    public static final int T__68=68;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:77:1: ruleModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) )* ( ( (lv_buildings_11_0= ruleBuilding ) ) ( (lv_buildings_12_0= ruleBuilding ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_stateDefinition_3_0 = null;

        EObject lv_stateDefinition_4_0 = null;

        EObject lv_policyDefinition_5_0 = null;

        EObject lv_policyDefinition_6_0 = null;

        EObject lv_schedules_7_0 = null;

        EObject lv_schedules_8_0 = null;

        EObject lv_predefinedRooms_10_0 = null;

        EObject lv_buildings_11_0 = null;

        EObject lv_buildings_12_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) )* ( ( (lv_buildings_11_0= ruleBuilding ) ) ( (lv_buildings_12_0= ruleBuilding ) )* )? otherlv_13= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) )* ( ( (lv_buildings_11_0= ruleBuilding ) ) ( (lv_buildings_12_0= ruleBuilding ) )* )? otherlv_13= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) )* ( ( (lv_buildings_11_0= ruleBuilding ) ) ( (lv_buildings_12_0= ruleBuilding ) )* )? otherlv_13= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_schedules_7_0= ruleSchedule ) ) ( (lv_schedules_8_0= ruleSchedule ) )* )? (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) )* ( ( (lv_buildings_11_0= ruleBuilding ) ) ( (lv_buildings_12_0= ruleBuilding ) )* )? otherlv_13= '}'
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

            if ( (LA2_0==14) ) {
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

                        if ( (LA1_0==14) ) {
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

            if ( (LA4_0==21) ) {
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

                        if ( (LA3_0==21) ) {
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

            if ( (LA6_0==16) ) {
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

                        if ( (LA5_0==16) ) {
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:217:5: (otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:217:7: otherlv_9= 'room-type' ( (lv_predefinedRooms_10_0= ruleRoom ) )
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


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:239:4: ( ( (lv_buildings_11_0= ruleBuilding ) ) ( (lv_buildings_12_0= ruleBuilding ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:239:5: ( (lv_buildings_11_0= ruleBuilding ) ) ( (lv_buildings_12_0= ruleBuilding ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:239:5: ( (lv_buildings_11_0= ruleBuilding ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:240:1: (lv_buildings_11_0= ruleBuilding )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:240:1: (lv_buildings_11_0= ruleBuilding )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:241:3: lv_buildings_11_0= ruleBuilding
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel348);
                    lv_buildings_11_0=ruleBuilding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"buildings",
                            		lv_buildings_11_0, 
                            		"Building");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:257:2: ( (lv_buildings_12_0= ruleBuilding ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:258:1: (lv_buildings_12_0= ruleBuilding )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:258:1: (lv_buildings_12_0= ruleBuilding )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:259:3: lv_buildings_12_0= ruleBuilding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel369);
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
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel384); 

                	newLeafNode(otherlv_13, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleState"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:287:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:288:2: (iv_ruleState= ruleState EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:289:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState420);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState430); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:296:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valueState_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:299:28: ( ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:300:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:300:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:300:2: () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:300:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleState476); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:310:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:311:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:311:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:312:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState497);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:328:2: ( (lv_valueState_3_0= '=' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:329:1: (lv_valueState_3_0= '=' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:329:1: (lv_valueState_3_0= '=' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:330:3: lv_valueState_3_0= '='
            {
            lv_valueState_3_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState515); 

                    newLeafNode(lv_valueState_3_0, grammarAccess.getStateAccess().getValueStateEqualsSignKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(current, "valueState", true, "=");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getStateAccess().getEBooleanParserRuleCall_4()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleState544);
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


    // $ANTLR start "entryRuleSchedule"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:359:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:360:2: (iv_ruleSchedule= ruleSchedule EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:361:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchedule_in_entryRuleSchedule579);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSchedule589); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:368:1: ruleSchedule returns [EObject current=null] : ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:371:28: ( ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:372:1: ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:372:1: ( () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:372:2: () otherlv_1= 'schedule' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )? (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:372:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:373:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getScheduleAccess().getScheduleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchedule635); 

                	newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getScheduleKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:382:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:383:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:383:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:384:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScheduleAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSchedule656);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:400:2: (otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:400:4: otherlv_3= 'days' ( (lv_weekdays_4_0= ruleWeekdays ) ) (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )*
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSchedule669); 

                        	newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getDaysKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:404:1: ( (lv_weekdays_4_0= ruleWeekdays ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:405:1: (lv_weekdays_4_0= ruleWeekdays )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:405:1: (lv_weekdays_4_0= ruleWeekdays )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:406:3: lv_weekdays_4_0= ruleWeekdays
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduleAccess().getWeekdaysWeekdaysEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWeekdays_in_ruleSchedule690);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:422:2: (otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:422:4: otherlv_5= ',' ( (lv_weekdays_6_0= ruleWeekdays ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSchedule703); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getScheduleAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:426:1: ( (lv_weekdays_6_0= ruleWeekdays ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:427:1: (lv_weekdays_6_0= ruleWeekdays )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:427:1: (lv_weekdays_6_0= ruleWeekdays )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:428:3: lv_weekdays_6_0= ruleWeekdays
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScheduleAccess().getWeekdaysWeekdaysEnumRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWeekdays_in_ruleSchedule724);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:444:6: (otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:444:8: otherlv_7= 'from' ( (lv_from_8_0= ruleTime ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleTime ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSchedule741); 

                        	newLeafNode(otherlv_7, grammarAccess.getScheduleAccess().getFromKeyword_4_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:448:1: ( (lv_from_8_0= ruleTime ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:449:1: (lv_from_8_0= ruleTime )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:449:1: (lv_from_8_0= ruleTime )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:450:3: lv_from_8_0= ruleTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduleAccess().getFromTimeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleSchedule762);
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

                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSchedule774); 

                        	newLeafNode(otherlv_9, grammarAccess.getScheduleAccess().getToKeyword_4_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:470:1: ( (lv_to_10_0= ruleTime ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:471:1: (lv_to_10_0= ruleTime )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:471:1: (lv_to_10_0= ruleTime )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:472:3: lv_to_10_0= ruleTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduleAccess().getToTimeParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleSchedule795);
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


    // $ANTLR start "entryRulePolicy"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:496:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:497:2: (iv_rulePolicy= rulePolicy EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:498:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePolicy_in_entryRulePolicy833);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePolicy843); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:505:1: rulePolicy returns [EObject current=null] : ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:508:28: ( ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:509:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:509:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:509:2: () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )? (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:509:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:510:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolicyAccess().getPolicyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePolicy889); 

                	newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getPolicyKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:519:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:520:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:520:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:521:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPolicyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePolicy910);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:537:2: (otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:537:4: otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )?
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePolicy923); 

                        	newLeafNode(otherlv_3, grammarAccess.getPolicyAccess().getUsesSensorsKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:541:1: ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==40||(LA14_0>=42 && LA14_0<=49)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:541:2: ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:541:2: ( (lv_usesSensors_4_0= ruleSensor ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:542:1: (lv_usesSensors_4_0= ruleSensor )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:542:1: (lv_usesSensors_4_0= ruleSensor )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:543:3: lv_usesSensors_4_0= ruleSensor
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy945);
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

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:559:2: (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==18) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:559:4: otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) )
                            	    {
                            	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePolicy958); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:563:1: ( (lv_usesSensors_6_0= ruleSensor ) )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:564:1: (lv_usesSensors_6_0= ruleSensor )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:564:1: (lv_usesSensors_6_0= ruleSensor )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:565:3: lv_usesSensors_6_0= ruleSensor
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy979);
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
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:581:8: (otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:581:10: otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )?
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePolicy998); 

                        	newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getUsesActuatorsKeyword_4_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:585:1: ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=50 && LA17_0<=55)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:585:2: ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:585:2: ( (lv_uses_8_0= ruleActuator ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:586:1: (lv_uses_8_0= ruleActuator )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:586:1: (lv_uses_8_0= ruleActuator )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:587:3: lv_uses_8_0= ruleActuator
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1020);
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

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:603:2: (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==18) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:603:4: otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) )
                            	    {
                            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePolicy1033); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getCommaKeyword_4_1_1_0());
                            	        
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:607:1: ( (lv_uses_10_0= ruleActuator ) )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:608:1: (lv_uses_10_0= ruleActuator )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:608:1: (lv_uses_10_0= ruleActuator )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:609:3: lv_uses_10_0= ruleActuator
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_4_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1054);
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:625:8: (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:625:10: otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePolicy1073); 

                        	newLeafNode(otherlv_11, grammarAccess.getPolicyAccess().getIsSpecifiedByKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePolicy1085); 

                        	newLeafNode(otherlv_12, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:633:1: ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==59) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:633:2: ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )*
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:633:2: ( (lv_specifiedBy_13_0= ruleConditions ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:634:1: (lv_specifiedBy_13_0= ruleConditions )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:634:1: (lv_specifiedBy_13_0= ruleConditions )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:635:3: lv_specifiedBy_13_0= ruleConditions
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_5_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy1107);
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

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:651:2: ( (lv_specifiedBy_14_0= ruleConditions ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==59) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:652:1: (lv_specifiedBy_14_0= ruleConditions )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:652:1: (lv_specifiedBy_14_0= ruleConditions )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:653:3: lv_specifiedBy_14_0= ruleConditions
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_5_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy1128);
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
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePolicy1143); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:681:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:682:2: (iv_ruleBuilding= ruleBuilding EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:683:2: iv_ruleBuilding= ruleBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_entryRuleBuilding1181);
            iv_ruleBuilding=ruleBuilding();

            state._fsp--;

             current =iv_ruleBuilding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuilding1191); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:690:1: ruleBuilding returns [EObject current=null] : ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:693:28: ( ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:694:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:694:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:694:2: () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:694:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:695:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildingAccess().getBuildingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBuilding1237); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildingAccess().getBuildingKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:704:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:705:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:705:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:706:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBuilding1258);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBuilding1270); 

                	newLeafNode(otherlv_3, grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:726:1: ( (lv_ctsSystem_4_0= ruleCTS ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:727:1: (lv_ctsSystem_4_0= ruleCTS )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:727:1: (lv_ctsSystem_4_0= ruleCTS )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:728:3: lv_ctsSystem_4_0= ruleCTS
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCtsSystemCTSParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCTS_in_ruleBuilding1291);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:744:3: ( (lv_accessControl_5_0= ruleAccessControl ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:745:1: (lv_accessControl_5_0= ruleAccessControl )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:745:1: (lv_accessControl_5_0= ruleAccessControl )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:746:3: lv_accessControl_5_0= ruleAccessControl
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getAccessControlAccessControlParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_ruleBuilding1313);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:762:3: ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:763:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:763:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:764:3: lv_calendarSystem_6_0= ruleCalendarSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCalendarSystemCalendarSystemParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_ruleBuilding1335);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:780:3: ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:781:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:781:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:782:3: lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getMeetingScheduleSystemMeetingScheduleSystemParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1357);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:798:3: ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:798:4: ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:798:4: ( (lv_floors_8_0= ruleFloor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:799:1: (lv_floors_8_0= ruleFloor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:799:1: (lv_floors_8_0= ruleFloor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:800:3: lv_floors_8_0= ruleFloor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1380);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:816:2: ( (lv_floors_9_0= ruleFloor ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==26) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:817:1: (lv_floors_9_0= ruleFloor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:817:1: (lv_floors_9_0= ruleFloor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:818:3: lv_floors_9_0= ruleFloor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1401);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBuilding1416); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:846:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:847:2: (iv_ruleFloor= ruleFloor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:848:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloor_in_entryRuleFloor1452);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloor1462); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:855:1: ruleFloor returns [EObject current=null] : ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:858:28: ( ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:859:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:859:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:859:2: () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:859:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:860:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloorAccess().getFloorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFloor1508); 

                	newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:869:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:870:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:870:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:871:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFloor1529);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFloor1541); 

                	newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:891:1: (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:891:3: otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFloor1554); 

                        	newLeafNode(otherlv_4, grammarAccess.getFloorAccess().getRoomKeyword_4_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:895:1: ( (lv_rooms_5_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:896:1: (lv_rooms_5_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:896:1: (lv_rooms_5_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:897:3: lv_rooms_5_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor1575);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:913:2: (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==18) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:913:4: otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFloor1588); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getFloorAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:917:1: ( (lv_rooms_7_0= ruleRoom ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:918:1: (lv_rooms_7_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:918:1: (lv_rooms_7_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:919:3: lv_rooms_7_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor1609);
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFloor1625); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:947:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:948:2: (iv_ruleRoom= ruleRoom EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:949:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoom_in_entryRuleRoom1661);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoom1671); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:956:1: ruleRoom returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= '{' ( ( (lv_declareSensor_10_0= ruleSensorComponent ) ) ( (lv_declareSensor_11_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_12_0= ruleActuatorComponent ) ) ( (lv_declareActuator_13_0= ruleActuatorComponent ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_declareSensor_10_0 = null;

        EObject lv_declareSensor_11_0 = null;

        EObject lv_declareActuator_12_0 = null;

        EObject lv_declareActuator_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:959:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= '{' ( ( (lv_declareSensor_10_0= ruleSensorComponent ) ) ( (lv_declareSensor_11_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_12_0= ruleActuatorComponent ) ) ( (lv_declareActuator_13_0= ruleActuatorComponent ) )* )? otherlv_14= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:960:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= '{' ( ( (lv_declareSensor_10_0= ruleSensorComponent ) ) ( (lv_declareSensor_11_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_12_0= ruleActuatorComponent ) ) ( (lv_declareActuator_13_0= ruleActuatorComponent ) )* )? otherlv_14= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:960:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= '{' ( ( (lv_declareSensor_10_0= ruleSensorComponent ) ) ( (lv_declareSensor_11_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_12_0= ruleActuatorComponent ) ) ( (lv_declareActuator_13_0= ruleActuatorComponent ) )* )? otherlv_14= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:960:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= '{' ( ( (lv_declareSensor_10_0= ruleSensorComponent ) ) ( (lv_declareSensor_11_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_12_0= ruleActuatorComponent ) ) ( (lv_declareActuator_13_0= ruleActuatorComponent ) )* )? otherlv_14= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:960:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:961:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoomAccess().getRoomAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:966:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:967:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:967:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:968:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1726);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:984:2: (otherlv_2= 'is-of-type' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:984:4: otherlv_2= 'is-of-type' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRoom1739); 

                        	newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getIsOfTypeKeyword_2_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:988:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:989:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:989:1: ( ruleEString )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:990:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoomRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1762);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1003:2: ( ( ruleEString ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1004:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1004:1: ( ruleEString )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1005:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoomRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_2_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1785);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1018:5: (otherlv_5= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1018:7: otherlv_5= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRoom1801); 

                        	newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getIsControlledByKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1022:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1023:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1023:1: ( ruleEString )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1024:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoomRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getPoliciesPolicyCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1824);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1037:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1037:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRoom1837); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1041:1: ( ( ruleEString ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1042:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1042:1: ( ruleEString )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1043:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoomRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getPoliciesPolicyCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1860);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoom1876); 

                	newLeafNode(otherlv_9, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1060:1: ( ( (lv_declareSensor_10_0= ruleSensorComponent ) ) ( (lv_declareSensor_11_0= ruleSensorComponent ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1060:2: ( (lv_declareSensor_10_0= ruleSensorComponent ) ) ( (lv_declareSensor_11_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1060:2: ( (lv_declareSensor_10_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1061:1: (lv_declareSensor_10_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1061:1: (lv_declareSensor_10_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1062:3: lv_declareSensor_10_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom1898);
                    lv_declareSensor_10_0=ruleSensorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	        }
                           		add(
                           			current, 
                           			"declareSensor",
                            		lv_declareSensor_10_0, 
                            		"SensorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1078:2: ( (lv_declareSensor_11_0= ruleSensorComponent ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==56) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1079:1: (lv_declareSensor_11_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1079:1: (lv_declareSensor_11_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1080:3: lv_declareSensor_11_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom1919);
                    	    lv_declareSensor_11_0=ruleSensorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareSensor",
                    	            		lv_declareSensor_11_0, 
                    	            		"SensorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1096:5: ( ( (lv_declareActuator_12_0= ruleActuatorComponent ) ) ( (lv_declareActuator_13_0= ruleActuatorComponent ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1096:6: ( (lv_declareActuator_12_0= ruleActuatorComponent ) ) ( (lv_declareActuator_13_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1096:6: ( (lv_declareActuator_12_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1097:1: (lv_declareActuator_12_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1097:1: (lv_declareActuator_12_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1098:3: lv_declareActuator_12_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom1944);
                    lv_declareActuator_12_0=ruleActuatorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	        }
                           		add(
                           			current, 
                           			"declareActuator",
                            		lv_declareActuator_12_0, 
                            		"ActuatorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1114:2: ( (lv_declareActuator_13_0= ruleActuatorComponent ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==58) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1115:1: (lv_declareActuator_13_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1115:1: (lv_declareActuator_13_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1116:3: lv_declareActuator_13_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom1965);
                    	    lv_declareActuator_13_0=ruleActuatorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareActuator",
                    	            		lv_declareActuator_13_0, 
                    	            		"ActuatorComponent");
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

            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoom1980); 

                	newLeafNode(otherlv_14, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleActuator"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1144:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1145:2: (iv_ruleActuator= ruleActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1146:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator2016);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator2026); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1153:1: ruleActuator returns [EObject current=null] : (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1156:28: ( (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1157:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1157:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt38=1;
                }
                break;
            case 51:
                {
                alt38=2;
                }
                break;
            case 52:
                {
                alt38=3;
                }
                break;
            case 53:
                {
                alt38=4;
                }
                break;
            case 54:
                {
                alt38=5;
                }
                break;
            case 55:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1158:5: this_LightSwitchActuator_0= ruleLightSwitchActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getLightSwitchActuatorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_ruleActuator2073);
                    this_LightSwitchActuator_0=ruleLightSwitchActuator();

                    state._fsp--;

                     
                            current = this_LightSwitchActuator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1168:5: this_WindowActuator_1= ruleWindowActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getWindowActuatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_ruleActuator2100);
                    this_WindowActuator_1=ruleWindowActuator();

                    state._fsp--;

                     
                            current = this_WindowActuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1178:5: this_HumidifierActuator_2= ruleHumidifierActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getHumidifierActuatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_ruleActuator2127);
                    this_HumidifierActuator_2=ruleHumidifierActuator();

                    state._fsp--;

                     
                            current = this_HumidifierActuator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1188:5: this_DoorActuator_3= ruleDoorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getDoorActuatorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_ruleActuator2154);
                    this_DoorActuator_3=ruleDoorActuator();

                    state._fsp--;

                     
                            current = this_DoorActuator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1198:5: this_RadiatorActuator_4= ruleRadiatorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getRadiatorActuatorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_ruleActuator2181);
                    this_RadiatorActuator_4=ruleRadiatorActuator();

                    state._fsp--;

                     
                            current = this_RadiatorActuator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1208:5: this_AudioAlarmActuator_5= ruleAudioAlarmActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getAudioAlarmActuatorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_ruleActuator2208);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1224:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1225:2: (iv_ruleSensor= ruleSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1226:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor2243);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor2253); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1233:1: ruleSensor returns [EObject current=null] : (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1236:28: ( (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1237:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1237:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor )
            int alt39=9;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt39=1;
                }
                break;
            case 42:
                {
                alt39=2;
                }
                break;
            case 43:
                {
                alt39=3;
                }
                break;
            case 44:
                {
                alt39=4;
                }
                break;
            case 45:
                {
                alt39=5;
                }
                break;
            case 46:
                {
                alt39=6;
                }
                break;
            case 47:
                {
                alt39=7;
                }
                break;
            case 48:
                {
                alt39=8;
                }
                break;
            case 49:
                {
                alt39=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1238:5: this_MotionSensor_0= ruleMotionSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getMotionSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_ruleSensor2300);
                    this_MotionSensor_0=ruleMotionSensor();

                    state._fsp--;

                     
                            current = this_MotionSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1248:5: this_TemperatureSensor_1= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTemperatureSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleSensor2327);
                    this_TemperatureSensor_1=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1258:5: this_PressureSensor_2= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getPressureSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleSensor2354);
                    this_PressureSensor_2=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1268:5: this_TouchSensor_3= ruleTouchSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTouchSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_ruleSensor2381);
                    this_TouchSensor_3=ruleTouchSensor();

                    state._fsp--;

                     
                            current = this_TouchSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1278:5: this_LightSensor_4= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleSensor2408);
                    this_LightSensor_4=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1288:5: this_SmokeSensor_5= ruleSmokeSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getSmokeSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_ruleSensor2435);
                    this_SmokeSensor_5=ruleSmokeSensor();

                    state._fsp--;

                     
                            current = this_SmokeSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1298:5: this_CO2Sensor_6= ruleCO2Sensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getCO2SensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_ruleSensor2462);
                    this_CO2Sensor_6=ruleCO2Sensor();

                    state._fsp--;

                     
                            current = this_CO2Sensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1308:5: this_InfraredLightSensor_7= ruleInfraredLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getInfraredLightSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_ruleSensor2489);
                    this_InfraredLightSensor_7=ruleInfraredLightSensor();

                    state._fsp--;

                     
                            current = this_InfraredLightSensor_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1318:5: this_HumiditySensor_8= ruleHumiditySensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getHumiditySensorParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_ruleSensor2516);
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


    // $ANTLR start "entryRuleTime"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1334:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1335:2: (iv_ruleTime= ruleTime EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1336:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime2551);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime2561); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1343:1: ruleTime returns [EObject current=null] : ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_hours_1_0 = null;

        AntlrDatatypeRuleToken lv_minutes_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1346:28: ( ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1347:1: ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1347:1: ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1347:2: () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1347:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeAccess().getTimeAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1353:2: ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT||LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1353:3: ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1353:3: ( (lv_hours_1_0= ruleEShort ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1354:1: (lv_hours_1_0= ruleEShort )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1354:1: (lv_hours_1_0= ruleEShort )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1355:3: lv_hours_1_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeAccess().getHoursEShortParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleTime2617);
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

                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTime2629); 

                        	newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getColonKeyword_1_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1375:1: ( (lv_minutes_3_0= ruleEShort ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1376:1: (lv_minutes_3_0= ruleEShort )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1376:1: (lv_minutes_3_0= ruleEShort )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1377:3: lv_minutes_3_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeAccess().getMinutesEShortParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleTime2650);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1401:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1402:2: (iv_ruleEShort= ruleEShort EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1403:2: iv_ruleEShort= ruleEShort EOF
            {
             newCompositeNode(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort2689);
            iv_ruleEShort=ruleEShort();

            state._fsp--;

             current =iv_ruleEShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort2700); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1410:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1413:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1414:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1414:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1414:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1414:2: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1415:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEShort2739); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEShort2756); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1435:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1436:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1437:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2802);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2813); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1444:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1447:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1448:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1448:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1448:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2853); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1456:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2879); 

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


    // $ANTLR start "entryRuleCTS"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1471:1: entryRuleCTS returns [EObject current=null] : iv_ruleCTS= ruleCTS EOF ;
    public final EObject entryRuleCTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTS = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1472:2: (iv_ruleCTS= ruleCTS EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1473:2: iv_ruleCTS= ruleCTS EOF
            {
             newCompositeNode(grammarAccess.getCTSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCTS_in_entryRuleCTS2924);
            iv_ruleCTS=ruleCTS();

            state._fsp--;

             current =iv_ruleCTS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCTS2934); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1480:1: ruleCTS returns [EObject current=null] : ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1483:28: ( ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:2: () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1485:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCTSAccess().getCTSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCTS2980); 

                	newLeafNode(otherlv_1, grammarAccess.getCTSAccess().getCTSKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2992); 

                	newLeafNode(otherlv_2, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1498:1: (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1498:3: otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCTS3005); 

                        	newLeafNode(otherlv_3, grammarAccess.getCTSAccess().getTemperatureSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS3017); 

                        	newLeafNode(otherlv_4, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1506:1: ( (lv_temperatureSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1507:1: (lv_temperatureSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1507:1: (lv_temperatureSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1508:3: lv_temperatureSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS3038);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1524:2: (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==18) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1524:4: otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS3051); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCTSAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1528:1: ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1529:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1529:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1530:3: lv_temperatureSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS3072);
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
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3086); 

                        	newLeafNode(otherlv_8, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1550:3: (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1550:5: otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCTS3101); 

                        	newLeafNode(otherlv_9, grammarAccess.getCTSAccess().getCtsActuatorsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS3113); 

                        	newLeafNode(otherlv_10, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1558:1: ( (lv_ctsActuators_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1559:1: (lv_ctsActuators_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1559:1: (lv_ctsActuators_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1560:3: lv_ctsActuators_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS3134);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1576:2: (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==18) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1576:4: otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS3147); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCTSAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1580:1: ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1581:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1581:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1582:3: lv_ctsActuators_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS3168);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3182); 

                        	newLeafNode(otherlv_14, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3196); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1614:1: entryRuleAccessControl returns [EObject current=null] : iv_ruleAccessControl= ruleAccessControl EOF ;
    public final EObject entryRuleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControl = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1615:2: (iv_ruleAccessControl= ruleAccessControl EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1616:2: iv_ruleAccessControl= ruleAccessControl EOF
            {
             newCompositeNode(grammarAccess.getAccessControlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_entryRuleAccessControl3232);
            iv_ruleAccessControl=ruleAccessControl();

            state._fsp--;

             current =iv_ruleAccessControl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessControl3242); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1623:1: ruleAccessControl returns [EObject current=null] : ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1626:28: ( ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1627:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1627:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1627:2: () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1627:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1628:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccessControlAccess().getAccessControlAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAccessControl3288); 

                	newLeafNode(otherlv_1, grammarAccess.getAccessControlAccess().getAccessControlKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3300); 

                	newLeafNode(otherlv_2, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1641:1: (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1641:3: otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAccessControl3313); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccessControlAccess().getAccessControlSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3325); 

                        	newLeafNode(otherlv_4, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1649:1: ( (lv_accessControlSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1650:1: (lv_accessControlSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1650:1: (lv_accessControlSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1651:3: lv_accessControlSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl3346);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1667:2: (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==18) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1667:4: otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl3359); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAccessControlAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1671:1: ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1672:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1672:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1673:3: lv_accessControlSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl3380);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3394); 

                        	newLeafNode(otherlv_8, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1693:3: (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==37) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1693:5: otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAccessControl3409); 

                        	newLeafNode(otherlv_9, grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3421); 

                        	newLeafNode(otherlv_10, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1701:1: ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1702:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1702:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1703:3: lv_accessControlDoorLockActuator_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl3442);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1719:2: (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==18) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1719:4: otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl3455); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAccessControlAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1723:1: ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1724:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1724:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1725:3: lv_accessControlDoorLockActuator_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl3476);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3490); 

                        	newLeafNode(otherlv_14, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3504); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1757:1: entryRuleCalendarSystem returns [EObject current=null] : iv_ruleCalendarSystem= ruleCalendarSystem EOF ;
    public final EObject entryRuleCalendarSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1758:2: (iv_ruleCalendarSystem= ruleCalendarSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1759:2: iv_ruleCalendarSystem= ruleCalendarSystem EOF
            {
             newCompositeNode(grammarAccess.getCalendarSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem3540);
            iv_ruleCalendarSystem=ruleCalendarSystem();

            state._fsp--;

             current =iv_ruleCalendarSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarSystem3550); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1766:1: ruleCalendarSystem returns [EObject current=null] : ( () otherlv_1= 'CalendarSystem' ) ;
    public final EObject ruleCalendarSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1769:28: ( ( () otherlv_1= 'CalendarSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1770:1: ( () otherlv_1= 'CalendarSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1770:1: ( () otherlv_1= 'CalendarSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1770:2: () otherlv_1= 'CalendarSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1770:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1771:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCalendarSystemAccess().getCalendarSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCalendarSystem3596); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1788:1: entryRuleMeetingScheduleSystem returns [EObject current=null] : iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF ;
    public final EObject entryRuleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingScheduleSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1789:2: (iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1790:2: iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF
            {
             newCompositeNode(grammarAccess.getMeetingScheduleSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem3632);
            iv_ruleMeetingScheduleSystem=ruleMeetingScheduleSystem();

            state._fsp--;

             current =iv_ruleMeetingScheduleSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3642); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1797:1: ruleMeetingScheduleSystem returns [EObject current=null] : ( () otherlv_1= 'MeetingScheduleSystem' ) ;
    public final EObject ruleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1800:28: ( ( () otherlv_1= 'MeetingScheduleSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1801:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1801:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1801:2: () otherlv_1= 'MeetingScheduleSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1801:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1802:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeetingScheduleSystemAccess().getMeetingScheduleSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMeetingScheduleSystem3688); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1819:1: entryRuleMotionSensor returns [EObject current=null] : iv_ruleMotionSensor= ruleMotionSensor EOF ;
    public final EObject entryRuleMotionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotionSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1820:2: (iv_ruleMotionSensor= ruleMotionSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1821:2: iv_ruleMotionSensor= ruleMotionSensor EOF
            {
             newCompositeNode(grammarAccess.getMotionSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3724);
            iv_ruleMotionSensor=ruleMotionSensor();

            state._fsp--;

             current =iv_ruleMotionSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMotionSensor3734); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1828:1: ruleMotionSensor returns [EObject current=null] : ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1831:28: ( ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1832:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1832:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1832:2: () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1832:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1833:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMotionSensorAccess().getMotionSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMotionSensor3780); 

                	newLeafNode(otherlv_1, grammarAccess.getMotionSensorAccess().getMotionSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1842:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==11) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1842:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMotionSensor3793); 

                        	newLeafNode(otherlv_2, grammarAccess.getMotionSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMotionSensor3805); 

                        	newLeafNode(otherlv_3, grammarAccess.getMotionSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMotionSensor3817); 

                        	newLeafNode(otherlv_4, grammarAccess.getMotionSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1854:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1855:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1855:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1856:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMotionSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMotionSensor3838);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMotionSensor3850); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1884:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1885:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1886:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3888);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor3898); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1893:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1896:28: ( ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1897:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1897:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1897:2: () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1897:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1898:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTemperatureSensor3944); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1907:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1907:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTemperatureSensor3957); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTemperatureSensor3969); 

                        	newLeafNode(otherlv_3, grammarAccess.getTemperatureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTemperatureSensor3981); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemperatureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1919:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1920:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1920:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1921:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemperatureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTemperatureSensor4002);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTemperatureSensor4014); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1949:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1950:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1951:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor4052);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor4062); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1958:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1961:28: ( ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1962:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1962:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1962:2: () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1962:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1963:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePressureSensor4108); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1972:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==11) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1972:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePressureSensor4121); 

                        	newLeafNode(otherlv_2, grammarAccess.getPressureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePressureSensor4133); 

                        	newLeafNode(otherlv_3, grammarAccess.getPressureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePressureSensor4145); 

                        	newLeafNode(otherlv_4, grammarAccess.getPressureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1984:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1985:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1985:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1986:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPressureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePressureSensor4166);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePressureSensor4178); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2014:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2015:2: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2016:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor4216);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTouchSensor4226); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2023:1: ruleTouchSensor returns [EObject current=null] : ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2026:28: ( ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2027:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2027:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2027:2: () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2027:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2028:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTouchSensorAccess().getTouchSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTouchSensor4272); 

                	newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2037:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2037:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTouchSensor4285); 

                        	newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTouchSensor4297); 

                        	newLeafNode(otherlv_3, grammarAccess.getTouchSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTouchSensor4309); 

                        	newLeafNode(otherlv_4, grammarAccess.getTouchSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2049:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2050:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2050:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2051:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTouchSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTouchSensor4330);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTouchSensor4342); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2079:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2080:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2081:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor4380);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor4390); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2088:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2091:28: ( ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2092:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2092:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2092:2: () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2092:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2093:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleLightSensor4436); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2102:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==11) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2102:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSensor4449); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleLightSensor4461); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLightSensor4473); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2114:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2115:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2115:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2116:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSensor4494);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSensor4506); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2144:1: entryRuleSmokeSensor returns [EObject current=null] : iv_ruleSmokeSensor= ruleSmokeSensor EOF ;
    public final EObject entryRuleSmokeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmokeSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2145:2: (iv_ruleSmokeSensor= ruleSmokeSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2146:2: iv_ruleSmokeSensor= ruleSmokeSensor EOF
            {
             newCompositeNode(grammarAccess.getSmokeSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4544);
            iv_ruleSmokeSensor=ruleSmokeSensor();

            state._fsp--;

             current =iv_ruleSmokeSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSmokeSensor4554); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2153:1: ruleSmokeSensor returns [EObject current=null] : ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2156:28: ( ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2157:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2157:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2157:2: () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2157:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2158:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSmokeSensorAccess().getSmokeSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSmokeSensor4600); 

                	newLeafNode(otherlv_1, grammarAccess.getSmokeSensorAccess().getSmokeSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2167:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==11) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2167:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSmokeSensor4613); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmokeSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSmokeSensor4625); 

                        	newLeafNode(otherlv_3, grammarAccess.getSmokeSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSmokeSensor4637); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmokeSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2179:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2180:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2180:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2181:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmokeSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSmokeSensor4658);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSmokeSensor4670); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2209:1: entryRuleCO2Sensor returns [EObject current=null] : iv_ruleCO2Sensor= ruleCO2Sensor EOF ;
    public final EObject entryRuleCO2Sensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCO2Sensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2210:2: (iv_ruleCO2Sensor= ruleCO2Sensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2211:2: iv_ruleCO2Sensor= ruleCO2Sensor EOF
            {
             newCompositeNode(grammarAccess.getCO2SensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4708);
            iv_ruleCO2Sensor=ruleCO2Sensor();

            state._fsp--;

             current =iv_ruleCO2Sensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCO2Sensor4718); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2218:1: ruleCO2Sensor returns [EObject current=null] : ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2221:28: ( ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2222:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2222:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2222:2: () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2222:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2223:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCO2SensorAccess().getCO2SensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleCO2Sensor4764); 

                	newLeafNode(otherlv_1, grammarAccess.getCO2SensorAccess().getCO2SensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2232:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==11) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2232:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCO2Sensor4777); 

                        	newLeafNode(otherlv_2, grammarAccess.getCO2SensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCO2Sensor4789); 

                        	newLeafNode(otherlv_3, grammarAccess.getCO2SensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCO2Sensor4801); 

                        	newLeafNode(otherlv_4, grammarAccess.getCO2SensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2244:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2245:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2245:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2246:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCO2SensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCO2Sensor4822);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCO2Sensor4834); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2274:1: entryRuleInfraredLightSensor returns [EObject current=null] : iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF ;
    public final EObject entryRuleInfraredLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraredLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2275:2: (iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2276:2: iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF
            {
             newCompositeNode(grammarAccess.getInfraredLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4872);
            iv_ruleInfraredLightSensor=ruleInfraredLightSensor();

            state._fsp--;

             current =iv_ruleInfraredLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfraredLightSensor4882); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2283:1: ruleInfraredLightSensor returns [EObject current=null] : ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2286:28: ( ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2287:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2287:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2287:2: () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2287:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2288:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleInfraredLightSensor4928); 

                	newLeafNode(otherlv_1, grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2297:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==11) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2297:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInfraredLightSensor4941); 

                        	newLeafNode(otherlv_2, grammarAccess.getInfraredLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleInfraredLightSensor4953); 

                        	newLeafNode(otherlv_3, grammarAccess.getInfraredLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInfraredLightSensor4965); 

                        	newLeafNode(otherlv_4, grammarAccess.getInfraredLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2309:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2310:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2310:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2311:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfraredLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInfraredLightSensor4986);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInfraredLightSensor4998); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2341:1: entryRuleHumiditySensor returns [EObject current=null] : iv_ruleHumiditySensor= ruleHumiditySensor EOF ;
    public final EObject entryRuleHumiditySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumiditySensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2342:2: (iv_ruleHumiditySensor= ruleHumiditySensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2343:2: iv_ruleHumiditySensor= ruleHumiditySensor EOF
            {
             newCompositeNode(grammarAccess.getHumiditySensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor5038);
            iv_ruleHumiditySensor=ruleHumiditySensor();

            state._fsp--;

             current =iv_ruleHumiditySensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumiditySensor5048); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2350:1: ruleHumiditySensor returns [EObject current=null] : ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2353:28: ( ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2354:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2354:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2354:2: () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2354:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2355:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumiditySensorAccess().getHumiditySensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleHumiditySensor5094); 

                	newLeafNode(otherlv_1, grammarAccess.getHumiditySensorAccess().getHumiditySensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2364:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==11) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2364:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumiditySensor5107); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumiditySensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleHumiditySensor5119); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumiditySensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHumiditySensor5131); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumiditySensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2376:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2377:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2377:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2378:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumiditySensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumiditySensor5152);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHumiditySensor5164); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2406:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2407:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2408:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5203);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5214); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2415:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2418:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2419:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2419:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2419:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2419:2: (kw= '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==31) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2420:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEInt5253); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5270); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2440:1: entryRuleLightSwitchActuator returns [EObject current=null] : iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF ;
    public final EObject entryRuleLightSwitchActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSwitchActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2441:2: (iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2442:2: iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF
            {
             newCompositeNode(grammarAccess.getLightSwitchActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5315);
            iv_ruleLightSwitchActuator=ruleLightSwitchActuator();

            state._fsp--;

             current =iv_ruleLightSwitchActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSwitchActuator5325); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2449:1: ruleLightSwitchActuator returns [EObject current=null] : ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2452:28: ( ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2453:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2453:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2453:2: () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2453:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2454:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleLightSwitchActuator5371); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2463:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==11) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2463:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSwitchActuator5384); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSwitchActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleLightSwitchActuator5396); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSwitchActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLightSwitchActuator5408); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSwitchActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2475:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2476:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2476:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2477:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSwitchActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSwitchActuator5429);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSwitchActuator5441); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2505:1: entryRuleWindowActuator returns [EObject current=null] : iv_ruleWindowActuator= ruleWindowActuator EOF ;
    public final EObject entryRuleWindowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2506:2: (iv_ruleWindowActuator= ruleWindowActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2507:2: iv_ruleWindowActuator= ruleWindowActuator EOF
            {
             newCompositeNode(grammarAccess.getWindowActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5479);
            iv_ruleWindowActuator=ruleWindowActuator();

            state._fsp--;

             current =iv_ruleWindowActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWindowActuator5489); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2514:1: ruleWindowActuator returns [EObject current=null] : ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2517:28: ( ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2518:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2518:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2518:2: () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2518:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2519:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWindowActuatorAccess().getWindowActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleWindowActuator5535); 

                	newLeafNode(otherlv_1, grammarAccess.getWindowActuatorAccess().getWindowActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2528:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==11) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2528:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWindowActuator5548); 

                        	newLeafNode(otherlv_2, grammarAccess.getWindowActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleWindowActuator5560); 

                        	newLeafNode(otherlv_3, grammarAccess.getWindowActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWindowActuator5572); 

                        	newLeafNode(otherlv_4, grammarAccess.getWindowActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2540:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2541:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2541:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2542:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getWindowActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWindowActuator5593);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWindowActuator5605); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2570:1: entryRuleHumidifierActuator returns [EObject current=null] : iv_ruleHumidifierActuator= ruleHumidifierActuator EOF ;
    public final EObject entryRuleHumidifierActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumidifierActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2571:2: (iv_ruleHumidifierActuator= ruleHumidifierActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2572:2: iv_ruleHumidifierActuator= ruleHumidifierActuator EOF
            {
             newCompositeNode(grammarAccess.getHumidifierActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5643);
            iv_ruleHumidifierActuator=ruleHumidifierActuator();

            state._fsp--;

             current =iv_ruleHumidifierActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumidifierActuator5653); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2579:1: ruleHumidifierActuator returns [EObject current=null] : ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2582:28: ( ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2583:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2583:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2583:2: () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2583:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2584:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleHumidifierActuator5699); 

                	newLeafNode(otherlv_1, grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2593:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==11) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2593:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumidifierActuator5712); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumidifierActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleHumidifierActuator5724); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumidifierActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHumidifierActuator5736); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumidifierActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2605:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2606:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2606:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2607:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumidifierActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumidifierActuator5757);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHumidifierActuator5769); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2635:1: entryRuleDoorActuator returns [EObject current=null] : iv_ruleDoorActuator= ruleDoorActuator EOF ;
    public final EObject entryRuleDoorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2636:2: (iv_ruleDoorActuator= ruleDoorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2637:2: iv_ruleDoorActuator= ruleDoorActuator EOF
            {
             newCompositeNode(grammarAccess.getDoorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5807);
            iv_ruleDoorActuator=ruleDoorActuator();

            state._fsp--;

             current =iv_ruleDoorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoorActuator5817); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2644:1: ruleDoorActuator returns [EObject current=null] : ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2647:28: ( ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2648:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2648:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2648:2: () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2648:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2649:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoorActuatorAccess().getDoorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleDoorActuator5863); 

                	newLeafNode(otherlv_1, grammarAccess.getDoorActuatorAccess().getDoorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2658:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==11) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2658:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDoorActuator5876); 

                        	newLeafNode(otherlv_2, grammarAccess.getDoorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDoorActuator5888); 

                        	newLeafNode(otherlv_3, grammarAccess.getDoorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDoorActuator5900); 

                        	newLeafNode(otherlv_4, grammarAccess.getDoorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2670:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2671:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2671:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2672:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDoorActuator5921);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDoorActuator5933); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2700:1: entryRuleRadiatorActuator returns [EObject current=null] : iv_ruleRadiatorActuator= ruleRadiatorActuator EOF ;
    public final EObject entryRuleRadiatorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiatorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2701:2: (iv_ruleRadiatorActuator= ruleRadiatorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2702:2: iv_ruleRadiatorActuator= ruleRadiatorActuator EOF
            {
             newCompositeNode(grammarAccess.getRadiatorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5971);
            iv_ruleRadiatorActuator=ruleRadiatorActuator();

            state._fsp--;

             current =iv_ruleRadiatorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadiatorActuator5981); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2709:1: ruleRadiatorActuator returns [EObject current=null] : ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2712:28: ( ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2713:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2713:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2713:2: () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2713:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2714:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRadiatorActuator6027); 

                	newLeafNode(otherlv_1, grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2723:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==11) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2723:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRadiatorActuator6040); 

                        	newLeafNode(otherlv_2, grammarAccess.getRadiatorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRadiatorActuator6052); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadiatorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRadiatorActuator6064); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadiatorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2735:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2736:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2736:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2737:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRadiatorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRadiatorActuator6085);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRadiatorActuator6097); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2765:1: entryRuleAudioAlarmActuator returns [EObject current=null] : iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF ;
    public final EObject entryRuleAudioAlarmActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioAlarmActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2766:2: (iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2767:2: iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF
            {
             newCompositeNode(grammarAccess.getAudioAlarmActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator6135);
            iv_ruleAudioAlarmActuator=ruleAudioAlarmActuator();

            state._fsp--;

             current =iv_ruleAudioAlarmActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAudioAlarmActuator6145); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2774:1: ruleAudioAlarmActuator returns [EObject current=null] : ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2777:28: ( ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2778:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2778:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2778:2: () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2778:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2779:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAudioAlarmActuator6191); 

                	newLeafNode(otherlv_1, grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2788:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==11) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2788:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAudioAlarmActuator6204); 

                        	newLeafNode(otherlv_2, grammarAccess.getAudioAlarmActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAudioAlarmActuator6216); 

                        	newLeafNode(otherlv_3, grammarAccess.getAudioAlarmActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAudioAlarmActuator6228); 

                        	newLeafNode(otherlv_4, grammarAccess.getAudioAlarmActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2800:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2801:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2801:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2802:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAudioAlarmActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAudioAlarmActuator6249);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAudioAlarmActuator6261); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2832:1: entryRuleSensorComponent returns [EObject current=null] : iv_ruleSensorComponent= ruleSensorComponent EOF ;
    public final EObject entryRuleSensorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2833:2: (iv_ruleSensorComponent= ruleSensorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2834:2: iv_ruleSensorComponent= ruleSensorComponent EOF
            {
             newCompositeNode(grammarAccess.getSensorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent6301);
            iv_ruleSensorComponent=ruleSensorComponent();

            state._fsp--;

             current =iv_ruleSensorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorComponent6311); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2841:1: ruleSensorComponent returns [EObject current=null] : ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) ;
    public final EObject ruleSensorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2844:28: ( ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2845:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2845:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2845:2: () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2845:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2846:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorComponentAccess().getSensorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleSensorComponent6357); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorComponentAccess().getSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2855:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2856:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2856:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2857:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSensorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorComponent6378);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2873:2: (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==57) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2873:4: otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )*
                    {
                    otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleSensorComponent6391); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2877:1: ( (lv_sensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2878:1: (lv_sensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2878:1: (lv_sensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2879:3: lv_sensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent6412);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2895:2: ( (lv_sensors_5_0= ruleSensor ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==40||(LA67_0>=42 && LA67_0<=49)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2896:1: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2896:1: (lv_sensors_5_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2897:3: lv_sensors_5_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent6433);
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
                    	    break loop67;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2921:1: entryRuleActuatorComponent returns [EObject current=null] : iv_ruleActuatorComponent= ruleActuatorComponent EOF ;
    public final EObject entryRuleActuatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2922:2: (iv_ruleActuatorComponent= ruleActuatorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2923:2: iv_ruleActuatorComponent= ruleActuatorComponent EOF
            {
             newCompositeNode(grammarAccess.getActuatorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent6472);
            iv_ruleActuatorComponent=ruleActuatorComponent();

            state._fsp--;

             current =iv_ruleActuatorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuatorComponent6482); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2930:1: ruleActuatorComponent returns [EObject current=null] : ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) ;
    public final EObject ruleActuatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2933:28: ( ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2934:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2934:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2934:2: () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2934:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2935:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorComponentAccess().getActuatorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleActuatorComponent6528); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorComponentAccess().getActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2944:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2945:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2945:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2946:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActuatorComponent6549);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2962:2: (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==57) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2962:4: otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )*
                    {
                    otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleActuatorComponent6562); 

                        	newLeafNode(otherlv_3, grammarAccess.getActuatorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2966:1: ( (lv_actuators_4_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2967:1: (lv_actuators_4_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2967:1: (lv_actuators_4_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2968:3: lv_actuators_4_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent6583);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2984:2: ( (lv_actuators_5_0= ruleActuator ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=50 && LA69_0<=55)) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2985:1: (lv_actuators_5_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2985:1: (lv_actuators_5_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2986:3: lv_actuators_5_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent6604);
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
                    	    break loop69;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3010:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3011:2: (iv_ruleConditions= ruleConditions EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3012:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_entryRuleConditions6643);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditions6653); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3019:1: ruleConditions returns [EObject current=null] : ( () otherlv_1= 'Conditions' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3022:28: ( ( () otherlv_1= 'Conditions' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3023:1: ( () otherlv_1= 'Conditions' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3023:1: ( () otherlv_1= 'Conditions' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3023:2: () otherlv_1= 'Conditions'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3023:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3024:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionsAccess().getConditionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleConditions6699); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3041:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3042:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3043:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean6736);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean6747); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3050:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3053:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3054:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3054:1: (kw= 'true' | kw= 'false' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==60) ) {
                alt71=1;
            }
            else if ( (LA71_0==61) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3055:2: kw= 'true'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEBoolean6785); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3062:2: kw= 'false'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEBoolean6804); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3075:1: ruleWeekdays returns [Enumerator current=null] : ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3077:28: ( ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3078:1: ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3078:1: ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDENSDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) )
            int alt72=7;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt72=1;
                }
                break;
            case 63:
                {
                alt72=2;
                }
                break;
            case 64:
                {
                alt72=3;
                }
                break;
            case 65:
                {
                alt72=4;
                }
                break;
            case 66:
                {
                alt72=5;
                }
                break;
            case 67:
                {
                alt72=6;
                }
                break;
            case 68:
                {
                alt72=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3078:2: (enumLiteral_0= 'MONDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3078:2: (enumLiteral_0= 'MONDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3078:4: enumLiteral_0= 'MONDAY'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleWeekdays6858); 

                            current = grammarAccess.getWeekdaysAccess().getMONDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWeekdaysAccess().getMONDAYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3084:6: (enumLiteral_1= 'TUESDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3084:6: (enumLiteral_1= 'TUESDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3084:8: enumLiteral_1= 'TUESDAY'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleWeekdays6875); 

                            current = grammarAccess.getWeekdaysAccess().getTUESDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWeekdaysAccess().getTUESDAYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3090:6: (enumLiteral_2= 'WEDENSDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3090:6: (enumLiteral_2= 'WEDENSDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3090:8: enumLiteral_2= 'WEDENSDAY'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleWeekdays6892); 

                            current = grammarAccess.getWeekdaysAccess().getWEDENSDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWeekdaysAccess().getWEDENSDAYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3096:6: (enumLiteral_3= 'THURSDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3096:6: (enumLiteral_3= 'THURSDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3096:8: enumLiteral_3= 'THURSDAY'
                    {
                    enumLiteral_3=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleWeekdays6909); 

                            current = grammarAccess.getWeekdaysAccess().getTHURSDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getWeekdaysAccess().getTHURSDAYEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3102:6: (enumLiteral_4= 'FRIDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3102:6: (enumLiteral_4= 'FRIDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3102:8: enumLiteral_4= 'FRIDAY'
                    {
                    enumLiteral_4=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleWeekdays6926); 

                            current = grammarAccess.getWeekdaysAccess().getFRIDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getWeekdaysAccess().getFRIDAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3108:6: (enumLiteral_5= 'SATURDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3108:6: (enumLiteral_5= 'SATURDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3108:8: enumLiteral_5= 'SATURDAY'
                    {
                    enumLiteral_5=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleWeekdays6943); 

                            current = grammarAccess.getWeekdaysAccess().getSATURDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getWeekdaysAccess().getSATURDAYEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3114:6: (enumLiteral_6= 'SUNDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3114:6: (enumLiteral_6= 'SUNDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3114:8: enumLiteral_6= 'SUNDAY'
                    {
                    enumLiteral_6=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleWeekdays6960); 

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
        public static final BitSet FOLLOW_11_in_ruleModel152 = new BitSet(new long[]{0x0000000002217000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel174 = new BitSet(new long[]{0x0000000002217000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel195 = new BitSet(new long[]{0x0000000002217000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel220 = new BitSet(new long[]{0x0000000002213000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel241 = new BitSet(new long[]{0x0000000002213000L});
        public static final BitSet FOLLOW_ruleSchedule_in_ruleModel266 = new BitSet(new long[]{0x0000000002013000L});
        public static final BitSet FOLLOW_ruleSchedule_in_ruleModel287 = new BitSet(new long[]{0x0000000002013000L});
        public static final BitSet FOLLOW_12_in_ruleModel303 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel324 = new BitSet(new long[]{0x0000000002003000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel348 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel369 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_13_in_ruleModel384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleState476 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState497 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleState515 = new BitSet(new long[]{0x3000000000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleState544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSchedule_in_entryRuleSchedule579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSchedule589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleSchedule635 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSchedule656 = new BitSet(new long[]{0x00000000000A0002L});
        public static final BitSet FOLLOW_17_in_ruleSchedule669 = new BitSet(new long[]{0xC000000000000000L,0x000000000000001FL});
        public static final BitSet FOLLOW_ruleWeekdays_in_ruleSchedule690 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_18_in_ruleSchedule703 = new BitSet(new long[]{0xC000000000000000L,0x000000000000001FL});
        public static final BitSet FOLLOW_ruleWeekdays_in_ruleSchedule724 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_19_in_ruleSchedule741 = new BitSet(new long[]{0x0000000080100010L});
        public static final BitSet FOLLOW_ruleTime_in_ruleSchedule762 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSchedule774 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleTime_in_ruleSchedule795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePolicy843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rulePolicy889 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePolicy910 = new BitSet(new long[]{0x0000000001C00002L});
        public static final BitSet FOLLOW_22_in_rulePolicy923 = new BitSet(new long[]{0x0003FD0001800002L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy945 = new BitSet(new long[]{0x0000000001840002L});
        public static final BitSet FOLLOW_18_in_rulePolicy958 = new BitSet(new long[]{0x0003FD0000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy979 = new BitSet(new long[]{0x0000000001840002L});
        public static final BitSet FOLLOW_23_in_rulePolicy998 = new BitSet(new long[]{0x00FC000001000002L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1020 = new BitSet(new long[]{0x0000000001040002L});
        public static final BitSet FOLLOW_18_in_rulePolicy1033 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1054 = new BitSet(new long[]{0x0000000001040002L});
        public static final BitSet FOLLOW_24_in_rulePolicy1073 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulePolicy1085 = new BitSet(new long[]{0x0800000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1107 = new BitSet(new long[]{0x0800000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1128 = new BitSet(new long[]{0x0800000000002000L});
        public static final BitSet FOLLOW_13_in_rulePolicy1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuilding_in_entryRuleBuilding1181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuilding1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBuilding1237 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBuilding1258 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleBuilding1270 = new BitSet(new long[]{0x000000C904002000L});
        public static final BitSet FOLLOW_ruleCTS_in_ruleBuilding1291 = new BitSet(new long[]{0x000000C804002000L});
        public static final BitSet FOLLOW_ruleAccessControl_in_ruleBuilding1313 = new BitSet(new long[]{0x000000C004002000L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_ruleBuilding1335 = new BitSet(new long[]{0x0000008004002000L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1357 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1380 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1401 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_13_in_ruleBuilding1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloor_in_entryRuleFloor1452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloor1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFloor1508 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFloor1529 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleFloor1541 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleFloor1554 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor1575 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleFloor1588 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor1609 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleFloor1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom1661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoom1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1726 = new BitSet(new long[]{0x0000000030000800L});
        public static final BitSet FOLLOW_28_in_ruleRoom1739 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1762 = new BitSet(new long[]{0x0000000020000860L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1785 = new BitSet(new long[]{0x0000000020000860L});
        public static final BitSet FOLLOW_29_in_ruleRoom1801 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1824 = new BitSet(new long[]{0x0000000000040800L});
        public static final BitSet FOLLOW_18_in_ruleRoom1837 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1860 = new BitSet(new long[]{0x0000000000040800L});
        public static final BitSet FOLLOW_11_in_ruleRoom1876 = new BitSet(new long[]{0x0500000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom1898 = new BitSet(new long[]{0x0500000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom1919 = new BitSet(new long[]{0x0500000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom1944 = new BitSet(new long[]{0x0400000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom1965 = new BitSet(new long[]{0x0400000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRoom1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator2016 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_ruleActuator2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_ruleActuator2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_ruleActuator2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_ruleActuator2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_ruleActuator2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_ruleActuator2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor2243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor2253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_ruleSensor2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleSensor2327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleSensor2354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_ruleSensor2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleSensor2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_ruleSensor2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_ruleSensor2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_ruleSensor2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_ruleSensor2516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime2551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleTime2617 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleTime2629 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleTime2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort2689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEShort2739 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEShort2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCTS_in_entryRuleCTS2924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCTS2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCTS2980 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2992 = new BitSet(new long[]{0x0000000600002000L});
        public static final BitSet FOLLOW_33_in_ruleCTS3005 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS3017 = new BitSet(new long[]{0x0003FD0000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS3038 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleCTS3051 = new BitSet(new long[]{0x0003FD0000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS3072 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3086 = new BitSet(new long[]{0x0000000400002000L});
        public static final BitSet FOLLOW_34_in_ruleCTS3101 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS3113 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS3134 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleCTS3147 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS3168 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3182 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessControl_in_entryRuleAccessControl3232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessControl3242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAccessControl3288 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3300 = new BitSet(new long[]{0x0000003000002000L});
        public static final BitSet FOLLOW_36_in_ruleAccessControl3313 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3325 = new BitSet(new long[]{0x0003FD0000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl3346 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl3359 = new BitSet(new long[]{0x0003FD0000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl3380 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3394 = new BitSet(new long[]{0x0000002000002000L});
        public static final BitSet FOLLOW_37_in_ruleAccessControl3409 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3421 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl3442 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl3455 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl3476 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3490 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem3540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarSystem3550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCalendarSystem3596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem3632 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMeetingScheduleSystem3688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMotionSensor3734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleMotionSensor3780 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleMotionSensor3793 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleMotionSensor3805 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMotionSensor3817 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMotionSensor3838 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMotionSensor3850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3888 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor3898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleTemperatureSensor3944 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTemperatureSensor3957 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTemperatureSensor3969 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTemperatureSensor3981 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTemperatureSensor4002 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTemperatureSensor4014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor4052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor4062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePressureSensor4108 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulePressureSensor4121 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_rulePressureSensor4133 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePressureSensor4145 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePressureSensor4166 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePressureSensor4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor4216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTouchSensor4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleTouchSensor4272 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTouchSensor4285 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTouchSensor4297 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTouchSensor4309 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTouchSensor4330 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTouchSensor4342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor4380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor4390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleLightSensor4436 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSensor4449 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleLightSensor4461 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLightSensor4473 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSensor4494 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSensor4506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSmokeSensor4554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleSmokeSensor4600 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleSmokeSensor4613 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleSmokeSensor4625 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSmokeSensor4637 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSmokeSensor4658 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSmokeSensor4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4708 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCO2Sensor4718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleCO2Sensor4764 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleCO2Sensor4777 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleCO2Sensor4789 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCO2Sensor4801 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCO2Sensor4822 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCO2Sensor4834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfraredLightSensor4882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleInfraredLightSensor4928 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleInfraredLightSensor4941 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleInfraredLightSensor4953 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInfraredLightSensor4965 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInfraredLightSensor4986 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInfraredLightSensor4998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor5038 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumiditySensor5048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleHumiditySensor5094 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumiditySensor5107 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleHumiditySensor5119 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHumiditySensor5131 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumiditySensor5152 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHumiditySensor5164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEInt5253 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSwitchActuator5325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleLightSwitchActuator5371 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSwitchActuator5384 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleLightSwitchActuator5396 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLightSwitchActuator5408 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSwitchActuator5429 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSwitchActuator5441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWindowActuator5489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleWindowActuator5535 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleWindowActuator5548 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleWindowActuator5560 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWindowActuator5572 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWindowActuator5593 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWindowActuator5605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumidifierActuator5653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleHumidifierActuator5699 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumidifierActuator5712 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleHumidifierActuator5724 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHumidifierActuator5736 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumidifierActuator5757 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHumidifierActuator5769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoorActuator5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleDoorActuator5863 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleDoorActuator5876 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleDoorActuator5888 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDoorActuator5900 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDoorActuator5921 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDoorActuator5933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadiatorActuator5981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleRadiatorActuator6027 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleRadiatorActuator6040 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleRadiatorActuator6052 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRadiatorActuator6064 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRadiatorActuator6085 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRadiatorActuator6097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator6135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAudioAlarmActuator6145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAudioAlarmActuator6191 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAudioAlarmActuator6204 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAudioAlarmActuator6216 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAudioAlarmActuator6228 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAudioAlarmActuator6249 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAudioAlarmActuator6261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent6301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorComponent6311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleSensorComponent6357 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorComponent6378 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_57_in_ruleSensorComponent6391 = new BitSet(new long[]{0x0003FD0000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent6412 = new BitSet(new long[]{0x0003FD0000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent6433 = new BitSet(new long[]{0x0003FD0000000002L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent6472 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuatorComponent6482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleActuatorComponent6528 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActuatorComponent6549 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_57_in_ruleActuatorComponent6562 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent6583 = new BitSet(new long[]{0x00FC000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent6604 = new BitSet(new long[]{0x00FC000000000002L});
        public static final BitSet FOLLOW_ruleConditions_in_entryRuleConditions6643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditions6653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleConditions6699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean6736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean6747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEBoolean6785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleEBoolean6804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleWeekdays6858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleWeekdays6875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleWeekdays6892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleWeekdays6909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleWeekdays6926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleWeekdays6943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleWeekdays6960 = new BitSet(new long[]{0x0000000000000002L});
    }


}