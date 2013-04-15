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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'room-type'", "'}'", "'state'", "'='", "'policy'", "'uses sensors'", "','", "'uses actuators'", "'is specified by'", "'building'", "'floor'", "'room'", "'is of type'", "'CTS'", "'temperatureSensors'", "'ctsActuators'", "'AccessControl'", "'accessControlSensors'", "'accessControlDoorLockActuator'", "'CalendarSystem'", "'MeetingScheduleSystem'", "'MotionSensor'", "'valueState'", "'TemperatureSensor'", "'PressureSensor'", "'TouchSensor'", "'LightSensor'", "'SmokeSensor'", "'CO2Sensor'", "'InfraredLightSensor'", "'-'", "'LightSwitchActuator'", "'WindowActuator'", "'HumidifierActuator'", "'DoorActuator'", "'RadiatorActuator'", "'AudioAlarmActuator'", "'sensor '", "'is a '", "'actuator'", "'Conditions'", "'true'", "'false'"
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? (otherlv_7= 'room-type' ( (lv_predefinedRooms_8_0= ruleRoom ) ) ( (lv_predefinedRooms_9_0= ruleRoom ) )* )? ( ( (lv_buildings_10_0= ruleBuilding ) ) ( (lv_buildings_11_0= ruleBuilding ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_stateDefinition_3_0 = null;

        EObject lv_stateDefinition_4_0 = null;

        EObject lv_policyDefinition_5_0 = null;

        EObject lv_policyDefinition_6_0 = null;

        EObject lv_predefinedRooms_8_0 = null;

        EObject lv_predefinedRooms_9_0 = null;

        EObject lv_buildings_10_0 = null;

        EObject lv_buildings_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:79:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? (otherlv_7= 'room-type' ( (lv_predefinedRooms_8_0= ruleRoom ) ) ( (lv_predefinedRooms_9_0= ruleRoom ) )* )? ( ( (lv_buildings_10_0= ruleBuilding ) ) ( (lv_buildings_11_0= ruleBuilding ) )* )? otherlv_12= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? (otherlv_7= 'room-type' ( (lv_predefinedRooms_8_0= ruleRoom ) ) ( (lv_predefinedRooms_9_0= ruleRoom ) )* )? ( ( (lv_buildings_10_0= ruleBuilding ) ) ( (lv_buildings_11_0= ruleBuilding ) )* )? otherlv_12= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? (otherlv_7= 'room-type' ( (lv_predefinedRooms_8_0= ruleRoom ) ) ( (lv_predefinedRooms_9_0= ruleRoom ) )* )? ( ( (lv_buildings_10_0= ruleBuilding ) ) ( (lv_buildings_11_0= ruleBuilding ) )* )? otherlv_12= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:80:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_stateDefinition_3_0= ruleState ) ) ( (lv_stateDefinition_4_0= ruleState ) )* )? ( ( (lv_policyDefinition_5_0= rulePolicy ) ) ( (lv_policyDefinition_6_0= rulePolicy ) )* )? (otherlv_7= 'room-type' ( (lv_predefinedRooms_8_0= ruleRoom ) ) ( (lv_predefinedRooms_9_0= ruleRoom ) )* )? ( ( (lv_buildings_10_0= ruleBuilding ) ) ( (lv_buildings_11_0= ruleBuilding ) )* )? otherlv_12= '}'
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

            if ( (LA2_0==14) ) {
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

                        if ( (LA1_0==14) ) {
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:180:5: (otherlv_7= 'room-type' ( (lv_predefinedRooms_8_0= ruleRoom ) ) ( (lv_predefinedRooms_9_0= ruleRoom ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:180:7: otherlv_7= 'room-type' ( (lv_predefinedRooms_8_0= ruleRoom ) ) ( (lv_predefinedRooms_9_0= ruleRoom ) )*
                    {
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel257); 

                        	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRoomTypeKeyword_5_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:184:1: ( (lv_predefinedRooms_8_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:185:1: (lv_predefinedRooms_8_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:185:1: (lv_predefinedRooms_8_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:186:3: lv_predefinedRooms_8_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel278);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:202:2: ( (lv_predefinedRooms_9_0= ruleRoom ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:203:1: (lv_predefinedRooms_9_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:203:1: (lv_predefinedRooms_9_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:204:3: lv_predefinedRooms_9_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel299);
                    	    lv_predefinedRooms_9_0=ruleRoom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"predefinedRooms",
                    	            		lv_predefinedRooms_9_0, 
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:220:5: ( ( (lv_buildings_10_0= ruleBuilding ) ) ( (lv_buildings_11_0= ruleBuilding ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:220:6: ( (lv_buildings_10_0= ruleBuilding ) ) ( (lv_buildings_11_0= ruleBuilding ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:220:6: ( (lv_buildings_10_0= ruleBuilding ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:221:1: (lv_buildings_10_0= ruleBuilding )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:221:1: (lv_buildings_10_0= ruleBuilding )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:222:3: lv_buildings_10_0= ruleBuilding
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel324);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:238:2: ( (lv_buildings_11_0= ruleBuilding ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:239:1: (lv_buildings_11_0= ruleBuilding )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:239:1: (lv_buildings_11_0= ruleBuilding )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:240:3: lv_buildings_11_0= ruleBuilding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel345);
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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel360); 

                	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:268:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:269:2: (iv_ruleActuator= ruleActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:270:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator396);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator406); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:277:1: ruleActuator returns [EObject current=null] : (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:280:28: ( (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:281:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:281:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator )
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
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:282:5: this_LightSwitchActuator_0= ruleLightSwitchActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getLightSwitchActuatorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_ruleActuator453);
                    this_LightSwitchActuator_0=ruleLightSwitchActuator();

                    state._fsp--;

                     
                            current = this_LightSwitchActuator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:292:5: this_WindowActuator_1= ruleWindowActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getWindowActuatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_ruleActuator480);
                    this_WindowActuator_1=ruleWindowActuator();

                    state._fsp--;

                     
                            current = this_WindowActuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:302:5: this_HumidifierActuator_2= ruleHumidifierActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getHumidifierActuatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_ruleActuator507);
                    this_HumidifierActuator_2=ruleHumidifierActuator();

                    state._fsp--;

                     
                            current = this_HumidifierActuator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:312:5: this_DoorActuator_3= ruleDoorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getDoorActuatorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_ruleActuator534);
                    this_DoorActuator_3=ruleDoorActuator();

                    state._fsp--;

                     
                            current = this_DoorActuator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:322:5: this_RadiatorActuator_4= ruleRadiatorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getRadiatorActuatorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_ruleActuator561);
                    this_RadiatorActuator_4=ruleRadiatorActuator();

                    state._fsp--;

                     
                            current = this_RadiatorActuator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:332:5: this_AudioAlarmActuator_5= ruleAudioAlarmActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getAudioAlarmActuatorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_ruleActuator588);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:348:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:349:2: (iv_ruleSensor= ruleSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:350:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor623);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor633); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:357:1: ruleSensor returns [EObject current=null] : (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:360:28: ( (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:361:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:361:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor )
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
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:362:5: this_MotionSensor_0= ruleMotionSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getMotionSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_ruleSensor680);
                    this_MotionSensor_0=ruleMotionSensor();

                    state._fsp--;

                     
                            current = this_MotionSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:372:5: this_TemperatureSensor_1= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTemperatureSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleSensor707);
                    this_TemperatureSensor_1=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:382:5: this_PressureSensor_2= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getPressureSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleSensor734);
                    this_PressureSensor_2=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:392:5: this_TouchSensor_3= ruleTouchSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTouchSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_ruleSensor761);
                    this_TouchSensor_3=ruleTouchSensor();

                    state._fsp--;

                     
                            current = this_TouchSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:402:5: this_LightSensor_4= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleSensor788);
                    this_LightSensor_4=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:412:5: this_SmokeSensor_5= ruleSmokeSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getSmokeSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_ruleSensor815);
                    this_SmokeSensor_5=ruleSmokeSensor();

                    state._fsp--;

                     
                            current = this_SmokeSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:422:5: this_CO2Sensor_6= ruleCO2Sensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getCO2SensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_ruleSensor842);
                    this_CO2Sensor_6=ruleCO2Sensor();

                    state._fsp--;

                     
                            current = this_CO2Sensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:432:5: this_InfraredLightSensor_7= ruleInfraredLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getInfraredLightSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_ruleSensor869);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:448:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:449:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:450:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString905);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString916); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:457:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:460:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:461:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:461:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:461:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString956); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:469:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString982); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:484:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:485:2: (iv_ruleState= ruleState EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:486:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1027);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1037); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:493:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valueState_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:496:28: ( ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:497:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:497:1: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:497:2: () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ( (lv_valueState_3_0= '=' ) ) ruleEBoolean
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:497:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:498:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleState1083); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:507:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:508:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:508:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:509:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1104);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:525:2: ( (lv_valueState_3_0= '=' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:526:1: (lv_valueState_3_0= '=' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:526:1: (lv_valueState_3_0= '=' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:527:3: lv_valueState_3_0= '='
            {
            lv_valueState_3_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1122); 

                    newLeafNode(lv_valueState_3_0, grammarAccess.getStateAccess().getValueStateEqualsSignKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(current, "valueState", true, "=");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getStateAccess().getEBooleanParserRuleCall_4()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleState1151);
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:556:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:557:2: (iv_rulePolicy= rulePolicy EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:558:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePolicy_in_entryRulePolicy1186);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePolicy1196); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:565:1: rulePolicy returns [EObject current=null] : ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:568:28: ( ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:569:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:569:1: ( () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:569:2: () otherlv_1= 'policy' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'uses sensors' ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )? otherlv_7= 'uses actuators' ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )? (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:569:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:570:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPolicyAccess().getPolicyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePolicy1242); 

                	newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getPolicyKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:579:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:580:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:580:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:581:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPolicyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePolicy1263);
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePolicy1275); 

                	newLeafNode(otherlv_3, grammarAccess.getPolicyAccess().getUsesSensorsKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:601:1: ( ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33||(LA13_0>=35 && LA13_0<=41)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:601:2: ( (lv_usesSensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:601:2: ( (lv_usesSensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:602:1: (lv_usesSensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:602:1: (lv_usesSensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:603:3: lv_usesSensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy1297);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:619:2: (otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:619:4: otherlv_5= ',' ( (lv_usesSensors_6_0= ruleSensor ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePolicy1310); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:623:1: ( (lv_usesSensors_6_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:624:1: (lv_usesSensors_6_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:624:1: (lv_usesSensors_6_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:625:3: lv_usesSensors_6_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesSensorsSensorParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_rulePolicy1331);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePolicy1347); 

                	newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getUsesActuatorsKeyword_5());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:1: ( ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=43 && LA15_0<=48)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:2: ( (lv_uses_8_0= ruleActuator ) ) (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:645:2: ( (lv_uses_8_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:646:1: (lv_uses_8_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:646:1: (lv_uses_8_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:647:3: lv_uses_8_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1369);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:663:2: (otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:663:4: otherlv_9= ',' ( (lv_uses_10_0= ruleActuator ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePolicy1382); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:667:1: ( (lv_uses_10_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:668:1: (lv_uses_10_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:668:1: (lv_uses_10_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:669:3: lv_uses_10_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsesActuatorParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_rulePolicy1403);
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:685:6: (otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:685:8: otherlv_11= 'is specified by' otherlv_12= '{' ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )? otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePolicy1420); 

                        	newLeafNode(otherlv_11, grammarAccess.getPolicyAccess().getIsSpecifiedByKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePolicy1432); 

                        	newLeafNode(otherlv_12, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:693:1: ( ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==52) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:693:2: ( (lv_specifiedBy_13_0= ruleConditions ) ) ( (lv_specifiedBy_14_0= ruleConditions ) )*
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:693:2: ( (lv_specifiedBy_13_0= ruleConditions ) )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:694:1: (lv_specifiedBy_13_0= ruleConditions )
                            {
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:694:1: (lv_specifiedBy_13_0= ruleConditions )
                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:695:3: lv_specifiedBy_13_0= ruleConditions
                            {
                             
                            	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_7_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy1454);
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

                            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:711:2: ( (lv_specifiedBy_14_0= ruleConditions ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==52) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:712:1: (lv_specifiedBy_14_0= ruleConditions )
                            	    {
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:712:1: (lv_specifiedBy_14_0= ruleConditions )
                            	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:713:3: lv_specifiedBy_14_0= ruleConditions
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getSpecifiedByConditionsParserRuleCall_7_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConditions_in_rulePolicy1475);
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePolicy1490); 

                        	newLeafNode(otherlv_15, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7_3());
                        

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:741:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:742:2: (iv_ruleBuilding= ruleBuilding EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:743:2: iv_ruleBuilding= ruleBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_entryRuleBuilding1528);
            iv_ruleBuilding=ruleBuilding();

            state._fsp--;

             current =iv_ruleBuilding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuilding1538); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:750:1: ruleBuilding returns [EObject current=null] : ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:753:28: ( ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:754:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:754:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:754:2: () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_ctsSystem_4_0= ruleCTS ) )? ( (lv_accessControl_5_0= ruleAccessControl ) )? ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )? otherlv_10= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:754:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:755:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildingAccess().getBuildingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBuilding1584); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildingAccess().getBuildingKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:764:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:765:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:765:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:766:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBuilding1605);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBuilding1617); 

                	newLeafNode(otherlv_3, grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:786:1: ( (lv_ctsSystem_4_0= ruleCTS ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:787:1: (lv_ctsSystem_4_0= ruleCTS )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:787:1: (lv_ctsSystem_4_0= ruleCTS )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:788:3: lv_ctsSystem_4_0= ruleCTS
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCtsSystemCTSParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCTS_in_ruleBuilding1638);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:804:3: ( (lv_accessControl_5_0= ruleAccessControl ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:805:1: (lv_accessControl_5_0= ruleAccessControl )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:805:1: (lv_accessControl_5_0= ruleAccessControl )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:806:3: lv_accessControl_5_0= ruleAccessControl
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getAccessControlAccessControlParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_ruleBuilding1660);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:822:3: ( (lv_calendarSystem_6_0= ruleCalendarSystem ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:823:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:823:1: (lv_calendarSystem_6_0= ruleCalendarSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:824:3: lv_calendarSystem_6_0= ruleCalendarSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCalendarSystemCalendarSystemParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_ruleBuilding1682);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:840:3: ( (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:841:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:841:1: (lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:842:3: lv_meetingScheduleSystem_7_0= ruleMeetingScheduleSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getMeetingScheduleSystemMeetingScheduleSystemParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1704);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:858:3: ( ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:858:4: ( (lv_floors_8_0= ruleFloor ) ) ( (lv_floors_9_0= ruleFloor ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:858:4: ( (lv_floors_8_0= ruleFloor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:859:1: (lv_floors_8_0= ruleFloor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:859:1: (lv_floors_8_0= ruleFloor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:860:3: lv_floors_8_0= ruleFloor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1727);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:876:2: ( (lv_floors_9_0= ruleFloor ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==22) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:877:1: (lv_floors_9_0= ruleFloor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:877:1: (lv_floors_9_0= ruleFloor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:878:3: lv_floors_9_0= ruleFloor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1748);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBuilding1763); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:906:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:907:2: (iv_ruleFloor= ruleFloor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:908:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloor_in_entryRuleFloor1799);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloor1809); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:915:1: ruleFloor returns [EObject current=null] : ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:918:28: ( ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:919:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:919:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:919:2: () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )? otherlv_8= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:919:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:920:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloorAccess().getFloorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFloor1855); 

                	newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:929:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:930:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:930:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:931:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFloor1876);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFloor1888); 

                	newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:951:1: (otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:951:3: otherlv_4= 'room' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFloor1901); 

                        	newLeafNode(otherlv_4, grammarAccess.getFloorAccess().getRoomKeyword_4_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:955:1: ( (lv_rooms_5_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:956:1: (lv_rooms_5_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:956:1: (lv_rooms_5_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:957:3: lv_rooms_5_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor1922);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:973:2: (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:973:4: otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFloor1935); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getFloorAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:977:1: ( (lv_rooms_7_0= ruleRoom ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:978:1: (lv_rooms_7_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:978:1: (lv_rooms_7_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:979:3: lv_rooms_7_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor1956);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFloor1972); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1007:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1008:2: (iv_ruleRoom= ruleRoom EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1009:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoom_in_entryRuleRoom2008);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoom2018); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1016:1: ruleRoom returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1019:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1020:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1020:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1020:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1020:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1021:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoomAccess().getRoomAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1026:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1027:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1027:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1028:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom2073);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1044:2: (otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1044:4: otherlv_2= 'is of type' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRoom2086); 

                        	newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getIsOfTypeKeyword_2_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1048:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1049:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1049:1: ( ruleEString )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1050:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoomRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom2109);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1063:2: ( ( ruleEString ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1064:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1064:1: ( ruleEString )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1065:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoomRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_2_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom2132);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1078:5: (otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1078:7: otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}'
            {
            otherlv_5=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoom2148); 

                	newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3_0());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1082:1: ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1082:2: ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1082:2: ( (lv_declareSensor_6_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1083:1: (lv_declareSensor_6_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1083:1: (lv_declareSensor_6_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1084:3: lv_declareSensor_6_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom2170);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1100:2: ( (lv_declareSensor_7_0= ruleSensorComponent ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==49) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1101:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1101:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1102:3: lv_declareSensor_7_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom2191);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1118:5: ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1118:6: ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1118:6: ( (lv_declareActuator_8_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1119:1: (lv_declareActuator_8_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1119:1: (lv_declareActuator_8_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1120:3: lv_declareActuator_8_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_3_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom2216);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1136:2: ( (lv_declareActuator_9_0= ruleActuatorComponent ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==51) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1137:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1137:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1138:3: lv_declareActuator_9_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom2237);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoom2252); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1166:1: entryRuleCTS returns [EObject current=null] : iv_ruleCTS= ruleCTS EOF ;
    public final EObject entryRuleCTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTS = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1167:2: (iv_ruleCTS= ruleCTS EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1168:2: iv_ruleCTS= ruleCTS EOF
            {
             newCompositeNode(grammarAccess.getCTSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCTS_in_entryRuleCTS2289);
            iv_ruleCTS=ruleCTS();

            state._fsp--;

             current =iv_ruleCTS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCTS2299); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1175:1: ruleCTS returns [EObject current=null] : ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1178:28: ( ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1179:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1179:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1179:2: () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1179:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1180:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCTSAccess().getCTSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCTS2345); 

                	newLeafNode(otherlv_1, grammarAccess.getCTSAccess().getCTSKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2357); 

                	newLeafNode(otherlv_2, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1193:1: (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1193:3: otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCTS2370); 

                        	newLeafNode(otherlv_3, grammarAccess.getCTSAccess().getTemperatureSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2382); 

                        	newLeafNode(otherlv_4, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1201:1: ( (lv_temperatureSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1202:1: (lv_temperatureSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1202:1: (lv_temperatureSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1203:3: lv_temperatureSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS2403);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1219:2: (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==18) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1219:4: otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS2416); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCTSAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1223:1: ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1224:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1224:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1225:3: lv_temperatureSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS2437);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS2451); 

                        	newLeafNode(otherlv_8, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1245:3: (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1245:5: otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCTS2466); 

                        	newLeafNode(otherlv_9, grammarAccess.getCTSAccess().getCtsActuatorsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2478); 

                        	newLeafNode(otherlv_10, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1253:1: ( (lv_ctsActuators_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1254:1: (lv_ctsActuators_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1254:1: (lv_ctsActuators_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1255:3: lv_ctsActuators_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS2499);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1271:2: (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==18) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1271:4: otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS2512); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCTSAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1275:1: ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1276:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1276:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1277:3: lv_ctsActuators_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS2533);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS2547); 

                        	newLeafNode(otherlv_14, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCTS2561); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1309:1: entryRuleAccessControl returns [EObject current=null] : iv_ruleAccessControl= ruleAccessControl EOF ;
    public final EObject entryRuleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControl = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1310:2: (iv_ruleAccessControl= ruleAccessControl EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1311:2: iv_ruleAccessControl= ruleAccessControl EOF
            {
             newCompositeNode(grammarAccess.getAccessControlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_entryRuleAccessControl2597);
            iv_ruleAccessControl=ruleAccessControl();

            state._fsp--;

             current =iv_ruleAccessControl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessControl2607); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1318:1: ruleAccessControl returns [EObject current=null] : ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1321:28: ( ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1322:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1322:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1322:2: () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1322:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1323:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccessControlAccess().getAccessControlAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAccessControl2653); 

                	newLeafNode(otherlv_1, grammarAccess.getAccessControlAccess().getAccessControlKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2665); 

                	newLeafNode(otherlv_2, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1336:1: (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1336:3: otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAccessControl2678); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccessControlAccess().getAccessControlSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2690); 

                        	newLeafNode(otherlv_4, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1344:1: ( (lv_accessControlSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1345:1: (lv_accessControlSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1345:1: (lv_accessControlSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1346:3: lv_accessControlSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl2711);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1362:2: (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==18) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1362:4: otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl2724); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAccessControlAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1366:1: ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1367:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1367:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1368:3: lv_accessControlSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl2745);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl2759); 

                        	newLeafNode(otherlv_8, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1388:3: (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1388:5: otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAccessControl2774); 

                        	newLeafNode(otherlv_9, grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2786); 

                        	newLeafNode(otherlv_10, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1396:1: ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1397:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1397:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1398:3: lv_accessControlDoorLockActuator_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl2807);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1414:2: (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==18) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1414:4: otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAccessControl2820); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAccessControlAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1418:1: ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1419:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1419:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1420:3: lv_accessControlDoorLockActuator_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl2841);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl2855); 

                        	newLeafNode(otherlv_14, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAccessControl2869); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1452:1: entryRuleCalendarSystem returns [EObject current=null] : iv_ruleCalendarSystem= ruleCalendarSystem EOF ;
    public final EObject entryRuleCalendarSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1453:2: (iv_ruleCalendarSystem= ruleCalendarSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1454:2: iv_ruleCalendarSystem= ruleCalendarSystem EOF
            {
             newCompositeNode(grammarAccess.getCalendarSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem2905);
            iv_ruleCalendarSystem=ruleCalendarSystem();

            state._fsp--;

             current =iv_ruleCalendarSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarSystem2915); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1461:1: ruleCalendarSystem returns [EObject current=null] : ( () otherlv_1= 'CalendarSystem' ) ;
    public final EObject ruleCalendarSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1464:28: ( ( () otherlv_1= 'CalendarSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1465:1: ( () otherlv_1= 'CalendarSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1465:1: ( () otherlv_1= 'CalendarSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1465:2: () otherlv_1= 'CalendarSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1465:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1466:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCalendarSystemAccess().getCalendarSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCalendarSystem2961); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1483:1: entryRuleMeetingScheduleSystem returns [EObject current=null] : iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF ;
    public final EObject entryRuleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingScheduleSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1484:2: (iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1485:2: iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF
            {
             newCompositeNode(grammarAccess.getMeetingScheduleSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem2997);
            iv_ruleMeetingScheduleSystem=ruleMeetingScheduleSystem();

            state._fsp--;

             current =iv_ruleMeetingScheduleSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3007); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1492:1: ruleMeetingScheduleSystem returns [EObject current=null] : ( () otherlv_1= 'MeetingScheduleSystem' ) ;
    public final EObject ruleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1495:28: ( ( () otherlv_1= 'MeetingScheduleSystem' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1496:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1496:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1496:2: () otherlv_1= 'MeetingScheduleSystem'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1496:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1497:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeetingScheduleSystemAccess().getMeetingScheduleSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMeetingScheduleSystem3053); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1514:1: entryRuleMotionSensor returns [EObject current=null] : iv_ruleMotionSensor= ruleMotionSensor EOF ;
    public final EObject entryRuleMotionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotionSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1515:2: (iv_ruleMotionSensor= ruleMotionSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1516:2: iv_ruleMotionSensor= ruleMotionSensor EOF
            {
             newCompositeNode(grammarAccess.getMotionSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3089);
            iv_ruleMotionSensor=ruleMotionSensor();

            state._fsp--;

             current =iv_ruleMotionSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMotionSensor3099); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1523:1: ruleMotionSensor returns [EObject current=null] : ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1526:28: ( ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1527:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1527:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1527:2: () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1527:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1528:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMotionSensorAccess().getMotionSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMotionSensor3145); 

                	newLeafNode(otherlv_1, grammarAccess.getMotionSensorAccess().getMotionSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1537:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1537:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMotionSensor3158); 

                        	newLeafNode(otherlv_2, grammarAccess.getMotionSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMotionSensor3170); 

                        	newLeafNode(otherlv_3, grammarAccess.getMotionSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMotionSensor3182); 

                        	newLeafNode(otherlv_4, grammarAccess.getMotionSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1549:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1550:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1550:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1551:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMotionSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMotionSensor3203);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMotionSensor3215); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1579:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1580:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1581:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3253);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor3263); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1588:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1591:28: ( ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1592:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1592:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1592:2: () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1592:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1593:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTemperatureSensor3309); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1602:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==11) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1602:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTemperatureSensor3322); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTemperatureSensor3334); 

                        	newLeafNode(otherlv_3, grammarAccess.getTemperatureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTemperatureSensor3346); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemperatureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1614:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1615:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1615:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1616:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemperatureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTemperatureSensor3367);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTemperatureSensor3379); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1644:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1645:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1646:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor3417);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor3427); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1653:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1656:28: ( ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1657:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1657:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1657:2: () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1657:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1658:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePressureSensor3473); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1667:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==11) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1667:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePressureSensor3486); 

                        	newLeafNode(otherlv_2, grammarAccess.getPressureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePressureSensor3498); 

                        	newLeafNode(otherlv_3, grammarAccess.getPressureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePressureSensor3510); 

                        	newLeafNode(otherlv_4, grammarAccess.getPressureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1679:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1680:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1680:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1681:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPressureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePressureSensor3531);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePressureSensor3543); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1709:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1710:2: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1711:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor3581);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTouchSensor3591); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1718:1: ruleTouchSensor returns [EObject current=null] : ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1721:28: ( ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1722:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1722:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1722:2: () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1722:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1723:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTouchSensorAccess().getTouchSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleTouchSensor3637); 

                	newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1732:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==11) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1732:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTouchSensor3650); 

                        	newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTouchSensor3662); 

                        	newLeafNode(otherlv_3, grammarAccess.getTouchSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTouchSensor3674); 

                        	newLeafNode(otherlv_4, grammarAccess.getTouchSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1744:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1745:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1745:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1746:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTouchSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTouchSensor3695);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTouchSensor3707); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1774:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1775:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1776:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor3745);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor3755); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1783:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1786:28: ( ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1787:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1787:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1787:2: () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1787:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1788:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLightSensor3801); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1797:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1797:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSensor3814); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLightSensor3826); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLightSensor3838); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1809:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1810:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1810:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1811:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSensor3859);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSensor3871); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1839:1: entryRuleSmokeSensor returns [EObject current=null] : iv_ruleSmokeSensor= ruleSmokeSensor EOF ;
    public final EObject entryRuleSmokeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmokeSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1840:2: (iv_ruleSmokeSensor= ruleSmokeSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1841:2: iv_ruleSmokeSensor= ruleSmokeSensor EOF
            {
             newCompositeNode(grammarAccess.getSmokeSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor3909);
            iv_ruleSmokeSensor=ruleSmokeSensor();

            state._fsp--;

             current =iv_ruleSmokeSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSmokeSensor3919); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1848:1: ruleSmokeSensor returns [EObject current=null] : ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1851:28: ( ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1852:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1852:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1852:2: () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1852:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1853:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSmokeSensorAccess().getSmokeSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSmokeSensor3965); 

                	newLeafNode(otherlv_1, grammarAccess.getSmokeSensorAccess().getSmokeSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1862:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==11) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1862:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSmokeSensor3978); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmokeSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSmokeSensor3990); 

                        	newLeafNode(otherlv_3, grammarAccess.getSmokeSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSmokeSensor4002); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmokeSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1874:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1875:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1875:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1876:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmokeSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSmokeSensor4023);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSmokeSensor4035); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1904:1: entryRuleCO2Sensor returns [EObject current=null] : iv_ruleCO2Sensor= ruleCO2Sensor EOF ;
    public final EObject entryRuleCO2Sensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCO2Sensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1905:2: (iv_ruleCO2Sensor= ruleCO2Sensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1906:2: iv_ruleCO2Sensor= ruleCO2Sensor EOF
            {
             newCompositeNode(grammarAccess.getCO2SensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4073);
            iv_ruleCO2Sensor=ruleCO2Sensor();

            state._fsp--;

             current =iv_ruleCO2Sensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCO2Sensor4083); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1913:1: ruleCO2Sensor returns [EObject current=null] : ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1916:28: ( ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1917:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1917:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1917:2: () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1917:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1918:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCO2SensorAccess().getCO2SensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCO2Sensor4129); 

                	newLeafNode(otherlv_1, grammarAccess.getCO2SensorAccess().getCO2SensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1927:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==11) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1927:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCO2Sensor4142); 

                        	newLeafNode(otherlv_2, grammarAccess.getCO2SensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCO2Sensor4154); 

                        	newLeafNode(otherlv_3, grammarAccess.getCO2SensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCO2Sensor4166); 

                        	newLeafNode(otherlv_4, grammarAccess.getCO2SensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1939:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1940:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1940:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1941:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCO2SensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCO2Sensor4187);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCO2Sensor4199); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1969:1: entryRuleInfraredLightSensor returns [EObject current=null] : iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF ;
    public final EObject entryRuleInfraredLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraredLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1970:2: (iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1971:2: iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF
            {
             newCompositeNode(grammarAccess.getInfraredLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4237);
            iv_ruleInfraredLightSensor=ruleInfraredLightSensor();

            state._fsp--;

             current =iv_ruleInfraredLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfraredLightSensor4247); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1978:1: ruleInfraredLightSensor returns [EObject current=null] : ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1981:28: ( ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1982:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1982:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1982:2: () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1982:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1983:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleInfraredLightSensor4293); 

                	newLeafNode(otherlv_1, grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1992:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:1992:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInfraredLightSensor4306); 

                        	newLeafNode(otherlv_2, grammarAccess.getInfraredLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInfraredLightSensor4318); 

                        	newLeafNode(otherlv_3, grammarAccess.getInfraredLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInfraredLightSensor4330); 

                        	newLeafNode(otherlv_4, grammarAccess.getInfraredLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2004:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2005:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2005:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2006:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfraredLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInfraredLightSensor4351);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInfraredLightSensor4363); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2038:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2039:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2040:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4406);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4417); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2047:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2050:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2051:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2051:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2051:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2051:2: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2052:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEInt4456); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4473); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2072:1: entryRuleLightSwitchActuator returns [EObject current=null] : iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF ;
    public final EObject entryRuleLightSwitchActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSwitchActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2073:2: (iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2074:2: iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF
            {
             newCompositeNode(grammarAccess.getLightSwitchActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator4518);
            iv_ruleLightSwitchActuator=ruleLightSwitchActuator();

            state._fsp--;

             current =iv_ruleLightSwitchActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSwitchActuator4528); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2081:1: ruleLightSwitchActuator returns [EObject current=null] : ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2084:28: ( ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2085:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2085:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2085:2: () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2085:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2086:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLightSwitchActuator4574); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2095:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==11) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2095:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSwitchActuator4587); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSwitchActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLightSwitchActuator4599); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSwitchActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLightSwitchActuator4611); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSwitchActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2107:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2108:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2108:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2109:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSwitchActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSwitchActuator4632);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLightSwitchActuator4644); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2137:1: entryRuleWindowActuator returns [EObject current=null] : iv_ruleWindowActuator= ruleWindowActuator EOF ;
    public final EObject entryRuleWindowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2138:2: (iv_ruleWindowActuator= ruleWindowActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2139:2: iv_ruleWindowActuator= ruleWindowActuator EOF
            {
             newCompositeNode(grammarAccess.getWindowActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator4682);
            iv_ruleWindowActuator=ruleWindowActuator();

            state._fsp--;

             current =iv_ruleWindowActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWindowActuator4692); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2146:1: ruleWindowActuator returns [EObject current=null] : ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2149:28: ( ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2150:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2150:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2150:2: () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2150:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2151:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWindowActuatorAccess().getWindowActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleWindowActuator4738); 

                	newLeafNode(otherlv_1, grammarAccess.getWindowActuatorAccess().getWindowActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2160:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==11) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2160:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWindowActuator4751); 

                        	newLeafNode(otherlv_2, grammarAccess.getWindowActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleWindowActuator4763); 

                        	newLeafNode(otherlv_3, grammarAccess.getWindowActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWindowActuator4775); 

                        	newLeafNode(otherlv_4, grammarAccess.getWindowActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2172:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2173:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2173:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2174:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getWindowActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWindowActuator4796);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWindowActuator4808); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2202:1: entryRuleHumidifierActuator returns [EObject current=null] : iv_ruleHumidifierActuator= ruleHumidifierActuator EOF ;
    public final EObject entryRuleHumidifierActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumidifierActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2203:2: (iv_ruleHumidifierActuator= ruleHumidifierActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2204:2: iv_ruleHumidifierActuator= ruleHumidifierActuator EOF
            {
             newCompositeNode(grammarAccess.getHumidifierActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator4846);
            iv_ruleHumidifierActuator=ruleHumidifierActuator();

            state._fsp--;

             current =iv_ruleHumidifierActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumidifierActuator4856); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2211:1: ruleHumidifierActuator returns [EObject current=null] : ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2214:28: ( ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2215:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2215:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2215:2: () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2215:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleHumidifierActuator4902); 

                	newLeafNode(otherlv_1, grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2225:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2225:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumidifierActuator4915); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumidifierActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleHumidifierActuator4927); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumidifierActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHumidifierActuator4939); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumidifierActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2237:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2238:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2238:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2239:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumidifierActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumidifierActuator4960);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHumidifierActuator4972); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2267:1: entryRuleDoorActuator returns [EObject current=null] : iv_ruleDoorActuator= ruleDoorActuator EOF ;
    public final EObject entryRuleDoorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2268:2: (iv_ruleDoorActuator= ruleDoorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2269:2: iv_ruleDoorActuator= ruleDoorActuator EOF
            {
             newCompositeNode(grammarAccess.getDoorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5010);
            iv_ruleDoorActuator=ruleDoorActuator();

            state._fsp--;

             current =iv_ruleDoorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoorActuator5020); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2276:1: ruleDoorActuator returns [EObject current=null] : ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2279:28: ( ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2280:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2280:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2280:2: () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2280:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2281:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoorActuatorAccess().getDoorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDoorActuator5066); 

                	newLeafNode(otherlv_1, grammarAccess.getDoorActuatorAccess().getDoorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2290:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==11) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2290:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDoorActuator5079); 

                        	newLeafNode(otherlv_2, grammarAccess.getDoorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDoorActuator5091); 

                        	newLeafNode(otherlv_3, grammarAccess.getDoorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDoorActuator5103); 

                        	newLeafNode(otherlv_4, grammarAccess.getDoorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2302:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2303:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2303:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2304:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDoorActuator5124);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDoorActuator5136); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2332:1: entryRuleRadiatorActuator returns [EObject current=null] : iv_ruleRadiatorActuator= ruleRadiatorActuator EOF ;
    public final EObject entryRuleRadiatorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiatorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2333:2: (iv_ruleRadiatorActuator= ruleRadiatorActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2334:2: iv_ruleRadiatorActuator= ruleRadiatorActuator EOF
            {
             newCompositeNode(grammarAccess.getRadiatorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5174);
            iv_ruleRadiatorActuator=ruleRadiatorActuator();

            state._fsp--;

             current =iv_ruleRadiatorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadiatorActuator5184); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2341:1: ruleRadiatorActuator returns [EObject current=null] : ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2344:28: ( ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2345:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2345:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2345:2: () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2345:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2346:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRadiatorActuator5230); 

                	newLeafNode(otherlv_1, grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2355:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2355:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRadiatorActuator5243); 

                        	newLeafNode(otherlv_2, grammarAccess.getRadiatorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRadiatorActuator5255); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadiatorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRadiatorActuator5267); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadiatorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2367:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2368:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2368:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2369:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRadiatorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRadiatorActuator5288);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRadiatorActuator5300); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2397:1: entryRuleAudioAlarmActuator returns [EObject current=null] : iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF ;
    public final EObject entryRuleAudioAlarmActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioAlarmActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2398:2: (iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2399:2: iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF
            {
             newCompositeNode(grammarAccess.getAudioAlarmActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator5338);
            iv_ruleAudioAlarmActuator=ruleAudioAlarmActuator();

            state._fsp--;

             current =iv_ruleAudioAlarmActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAudioAlarmActuator5348); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2406:1: ruleAudioAlarmActuator returns [EObject current=null] : ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2409:28: ( ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2410:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2410:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2410:2: () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2410:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2411:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAudioAlarmActuator5394); 

                	newLeafNode(otherlv_1, grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2420:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==11) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2420:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAudioAlarmActuator5407); 

                        	newLeafNode(otherlv_2, grammarAccess.getAudioAlarmActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAudioAlarmActuator5419); 

                        	newLeafNode(otherlv_3, grammarAccess.getAudioAlarmActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAudioAlarmActuator5431); 

                        	newLeafNode(otherlv_4, grammarAccess.getAudioAlarmActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2432:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2433:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2433:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2434:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAudioAlarmActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAudioAlarmActuator5452);
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

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAudioAlarmActuator5464); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2464:1: entryRuleSensorComponent returns [EObject current=null] : iv_ruleSensorComponent= ruleSensorComponent EOF ;
    public final EObject entryRuleSensorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2465:2: (iv_ruleSensorComponent= ruleSensorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2466:2: iv_ruleSensorComponent= ruleSensorComponent EOF
            {
             newCompositeNode(grammarAccess.getSensorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent5504);
            iv_ruleSensorComponent=ruleSensorComponent();

            state._fsp--;

             current =iv_ruleSensorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorComponent5514); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2473:1: ruleSensorComponent returns [EObject current=null] : ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) ;
    public final EObject ruleSensorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2476:28: ( ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2477:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2477:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2477:2: () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2477:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2478:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorComponentAccess().getSensorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSensorComponent5560); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorComponentAccess().getSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2487:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2488:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2488:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2489:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSensorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorComponent5581);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2505:2: (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2505:4: otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )*
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSensorComponent5594); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2509:1: ( (lv_sensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2510:1: (lv_sensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2510:1: (lv_sensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2511:3: lv_sensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent5615);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2527:2: ( (lv_sensors_5_0= ruleSensor ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==33||(LA56_0>=35 && LA56_0<=41)) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2528:1: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2528:1: (lv_sensors_5_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2529:3: lv_sensors_5_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent5636);
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
                    	    break loop56;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2553:1: entryRuleActuatorComponent returns [EObject current=null] : iv_ruleActuatorComponent= ruleActuatorComponent EOF ;
    public final EObject entryRuleActuatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2554:2: (iv_ruleActuatorComponent= ruleActuatorComponent EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2555:2: iv_ruleActuatorComponent= ruleActuatorComponent EOF
            {
             newCompositeNode(grammarAccess.getActuatorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent5675);
            iv_ruleActuatorComponent=ruleActuatorComponent();

            state._fsp--;

             current =iv_ruleActuatorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuatorComponent5685); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2562:1: ruleActuatorComponent returns [EObject current=null] : ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) ;
    public final EObject ruleActuatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2565:28: ( ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2566:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2566:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2566:2: () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2566:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2567:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorComponentAccess().getActuatorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleActuatorComponent5731); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorComponentAccess().getActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2576:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2577:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2577:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2578:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActuatorComponent5752);
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

            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2594:2: (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==50) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2594:4: otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )*
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleActuatorComponent5765); 

                        	newLeafNode(otherlv_3, grammarAccess.getActuatorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2598:1: ( (lv_actuators_4_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2599:1: (lv_actuators_4_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2599:1: (lv_actuators_4_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2600:3: lv_actuators_4_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent5786);
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

                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2616:2: ( (lv_actuators_5_0= ruleActuator ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=43 && LA58_0<=48)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2617:1: (lv_actuators_5_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2617:1: (lv_actuators_5_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2618:3: lv_actuators_5_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent5807);
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
                    	    break loop58;
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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2642:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2643:2: (iv_ruleConditions= ruleConditions EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2644:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditions_in_entryRuleConditions5846);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditions5856); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2651:1: ruleConditions returns [EObject current=null] : ( () otherlv_1= 'Conditions' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2654:28: ( ( () otherlv_1= 'Conditions' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2655:1: ( () otherlv_1= 'Conditions' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2655:1: ( () otherlv_1= 'Conditions' )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2655:2: () otherlv_1= 'Conditions'
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2655:2: ()
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2656:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionsAccess().getConditionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleConditions5902); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2673:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2674:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2675:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean5939);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean5950); 

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
    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2682:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2685:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2686:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2686:1: (kw= 'true' | kw= 'false' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==53) ) {
                alt60=1;
            }
            else if ( (LA60_0==54) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2687:2: kw= 'true'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEBoolean5988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.dsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPolicyEngineDsl.g:2694:2: kw= 'false'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEBoolean6007); 

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
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel220 = new BitSet(new long[]{0x0000000000213000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleModel241 = new BitSet(new long[]{0x0000000000213000L});
        public static final BitSet FOLLOW_12_in_ruleModel257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel278 = new BitSet(new long[]{0x0000000000202030L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel299 = new BitSet(new long[]{0x0000000000202030L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel324 = new BitSet(new long[]{0x0000000000202000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel345 = new BitSet(new long[]{0x0000000000202000L});
        public static final BitSet FOLLOW_13_in_ruleModel360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_ruleActuator453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_ruleActuator480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_ruleActuator507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_ruleActuator534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_ruleActuator561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_ruleActuator588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_ruleSensor680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleSensor707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleSensor734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_ruleSensor761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleSensor788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_ruleSensor815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_ruleSensor842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_ruleSensor869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleState1083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1104 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleState1122 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleState1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy1186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePolicy1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePolicy1242 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePolicy1263 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePolicy1275 = new BitSet(new long[]{0x000003FA00080000L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy1297 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_rulePolicy1310 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_rulePolicy1331 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_rulePolicy1347 = new BitSet(new long[]{0x0001F80000100002L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1369 = new BitSet(new long[]{0x0000000000140002L});
        public static final BitSet FOLLOW_18_in_rulePolicy1382 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_rulePolicy1403 = new BitSet(new long[]{0x0000000000140002L});
        public static final BitSet FOLLOW_20_in_rulePolicy1420 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulePolicy1432 = new BitSet(new long[]{0x0010000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1454 = new BitSet(new long[]{0x0010000000002000L});
        public static final BitSet FOLLOW_ruleConditions_in_rulePolicy1475 = new BitSet(new long[]{0x0010000000002000L});
        public static final BitSet FOLLOW_13_in_rulePolicy1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuilding_in_entryRuleBuilding1528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuilding1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleBuilding1584 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBuilding1605 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleBuilding1617 = new BitSet(new long[]{0x0000000192402000L});
        public static final BitSet FOLLOW_ruleCTS_in_ruleBuilding1638 = new BitSet(new long[]{0x0000000190402000L});
        public static final BitSet FOLLOW_ruleAccessControl_in_ruleBuilding1660 = new BitSet(new long[]{0x0000000180402000L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_ruleBuilding1682 = new BitSet(new long[]{0x0000000100402000L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1704 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1727 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1748 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_13_in_ruleBuilding1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloor_in_entryRuleFloor1799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloor1809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFloor1855 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFloor1876 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleFloor1888 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_23_in_ruleFloor1901 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor1922 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleFloor1935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor1956 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleFloor1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom2008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoom2018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom2073 = new BitSet(new long[]{0x0000000001000800L});
        public static final BitSet FOLLOW_24_in_ruleRoom2086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom2109 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom2132 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_11_in_ruleRoom2148 = new BitSet(new long[]{0x000A000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom2170 = new BitSet(new long[]{0x000A000000002000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom2191 = new BitSet(new long[]{0x000A000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom2216 = new BitSet(new long[]{0x0008000000002000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom2237 = new BitSet(new long[]{0x0008000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRoom2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCTS_in_entryRuleCTS2289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCTS2299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleCTS2345 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2357 = new BitSet(new long[]{0x000000000C002000L});
        public static final BitSet FOLLOW_26_in_ruleCTS2370 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2382 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS2403 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleCTS2416 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS2437 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleCTS2451 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleCTS2466 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2478 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS2499 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleCTS2512 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS2533 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleCTS2547 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCTS2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessControl_in_entryRuleAccessControl2597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessControl2607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAccessControl2653 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2665 = new BitSet(new long[]{0x0000000060002000L});
        public static final BitSet FOLLOW_29_in_ruleAccessControl2678 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2690 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl2711 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl2724 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl2745 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl2759 = new BitSet(new long[]{0x0000000040002000L});
        public static final BitSet FOLLOW_30_in_ruleAccessControl2774 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2786 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl2807 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleAccessControl2820 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl2841 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl2855 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAccessControl2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem2905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarSystem2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCalendarSystem2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem2997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeetingScheduleSystem3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleMeetingScheduleSystem3053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMotionSensor3099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleMotionSensor3145 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleMotionSensor3158 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMotionSensor3170 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMotionSensor3182 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMotionSensor3203 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMotionSensor3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleTemperatureSensor3309 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTemperatureSensor3322 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTemperatureSensor3334 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTemperatureSensor3346 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTemperatureSensor3367 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTemperatureSensor3379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor3417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor3427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePressureSensor3473 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulePressureSensor3486 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulePressureSensor3498 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePressureSensor3510 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePressureSensor3531 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePressureSensor3543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor3581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTouchSensor3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleTouchSensor3637 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTouchSensor3650 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTouchSensor3662 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTouchSensor3674 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTouchSensor3695 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTouchSensor3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor3745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor3755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLightSensor3801 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSensor3814 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLightSensor3826 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLightSensor3838 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSensor3859 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSensor3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor3909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSmokeSensor3919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSmokeSensor3965 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleSmokeSensor3978 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSmokeSensor3990 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSmokeSensor4002 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSmokeSensor4023 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSmokeSensor4035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4073 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCO2Sensor4083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleCO2Sensor4129 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleCO2Sensor4142 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCO2Sensor4154 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCO2Sensor4166 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCO2Sensor4187 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCO2Sensor4199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4237 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfraredLightSensor4247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleInfraredLightSensor4293 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleInfraredLightSensor4306 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInfraredLightSensor4318 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInfraredLightSensor4330 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInfraredLightSensor4351 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInfraredLightSensor4363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEInt4456 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator4518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSwitchActuator4528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLightSwitchActuator4574 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSwitchActuator4587 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLightSwitchActuator4599 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLightSwitchActuator4611 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSwitchActuator4632 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLightSwitchActuator4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator4682 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWindowActuator4692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleWindowActuator4738 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleWindowActuator4751 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleWindowActuator4763 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWindowActuator4775 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWindowActuator4796 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWindowActuator4808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator4846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumidifierActuator4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleHumidifierActuator4902 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumidifierActuator4915 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleHumidifierActuator4927 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHumidifierActuator4939 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumidifierActuator4960 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHumidifierActuator4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoorActuator5020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDoorActuator5066 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleDoorActuator5079 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleDoorActuator5091 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDoorActuator5103 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDoorActuator5124 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDoorActuator5136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadiatorActuator5184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleRadiatorActuator5230 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleRadiatorActuator5243 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleRadiatorActuator5255 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRadiatorActuator5267 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRadiatorActuator5288 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRadiatorActuator5300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator5338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAudioAlarmActuator5348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAudioAlarmActuator5394 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAudioAlarmActuator5407 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAudioAlarmActuator5419 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAudioAlarmActuator5431 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAudioAlarmActuator5452 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAudioAlarmActuator5464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent5504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorComponent5514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleSensorComponent5560 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorComponent5581 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSensorComponent5594 = new BitSet(new long[]{0x000003FA00000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent5615 = new BitSet(new long[]{0x000003FA00000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent5636 = new BitSet(new long[]{0x000003FA00000002L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent5675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuatorComponent5685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleActuatorComponent5731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActuatorComponent5752 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_50_in_ruleActuatorComponent5765 = new BitSet(new long[]{0x0001F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent5786 = new BitSet(new long[]{0x0001F80000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent5807 = new BitSet(new long[]{0x0001F80000000002L});
        public static final BitSet FOLLOW_ruleConditions_in_entryRuleConditions5846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditions5856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleConditions5902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean5939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean5950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEBoolean5988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEBoolean6007 = new BitSet(new long[]{0x0000000000000002L});
    }


}