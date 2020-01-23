package de.sebinside.dcp.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.sebinside.dcp.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<-'", "'datatype'", "'valueset'", "'['", "']'", "','", "'attribute'", "'property'", "'.'"
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

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleModel EOF )
            // InternalDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDSL.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalDSL.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalDSL.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalDSL.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalDSL.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDSL.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleAbstractElement EOF )
            // InternalDSL.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDSL.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalDSL.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalDSL.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalDSL.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleDataType"
    // InternalDSL.g:103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleDataType EOF )
            // InternalDSL.g:105:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDSL.g:112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__DataType__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__DataType__Group__0 )
            // InternalDSL.g:119:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleValueSet"
    // InternalDSL.g:128:1: entryRuleValueSet : ruleValueSet EOF ;
    public final void entryRuleValueSet() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleValueSet EOF )
            // InternalDSL.g:130:1: ruleValueSet EOF
            {
             before(grammarAccess.getValueSetRule()); 
            pushFollow(FOLLOW_1);
            ruleValueSet();

            state._fsp--;

             after(grammarAccess.getValueSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueSet"


    // $ANTLR start "ruleValueSet"
    // InternalDSL.g:137:1: ruleValueSet : ( ( rule__ValueSet__Group__0 ) ) ;
    public final void ruleValueSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__ValueSet__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__ValueSet__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__ValueSet__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__ValueSet__Group__0 )
            {
             before(grammarAccess.getValueSetAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__ValueSet__Group__0 )
            // InternalDSL.g:144:4: rule__ValueSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueSet"


    // $ANTLR start "entryRuleCharacteristicsType"
    // InternalDSL.g:153:1: entryRuleCharacteristicsType : ruleCharacteristicsType EOF ;
    public final void entryRuleCharacteristicsType() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleCharacteristicsType EOF )
            // InternalDSL.g:155:1: ruleCharacteristicsType EOF
            {
             before(grammarAccess.getCharacteristicsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicsType();

            state._fsp--;

             after(grammarAccess.getCharacteristicsTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacteristicsType"


    // $ANTLR start "ruleCharacteristicsType"
    // InternalDSL.g:162:1: ruleCharacteristicsType : ( ( rule__CharacteristicsType__Alternatives ) ) ;
    public final void ruleCharacteristicsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__CharacteristicsType__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__CharacteristicsType__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__CharacteristicsType__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__CharacteristicsType__Alternatives )
            {
             before(grammarAccess.getCharacteristicsTypeAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__CharacteristicsType__Alternatives )
            // InternalDSL.g:169:4: rule__CharacteristicsType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicsType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicsTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicsType"


    // $ANTLR start "entryRuleAttributeType"
    // InternalDSL.g:178:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleAttributeType EOF )
            // InternalDSL.g:180:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalDSL.g:187:1: ruleAttributeType : ( ( rule__AttributeType__Group__0 ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__AttributeType__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__AttributeType__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__AttributeType__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__AttributeType__Group__0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__AttributeType__Group__0 )
            // InternalDSL.g:194:4: rule__AttributeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulePropertyType"
    // InternalDSL.g:203:1: entryRulePropertyType : rulePropertyType EOF ;
    public final void entryRulePropertyType() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( rulePropertyType EOF )
            // InternalDSL.g:205:1: rulePropertyType EOF
            {
             before(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // InternalDSL.g:212:1: rulePropertyType : ( ( rule__PropertyType__Group__0 ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__PropertyType__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__PropertyType__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__PropertyType__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__PropertyType__Group__0 )
            {
             before(grammarAccess.getPropertyTypeAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__PropertyType__Group__0 )
            // InternalDSL.g:219:4: rule__PropertyType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleCharacteristicSelector"
    // InternalDSL.g:228:1: entryRuleCharacteristicSelector : ruleCharacteristicSelector EOF ;
    public final void entryRuleCharacteristicSelector() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleCharacteristicSelector EOF )
            // InternalDSL.g:230:1: ruleCharacteristicSelector EOF
            {
             before(grammarAccess.getCharacteristicSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacteristicSelector"


    // $ANTLR start "ruleCharacteristicSelector"
    // InternalDSL.g:237:1: ruleCharacteristicSelector : ( ( rule__CharacteristicSelector__Group__0 ) ) ;
    public final void ruleCharacteristicSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__CharacteristicSelector__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__CharacteristicSelector__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__CharacteristicSelector__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__CharacteristicSelector__Group__0 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__CharacteristicSelector__Group__0 )
            // InternalDSL.g:244:4: rule__CharacteristicSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristicSelector"


    // $ANTLR start "entryRuleAssignementOperator"
    // InternalDSL.g:253:1: entryRuleAssignementOperator : ruleAssignementOperator EOF ;
    public final void entryRuleAssignementOperator() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleAssignementOperator EOF )
            // InternalDSL.g:255:1: ruleAssignementOperator EOF
            {
             before(grammarAccess.getAssignementOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getAssignementOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignementOperator"


    // $ANTLR start "ruleAssignementOperator"
    // InternalDSL.g:262:1: ruleAssignementOperator : ( '<-' ) ;
    public final void ruleAssignementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( '<-' ) )
            // InternalDSL.g:267:2: ( '<-' )
            {
            // InternalDSL.g:267:2: ( '<-' )
            // InternalDSL.g:268:3: '<-'
            {
             before(grammarAccess.getAssignementOperatorAccess().getLessThanSignHyphenMinusKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAssignementOperatorAccess().getLessThanSignHyphenMinusKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignementOperator"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDSL.g:277:1: rule__AbstractElement__Alternatives : ( ( ruleDataType ) | ( ruleValueSet ) | ( ruleCharacteristicsType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:281:1: ( ( ruleDataType ) | ( ruleValueSet ) | ( ruleCharacteristicsType ) )
            int alt2=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:282:2: ( ruleDataType )
                    {
                    // InternalDSL.g:282:2: ( ruleDataType )
                    // InternalDSL.g:283:3: ruleDataType
                    {
                     before(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:288:2: ( ruleValueSet )
                    {
                    // InternalDSL.g:288:2: ( ruleValueSet )
                    // InternalDSL.g:289:3: ruleValueSet
                    {
                     before(grammarAccess.getAbstractElementAccess().getValueSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValueSet();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getValueSetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:294:2: ( ruleCharacteristicsType )
                    {
                    // InternalDSL.g:294:2: ( ruleCharacteristicsType )
                    // InternalDSL.g:295:3: ruleCharacteristicsType
                    {
                     before(grammarAccess.getAbstractElementAccess().getCharacteristicsTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicsType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCharacteristicsTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__CharacteristicsType__Alternatives"
    // InternalDSL.g:304:1: rule__CharacteristicsType__Alternatives : ( ( ruleAttributeType ) | ( rulePropertyType ) );
    public final void rule__CharacteristicsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:308:1: ( ( ruleAttributeType ) | ( rulePropertyType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:309:2: ( ruleAttributeType )
                    {
                    // InternalDSL.g:309:2: ( ruleAttributeType )
                    // InternalDSL.g:310:3: ruleAttributeType
                    {
                     before(grammarAccess.getCharacteristicsTypeAccess().getAttributeTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeType();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicsTypeAccess().getAttributeTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:315:2: ( rulePropertyType )
                    {
                    // InternalDSL.g:315:2: ( rulePropertyType )
                    // InternalDSL.g:316:3: rulePropertyType
                    {
                     before(grammarAccess.getCharacteristicsTypeAccess().getPropertyTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyType();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicsTypeAccess().getPropertyTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicsType__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDSL.g:325:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:329:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDSL.g:330:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDSL.g:337:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:1: ( ( 'datatype' ) )
            // InternalDSL.g:342:1: ( 'datatype' )
            {
            // InternalDSL.g:342:1: ( 'datatype' )
            // InternalDSL.g:343:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDSL.g:352:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:356:1: ( rule__DataType__Group__1__Impl )
            // InternalDSL.g:357:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDSL.g:363:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:367:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDSL.g:368:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDSL.g:368:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDSL.g:369:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:370:2: ( rule__DataType__NameAssignment_1 )
            // InternalDSL.g:370:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__ValueSet__Group__0"
    // InternalDSL.g:379:1: rule__ValueSet__Group__0 : rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1 ;
    public final void rule__ValueSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:383:1: ( rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1 )
            // InternalDSL.g:384:2: rule__ValueSet__Group__0__Impl rule__ValueSet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ValueSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__0"


    // $ANTLR start "rule__ValueSet__Group__0__Impl"
    // InternalDSL.g:391:1: rule__ValueSet__Group__0__Impl : ( 'valueset' ) ;
    public final void rule__ValueSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:395:1: ( ( 'valueset' ) )
            // InternalDSL.g:396:1: ( 'valueset' )
            {
            // InternalDSL.g:396:1: ( 'valueset' )
            // InternalDSL.g:397:2: 'valueset'
            {
             before(grammarAccess.getValueSetAccess().getValuesetKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getValuesetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__0__Impl"


    // $ANTLR start "rule__ValueSet__Group__1"
    // InternalDSL.g:406:1: rule__ValueSet__Group__1 : rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2 ;
    public final void rule__ValueSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:410:1: ( rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2 )
            // InternalDSL.g:411:2: rule__ValueSet__Group__1__Impl rule__ValueSet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ValueSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__1"


    // $ANTLR start "rule__ValueSet__Group__1__Impl"
    // InternalDSL.g:418:1: rule__ValueSet__Group__1__Impl : ( ( rule__ValueSet__NameAssignment_1 ) ) ;
    public final void rule__ValueSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:422:1: ( ( ( rule__ValueSet__NameAssignment_1 ) ) )
            // InternalDSL.g:423:1: ( ( rule__ValueSet__NameAssignment_1 ) )
            {
            // InternalDSL.g:423:1: ( ( rule__ValueSet__NameAssignment_1 ) )
            // InternalDSL.g:424:2: ( rule__ValueSet__NameAssignment_1 )
            {
             before(grammarAccess.getValueSetAccess().getNameAssignment_1()); 
            // InternalDSL.g:425:2: ( rule__ValueSet__NameAssignment_1 )
            // InternalDSL.g:425:3: rule__ValueSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__1__Impl"


    // $ANTLR start "rule__ValueSet__Group__2"
    // InternalDSL.g:433:1: rule__ValueSet__Group__2 : rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3 ;
    public final void rule__ValueSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:437:1: ( rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3 )
            // InternalDSL.g:438:2: rule__ValueSet__Group__2__Impl rule__ValueSet__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ValueSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__2"


    // $ANTLR start "rule__ValueSet__Group__2__Impl"
    // InternalDSL.g:445:1: rule__ValueSet__Group__2__Impl : ( ruleAssignementOperator ) ;
    public final void rule__ValueSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:449:1: ( ( ruleAssignementOperator ) )
            // InternalDSL.g:450:1: ( ruleAssignementOperator )
            {
            // InternalDSL.g:450:1: ( ruleAssignementOperator )
            // InternalDSL.g:451:2: ruleAssignementOperator
            {
             before(grammarAccess.getValueSetAccess().getAssignementOperatorParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getValueSetAccess().getAssignementOperatorParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__2__Impl"


    // $ANTLR start "rule__ValueSet__Group__3"
    // InternalDSL.g:460:1: rule__ValueSet__Group__3 : rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4 ;
    public final void rule__ValueSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:464:1: ( rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4 )
            // InternalDSL.g:465:2: rule__ValueSet__Group__3__Impl rule__ValueSet__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ValueSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__3"


    // $ANTLR start "rule__ValueSet__Group__3__Impl"
    // InternalDSL.g:472:1: rule__ValueSet__Group__3__Impl : ( '[' ) ;
    public final void rule__ValueSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:476:1: ( ( '[' ) )
            // InternalDSL.g:477:1: ( '[' )
            {
            // InternalDSL.g:477:1: ( '[' )
            // InternalDSL.g:478:2: '['
            {
             before(grammarAccess.getValueSetAccess().getLeftSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__3__Impl"


    // $ANTLR start "rule__ValueSet__Group__4"
    // InternalDSL.g:487:1: rule__ValueSet__Group__4 : rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5 ;
    public final void rule__ValueSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:1: ( rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5 )
            // InternalDSL.g:492:2: rule__ValueSet__Group__4__Impl rule__ValueSet__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ValueSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__4"


    // $ANTLR start "rule__ValueSet__Group__4__Impl"
    // InternalDSL.g:499:1: rule__ValueSet__Group__4__Impl : ( ( rule__ValueSet__MembersAssignment_4 ) ) ;
    public final void rule__ValueSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:503:1: ( ( ( rule__ValueSet__MembersAssignment_4 ) ) )
            // InternalDSL.g:504:1: ( ( rule__ValueSet__MembersAssignment_4 ) )
            {
            // InternalDSL.g:504:1: ( ( rule__ValueSet__MembersAssignment_4 ) )
            // InternalDSL.g:505:2: ( rule__ValueSet__MembersAssignment_4 )
            {
             before(grammarAccess.getValueSetAccess().getMembersAssignment_4()); 
            // InternalDSL.g:506:2: ( rule__ValueSet__MembersAssignment_4 )
            // InternalDSL.g:506:3: rule__ValueSet__MembersAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__MembersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getMembersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__4__Impl"


    // $ANTLR start "rule__ValueSet__Group__5"
    // InternalDSL.g:514:1: rule__ValueSet__Group__5 : rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6 ;
    public final void rule__ValueSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:518:1: ( rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6 )
            // InternalDSL.g:519:2: rule__ValueSet__Group__5__Impl rule__ValueSet__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ValueSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__5"


    // $ANTLR start "rule__ValueSet__Group__5__Impl"
    // InternalDSL.g:526:1: rule__ValueSet__Group__5__Impl : ( ( rule__ValueSet__Group_5__0 )* ) ;
    public final void rule__ValueSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:530:1: ( ( ( rule__ValueSet__Group_5__0 )* ) )
            // InternalDSL.g:531:1: ( ( rule__ValueSet__Group_5__0 )* )
            {
            // InternalDSL.g:531:1: ( ( rule__ValueSet__Group_5__0 )* )
            // InternalDSL.g:532:2: ( rule__ValueSet__Group_5__0 )*
            {
             before(grammarAccess.getValueSetAccess().getGroup_5()); 
            // InternalDSL.g:533:2: ( rule__ValueSet__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSL.g:533:3: rule__ValueSet__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ValueSet__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getValueSetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__5__Impl"


    // $ANTLR start "rule__ValueSet__Group__6"
    // InternalDSL.g:541:1: rule__ValueSet__Group__6 : rule__ValueSet__Group__6__Impl ;
    public final void rule__ValueSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:545:1: ( rule__ValueSet__Group__6__Impl )
            // InternalDSL.g:546:2: rule__ValueSet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__6"


    // $ANTLR start "rule__ValueSet__Group__6__Impl"
    // InternalDSL.g:552:1: rule__ValueSet__Group__6__Impl : ( ']' ) ;
    public final void rule__ValueSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:556:1: ( ( ']' ) )
            // InternalDSL.g:557:1: ( ']' )
            {
            // InternalDSL.g:557:1: ( ']' )
            // InternalDSL.g:558:2: ']'
            {
             before(grammarAccess.getValueSetAccess().getRightSquareBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group__6__Impl"


    // $ANTLR start "rule__ValueSet__Group_5__0"
    // InternalDSL.g:568:1: rule__ValueSet__Group_5__0 : rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1 ;
    public final void rule__ValueSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:572:1: ( rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1 )
            // InternalDSL.g:573:2: rule__ValueSet__Group_5__0__Impl rule__ValueSet__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ValueSet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueSet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__0"


    // $ANTLR start "rule__ValueSet__Group_5__0__Impl"
    // InternalDSL.g:580:1: rule__ValueSet__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ValueSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:584:1: ( ( ',' ) )
            // InternalDSL.g:585:1: ( ',' )
            {
            // InternalDSL.g:585:1: ( ',' )
            // InternalDSL.g:586:2: ','
            {
             before(grammarAccess.getValueSetAccess().getCommaKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__0__Impl"


    // $ANTLR start "rule__ValueSet__Group_5__1"
    // InternalDSL.g:595:1: rule__ValueSet__Group_5__1 : rule__ValueSet__Group_5__1__Impl ;
    public final void rule__ValueSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:599:1: ( rule__ValueSet__Group_5__1__Impl )
            // InternalDSL.g:600:2: rule__ValueSet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__1"


    // $ANTLR start "rule__ValueSet__Group_5__1__Impl"
    // InternalDSL.g:606:1: rule__ValueSet__Group_5__1__Impl : ( ( rule__ValueSet__MembersAssignment_5_1 ) ) ;
    public final void rule__ValueSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:610:1: ( ( ( rule__ValueSet__MembersAssignment_5_1 ) ) )
            // InternalDSL.g:611:1: ( ( rule__ValueSet__MembersAssignment_5_1 ) )
            {
            // InternalDSL.g:611:1: ( ( rule__ValueSet__MembersAssignment_5_1 ) )
            // InternalDSL.g:612:2: ( rule__ValueSet__MembersAssignment_5_1 )
            {
             before(grammarAccess.getValueSetAccess().getMembersAssignment_5_1()); 
            // InternalDSL.g:613:2: ( rule__ValueSet__MembersAssignment_5_1 )
            // InternalDSL.g:613:3: rule__ValueSet__MembersAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueSet__MembersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getMembersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__Group_5__1__Impl"


    // $ANTLR start "rule__AttributeType__Group__0"
    // InternalDSL.g:622:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:626:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // InternalDSL.g:627:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0"


    // $ANTLR start "rule__AttributeType__Group__0__Impl"
    // InternalDSL.g:634:1: rule__AttributeType__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:638:1: ( ( 'attribute' ) )
            // InternalDSL.g:639:1: ( 'attribute' )
            {
            // InternalDSL.g:639:1: ( 'attribute' )
            // InternalDSL.g:640:2: 'attribute'
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0__Impl"


    // $ANTLR start "rule__AttributeType__Group__1"
    // InternalDSL.g:649:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2 ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:653:1: ( rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2 )
            // InternalDSL.g:654:2: rule__AttributeType__Group__1__Impl rule__AttributeType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AttributeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1"


    // $ANTLR start "rule__AttributeType__Group__1__Impl"
    // InternalDSL.g:661:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__NameAssignment_1 ) ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:665:1: ( ( ( rule__AttributeType__NameAssignment_1 ) ) )
            // InternalDSL.g:666:1: ( ( rule__AttributeType__NameAssignment_1 ) )
            {
            // InternalDSL.g:666:1: ( ( rule__AttributeType__NameAssignment_1 ) )
            // InternalDSL.g:667:2: ( rule__AttributeType__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:668:2: ( rule__AttributeType__NameAssignment_1 )
            // InternalDSL.g:668:3: rule__AttributeType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1__Impl"


    // $ANTLR start "rule__AttributeType__Group__2"
    // InternalDSL.g:676:1: rule__AttributeType__Group__2 : rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3 ;
    public final void rule__AttributeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:680:1: ( rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3 )
            // InternalDSL.g:681:2: rule__AttributeType__Group__2__Impl rule__AttributeType__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AttributeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__2"


    // $ANTLR start "rule__AttributeType__Group__2__Impl"
    // InternalDSL.g:688:1: rule__AttributeType__Group__2__Impl : ( ruleAssignementOperator ) ;
    public final void rule__AttributeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:692:1: ( ( ruleAssignementOperator ) )
            // InternalDSL.g:693:1: ( ruleAssignementOperator )
            {
            // InternalDSL.g:693:1: ( ruleAssignementOperator )
            // InternalDSL.g:694:2: ruleAssignementOperator
            {
             before(grammarAccess.getAttributeTypeAccess().getAssignementOperatorParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getAssignementOperatorParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__2__Impl"


    // $ANTLR start "rule__AttributeType__Group__3"
    // InternalDSL.g:703:1: rule__AttributeType__Group__3 : rule__AttributeType__Group__3__Impl ;
    public final void rule__AttributeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:707:1: ( rule__AttributeType__Group__3__Impl )
            // InternalDSL.g:708:2: rule__AttributeType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__3"


    // $ANTLR start "rule__AttributeType__Group__3__Impl"
    // InternalDSL.g:714:1: rule__AttributeType__Group__3__Impl : ( ( rule__AttributeType__ValuesetAssignment_3 ) ) ;
    public final void rule__AttributeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:718:1: ( ( ( rule__AttributeType__ValuesetAssignment_3 ) ) )
            // InternalDSL.g:719:1: ( ( rule__AttributeType__ValuesetAssignment_3 ) )
            {
            // InternalDSL.g:719:1: ( ( rule__AttributeType__ValuesetAssignment_3 ) )
            // InternalDSL.g:720:2: ( rule__AttributeType__ValuesetAssignment_3 )
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetAssignment_3()); 
            // InternalDSL.g:721:2: ( rule__AttributeType__ValuesetAssignment_3 )
            // InternalDSL.g:721:3: rule__AttributeType__ValuesetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__ValuesetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getValuesetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__3__Impl"


    // $ANTLR start "rule__PropertyType__Group__0"
    // InternalDSL.g:730:1: rule__PropertyType__Group__0 : rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 ;
    public final void rule__PropertyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:734:1: ( rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 )
            // InternalDSL.g:735:2: rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PropertyType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__0"


    // $ANTLR start "rule__PropertyType__Group__0__Impl"
    // InternalDSL.g:742:1: rule__PropertyType__Group__0__Impl : ( 'property' ) ;
    public final void rule__PropertyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:746:1: ( ( 'property' ) )
            // InternalDSL.g:747:1: ( 'property' )
            {
            // InternalDSL.g:747:1: ( 'property' )
            // InternalDSL.g:748:2: 'property'
            {
             before(grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPropertyTypeAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__0__Impl"


    // $ANTLR start "rule__PropertyType__Group__1"
    // InternalDSL.g:757:1: rule__PropertyType__Group__1 : rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 ;
    public final void rule__PropertyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:761:1: ( rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 )
            // InternalDSL.g:762:2: rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__1"


    // $ANTLR start "rule__PropertyType__Group__1__Impl"
    // InternalDSL.g:769:1: rule__PropertyType__Group__1__Impl : ( ( rule__PropertyType__NameAssignment_1 ) ) ;
    public final void rule__PropertyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:773:1: ( ( ( rule__PropertyType__NameAssignment_1 ) ) )
            // InternalDSL.g:774:1: ( ( rule__PropertyType__NameAssignment_1 ) )
            {
            // InternalDSL.g:774:1: ( ( rule__PropertyType__NameAssignment_1 ) )
            // InternalDSL.g:775:2: ( rule__PropertyType__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:776:2: ( rule__PropertyType__NameAssignment_1 )
            // InternalDSL.g:776:3: rule__PropertyType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__1__Impl"


    // $ANTLR start "rule__PropertyType__Group__2"
    // InternalDSL.g:784:1: rule__PropertyType__Group__2 : rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3 ;
    public final void rule__PropertyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:788:1: ( rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3 )
            // InternalDSL.g:789:2: rule__PropertyType__Group__2__Impl rule__PropertyType__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PropertyType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__2"


    // $ANTLR start "rule__PropertyType__Group__2__Impl"
    // InternalDSL.g:796:1: rule__PropertyType__Group__2__Impl : ( ruleAssignementOperator ) ;
    public final void rule__PropertyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:800:1: ( ( ruleAssignementOperator ) )
            // InternalDSL.g:801:1: ( ruleAssignementOperator )
            {
            // InternalDSL.g:801:1: ( ruleAssignementOperator )
            // InternalDSL.g:802:2: ruleAssignementOperator
            {
             before(grammarAccess.getPropertyTypeAccess().getAssignementOperatorParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAssignementOperator();

            state._fsp--;

             after(grammarAccess.getPropertyTypeAccess().getAssignementOperatorParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__2__Impl"


    // $ANTLR start "rule__PropertyType__Group__3"
    // InternalDSL.g:811:1: rule__PropertyType__Group__3 : rule__PropertyType__Group__3__Impl ;
    public final void rule__PropertyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:815:1: ( rule__PropertyType__Group__3__Impl )
            // InternalDSL.g:816:2: rule__PropertyType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__3"


    // $ANTLR start "rule__PropertyType__Group__3__Impl"
    // InternalDSL.g:822:1: rule__PropertyType__Group__3__Impl : ( ( rule__PropertyType__ValuesetAssignment_3 ) ) ;
    public final void rule__PropertyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:826:1: ( ( ( rule__PropertyType__ValuesetAssignment_3 ) ) )
            // InternalDSL.g:827:1: ( ( rule__PropertyType__ValuesetAssignment_3 ) )
            {
            // InternalDSL.g:827:1: ( ( rule__PropertyType__ValuesetAssignment_3 ) )
            // InternalDSL.g:828:2: ( rule__PropertyType__ValuesetAssignment_3 )
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetAssignment_3()); 
            // InternalDSL.g:829:2: ( rule__PropertyType__ValuesetAssignment_3 )
            // InternalDSL.g:829:3: rule__PropertyType__ValuesetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__ValuesetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getValuesetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__3__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group__0"
    // InternalDSL.g:838:1: rule__CharacteristicSelector__Group__0 : rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1 ;
    public final void rule__CharacteristicSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:842:1: ( rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1 )
            // InternalDSL.g:843:2: rule__CharacteristicSelector__Group__0__Impl rule__CharacteristicSelector__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CharacteristicSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__0"


    // $ANTLR start "rule__CharacteristicSelector__Group__0__Impl"
    // InternalDSL.g:850:1: rule__CharacteristicSelector__Group__0__Impl : ( ( rule__CharacteristicSelector__NameAssignment_0 ) ) ;
    public final void rule__CharacteristicSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:854:1: ( ( ( rule__CharacteristicSelector__NameAssignment_0 ) ) )
            // InternalDSL.g:855:1: ( ( rule__CharacteristicSelector__NameAssignment_0 ) )
            {
            // InternalDSL.g:855:1: ( ( rule__CharacteristicSelector__NameAssignment_0 ) )
            // InternalDSL.g:856:2: ( rule__CharacteristicSelector__NameAssignment_0 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNameAssignment_0()); 
            // InternalDSL.g:857:2: ( rule__CharacteristicSelector__NameAssignment_0 )
            // InternalDSL.g:857:3: rule__CharacteristicSelector__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group__1"
    // InternalDSL.g:865:1: rule__CharacteristicSelector__Group__1 : rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2 ;
    public final void rule__CharacteristicSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:869:1: ( rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2 )
            // InternalDSL.g:870:2: rule__CharacteristicSelector__Group__1__Impl rule__CharacteristicSelector__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__1"


    // $ANTLR start "rule__CharacteristicSelector__Group__1__Impl"
    // InternalDSL.g:877:1: rule__CharacteristicSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:881:1: ( ( '.' ) )
            // InternalDSL.g:882:1: ( '.' )
            {
            // InternalDSL.g:882:1: ( '.' )
            // InternalDSL.g:883:2: '.'
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getFullStopKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicSelector__Group__2"
    // InternalDSL.g:892:1: rule__CharacteristicSelector__Group__2 : rule__CharacteristicSelector__Group__2__Impl ;
    public final void rule__CharacteristicSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:896:1: ( rule__CharacteristicSelector__Group__2__Impl )
            // InternalDSL.g:897:2: rule__CharacteristicSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__2"


    // $ANTLR start "rule__CharacteristicSelector__Group__2__Impl"
    // InternalDSL.g:903:1: rule__CharacteristicSelector__Group__2__Impl : ( ( rule__CharacteristicSelector__LiteralAssignment_2 ) ) ;
    public final void rule__CharacteristicSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:907:1: ( ( ( rule__CharacteristicSelector__LiteralAssignment_2 ) ) )
            // InternalDSL.g:908:1: ( ( rule__CharacteristicSelector__LiteralAssignment_2 ) )
            {
            // InternalDSL.g:908:1: ( ( rule__CharacteristicSelector__LiteralAssignment_2 ) )
            // InternalDSL.g:909:2: ( rule__CharacteristicSelector__LiteralAssignment_2 )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralAssignment_2()); 
            // InternalDSL.g:910:2: ( rule__CharacteristicSelector__LiteralAssignment_2 )
            // InternalDSL.g:910:3: rule__CharacteristicSelector__LiteralAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSelector__LiteralAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalDSL.g:919:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:923:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:924:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:924:2: ( ruleAbstractElement )
            // InternalDSL.g:925:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalDSL.g:934:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:938:1: ( ( RULE_ID ) )
            // InternalDSL.g:939:2: ( RULE_ID )
            {
            // InternalDSL.g:939:2: ( RULE_ID )
            // InternalDSL.g:940:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__ValueSet__NameAssignment_1"
    // InternalDSL.g:949:1: rule__ValueSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValueSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:953:1: ( ( RULE_ID ) )
            // InternalDSL.g:954:2: ( RULE_ID )
            {
            // InternalDSL.g:954:2: ( RULE_ID )
            // InternalDSL.g:955:3: RULE_ID
            {
             before(grammarAccess.getValueSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__NameAssignment_1"


    // $ANTLR start "rule__ValueSet__MembersAssignment_4"
    // InternalDSL.g:964:1: rule__ValueSet__MembersAssignment_4 : ( RULE_ID ) ;
    public final void rule__ValueSet__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:968:1: ( ( RULE_ID ) )
            // InternalDSL.g:969:2: ( RULE_ID )
            {
            // InternalDSL.g:969:2: ( RULE_ID )
            // InternalDSL.g:970:3: RULE_ID
            {
             before(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__MembersAssignment_4"


    // $ANTLR start "rule__ValueSet__MembersAssignment_5_1"
    // InternalDSL.g:979:1: rule__ValueSet__MembersAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ValueSet__MembersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:983:1: ( ( RULE_ID ) )
            // InternalDSL.g:984:2: ( RULE_ID )
            {
            // InternalDSL.g:984:2: ( RULE_ID )
            // InternalDSL.g:985:3: RULE_ID
            {
             before(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueSetAccess().getMembersIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueSet__MembersAssignment_5_1"


    // $ANTLR start "rule__AttributeType__NameAssignment_1"
    // InternalDSL.g:994:1: rule__AttributeType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:998:1: ( ( RULE_ID ) )
            // InternalDSL.g:999:2: ( RULE_ID )
            {
            // InternalDSL.g:999:2: ( RULE_ID )
            // InternalDSL.g:1000:3: RULE_ID
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_1"


    // $ANTLR start "rule__AttributeType__ValuesetAssignment_3"
    // InternalDSL.g:1009:1: rule__AttributeType__ValuesetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeType__ValuesetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1013:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:1014:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:1014:2: ( ( RULE_ID ) )
            // InternalDSL.g:1015:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetValueSetCrossReference_3_0()); 
            // InternalDSL.g:1016:3: ( RULE_ID )
            // InternalDSL.g:1017:4: RULE_ID
            {
             before(grammarAccess.getAttributeTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getValuesetValueSetCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__ValuesetAssignment_3"


    // $ANTLR start "rule__PropertyType__NameAssignment_1"
    // InternalDSL.g:1028:1: rule__PropertyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1032:1: ( ( RULE_ID ) )
            // InternalDSL.g:1033:2: ( RULE_ID )
            {
            // InternalDSL.g:1033:2: ( RULE_ID )
            // InternalDSL.g:1034:3: RULE_ID
            {
             before(grammarAccess.getPropertyTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__NameAssignment_1"


    // $ANTLR start "rule__PropertyType__ValuesetAssignment_3"
    // InternalDSL.g:1043:1: rule__PropertyType__ValuesetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyType__ValuesetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1047:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:1048:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:1048:2: ( ( RULE_ID ) )
            // InternalDSL.g:1049:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetValueSetCrossReference_3_0()); 
            // InternalDSL.g:1050:3: ( RULE_ID )
            // InternalDSL.g:1051:4: RULE_ID
            {
             before(grammarAccess.getPropertyTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyTypeAccess().getValuesetValueSetIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPropertyTypeAccess().getValuesetValueSetCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__ValuesetAssignment_3"


    // $ANTLR start "rule__CharacteristicSelector__NameAssignment_0"
    // InternalDSL.g:1062:1: rule__CharacteristicSelector__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicSelector__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1066:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:1067:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:1067:2: ( ( RULE_ID ) )
            // InternalDSL.g:1068:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNameCharacteristicsTypeCrossReference_0_0()); 
            // InternalDSL.g:1069:3: ( RULE_ID )
            // InternalDSL.g:1070:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getNameCharacteristicsTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getNameCharacteristicsTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCharacteristicSelectorAccess().getNameCharacteristicsTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__NameAssignment_0"


    // $ANTLR start "rule__CharacteristicSelector__LiteralAssignment_2"
    // InternalDSL.g:1081:1: rule__CharacteristicSelector__LiteralAssignment_2 : ( RULE_ID ) ;
    public final void rule__CharacteristicSelector__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1085:1: ( ( RULE_ID ) )
            // InternalDSL.g:1086:2: ( RULE_ID )
            {
            // InternalDSL.g:1086:2: ( RULE_ID )
            // InternalDSL.g:1087:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicSelectorAccess().getLiteralIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSelectorAccess().getLiteralIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacteristicSelector__LiteralAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000063002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}