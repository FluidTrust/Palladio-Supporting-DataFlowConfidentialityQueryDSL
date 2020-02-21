package de.sebinside.dcp.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.sebinside.dcp.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASSIGNEMENT_OPERATOR", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'valueset'", "'['", "','", "']'", "'attribute'", "'property'", "'class'", "'{'", "'}'", "'.'", "'!'", "'&'", "'constraint'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'FLOWS'", "'NEVER'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ASSIGNEMENT_OPERATOR=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalDSL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalDSL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=17 && LA1_0<=19)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalDSL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalDSL.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"de.sebinside.dcp.dsl.DSL.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDSL.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDSL.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDSL.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDSL.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType | this_CharacteristicClass_3= ruleCharacteristicClass | this_Constraint_4= ruleConstraint ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_ValueSet_1 = null;

        EObject this_CharacteristicsType_2 = null;

        EObject this_CharacteristicClass_3 = null;

        EObject this_Constraint_4 = null;



        	enterRule();

        try {
            // InternalDSL.g:113:2: ( (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType | this_CharacteristicClass_3= ruleCharacteristicClass | this_Constraint_4= ruleConstraint ) )
            // InternalDSL.g:114:2: (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType | this_CharacteristicClass_3= ruleCharacteristicClass | this_Constraint_4= ruleConstraint )
            {
            // InternalDSL.g:114:2: (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType | this_CharacteristicClass_3= ruleCharacteristicClass | this_Constraint_4= ruleConstraint )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 17:
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:124:3: this_ValueSet_1= ruleValueSet
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getValueSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueSet_1=ruleValueSet();

                    state._fsp--;


                    			current = this_ValueSet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:133:3: this_CharacteristicsType_2= ruleCharacteristicsType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicsTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicsType_2=ruleCharacteristicsType();

                    state._fsp--;


                    			current = this_CharacteristicsType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:142:3: this_CharacteristicClass_3= ruleCharacteristicClass
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicClass_3=ruleCharacteristicClass();

                    state._fsp--;


                    			current = this_CharacteristicClass_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:151:3: this_Constraint_4= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_4=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_4;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleDataType"
    // InternalDSL.g:163:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDSL.g:163:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDSL.g:164:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDSL.g:170:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:176:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDSL.g:177:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDSL.g:177:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDSL.g:178:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDSL.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleValueSet"
    // InternalDSL.g:204:1: entryRuleValueSet returns [EObject current=null] : iv_ruleValueSet= ruleValueSet EOF ;
    public final EObject entryRuleValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSet = null;


        try {
            // InternalDSL.g:204:49: (iv_ruleValueSet= ruleValueSet EOF )
            // InternalDSL.g:205:2: iv_ruleValueSet= ruleValueSet EOF
            {
             newCompositeNode(grammarAccess.getValueSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueSet=ruleValueSet();

            state._fsp--;

             current =iv_ruleValueSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValueSet"


    // $ANTLR start "ruleValueSet"
    // InternalDSL.g:211:1: ruleValueSet returns [EObject current=null] : (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' ) ;
    public final EObject ruleValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNEMENT_OPERATOR_2=null;
        Token otherlv_3=null;
        Token lv_members_4_0=null;
        Token otherlv_5=null;
        Token lv_members_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDSL.g:217:2: ( (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' ) )
            // InternalDSL.g:218:2: (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' )
            {
            // InternalDSL.g:218:2: (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' )
            // InternalDSL.g:219:3: otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getValueSetAccess().getValuesetKeyword_0());
            		
            // InternalDSL.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValueSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_ASSIGNEMENT_OPERATOR_2=(Token)match(input,RULE_ASSIGNEMENT_OPERATOR,FOLLOW_6); 

            			newLeafNode(this_ASSIGNEMENT_OPERATOR_2, grammarAccess.getValueSetAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getValueSetAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalDSL.g:249:3: ( (lv_members_4_0= RULE_ID ) )
            // InternalDSL.g:250:4: (lv_members_4_0= RULE_ID )
            {
            // InternalDSL.g:250:4: (lv_members_4_0= RULE_ID )
            // InternalDSL.g:251:5: lv_members_4_0= RULE_ID
            {
            lv_members_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_members_4_0, grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueSetRule());
            					}
            					addWithLastConsumed(
            						current,
            						"members",
            						lv_members_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDSL.g:267:3: (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:268:4: otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getValueSetAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDSL.g:272:4: ( (lv_members_6_0= RULE_ID ) )
            	    // InternalDSL.g:273:5: (lv_members_6_0= RULE_ID )
            	    {
            	    // InternalDSL.g:273:5: (lv_members_6_0= RULE_ID )
            	    // InternalDSL.g:274:6: lv_members_6_0= RULE_ID
            	    {
            	    lv_members_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(lv_members_6_0, grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_5_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getValueSetRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"members",
            	    							lv_members_6_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getValueSetAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleValueSet"


    // $ANTLR start "entryRuleCharacteristicsType"
    // InternalDSL.g:299:1: entryRuleCharacteristicsType returns [EObject current=null] : iv_ruleCharacteristicsType= ruleCharacteristicsType EOF ;
    public final EObject entryRuleCharacteristicsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicsType = null;


        try {
            // InternalDSL.g:299:60: (iv_ruleCharacteristicsType= ruleCharacteristicsType EOF )
            // InternalDSL.g:300:2: iv_ruleCharacteristicsType= ruleCharacteristicsType EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicsType=ruleCharacteristicsType();

            state._fsp--;

             current =iv_ruleCharacteristicsType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicsType"


    // $ANTLR start "ruleCharacteristicsType"
    // InternalDSL.g:306:1: ruleCharacteristicsType returns [EObject current=null] : (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType ) ;
    public final EObject ruleCharacteristicsType() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeType_0 = null;

        EObject this_PropertyType_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:312:2: ( (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType ) )
            // InternalDSL.g:313:2: (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType )
            {
            // InternalDSL.g:313:2: (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:314:3: this_AttributeType_0= ruleAttributeType
                    {

                    			newCompositeNode(grammarAccess.getCharacteristicsTypeAccess().getAttributeTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeType_0=ruleAttributeType();

                    state._fsp--;


                    			current = this_AttributeType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:323:3: this_PropertyType_1= rulePropertyType
                    {

                    			newCompositeNode(grammarAccess.getCharacteristicsTypeAccess().getPropertyTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyType_1=rulePropertyType();

                    state._fsp--;


                    			current = this_PropertyType_1;
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
    // $ANTLR end "ruleCharacteristicsType"


    // $ANTLR start "entryRuleAttributeType"
    // InternalDSL.g:335:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalDSL.g:335:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalDSL.g:336:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalDSL.g:342:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNEMENT_OPERATOR_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:348:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:349:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:349:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:350:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0());
            		
            // InternalDSL.g:354:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:355:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:355:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:356:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_ASSIGNEMENT_OPERATOR_2=(Token)match(input,RULE_ASSIGNEMENT_OPERATOR,FOLLOW_4); 

            			newLeafNode(this_ASSIGNEMENT_OPERATOR_2, grammarAccess.getAttributeTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2());
            		
            // InternalDSL.g:376:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:377:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:377:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:378:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeTypeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getValuesetValueSetCrossReference_3_0());
            				

            }


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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulePropertyType"
    // InternalDSL.g:393:1: entryRulePropertyType returns [EObject current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final EObject entryRulePropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyType = null;


        try {
            // InternalDSL.g:393:53: (iv_rulePropertyType= rulePropertyType EOF )
            // InternalDSL.g:394:2: iv_rulePropertyType= rulePropertyType EOF
            {
             newCompositeNode(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyType=rulePropertyType();

            state._fsp--;

             current =iv_rulePropertyType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // InternalDSL.g:400:1: rulePropertyType returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePropertyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNEMENT_OPERATOR_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:406:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:407:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:407:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:408:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0());
            		
            // InternalDSL.g:412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:413:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:414:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_ASSIGNEMENT_OPERATOR_2=(Token)match(input,RULE_ASSIGNEMENT_OPERATOR,FOLLOW_4); 

            			newLeafNode(this_ASSIGNEMENT_OPERATOR_2, grammarAccess.getPropertyTypeAccess().getASSIGNEMENT_OPERATORTerminalRuleCall_2());
            		
            // InternalDSL.g:434:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:435:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:435:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:436:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyTypeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getPropertyTypeAccess().getValuesetValueSetCrossReference_3_0());
            				

            }


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
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleCharacteristicClass"
    // InternalDSL.g:451:1: entryRuleCharacteristicClass returns [EObject current=null] : iv_ruleCharacteristicClass= ruleCharacteristicClass EOF ;
    public final EObject entryRuleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicClass = null;


        try {
            // InternalDSL.g:451:60: (iv_ruleCharacteristicClass= ruleCharacteristicClass EOF )
            // InternalDSL.g:452:2: iv_ruleCharacteristicClass= ruleCharacteristicClass EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicClass=ruleCharacteristicClass();

            state._fsp--;

             current =iv_ruleCharacteristicClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicClass"


    // $ANTLR start "ruleCharacteristicClass"
    // InternalDSL.g:458:1: ruleCharacteristicClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:464:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' ) )
            // InternalDSL.g:465:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' )
            {
            // InternalDSL.g:465:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' )
            // InternalDSL.g:466:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
            		
            // InternalDSL.g:470:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:471:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:471:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:472:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:492:3: ( (lv_members_3_0= ruleCharacteristicSelector ) )
            // InternalDSL.g:493:4: (lv_members_3_0= ruleCharacteristicSelector )
            {
            // InternalDSL.g:493:4: (lv_members_3_0= ruleCharacteristicSelector )
            // InternalDSL.g:494:5: lv_members_3_0= ruleCharacteristicSelector
            {

            					newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_members_3_0=ruleCharacteristicSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
            					}
            					add(
            						current,
            						"members",
            						lv_members_3_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:511:3: (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:512:4: otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDSL.g:516:4: ( (lv_members_5_0= ruleCharacteristicSelector ) )
            	    // InternalDSL.g:517:5: (lv_members_5_0= ruleCharacteristicSelector )
            	    {
            	    // InternalDSL.g:517:5: (lv_members_5_0= ruleCharacteristicSelector )
            	    // InternalDSL.g:518:6: lv_members_5_0= ruleCharacteristicSelector
            	    {

            	    						newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_members_5_0=ruleCharacteristicSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"members",
            	    							lv_members_5_0,
            	    							"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCharacteristicClass"


    // $ANTLR start "entryRuleCharacteristicSelector"
    // InternalDSL.g:544:1: entryRuleCharacteristicSelector returns [EObject current=null] : iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF ;
    public final EObject entryRuleCharacteristicSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSelector = null;


        try {
            // InternalDSL.g:544:63: (iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF )
            // InternalDSL.g:545:2: iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicSelector=ruleCharacteristicSelector();

            state._fsp--;

             current =iv_ruleCharacteristicSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacteristicSelector"


    // $ANTLR start "ruleCharacteristicSelector"
    // InternalDSL.g:551:1: ruleCharacteristicSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) ) ;
    public final EObject ruleCharacteristicSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_negated_2_0=null;
        Token lv_literals_3_0=null;
        Token otherlv_4=null;
        Token lv_literals_5_0=null;
        Token otherlv_6=null;
        Token lv_literals_7_0=null;
        Token lv_conjuncted_8_0=null;
        Token lv_literals_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalDSL.g:557:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) ) )
            // InternalDSL.g:558:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) )
            {
            // InternalDSL.g:558:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) )
            // InternalDSL.g:559:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) )
            {
            // InternalDSL.g:559:3: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:560:4: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:560:4: (otherlv_0= RULE_ID )
            // InternalDSL.g:561:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getCharacteristicSelectorAccess().getRefCharacteristicsTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacteristicSelectorAccess().getFullStopKeyword_1());
            		
            // InternalDSL.g:576:3: ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:577:4: ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) )
                    {
                    // InternalDSL.g:577:4: ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) )
                    // InternalDSL.g:578:5: ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) )
                    {
                    // InternalDSL.g:578:5: ( (lv_negated_2_0= '!' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDSL.g:579:6: (lv_negated_2_0= '!' )
                            {
                            // InternalDSL.g:579:6: (lv_negated_2_0= '!' )
                            // InternalDSL.g:580:7: lv_negated_2_0= '!'
                            {
                            lv_negated_2_0=(Token)match(input,23,FOLLOW_4); 

                            							newLeafNode(lv_negated_2_0, grammarAccess.getCharacteristicSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
                            							}
                            							setWithLastConsumed(current, "negated", true, "!");
                            						

                            }


                            }
                            break;

                    }

                    // InternalDSL.g:592:5: ( (lv_literals_3_0= RULE_ID ) )
                    // InternalDSL.g:593:6: (lv_literals_3_0= RULE_ID )
                    {
                    // InternalDSL.g:593:6: (lv_literals_3_0= RULE_ID )
                    // InternalDSL.g:594:7: lv_literals_3_0= RULE_ID
                    {
                    lv_literals_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(lv_literals_3_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"literals",
                    								lv_literals_3_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:612:4: (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' )
                    {
                    // InternalDSL.g:612:4: (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' )
                    // InternalDSL.g:613:5: otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getCharacteristicSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalDSL.g:617:5: ( (lv_literals_5_0= RULE_ID ) )
                    // InternalDSL.g:618:6: (lv_literals_5_0= RULE_ID )
                    {
                    // InternalDSL.g:618:6: (lv_literals_5_0= RULE_ID )
                    // InternalDSL.g:619:7: lv_literals_5_0= RULE_ID
                    {
                    lv_literals_5_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    							newLeafNode(lv_literals_5_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"literals",
                    								lv_literals_5_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    // InternalDSL.g:635:5: ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* )
                    int alt9=2;
                    switch ( input.LA(1) ) {
                    case 15:
                        {
                        alt9=1;
                        }
                        break;
                    case 16:
                        {
                        alt9=1;
                        }
                        break;
                    case 24:
                        {
                        alt9=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalDSL.g:636:6: (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )*
                            {
                            // InternalDSL.g:636:6: (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==15) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalDSL.g:637:7: otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) )
                            	    {
                            	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                            	    							newLeafNode(otherlv_6, grammarAccess.getCharacteristicSelectorAccess().getCommaKeyword_2_1_2_0_0());
                            	    						
                            	    // InternalDSL.g:641:7: ( (lv_literals_7_0= RULE_ID ) )
                            	    // InternalDSL.g:642:8: (lv_literals_7_0= RULE_ID )
                            	    {
                            	    // InternalDSL.g:642:8: (lv_literals_7_0= RULE_ID )
                            	    // InternalDSL.g:643:9: lv_literals_7_0= RULE_ID
                            	    {
                            	    lv_literals_7_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                            	    									newLeafNode(lv_literals_7_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_0_1_0());
                            	    								

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
                            	    									}
                            	    									addWithLastConsumed(
                            	    										current,
                            	    										"literals",
                            	    										lv_literals_7_0,
                            	    										"org.eclipse.xtext.common.Terminals.ID");
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalDSL.g:661:6: ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )*
                            {
                            // InternalDSL.g:661:6: ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==24) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalDSL.g:662:7: ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) )
                            	    {
                            	    // InternalDSL.g:662:7: ( (lv_conjuncted_8_0= '&' ) )
                            	    // InternalDSL.g:663:8: (lv_conjuncted_8_0= '&' )
                            	    {
                            	    // InternalDSL.g:663:8: (lv_conjuncted_8_0= '&' )
                            	    // InternalDSL.g:664:9: lv_conjuncted_8_0= '&'
                            	    {
                            	    lv_conjuncted_8_0=(Token)match(input,24,FOLLOW_4); 

                            	    									newLeafNode(lv_conjuncted_8_0, grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0());
                            	    								

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
                            	    									}
                            	    									setWithLastConsumed(current, "conjuncted", true, "&");
                            	    								

                            	    }


                            	    }

                            	    // InternalDSL.g:676:7: ( (lv_literals_9_0= RULE_ID ) )
                            	    // InternalDSL.g:677:8: (lv_literals_9_0= RULE_ID )
                            	    {
                            	    // InternalDSL.g:677:8: (lv_literals_9_0= RULE_ID )
                            	    // InternalDSL.g:678:9: lv_literals_9_0= RULE_ID
                            	    {
                            	    lv_literals_9_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                            	    									newLeafNode(lv_literals_9_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralsIDTerminalRuleCall_2_1_2_1_1_0());
                            	    								

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
                            	    									}
                            	    									addWithLastConsumed(
                            	    										current,
                            	    										"literals",
                            	    										lv_literals_9_0,
                            	    										"org.eclipse.xtext.common.Terminals.ID");
                            	    								

                            	    }


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

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getCharacteristicSelectorAccess().getRightSquareBracketKeyword_2_1_3());
                    				

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
    // $ANTLR end "ruleCharacteristicSelector"


    // $ANTLR start "entryRuleConstraint"
    // InternalDSL.g:706:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDSL.g:706:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDSL.g:707:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDSL.g:713:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:719:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) )
            // InternalDSL.g:720:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            {
            // InternalDSL.g:720:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            // InternalDSL.g:721:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalDSL.g:725:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDSL.g:726:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDSL.g:726:4: (lv_name_1_0= RULE_STRING )
            // InternalDSL.g:727:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:747:3: ( (lv_rule_3_0= ruleRule ) )
            // InternalDSL.g:748:4: (lv_rule_3_0= ruleRule )
            {
            // InternalDSL.g:748:4: (lv_rule_3_0= ruleRule )
            // InternalDSL.g:749:5: lv_rule_3_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_rule_3_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_3_0,
            						"de.sebinside.dcp.dsl.DSL.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRule"
    // InternalDSL.g:774:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDSL.g:774:45: (iv_ruleRule= ruleRule EOF )
            // InternalDSL.g:775:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDSL.g:781:1: ruleRule returns [EObject current=null] : ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_dataSelectors_0_0 = null;

        EObject lv_dataSelectors_2_0 = null;

        EObject lv_statement_3_0 = null;

        EObject lv_destinationSelectors_4_0 = null;

        EObject lv_destinationSelectors_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:787:2: ( ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ) )
            // InternalDSL.g:788:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* )
            {
            // InternalDSL.g:788:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* )
            // InternalDSL.g:789:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            {
            // InternalDSL.g:789:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) )
            // InternalDSL.g:790:4: (lv_dataSelectors_0_0= ruleDataSelector )
            {
            // InternalDSL.g:790:4: (lv_dataSelectors_0_0= ruleDataSelector )
            // InternalDSL.g:791:5: lv_dataSelectors_0_0= ruleDataSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_dataSelectors_0_0=ruleDataSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"dataSelectors",
            						lv_dataSelectors_0_0,
            						"de.sebinside.dcp.dsl.DSL.DataSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:808:3: (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:809:4: otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalDSL.g:813:4: ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    // InternalDSL.g:814:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    {
            	    // InternalDSL.g:814:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    // InternalDSL.g:815:6: lv_dataSelectors_2_0= ruleDataSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_dataSelectors_2_0=ruleDataSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataSelectors",
            	    							lv_dataSelectors_2_0,
            	    							"de.sebinside.dcp.dsl.DSL.DataSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDSL.g:833:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalDSL.g:834:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalDSL.g:834:4: (lv_statement_3_0= ruleStatement )
            // InternalDSL.g:835:5: lv_statement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_statement_3_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"de.sebinside.dcp.dsl.DSL.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:852:3: ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) )
            // InternalDSL.g:853:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            {
            // InternalDSL.g:853:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            // InternalDSL.g:854:5: lv_destinationSelectors_4_0= ruleDestinationSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_destinationSelectors_4_0=ruleDestinationSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"destinationSelectors",
            						lv_destinationSelectors_4_0,
            						"de.sebinside.dcp.dsl.DSL.DestinationSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:871:3: (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:872:4: otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_18); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
            	    			
            	    // InternalDSL.g:876:4: ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    // InternalDSL.g:877:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    {
            	    // InternalDSL.g:877:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    // InternalDSL.g:878:6: lv_destinationSelectors_6_0= ruleDestinationSelector
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_destinationSelectors_6_0=ruleDestinationSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"destinationSelectors",
            	    							lv_destinationSelectors_6_0,
            	    							"de.sebinside.dcp.dsl.DSL.DestinationSelector");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDataSelector"
    // InternalDSL.g:900:1: entryRuleDataSelector returns [EObject current=null] : iv_ruleDataSelector= ruleDataSelector EOF ;
    public final EObject entryRuleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSelector = null;


        try {
            // InternalDSL.g:900:53: (iv_ruleDataSelector= ruleDataSelector EOF )
            // InternalDSL.g:901:2: iv_ruleDataSelector= ruleDataSelector EOF
            {
             newCompositeNode(grammarAccess.getDataSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSelector=ruleDataSelector();

            state._fsp--;

             current =iv_ruleDataSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataSelector"


    // $ANTLR start "ruleDataSelector"
    // InternalDSL.g:907:1: ruleDataSelector returns [EObject current=null] : (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) ;
    public final EObject ruleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSelector_0 = null;

        EObject this_AttributeClassSelector_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:913:2: ( (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) )
            // InternalDSL.g:914:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            {
            // InternalDSL.g:914:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:915:3: this_AttributeSelector_0= ruleAttributeSelector
                    {

                    			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeSelector_0=ruleAttributeSelector();

                    state._fsp--;


                    			current = this_AttributeSelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:924:3: this_AttributeClassSelector_1= ruleAttributeClassSelector
                    {

                    			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeClassSelector_1=ruleAttributeClassSelector();

                    state._fsp--;


                    			current = this_AttributeClassSelector_1;
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
    // $ANTLR end "ruleDataSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // InternalDSL.g:936:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // InternalDSL.g:936:58: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // InternalDSL.g:937:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
             newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;

             current =iv_ruleAttributeSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // InternalDSL.g:943:1: ruleAttributeSelector returns [EObject current=null] : (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:949:2: ( (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) )
            // InternalDSL.g:950:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            {
            // InternalDSL.g:950:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            // InternalDSL.g:951:3: otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
            		
            // InternalDSL.g:955:3: ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            // InternalDSL.g:956:4: (lv_ref_1_0= ruleCharacteristicSelector )
            {
            // InternalDSL.g:956:4: (lv_ref_1_0= ruleCharacteristicSelector )
            // InternalDSL.g:957:5: lv_ref_1_0= ruleCharacteristicSelector
            {

            					newCompositeNode(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_1_0=ruleCharacteristicSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleAttributeClassSelector"
    // InternalDSL.g:978:1: entryRuleAttributeClassSelector returns [EObject current=null] : iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF ;
    public final EObject entryRuleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassSelector = null;


        try {
            // InternalDSL.g:978:63: (iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF )
            // InternalDSL.g:979:2: iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF
            {
             newCompositeNode(grammarAccess.getAttributeClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeClassSelector=ruleAttributeClassSelector();

            state._fsp--;

             current =iv_ruleAttributeClassSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeClassSelector"


    // $ANTLR start "ruleAttributeClassSelector"
    // InternalDSL.g:985:1: ruleAttributeClassSelector returns [EObject current=null] : (otherlv_0= 'data.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_negated_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDSL.g:991:2: ( (otherlv_0= 'data.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDSL.g:992:2: (otherlv_0= 'data.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDSL.g:992:2: (otherlv_0= 'data.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) )
            // InternalDSL.g:993:3: otherlv_0= 'data.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
            		
            // InternalDSL.g:997:3: ( (lv_negated_1_0= '!' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:998:4: (lv_negated_1_0= '!' )
                    {
                    // InternalDSL.g:998:4: (lv_negated_1_0= '!' )
                    // InternalDSL.g:999:5: lv_negated_1_0= '!'
                    {
                    lv_negated_1_0=(Token)match(input,23,FOLLOW_4); 

                    					newLeafNode(lv_negated_1_0, grammarAccess.getAttributeClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeClassSelectorRule());
                    					}
                    					setWithLastConsumed(current, "negated", true, "!");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:1011:3: ( (otherlv_2= RULE_ID ) )
            // InternalDSL.g:1012:4: (otherlv_2= RULE_ID )
            {
            // InternalDSL.g:1012:4: (otherlv_2= RULE_ID )
            // InternalDSL.g:1013:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeClassSelectorRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0());
            				

            }


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
    // $ANTLR end "ruleAttributeClassSelector"


    // $ANTLR start "entryRuleDestinationSelector"
    // InternalDSL.g:1028:1: entryRuleDestinationSelector returns [EObject current=null] : iv_ruleDestinationSelector= ruleDestinationSelector EOF ;
    public final EObject entryRuleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationSelector = null;


        try {
            // InternalDSL.g:1028:60: (iv_ruleDestinationSelector= ruleDestinationSelector EOF )
            // InternalDSL.g:1029:2: iv_ruleDestinationSelector= ruleDestinationSelector EOF
            {
             newCompositeNode(grammarAccess.getDestinationSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestinationSelector=ruleDestinationSelector();

            state._fsp--;

             current =iv_ruleDestinationSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestinationSelector"


    // $ANTLR start "ruleDestinationSelector"
    // InternalDSL.g:1035:1: ruleDestinationSelector returns [EObject current=null] : (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector ) ;
    public final EObject ruleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject this_PropertySelector_0 = null;

        EObject this_PropertyClassSelector_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:1041:2: ( (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector ) )
            // InternalDSL.g:1042:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector )
            {
            // InternalDSL.g:1042:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:1043:3: this_PropertySelector_0= rulePropertySelector
                    {

                    			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertySelector_0=rulePropertySelector();

                    state._fsp--;


                    			current = this_PropertySelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1052:3: this_PropertyClassSelector_1= rulePropertyClassSelector
                    {

                    			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyClassSelector_1=rulePropertyClassSelector();

                    state._fsp--;


                    			current = this_PropertyClassSelector_1;
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
    // $ANTLR end "ruleDestinationSelector"


    // $ANTLR start "entryRulePropertySelector"
    // InternalDSL.g:1064:1: entryRulePropertySelector returns [EObject current=null] : iv_rulePropertySelector= rulePropertySelector EOF ;
    public final EObject entryRulePropertySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelector = null;


        try {
            // InternalDSL.g:1064:57: (iv_rulePropertySelector= rulePropertySelector EOF )
            // InternalDSL.g:1065:2: iv_rulePropertySelector= rulePropertySelector EOF
            {
             newCompositeNode(grammarAccess.getPropertySelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertySelector=rulePropertySelector();

            state._fsp--;

             current =iv_rulePropertySelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertySelector"


    // $ANTLR start "rulePropertySelector"
    // InternalDSL.g:1071:1: rulePropertySelector returns [EObject current=null] : (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) ;
    public final EObject rulePropertySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1077:2: ( (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) )
            // InternalDSL.g:1078:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            {
            // InternalDSL.g:1078:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            // InternalDSL.g:1079:3: otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0());
            		
            // InternalDSL.g:1083:3: ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            // InternalDSL.g:1084:4: (lv_ref_1_0= ruleCharacteristicSelector )
            {
            // InternalDSL.g:1084:4: (lv_ref_1_0= ruleCharacteristicSelector )
            // InternalDSL.g:1085:5: lv_ref_1_0= ruleCharacteristicSelector
            {

            					newCompositeNode(grammarAccess.getPropertySelectorAccess().getRefCharacteristicSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_1_0=ruleCharacteristicSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertySelectorRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"de.sebinside.dcp.dsl.DSL.CharacteristicSelector");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "rulePropertySelector"


    // $ANTLR start "entryRulePropertyClassSelector"
    // InternalDSL.g:1106:1: entryRulePropertyClassSelector returns [EObject current=null] : iv_rulePropertyClassSelector= rulePropertyClassSelector EOF ;
    public final EObject entryRulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyClassSelector = null;


        try {
            // InternalDSL.g:1106:62: (iv_rulePropertyClassSelector= rulePropertyClassSelector EOF )
            // InternalDSL.g:1107:2: iv_rulePropertyClassSelector= rulePropertyClassSelector EOF
            {
             newCompositeNode(grammarAccess.getPropertyClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyClassSelector=rulePropertyClassSelector();

            state._fsp--;

             current =iv_rulePropertyClassSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyClassSelector"


    // $ANTLR start "rulePropertyClassSelector"
    // InternalDSL.g:1113:1: rulePropertyClassSelector returns [EObject current=null] : (otherlv_0= 'node.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_negated_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDSL.g:1119:2: ( (otherlv_0= 'node.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDSL.g:1120:2: (otherlv_0= 'node.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDSL.g:1120:2: (otherlv_0= 'node.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) ) )
            // InternalDSL.g:1121:3: otherlv_0= 'node.class.' ( (lv_negated_1_0= '!' ) )? ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0());
            		
            // InternalDSL.g:1125:3: ( (lv_negated_1_0= '!' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:1126:4: (lv_negated_1_0= '!' )
                    {
                    // InternalDSL.g:1126:4: (lv_negated_1_0= '!' )
                    // InternalDSL.g:1127:5: lv_negated_1_0= '!'
                    {
                    lv_negated_1_0=(Token)match(input,23,FOLLOW_4); 

                    					newLeafNode(lv_negated_1_0, grammarAccess.getPropertyClassSelectorAccess().getNegatedExclamationMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyClassSelectorRule());
                    					}
                    					setWithLastConsumed(current, "negated", true, "!");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:1139:3: ( (otherlv_2= RULE_ID ) )
            // InternalDSL.g:1140:4: (otherlv_2= RULE_ID )
            {
            // InternalDSL.g:1140:4: (otherlv_2= RULE_ID )
            // InternalDSL.g:1141:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyClassSelectorRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_2_0());
            				

            }


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
    // $ANTLR end "rulePropertyClassSelector"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:1156:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDSL.g:1156:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDSL.g:1157:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDSL.g:1163:1: ruleStatement returns [EObject current=null] : ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_modality_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1169:2: ( ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) )
            // InternalDSL.g:1170:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            {
            // InternalDSL.g:1170:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            // InternalDSL.g:1171:3: ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) )
            {
            // InternalDSL.g:1171:3: ( (lv_modality_0_0= ruleStatementModality ) )
            // InternalDSL.g:1172:4: (lv_modality_0_0= ruleStatementModality )
            {
            // InternalDSL.g:1172:4: (lv_modality_0_0= ruleStatementModality )
            // InternalDSL.g:1173:5: lv_modality_0_0= ruleStatementModality
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_modality_0_0=ruleStatementModality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"modality",
            						lv_modality_0_0,
            						"de.sebinside.dcp.dsl.DSL.StatementModality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:1190:3: ( (lv_type_1_0= ruleStatementType ) )
            // InternalDSL.g:1191:4: (lv_type_1_0= ruleStatementType )
            {
            // InternalDSL.g:1191:4: (lv_type_1_0= ruleStatementType )
            // InternalDSL.g:1192:5: lv_type_1_0= ruleStatementType
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleStatementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.sebinside.dcp.dsl.DSL.StatementType");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatementType"
    // InternalDSL.g:1213:1: entryRuleStatementType returns [EObject current=null] : iv_ruleStatementType= ruleStatementType EOF ;
    public final EObject entryRuleStatementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementType = null;


        try {
            // InternalDSL.g:1213:54: (iv_ruleStatementType= ruleStatementType EOF )
            // InternalDSL.g:1214:2: iv_ruleStatementType= ruleStatementType EOF
            {
             newCompositeNode(grammarAccess.getStatementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementType=ruleStatementType();

            state._fsp--;

             current =iv_ruleStatementType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatementType"


    // $ANTLR start "ruleStatementType"
    // InternalDSL.g:1220:1: ruleStatementType returns [EObject current=null] : ( (lv_name_0_0= 'FLOWS' ) ) ;
    public final EObject ruleStatementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1226:2: ( ( (lv_name_0_0= 'FLOWS' ) ) )
            // InternalDSL.g:1227:2: ( (lv_name_0_0= 'FLOWS' ) )
            {
            // InternalDSL.g:1227:2: ( (lv_name_0_0= 'FLOWS' ) )
            // InternalDSL.g:1228:3: (lv_name_0_0= 'FLOWS' )
            {
            // InternalDSL.g:1228:3: (lv_name_0_0= 'FLOWS' )
            // InternalDSL.g:1229:4: lv_name_0_0= 'FLOWS'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStatementTypeRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "FLOWS");
            			

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
    // $ANTLR end "ruleStatementType"


    // $ANTLR start "entryRuleStatementModality"
    // InternalDSL.g:1244:1: entryRuleStatementModality returns [EObject current=null] : iv_ruleStatementModality= ruleStatementModality EOF ;
    public final EObject entryRuleStatementModality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementModality = null;


        try {
            // InternalDSL.g:1244:58: (iv_ruleStatementModality= ruleStatementModality EOF )
            // InternalDSL.g:1245:2: iv_ruleStatementModality= ruleStatementModality EOF
            {
             newCompositeNode(grammarAccess.getStatementModalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementModality=ruleStatementModality();

            state._fsp--;

             current =iv_ruleStatementModality; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatementModality"


    // $ANTLR start "ruleStatementModality"
    // InternalDSL.g:1251:1: ruleStatementModality returns [EObject current=null] : ( (lv_name_0_0= 'NEVER' ) ) ;
    public final EObject ruleStatementModality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1257:2: ( ( (lv_name_0_0= 'NEVER' ) ) )
            // InternalDSL.g:1258:2: ( (lv_name_0_0= 'NEVER' ) )
            {
            // InternalDSL.g:1258:2: ( (lv_name_0_0= 'NEVER' ) )
            // InternalDSL.g:1259:3: (lv_name_0_0= 'NEVER' )
            {
            // InternalDSL.g:1259:3: (lv_name_0_0= 'NEVER' )
            // InternalDSL.g:1260:4: lv_name_0_0= 'NEVER'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStatementModalityRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "NEVER");
            			

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
    // $ANTLR end "ruleStatementModality"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000020E3002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001018000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});

}