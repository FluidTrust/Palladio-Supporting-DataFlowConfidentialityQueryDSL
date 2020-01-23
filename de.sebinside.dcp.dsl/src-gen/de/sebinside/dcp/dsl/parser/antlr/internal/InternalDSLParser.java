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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'valueset'", "'['", "','", "']'", "'attribute'", "'property'", "'.'", "'<-'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=16 && LA1_0<=17)) ) {
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
    // InternalDSL.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_ValueSet_1 = null;

        EObject this_CharacteristicsType_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:113:2: ( (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType ) )
            // InternalDSL.g:114:2: (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType )
            {
            // InternalDSL.g:114:2: (this_DataType_0= ruleDataType | this_ValueSet_1= ruleValueSet | this_CharacteristicsType_2= ruleCharacteristicsType )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 16:
            case 17:
                {
                alt2=3;
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
    // InternalDSL.g:145:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDSL.g:145:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDSL.g:146:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalDSL.g:152:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:158:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDSL.g:159:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDSL.g:159:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDSL.g:160:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDSL.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:166:5: lv_name_1_0= RULE_ID
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
    // InternalDSL.g:186:1: entryRuleValueSet returns [EObject current=null] : iv_ruleValueSet= ruleValueSet EOF ;
    public final EObject entryRuleValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSet = null;


        try {
            // InternalDSL.g:186:49: (iv_ruleValueSet= ruleValueSet EOF )
            // InternalDSL.g:187:2: iv_ruleValueSet= ruleValueSet EOF
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
    // InternalDSL.g:193:1: ruleValueSet returns [EObject current=null] : (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' ) ;
    public final EObject ruleValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_members_4_0=null;
        Token otherlv_5=null;
        Token lv_members_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDSL.g:199:2: ( (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' ) )
            // InternalDSL.g:200:2: (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' )
            {
            // InternalDSL.g:200:2: (otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']' )
            // InternalDSL.g:201:3: otherlv_0= 'valueset' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator otherlv_3= '[' ( (lv_members_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getValueSetAccess().getValuesetKeyword_0());
            		
            // InternalDSL.g:205:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:206:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:206:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:207:5: lv_name_1_0= RULE_ID
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


            			newCompositeNode(grammarAccess.getValueSetAccess().getAssignementOperatorParserRuleCall_2());
            		
            pushFollow(FOLLOW_6);
            ruleAssignementOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getValueSetAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalDSL.g:234:3: ( (lv_members_4_0= RULE_ID ) )
            // InternalDSL.g:235:4: (lv_members_4_0= RULE_ID )
            {
            // InternalDSL.g:235:4: (lv_members_4_0= RULE_ID )
            // InternalDSL.g:236:5: lv_members_4_0= RULE_ID
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

            // InternalDSL.g:252:3: (otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:253:4: otherlv_5= ',' ( (lv_members_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getValueSetAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDSL.g:257:4: ( (lv_members_6_0= RULE_ID ) )
            	    // InternalDSL.g:258:5: (lv_members_6_0= RULE_ID )
            	    {
            	    // InternalDSL.g:258:5: (lv_members_6_0= RULE_ID )
            	    // InternalDSL.g:259:6: lv_members_6_0= RULE_ID
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalDSL.g:284:1: entryRuleCharacteristicsType returns [EObject current=null] : iv_ruleCharacteristicsType= ruleCharacteristicsType EOF ;
    public final EObject entryRuleCharacteristicsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicsType = null;


        try {
            // InternalDSL.g:284:60: (iv_ruleCharacteristicsType= ruleCharacteristicsType EOF )
            // InternalDSL.g:285:2: iv_ruleCharacteristicsType= ruleCharacteristicsType EOF
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
    // InternalDSL.g:291:1: ruleCharacteristicsType returns [EObject current=null] : (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType ) ;
    public final EObject ruleCharacteristicsType() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeType_0 = null;

        EObject this_PropertyType_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:297:2: ( (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType ) )
            // InternalDSL.g:298:2: (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType )
            {
            // InternalDSL.g:298:2: (this_AttributeType_0= ruleAttributeType | this_PropertyType_1= rulePropertyType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:299:3: this_AttributeType_0= ruleAttributeType
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
                    // InternalDSL.g:308:3: this_PropertyType_1= rulePropertyType
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
    // InternalDSL.g:320:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalDSL.g:320:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalDSL.g:321:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalDSL.g:327:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:333:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:334:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:334:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:335:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0());
            		
            // InternalDSL.g:339:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:340:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:340:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:341:5: lv_name_1_0= RULE_ID
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


            			newCompositeNode(grammarAccess.getAttributeTypeAccess().getAssignementOperatorParserRuleCall_2());
            		
            pushFollow(FOLLOW_4);
            ruleAssignementOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:364:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:365:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:365:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:366:5: otherlv_3= RULE_ID
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
    // InternalDSL.g:381:1: entryRulePropertyType returns [EObject current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final EObject entryRulePropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyType = null;


        try {
            // InternalDSL.g:381:53: (iv_rulePropertyType= rulePropertyType EOF )
            // InternalDSL.g:382:2: iv_rulePropertyType= rulePropertyType EOF
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
    // InternalDSL.g:388:1: rulePropertyType returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePropertyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:394:2: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDSL.g:395:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDSL.g:395:2: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) ) )
            // InternalDSL.g:396:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) ruleAssignementOperator ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0());
            		
            // InternalDSL.g:400:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:401:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:401:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:402:5: lv_name_1_0= RULE_ID
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


            			newCompositeNode(grammarAccess.getPropertyTypeAccess().getAssignementOperatorParserRuleCall_2());
            		
            pushFollow(FOLLOW_4);
            ruleAssignementOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:425:3: ( (otherlv_3= RULE_ID ) )
            // InternalDSL.g:426:4: (otherlv_3= RULE_ID )
            {
            // InternalDSL.g:426:4: (otherlv_3= RULE_ID )
            // InternalDSL.g:427:5: otherlv_3= RULE_ID
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


    // $ANTLR start "entryRuleCharacteristicSelector"
    // InternalDSL.g:442:1: entryRuleCharacteristicSelector returns [EObject current=null] : iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF ;
    public final EObject entryRuleCharacteristicSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicSelector = null;


        try {
            // InternalDSL.g:442:63: (iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF )
            // InternalDSL.g:443:2: iv_ruleCharacteristicSelector= ruleCharacteristicSelector EOF
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
    // InternalDSL.g:449:1: ruleCharacteristicSelector returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_literal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCharacteristicSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_literal_2_0=null;


        	enterRule();

        try {
            // InternalDSL.g:455:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_literal_2_0= RULE_ID ) ) ) )
            // InternalDSL.g:456:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_literal_2_0= RULE_ID ) ) )
            {
            // InternalDSL.g:456:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_literal_2_0= RULE_ID ) ) )
            // InternalDSL.g:457:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_literal_2_0= RULE_ID ) )
            {
            // InternalDSL.g:457:3: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:458:4: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:458:4: (otherlv_0= RULE_ID )
            // InternalDSL.g:459:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getCharacteristicSelectorAccess().getNameCharacteristicsTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacteristicSelectorAccess().getFullStopKeyword_1());
            		
            // InternalDSL.g:474:3: ( (lv_literal_2_0= RULE_ID ) )
            // InternalDSL.g:475:4: (lv_literal_2_0= RULE_ID )
            {
            // InternalDSL.g:475:4: (lv_literal_2_0= RULE_ID )
            // InternalDSL.g:476:5: lv_literal_2_0= RULE_ID
            {
            lv_literal_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_literal_2_0, grammarAccess.getCharacteristicSelectorAccess().getLiteralIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"literal",
            						lv_literal_2_0,
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
    // $ANTLR end "ruleCharacteristicSelector"


    // $ANTLR start "entryRuleAssignementOperator"
    // InternalDSL.g:496:1: entryRuleAssignementOperator returns [String current=null] : iv_ruleAssignementOperator= ruleAssignementOperator EOF ;
    public final String entryRuleAssignementOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignementOperator = null;


        try {
            // InternalDSL.g:496:59: (iv_ruleAssignementOperator= ruleAssignementOperator EOF )
            // InternalDSL.g:497:2: iv_ruleAssignementOperator= ruleAssignementOperator EOF
            {
             newCompositeNode(grammarAccess.getAssignementOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignementOperator=ruleAssignementOperator();

            state._fsp--;

             current =iv_ruleAssignementOperator.getText(); 
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
    // $ANTLR end "entryRuleAssignementOperator"


    // $ANTLR start "ruleAssignementOperator"
    // InternalDSL.g:503:1: ruleAssignementOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '<-' ;
    public final AntlrDatatypeRuleToken ruleAssignementOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDSL.g:509:2: (kw= '<-' )
            // InternalDSL.g:510:2: kw= '<-'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAssignementOperatorAccess().getLessThanSignHyphenMinusKeyword());
            	

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
    // $ANTLR end "ruleAssignementOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000031802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});

}