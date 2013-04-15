package dk.itu.mdd.policyengine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'building'", "'room type'", "'is of type '", "'policy'", "'uses sensors'", "','", "'uses actuators'", "'is specified by'", "'state'", "'='", "'CTS'", "'temperatureSensors'", "'ctsActuators'", "'AccessControl'", "'accessControlSensors'", "'accessControlDoorLockActuator'", "'CalendarSystem'", "'MeetingScheduleSystem'", "'floor'", "'rooms'", "'MotionSensor'", "'valueState'", "'TemperatureSensor'", "'PressureSensor'", "'TouchSensor'", "'LightSensor'", "'SmokeSensor'", "'CO2Sensor'", "'InfraredLightSensor'", "'-'", "'LightSwitchActuator'", "'WindowActuator'", "'HumidifierActuator'", "'DoorActuator'", "'RadiatorActuator'", "'AudioAlarmActuator'", "'sensor '", "'is a '", "'actuator'", "'Conditions'", "'true'", "'false'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_predefinedRooms_7_0= ruleRoom ) ) ( (lv_predefinedRooms_8_0= ruleRoom ) )* )? ( ( (lv_buildings_9_0= ruleBuilding ) ) ( (lv_buildings_10_0= ruleBuilding ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_stateDefinition_3_0 = null;

        EObject lv_stateDefinition_4_0 = null;

        EObject lv_policyDefinition_5_0 = null;

        EObject lv_policyDefinition_6_0 = null;

        EObject lv_predefinedRooms_7_0 = null;

        EObject lv_predefinedRooms_8_0 = null;

        EObject lv_buildings_9_0 = null;

        EObject lv_buildings_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:79:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_predefinedRooms_7_0= ruleRoom ) ) ( (lv_predefinedRooms_8_0= ruleRoom ) )* )? ( ( (lv_buildings_9_0= ruleBuilding ) ) ( (lv_buildings_10_0= ruleBuilding ) )* )? otherlv_11= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_predefinedRooms_7_0= ruleRoom ) ) ( (lv_predefinedRooms_8_0= ruleRoom ) )* )? ( ( (lv_buildings_9_0= ruleBuilding ) ) ( (lv_buildings_10_0= ruleBuilding ) )* )? otherlv_11= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_predefinedRooms_7_0= ruleRoom ) ) ( (lv_predefinedRooms_8_0= ruleRoom ) )* )? ( ( (lv_buildings_9_0= ruleBuilding ) ) ( (lv_buildings_10_0= ruleBuilding ) )* )? otherlv_11= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? ( ( (lv_predefinedRooms_7_0= ruleRoom ) ) ( (lv_predefinedRooms_8_0= ruleRoom ) )* )? ( ( (lv_buildings_9_0= ruleBuilding ) ) ( (lv_buildings_10_0= ruleBuilding ) )* )? otherlv_11= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:86:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:87:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:87:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:88:3: lv_name_1_0= ruleEString
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
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:108:1: ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:108:2: ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:108:2: ( (lv_stateDefinition_3_0= ruleState ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:109:1: (lv_stateDefinition_3_0= ruleState )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:109:1: (lv_stateDefinition_3_0= ruleState )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:110:3: lv_stateDefinition_3_0= ruleState
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:126:2: ( (lv_stateDefinition_4_0= ruleState ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==21) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:127:1: (lv_stateDefinition_4_0= ruleState )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:127:1: (lv_stateDefinition_4_0= ruleState )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:128:3: lv_stateDefinition_4_0= ruleState
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:144:5: ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:144:6: ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:144:6: ( (lv_policyDefinition_5_0= rulePolicy ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:145:1: (lv_policyDefinition_5_0= rulePolicy )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:145:1: (lv_policyDefinition_5_0= rulePolicy )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:146:3: lv_policyDefinition_5_0= rulePolicy
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:162:2: ( (lv_policyDefinition_6_0= rulePolicy ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:163:1: (lv_policyDefinition_6_0= rulePolicy )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:163:1: (lv_policyDefinition_6_0= rulePolicy )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:164:3: lv_policyDefinition_6_0= rulePolicy
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:180:5: ( ( (lv_predefinedRooms_7_0= ruleRoom ) ) ( (lv_predefinedRooms_8_0= ruleRoom ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:180:6: ( (lv_predefinedRooms_7_0= ruleRoom ) ) ( (lv_predefinedRooms_8_0= ruleRoom ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:180:6: ( (lv_predefinedRooms_7_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:181:1: (lv_predefinedRooms_7_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:181:1: (lv_predefinedRooms_7_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:182:3: lv_predefinedRooms_7_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel266);
                    lv_predefinedRooms_7_0=ruleRoom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"predefinedRooms",
                            		lv_predefinedRooms_7_0, 
                            		"Room");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:198:2: ( (lv_predefinedRooms_8_0= ruleRoom ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:199:1: (lv_predefinedRooms_8_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:199:1: (lv_predefinedRooms_8_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:200:3: lv_predefinedRooms_8_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel287);
                    	    lv_predefinedRooms_8_0=ruleRoom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"predefinedRooms",
                    	            		lv_predefinedRooms_8_0, 
                    	            		"Room");
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:216:5: ( ( (lv_buildings_9_0= ruleBuilding ) ) ( (lv_buildings_10_0= ruleBuilding ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:216:6: ( (lv_buildings_9_0= ruleBuilding ) ) ( (lv_buildings_10_0= ruleBuilding ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:216:6: ( (lv_buildings_9_0= ruleBuilding ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:217:1: (lv_buildings_9_0= ruleBuilding )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:217:1: (lv_buildings_9_0= ruleBuilding )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:218:3: lv_buildings_9_0= ruleBuilding
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel312);
                    lv_buildings_9_0=ruleBuilding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"buildings",
                            		lv_buildings_9_0, 
                            		"Building");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:234:2: ( (lv_buildings_10_0= ruleBuilding ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:235:1: (lv_buildings_10_0= ruleBuilding )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:235:1: (lv_buildings_10_0= ruleBuilding )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:236:3: lv_buildings_10_0= ruleBuilding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel333);
                    	    lv_buildings_10_0=ruleBuilding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"buildings",
                    	            		lv_buildings_10_0, 
                    	            		"Building");
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

            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel348); 

                	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:264:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:265:2: (iv_ruleActuator= ruleActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:266:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator384);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator394); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:273:1: ruleActuator returns [EObject current=null] : (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:276:28: ( (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:277:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:277:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt9=1;
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case 45:
                {
                alt9=3;
                }
                break;
            case 46:
                {
                alt9=4;
                }
                break;
            case 47:
                {
                alt9=5;
                }
                break;
            case 48:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:278:5: this_LightSwitchActuator_0= ruleLightSwitchActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getLightSwitchActuatorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_ruleActuator441);
                    this_LightSwitchActuator_0=ruleLightSwitchActuator();

                    state._fsp--;

                     
                            current = this_LightSwitchActuator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:288:5: this_WindowActuator_1= ruleWindowActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getWindowActuatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_ruleActuator468);
                    this_WindowActuator_1=ruleWindowActuator();

                    state._fsp--;

                     
                            current = this_WindowActuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:298:5: this_HumidifierActuator_2= ruleHumidifierActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getHumidifierActuatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_ruleActuator495);
                    this_HumidifierActuator_2=ruleHumidifierActuator();

                    state._fsp--;

                     
                            current = this_HumidifierActuator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:308:5: this_DoorActuator_3= ruleDoorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getDoorActuatorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_ruleActuator522);
                    this_DoorActuator_3=ruleDoorActuator();

                    state._fsp--;

                     
                            current = this_DoorActuator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:318:5: this_RadiatorActuator_4= ruleRadiatorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getRadiatorActuatorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_ruleActuator549);
                    this_RadiatorActuator_4=ruleRadiatorActuator();

                    state._fsp--;

                     
                            current = this_RadiatorActuator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:328:5: this_AudioAlarmActuator_5= ruleAudioAlarmActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getAudioAlarmActuatorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_ruleActuator576);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:344:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:345:2: (iv_ruleSensor= ruleSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:346:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor611);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor621); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:353:1: ruleSensor returns [EObject current=null] : (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor ) ;
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


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:356:28: ( (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:357:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:357:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
                {
                alt10=6;
                }
                break;
            case 40:
                {
                alt10=7;
                }
                break;
            case 41:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:358:5: this_MotionSensor_0= ruleMotionSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getMotionSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_ruleSensor668);
                    this_MotionSensor_0=ruleMotionSensor();

                    state._fsp--;

                     
                            current = this_MotionSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:368:5: this_TemperatureSensor_1= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTemperatureSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleSensor695);
                    this_TemperatureSensor_1=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:378:5: this_PressureSensor_2= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getPressureSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleSensor722);
                    this_PressureSensor_2=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:388:5: this_TouchSensor_3= ruleTouchSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTouchSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_ruleSensor749);
                    this_TouchSensor_3=ruleTouchSensor();

                    state._fsp--;

                     
                            current = this_TouchSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:398:5: this_LightSensor_4= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleSensor776);
                    this_LightSensor_4=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:408:5: this_SmokeSensor_5= ruleSmokeSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getSmokeSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_ruleSensor803);
                    this_SmokeSensor_5=ruleSmokeSensor();

                    state._fsp--;

                     
                            current = this_SmokeSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:418:5: this_CO2Sensor_6= ruleCO2Sensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getCO2SensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_ruleSensor830);
                    this_CO2Sensor_6=ruleCO2Sensor();

                    state._fsp--;

                     
                            current = this_CO2Sensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:428:5: this_InfraredLightSensor_7= ruleInfraredLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getInfraredLightSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_ruleSensor857);
                    this_InfraredLightSensor_7=ruleInfraredLightSensor();

                    state._fsp--;

                     
                            current = this_InfraredLightSensor_7; 
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


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:444:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:445:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:446:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString893);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString904); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:453:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:456:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:457:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:457:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:457:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString944); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:465:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString970); 

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


    // $ANTLR start "entryRuleBuilding"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:480:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:481:2: (iv_ruleBuilding= ruleBuilding EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:482:2: iv_ruleBuilding= ruleBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_entryRuleBuilding1015);
            iv_ruleBuilding=ruleBuilding();

            state._fsp--;

             current =iv_ruleBuilding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuilding1025); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:489:1: ruleBuilding returns [EObject current=null] : ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:492:28: ( ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:493:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:493:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:493:2: () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:493:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:494:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildingAccess().getBuildingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBuilding1071); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildingAccess().getBuildingKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:503:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:504:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:504:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:505:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBuilding1092);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBuilding1104); 

                	newLeafNode(otherlv_3, grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:525:1: ( (lv_ctsSystem_4_0= ruleCTS ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:526:1: (lv_ctsSystem_4_0= ruleCTS )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:526:1: (lv_ctsSystem_4_0= ruleCTS )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:527:3: lv_ctsSystem_4_0= ruleCTS
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCtsSystemCTSParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCTS_in_ruleBuilding1125);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:543:3: ( (lv_accessControl_5_0= ruleAccessControl ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:544:1: (lv_accessControl_5_0= ruleAccessControl )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:544:1: (lv_accessControl_5_0= ruleAccessControl )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:545:3: lv_accessControl_5_0= ruleAccessControl
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getAccessControlAccessControlParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_ruleBuilding1147);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:561:3: ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:562:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:562:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:563:3: lv_calendarSystem_6_0= ruleCalendarSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCalendarSystemCalendarSystemParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_ruleBuilding1169);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:579:3: ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:580:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:580:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:581:3: lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getMeetingScheduleSystemMeetingScheduleSystemParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1191);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:597:3: ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:597:4: ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:597:4: ( (lv_floors_8_0= ruleFloor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:598:1: (lv_floors_8_0= ruleFloor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:598:1: (lv_floors_8_0= ruleFloor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:599:3: lv_floors_8_0= ruleFloor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1214);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:615:2: ( (lv_floors_9_0= ruleFloor ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==31) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:616:1: (lv_floors_9_0= ruleFloor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:616:1: (lv_floors_9_0= ruleFloor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:617:3: lv_floors_9_0= ruleFloor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1235);
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBuilding1250); 

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


    // $ANTLR start "entryRuleRoom"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:646:2: (iv_ruleRoom= ruleRoom EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:647:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoom_in_entryRuleRoom1286);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoom1296); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:654:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room type' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is of type ' ( ( ruleEString ) ) ( ( ruleEString ) )* )? otherlv_6= '{' ( ( (lv_declareSensor_7_0= ruleSensorComponent ) ) ( (lv_declareSensor_8_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_9_0= ruleActuatorComponent ) ) ( (lv_declareActuator_10_0= ruleActuatorComponent ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declareSensor_7_0 = null;

        EObject lv_declareSensor_8_0 = null;

        EObject lv_declareActuator_9_0 = null;

        EObject lv_declareActuator_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:657:28: ( ( () otherlv_1= 'room type' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is of type ' ( ( ruleEString ) ) ( ( ruleEString ) )* )? otherlv_6= '{' ( ( (lv_declareSensor_7_0= ruleSensorComponent ) ) ( (lv_declareSensor_8_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_9_0= ruleActuatorComponent ) ) ( (lv_declareActuator_10_0= ruleActuatorComponent ) )* )? otherlv_11= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:658:1: ( () otherlv_1= 'room type' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is of type ' ( ( ruleEString ) ) ( ( ruleEString ) )* )? otherlv_6= '{' ( ( (lv_declareSensor_7_0= ruleSensorComponent ) ) ( (lv_declareSensor_8_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_9_0= ruleActuatorComponent ) ) ( (lv_declareActuator_10_0= ruleActuatorComponent ) )* )? otherlv_11= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:658:1: ( () otherlv_1= 'room type' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is of type ' ( ( ruleEString ) ) ( ( ruleEString ) )* )? otherlv_6= '{' ( ( (lv_declareSensor_7_0= ruleSensorComponent ) ) ( (lv_declareSensor_8_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_9_0= ruleActuatorComponent ) ) ( (lv_declareActuator_10_0= ruleActuatorComponent ) )* )? otherlv_11= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:658:2: () otherlv_1= 'room type' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is of type ' ( ( ruleEString ) ) ( ( ruleEString ) )* )? otherlv_6= '{' ( ( (lv_declareSensor_7_0= ruleSensorComponent ) ) ( (lv_declareSensor_8_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_9_0= ruleActuatorComponent ) ) ( (lv_declareActuator_10_0= ruleActuatorComponent ) )* )? otherlv_11= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:658:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:659:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoomAccess().getRoomAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRoom1342); 

                	newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomTypeKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:668:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:669:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:669:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:670:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1363);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoomRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:686:2: (otherlv_3= 'is of type ' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:686:4: otherlv_3= 'is of type ' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRoom1376); 

                        	newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getIsOfTypeKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:690:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:691:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:691:1: ( ruleEString )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:692:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoomRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1399);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:705:2: ( ( ruleEString ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:706:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:706:1: ( ruleEString )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:707:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoomRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1422);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoom1437); 

                	newLeafNode(otherlv_6, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:724:1: ( ( (lv_declareSensor_7_0= ruleSensorComponent ) ) ( (lv_declareSensor_8_0= ruleSensorComponent ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:724:2: ( (lv_declareSensor_7_0= ruleSensorComponent ) ) ( (lv_declareSensor_8_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:724:2: ( (lv_declareSensor_7_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:725:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:725:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:726:3: lv_declareSensor_7_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom1459);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:742:2: ( (lv_declareSensor_8_0= ruleSensorComponent ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==49) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:743:1: (lv_declareSensor_8_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:743:1: (lv_declareSensor_8_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:744:3: lv_declareSensor_8_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom1480);
                    	    lv_declareSensor_8_0=ruleSensorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareSensor",
                    	            		lv_declareSensor_8_0, 
                    	            		"SensorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:760:5: ( ( (lv_declareActuator_9_0= ruleActuatorComponent ) ) ( (lv_declareActuator_10_0= ruleActuatorComponent ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:760:6: ( (lv_declareActuator_9_0= ruleActuatorComponent ) ) ( (lv_declareActuator_10_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:760:6: ( (lv_declareActuator_9_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:761:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:761:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:762:3: lv_declareActuator_9_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom1505);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:778:2: ( (lv_declareActuator_10_0= ruleActuatorComponent ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==51) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:779:1: (lv_declareActuator_10_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:779:1: (lv_declareActuator_10_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:780:3: lv_declareActuator_10_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom1526);
                    	    lv_declareActuator_10_0=ruleActuatorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareActuator",
                    	            		lv_declareActuator_10_0, 
                    	            		"ActuatorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoom1541); 

                	newLeafNode(otherlv_11, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRulePolicy"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:808:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:809:2: (iv_rulePolicy= rulePolicy EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:810:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePolicy_in_entryRulePolicy1577);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePolicy1587); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:817:1: rulePolicy returns [EObject current=null] : ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* otherlv_15= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:820:28: ( ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* otherlv_15= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:821:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* otherlv_15= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:821:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* otherlv_15= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:821:2: () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* otherlv_15= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:821:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:822:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolicyAccess().getPolicyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePolicy1633); 

                	newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getPolicyKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:831:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:832:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:832:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:833:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPolicyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePolicy1654);
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePolicy1666); 

                	newLeafNode(otherlv_3, grammarAccess.getPolicyAccess().getUsesSensorsKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:853:1: ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33||(LA25_0>=35 && LA25_0<=41)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:853:2: ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:853:2: ( (lv_usesSensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:854:1: (lv_usesSensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:854:1: (lv_usesSensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:855:3: lv_usesSensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy1688);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:871:2: (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==18) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:871:4: otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePolicy1701); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:875:1: ( (lv_usesSensors_6_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:876:1: (lv_usesSensors_6_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:876:1: (lv_usesSensors_6_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:877:3: lv_usesSensors_6_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy1722);
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePolicy1738); 

                	newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getUsesActuatorsKeyword_5());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:897:1: ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=43 && LA27_0<=48)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:897:2: ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:897:2: ( (lv_uses_8_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:898:1: (lv_uses_8_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:898:1: (lv_uses_8_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:899:3: lv_uses_8_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1760);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:915:2: (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==18) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:915:4: otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePolicy1773); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:919:1: ( (lv_uses_10_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:920:1: (lv_uses_10_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:920:1: (lv_uses_10_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:921:3: lv_uses_10_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1794);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:937:6: (otherlv_11= 'is specified by' otherlv_12= '{' ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* otherlv_15= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:937:8: otherlv_11= 'is specified by' otherlv_12= '{' ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePolicy1811); 

                        	newLeafNode(otherlv_11, grammarAccess.getPolicyAccess().getIsSpecifiedByKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePolicy1823); 

                        	newLeafNode(otherlv_12, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:945:1: ( (lv_specifiedBy_13_0= ruleConditions ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:946:1: (lv_specifiedBy_13_0= ruleConditions )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:946:1: (lv_specifiedBy_13_0= ruleConditions )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:947:3: lv_specifiedBy_13_0= ruleConditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy1844);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:963:2: ( (lv_specifiedBy_14_0= ruleConditions ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==52) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:964:1: (lv_specifiedBy_14_0= ruleConditions )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:964:1: (lv_specifiedBy_14_0= ruleConditions )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:965:3: lv_specifiedBy_14_0= ruleConditions
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy1865);
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
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePolicy1878); 

                        	newLeafNode(otherlv_15, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7_4());
                        

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


    // $ANTLR start "entryRuleState"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:993:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:994:2: (iv_ruleState= ruleState EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:995:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1916);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1926); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1002:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valueState_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1005:28: ( ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1006:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1006:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1006:2: () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1006:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1007:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleState1972); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1016:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1017:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1017:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1018:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1993);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1034:2: ( (lv_valueState_3_0= '=' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1035:1: (lv_valueState_3_0= '=' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1035:1: (lv_valueState_3_0= '=' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1036:3: lv_valueState_3_0= '='
            {
            lv_valueState_3_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState2011); 

                    newLeafNode(lv_valueState_3_0, grammarAccess.getStateAccess().getValueStateEqualsSignKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(current, "valueState", true, "=");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getStateAccess().getEBooleanParserRuleCall_4()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleState2040);
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


    // $ANTLR start "entryRuleCTS"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1065:1: entryRuleCTS returns [EObject current=null] : iv_ruleCTS= ruleCTS EOF ;
    public final EObject entryRuleCTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTS = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1066:2: (iv_ruleCTS= ruleCTS EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1067:2: iv_ruleCTS= ruleCTS EOF
            {
             newCompositeNode(grammarAccess.getCTSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCTS_in_entryRuleCTS2075);
            iv_ruleCTS=ruleCTS();

            state._fsp--;

             current =iv_ruleCTS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCTS2085); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1074:1: ruleCTS returns [EObject current=null] : ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1077:28: ( ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1078:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1078:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1078:2: () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1078:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1079:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCTSAccess().getCTSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCTS2131); 

                	newLeafNode(otherlv_1, grammarAccess.getCTSAccess().getCTSKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2143); 

                	newLeafNode(otherlv_2, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1092:1: (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1092:3: otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCTS2156); 

                        	newLeafNode(otherlv_3, grammarAccess.getCTSAccess().getTemperatureSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2168); 

                        	newLeafNode(otherlv_4, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1100:1: ( (lv_temperatureSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1101:1: (lv_temperatureSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1101:1: (lv_temperatureSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1102:3: lv_temperatureSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS2189);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1118:2: (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==18) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1118:4: otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS2202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCTSAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1122:1: ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1123:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1123:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1124:3: lv_temperatureSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS2223);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCTS2237); 

                        	newLeafNode(otherlv_8, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1144:3: (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1144:5: otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCTS2252); 

                        	newLeafNode(otherlv_9, grammarAccess.getCTSAccess().getCtsActuatorsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2264); 

                        	newLeafNode(otherlv_10, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1152:1: ( (lv_ctsActuators_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1153:1: (lv_ctsActuators_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1153:1: (lv_ctsActuators_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1154:3: lv_ctsActuators_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS2285);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1170:2: (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1170:4: otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS2298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCTSAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1174:1: ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1175:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1175:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1176:3: lv_ctsActuators_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS2319);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCTS2333); 

                        	newLeafNode(otherlv_14, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCTS2347); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1208:1: entryRuleAccessControl returns [EObject current=null] : iv_ruleAccessControl= ruleAccessControl EOF ;
    public final EObject entryRuleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControl = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1209:2: (iv_ruleAccessControl= ruleAccessControl EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1210:2: iv_ruleAccessControl= ruleAccessControl EOF
            {
             newCompositeNode(grammarAccess.getAccessControlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_entryRuleAccessControl2383);
            iv_ruleAccessControl=ruleAccessControl();

            state._fsp--;

             current =iv_ruleAccessControl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessControl2393); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1217:1: ruleAccessControl returns [EObject current=null] : ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1220:28: ( ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1221:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1221:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1221:2: () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1221:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1222:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccessControlAccess().getAccessControlAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAccessControl2439); 

                	newLeafNode(otherlv_1, grammarAccess.getAccessControlAccess().getAccessControlKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2451); 

                	newLeafNode(otherlv_2, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1235:1: (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1235:3: otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAccessControl2464); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccessControlAccess().getAccessControlSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2476); 

                        	newLeafNode(otherlv_4, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1243:1: ( (lv_accessControlSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1244:1: (lv_accessControlSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1244:1: (lv_accessControlSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1245:3: lv_accessControlSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl2497);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1261:2: (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1261:4: otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl2510); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAccessControlAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1265:1: ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1266:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1266:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1267:3: lv_accessControlSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl2531);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccessControl2545); 

                        	newLeafNode(otherlv_8, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1287:3: (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1287:5: otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAccessControl2560); 

                        	newLeafNode(otherlv_9, grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2572); 

                        	newLeafNode(otherlv_10, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1295:1: ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1296:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1296:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1297:3: lv_accessControlDoorLockActuator_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl2593);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1313:2: (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1313:4: otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl2606); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAccessControlAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1317:1: ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1318:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1318:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1319:3: lv_accessControlDoorLockActuator_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl2627);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccessControl2641); 

                        	newLeafNode(otherlv_14, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccessControl2655); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1351:1: entryRuleCalendarSystem returns [EObject current=null] : iv_ruleCalendarSystem= ruleCalendarSystem EOF ;
    public final EObject entryRuleCalendarSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1352:2: (iv_ruleCalendarSystem= ruleCalendarSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1353:2: iv_ruleCalendarSystem= ruleCalendarSystem EOF
            {
             newCompositeNode(grammarAccess.getCalendarSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem2691);
            iv_ruleCalendarSystem=ruleCalendarSystem();

            state._fsp--;

             current =iv_ruleCalendarSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarSystem2701); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1360:1: ruleCalendarSystem returns [EObject current=null] : ( () otherlv_1= 'CalendarSystem' ) ;
    public final EObject ruleCalendarSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1363:28: ( ( () otherlv_1= 'CalendarSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1364:1: ( () otherlv_1= 'CalendarSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1364:1: ( () otherlv_1= 'CalendarSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1364:2: () otherlv_1= 'CalendarSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1364:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCalendarSystemAccess().getCalendarSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCalendarSystem2747); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1382:1: entryRuleMeetingScheduleSystem returns [EObject current=null] : iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF ;
    public final EObject entryRuleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingScheduleSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1383:2: (iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1384:2: iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF
            {
             newCompositeNode(grammarAccess.getMeetingScheduleSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem2783);
            iv_ruleMeetingScheduleSystem=ruleMeetingScheduleSystem();

            state._fsp--;

             current =iv_ruleMeetingScheduleSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeetingScheduleSystem2793); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1391:1: ruleMeetingScheduleSystem returns [EObject current=null] : ( () otherlv_1= 'MeetingScheduleSystem' ) ;
    public final EObject ruleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1394:28: ( ( () otherlv_1= 'MeetingScheduleSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1395:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1395:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1395:2: () otherlv_1= 'MeetingScheduleSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1395:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1396:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeetingScheduleSystemAccess().getMeetingScheduleSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMeetingScheduleSystem2839); 

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


    // $ANTLR start "entryRuleFloor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1413:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1414:2: (iv_ruleFloor= ruleFloor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1415:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloor_in_entryRuleFloor2875);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloor2885); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1422:1: ruleFloor returns [EObject current=null] : ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rooms' otherlv_5= '{' ( (lv_rooms_6_0= ruleRoom ) ) (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rooms_6_0 = null;

        EObject lv_rooms_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1425:28: ( ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rooms' otherlv_5= '{' ( (lv_rooms_6_0= ruleRoom ) ) (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1426:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rooms' otherlv_5= '{' ( (lv_rooms_6_0= ruleRoom ) ) (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1426:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rooms' otherlv_5= '{' ( (lv_rooms_6_0= ruleRoom ) ) (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1426:2: () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rooms' otherlv_5= '{' ( (lv_rooms_6_0= ruleRoom ) ) (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1426:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1427:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloorAccess().getFloorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFloor2931); 

                	newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1436:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1437:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1437:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1438:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFloor2952);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFloor2964); 

                	newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1458:1: (otherlv_4= 'rooms' otherlv_5= '{' ( (lv_rooms_6_0= ruleRoom ) ) (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )* otherlv_9= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1458:3: otherlv_4= 'rooms' otherlv_5= '{' ( (lv_rooms_6_0= ruleRoom ) ) (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFloor2977); 

                        	newLeafNode(otherlv_4, grammarAccess.getFloorAccess().getRoomsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFloor2989); 

                        	newLeafNode(otherlv_5, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1466:1: ( (lv_rooms_6_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1467:1: (lv_rooms_6_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1467:1: (lv_rooms_6_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1468:3: lv_rooms_6_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor3010);
                    lv_rooms_6_0=ruleRoom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	        }
                           		add(
                           			current, 
                           			"rooms",
                            		lv_rooms_6_0, 
                            		"Room");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:2: (otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==18) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:4: otherlv_7= ',' ( (lv_rooms_8_0= ruleRoom ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFloor3023); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFloorAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1488:1: ( (lv_rooms_8_0= ruleRoom ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1489:1: (lv_rooms_8_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1489:1: (lv_rooms_8_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1490:3: lv_rooms_8_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor3044);
                    	    lv_rooms_8_0=ruleRoom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rooms",
                    	            		lv_rooms_8_0, 
                    	            		"Room");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFloor3058); 

                        	newLeafNode(otherlv_9, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFloor3072); 

                	newLeafNode(otherlv_10, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleMotionSensor"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1522:1: entryRuleMotionSensor returns [EObject current=null] : iv_ruleMotionSensor= ruleMotionSensor EOF ;
    public final EObject entryRuleMotionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotionSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1523:2: (iv_ruleMotionSensor= ruleMotionSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1524:2: iv_ruleMotionSensor= ruleMotionSensor EOF
            {
             newCompositeNode(grammarAccess.getMotionSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3108);
            iv_ruleMotionSensor=ruleMotionSensor();

            state._fsp--;

             current =iv_ruleMotionSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMotionSensor3118); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1531:1: ruleMotionSensor returns [EObject current=null] : ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1534:28: ( ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1535:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1535:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1535:2: () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1535:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1536:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMotionSensorAccess().getMotionSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMotionSensor3164); 

                	newLeafNode(otherlv_1, grammarAccess.getMotionSensorAccess().getMotionSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1545:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==11) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1545:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMotionSensor3177); 

                        	newLeafNode(otherlv_2, grammarAccess.getMotionSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMotionSensor3189); 

                        	newLeafNode(otherlv_3, grammarAccess.getMotionSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMotionSensor3201); 

                        	newLeafNode(otherlv_4, grammarAccess.getMotionSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1557:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1558:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1558:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1559:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMotionSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMotionSensor3222);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMotionSensor3234); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1587:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1588:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1589:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3272);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor3282); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1596:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1599:28: ( ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1600:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1600:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1600:2: () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1600:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1601:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTemperatureSensor3328); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1610:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1610:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTemperatureSensor3341); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTemperatureSensor3353); 

                        	newLeafNode(otherlv_3, grammarAccess.getTemperatureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTemperatureSensor3365); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemperatureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1622:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1623:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1623:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1624:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemperatureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTemperatureSensor3386);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTemperatureSensor3398); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1652:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1653:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1654:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor3436);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor3446); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1661:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1664:28: ( ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1665:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1665:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1665:2: () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1665:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1666:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePressureSensor3492); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1675:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==11) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1675:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePressureSensor3505); 

                        	newLeafNode(otherlv_2, grammarAccess.getPressureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePressureSensor3517); 

                        	newLeafNode(otherlv_3, grammarAccess.getPressureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePressureSensor3529); 

                        	newLeafNode(otherlv_4, grammarAccess.getPressureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1687:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1688:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1688:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1689:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPressureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePressureSensor3550);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePressureSensor3562); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1717:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1718:2: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1719:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor3600);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTouchSensor3610); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1726:1: ruleTouchSensor returns [EObject current=null] : ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1729:28: ( ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1730:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1730:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1730:2: () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1730:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1731:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTouchSensorAccess().getTouchSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleTouchSensor3656); 

                	newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1740:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==11) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1740:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTouchSensor3669); 

                        	newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTouchSensor3681); 

                        	newLeafNode(otherlv_3, grammarAccess.getTouchSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTouchSensor3693); 

                        	newLeafNode(otherlv_4, grammarAccess.getTouchSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1752:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1753:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1753:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1754:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTouchSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTouchSensor3714);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTouchSensor3726); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1782:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1783:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1784:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor3764);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor3774); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1791:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1794:28: ( ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1795:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1795:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1795:2: () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1795:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1796:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLightSensor3820); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1805:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==11) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1805:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSensor3833); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLightSensor3845); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLightSensor3857); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1817:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1818:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1818:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1819:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSensor3878);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLightSensor3890); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1847:1: entryRuleSmokeSensor returns [EObject current=null] : iv_ruleSmokeSensor= ruleSmokeSensor EOF ;
    public final EObject entryRuleSmokeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmokeSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1848:2: (iv_ruleSmokeSensor= ruleSmokeSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1849:2: iv_ruleSmokeSensor= ruleSmokeSensor EOF
            {
             newCompositeNode(grammarAccess.getSmokeSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor3928);
            iv_ruleSmokeSensor=ruleSmokeSensor();

            state._fsp--;

             current =iv_ruleSmokeSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSmokeSensor3938); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1856:1: ruleSmokeSensor returns [EObject current=null] : ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1859:28: ( ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1860:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1860:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1860:2: () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1860:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1861:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSmokeSensorAccess().getSmokeSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSmokeSensor3984); 

                	newLeafNode(otherlv_1, grammarAccess.getSmokeSensorAccess().getSmokeSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1870:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1870:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSmokeSensor3997); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmokeSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSmokeSensor4009); 

                        	newLeafNode(otherlv_3, grammarAccess.getSmokeSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSmokeSensor4021); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmokeSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1882:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1883:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1883:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1884:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmokeSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSmokeSensor4042);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSmokeSensor4054); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1912:1: entryRuleCO2Sensor returns [EObject current=null] : iv_ruleCO2Sensor= ruleCO2Sensor EOF ;
    public final EObject entryRuleCO2Sensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCO2Sensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1913:2: (iv_ruleCO2Sensor= ruleCO2Sensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1914:2: iv_ruleCO2Sensor= ruleCO2Sensor EOF
            {
             newCompositeNode(grammarAccess.getCO2SensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4092);
            iv_ruleCO2Sensor=ruleCO2Sensor();

            state._fsp--;

             current =iv_ruleCO2Sensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCO2Sensor4102); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1921:1: ruleCO2Sensor returns [EObject current=null] : ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1924:28: ( ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1925:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1925:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1925:2: () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1925:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1926:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCO2SensorAccess().getCO2SensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCO2Sensor4148); 

                	newLeafNode(otherlv_1, grammarAccess.getCO2SensorAccess().getCO2SensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1935:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==11) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1935:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCO2Sensor4161); 

                        	newLeafNode(otherlv_2, grammarAccess.getCO2SensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCO2Sensor4173); 

                        	newLeafNode(otherlv_3, grammarAccess.getCO2SensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCO2Sensor4185); 

                        	newLeafNode(otherlv_4, grammarAccess.getCO2SensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1947:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1948:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1948:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1949:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCO2SensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCO2Sensor4206);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCO2Sensor4218); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1977:1: entryRuleInfraredLightSensor returns [EObject current=null] : iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF ;
    public final EObject entryRuleInfraredLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraredLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1978:2: (iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1979:2: iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF
            {
             newCompositeNode(grammarAccess.getInfraredLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4256);
            iv_ruleInfraredLightSensor=ruleInfraredLightSensor();

            state._fsp--;

             current =iv_ruleInfraredLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfraredLightSensor4266); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1986:1: ruleInfraredLightSensor returns [EObject current=null] : ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1989:28: ( ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1990:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1990:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1990:2: () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1990:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1991:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleInfraredLightSensor4312); 

                	newLeafNode(otherlv_1, grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2000:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==11) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2000:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInfraredLightSensor4325); 

                        	newLeafNode(otherlv_2, grammarAccess.getInfraredLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInfraredLightSensor4337); 

                        	newLeafNode(otherlv_3, grammarAccess.getInfraredLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInfraredLightSensor4349); 

                        	newLeafNode(otherlv_4, grammarAccess.getInfraredLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2012:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2013:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2013:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2014:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfraredLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInfraredLightSensor4370);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInfraredLightSensor4382); 

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


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2046:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2047:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2048:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4425);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4436); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2055:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2058:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2059:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2059:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2059:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2059:2: (kw= '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2060:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEInt4475); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4492); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2080:1: entryRuleLightSwitchActuator returns [EObject current=null] : iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF ;
    public final EObject entryRuleLightSwitchActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSwitchActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2081:2: (iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2082:2: iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF
            {
             newCompositeNode(grammarAccess.getLightSwitchActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator4537);
            iv_ruleLightSwitchActuator=ruleLightSwitchActuator();

            state._fsp--;

             current =iv_ruleLightSwitchActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSwitchActuator4547); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2089:1: ruleLightSwitchActuator returns [EObject current=null] : ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2092:28: ( ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2093:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2093:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2093:2: () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2093:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLightSwitchActuator4593); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2103:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==11) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2103:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSwitchActuator4606); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSwitchActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLightSwitchActuator4618); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSwitchActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLightSwitchActuator4630); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSwitchActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2115:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2116:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2116:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2117:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSwitchActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSwitchActuator4651);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLightSwitchActuator4663); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2145:1: entryRuleWindowActuator returns [EObject current=null] : iv_ruleWindowActuator= ruleWindowActuator EOF ;
    public final EObject entryRuleWindowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2146:2: (iv_ruleWindowActuator= ruleWindowActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2147:2: iv_ruleWindowActuator= ruleWindowActuator EOF
            {
             newCompositeNode(grammarAccess.getWindowActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator4701);
            iv_ruleWindowActuator=ruleWindowActuator();

            state._fsp--;

             current =iv_ruleWindowActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWindowActuator4711); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2154:1: ruleWindowActuator returns [EObject current=null] : ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2157:28: ( ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2158:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2158:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2158:2: () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2158:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2159:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWindowActuatorAccess().getWindowActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleWindowActuator4757); 

                	newLeafNode(otherlv_1, grammarAccess.getWindowActuatorAccess().getWindowActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2168:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==11) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2168:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWindowActuator4770); 

                        	newLeafNode(otherlv_2, grammarAccess.getWindowActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleWindowActuator4782); 

                        	newLeafNode(otherlv_3, grammarAccess.getWindowActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWindowActuator4794); 

                        	newLeafNode(otherlv_4, grammarAccess.getWindowActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2180:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2181:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2181:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2182:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getWindowActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWindowActuator4815);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWindowActuator4827); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2210:1: entryRuleHumidifierActuator returns [EObject current=null] : iv_ruleHumidifierActuator= ruleHumidifierActuator EOF ;
    public final EObject entryRuleHumidifierActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumidifierActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2211:2: (iv_ruleHumidifierActuator= ruleHumidifierActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2212:2: iv_ruleHumidifierActuator= ruleHumidifierActuator EOF
            {
             newCompositeNode(grammarAccess.getHumidifierActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator4865);
            iv_ruleHumidifierActuator=ruleHumidifierActuator();

            state._fsp--;

             current =iv_ruleHumidifierActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumidifierActuator4875); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2219:1: ruleHumidifierActuator returns [EObject current=null] : ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2222:28: ( ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2223:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2223:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2223:2: () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2223:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2224:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleHumidifierActuator4921); 

                	newLeafNode(otherlv_1, grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2233:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==11) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2233:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumidifierActuator4934); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumidifierActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleHumidifierActuator4946); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumidifierActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleHumidifierActuator4958); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumidifierActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2245:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2246:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2246:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2247:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumidifierActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumidifierActuator4979);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHumidifierActuator4991); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2275:1: entryRuleDoorActuator returns [EObject current=null] : iv_ruleDoorActuator= ruleDoorActuator EOF ;
    public final EObject entryRuleDoorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2276:2: (iv_ruleDoorActuator= ruleDoorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2277:2: iv_ruleDoorActuator= ruleDoorActuator EOF
            {
             newCompositeNode(grammarAccess.getDoorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5029);
            iv_ruleDoorActuator=ruleDoorActuator();

            state._fsp--;

             current =iv_ruleDoorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoorActuator5039); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2284:1: ruleDoorActuator returns [EObject current=null] : ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2287:28: ( ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2288:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2288:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2288:2: () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2288:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2289:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoorActuatorAccess().getDoorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDoorActuator5085); 

                	newLeafNode(otherlv_1, grammarAccess.getDoorActuatorAccess().getDoorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2298:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2298:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDoorActuator5098); 

                        	newLeafNode(otherlv_2, grammarAccess.getDoorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDoorActuator5110); 

                        	newLeafNode(otherlv_3, grammarAccess.getDoorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDoorActuator5122); 

                        	newLeafNode(otherlv_4, grammarAccess.getDoorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2310:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2311:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2311:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2312:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDoorActuator5143);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDoorActuator5155); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2340:1: entryRuleRadiatorActuator returns [EObject current=null] : iv_ruleRadiatorActuator= ruleRadiatorActuator EOF ;
    public final EObject entryRuleRadiatorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiatorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2341:2: (iv_ruleRadiatorActuator= ruleRadiatorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2342:2: iv_ruleRadiatorActuator= ruleRadiatorActuator EOF
            {
             newCompositeNode(grammarAccess.getRadiatorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5193);
            iv_ruleRadiatorActuator=ruleRadiatorActuator();

            state._fsp--;

             current =iv_ruleRadiatorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadiatorActuator5203); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2349:1: ruleRadiatorActuator returns [EObject current=null] : ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2352:28: ( ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2353:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2353:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2353:2: () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2353:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRadiatorActuator5249); 

                	newLeafNode(otherlv_1, grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2363:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==11) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2363:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRadiatorActuator5262); 

                        	newLeafNode(otherlv_2, grammarAccess.getRadiatorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRadiatorActuator5274); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadiatorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRadiatorActuator5286); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadiatorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2375:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2376:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2376:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2377:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRadiatorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRadiatorActuator5307);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRadiatorActuator5319); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2405:1: entryRuleAudioAlarmActuator returns [EObject current=null] : iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF ;
    public final EObject entryRuleAudioAlarmActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioAlarmActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2406:2: (iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2407:2: iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF
            {
             newCompositeNode(grammarAccess.getAudioAlarmActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator5357);
            iv_ruleAudioAlarmActuator=ruleAudioAlarmActuator();

            state._fsp--;

             current =iv_ruleAudioAlarmActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAudioAlarmActuator5367); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2414:1: ruleAudioAlarmActuator returns [EObject current=null] : ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2417:28: ( ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2418:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2418:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2418:2: () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2418:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2419:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAudioAlarmActuator5413); 

                	newLeafNode(otherlv_1, grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2428:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2428:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAudioAlarmActuator5426); 

                        	newLeafNode(otherlv_2, grammarAccess.getAudioAlarmActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAudioAlarmActuator5438); 

                        	newLeafNode(otherlv_3, grammarAccess.getAudioAlarmActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAudioAlarmActuator5450); 

                        	newLeafNode(otherlv_4, grammarAccess.getAudioAlarmActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2440:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2441:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2441:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2442:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAudioAlarmActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAudioAlarmActuator5471);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAudioAlarmActuator5483); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2472:1: entryRuleSensorComponent returns [EObject current=null] : iv_ruleSensorComponent= ruleSensorComponent EOF ;
    public final EObject entryRuleSensorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2473:2: (iv_ruleSensorComponent= ruleSensorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2474:2: iv_ruleSensorComponent= ruleSensorComponent EOF
            {
             newCompositeNode(grammarAccess.getSensorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent5523);
            iv_ruleSensorComponent=ruleSensorComponent();

            state._fsp--;

             current =iv_ruleSensorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorComponent5533); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2481:1: ruleSensorComponent returns [EObject current=null] : ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) ;
    public final EObject ruleSensorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2484:28: ( ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2485:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2485:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2485:2: () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2485:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2486:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorComponentAccess().getSensorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSensorComponent5579); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorComponentAccess().getSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2495:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2496:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2496:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2497:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSensorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorComponent5600);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2513:2: (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2513:4: otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )*
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSensorComponent5613); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2517:1: ( (lv_sensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2518:1: (lv_sensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2518:1: (lv_sensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2519:3: lv_sensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent5634);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2535:2: ( (lv_sensors_5_0= ruleSensor ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==33||(LA55_0>=35 && LA55_0<=41)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2536:1: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2536:1: (lv_sensors_5_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2537:3: lv_sensors_5_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent5655);
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
                    	    break loop55;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2561:1: entryRuleActuatorComponent returns [EObject current=null] : iv_ruleActuatorComponent= ruleActuatorComponent EOF ;
    public final EObject entryRuleActuatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2562:2: (iv_ruleActuatorComponent= ruleActuatorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2563:2: iv_ruleActuatorComponent= ruleActuatorComponent EOF
            {
             newCompositeNode(grammarAccess.getActuatorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent5694);
            iv_ruleActuatorComponent=ruleActuatorComponent();

            state._fsp--;

             current =iv_ruleActuatorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuatorComponent5704); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2570:1: ruleActuatorComponent returns [EObject current=null] : ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) ;
    public final EObject ruleActuatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2573:28: ( ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2574:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2574:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2574:2: () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2574:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2575:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorComponentAccess().getActuatorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleActuatorComponent5750); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorComponentAccess().getActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2584:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2585:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2585:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2586:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActuatorComponent5771);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2602:2: (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2602:4: otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )*
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleActuatorComponent5784); 

                        	newLeafNode(otherlv_3, grammarAccess.getActuatorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2606:1: ( (lv_actuators_4_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2607:1: (lv_actuators_4_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2607:1: (lv_actuators_4_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2608:3: lv_actuators_4_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent5805);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2624:2: ( (lv_actuators_5_0= ruleActuator ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=43 && LA57_0<=48)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2625:1: (lv_actuators_5_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2625:1: (lv_actuators_5_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2626:3: lv_actuators_5_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent5826);
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
                    	    break loop57;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2650:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2651:2: (iv_ruleConditions= ruleConditions EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2652:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_entryRuleConditions5865);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditions5875); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2659:1: ruleConditions returns [EObject current=null] : ( () otherlv_1= 'Conditions' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2662:28: ( ( () otherlv_1= 'Conditions' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2663:1: ( () otherlv_1= 'Conditions' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2663:1: ( () otherlv_1= 'Conditions' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2663:2: () otherlv_1= 'Conditions'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2663:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2664:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionsAccess().getConditionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleConditions5921); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2681:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2682:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2683:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean5958);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean5969); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2690:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2693:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2694:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2694:1: (kw= 'true' | kw= 'false' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==53) ) {
                alt59=1;
            }
            else if ( (LA59_0==54) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2695:2: kw= 'true'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEBoolean6007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2702:2: kw= 'false'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEBoolean6026); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModel140 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleModel152 = new BitSet(new long[]{0x0000000000217000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel174 = new BitSet(new long[]{0x0000000000217000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel195 = new BitSet(new long[]{0x0000000000217000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel220 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel241 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel266 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel287 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel312 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel333 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleModel348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_ruleActuator441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_ruleActuator468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_ruleActuator495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_ruleActuator522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_ruleActuator549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_ruleActuator576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_ruleSensor668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleSensor695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleSensor722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_ruleSensor749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleSensor776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_ruleSensor803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_ruleSensor830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_ruleSensor857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuilding_in_entryRuleBuilding1015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuilding1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBuilding1071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBuilding1092 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleBuilding1104 = new BitSet(new long[]{0x00000000E4801000L});
        public static final BitSet FOLLOW_ruleCTS_in_ruleBuilding1125 = new BitSet(new long[]{0x00000000E4001000L});
        public static final BitSet FOLLOW_ruleAccessControl_in_ruleBuilding1147 = new BitSet(new long[]{0x00000000E0001000L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_ruleBuilding1169 = new BitSet(new long[]{0x00000000C0001000L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1191 = new BitSet(new long[]{0x0000000080001000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1214 = new BitSet(new long[]{0x0000000080001000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1235 = new BitSet(new long[]{0x0000000080001000L});
        public static final BitSet FOLLOW_12_in_ruleBuilding1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom1286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoom1296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRoom1342 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1363 = new BitSet(new long[]{0x0000000000008800L});
        public static final BitSet FOLLOW_15_in_ruleRoom1376 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1399 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1422 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_11_in_ruleRoom1437 = new BitSet(new long[]{0x000A000000001000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom1459 = new BitSet(new long[]{0x000A000000001000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom1480 = new BitSet(new long[]{0x000A000000001000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom1505 = new BitSet(new long[]{0x0008000000001000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom1526 = new BitSet(new long[]{0x0008000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoom1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy1577 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePolicy1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePolicy1633 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePolicy1654 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePolicy1666 = new BitSet(new long[]{0x000003FA00080000L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy1688 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_rulePolicy1701 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy1722 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_rulePolicy1738 = new BitSet(new long[]{0x0001F80000100002L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1760 = new BitSet(new long[]{0x0000000000140002L});
        public static final BitSet FOLLOW_18_in_rulePolicy1773 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1794 = new BitSet(new long[]{0x0000000000140002L});
        public static final BitSet FOLLOW_20_in_rulePolicy1811 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulePolicy1823 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1844 = new BitSet(new long[]{0x0010000000001000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1865 = new BitSet(new long[]{0x0010000000001000L});
        public static final BitSet FOLLOW_12_in_rulePolicy1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleState1972 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1993 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleState2011 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleState2040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCTS_in_entryRuleCTS2075 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCTS2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCTS2131 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2143 = new BitSet(new long[]{0x0000000003001000L});
        public static final BitSet FOLLOW_24_in_ruleCTS2156 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2168 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS2189 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_18_in_ruleCTS2202 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS2223 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_12_in_ruleCTS2237 = new BitSet(new long[]{0x0000000002001000L});
        public static final BitSet FOLLOW_25_in_ruleCTS2252 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2264 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS2285 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_18_in_ruleCTS2298 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS2319 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_12_in_ruleCTS2333 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCTS2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessControl_in_entryRuleAccessControl2383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessControl2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAccessControl2439 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2451 = new BitSet(new long[]{0x0000000018001000L});
        public static final BitSet FOLLOW_27_in_ruleAccessControl2464 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2476 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl2497 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl2510 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl2531 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_12_in_ruleAccessControl2545 = new BitSet(new long[]{0x0000000010001000L});
        public static final BitSet FOLLOW_28_in_ruleAccessControl2560 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2572 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl2593 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl2606 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl2627 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_12_in_ruleAccessControl2641 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAccessControl2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem2691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarSystem2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCalendarSystem2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem2783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeetingScheduleSystem2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleMeetingScheduleSystem2839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloor_in_entryRuleFloor2875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloor2885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFloor2931 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFloor2952 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleFloor2964 = new BitSet(new long[]{0x0000000100001000L});
        public static final BitSet FOLLOW_32_in_ruleFloor2977 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleFloor2989 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor3010 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_18_in_ruleFloor3023 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor3044 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_12_in_ruleFloor3058 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFloor3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMotionSensor3118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleMotionSensor3164 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleMotionSensor3177 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMotionSensor3189 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMotionSensor3201 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMotionSensor3222 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMotionSensor3234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor3282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleTemperatureSensor3328 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTemperatureSensor3341 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTemperatureSensor3353 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTemperatureSensor3365 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTemperatureSensor3386 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTemperatureSensor3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor3436 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePressureSensor3492 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulePressureSensor3505 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulePressureSensor3517 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePressureSensor3529 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePressureSensor3550 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePressureSensor3562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor3600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTouchSensor3610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleTouchSensor3656 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTouchSensor3669 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTouchSensor3681 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTouchSensor3693 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTouchSensor3714 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTouchSensor3726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor3764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor3774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLightSensor3820 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSensor3833 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLightSensor3845 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLightSensor3857 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSensor3878 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLightSensor3890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor3928 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSmokeSensor3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSmokeSensor3984 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleSmokeSensor3997 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSmokeSensor4009 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSmokeSensor4021 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSmokeSensor4042 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSmokeSensor4054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCO2Sensor4102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleCO2Sensor4148 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleCO2Sensor4161 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCO2Sensor4173 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCO2Sensor4185 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCO2Sensor4206 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCO2Sensor4218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfraredLightSensor4266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleInfraredLightSensor4312 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleInfraredLightSensor4325 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInfraredLightSensor4337 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInfraredLightSensor4349 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInfraredLightSensor4370 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInfraredLightSensor4382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEInt4475 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator4537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSwitchActuator4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLightSwitchActuator4593 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSwitchActuator4606 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLightSwitchActuator4618 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLightSwitchActuator4630 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSwitchActuator4651 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLightSwitchActuator4663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator4701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWindowActuator4711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleWindowActuator4757 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleWindowActuator4770 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleWindowActuator4782 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleWindowActuator4794 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWindowActuator4815 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWindowActuator4827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator4865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumidifierActuator4875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleHumidifierActuator4921 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumidifierActuator4934 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleHumidifierActuator4946 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleHumidifierActuator4958 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumidifierActuator4979 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHumidifierActuator4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoorActuator5039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDoorActuator5085 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleDoorActuator5098 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleDoorActuator5110 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDoorActuator5122 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDoorActuator5143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDoorActuator5155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadiatorActuator5203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleRadiatorActuator5249 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleRadiatorActuator5262 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleRadiatorActuator5274 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRadiatorActuator5286 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRadiatorActuator5307 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRadiatorActuator5319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator5357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAudioAlarmActuator5367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAudioAlarmActuator5413 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAudioAlarmActuator5426 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAudioAlarmActuator5438 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAudioAlarmActuator5450 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAudioAlarmActuator5471 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAudioAlarmActuator5483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent5523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorComponent5533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleSensorComponent5579 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorComponent5600 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSensorComponent5613 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent5634 = new BitSet(new long[]{0x000003FA00000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent5655 = new BitSet(new long[]{0x000003FA00000002L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent5694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuatorComponent5704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleActuatorComponent5750 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActuatorComponent5771 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_50_in_ruleActuatorComponent5784 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent5805 = new BitSet(new long[]{0x0001F80000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent5826 = new BitSet(new long[]{0x0001F80000000002L});
        public static final BitSet FOLLOW_ruleConditions_in_entryRuleConditions5865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditions5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleConditions5921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean5958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean5969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEBoolean6007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEBoolean6026 = new BitSet(new long[]{0x0000000000000002L});
    }


}