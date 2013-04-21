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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'room-type'", "'}'", "'state'", "'='", "'schedule'", "'days'", "','", "'from'", "'to'", "'policy'", "'uses sensors'", "'uses actuators'", "'is specified by'", "'building'", "'floor'", "'room'", "'is-of-type'", "'is-controlled-by'", "'during'", "'during-always'", "':'", "'-'", "'CTS'", "'temperatureSensors'", "'ctsActuators'", "'AccessControl'", "'accessControlSensors'", "'accessControlDoorLockActuator'", "'CalendarSystem'", "'MeetingScheduleSystem'", "'MotionSensor'", "'valueState'", "'TemperatureSensor'", "'PressureSensor'", "'TouchSensor'", "'LightSensor'", "'SmokeSensor'", "'CO2Sensor'", "'InfraredLightSensor'", "'HumiditySensor'", "'LightSwitchActuator'", "'WindowActuator'", "'HumidifierActuator'", "'DoorActuator'", "'RadiatorActuator'", "'AudioAlarmActuator'", "'sensor '", "'is a '", "'actuator'", "'Conditions'", "'true'", "'false'", "'MONDAY'", "'TUESDAY'", "'WEDNESDAY'", "'THURSDAY'", "'FRIDAY'", "'SATURDAY'", "'SUNDAY'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
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
    public static final int T__70=70;
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

                    if ( (LA14_0==42||(LA14_0>=44 && LA14_0<=51)) ) {
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

                    if ( ((LA17_0>=52 && LA17_0<=57)) ) {
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

                    if ( (LA20_0==61) ) {
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

                                if ( (LA19_0==61) ) {
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

            if ( (LA22_0==34) ) {
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

            if ( (LA23_0==37) ) {
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

            if ( (LA24_0==40) ) {
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

            if ( (LA25_0==41) ) {
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:956:1: ruleRoom returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? (otherlv_6= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )? )? otherlv_15= '{' ( ( (lv_declareSensor_16_0= ruleSensorComponent ) ) ( (lv_declareSensor_17_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_18_0= ruleActuatorComponent ) ) ( (lv_declareActuator_19_0= ruleActuatorComponent ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_declareSensor_16_0 = null;

        EObject lv_declareSensor_17_0 = null;

        EObject lv_declareActuator_18_0 = null;

        EObject lv_declareActuator_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:959:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? (otherlv_6= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )? )? otherlv_15= '{' ( ( (lv_declareSensor_16_0= ruleSensorComponent ) ) ( (lv_declareSensor_17_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_18_0= ruleActuatorComponent ) ) ( (lv_declareActuator_19_0= ruleActuatorComponent ) )* )? otherlv_20= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:960:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? (otherlv_6= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )? )? otherlv_15= '{' ( ( (lv_declareSensor_16_0= ruleSensorComponent ) ) ( (lv_declareSensor_17_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_18_0= ruleActuatorComponent ) ) ( (lv_declareActuator_19_0= ruleActuatorComponent ) )* )? otherlv_20= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:960:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? (otherlv_6= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )? )? otherlv_15= '{' ( ( (lv_declareSensor_16_0= ruleSensorComponent ) ) ( (lv_declareSensor_17_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_18_0= ruleActuatorComponent ) ) ( (lv_declareActuator_19_0= ruleActuatorComponent ) )* )? otherlv_20= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:960:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is-of-type' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? (otherlv_6= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )? )? otherlv_15= '{' ( ( (lv_declareSensor_16_0= ruleSensorComponent ) ) ( (lv_declareSensor_17_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_18_0= ruleActuatorComponent ) ) ( (lv_declareActuator_19_0= ruleActuatorComponent ) )* )? otherlv_20= '}'
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:984:2: (otherlv_2= 'is-of-type' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:984:4: otherlv_2= 'is-of-type' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )*
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1003:2: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==18) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1003:4: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRoom1775); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1007:1: ( ( ruleEString ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1008:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1008:1: ( ruleEString )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1009:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoomRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1798);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1022:6: (otherlv_6= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1022:8: otherlv_6= 'is-controlled-by' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )?
                    {
                    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRoom1815); 

                        	newLeafNode(otherlv_6, grammarAccess.getRoomAccess().getIsControlledByKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1026:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1027:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1027:1: ( ruleEString )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1028:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoomRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getPoliciesPolicyCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1838);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1041:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1041:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRoom1851); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRoomAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1045:1: ( ( ruleEString ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1046:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1046:1: ( ruleEString )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1047:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoomRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getPoliciesPolicyCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1874);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1060:4: ( (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) | otherlv_14= 'during-always' )?
                    int alt34=3;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==30) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==31) ) {
                        alt34=2;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1060:5: (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1060:5: (otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1060:7: otherlv_10= 'during' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )*
                            {
                            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRoom1890); 

                                	newLeafNode(otherlv_10, grammarAccess.getRoomAccess().getDuringKeyword_3_3_0_0());
                                
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1064:1: ( ( ruleEString ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1065:1: ( ruleEString )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1065:1: ( ruleEString )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1066:3: ruleEString
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getRoomRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getRoomAccess().getDuringScheduleCrossReference_3_3_0_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1913);
                            ruleEString();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1079:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==18) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1079:4: otherlv_12= ',' ( ( ruleEString ) )
                            	    {
                            	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRoom1926); 

                            	        	newLeafNode(otherlv_12, grammarAccess.getRoomAccess().getCommaKeyword_3_3_0_2_0());
                            	        
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1083:1: ( ( ruleEString ) )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1084:1: ( ruleEString )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1084:1: ( ruleEString )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1085:3: ruleEString
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getRoomRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getRoomAccess().getDuringScheduleCrossReference_3_3_0_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1949);
                            	    ruleEString();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1099:7: otherlv_14= 'during-always'
                            {
                            otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRoom1970); 

                                	newLeafNode(otherlv_14, grammarAccess.getRoomAccess().getDuringAlwaysKeyword_3_3_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoom1986); 

                	newLeafNode(otherlv_15, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1107:1: ( ( (lv_declareSensor_16_0= ruleSensorComponent ) ) ( (lv_declareSensor_17_0= ruleSensorComponent ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1107:2: ( (lv_declareSensor_16_0= ruleSensorComponent ) ) ( (lv_declareSensor_17_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1107:2: ( (lv_declareSensor_16_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1108:1: (lv_declareSensor_16_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1108:1: (lv_declareSensor_16_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1109:3: lv_declareSensor_16_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom2008);
                    lv_declareSensor_16_0=ruleSensorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	        }
                           		add(
                           			current, 
                           			"declareSensor",
                            		lv_declareSensor_16_0, 
                            		"SensorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1125:2: ( (lv_declareSensor_17_0= ruleSensorComponent ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==58) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1126:1: (lv_declareSensor_17_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1126:1: (lv_declareSensor_17_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1127:3: lv_declareSensor_17_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom2029);
                    	    lv_declareSensor_17_0=ruleSensorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareSensor",
                    	            		lv_declareSensor_17_0, 
                    	            		"SensorComponent");
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1143:5: ( ( (lv_declareActuator_18_0= ruleActuatorComponent ) ) ( (lv_declareActuator_19_0= ruleActuatorComponent ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1143:6: ( (lv_declareActuator_18_0= ruleActuatorComponent ) ) ( (lv_declareActuator_19_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1143:6: ( (lv_declareActuator_18_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1144:1: (lv_declareActuator_18_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1144:1: (lv_declareActuator_18_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1145:3: lv_declareActuator_18_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom2054);
                    lv_declareActuator_18_0=ruleActuatorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	        }
                           		add(
                           			current, 
                           			"declareActuator",
                            		lv_declareActuator_18_0, 
                            		"ActuatorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1161:2: ( (lv_declareActuator_19_0= ruleActuatorComponent ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==60) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1162:1: (lv_declareActuator_19_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1162:1: (lv_declareActuator_19_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1163:3: lv_declareActuator_19_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom2075);
                    	    lv_declareActuator_19_0=ruleActuatorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareActuator",
                    	            		lv_declareActuator_19_0, 
                    	            		"ActuatorComponent");
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

            otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoom2090); 

                	newLeafNode(otherlv_20, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1191:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1192:2: (iv_ruleActuator= ruleActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1193:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator2126);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator2136); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1200:1: ruleActuator returns [EObject current=null] : (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1203:28: ( (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1204:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1204:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt40=1;
                }
                break;
            case 53:
                {
                alt40=2;
                }
                break;
            case 54:
                {
                alt40=3;
                }
                break;
            case 55:
                {
                alt40=4;
                }
                break;
            case 56:
                {
                alt40=5;
                }
                break;
            case 57:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1205:5: this_LightSwitchActuator_0= ruleLightSwitchActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getLightSwitchActuatorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_ruleActuator2183);
                    this_LightSwitchActuator_0=ruleLightSwitchActuator();

                    state._fsp--;

                     
                            current = this_LightSwitchActuator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1215:5: this_WindowActuator_1= ruleWindowActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getWindowActuatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_ruleActuator2210);
                    this_WindowActuator_1=ruleWindowActuator();

                    state._fsp--;

                     
                            current = this_WindowActuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1225:5: this_HumidifierActuator_2= ruleHumidifierActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getHumidifierActuatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_ruleActuator2237);
                    this_HumidifierActuator_2=ruleHumidifierActuator();

                    state._fsp--;

                     
                            current = this_HumidifierActuator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1235:5: this_DoorActuator_3= ruleDoorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getDoorActuatorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_ruleActuator2264);
                    this_DoorActuator_3=ruleDoorActuator();

                    state._fsp--;

                     
                            current = this_DoorActuator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1245:5: this_RadiatorActuator_4= ruleRadiatorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getRadiatorActuatorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_ruleActuator2291);
                    this_RadiatorActuator_4=ruleRadiatorActuator();

                    state._fsp--;

                     
                            current = this_RadiatorActuator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1255:5: this_AudioAlarmActuator_5= ruleAudioAlarmActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getAudioAlarmActuatorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_ruleActuator2318);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1271:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1272:2: (iv_ruleSensor= ruleSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1273:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor2353);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor2363); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1280:1: ruleSensor returns [EObject current=null] : (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1283:28: ( (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1284:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1284:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HumiditySensor_8= ruleHumiditySensor )
            int alt41=9;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt41=1;
                }
                break;
            case 44:
                {
                alt41=2;
                }
                break;
            case 45:
                {
                alt41=3;
                }
                break;
            case 46:
                {
                alt41=4;
                }
                break;
            case 47:
                {
                alt41=5;
                }
                break;
            case 48:
                {
                alt41=6;
                }
                break;
            case 49:
                {
                alt41=7;
                }
                break;
            case 50:
                {
                alt41=8;
                }
                break;
            case 51:
                {
                alt41=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1285:5: this_MotionSensor_0= ruleMotionSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getMotionSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_ruleSensor2410);
                    this_MotionSensor_0=ruleMotionSensor();

                    state._fsp--;

                     
                            current = this_MotionSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1295:5: this_TemperatureSensor_1= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTemperatureSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleSensor2437);
                    this_TemperatureSensor_1=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1305:5: this_PressureSensor_2= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getPressureSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleSensor2464);
                    this_PressureSensor_2=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1315:5: this_TouchSensor_3= ruleTouchSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTouchSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_ruleSensor2491);
                    this_TouchSensor_3=ruleTouchSensor();

                    state._fsp--;

                     
                            current = this_TouchSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1325:5: this_LightSensor_4= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleSensor2518);
                    this_LightSensor_4=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1335:5: this_SmokeSensor_5= ruleSmokeSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getSmokeSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_ruleSensor2545);
                    this_SmokeSensor_5=ruleSmokeSensor();

                    state._fsp--;

                     
                            current = this_SmokeSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1345:5: this_CO2Sensor_6= ruleCO2Sensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getCO2SensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_ruleSensor2572);
                    this_CO2Sensor_6=ruleCO2Sensor();

                    state._fsp--;

                     
                            current = this_CO2Sensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1355:5: this_InfraredLightSensor_7= ruleInfraredLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getInfraredLightSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_ruleSensor2599);
                    this_InfraredLightSensor_7=ruleInfraredLightSensor();

                    state._fsp--;

                     
                            current = this_InfraredLightSensor_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1365:5: this_HumiditySensor_8= ruleHumiditySensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getHumiditySensorParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_ruleSensor2626);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1381:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1382:2: (iv_ruleTime= ruleTime EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1383:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime2661);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime2671); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1390:1: ruleTime returns [EObject current=null] : ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_hours_1_0 = null;

        AntlrDatatypeRuleToken lv_minutes_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1393:28: ( ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1394:1: ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1394:1: ( () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1394:2: () ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1394:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeAccess().getTimeAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1400:2: ( ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT||LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1400:3: ( (lv_hours_1_0= ruleEShort ) ) otherlv_2= ':' ( (lv_minutes_3_0= ruleEShort ) )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1400:3: ( (lv_hours_1_0= ruleEShort ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1401:1: (lv_hours_1_0= ruleEShort )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1401:1: (lv_hours_1_0= ruleEShort )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1402:3: lv_hours_1_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeAccess().getHoursEShortParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleTime2727);
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

                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTime2739); 

                        	newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getColonKeyword_1_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1422:1: ( (lv_minutes_3_0= ruleEShort ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1423:1: (lv_minutes_3_0= ruleEShort )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1423:1: (lv_minutes_3_0= ruleEShort )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1424:3: lv_minutes_3_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeAccess().getMinutesEShortParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleTime2760);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1448:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1449:2: (iv_ruleEShort= ruleEShort EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1450:2: iv_ruleEShort= ruleEShort EOF
            {
             newCompositeNode(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort2799);
            iv_ruleEShort=ruleEShort();

            state._fsp--;

             current =iv_ruleEShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort2810); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1457:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1460:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1461:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1461:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1461:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1461:2: (kw= '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1462:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEShort2849); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEShort2866); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1482:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1483:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2912);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2923); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1491:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1494:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1495:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1495:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1495:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2963); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1503:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2989); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1518:1: entryRuleCTS returns [EObject current=null] : iv_ruleCTS= ruleCTS EOF ;
    public final EObject entryRuleCTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTS = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1519:2: (iv_ruleCTS= ruleCTS EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1520:2: iv_ruleCTS= ruleCTS EOF
            {
             newCompositeNode(grammarAccess.getCTSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCTS_in_entryRuleCTS3034);
            iv_ruleCTS=ruleCTS();

            state._fsp--;

             current =iv_ruleCTS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCTS3044); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1527:1: ruleCTS returns [EObject current=null] : ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1530:28: ( ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1531:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1531:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1531:2: () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1531:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1532:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCTSAccess().getCTSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCTS3090); 

                	newLeafNode(otherlv_1, grammarAccess.getCTSAccess().getCTSKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS3102); 

                	newLeafNode(otherlv_2, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1545:1: (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1545:3: otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCTS3115); 

                        	newLeafNode(otherlv_3, grammarAccess.getCTSAccess().getTemperatureSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS3127); 

                        	newLeafNode(otherlv_4, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1553:1: ( (lv_temperatureSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1554:1: (lv_temperatureSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1554:1: (lv_temperatureSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1555:3: lv_temperatureSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS3148);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1571:2: (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==18) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1571:4: otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS3161); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCTSAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1575:1: ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1576:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1576:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1577:3: lv_temperatureSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS3182);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3196); 

                        	newLeafNode(otherlv_8, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1597:3: (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1597:5: otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCTS3211); 

                        	newLeafNode(otherlv_9, grammarAccess.getCTSAccess().getCtsActuatorsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS3223); 

                        	newLeafNode(otherlv_10, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1605:1: ( (lv_ctsActuators_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1606:1: (lv_ctsActuators_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1606:1: (lv_ctsActuators_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1607:3: lv_ctsActuators_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS3244);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1623:2: (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==18) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1623:4: otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS3257); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCTSAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1627:1: ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1628:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1628:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1629:3: lv_ctsActuators_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS3278);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3292); 

                        	newLeafNode(otherlv_14, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS3306); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1661:1: entryRuleAccessControl returns [EObject current=null] : iv_ruleAccessControl= ruleAccessControl EOF ;
    public final EObject entryRuleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControl = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1662:2: (iv_ruleAccessControl= ruleAccessControl EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1663:2: iv_ruleAccessControl= ruleAccessControl EOF
            {
             newCompositeNode(grammarAccess.getAccessControlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_entryRuleAccessControl3342);
            iv_ruleAccessControl=ruleAccessControl();

            state._fsp--;

             current =iv_ruleAccessControl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessControl3352); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1670:1: ruleAccessControl returns [EObject current=null] : ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1673:28: ( ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1674:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1674:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1674:2: () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1674:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1675:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccessControlAccess().getAccessControlAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAccessControl3398); 

                	newLeafNode(otherlv_1, grammarAccess.getAccessControlAccess().getAccessControlKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3410); 

                	newLeafNode(otherlv_2, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1688:1: (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1688:3: otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAccessControl3423); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccessControlAccess().getAccessControlSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3435); 

                        	newLeafNode(otherlv_4, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1696:1: ( (lv_accessControlSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1697:1: (lv_accessControlSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1697:1: (lv_accessControlSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1698:3: lv_accessControlSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl3456);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1714:2: (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==18) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1714:4: otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl3469); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAccessControlAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1718:1: ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1719:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1719:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1720:3: lv_accessControlSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl3490);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3504); 

                        	newLeafNode(otherlv_8, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1740:3: (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1740:5: otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAccessControl3519); 

                        	newLeafNode(otherlv_9, grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl3531); 

                        	newLeafNode(otherlv_10, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1748:1: ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1749:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1749:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1750:3: lv_accessControlDoorLockActuator_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl3552);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1766:2: (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==18) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1766:4: otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl3565); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAccessControlAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1770:1: ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1771:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1771:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1772:3: lv_accessControlDoorLockActuator_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl3586);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3600); 

                        	newLeafNode(otherlv_14, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl3614); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1804:1: entryRuleCalendarSystem returns [EObject current=null] : iv_ruleCalendarSystem= ruleCalendarSystem EOF ;
    public final EObject entryRuleCalendarSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1805:2: (iv_ruleCalendarSystem= ruleCalendarSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1806:2: iv_ruleCalendarSystem= ruleCalendarSystem EOF
            {
             newCompositeNode(grammarAccess.getCalendarSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem3650);
            iv_ruleCalendarSystem=ruleCalendarSystem();

            state._fsp--;

             current =iv_ruleCalendarSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarSystem3660); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1813:1: ruleCalendarSystem returns [EObject current=null] : ( () otherlv_1= 'CalendarSystem' ) ;
    public final EObject ruleCalendarSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1816:28: ( ( () otherlv_1= 'CalendarSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1817:1: ( () otherlv_1= 'CalendarSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1817:1: ( () otherlv_1= 'CalendarSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1817:2: () otherlv_1= 'CalendarSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1817:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1818:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCalendarSystemAccess().getCalendarSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCalendarSystem3706); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1835:1: entryRuleMeetingScheduleSystem returns [EObject current=null] : iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF ;
    public final EObject entryRuleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingScheduleSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1836:2: (iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1837:2: iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF
            {
             newCompositeNode(grammarAccess.getMeetingScheduleSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem3742);
            iv_ruleMeetingScheduleSystem=ruleMeetingScheduleSystem();

            state._fsp--;

             current =iv_ruleMeetingScheduleSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3752); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1844:1: ruleMeetingScheduleSystem returns [EObject current=null] : ( () otherlv_1= 'MeetingScheduleSystem' ) ;
    public final EObject ruleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1847:28: ( ( () otherlv_1= 'MeetingScheduleSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1848:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1848:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1848:2: () otherlv_1= 'MeetingScheduleSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1848:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1849:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeetingScheduleSystemAccess().getMeetingScheduleSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMeetingScheduleSystem3798); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1866:1: entryRuleMotionSensor returns [EObject current=null] : iv_ruleMotionSensor= ruleMotionSensor EOF ;
    public final EObject entryRuleMotionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotionSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1867:2: (iv_ruleMotionSensor= ruleMotionSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1868:2: iv_ruleMotionSensor= ruleMotionSensor EOF
            {
             newCompositeNode(grammarAccess.getMotionSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3834);
            iv_ruleMotionSensor=ruleMotionSensor();

            state._fsp--;

             current =iv_ruleMotionSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMotionSensor3844); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1875:1: ruleMotionSensor returns [EObject current=null] : ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1878:28: ( ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1879:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1879:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1879:2: () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1879:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1880:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMotionSensorAccess().getMotionSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMotionSensor3890); 

                	newLeafNode(otherlv_1, grammarAccess.getMotionSensorAccess().getMotionSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1889:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==11) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1889:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMotionSensor3903); 

                        	newLeafNode(otherlv_2, grammarAccess.getMotionSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMotionSensor3915); 

                        	newLeafNode(otherlv_3, grammarAccess.getMotionSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMotionSensor3927); 

                        	newLeafNode(otherlv_4, grammarAccess.getMotionSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1901:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1902:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1902:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1903:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMotionSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMotionSensor3948);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMotionSensor3960); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1931:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1932:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1933:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3998);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor4008); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1940:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1943:28: ( ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1944:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1944:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1944:2: () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1944:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1945:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTemperatureSensor4054); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1954:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1954:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTemperatureSensor4067); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTemperatureSensor4079); 

                        	newLeafNode(otherlv_3, grammarAccess.getTemperatureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTemperatureSensor4091); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemperatureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1966:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1967:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1967:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1968:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemperatureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTemperatureSensor4112);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTemperatureSensor4124); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1996:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1997:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1998:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor4162);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor4172); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2005:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2008:28: ( ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2009:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2009:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2009:2: () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2009:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2010:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePressureSensor4218); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2019:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==11) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2019:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePressureSensor4231); 

                        	newLeafNode(otherlv_2, grammarAccess.getPressureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePressureSensor4243); 

                        	newLeafNode(otherlv_3, grammarAccess.getPressureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePressureSensor4255); 

                        	newLeafNode(otherlv_4, grammarAccess.getPressureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2031:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2032:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2032:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2033:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPressureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePressureSensor4276);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePressureSensor4288); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2061:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2062:2: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2063:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor4326);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTouchSensor4336); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2070:1: ruleTouchSensor returns [EObject current=null] : ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2073:28: ( ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2074:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2074:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2074:2: () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2074:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2075:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTouchSensorAccess().getTouchSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTouchSensor4382); 

                	newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2084:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==11) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2084:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTouchSensor4395); 

                        	newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTouchSensor4407); 

                        	newLeafNode(otherlv_3, grammarAccess.getTouchSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTouchSensor4419); 

                        	newLeafNode(otherlv_4, grammarAccess.getTouchSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2096:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2097:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2097:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2098:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTouchSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTouchSensor4440);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTouchSensor4452); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2126:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2127:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2128:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor4490);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor4500); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2135:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2138:28: ( ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2139:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2139:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2139:2: () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2139:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2140:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleLightSensor4546); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2149:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==11) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2149:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSensor4559); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLightSensor4571); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLightSensor4583); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2161:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2162:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2162:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2163:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSensor4604);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSensor4616); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2191:1: entryRuleSmokeSensor returns [EObject current=null] : iv_ruleSmokeSensor= ruleSmokeSensor EOF ;
    public final EObject entryRuleSmokeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmokeSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2192:2: (iv_ruleSmokeSensor= ruleSmokeSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2193:2: iv_ruleSmokeSensor= ruleSmokeSensor EOF
            {
             newCompositeNode(grammarAccess.getSmokeSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4654);
            iv_ruleSmokeSensor=ruleSmokeSensor();

            state._fsp--;

             current =iv_ruleSmokeSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSmokeSensor4664); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2200:1: ruleSmokeSensor returns [EObject current=null] : ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2203:28: ( ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2204:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2204:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2204:2: () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2204:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2205:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSmokeSensorAccess().getSmokeSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSmokeSensor4710); 

                	newLeafNode(otherlv_1, grammarAccess.getSmokeSensorAccess().getSmokeSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2214:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==11) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2214:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSmokeSensor4723); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmokeSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSmokeSensor4735); 

                        	newLeafNode(otherlv_3, grammarAccess.getSmokeSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSmokeSensor4747); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmokeSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2226:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2227:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2227:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2228:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmokeSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSmokeSensor4768);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSmokeSensor4780); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2256:1: entryRuleCO2Sensor returns [EObject current=null] : iv_ruleCO2Sensor= ruleCO2Sensor EOF ;
    public final EObject entryRuleCO2Sensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCO2Sensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2257:2: (iv_ruleCO2Sensor= ruleCO2Sensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2258:2: iv_ruleCO2Sensor= ruleCO2Sensor EOF
            {
             newCompositeNode(grammarAccess.getCO2SensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4818);
            iv_ruleCO2Sensor=ruleCO2Sensor();

            state._fsp--;

             current =iv_ruleCO2Sensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCO2Sensor4828); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2265:1: ruleCO2Sensor returns [EObject current=null] : ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2268:28: ( ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2269:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2269:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2269:2: () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2269:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCO2SensorAccess().getCO2SensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCO2Sensor4874); 

                	newLeafNode(otherlv_1, grammarAccess.getCO2SensorAccess().getCO2SensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2279:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==11) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2279:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCO2Sensor4887); 

                        	newLeafNode(otherlv_2, grammarAccess.getCO2SensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleCO2Sensor4899); 

                        	newLeafNode(otherlv_3, grammarAccess.getCO2SensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCO2Sensor4911); 

                        	newLeafNode(otherlv_4, grammarAccess.getCO2SensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2291:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2292:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2292:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2293:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCO2SensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCO2Sensor4932);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCO2Sensor4944); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2321:1: entryRuleInfraredLightSensor returns [EObject current=null] : iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF ;
    public final EObject entryRuleInfraredLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraredLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2322:2: (iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2323:2: iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF
            {
             newCompositeNode(grammarAccess.getInfraredLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4982);
            iv_ruleInfraredLightSensor=ruleInfraredLightSensor();

            state._fsp--;

             current =iv_ruleInfraredLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfraredLightSensor4992); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2330:1: ruleInfraredLightSensor returns [EObject current=null] : ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2333:28: ( ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:2: () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2335:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleInfraredLightSensor5038); 

                	newLeafNode(otherlv_1, grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2344:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==11) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2344:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInfraredLightSensor5051); 

                        	newLeafNode(otherlv_2, grammarAccess.getInfraredLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleInfraredLightSensor5063); 

                        	newLeafNode(otherlv_3, grammarAccess.getInfraredLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInfraredLightSensor5075); 

                        	newLeafNode(otherlv_4, grammarAccess.getInfraredLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2356:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2357:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2357:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2358:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfraredLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInfraredLightSensor5096);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInfraredLightSensor5108); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2388:1: entryRuleHumiditySensor returns [EObject current=null] : iv_ruleHumiditySensor= ruleHumiditySensor EOF ;
    public final EObject entryRuleHumiditySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumiditySensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2389:2: (iv_ruleHumiditySensor= ruleHumiditySensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2390:2: iv_ruleHumiditySensor= ruleHumiditySensor EOF
            {
             newCompositeNode(grammarAccess.getHumiditySensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor5148);
            iv_ruleHumiditySensor=ruleHumiditySensor();

            state._fsp--;

             current =iv_ruleHumiditySensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumiditySensor5158); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2397:1: ruleHumiditySensor returns [EObject current=null] : ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2400:28: ( ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2401:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2401:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2401:2: () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2401:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2402:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumiditySensorAccess().getHumiditySensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleHumiditySensor5204); 

                	newLeafNode(otherlv_1, grammarAccess.getHumiditySensorAccess().getHumiditySensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2411:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==11) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2411:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumiditySensor5217); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumiditySensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleHumiditySensor5229); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumiditySensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHumiditySensor5241); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumiditySensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2423:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2424:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2424:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2425:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumiditySensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumiditySensor5262);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHumiditySensor5274); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2453:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2454:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2455:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5313);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5324); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2462:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2465:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2466:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2466:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2466:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2466:2: (kw= '-' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==33) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2467:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEInt5363); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5380); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2487:1: entryRuleLightSwitchActuator returns [EObject current=null] : iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF ;
    public final EObject entryRuleLightSwitchActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSwitchActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2488:2: (iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2489:2: iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF
            {
             newCompositeNode(grammarAccess.getLightSwitchActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5425);
            iv_ruleLightSwitchActuator=ruleLightSwitchActuator();

            state._fsp--;

             current =iv_ruleLightSwitchActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSwitchActuator5435); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2496:1: ruleLightSwitchActuator returns [EObject current=null] : ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2499:28: ( ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2500:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2500:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2500:2: () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2500:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2501:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleLightSwitchActuator5481); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2510:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==11) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2510:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSwitchActuator5494); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSwitchActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLightSwitchActuator5506); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSwitchActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLightSwitchActuator5518); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSwitchActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2522:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2523:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2523:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2524:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSwitchActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSwitchActuator5539);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSwitchActuator5551); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2552:1: entryRuleWindowActuator returns [EObject current=null] : iv_ruleWindowActuator= ruleWindowActuator EOF ;
    public final EObject entryRuleWindowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2553:2: (iv_ruleWindowActuator= ruleWindowActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2554:2: iv_ruleWindowActuator= ruleWindowActuator EOF
            {
             newCompositeNode(grammarAccess.getWindowActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5589);
            iv_ruleWindowActuator=ruleWindowActuator();

            state._fsp--;

             current =iv_ruleWindowActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWindowActuator5599); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2561:1: ruleWindowActuator returns [EObject current=null] : ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2564:28: ( ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2565:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2565:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2565:2: () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2565:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2566:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWindowActuatorAccess().getWindowActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleWindowActuator5645); 

                	newLeafNode(otherlv_1, grammarAccess.getWindowActuatorAccess().getWindowActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2575:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==11) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2575:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWindowActuator5658); 

                        	newLeafNode(otherlv_2, grammarAccess.getWindowActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleWindowActuator5670); 

                        	newLeafNode(otherlv_3, grammarAccess.getWindowActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWindowActuator5682); 

                        	newLeafNode(otherlv_4, grammarAccess.getWindowActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2587:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2588:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2588:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2589:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getWindowActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWindowActuator5703);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWindowActuator5715); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2617:1: entryRuleHumidifierActuator returns [EObject current=null] : iv_ruleHumidifierActuator= ruleHumidifierActuator EOF ;
    public final EObject entryRuleHumidifierActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumidifierActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2618:2: (iv_ruleHumidifierActuator= ruleHumidifierActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2619:2: iv_ruleHumidifierActuator= ruleHumidifierActuator EOF
            {
             newCompositeNode(grammarAccess.getHumidifierActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5753);
            iv_ruleHumidifierActuator=ruleHumidifierActuator();

            state._fsp--;

             current =iv_ruleHumidifierActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumidifierActuator5763); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2626:1: ruleHumidifierActuator returns [EObject current=null] : ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2629:28: ( ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2630:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2630:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2630:2: () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2630:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2631:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleHumidifierActuator5809); 

                	newLeafNode(otherlv_1, grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2640:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==11) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2640:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumidifierActuator5822); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumidifierActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleHumidifierActuator5834); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumidifierActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHumidifierActuator5846); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumidifierActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2652:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2653:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2653:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2654:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumidifierActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumidifierActuator5867);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHumidifierActuator5879); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2682:1: entryRuleDoorActuator returns [EObject current=null] : iv_ruleDoorActuator= ruleDoorActuator EOF ;
    public final EObject entryRuleDoorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2683:2: (iv_ruleDoorActuator= ruleDoorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2684:2: iv_ruleDoorActuator= ruleDoorActuator EOF
            {
             newCompositeNode(grammarAccess.getDoorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5917);
            iv_ruleDoorActuator=ruleDoorActuator();

            state._fsp--;

             current =iv_ruleDoorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoorActuator5927); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2691:1: ruleDoorActuator returns [EObject current=null] : ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2694:28: ( ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2695:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2695:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2695:2: () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2695:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2696:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoorActuatorAccess().getDoorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleDoorActuator5973); 

                	newLeafNode(otherlv_1, grammarAccess.getDoorActuatorAccess().getDoorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2705:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==11) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2705:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDoorActuator5986); 

                        	newLeafNode(otherlv_2, grammarAccess.getDoorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDoorActuator5998); 

                        	newLeafNode(otherlv_3, grammarAccess.getDoorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDoorActuator6010); 

                        	newLeafNode(otherlv_4, grammarAccess.getDoorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2717:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2718:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2718:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2719:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDoorActuator6031);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDoorActuator6043); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2747:1: entryRuleRadiatorActuator returns [EObject current=null] : iv_ruleRadiatorActuator= ruleRadiatorActuator EOF ;
    public final EObject entryRuleRadiatorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiatorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2748:2: (iv_ruleRadiatorActuator= ruleRadiatorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2749:2: iv_ruleRadiatorActuator= ruleRadiatorActuator EOF
            {
             newCompositeNode(grammarAccess.getRadiatorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator6081);
            iv_ruleRadiatorActuator=ruleRadiatorActuator();

            state._fsp--;

             current =iv_ruleRadiatorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadiatorActuator6091); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2756:1: ruleRadiatorActuator returns [EObject current=null] : ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2759:28: ( ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2760:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2760:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2760:2: () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2760:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2761:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleRadiatorActuator6137); 

                	newLeafNode(otherlv_1, grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2770:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==11) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2770:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRadiatorActuator6150); 

                        	newLeafNode(otherlv_2, grammarAccess.getRadiatorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRadiatorActuator6162); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadiatorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRadiatorActuator6174); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadiatorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2782:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2783:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2783:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2784:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRadiatorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRadiatorActuator6195);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRadiatorActuator6207); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2812:1: entryRuleAudioAlarmActuator returns [EObject current=null] : iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF ;
    public final EObject entryRuleAudioAlarmActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioAlarmActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2813:2: (iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2814:2: iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF
            {
             newCompositeNode(grammarAccess.getAudioAlarmActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator6245);
            iv_ruleAudioAlarmActuator=ruleAudioAlarmActuator();

            state._fsp--;

             current =iv_ruleAudioAlarmActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAudioAlarmActuator6255); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2821:1: ruleAudioAlarmActuator returns [EObject current=null] : ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2824:28: ( ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:2: () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2825:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2826:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleAudioAlarmActuator6301); 

                	newLeafNode(otherlv_1, grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2835:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==11) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2835:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAudioAlarmActuator6314); 

                        	newLeafNode(otherlv_2, grammarAccess.getAudioAlarmActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAudioAlarmActuator6326); 

                        	newLeafNode(otherlv_3, grammarAccess.getAudioAlarmActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAudioAlarmActuator6338); 

                        	newLeafNode(otherlv_4, grammarAccess.getAudioAlarmActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2847:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2848:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2848:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2849:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAudioAlarmActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAudioAlarmActuator6359);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAudioAlarmActuator6371); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2879:1: entryRuleSensorComponent returns [EObject current=null] : iv_ruleSensorComponent= ruleSensorComponent EOF ;
    public final EObject entryRuleSensorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2880:2: (iv_ruleSensorComponent= ruleSensorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2881:2: iv_ruleSensorComponent= ruleSensorComponent EOF
            {
             newCompositeNode(grammarAccess.getSensorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent6411);
            iv_ruleSensorComponent=ruleSensorComponent();

            state._fsp--;

             current =iv_ruleSensorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorComponent6421); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2888:1: ruleSensorComponent returns [EObject current=null] : ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) ;
    public final EObject ruleSensorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2891:28: ( ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2892:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2892:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2892:2: () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2892:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorComponentAccess().getSensorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleSensorComponent6467); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorComponentAccess().getSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2902:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2903:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2903:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2904:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSensorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorComponent6488);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2920:2: (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2920:4: otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )*
                    {
                    otherlv_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleSensorComponent6501); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2924:1: ( (lv_sensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2925:1: (lv_sensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2925:1: (lv_sensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2926:3: lv_sensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent6522);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2942:2: ( (lv_sensors_5_0= ruleSensor ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==42||(LA69_0>=44 && LA69_0<=51)) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2943:1: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2943:1: (lv_sensors_5_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2944:3: lv_sensors_5_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent6543);
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
    // $ANTLR end "ruleSensorComponent"


    // $ANTLR start "entryRuleActuatorComponent"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2968:1: entryRuleActuatorComponent returns [EObject current=null] : iv_ruleActuatorComponent= ruleActuatorComponent EOF ;
    public final EObject entryRuleActuatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2969:2: (iv_ruleActuatorComponent= ruleActuatorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2970:2: iv_ruleActuatorComponent= ruleActuatorComponent EOF
            {
             newCompositeNode(grammarAccess.getActuatorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent6582);
            iv_ruleActuatorComponent=ruleActuatorComponent();

            state._fsp--;

             current =iv_ruleActuatorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuatorComponent6592); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2977:1: ruleActuatorComponent returns [EObject current=null] : ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) ;
    public final EObject ruleActuatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2980:28: ( ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2981:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2981:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2981:2: () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2981:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2982:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorComponentAccess().getActuatorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleActuatorComponent6638); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorComponentAccess().getActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2991:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2992:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2992:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2993:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActuatorComponent6659);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3009:2: (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==59) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3009:4: otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )*
                    {
                    otherlv_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleActuatorComponent6672); 

                        	newLeafNode(otherlv_3, grammarAccess.getActuatorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3013:1: ( (lv_actuators_4_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3014:1: (lv_actuators_4_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3014:1: (lv_actuators_4_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3015:3: lv_actuators_4_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent6693);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3031:2: ( (lv_actuators_5_0= ruleActuator ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=52 && LA71_0<=57)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3032:1: (lv_actuators_5_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3032:1: (lv_actuators_5_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3033:3: lv_actuators_5_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent6714);
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
                    	    break loop71;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3057:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3058:2: (iv_ruleConditions= ruleConditions EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3059:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_entryRuleConditions6753);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditions6763); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3066:1: ruleConditions returns [EObject current=null] : ( () otherlv_1= 'Conditions' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3069:28: ( ( () otherlv_1= 'Conditions' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3070:1: ( () otherlv_1= 'Conditions' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3070:1: ( () otherlv_1= 'Conditions' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3070:2: () otherlv_1= 'Conditions'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3070:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3071:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionsAccess().getConditionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleConditions6809); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3088:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3089:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3090:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean6846);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean6857); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3097:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3100:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3101:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3101:1: (kw= 'true' | kw= 'false' )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==62) ) {
                alt73=1;
            }
            else if ( (LA73_0==63) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3102:2: kw= 'true'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEBoolean6895); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3109:2: kw= 'false'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEBoolean6914); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3122:1: ruleWeekdays returns [Enumerator current=null] : ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDNESDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3124:28: ( ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDNESDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3125:1: ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDNESDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3125:1: ( (enumLiteral_0= 'MONDAY' ) | (enumLiteral_1= 'TUESDAY' ) | (enumLiteral_2= 'WEDNESDAY' ) | (enumLiteral_3= 'THURSDAY' ) | (enumLiteral_4= 'FRIDAY' ) | (enumLiteral_5= 'SATURDAY' ) | (enumLiteral_6= 'SUNDAY' ) )
            int alt74=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt74=1;
                }
                break;
            case 65:
                {
                alt74=2;
                }
                break;
            case 66:
                {
                alt74=3;
                }
                break;
            case 67:
                {
                alt74=4;
                }
                break;
            case 68:
                {
                alt74=5;
                }
                break;
            case 69:
                {
                alt74=6;
                }
                break;
            case 70:
                {
                alt74=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3125:2: (enumLiteral_0= 'MONDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3125:2: (enumLiteral_0= 'MONDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3125:4: enumLiteral_0= 'MONDAY'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleWeekdays6968); 

                            current = grammarAccess.getWeekdaysAccess().getMONDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWeekdaysAccess().getMONDAYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3131:6: (enumLiteral_1= 'TUESDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3131:6: (enumLiteral_1= 'TUESDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3131:8: enumLiteral_1= 'TUESDAY'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleWeekdays6985); 

                            current = grammarAccess.getWeekdaysAccess().getTUESDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWeekdaysAccess().getTUESDAYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3137:6: (enumLiteral_2= 'WEDNESDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3137:6: (enumLiteral_2= 'WEDNESDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3137:8: enumLiteral_2= 'WEDNESDAY'
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleWeekdays7002); 

                            current = grammarAccess.getWeekdaysAccess().getWEDNESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWeekdaysAccess().getWEDNESDAYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3143:6: (enumLiteral_3= 'THURSDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3143:6: (enumLiteral_3= 'THURSDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3143:8: enumLiteral_3= 'THURSDAY'
                    {
                    enumLiteral_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleWeekdays7019); 

                            current = grammarAccess.getWeekdaysAccess().getTHURSDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getWeekdaysAccess().getTHURSDAYEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3149:6: (enumLiteral_4= 'FRIDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3149:6: (enumLiteral_4= 'FRIDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3149:8: enumLiteral_4= 'FRIDAY'
                    {
                    enumLiteral_4=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleWeekdays7036); 

                            current = grammarAccess.getWeekdaysAccess().getFRIDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getWeekdaysAccess().getFRIDAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3155:6: (enumLiteral_5= 'SATURDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3155:6: (enumLiteral_5= 'SATURDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3155:8: enumLiteral_5= 'SATURDAY'
                    {
                    enumLiteral_5=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleWeekdays7053); 

                            current = grammarAccess.getWeekdaysAccess().getSATURDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getWeekdaysAccess().getSATURDAYEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3161:6: (enumLiteral_6= 'SUNDAY' )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3161:6: (enumLiteral_6= 'SUNDAY' )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:3161:8: enumLiteral_6= 'SUNDAY'
                    {
                    enumLiteral_6=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleWeekdays7070); 

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
        public static final BitSet FOLLOW_15_in_ruleState515 = new BitSet(new long[]{0xC000000000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleState544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSchedule_in_entryRuleSchedule579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSchedule589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleSchedule635 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSchedule656 = new BitSet(new long[]{0x00000000000A0002L});
        public static final BitSet FOLLOW_17_in_ruleSchedule669 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
        public static final BitSet FOLLOW_ruleWeekdays_in_ruleSchedule690 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_18_in_ruleSchedule703 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
        public static final BitSet FOLLOW_ruleWeekdays_in_ruleSchedule724 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_19_in_ruleSchedule741 = new BitSet(new long[]{0x0000000200100010L});
        public static final BitSet FOLLOW_ruleTime_in_ruleSchedule762 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSchedule774 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleTime_in_ruleSchedule795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePolicy843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rulePolicy889 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePolicy910 = new BitSet(new long[]{0x0000000001C00002L});
        public static final BitSet FOLLOW_22_in_rulePolicy923 = new BitSet(new long[]{0x000FF40001800002L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy945 = new BitSet(new long[]{0x0000000001840002L});
        public static final BitSet FOLLOW_18_in_rulePolicy958 = new BitSet(new long[]{0x000FF40000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy979 = new BitSet(new long[]{0x0000000001840002L});
        public static final BitSet FOLLOW_23_in_rulePolicy998 = new BitSet(new long[]{0x03F0000001000002L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1020 = new BitSet(new long[]{0x0000000001040002L});
        public static final BitSet FOLLOW_18_in_rulePolicy1033 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1054 = new BitSet(new long[]{0x0000000001040002L});
        public static final BitSet FOLLOW_24_in_rulePolicy1073 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulePolicy1085 = new BitSet(new long[]{0x2000000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1107 = new BitSet(new long[]{0x2000000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1128 = new BitSet(new long[]{0x2000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePolicy1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuilding_in_entryRuleBuilding1181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuilding1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBuilding1237 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBuilding1258 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleBuilding1270 = new BitSet(new long[]{0x0000032404002000L});
        public static final BitSet FOLLOW_ruleCTS_in_ruleBuilding1291 = new BitSet(new long[]{0x0000032004002000L});
        public static final BitSet FOLLOW_ruleAccessControl_in_ruleBuilding1313 = new BitSet(new long[]{0x0000030004002000L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_ruleBuilding1335 = new BitSet(new long[]{0x0000020004002000L});
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
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1762 = new BitSet(new long[]{0x0000000020040800L});
        public static final BitSet FOLLOW_18_in_ruleRoom1775 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1798 = new BitSet(new long[]{0x0000000020040800L});
        public static final BitSet FOLLOW_29_in_ruleRoom1815 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1838 = new BitSet(new long[]{0x00000000C0040800L});
        public static final BitSet FOLLOW_18_in_ruleRoom1851 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1874 = new BitSet(new long[]{0x00000000C0040800L});
        public static final BitSet FOLLOW_30_in_ruleRoom1890 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1913 = new BitSet(new long[]{0x0000000000040800L});
        public static final BitSet FOLLOW_18_in_ruleRoom1926 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1949 = new BitSet(new long[]{0x0000000000040800L});
        public static final BitSet FOLLOW_31_in_ruleRoom1970 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRoom1986 = new BitSet(new long[]{0x1400000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom2008 = new BitSet(new long[]{0x1400000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom2029 = new BitSet(new long[]{0x1400000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom2054 = new BitSet(new long[]{0x1000000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom2075 = new BitSet(new long[]{0x1000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRoom2090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator2126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_ruleActuator2183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_ruleActuator2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_ruleActuator2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_ruleActuator2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_ruleActuator2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_ruleActuator2318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor2353 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor2363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_ruleSensor2410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleSensor2437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleSensor2464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_ruleSensor2491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleSensor2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_ruleSensor2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_ruleSensor2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_ruleSensor2599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_ruleSensor2626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime2661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime2671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleTime2727 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleTime2739 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleTime2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort2799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEShort2849 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEShort2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCTS_in_entryRuleCTS3034 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCTS3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleCTS3090 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS3102 = new BitSet(new long[]{0x0000001800002000L});
        public static final BitSet FOLLOW_35_in_ruleCTS3115 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS3127 = new BitSet(new long[]{0x000FF40000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS3148 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleCTS3161 = new BitSet(new long[]{0x000FF40000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS3182 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3196 = new BitSet(new long[]{0x0000001000002000L});
        public static final BitSet FOLLOW_36_in_ruleCTS3211 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS3223 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS3244 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleCTS3257 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS3278 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3292 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCTS3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessControl_in_entryRuleAccessControl3342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessControl3352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAccessControl3398 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3410 = new BitSet(new long[]{0x000000C000002000L});
        public static final BitSet FOLLOW_38_in_ruleAccessControl3423 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3435 = new BitSet(new long[]{0x000FF40000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl3456 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl3469 = new BitSet(new long[]{0x000FF40000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl3490 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3504 = new BitSet(new long[]{0x0000008000002000L});
        public static final BitSet FOLLOW_39_in_ruleAccessControl3519 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl3531 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl3552 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl3565 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl3586 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3600 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl3614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem3650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarSystem3660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleCalendarSystem3706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem3742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleMeetingScheduleSystem3798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3834 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMotionSensor3844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleMotionSensor3890 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleMotionSensor3903 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleMotionSensor3915 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMotionSensor3927 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMotionSensor3948 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMotionSensor3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3998 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor4008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleTemperatureSensor4054 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTemperatureSensor4067 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleTemperatureSensor4079 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTemperatureSensor4091 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTemperatureSensor4112 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTemperatureSensor4124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor4162 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor4172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePressureSensor4218 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulePressureSensor4231 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_rulePressureSensor4243 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePressureSensor4255 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePressureSensor4276 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePressureSensor4288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor4326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTouchSensor4336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTouchSensor4382 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTouchSensor4395 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleTouchSensor4407 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTouchSensor4419 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTouchSensor4440 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTouchSensor4452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor4490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor4500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleLightSensor4546 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSensor4559 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleLightSensor4571 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLightSensor4583 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSensor4604 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSensor4616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4654 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSmokeSensor4664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleSmokeSensor4710 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleSmokeSensor4723 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleSmokeSensor4735 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSmokeSensor4747 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSmokeSensor4768 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSmokeSensor4780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCO2Sensor4828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleCO2Sensor4874 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleCO2Sensor4887 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleCO2Sensor4899 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCO2Sensor4911 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCO2Sensor4932 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCO2Sensor4944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4982 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfraredLightSensor4992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleInfraredLightSensor5038 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleInfraredLightSensor5051 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleInfraredLightSensor5063 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInfraredLightSensor5075 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInfraredLightSensor5096 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInfraredLightSensor5108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor5148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumiditySensor5158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleHumiditySensor5204 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumiditySensor5217 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleHumiditySensor5229 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHumiditySensor5241 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumiditySensor5262 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHumiditySensor5274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEInt5363 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSwitchActuator5435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleLightSwitchActuator5481 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSwitchActuator5494 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleLightSwitchActuator5506 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLightSwitchActuator5518 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSwitchActuator5539 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSwitchActuator5551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWindowActuator5599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleWindowActuator5645 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleWindowActuator5658 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleWindowActuator5670 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWindowActuator5682 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWindowActuator5703 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWindowActuator5715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumidifierActuator5763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleHumidifierActuator5809 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumidifierActuator5822 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleHumidifierActuator5834 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHumidifierActuator5846 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumidifierActuator5867 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHumidifierActuator5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoorActuator5927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleDoorActuator5973 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleDoorActuator5986 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleDoorActuator5998 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDoorActuator6010 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDoorActuator6031 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDoorActuator6043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator6081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadiatorActuator6091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleRadiatorActuator6137 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleRadiatorActuator6150 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleRadiatorActuator6162 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRadiatorActuator6174 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRadiatorActuator6195 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRadiatorActuator6207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator6245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAudioAlarmActuator6255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleAudioAlarmActuator6301 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAudioAlarmActuator6314 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleAudioAlarmActuator6326 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAudioAlarmActuator6338 = new BitSet(new long[]{0x0000000200000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAudioAlarmActuator6359 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAudioAlarmActuator6371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent6411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorComponent6421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleSensorComponent6467 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorComponent6488 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleSensorComponent6501 = new BitSet(new long[]{0x000FF40000000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent6522 = new BitSet(new long[]{0x000FF40000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent6543 = new BitSet(new long[]{0x000FF40000000002L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent6582 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuatorComponent6592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleActuatorComponent6638 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActuatorComponent6659 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleActuatorComponent6672 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent6693 = new BitSet(new long[]{0x03F0000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent6714 = new BitSet(new long[]{0x03F0000000000002L});
        public static final BitSet FOLLOW_ruleConditions_in_entryRuleConditions6753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditions6763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleConditions6809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean6846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean6857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleEBoolean6895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleEBoolean6914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleWeekdays6968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleWeekdays6985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleWeekdays7002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleWeekdays7019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleWeekdays7036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleWeekdays7053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleWeekdays7070 = new BitSet(new long[]{0x0000000000000002L});
    }


}