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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASSIGNEMENT_OPERATOR", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'valueset'", "'['", "','", "']'", "'attribute'", "'property'", "'class'", "'{'", "'}'", "'.'", "'!'", "'&'", "'import'", "'constraint'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'FLOWS'", "'NEVER'"
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
    public static final int T__32=32;
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

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=17 && LA1_0<=19)||(LA1_0>=25 && LA1_0<=26)) ) {
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
    // InternalDSL.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Include_0= ruleInclude | this_DataType_1= ruleDataType | this_ValueSet_2= ruleValueSet | this_CharacteristicsType_3= ruleCharacteristicsType | this_CharacteristicClass_4= ruleCharacteristicClass | this_Constraint_5= ruleConstraint ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Include_0 = null;

        EObject this_DataType_1 = null;

        EObject this_ValueSet_2 = null;

        EObject this_CharacteristicsType_3 = null;

        EObject this_CharacteristicClass_4 = null;

        EObject this_Constraint_5 = null;



        	enterRule();

        try {
            // InternalDSL.g:113:2: ( (this_Include_0= ruleInclude | this_DataType_1= ruleDataType | this_ValueSet_2= ruleValueSet | this_CharacteristicsType_3= ruleCharacteristicsType | this_CharacteristicClass_4= ruleCharacteristicClass | this_Constraint_5= ruleConstraint ) )
            // InternalDSL.g:114:2: (this_Include_0= ruleInclude | this_DataType_1= ruleDataType | this_ValueSet_2= ruleValueSet | this_CharacteristicsType_3= ruleCharacteristicsType | this_CharacteristicClass_4= ruleCharacteristicClass | this_Constraint_5= ruleConstraint )
            {
            // InternalDSL.g:114:2: (this_Include_0= ruleInclude | this_DataType_1= ruleDataType | this_ValueSet_2= ruleValueSet | this_CharacteristicsType_3= ruleCharacteristicsType | this_CharacteristicClass_4= ruleCharacteristicClass | this_Constraint_5= ruleConstraint )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 17:
            case 18:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 26:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:115:3: this_Include_0= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getIncludeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_0=ruleInclude();

                    state._fsp--;


                    			current = this_Include_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:124:3: this_DataType_1= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:133:3: this_ValueSet_2= ruleValueSet
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getValueSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueSet_2=ruleValueSet();

                    state._fsp--;


                    			current = this_ValueSet_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:142:3: this_CharacteristicsType_3= ruleCharacteristicsType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicsTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicsType_3=ruleCharacteristicsType();

                    state._fsp--;


                    			current = this_CharacteristicsType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:151:3: this_CharacteristicClass_4= ruleCharacteristicClass
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicClass_4=ruleCharacteristicClass();

                    state._fsp--;


                    			current = this_CharacteristicClass_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDSL.g:160:3: this_Constraint_5= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_5=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_5;
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
    // InternalDSL.g:172:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDSL.g:172:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDSL.g:173:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalDSL.g:179:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:185:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDSL.g:186:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDSL.g:186:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDSL.g:187:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDSL.g:191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:192:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:193:5: lv_name_1_0= RULE_ID
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
    // InternalDSL.g:213:1: entryRuleValueSet returns [EObject current=null] : iv_ruleValueSet= ruleValueSet EOF ;
    public final EObject entryRuleValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSet = null;


        try {
            // InternalDSL.g:213:49: (iv_ruleValueSet= ruleValueSet EOF )
            // InternalDSL.g:214:2: iv_ruleValueSet= ruleValueSet EOF
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
    // InternalDSL.g:220:1: ruleValueSet returns [EObject current=null] : (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' ) ;
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
            // InternalDSL.g:226:2: ( (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' ) )
            // InternalDSL.g:227:2: (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' )
            {
            // InternalDSL.g:227:2: (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' )
            // InternalDSL.g:228:3: otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getValueSetAccess().getValuesetKeyword_0());
            		
            // InternalDSL.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:234:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDSL.g:258:3: ( (lv_members_4_0= RULE_ID ) )
            // InternalDSL.g:259:4: (lv_members_4_0= RULE_ID )
            {
            // InternalDSL.g:259:4: (lv_members_4_0= RULE_ID )
            // InternalDSL.g:260:5: lv_members_4_0= RULE_ID
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

            // InternalDSL.g:276:3: (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:277:4: otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getValueSetAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDSL.g:281:4: ( (lv_members_6_0= RULE_ID ) )
            	    // InternalDSL.g:282:5: (lv_members_6_0= RULE_ID )
            	    {
            	    // InternalDSL.g:282:5: (lv_members_6_0= RULE_ID )
            	    // InternalDSL.g:283:6: lv_members_6_0= RULE_ID
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
    // InternalDSL.g:308:1: entryRuleCharacteristicsType returns [EObject current=null] : iv_ruleCharacteristicsType= ruleCharacteristicsType EOF ;
    public final EObject entryRuleCharacteristicsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicsType = null;


        try {
            // InternalDSL.g:308:60: (iv_ruleCharacteristicsType= ruleCharacteristicsType EOF )
            // InternalDSL.g:309:2: iv_ruleCharacteristicsType= ruleCharacteristicsType EOF
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
    // InternalDSL.g:315:1: ruleCharacteristicsType returns [EObject current=null] : (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType ) ;
    public final EObject ruleCharacteristicsType() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeType_0 = null;

        EObject this_PropertyType_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:321:2: ( (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType ) )
            // InternalDSL.g:322:2: (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType )
            {
            // InternalDSL.g:322:2: (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType )
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
                    // InternalDSL.g:323:3: this_AttributeType_0= ruleAttributeType
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
                    // InternalDSL.g:332:3: this_PropertyType_1= rulePropertyType
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
    // InternalDSL.g:344:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalDSL.g:344:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalDSL.g:345:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalDSL.g:351:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNEMENT_OPERATOR_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:357:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:358:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:358:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:359:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0());
            		
            // InternalDSL.g:363:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:364:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:364:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:365:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDSL.g:385:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:386:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:386:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:387:5: otherlv_3= RULE_ID
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
    // InternalDSL.g:402:1: entryRulePropertyType returns [EObject current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final EObject entryRulePropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyType = null;


        try {
            // InternalDSL.g:402:53: (iv_rulePropertyType= rulePropertyType EOF )
            // InternalDSL.g:403:2: iv_rulePropertyType= rulePropertyType EOF
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
    // InternalDSL.g:409:1: rulePropertyType returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePropertyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNEMENT_OPERATOR_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:415:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:416:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:416:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:417:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) this_ASSIGNEMENT_OPERATOR_2= RULE_ASSIGNEMENT_OPERATOR ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0());
            		
            // InternalDSL.g:421:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:422:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:422:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:423:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDSL.g:443:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:444:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:444:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:445:5: otherlv_3= RULE_ID
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
    // InternalDSL.g:460:1: entryRuleCharacteristicClass returns [EObject current=null] : iv_ruleCharacteristicClass= ruleCharacteristicClass EOF ;
    public final EObject entryRuleCharacteristicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicClass = null;


        try {
            // InternalDSL.g:460:60: (iv_ruleCharacteristicClass= ruleCharacteristicClass EOF )
            // InternalDSL.g:461:2: iv_ruleCharacteristicClass= ruleCharacteristicClass EOF
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
    // InternalDSL.g:467:1: ruleCharacteristicClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' ) ;
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
            // InternalDSL.g:473:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' ) )
            // InternalDSL.g:474:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' )
            {
            // InternalDSL.g:474:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}' )
            // InternalDSL.g:475:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCharacteristicSelector ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
            		
            // InternalDSL.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:481:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDSL.g:501:3: ( (lv_members_3_0= ruleCharacteristicSelector ) )
            // InternalDSL.g:502:4: (lv_members_3_0= ruleCharacteristicSelector )
            {
            // InternalDSL.g:502:4: (lv_members_3_0= ruleCharacteristicSelector )
            // InternalDSL.g:503:5: lv_members_3_0= ruleCharacteristicSelector
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

            // InternalDSL.g:520:3: (otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:521:4: otherlv_4= ',' ( (lv_members_5_0= ruleCharacteristicSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDSL.g:525:4: ( (lv_members_5_0= ruleCharacteristicSelector ) )
            	    // InternalDSL.g:526:5: (lv_members_5_0= ruleCharacteristicSelector )
            	    {
            	    // InternalDSL.g:526:5: (lv_members_5_0= ruleCharacteristicSelector )
            	    // InternalDSL.g:527:6: lv_members_5_0= ruleCharacteristicSelector
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
    // InternalDSL.g:553:1: entryRuleCharacteristicSelector returns [EObject current=null] : iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF ;
    public final EObject entryRuleCharacteristicSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSelector = null;


        try {
            // InternalDSL.g:553:63: (iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF )
            // InternalDSL.g:554:2: iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF
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
    // InternalDSL.g:560:1: ruleCharacteristicSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) ) ;
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
            // InternalDSL.g:566:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) ) )
            // InternalDSL.g:567:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) )
            {
            // InternalDSL.g:567:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) ) )
            // InternalDSL.g:568:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) )
            {
            // InternalDSL.g:568:3: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:569:4: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:569:4: (otherlv_0= RULE_ID )
            // InternalDSL.g:570:5: otherlv_0= RULE_ID
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
            		
            // InternalDSL.g:585:3: ( ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) ) | (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' ) )
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
                    // InternalDSL.g:586:4: ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) )
                    {
                    // InternalDSL.g:586:4: ( ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) ) )
                    // InternalDSL.g:587:5: ( (lv_negated_2_0= '!' ) )? ( (lv_literals_3_0= RULE_ID ) )
                    {
                    // InternalDSL.g:587:5: ( (lv_negated_2_0= '!' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDSL.g:588:6: (lv_negated_2_0= '!' )
                            {
                            // InternalDSL.g:588:6: (lv_negated_2_0= '!' )
                            // InternalDSL.g:589:7: lv_negated_2_0= '!'
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

                    // InternalDSL.g:601:5: ( (lv_literals_3_0= RULE_ID ) )
                    // InternalDSL.g:602:6: (lv_literals_3_0= RULE_ID )
                    {
                    // InternalDSL.g:602:6: (lv_literals_3_0= RULE_ID )
                    // InternalDSL.g:603:7: lv_literals_3_0= RULE_ID
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
                    // InternalDSL.g:621:4: (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' )
                    {
                    // InternalDSL.g:621:4: (otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']' )
                    // InternalDSL.g:622:5: otherlv_4= '[' ( (lv_literals_5_0= RULE_ID ) ) ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* ) otherlv_10= ']'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getCharacteristicSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalDSL.g:626:5: ( (lv_literals_5_0= RULE_ID ) )
                    // InternalDSL.g:627:6: (lv_literals_5_0= RULE_ID )
                    {
                    // InternalDSL.g:627:6: (lv_literals_5_0= RULE_ID )
                    // InternalDSL.g:628:7: lv_literals_5_0= RULE_ID
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

                    // InternalDSL.g:644:5: ( (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )* | ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )* )
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
                            // InternalDSL.g:645:6: (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )*
                            {
                            // InternalDSL.g:645:6: (otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==15) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalDSL.g:646:7: otherlv_6= ',' ( (lv_literals_7_0= RULE_ID ) )
                            	    {
                            	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                            	    							newLeafNode(otherlv_6, grammarAccess.getCharacteristicSelectorAccess().getCommaKeyword_2_1_2_0_0());
                            	    						
                            	    // InternalDSL.g:650:7: ( (lv_literals_7_0= RULE_ID ) )
                            	    // InternalDSL.g:651:8: (lv_literals_7_0= RULE_ID )
                            	    {
                            	    // InternalDSL.g:651:8: (lv_literals_7_0= RULE_ID )
                            	    // InternalDSL.g:652:9: lv_literals_7_0= RULE_ID
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
                            // InternalDSL.g:670:6: ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )*
                            {
                            // InternalDSL.g:670:6: ( ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==24) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalDSL.g:671:7: ( (lv_conjuncted_8_0= '&' ) ) ( (lv_literals_9_0= RULE_ID ) )
                            	    {
                            	    // InternalDSL.g:671:7: ( (lv_conjuncted_8_0= '&' ) )
                            	    // InternalDSL.g:672:8: (lv_conjuncted_8_0= '&' )
                            	    {
                            	    // InternalDSL.g:672:8: (lv_conjuncted_8_0= '&' )
                            	    // InternalDSL.g:673:9: lv_conjuncted_8_0= '&'
                            	    {
                            	    lv_conjuncted_8_0=(Token)match(input,24,FOLLOW_4); 

                            	    									newLeafNode(lv_conjuncted_8_0, grammarAccess.getCharacteristicSelectorAccess().getConjunctedAmpersandKeyword_2_1_2_1_0_0());
                            	    								

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
                            	    									}
                            	    									setWithLastConsumed(current, "conjuncted", true, "&");
                            	    								

                            	    }


                            	    }

                            	    // InternalDSL.g:685:7: ( (lv_literals_9_0= RULE_ID ) )
                            	    // InternalDSL.g:686:8: (lv_literals_9_0= RULE_ID )
                            	    {
                            	    // InternalDSL.g:686:8: (lv_literals_9_0= RULE_ID )
                            	    // InternalDSL.g:687:9: lv_literals_9_0= RULE_ID
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


    // $ANTLR start "entryRuleInclude"
    // InternalDSL.g:715:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalDSL.g:715:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalDSL.g:716:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalDSL.g:722:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:728:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalDSL.g:729:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalDSL.g:729:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalDSL.g:730:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalDSL.g:734:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDSL.g:735:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDSL.g:735:4: (lv_importURI_1_0= RULE_STRING )
            // InternalDSL.g:736:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleConstraint"
    // InternalDSL.g:756:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDSL.g:756:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDSL.g:757:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalDSL.g:763:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rule_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:769:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' ) )
            // InternalDSL.g:770:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            {
            // InternalDSL.g:770:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}' )
            // InternalDSL.g:771:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_rule_3_0= ruleRule ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalDSL.g:775:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDSL.g:776:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDSL.g:776:4: (lv_name_1_0= RULE_STRING )
            // InternalDSL.g:777:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalDSL.g:797:3: ( (lv_rule_3_0= ruleRule ) )
            // InternalDSL.g:798:4: (lv_rule_3_0= ruleRule )
            {
            // InternalDSL.g:798:4: (lv_rule_3_0= ruleRule )
            // InternalDSL.g:799:5: lv_rule_3_0= ruleRule
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
    // InternalDSL.g:824:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDSL.g:824:45: (iv_ruleRule= ruleRule EOF )
            // InternalDSL.g:825:2: iv_ruleRule= ruleRule EOF
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
    // InternalDSL.g:831:1: ruleRule returns [EObject current=null] : ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ) ;
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
            // InternalDSL.g:837:2: ( ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* ) )
            // InternalDSL.g:838:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* )
            {
            // InternalDSL.g:838:2: ( ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )* )
            // InternalDSL.g:839:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) ) (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )* ( (lv_statement_3_0= ruleStatement ) ) ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) ) (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            {
            // InternalDSL.g:839:3: ( (lv_dataSelectors_0_0= ruleDataSelector ) )
            // InternalDSL.g:840:4: (lv_dataSelectors_0_0= ruleDataSelector )
            {
            // InternalDSL.g:840:4: (lv_dataSelectors_0_0= ruleDataSelector )
            // InternalDSL.g:841:5: lv_dataSelectors_0_0= ruleDataSelector
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

            // InternalDSL.g:858:3: (otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:859:4: otherlv_1= '&' ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalDSL.g:863:4: ( (lv_dataSelectors_2_0= ruleDataSelector ) )
            	    // InternalDSL.g:864:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    {
            	    // InternalDSL.g:864:5: (lv_dataSelectors_2_0= ruleDataSelector )
            	    // InternalDSL.g:865:6: lv_dataSelectors_2_0= ruleDataSelector
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

            // InternalDSL.g:883:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalDSL.g:884:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalDSL.g:884:4: (lv_statement_3_0= ruleStatement )
            // InternalDSL.g:885:5: lv_statement_3_0= ruleStatement
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

            // InternalDSL.g:902:3: ( (lv_destinationSelectors_4_0= ruleDestinationSelector ) )
            // InternalDSL.g:903:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            {
            // InternalDSL.g:903:4: (lv_destinationSelectors_4_0= ruleDestinationSelector )
            // InternalDSL.g:904:5: lv_destinationSelectors_4_0= ruleDestinationSelector
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

            // InternalDSL.g:921:3: (otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:922:4: otherlv_5= '&' ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_18); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
            	    			
            	    // InternalDSL.g:926:4: ( (lv_destinationSelectors_6_0= ruleDestinationSelector ) )
            	    // InternalDSL.g:927:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    {
            	    // InternalDSL.g:927:5: (lv_destinationSelectors_6_0= ruleDestinationSelector )
            	    // InternalDSL.g:928:6: lv_destinationSelectors_6_0= ruleDestinationSelector
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
    // InternalDSL.g:950:1: entryRuleDataSelector returns [EObject current=null] : iv_ruleDataSelector= ruleDataSelector EOF ;
    public final EObject entryRuleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSelector = null;


        try {
            // InternalDSL.g:950:53: (iv_ruleDataSelector= ruleDataSelector EOF )
            // InternalDSL.g:951:2: iv_ruleDataSelector= ruleDataSelector EOF
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
    // InternalDSL.g:957:1: ruleDataSelector returns [EObject current=null] : (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) ;
    public final EObject ruleDataSelector() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSelector_0 = null;

        EObject this_AttributeClassSelector_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:963:2: ( (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector ) )
            // InternalDSL.g:964:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            {
            // InternalDSL.g:964:2: (this_AttributeSelector_0= ruleAttributeSelector | this_AttributeClassSelector_1= ruleAttributeClassSelector )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:965:3: this_AttributeSelector_0= ruleAttributeSelector
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
                    // InternalDSL.g:974:3: this_AttributeClassSelector_1= ruleAttributeClassSelector
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
    // InternalDSL.g:986:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // InternalDSL.g:986:58: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // InternalDSL.g:987:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
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
    // InternalDSL.g:993:1: ruleAttributeSelector returns [EObject current=null] : (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:999:2: ( (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) )
            // InternalDSL.g:1000:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            {
            // InternalDSL.g:1000:2: (otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            // InternalDSL.g:1001:3: otherlv_0= 'data.attribute.' ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
            		
            // InternalDSL.g:1005:3: ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            // InternalDSL.g:1006:4: (lv_ref_1_0= ruleCharacteristicSelector )
            {
            // InternalDSL.g:1006:4: (lv_ref_1_0= ruleCharacteristicSelector )
            // InternalDSL.g:1007:5: lv_ref_1_0= ruleCharacteristicSelector
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
    // InternalDSL.g:1028:1: entryRuleAttributeClassSelector returns [EObject current=null] : iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF ;
    public final EObject entryRuleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeClassSelector = null;


        try {
            // InternalDSL.g:1028:63: (iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF )
            // InternalDSL.g:1029:2: iv_ruleAttributeClassSelector= ruleAttributeClassSelector EOF
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
    // InternalDSL.g:1035:1: ruleAttributeClassSelector returns [EObject current=null] : (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1041:2: ( (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDSL.g:1042:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDSL.g:1042:2: (otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalDSL.g:1043:3: otherlv_0= 'data.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
            		
            // InternalDSL.g:1047:3: ( (otherlv_1= RULE_ID ) )
            // InternalDSL.g:1048:4: (otherlv_1= RULE_ID )
            {
            // InternalDSL.g:1048:4: (otherlv_1= RULE_ID )
            // InternalDSL.g:1049:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeClassSelectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0());
            				

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
    // InternalDSL.g:1064:1: entryRuleDestinationSelector returns [EObject current=null] : iv_ruleDestinationSelector= ruleDestinationSelector EOF ;
    public final EObject entryRuleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationSelector = null;


        try {
            // InternalDSL.g:1064:60: (iv_ruleDestinationSelector= ruleDestinationSelector EOF )
            // InternalDSL.g:1065:2: iv_ruleDestinationSelector= ruleDestinationSelector EOF
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
    // InternalDSL.g:1071:1: ruleDestinationSelector returns [EObject current=null] : (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector ) ;
    public final EObject ruleDestinationSelector() throws RecognitionException {
        EObject current = null;

        EObject this_PropertySelector_0 = null;

        EObject this_PropertyClassSelector_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:1077:2: ( (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector ) )
            // InternalDSL.g:1078:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector )
            {
            // InternalDSL.g:1078:2: (this_PropertySelector_0= rulePropertySelector | this_PropertyClassSelector_1= rulePropertyClassSelector )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1079:3: this_PropertySelector_0= rulePropertySelector
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
                    // InternalDSL.g:1088:3: this_PropertyClassSelector_1= rulePropertyClassSelector
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
    // InternalDSL.g:1100:1: entryRulePropertySelector returns [EObject current=null] : iv_rulePropertySelector= rulePropertySelector EOF ;
    public final EObject entryRulePropertySelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelector = null;


        try {
            // InternalDSL.g:1100:57: (iv_rulePropertySelector= rulePropertySelector EOF )
            // InternalDSL.g:1101:2: iv_rulePropertySelector= rulePropertySelector EOF
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
    // InternalDSL.g:1107:1: rulePropertySelector returns [EObject current=null] : (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) ;
    public final EObject rulePropertySelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1113:2: ( (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) ) )
            // InternalDSL.g:1114:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            {
            // InternalDSL.g:1114:2: (otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) ) )
            // InternalDSL.g:1115:3: otherlv_0= 'node.property.' ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0());
            		
            // InternalDSL.g:1119:3: ( (lv_ref_1_0= ruleCharacteristicSelector ) )
            // InternalDSL.g:1120:4: (lv_ref_1_0= ruleCharacteristicSelector )
            {
            // InternalDSL.g:1120:4: (lv_ref_1_0= ruleCharacteristicSelector )
            // InternalDSL.g:1121:5: lv_ref_1_0= ruleCharacteristicSelector
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
    // InternalDSL.g:1142:1: entryRulePropertyClassSelector returns [EObject current=null] : iv_rulePropertyClassSelector= rulePropertyClassSelector EOF ;
    public final EObject entryRulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyClassSelector = null;


        try {
            // InternalDSL.g:1142:62: (iv_rulePropertyClassSelector= rulePropertyClassSelector EOF )
            // InternalDSL.g:1143:2: iv_rulePropertyClassSelector= rulePropertyClassSelector EOF
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
    // InternalDSL.g:1149:1: rulePropertyClassSelector returns [EObject current=null] : (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePropertyClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1155:2: ( (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDSL.g:1156:2: (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDSL.g:1156:2: (otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) ) )
            // InternalDSL.g:1157:3: otherlv_0= 'node.class.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0());
            		
            // InternalDSL.g:1161:3: ( (otherlv_1= RULE_ID ) )
            // InternalDSL.g:1162:4: (otherlv_1= RULE_ID )
            {
            // InternalDSL.g:1162:4: (otherlv_1= RULE_ID )
            // InternalDSL.g:1163:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyClassSelectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0());
            				

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
    // InternalDSL.g:1178:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDSL.g:1178:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDSL.g:1179:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalDSL.g:1185:1: ruleStatement returns [EObject current=null] : ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_modality_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1191:2: ( ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) ) )
            // InternalDSL.g:1192:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            {
            // InternalDSL.g:1192:2: ( ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) ) )
            // InternalDSL.g:1193:3: ( (lv_modality_0_0= ruleStatementModality ) ) ( (lv_type_1_0= ruleStatementType ) )
            {
            // InternalDSL.g:1193:3: ( (lv_modality_0_0= ruleStatementModality ) )
            // InternalDSL.g:1194:4: (lv_modality_0_0= ruleStatementModality )
            {
            // InternalDSL.g:1194:4: (lv_modality_0_0= ruleStatementModality )
            // InternalDSL.g:1195:5: lv_modality_0_0= ruleStatementModality
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalDSL.g:1212:3: ( (lv_type_1_0= ruleStatementType ) )
            // InternalDSL.g:1213:4: (lv_type_1_0= ruleStatementType )
            {
            // InternalDSL.g:1213:4: (lv_type_1_0= ruleStatementType )
            // InternalDSL.g:1214:5: lv_type_1_0= ruleStatementType
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
    // InternalDSL.g:1235:1: entryRuleStatementType returns [EObject current=null] : iv_ruleStatementType= ruleStatementType EOF ;
    public final EObject entryRuleStatementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementType = null;


        try {
            // InternalDSL.g:1235:54: (iv_ruleStatementType= ruleStatementType EOF )
            // InternalDSL.g:1236:2: iv_ruleStatementType= ruleStatementType EOF
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
    // InternalDSL.g:1242:1: ruleStatementType returns [EObject current=null] : ( (lv_name_0_0= 'FLOWS' ) ) ;
    public final EObject ruleStatementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1248:2: ( ( (lv_name_0_0= 'FLOWS' ) ) )
            // InternalDSL.g:1249:2: ( (lv_name_0_0= 'FLOWS' ) )
            {
            // InternalDSL.g:1249:2: ( (lv_name_0_0= 'FLOWS' ) )
            // InternalDSL.g:1250:3: (lv_name_0_0= 'FLOWS' )
            {
            // InternalDSL.g:1250:3: (lv_name_0_0= 'FLOWS' )
            // InternalDSL.g:1251:4: lv_name_0_0= 'FLOWS'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_2); 

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
    // InternalDSL.g:1266:1: entryRuleStatementModality returns [EObject current=null] : iv_ruleStatementModality= ruleStatementModality EOF ;
    public final EObject entryRuleStatementModality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementModality = null;


        try {
            // InternalDSL.g:1266:58: (iv_ruleStatementModality= ruleStatementModality EOF )
            // InternalDSL.g:1267:2: iv_ruleStatementModality= ruleStatementModality EOF
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
    // InternalDSL.g:1273:1: ruleStatementModality returns [EObject current=null] : ( (lv_name_0_0= 'NEVER' ) ) ;
    public final EObject ruleStatementModality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1279:2: ( ( (lv_name_0_0= 'NEVER' ) ) )
            // InternalDSL.g:1280:2: ( (lv_name_0_0= 'NEVER' ) )
            {
            // InternalDSL.g:1280:2: ( (lv_name_0_0= 'NEVER' ) )
            // InternalDSL.g:1281:3: (lv_name_0_0= 'NEVER' )
            {
            // InternalDSL.g:1281:3: (lv_name_0_0= 'NEVER' )
            // InternalDSL.g:1282:4: lv_name_0_0= 'NEVER'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000060E3002L});
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});

}