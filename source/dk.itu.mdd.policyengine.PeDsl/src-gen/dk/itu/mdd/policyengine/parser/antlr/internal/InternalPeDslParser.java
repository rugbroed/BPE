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
import dk.itu.mdd.policyengine.services.PeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPeDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'building'", "'room'", "'is a '", "'State'", "'uses '", "'CTS'", "'temperatureSensors'", "','", "'ctsActuators'", "'AccessControl'", "'accessControlSensors'", "'accessControlDoorLockActuator'", "'CalendarSystem'", "'MeetingScheduleSystem'", "'floor'", "'sensor '", "'actuator'", "'MotionSensor'", "'valueState'", "'='", "'TemperatureSensor'", "'PressureSensor'", "'TouchSensor'", "'LightSensor'", "'SmokeSensor'", "'CO2Sensor'", "'InfraredLightSensor'", "'HasIntegerValue'", "'HumiditySensor'", "'-'", "'LightSwitchActuator'", "'WindowActuator'", "'HumidifierActuator'", "'DoorActuator'", "'RadiatorActuator'", "'AudioAlarmActuator'", "'HasIntValue'"
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
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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


        public InternalPeDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPeDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPeDslParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g"; }



     	private PeDslGrammarAccess grammarAccess;
     	
        public InternalPeDslParser(TokenStream input, PeDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PeDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_predefinedRooms_3_0= ruleRoom ) ) ( (lv_predefinedRooms_4_0= ruleRoom ) )* )? ( ( (lv_buildings_5_0= ruleBuilding ) ) ( (lv_buildings_6_0= ruleBuilding ) )* )? ( ( (lv_stateDefinition_7_0= ruleState ) ) ( (lv_stateDefinition_8_0= ruleState ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_predefinedRooms_3_0 = null;

        EObject lv_predefinedRooms_4_0 = null;

        EObject lv_buildings_5_0 = null;

        EObject lv_buildings_6_0 = null;

        EObject lv_stateDefinition_7_0 = null;

        EObject lv_stateDefinition_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:79:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_predefinedRooms_3_0= ruleRoom ) ) ( (lv_predefinedRooms_4_0= ruleRoom ) )* )? ( ( (lv_buildings_5_0= ruleBuilding ) ) ( (lv_buildings_6_0= ruleBuilding ) )* )? ( ( (lv_stateDefinition_7_0= ruleState ) ) ( (lv_stateDefinition_8_0= ruleState ) )* )? otherlv_9= '}' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:80:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_predefinedRooms_3_0= ruleRoom ) ) ( (lv_predefinedRooms_4_0= ruleRoom ) )* )? ( ( (lv_buildings_5_0= ruleBuilding ) ) ( (lv_buildings_6_0= ruleBuilding ) )* )? ( ( (lv_stateDefinition_7_0= ruleState ) ) ( (lv_stateDefinition_8_0= ruleState ) )* )? otherlv_9= '}' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:80:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_predefinedRooms_3_0= ruleRoom ) ) ( (lv_predefinedRooms_4_0= ruleRoom ) )* )? ( ( (lv_buildings_5_0= ruleBuilding ) ) ( (lv_buildings_6_0= ruleBuilding ) )* )? ( ( (lv_stateDefinition_7_0= ruleState ) ) ( (lv_stateDefinition_8_0= ruleState ) )* )? otherlv_9= '}' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:80:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_predefinedRooms_3_0= ruleRoom ) ) ( (lv_predefinedRooms_4_0= ruleRoom ) )* )? ( ( (lv_buildings_5_0= ruleBuilding ) ) ( (lv_buildings_6_0= ruleBuilding ) )* )? ( ( (lv_stateDefinition_7_0= ruleState ) ) ( (lv_stateDefinition_8_0= ruleState ) )* )? otherlv_9= '}'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:80:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:86:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:87:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:87:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:88:3: lv_name_1_0= ruleEString
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
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:108:1: ( ( (lv_predefinedRooms_3_0= ruleRoom ) ) ( (lv_predefinedRooms_4_0= ruleRoom ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:108:2: ( (lv_predefinedRooms_3_0= ruleRoom ) ) ( (lv_predefinedRooms_4_0= ruleRoom ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:108:2: ( (lv_predefinedRooms_3_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:109:1: (lv_predefinedRooms_3_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:109:1: (lv_predefinedRooms_3_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:110:3: lv_predefinedRooms_3_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel174);
                    lv_predefinedRooms_3_0=ruleRoom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"predefinedRooms",
                            		lv_predefinedRooms_3_0, 
                            		"Room");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:126:2: ( (lv_predefinedRooms_4_0= ruleRoom ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:127:1: (lv_predefinedRooms_4_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:127:1: (lv_predefinedRooms_4_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:128:3: lv_predefinedRooms_4_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPredefinedRoomsRoomParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleModel195);
                    	    lv_predefinedRooms_4_0=ruleRoom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"predefinedRooms",
                    	            		lv_predefinedRooms_4_0, 
                    	            		"Room");
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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:144:5: ( ( (lv_buildings_5_0= ruleBuilding ) ) ( (lv_buildings_6_0= ruleBuilding ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:144:6: ( (lv_buildings_5_0= ruleBuilding ) ) ( (lv_buildings_6_0= ruleBuilding ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:144:6: ( (lv_buildings_5_0= ruleBuilding ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:145:1: (lv_buildings_5_0= ruleBuilding )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:145:1: (lv_buildings_5_0= ruleBuilding )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:146:3: lv_buildings_5_0= ruleBuilding
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel220);
                    lv_buildings_5_0=ruleBuilding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"buildings",
                            		lv_buildings_5_0, 
                            		"Building");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:162:2: ( (lv_buildings_6_0= ruleBuilding ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:163:1: (lv_buildings_6_0= ruleBuilding )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:163:1: (lv_buildings_6_0= ruleBuilding )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:164:3: lv_buildings_6_0= ruleBuilding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getBuildingsBuildingParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_ruleModel241);
                    	    lv_buildings_6_0=ruleBuilding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"buildings",
                    	            		lv_buildings_6_0, 
                    	            		"Building");
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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:180:5: ( ( (lv_stateDefinition_7_0= ruleState ) ) ( (lv_stateDefinition_8_0= ruleState ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:180:6: ( (lv_stateDefinition_7_0= ruleState ) ) ( (lv_stateDefinition_8_0= ruleState ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:180:6: ( (lv_stateDefinition_7_0= ruleState ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:181:1: (lv_stateDefinition_7_0= ruleState )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:181:1: (lv_stateDefinition_7_0= ruleState )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:182:3: lv_stateDefinition_7_0= ruleState
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getStateDefinitionStateParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleModel266);
                    lv_stateDefinition_7_0=ruleState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"stateDefinition",
                            		lv_stateDefinition_7_0, 
                            		"State");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:198:2: ( (lv_stateDefinition_8_0= ruleState ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:199:1: (lv_stateDefinition_8_0= ruleState )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:199:1: (lv_stateDefinition_8_0= ruleState )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:200:3: lv_stateDefinition_8_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getStateDefinitionStateParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleModel287);
                    	    lv_stateDefinition_8_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"stateDefinition",
                    	            		lv_stateDefinition_8_0, 
                    	            		"State");
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

            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel302); 

                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:228:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:229:2: (iv_ruleActuator= ruleActuator EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:230:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator338);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator348); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:237:1: ruleActuator returns [EObject current=null] : (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator | this_HasIntValue_Impl_6= ruleHasIntValue_Impl ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_LightSwitchActuator_0 = null;

        EObject this_WindowActuator_1 = null;

        EObject this_HumidifierActuator_2 = null;

        EObject this_DoorActuator_3 = null;

        EObject this_RadiatorActuator_4 = null;

        EObject this_AudioAlarmActuator_5 = null;

        EObject this_HasIntValue_Impl_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:240:28: ( (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator | this_HasIntValue_Impl_6= ruleHasIntValue_Impl ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:241:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator | this_HasIntValue_Impl_6= ruleHasIntValue_Impl )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:241:1: (this_LightSwitchActuator_0= ruleLightSwitchActuator | this_WindowActuator_1= ruleWindowActuator | this_HumidifierActuator_2= ruleHumidifierActuator | this_DoorActuator_3= ruleDoorActuator | this_RadiatorActuator_4= ruleRadiatorActuator | this_AudioAlarmActuator_5= ruleAudioAlarmActuator | this_HasIntValue_Impl_6= ruleHasIntValue_Impl )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            case 46:
                {
                alt7=4;
                }
                break;
            case 47:
                {
                alt7=5;
                }
                break;
            case 48:
                {
                alt7=6;
                }
                break;
            case 49:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:242:5: this_LightSwitchActuator_0= ruleLightSwitchActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getLightSwitchActuatorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_ruleActuator395);
                    this_LightSwitchActuator_0=ruleLightSwitchActuator();

                    state._fsp--;

                     
                            current = this_LightSwitchActuator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:252:5: this_WindowActuator_1= ruleWindowActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getWindowActuatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_ruleActuator422);
                    this_WindowActuator_1=ruleWindowActuator();

                    state._fsp--;

                     
                            current = this_WindowActuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:262:5: this_HumidifierActuator_2= ruleHumidifierActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getHumidifierActuatorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_ruleActuator449);
                    this_HumidifierActuator_2=ruleHumidifierActuator();

                    state._fsp--;

                     
                            current = this_HumidifierActuator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:272:5: this_DoorActuator_3= ruleDoorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getDoorActuatorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_ruleActuator476);
                    this_DoorActuator_3=ruleDoorActuator();

                    state._fsp--;

                     
                            current = this_DoorActuator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:282:5: this_RadiatorActuator_4= ruleRadiatorActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getRadiatorActuatorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_ruleActuator503);
                    this_RadiatorActuator_4=ruleRadiatorActuator();

                    state._fsp--;

                     
                            current = this_RadiatorActuator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:292:5: this_AudioAlarmActuator_5= ruleAudioAlarmActuator
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getAudioAlarmActuatorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_ruleActuator530);
                    this_AudioAlarmActuator_5=ruleAudioAlarmActuator();

                    state._fsp--;

                     
                            current = this_AudioAlarmActuator_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:302:5: this_HasIntValue_Impl_6= ruleHasIntValue_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getActuatorAccess().getHasIntValue_ImplParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHasIntValue_Impl_in_ruleActuator557);
                    this_HasIntValue_Impl_6=ruleHasIntValue_Impl();

                    state._fsp--;

                     
                            current = this_HasIntValue_Impl_6; 
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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:318:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:319:2: (iv_ruleSensor= ruleSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:320:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor592);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor602); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:327:1: ruleSensor returns [EObject current=null] : (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HasIntegerValue_Impl_8= ruleHasIntegerValue_Impl | this_HumiditySensor_9= ruleHumiditySensor ) ;
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

        EObject this_HasIntegerValue_Impl_8 = null;

        EObject this_HumiditySensor_9 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:330:28: ( (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HasIntegerValue_Impl_8= ruleHasIntegerValue_Impl | this_HumiditySensor_9= ruleHumiditySensor ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:331:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HasIntegerValue_Impl_8= ruleHasIntegerValue_Impl | this_HumiditySensor_9= ruleHumiditySensor )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:331:1: (this_MotionSensor_0= ruleMotionSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_PressureSensor_2= rulePressureSensor | this_TouchSensor_3= ruleTouchSensor | this_LightSensor_4= ruleLightSensor | this_SmokeSensor_5= ruleSmokeSensor | this_CO2Sensor_6= ruleCO2Sensor | this_InfraredLightSensor_7= ruleInfraredLightSensor | this_HasIntegerValue_Impl_8= ruleHasIntegerValue_Impl | this_HumiditySensor_9= ruleHumiditySensor )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 37:
                {
                alt8=6;
                }
                break;
            case 38:
                {
                alt8=7;
                }
                break;
            case 39:
                {
                alt8=8;
                }
                break;
            case 40:
                {
                alt8=9;
                }
                break;
            case 41:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:332:5: this_MotionSensor_0= ruleMotionSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getMotionSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_ruleSensor649);
                    this_MotionSensor_0=ruleMotionSensor();

                    state._fsp--;

                     
                            current = this_MotionSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:342:5: this_TemperatureSensor_1= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTemperatureSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleSensor676);
                    this_TemperatureSensor_1=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:352:5: this_PressureSensor_2= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getPressureSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleSensor703);
                    this_PressureSensor_2=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:362:5: this_TouchSensor_3= ruleTouchSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getTouchSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_ruleSensor730);
                    this_TouchSensor_3=ruleTouchSensor();

                    state._fsp--;

                     
                            current = this_TouchSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:372:5: this_LightSensor_4= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleSensor757);
                    this_LightSensor_4=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:382:5: this_SmokeSensor_5= ruleSmokeSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getSmokeSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_ruleSensor784);
                    this_SmokeSensor_5=ruleSmokeSensor();

                    state._fsp--;

                     
                            current = this_SmokeSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:392:5: this_CO2Sensor_6= ruleCO2Sensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getCO2SensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_ruleSensor811);
                    this_CO2Sensor_6=ruleCO2Sensor();

                    state._fsp--;

                     
                            current = this_CO2Sensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:402:5: this_InfraredLightSensor_7= ruleInfraredLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getInfraredLightSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_ruleSensor838);
                    this_InfraredLightSensor_7=ruleInfraredLightSensor();

                    state._fsp--;

                     
                            current = this_InfraredLightSensor_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:412:5: this_HasIntegerValue_Impl_8= ruleHasIntegerValue_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getHasIntegerValue_ImplParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHasIntegerValue_Impl_in_ruleSensor865);
                    this_HasIntegerValue_Impl_8=ruleHasIntegerValue_Impl();

                    state._fsp--;

                     
                            current = this_HasIntegerValue_Impl_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:422:5: this_HumiditySensor_9= ruleHumiditySensor
                    {
                     
                            newCompositeNode(grammarAccess.getSensorAccess().getHumiditySensorParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_ruleSensor892);
                    this_HumiditySensor_9=ruleHumiditySensor();

                    state._fsp--;

                     
                            current = this_HumiditySensor_9; 
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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:438:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:439:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:440:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString928);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString939); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:447:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:450:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:451:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:451:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:451:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString979); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:459:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1005); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:474:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:475:2: (iv_ruleBuilding= ruleBuilding EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:476:2: iv_ruleBuilding= ruleBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuilding_in_entryRuleBuilding1050);
            iv_ruleBuilding=ruleBuilding();

            state._fsp--;

             current =iv_ruleBuilding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuilding1060); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:483:1: ruleBuilding returns [EObject current=null] : ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( (lv_ctsSystem_8_0= ruleCTS ) )? ( (lv_accessControl_9_0= ruleAccessControl ) )? ( (lv_calendarSystem_10_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_12_0= ruleFloor ) ) ( (lv_floors_13_0= ruleFloor ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleBuilding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declareSensors_4_0 = null;

        EObject lv_declareSensors_5_0 = null;

        EObject lv_declareActuators_6_0 = null;

        EObject lv_declareActuators_7_0 = null;

        EObject lv_ctsSystem_8_0 = null;

        EObject lv_accessControl_9_0 = null;

        EObject lv_calendarSystem_10_0 = null;

        EObject lv_meetingScheduleSystem_11_0 = null;

        EObject lv_floors_12_0 = null;

        EObject lv_floors_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:486:28: ( ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( (lv_ctsSystem_8_0= ruleCTS ) )? ( (lv_accessControl_9_0= ruleAccessControl ) )? ( (lv_calendarSystem_10_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_12_0= ruleFloor ) ) ( (lv_floors_13_0= ruleFloor ) )* )? otherlv_14= '}' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:487:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( (lv_ctsSystem_8_0= ruleCTS ) )? ( (lv_accessControl_9_0= ruleAccessControl ) )? ( (lv_calendarSystem_10_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_12_0= ruleFloor ) ) ( (lv_floors_13_0= ruleFloor ) )* )? otherlv_14= '}' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:487:1: ( () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( (lv_ctsSystem_8_0= ruleCTS ) )? ( (lv_accessControl_9_0= ruleAccessControl ) )? ( (lv_calendarSystem_10_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_12_0= ruleFloor ) ) ( (lv_floors_13_0= ruleFloor ) )* )? otherlv_14= '}' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:487:2: () otherlv_1= 'building' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( (lv_ctsSystem_8_0= ruleCTS ) )? ( (lv_accessControl_9_0= ruleAccessControl ) )? ( (lv_calendarSystem_10_0= ruleCalendarSystem ) )? ( (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem ) )? ( ( (lv_floors_12_0= ruleFloor ) ) ( (lv_floors_13_0= ruleFloor ) )* )? otherlv_14= '}'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:487:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:488:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildingAccess().getBuildingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBuilding1106); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildingAccess().getBuildingKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:497:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:498:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:498:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:499:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBuilding1127);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBuilding1139); 

                	newLeafNode(otherlv_3, grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:519:1: ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:519:2: ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:519:2: ( (lv_declareSensors_4_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:520:1: (lv_declareSensors_4_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:520:1: (lv_declareSensors_4_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:521:3: lv_declareSensors_4_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getDeclareSensorsSensorComponentParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleBuilding1161);
                    lv_declareSensors_4_0=ruleSensorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		add(
                           			current, 
                           			"declareSensors",
                            		lv_declareSensors_4_0, 
                            		"SensorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:537:2: ( (lv_declareSensors_5_0= ruleSensorComponent ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==28) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:538:1: (lv_declareSensors_5_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:538:1: (lv_declareSensors_5_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:539:3: lv_declareSensors_5_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBuildingAccess().getDeclareSensorsSensorComponentParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleBuilding1182);
                    	    lv_declareSensors_5_0=ruleSensorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareSensors",
                    	            		lv_declareSensors_5_0, 
                    	            		"SensorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:555:5: ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:555:6: ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:555:6: ( (lv_declareActuators_6_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:556:1: (lv_declareActuators_6_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:556:1: (lv_declareActuators_6_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:557:3: lv_declareActuators_6_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getDeclareActuatorsActuatorComponentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleBuilding1207);
                    lv_declareActuators_6_0=ruleActuatorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		add(
                           			current, 
                           			"declareActuators",
                            		lv_declareActuators_6_0, 
                            		"ActuatorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:573:2: ( (lv_declareActuators_7_0= ruleActuatorComponent ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==29) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:574:1: (lv_declareActuators_7_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:574:1: (lv_declareActuators_7_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:575:3: lv_declareActuators_7_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBuildingAccess().getDeclareActuatorsActuatorComponentParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleBuilding1228);
                    	    lv_declareActuators_7_0=ruleActuatorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareActuators",
                    	            		lv_declareActuators_7_0, 
                    	            		"ActuatorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:591:5: ( (lv_ctsSystem_8_0= ruleCTS ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:592:1: (lv_ctsSystem_8_0= ruleCTS )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:592:1: (lv_ctsSystem_8_0= ruleCTS )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:593:3: lv_ctsSystem_8_0= ruleCTS
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCtsSystemCTSParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCTS_in_ruleBuilding1252);
                    lv_ctsSystem_8_0=ruleCTS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"ctsSystem",
                            		lv_ctsSystem_8_0, 
                            		"CTS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:609:3: ( (lv_accessControl_9_0= ruleAccessControl ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:610:1: (lv_accessControl_9_0= ruleAccessControl )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:610:1: (lv_accessControl_9_0= ruleAccessControl )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:611:3: lv_accessControl_9_0= ruleAccessControl
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getAccessControlAccessControlParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_ruleBuilding1274);
                    lv_accessControl_9_0=ruleAccessControl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"accessControl",
                            		lv_accessControl_9_0, 
                            		"AccessControl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:627:3: ( (lv_calendarSystem_10_0= ruleCalendarSystem ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:628:1: (lv_calendarSystem_10_0= ruleCalendarSystem )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:628:1: (lv_calendarSystem_10_0= ruleCalendarSystem )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:629:3: lv_calendarSystem_10_0= ruleCalendarSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getCalendarSystemCalendarSystemParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_ruleBuilding1296);
                    lv_calendarSystem_10_0=ruleCalendarSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"calendarSystem",
                            		lv_calendarSystem_10_0, 
                            		"CalendarSystem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:645:3: ( (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:646:1: (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:646:1: (lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:647:3: lv_meetingScheduleSystem_11_0= ruleMeetingScheduleSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getMeetingScheduleSystemMeetingScheduleSystemParserRuleCall_9_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1318);
                    lv_meetingScheduleSystem_11_0=ruleMeetingScheduleSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		set(
                           			current, 
                           			"meetingScheduleSystem",
                            		lv_meetingScheduleSystem_11_0, 
                            		"MeetingScheduleSystem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:663:3: ( ( (lv_floors_12_0= ruleFloor ) ) ( (lv_floors_13_0= ruleFloor ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:663:4: ( (lv_floors_12_0= ruleFloor ) ) ( (lv_floors_13_0= ruleFloor ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:663:4: ( (lv_floors_12_0= ruleFloor ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:664:1: (lv_floors_12_0= ruleFloor )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:664:1: (lv_floors_12_0= ruleFloor )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:665:3: lv_floors_12_0= ruleFloor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1341);
                    lv_floors_12_0=ruleFloor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	        }
                           		add(
                           			current, 
                           			"floors",
                            		lv_floors_12_0, 
                            		"Floor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:681:2: ( (lv_floors_13_0= ruleFloor ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==27) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:682:1: (lv_floors_13_0= ruleFloor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:682:1: (lv_floors_13_0= ruleFloor )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:683:3: lv_floors_13_0= ruleFloor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBuildingAccess().getFloorsFloorParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFloor_in_ruleBuilding1362);
                    	    lv_floors_13_0=ruleFloor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBuildingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"floors",
                    	            		lv_floors_13_0, 
                    	            		"Floor");
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

            otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBuilding1377); 

                	newLeafNode(otherlv_14, grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:711:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:712:2: (iv_ruleRoom= ruleRoom EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:713:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoom_in_entryRuleRoom1413);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoom1423); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:720:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declareSensor_6_0 = null;

        EObject lv_declareSensor_7_0 = null;

        EObject lv_declareActuator_8_0 = null;

        EObject lv_declareActuator_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:723:28: ( ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:724:1: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:724:1: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:724:2: () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( ( ruleEString ) ) )? otherlv_5= '{' ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )? otherlv_10= '}'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:724:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:725:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoomAccess().getRoomAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRoom1469); 

                	newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:734:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:735:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:735:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:736:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1490);
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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:752:2: (otherlv_3= 'is a ' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:752:4: otherlv_3= 'is a ' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRoom1503); 

                        	newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:756:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:757:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:757:1: ( ruleEString )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:758:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoomRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getExtendsRoomCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoom1526);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoom1540); 

                	newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:775:1: ( ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:775:2: ( (lv_declareSensor_6_0= ruleSensorComponent ) ) ( (lv_declareSensor_7_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:775:2: ( (lv_declareSensor_6_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:776:1: (lv_declareSensor_6_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:776:1: (lv_declareSensor_6_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:777:3: lv_declareSensor_6_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom1562);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:793:2: ( (lv_declareSensor_7_0= ruleSensorComponent ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==28) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:794:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:794:1: (lv_declareSensor_7_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:795:3: lv_declareSensor_7_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareSensorSensorComponentParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleRoom1583);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:811:5: ( ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:811:6: ( (lv_declareActuator_8_0= ruleActuatorComponent ) ) ( (lv_declareActuator_9_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:811:6: ( (lv_declareActuator_8_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:812:1: (lv_declareActuator_8_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:812:1: (lv_declareActuator_8_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:813:3: lv_declareActuator_8_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom1608);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:829:2: ( (lv_declareActuator_9_0= ruleActuatorComponent ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==29) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:830:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:830:1: (lv_declareActuator_9_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:831:3: lv_declareActuator_9_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoomAccess().getDeclareActuatorActuatorComponentParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleRoom1629);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoom1644); 

                	newLeafNode(otherlv_10, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleState"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:859:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:860:2: (iv_ruleState= ruleState EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:861:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1680);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1690); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:868:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses ' ( (lv_uses_4_0= ruleActuator ) ) ( (lv_uses_5_0= ruleActuator ) )* )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_uses_4_0 = null;

        EObject lv_uses_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:871:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses ' ( (lv_uses_4_0= ruleActuator ) ) ( (lv_uses_5_0= ruleActuator ) )* )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:872:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses ' ( (lv_uses_4_0= ruleActuator ) ) ( (lv_uses_5_0= ruleActuator ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:872:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses ' ( (lv_uses_4_0= ruleActuator ) ) ( (lv_uses_5_0= ruleActuator ) )* )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:872:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'uses ' ( (lv_uses_4_0= ruleActuator ) ) ( (lv_uses_5_0= ruleActuator ) )* )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:872:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:873:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleState1736); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:882:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:883:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:883:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:884:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1757);
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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:900:2: (otherlv_3= 'uses ' ( (lv_uses_4_0= ruleActuator ) ) ( (lv_uses_5_0= ruleActuator ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:900:4: otherlv_3= 'uses ' ( (lv_uses_4_0= ruleActuator ) ) ( (lv_uses_5_0= ruleActuator ) )*
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleState1770); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getUsesKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:904:1: ( (lv_uses_4_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:905:1: (lv_uses_4_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:905:1: (lv_uses_4_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:906:3: lv_uses_4_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getUsesActuatorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleState1791);
                    lv_uses_4_0=ruleActuator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"uses",
                            		lv_uses_4_0, 
                            		"Actuator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:922:2: ( (lv_uses_5_0= ruleActuator ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=43 && LA25_0<=49)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:923:1: (lv_uses_5_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:923:1: (lv_uses_5_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:924:3: lv_uses_5_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getUsesActuatorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleState1812);
                    	    lv_uses_5_0=ruleActuator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"uses",
                    	            		lv_uses_5_0, 
                    	            		"Actuator");
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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:948:1: entryRuleCTS returns [EObject current=null] : iv_ruleCTS= ruleCTS EOF ;
    public final EObject entryRuleCTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTS = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:949:2: (iv_ruleCTS= ruleCTS EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:950:2: iv_ruleCTS= ruleCTS EOF
            {
             newCompositeNode(grammarAccess.getCTSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCTS_in_entryRuleCTS1851);
            iv_ruleCTS=ruleCTS();

            state._fsp--;

             current =iv_ruleCTS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCTS1861); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:957:1: ruleCTS returns [EObject current=null] : ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:960:28: ( ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:961:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:961:1: ( () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:961:2: () otherlv_1= 'CTS' otherlv_2= '{' (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:961:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:962:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCTSAccess().getCTSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCTS1907); 

                	newLeafNode(otherlv_1, grammarAccess.getCTSAccess().getCTSKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS1919); 

                	newLeafNode(otherlv_2, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:975:1: (otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:975:3: otherlv_3= 'temperatureSensors' otherlv_4= '{' ( (lv_temperatureSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCTS1932); 

                        	newLeafNode(otherlv_3, grammarAccess.getCTSAccess().getTemperatureSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS1944); 

                        	newLeafNode(otherlv_4, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:983:1: ( (lv_temperatureSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:984:1: (lv_temperatureSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:984:1: (lv_temperatureSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:985:3: lv_temperatureSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS1965);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1001:2: (otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==20) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1001:4: otherlv_6= ',' ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCTS1978); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCTSAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1005:1: ( (lv_temperatureSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1006:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1006:1: (lv_temperatureSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1007:3: lv_temperatureSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getTemperatureSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleCTS1999);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCTS2013); 

                        	newLeafNode(otherlv_8, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1027:3: (otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1027:5: otherlv_9= 'ctsActuators' otherlv_10= '{' ( (lv_ctsActuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCTS2028); 

                        	newLeafNode(otherlv_9, grammarAccess.getCTSAccess().getCtsActuatorsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCTS2040); 

                        	newLeafNode(otherlv_10, grammarAccess.getCTSAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1035:1: ( (lv_ctsActuators_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1036:1: (lv_ctsActuators_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1036:1: (lv_ctsActuators_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1037:3: lv_ctsActuators_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS2061);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1053:2: (otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1053:4: otherlv_12= ',' ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCTS2074); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCTSAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1057:1: ( (lv_ctsActuators_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1058:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1058:1: (lv_ctsActuators_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1059:3: lv_ctsActuators_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCTSAccess().getCtsActuatorsActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleCTS2095);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCTS2109); 

                        	newLeafNode(otherlv_14, grammarAccess.getCTSAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCTS2123); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1091:1: entryRuleAccessControl returns [EObject current=null] : iv_ruleAccessControl= ruleAccessControl EOF ;
    public final EObject entryRuleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControl = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1092:2: (iv_ruleAccessControl= ruleAccessControl EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1093:2: iv_ruleAccessControl= ruleAccessControl EOF
            {
             newCompositeNode(grammarAccess.getAccessControlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessControl_in_entryRuleAccessControl2159);
            iv_ruleAccessControl=ruleAccessControl();

            state._fsp--;

             current =iv_ruleAccessControl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessControl2169); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1100:1: ruleAccessControl returns [EObject current=null] : ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1103:28: ( ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1104:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1104:1: ( () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1104:2: () otherlv_1= 'AccessControl' otherlv_2= '{' (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )? (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1104:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1105:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccessControlAccess().getAccessControlAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAccessControl2215); 

                	newLeafNode(otherlv_1, grammarAccess.getAccessControlAccess().getAccessControlKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2227); 

                	newLeafNode(otherlv_2, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1118:1: (otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1118:3: otherlv_3= 'accessControlSensors' otherlv_4= '{' ( (lv_accessControlSensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAccessControl2240); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccessControlAccess().getAccessControlSensorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2252); 

                        	newLeafNode(otherlv_4, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1126:1: ( (lv_accessControlSensors_5_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1127:1: (lv_accessControlSensors_5_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1127:1: (lv_accessControlSensors_5_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1128:3: lv_accessControlSensors_5_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl2273);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1144:2: (otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==20) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1144:4: otherlv_6= ',' ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAccessControl2286); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAccessControlAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1148:1: ( (lv_accessControlSensors_7_0= ruleSensor ) )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1149:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1149:1: (lv_accessControlSensors_7_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1150:3: lv_accessControlSensors_7_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlSensorsSensorParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleAccessControl2307);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccessControl2321); 

                        	newLeafNode(otherlv_8, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1170:3: (otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1170:5: otherlv_9= 'accessControlDoorLockActuator' otherlv_10= '{' ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAccessControl2336); 

                        	newLeafNode(otherlv_9, grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAccessControl2348); 

                        	newLeafNode(otherlv_10, grammarAccess.getAccessControlAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1178:1: ( (lv_accessControlDoorLockActuator_11_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1179:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1179:1: (lv_accessControlDoorLockActuator_11_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1180:3: lv_accessControlDoorLockActuator_11_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl2369);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1196:2: (otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1196:4: otherlv_12= ',' ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAccessControl2382); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getAccessControlAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1200:1: ( (lv_accessControlDoorLockActuator_13_0= ruleActuator ) )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1201:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1201:1: (lv_accessControlDoorLockActuator_13_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1202:3: lv_accessControlDoorLockActuator_13_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAccessControlAccess().getAccessControlDoorLockActuatorActuatorParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleAccessControl2403);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccessControl2417); 

                        	newLeafNode(otherlv_14, grammarAccess.getAccessControlAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccessControl2431); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1234:1: entryRuleCalendarSystem returns [EObject current=null] : iv_ruleCalendarSystem= ruleCalendarSystem EOF ;
    public final EObject entryRuleCalendarSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1235:2: (iv_ruleCalendarSystem= ruleCalendarSystem EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1236:2: iv_ruleCalendarSystem= ruleCalendarSystem EOF
            {
             newCompositeNode(grammarAccess.getCalendarSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem2467);
            iv_ruleCalendarSystem=ruleCalendarSystem();

            state._fsp--;

             current =iv_ruleCalendarSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarSystem2477); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1243:1: ruleCalendarSystem returns [EObject current=null] : ( () otherlv_1= 'CalendarSystem' ) ;
    public final EObject ruleCalendarSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1246:28: ( ( () otherlv_1= 'CalendarSystem' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1247:1: ( () otherlv_1= 'CalendarSystem' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1247:1: ( () otherlv_1= 'CalendarSystem' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1247:2: () otherlv_1= 'CalendarSystem'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1247:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1248:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCalendarSystemAccess().getCalendarSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCalendarSystem2523); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1265:1: entryRuleMeetingScheduleSystem returns [EObject current=null] : iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF ;
    public final EObject entryRuleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingScheduleSystem = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1266:2: (iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1267:2: iv_ruleMeetingScheduleSystem= ruleMeetingScheduleSystem EOF
            {
             newCompositeNode(grammarAccess.getMeetingScheduleSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem2559);
            iv_ruleMeetingScheduleSystem=ruleMeetingScheduleSystem();

            state._fsp--;

             current =iv_ruleMeetingScheduleSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeetingScheduleSystem2569); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1274:1: ruleMeetingScheduleSystem returns [EObject current=null] : ( () otherlv_1= 'MeetingScheduleSystem' ) ;
    public final EObject ruleMeetingScheduleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1277:28: ( ( () otherlv_1= 'MeetingScheduleSystem' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1278:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1278:1: ( () otherlv_1= 'MeetingScheduleSystem' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1278:2: () otherlv_1= 'MeetingScheduleSystem'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1278:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1279:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeetingScheduleSystemAccess().getMeetingScheduleSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMeetingScheduleSystem2615); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1296:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1297:2: (iv_ruleFloor= ruleFloor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1298:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloor_in_entryRuleFloor2651);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloor2661); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1305:1: ruleFloor returns [EObject current=null] : ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( ( (lv_rooms_8_0= ruleRoom ) ) ( (lv_rooms_9_0= ruleRoom ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declareSensors_4_0 = null;

        EObject lv_declareSensors_5_0 = null;

        EObject lv_declareActuators_6_0 = null;

        EObject lv_declareActuators_7_0 = null;

        EObject lv_rooms_8_0 = null;

        EObject lv_rooms_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1308:28: ( ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( ( (lv_rooms_8_0= ruleRoom ) ) ( (lv_rooms_9_0= ruleRoom ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1309:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( ( (lv_rooms_8_0= ruleRoom ) ) ( (lv_rooms_9_0= ruleRoom ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1309:1: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( ( (lv_rooms_8_0= ruleRoom ) ) ( (lv_rooms_9_0= ruleRoom ) )* )? otherlv_10= '}' )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1309:2: () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )? ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )? ( ( (lv_rooms_8_0= ruleRoom ) ) ( (lv_rooms_9_0= ruleRoom ) )* )? otherlv_10= '}'
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1309:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloorAccess().getFloorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFloor2707); 

                	newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1319:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1320:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1320:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1321:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFloor2728);
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

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFloor2740); 

                	newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1341:1: ( ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1341:2: ( (lv_declareSensors_4_0= ruleSensorComponent ) ) ( (lv_declareSensors_5_0= ruleSensorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1341:2: ( (lv_declareSensors_4_0= ruleSensorComponent ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1342:1: (lv_declareSensors_4_0= ruleSensorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1342:1: (lv_declareSensors_4_0= ruleSensorComponent )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1343:3: lv_declareSensors_4_0= ruleSensorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloorAccess().getDeclareSensorsSensorComponentParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleFloor2762);
                    lv_declareSensors_4_0=ruleSensorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	        }
                           		add(
                           			current, 
                           			"declareSensors",
                            		lv_declareSensors_4_0, 
                            		"SensorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1359:2: ( (lv_declareSensors_5_0= ruleSensorComponent ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==28) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1360:1: (lv_declareSensors_5_0= ruleSensorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1360:1: (lv_declareSensors_5_0= ruleSensorComponent )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1361:3: lv_declareSensors_5_0= ruleSensorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFloorAccess().getDeclareSensorsSensorComponentParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_ruleFloor2783);
                    	    lv_declareSensors_5_0=ruleSensorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareSensors",
                    	            		lv_declareSensors_5_0, 
                    	            		"SensorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1377:5: ( ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1377:6: ( (lv_declareActuators_6_0= ruleActuatorComponent ) ) ( (lv_declareActuators_7_0= ruleActuatorComponent ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1377:6: ( (lv_declareActuators_6_0= ruleActuatorComponent ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1378:1: (lv_declareActuators_6_0= ruleActuatorComponent )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1378:1: (lv_declareActuators_6_0= ruleActuatorComponent )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1379:3: lv_declareActuators_6_0= ruleActuatorComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloorAccess().getDeclareActuatorsActuatorComponentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleFloor2808);
                    lv_declareActuators_6_0=ruleActuatorComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	        }
                           		add(
                           			current, 
                           			"declareActuators",
                            		lv_declareActuators_6_0, 
                            		"ActuatorComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1395:2: ( (lv_declareActuators_7_0= ruleActuatorComponent ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==29) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1396:1: (lv_declareActuators_7_0= ruleActuatorComponent )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1396:1: (lv_declareActuators_7_0= ruleActuatorComponent )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1397:3: lv_declareActuators_7_0= ruleActuatorComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFloorAccess().getDeclareActuatorsActuatorComponentParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_ruleFloor2829);
                    	    lv_declareActuators_7_0=ruleActuatorComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declareActuators",
                    	            		lv_declareActuators_7_0, 
                    	            		"ActuatorComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1413:5: ( ( (lv_rooms_8_0= ruleRoom ) ) ( (lv_rooms_9_0= ruleRoom ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1413:6: ( (lv_rooms_8_0= ruleRoom ) ) ( (lv_rooms_9_0= ruleRoom ) )*
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1413:6: ( (lv_rooms_8_0= ruleRoom ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1414:1: (lv_rooms_8_0= ruleRoom )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1414:1: (lv_rooms_8_0= ruleRoom )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1415:3: lv_rooms_8_0= ruleRoom
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor2854);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1431:2: ( (lv_rooms_9_0= ruleRoom ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1432:1: (lv_rooms_9_0= ruleRoom )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1432:1: (lv_rooms_9_0= ruleRoom )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1433:3: lv_rooms_9_0= ruleRoom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRoom_in_ruleFloor2875);
                    	    lv_rooms_9_0=ruleRoom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFloorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rooms",
                    	            		lv_rooms_9_0, 
                    	            		"Room");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFloor2890); 

                	newLeafNode(otherlv_10, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleSensorComponent"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1461:1: entryRuleSensorComponent returns [EObject current=null] : iv_ruleSensorComponent= ruleSensorComponent EOF ;
    public final EObject entryRuleSensorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1462:2: (iv_ruleSensorComponent= ruleSensorComponent EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1463:2: iv_ruleSensorComponent= ruleSensorComponent EOF
            {
             newCompositeNode(grammarAccess.getSensorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent2926);
            iv_ruleSensorComponent=ruleSensorComponent();

            state._fsp--;

             current =iv_ruleSensorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorComponent2936); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1470:1: ruleSensorComponent returns [EObject current=null] : ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) ;
    public final EObject ruleSensorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1473:28: ( ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1474:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1474:1: ( () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1474:2: () otherlv_1= 'sensor ' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1474:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1475:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorComponentAccess().getSensorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSensorComponent2982); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorComponentAccess().getSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1484:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1485:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1485:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1486:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSensorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensorComponent3003);
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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1502:2: (otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==15) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1502:4: otherlv_3= 'is a ' ( (lv_sensors_4_0= ruleSensor ) ) ( (lv_sensors_5_0= ruleSensor ) )*
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSensorComponent3016); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1506:1: ( (lv_sensors_4_0= ruleSensor ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1507:1: (lv_sensors_4_0= ruleSensor )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1507:1: (lv_sensors_4_0= ruleSensor )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1508:3: lv_sensors_4_0= ruleSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent3037);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1524:2: ( (lv_sensors_5_0= ruleSensor ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==30||(LA41_0>=33 && LA41_0<=41)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1525:1: (lv_sensors_5_0= ruleSensor )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1525:1: (lv_sensors_5_0= ruleSensor )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1526:3: lv_sensors_5_0= ruleSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorComponentAccess().getSensorsSensorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleSensorComponent3058);
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
                    	    break loop41;
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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1550:1: entryRuleActuatorComponent returns [EObject current=null] : iv_ruleActuatorComponent= ruleActuatorComponent EOF ;
    public final EObject entryRuleActuatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuatorComponent = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1551:2: (iv_ruleActuatorComponent= ruleActuatorComponent EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1552:2: iv_ruleActuatorComponent= ruleActuatorComponent EOF
            {
             newCompositeNode(grammarAccess.getActuatorComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent3097);
            iv_ruleActuatorComponent=ruleActuatorComponent();

            state._fsp--;

             current =iv_ruleActuatorComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuatorComponent3107); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1559:1: ruleActuatorComponent returns [EObject current=null] : ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) ;
    public final EObject ruleActuatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actuators_4_0 = null;

        EObject lv_actuators_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1562:28: ( ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1563:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1563:1: ( () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1563:2: () otherlv_1= 'actuator' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1563:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1564:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorComponentAccess().getActuatorComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleActuatorComponent3153); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorComponentAccess().getActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1573:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1574:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1574:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1575:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActuatorComponent3174);
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

            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1591:2: (otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==15) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1591:4: otherlv_3= 'is a ' ( (lv_actuators_4_0= ruleActuator ) ) ( (lv_actuators_5_0= ruleActuator ) )*
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActuatorComponent3187); 

                        	newLeafNode(otherlv_3, grammarAccess.getActuatorComponentAccess().getIsAKeyword_3_0());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1595:1: ( (lv_actuators_4_0= ruleActuator ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1596:1: (lv_actuators_4_0= ruleActuator )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1596:1: (lv_actuators_4_0= ruleActuator )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1597:3: lv_actuators_4_0= ruleActuator
                    {
                     
                    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent3208);
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

                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1613:2: ( (lv_actuators_5_0= ruleActuator ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=43 && LA43_0<=49)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1614:1: (lv_actuators_5_0= ruleActuator )
                    	    {
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1614:1: (lv_actuators_5_0= ruleActuator )
                    	    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1615:3: lv_actuators_5_0= ruleActuator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActuatorComponentAccess().getActuatorsActuatorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleActuatorComponent3229);
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
                    	    break loop43;
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


    // $ANTLR start "entryRuleMotionSensor"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1639:1: entryRuleMotionSensor returns [EObject current=null] : iv_ruleMotionSensor= ruleMotionSensor EOF ;
    public final EObject entryRuleMotionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotionSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1640:2: (iv_ruleMotionSensor= ruleMotionSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1641:2: iv_ruleMotionSensor= ruleMotionSensor EOF
            {
             newCompositeNode(grammarAccess.getMotionSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3268);
            iv_ruleMotionSensor=ruleMotionSensor();

            state._fsp--;

             current =iv_ruleMotionSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMotionSensor3278); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1648:1: ruleMotionSensor returns [EObject current=null] : ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1651:28: ( ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1652:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1652:1: ( () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1652:2: () otherlv_1= 'MotionSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1652:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1653:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMotionSensorAccess().getMotionSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMotionSensor3324); 

                	newLeafNode(otherlv_1, grammarAccess.getMotionSensorAccess().getMotionSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1662:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1662:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMotionSensor3337); 

                        	newLeafNode(otherlv_2, grammarAccess.getMotionSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMotionSensor3349); 

                        	newLeafNode(otherlv_3, grammarAccess.getMotionSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMotionSensor3361); 

                        	newLeafNode(otherlv_4, grammarAccess.getMotionSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1674:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1675:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1675:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1676:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMotionSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMotionSensor3382);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMotionSensor3394); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1704:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1705:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1706:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3432);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor3442); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1713:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1716:28: ( ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1717:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1717:1: ( () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1717:2: () otherlv_1= 'TemperatureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1717:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1718:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTemperatureSensor3488); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1727:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==11) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1727:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTemperatureSensor3501); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTemperatureSensor3513); 

                        	newLeafNode(otherlv_3, grammarAccess.getTemperatureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTemperatureSensor3525); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemperatureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1739:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1740:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1740:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1741:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemperatureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTemperatureSensor3546);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTemperatureSensor3558); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1769:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1770:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1771:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor3596);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor3606); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1778:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1781:28: ( ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1782:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1782:1: ( () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1782:2: () otherlv_1= 'PressureSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1782:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1783:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePressureSensor3652); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1792:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==11) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1792:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePressureSensor3665); 

                        	newLeafNode(otherlv_2, grammarAccess.getPressureSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePressureSensor3677); 

                        	newLeafNode(otherlv_3, grammarAccess.getPressureSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePressureSensor3689); 

                        	newLeafNode(otherlv_4, grammarAccess.getPressureSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1804:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1805:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1805:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1806:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPressureSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePressureSensor3710);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePressureSensor3722); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1834:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1835:2: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1836:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor3760);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTouchSensor3770); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1843:1: ruleTouchSensor returns [EObject current=null] : ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1846:28: ( ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1847:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1847:1: ( () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1847:2: () otherlv_1= 'TouchSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1847:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1848:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTouchSensorAccess().getTouchSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTouchSensor3816); 

                	newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1857:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1857:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTouchSensor3829); 

                        	newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTouchSensor3841); 

                        	newLeafNode(otherlv_3, grammarAccess.getTouchSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTouchSensor3853); 

                        	newLeafNode(otherlv_4, grammarAccess.getTouchSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1869:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1870:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1870:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1871:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getTouchSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTouchSensor3874);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTouchSensor3886); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1899:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1900:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1901:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor3924);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor3934); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1908:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1911:28: ( ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1912:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1912:1: ( () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1912:2: () otherlv_1= 'LightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1912:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1913:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleLightSensor3980); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1922:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==11) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1922:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSensor3993); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLightSensor4005); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLightSensor4017); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1934:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1935:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1935:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1936:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSensor4038);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLightSensor4050); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1964:1: entryRuleSmokeSensor returns [EObject current=null] : iv_ruleSmokeSensor= ruleSmokeSensor EOF ;
    public final EObject entryRuleSmokeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmokeSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1965:2: (iv_ruleSmokeSensor= ruleSmokeSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1966:2: iv_ruleSmokeSensor= ruleSmokeSensor EOF
            {
             newCompositeNode(grammarAccess.getSmokeSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4088);
            iv_ruleSmokeSensor=ruleSmokeSensor();

            state._fsp--;

             current =iv_ruleSmokeSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSmokeSensor4098); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1973:1: ruleSmokeSensor returns [EObject current=null] : ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1976:28: ( ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1977:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1977:1: ( () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1977:2: () otherlv_1= 'SmokeSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1977:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1978:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSmokeSensorAccess().getSmokeSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSmokeSensor4144); 

                	newLeafNode(otherlv_1, grammarAccess.getSmokeSensorAccess().getSmokeSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1987:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==11) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1987:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSmokeSensor4157); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmokeSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSmokeSensor4169); 

                        	newLeafNode(otherlv_3, grammarAccess.getSmokeSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSmokeSensor4181); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmokeSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:1999:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2000:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2000:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2001:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmokeSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSmokeSensor4202);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSmokeSensor4214); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2029:1: entryRuleCO2Sensor returns [EObject current=null] : iv_ruleCO2Sensor= ruleCO2Sensor EOF ;
    public final EObject entryRuleCO2Sensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCO2Sensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2030:2: (iv_ruleCO2Sensor= ruleCO2Sensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2031:2: iv_ruleCO2Sensor= ruleCO2Sensor EOF
            {
             newCompositeNode(grammarAccess.getCO2SensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4252);
            iv_ruleCO2Sensor=ruleCO2Sensor();

            state._fsp--;

             current =iv_ruleCO2Sensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCO2Sensor4262); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2038:1: ruleCO2Sensor returns [EObject current=null] : ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2041:28: ( ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2042:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2042:1: ( () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2042:2: () otherlv_1= 'CO2Sensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2042:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2043:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCO2SensorAccess().getCO2SensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCO2Sensor4308); 

                	newLeafNode(otherlv_1, grammarAccess.getCO2SensorAccess().getCO2SensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2052:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==11) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2052:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCO2Sensor4321); 

                        	newLeafNode(otherlv_2, grammarAccess.getCO2SensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCO2Sensor4333); 

                        	newLeafNode(otherlv_3, grammarAccess.getCO2SensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCO2Sensor4345); 

                        	newLeafNode(otherlv_4, grammarAccess.getCO2SensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2064:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2065:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2065:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2066:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCO2SensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCO2Sensor4366);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCO2Sensor4378); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2094:1: entryRuleInfraredLightSensor returns [EObject current=null] : iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF ;
    public final EObject entryRuleInfraredLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraredLightSensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2095:2: (iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2096:2: iv_ruleInfraredLightSensor= ruleInfraredLightSensor EOF
            {
             newCompositeNode(grammarAccess.getInfraredLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4416);
            iv_ruleInfraredLightSensor=ruleInfraredLightSensor();

            state._fsp--;

             current =iv_ruleInfraredLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfraredLightSensor4426); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2103:1: ruleInfraredLightSensor returns [EObject current=null] : ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2106:28: ( ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2107:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2107:1: ( () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2107:2: () otherlv_1= 'InfraredLightSensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2107:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2108:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInfraredLightSensor4472); 

                	newLeafNode(otherlv_1, grammarAccess.getInfraredLightSensorAccess().getInfraredLightSensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2117:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2117:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInfraredLightSensor4485); 

                        	newLeafNode(otherlv_2, grammarAccess.getInfraredLightSensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInfraredLightSensor4497); 

                        	newLeafNode(otherlv_3, grammarAccess.getInfraredLightSensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInfraredLightSensor4509); 

                        	newLeafNode(otherlv_4, grammarAccess.getInfraredLightSensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2129:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2130:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2130:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2131:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInfraredLightSensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInfraredLightSensor4530);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInfraredLightSensor4542); 

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


    // $ANTLR start "entryRuleHasIntegerValue_Impl"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2159:1: entryRuleHasIntegerValue_Impl returns [EObject current=null] : iv_ruleHasIntegerValue_Impl= ruleHasIntegerValue_Impl EOF ;
    public final EObject entryRuleHasIntegerValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasIntegerValue_Impl = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2160:2: (iv_ruleHasIntegerValue_Impl= ruleHasIntegerValue_Impl EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2161:2: iv_ruleHasIntegerValue_Impl= ruleHasIntegerValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getHasIntegerValue_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHasIntegerValue_Impl_in_entryRuleHasIntegerValue_Impl4580);
            iv_ruleHasIntegerValue_Impl=ruleHasIntegerValue_Impl();

            state._fsp--;

             current =iv_ruleHasIntegerValue_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHasIntegerValue_Impl4590); 

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
    // $ANTLR end "entryRuleHasIntegerValue_Impl"


    // $ANTLR start "ruleHasIntegerValue_Impl"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2168:1: ruleHasIntegerValue_Impl returns [EObject current=null] : ( () otherlv_1= 'HasIntegerValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleHasIntegerValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2171:28: ( ( () otherlv_1= 'HasIntegerValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2172:1: ( () otherlv_1= 'HasIntegerValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2172:1: ( () otherlv_1= 'HasIntegerValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2172:2: () otherlv_1= 'HasIntegerValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2172:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2173:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHasIntegerValue_ImplAccess().getHasIntegerValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleHasIntegerValue_Impl4636); 

                	newLeafNode(otherlv_1, grammarAccess.getHasIntegerValue_ImplAccess().getHasIntegerValueKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2182:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==11) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2182:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHasIntegerValue_Impl4649); 

                        	newLeafNode(otherlv_2, grammarAccess.getHasIntegerValue_ImplAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleHasIntegerValue_Impl4661); 

                        	newLeafNode(otherlv_3, grammarAccess.getHasIntegerValue_ImplAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleHasIntegerValue_Impl4673); 

                        	newLeafNode(otherlv_4, grammarAccess.getHasIntegerValue_ImplAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2194:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2195:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2195:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2196:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHasIntegerValue_ImplAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHasIntegerValue_Impl4694);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHasIntegerValue_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHasIntegerValue_Impl4706); 

                        	newLeafNode(otherlv_6, grammarAccess.getHasIntegerValue_ImplAccess().getRightCurlyBracketKeyword_2_4());
                        

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
    // $ANTLR end "ruleHasIntegerValue_Impl"


    // $ANTLR start "entryRuleHumiditySensor"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2224:1: entryRuleHumiditySensor returns [EObject current=null] : iv_ruleHumiditySensor= ruleHumiditySensor EOF ;
    public final EObject entryRuleHumiditySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumiditySensor = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2225:2: (iv_ruleHumiditySensor= ruleHumiditySensor EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2226:2: iv_ruleHumiditySensor= ruleHumiditySensor EOF
            {
             newCompositeNode(grammarAccess.getHumiditySensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor4744);
            iv_ruleHumiditySensor=ruleHumiditySensor();

            state._fsp--;

             current =iv_ruleHumiditySensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumiditySensor4754); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2233:1: ruleHumiditySensor returns [EObject current=null] : ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2236:28: ( ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2237:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2237:1: ( () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2237:2: () otherlv_1= 'HumiditySensor' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2237:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2238:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumiditySensorAccess().getHumiditySensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleHumiditySensor4800); 

                	newLeafNode(otherlv_1, grammarAccess.getHumiditySensorAccess().getHumiditySensorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2247:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2247:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumiditySensor4813); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumiditySensorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleHumiditySensor4825); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumiditySensorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleHumiditySensor4837); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumiditySensorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2259:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2260:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2260:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2261:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumiditySensorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumiditySensor4858);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHumiditySensor4870); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2289:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2290:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2291:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4909);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4920); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2298:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2301:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2302:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2302:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2302:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2302:2: (kw= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==42) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2303:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEInt4959); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4976); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2323:1: entryRuleLightSwitchActuator returns [EObject current=null] : iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF ;
    public final EObject entryRuleLightSwitchActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSwitchActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2324:2: (iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2325:2: iv_ruleLightSwitchActuator= ruleLightSwitchActuator EOF
            {
             newCompositeNode(grammarAccess.getLightSwitchActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5021);
            iv_ruleLightSwitchActuator=ruleLightSwitchActuator();

            state._fsp--;

             current =iv_ruleLightSwitchActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSwitchActuator5031); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2332:1: ruleLightSwitchActuator returns [EObject current=null] : ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2335:28: ( ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2336:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2336:1: ( () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2336:2: () otherlv_1= 'LightSwitchActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2336:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2337:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLightSwitchActuator5077); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSwitchActuatorAccess().getLightSwitchActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2346:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==11) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2346:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLightSwitchActuator5090); 

                        	newLeafNode(otherlv_2, grammarAccess.getLightSwitchActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLightSwitchActuator5102); 

                        	newLeafNode(otherlv_3, grammarAccess.getLightSwitchActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLightSwitchActuator5114); 

                        	newLeafNode(otherlv_4, grammarAccess.getLightSwitchActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2358:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2359:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2359:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2360:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLightSwitchActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLightSwitchActuator5135);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLightSwitchActuator5147); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2388:1: entryRuleWindowActuator returns [EObject current=null] : iv_ruleWindowActuator= ruleWindowActuator EOF ;
    public final EObject entryRuleWindowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2389:2: (iv_ruleWindowActuator= ruleWindowActuator EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2390:2: iv_ruleWindowActuator= ruleWindowActuator EOF
            {
             newCompositeNode(grammarAccess.getWindowActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5185);
            iv_ruleWindowActuator=ruleWindowActuator();

            state._fsp--;

             current =iv_ruleWindowActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWindowActuator5195); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2397:1: ruleWindowActuator returns [EObject current=null] : ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2400:28: ( ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2401:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2401:1: ( () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2401:2: () otherlv_1= 'WindowActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2401:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2402:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWindowActuatorAccess().getWindowActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleWindowActuator5241); 

                	newLeafNode(otherlv_1, grammarAccess.getWindowActuatorAccess().getWindowActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2411:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==11) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2411:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWindowActuator5254); 

                        	newLeafNode(otherlv_2, grammarAccess.getWindowActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleWindowActuator5266); 

                        	newLeafNode(otherlv_3, grammarAccess.getWindowActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleWindowActuator5278); 

                        	newLeafNode(otherlv_4, grammarAccess.getWindowActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2423:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2424:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2424:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2425:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getWindowActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWindowActuator5299);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWindowActuator5311); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2453:1: entryRuleHumidifierActuator returns [EObject current=null] : iv_ruleHumidifierActuator= ruleHumidifierActuator EOF ;
    public final EObject entryRuleHumidifierActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumidifierActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2454:2: (iv_ruleHumidifierActuator= ruleHumidifierActuator EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2455:2: iv_ruleHumidifierActuator= ruleHumidifierActuator EOF
            {
             newCompositeNode(grammarAccess.getHumidifierActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5349);
            iv_ruleHumidifierActuator=ruleHumidifierActuator();

            state._fsp--;

             current =iv_ruleHumidifierActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumidifierActuator5359); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2462:1: ruleHumidifierActuator returns [EObject current=null] : ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2465:28: ( ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2466:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2466:1: ( () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2466:2: () otherlv_1= 'HumidifierActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2466:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2467:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleHumidifierActuator5405); 

                	newLeafNode(otherlv_1, grammarAccess.getHumidifierActuatorAccess().getHumidifierActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2476:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==11) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2476:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHumidifierActuator5418); 

                        	newLeafNode(otherlv_2, grammarAccess.getHumidifierActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleHumidifierActuator5430); 

                        	newLeafNode(otherlv_3, grammarAccess.getHumidifierActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleHumidifierActuator5442); 

                        	newLeafNode(otherlv_4, grammarAccess.getHumidifierActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2488:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2489:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2489:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2490:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHumidifierActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHumidifierActuator5463);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHumidifierActuator5475); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2518:1: entryRuleDoorActuator returns [EObject current=null] : iv_ruleDoorActuator= ruleDoorActuator EOF ;
    public final EObject entryRuleDoorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2519:2: (iv_ruleDoorActuator= ruleDoorActuator EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2520:2: iv_ruleDoorActuator= ruleDoorActuator EOF
            {
             newCompositeNode(grammarAccess.getDoorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5513);
            iv_ruleDoorActuator=ruleDoorActuator();

            state._fsp--;

             current =iv_ruleDoorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoorActuator5523); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2527:1: ruleDoorActuator returns [EObject current=null] : ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2530:28: ( ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2531:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2531:1: ( () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2531:2: () otherlv_1= 'DoorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2531:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2532:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoorActuatorAccess().getDoorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDoorActuator5569); 

                	newLeafNode(otherlv_1, grammarAccess.getDoorActuatorAccess().getDoorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2541:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==11) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2541:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDoorActuator5582); 

                        	newLeafNode(otherlv_2, grammarAccess.getDoorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDoorActuator5594); 

                        	newLeafNode(otherlv_3, grammarAccess.getDoorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDoorActuator5606); 

                        	newLeafNode(otherlv_4, grammarAccess.getDoorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2553:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2554:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2554:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2555:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDoorActuator5627);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDoorActuator5639); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2583:1: entryRuleRadiatorActuator returns [EObject current=null] : iv_ruleRadiatorActuator= ruleRadiatorActuator EOF ;
    public final EObject entryRuleRadiatorActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiatorActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2584:2: (iv_ruleRadiatorActuator= ruleRadiatorActuator EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2585:2: iv_ruleRadiatorActuator= ruleRadiatorActuator EOF
            {
             newCompositeNode(grammarAccess.getRadiatorActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5677);
            iv_ruleRadiatorActuator=ruleRadiatorActuator();

            state._fsp--;

             current =iv_ruleRadiatorActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadiatorActuator5687); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2592:1: ruleRadiatorActuator returns [EObject current=null] : ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2595:28: ( ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2596:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2596:1: ( () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2596:2: () otherlv_1= 'RadiatorActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2596:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2597:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRadiatorActuator5733); 

                	newLeafNode(otherlv_1, grammarAccess.getRadiatorActuatorAccess().getRadiatorActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2606:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==11) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2606:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRadiatorActuator5746); 

                        	newLeafNode(otherlv_2, grammarAccess.getRadiatorActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRadiatorActuator5758); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadiatorActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRadiatorActuator5770); 

                        	newLeafNode(otherlv_4, grammarAccess.getRadiatorActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2618:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2619:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2619:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2620:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRadiatorActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRadiatorActuator5791);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRadiatorActuator5803); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2648:1: entryRuleAudioAlarmActuator returns [EObject current=null] : iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF ;
    public final EObject entryRuleAudioAlarmActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioAlarmActuator = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2649:2: (iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2650:2: iv_ruleAudioAlarmActuator= ruleAudioAlarmActuator EOF
            {
             newCompositeNode(grammarAccess.getAudioAlarmActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator5841);
            iv_ruleAudioAlarmActuator=ruleAudioAlarmActuator();

            state._fsp--;

             current =iv_ruleAudioAlarmActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAudioAlarmActuator5851); 

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
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2657:1: ruleAudioAlarmActuator returns [EObject current=null] : ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
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
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2660:28: ( ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2661:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2661:1: ( () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2661:2: () otherlv_1= 'AudioAlarmActuator' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2661:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2662:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAudioAlarmActuator5897); 

                	newLeafNode(otherlv_1, grammarAccess.getAudioAlarmActuatorAccess().getAudioAlarmActuatorKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2671:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==11) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2671:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAudioAlarmActuator5910); 

                        	newLeafNode(otherlv_2, grammarAccess.getAudioAlarmActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAudioAlarmActuator5922); 

                        	newLeafNode(otherlv_3, grammarAccess.getAudioAlarmActuatorAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAudioAlarmActuator5934); 

                        	newLeafNode(otherlv_4, grammarAccess.getAudioAlarmActuatorAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2683:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2684:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2684:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2685:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAudioAlarmActuatorAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAudioAlarmActuator5955);
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

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAudioAlarmActuator5967); 

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


    // $ANTLR start "entryRuleHasIntValue_Impl"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2713:1: entryRuleHasIntValue_Impl returns [EObject current=null] : iv_ruleHasIntValue_Impl= ruleHasIntValue_Impl EOF ;
    public final EObject entryRuleHasIntValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasIntValue_Impl = null;


        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2714:2: (iv_ruleHasIntValue_Impl= ruleHasIntValue_Impl EOF )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2715:2: iv_ruleHasIntValue_Impl= ruleHasIntValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getHasIntValue_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHasIntValue_Impl_in_entryRuleHasIntValue_Impl6005);
            iv_ruleHasIntValue_Impl=ruleHasIntValue_Impl();

            state._fsp--;

             current =iv_ruleHasIntValue_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHasIntValue_Impl6015); 

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
    // $ANTLR end "entryRuleHasIntValue_Impl"


    // $ANTLR start "ruleHasIntValue_Impl"
    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2722:1: ruleHasIntValue_Impl returns [EObject current=null] : ( () otherlv_1= 'HasIntValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleHasIntValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valueState_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2725:28: ( ( () otherlv_1= 'HasIntValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? ) )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2726:1: ( () otherlv_1= 'HasIntValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2726:1: ( () otherlv_1= 'HasIntValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )? )
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2726:2: () otherlv_1= 'HasIntValue' (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            {
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2726:2: ()
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHasIntValue_ImplAccess().getHasIntValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleHasIntValue_Impl6061); 

                	newLeafNode(otherlv_1, grammarAccess.getHasIntValue_ImplAccess().getHasIntValueKeyword_1());
                
            // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2736:1: (otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==11) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2736:3: otherlv_2= '{' otherlv_3= 'valueState' otherlv_4= '=' ( (lv_valueState_5_0= ruleEInt ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHasIntValue_Impl6074); 

                        	newLeafNode(otherlv_2, grammarAccess.getHasIntValue_ImplAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleHasIntValue_Impl6086); 

                        	newLeafNode(otherlv_3, grammarAccess.getHasIntValue_ImplAccess().getValueStateKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleHasIntValue_Impl6098); 

                        	newLeafNode(otherlv_4, grammarAccess.getHasIntValue_ImplAccess().getEqualsSignKeyword_2_2());
                        
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2748:1: ( (lv_valueState_5_0= ruleEInt ) )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2749:1: (lv_valueState_5_0= ruleEInt )
                    {
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2749:1: (lv_valueState_5_0= ruleEInt )
                    // ../dk.itu.mdd.policyengine.PeDsl/src-gen/dk/itu/mdd/policyengine/parser/antlr/internal/InternalPeDsl.g:2750:3: lv_valueState_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHasIntValue_ImplAccess().getValueStateEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHasIntValue_Impl6119);
                    lv_valueState_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHasIntValue_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"valueState",
                            		lv_valueState_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHasIntValue_Impl6131); 

                        	newLeafNode(otherlv_6, grammarAccess.getHasIntValue_ImplAccess().getRightCurlyBracketKeyword_2_4());
                        

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
    // $ANTLR end "ruleHasIntValue_Impl"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModel140 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleModel152 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel174 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleModel195 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel220 = new BitSet(new long[]{0x0000000000013000L});
        public static final BitSet FOLLOW_ruleBuilding_in_ruleModel241 = new BitSet(new long[]{0x0000000000013000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel266 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_ruleState_in_ruleModel287 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_12_in_ruleModel302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_ruleActuator395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_ruleActuator422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_ruleActuator449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_ruleActuator476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_ruleActuator503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_ruleActuator530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasIntValue_Impl_in_ruleActuator557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_ruleSensor649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleSensor676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleSensor703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_ruleSensor730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleSensor757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_ruleSensor784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_ruleSensor811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_ruleSensor838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasIntegerValue_Impl_in_ruleSensor865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_ruleSensor892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString928 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuilding_in_entryRuleBuilding1050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuilding1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBuilding1106 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBuilding1127 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleBuilding1139 = new BitSet(new long[]{0x000000003E441000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleBuilding1161 = new BitSet(new long[]{0x000000003E441000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleBuilding1182 = new BitSet(new long[]{0x000000003E441000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleBuilding1207 = new BitSet(new long[]{0x000000002E441000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleBuilding1228 = new BitSet(new long[]{0x000000002E441000L});
        public static final BitSet FOLLOW_ruleCTS_in_ruleBuilding1252 = new BitSet(new long[]{0x000000000E401000L});
        public static final BitSet FOLLOW_ruleAccessControl_in_ruleBuilding1274 = new BitSet(new long[]{0x000000000E001000L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_ruleBuilding1296 = new BitSet(new long[]{0x000000000C001000L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_ruleBuilding1318 = new BitSet(new long[]{0x0000000008001000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1341 = new BitSet(new long[]{0x0000000008001000L});
        public static final BitSet FOLLOW_ruleFloor_in_ruleBuilding1362 = new BitSet(new long[]{0x0000000008001000L});
        public static final BitSet FOLLOW_12_in_ruleBuilding1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom1413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoom1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRoom1469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1490 = new BitSet(new long[]{0x0000000000008800L});
        public static final BitSet FOLLOW_15_in_ruleRoom1503 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoom1526 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRoom1540 = new BitSet(new long[]{0x0000000030001000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom1562 = new BitSet(new long[]{0x0000000030001000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleRoom1583 = new BitSet(new long[]{0x0000000030001000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom1608 = new BitSet(new long[]{0x0000000020001000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleRoom1629 = new BitSet(new long[]{0x0000000020001000L});
        public static final BitSet FOLLOW_12_in_ruleRoom1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleState1736 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1757 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleState1770 = new BitSet(new long[]{0x0003F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleState1791 = new BitSet(new long[]{0x0003F80000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleState1812 = new BitSet(new long[]{0x0003F80000000002L});
        public static final BitSet FOLLOW_ruleCTS_in_entryRuleCTS1851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCTS1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleCTS1907 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS1919 = new BitSet(new long[]{0x0000000000281000L});
        public static final BitSet FOLLOW_19_in_ruleCTS1932 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS1944 = new BitSet(new long[]{0x000003FE40000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS1965 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_20_in_ruleCTS1978 = new BitSet(new long[]{0x000003FE40000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleCTS1999 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_12_in_ruleCTS2013 = new BitSet(new long[]{0x0000000000201000L});
        public static final BitSet FOLLOW_21_in_ruleCTS2028 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCTS2040 = new BitSet(new long[]{0x0003F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS2061 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_20_in_ruleCTS2074 = new BitSet(new long[]{0x0003F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleCTS2095 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_12_in_ruleCTS2109 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCTS2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessControl_in_entryRuleAccessControl2159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessControl2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAccessControl2215 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2227 = new BitSet(new long[]{0x0000000001801000L});
        public static final BitSet FOLLOW_23_in_ruleAccessControl2240 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2252 = new BitSet(new long[]{0x000003FE40000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl2273 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_20_in_ruleAccessControl2286 = new BitSet(new long[]{0x000003FE40000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleAccessControl2307 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_12_in_ruleAccessControl2321 = new BitSet(new long[]{0x0000000001001000L});
        public static final BitSet FOLLOW_24_in_ruleAccessControl2336 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAccessControl2348 = new BitSet(new long[]{0x0003F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl2369 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_20_in_ruleAccessControl2382 = new BitSet(new long[]{0x0003F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleAccessControl2403 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_12_in_ruleAccessControl2417 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAccessControl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarSystem_in_entryRuleCalendarSystem2467 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarSystem2477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleCalendarSystem2523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeetingScheduleSystem_in_entryRuleMeetingScheduleSystem2559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeetingScheduleSystem2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleMeetingScheduleSystem2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloor_in_entryRuleFloor2651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloor2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleFloor2707 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFloor2728 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleFloor2740 = new BitSet(new long[]{0x0000000030005000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleFloor2762 = new BitSet(new long[]{0x0000000030005000L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_ruleFloor2783 = new BitSet(new long[]{0x0000000030005000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleFloor2808 = new BitSet(new long[]{0x0000000020005000L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_ruleFloor2829 = new BitSet(new long[]{0x0000000020005000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor2854 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_ruleRoom_in_ruleFloor2875 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_12_in_ruleFloor2890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorComponent_in_entryRuleSensorComponent2926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorComponent2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleSensorComponent2982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensorComponent3003 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleSensorComponent3016 = new BitSet(new long[]{0x000003FE40000000L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent3037 = new BitSet(new long[]{0x000003FE40000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleSensorComponent3058 = new BitSet(new long[]{0x000003FE40000002L});
        public static final BitSet FOLLOW_ruleActuatorComponent_in_entryRuleActuatorComponent3097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuatorComponent3107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleActuatorComponent3153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActuatorComponent3174 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleActuatorComponent3187 = new BitSet(new long[]{0x0003F80000000000L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent3208 = new BitSet(new long[]{0x0003F80000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleActuatorComponent3229 = new BitSet(new long[]{0x0003F80000000002L});
        public static final BitSet FOLLOW_ruleMotionSensor_in_entryRuleMotionSensor3268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMotionSensor3278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleMotionSensor3324 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleMotionSensor3337 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMotionSensor3349 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMotionSensor3361 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMotionSensor3382 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMotionSensor3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor3432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor3442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleTemperatureSensor3488 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTemperatureSensor3501 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTemperatureSensor3513 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleTemperatureSensor3525 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTemperatureSensor3546 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTemperatureSensor3558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor3596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor3606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rulePressureSensor3652 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulePressureSensor3665 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulePressureSensor3677 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePressureSensor3689 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePressureSensor3710 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePressureSensor3722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTouchSensor_in_entryRuleTouchSensor3760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTouchSensor3770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleTouchSensor3816 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleTouchSensor3829 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTouchSensor3841 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleTouchSensor3853 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTouchSensor3874 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTouchSensor3886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor3924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor3934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLightSensor3980 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSensor3993 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLightSensor4005 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleLightSensor4017 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSensor4038 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLightSensor4050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSmokeSensor_in_entryRuleSmokeSensor4088 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSmokeSensor4098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleSmokeSensor4144 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleSmokeSensor4157 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSmokeSensor4169 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSmokeSensor4181 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSmokeSensor4202 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSmokeSensor4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCO2Sensor_in_entryRuleCO2Sensor4252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCO2Sensor4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCO2Sensor4308 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleCO2Sensor4321 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCO2Sensor4333 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCO2Sensor4345 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCO2Sensor4366 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCO2Sensor4378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfraredLightSensor_in_entryRuleInfraredLightSensor4416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfraredLightSensor4426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleInfraredLightSensor4472 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleInfraredLightSensor4485 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleInfraredLightSensor4497 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInfraredLightSensor4509 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInfraredLightSensor4530 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInfraredLightSensor4542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasIntegerValue_Impl_in_entryRuleHasIntegerValue_Impl4580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHasIntegerValue_Impl4590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleHasIntegerValue_Impl4636 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHasIntegerValue_Impl4649 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleHasIntegerValue_Impl4661 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleHasIntegerValue_Impl4673 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHasIntegerValue_Impl4694 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHasIntegerValue_Impl4706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor4744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumiditySensor4754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleHumiditySensor4800 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumiditySensor4813 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleHumiditySensor4825 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleHumiditySensor4837 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumiditySensor4858 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHumiditySensor4870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEInt4959 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSwitchActuator_in_entryRuleLightSwitchActuator5021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSwitchActuator5031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLightSwitchActuator5077 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleLightSwitchActuator5090 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLightSwitchActuator5102 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleLightSwitchActuator5114 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLightSwitchActuator5135 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLightSwitchActuator5147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindowActuator_in_entryRuleWindowActuator5185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWindowActuator5195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleWindowActuator5241 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleWindowActuator5254 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleWindowActuator5266 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleWindowActuator5278 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWindowActuator5299 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWindowActuator5311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumidifierActuator_in_entryRuleHumidifierActuator5349 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumidifierActuator5359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleHumidifierActuator5405 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHumidifierActuator5418 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleHumidifierActuator5430 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleHumidifierActuator5442 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHumidifierActuator5463 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHumidifierActuator5475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoorActuator_in_entryRuleDoorActuator5513 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoorActuator5523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDoorActuator5569 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleDoorActuator5582 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDoorActuator5594 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDoorActuator5606 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDoorActuator5627 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDoorActuator5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadiatorActuator_in_entryRuleRadiatorActuator5677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadiatorActuator5687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleRadiatorActuator5733 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleRadiatorActuator5746 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRadiatorActuator5758 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRadiatorActuator5770 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRadiatorActuator5791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRadiatorActuator5803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAudioAlarmActuator_in_entryRuleAudioAlarmActuator5841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAudioAlarmActuator5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAudioAlarmActuator5897 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAudioAlarmActuator5910 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleAudioAlarmActuator5922 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAudioAlarmActuator5934 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAudioAlarmActuator5955 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAudioAlarmActuator5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasIntValue_Impl_in_entryRuleHasIntValue_Impl6005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHasIntValue_Impl6015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleHasIntValue_Impl6061 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleHasIntValue_Impl6074 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleHasIntValue_Impl6086 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleHasIntValue_Impl6098 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHasIntValue_Impl6119 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHasIntValue_Impl6131 = new BitSet(new long[]{0x0000000000000002L});
    }


}