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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "':'", "'class'", "'{'", "'}'", "','", "'.'", "'['", "']'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'!'", "'FLOWS'", "'NEVER'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

                if ( (LA1_0==RULE_SL_COMMENT||LA1_0==11||LA1_0==13||(LA1_0>=20 && LA1_0<=21)) ) {
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


    // $ANTLR start "entryRuleCharacteristicType"
    // InternalDSL.g:103:1: entryRuleCharacteristicType : ruleCharacteristicType EOF ;
    public final void entryRuleCharacteristicType() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleCharacteristicType EOF )
            // InternalDSL.g:105:1: ruleCharacteristicType EOF
            {
             before(grammarAccess.getCharacteristicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicType();

            state._fsp--;

             after(grammarAccess.getCharacteristicTypeRule()); 
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
    // $ANTLR end "entryRuleCharacteristicType"


    // $ANTLR start "ruleCharacteristicType"
    // InternalDSL.g:112:1: ruleCharacteristicType : ( ( rule__CharacteristicType__Group__0 ) ) ;
    public final void ruleCharacteristicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__CharacteristicType__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__CharacteristicType__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__CharacteristicType__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__CharacteristicType__Group__0 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__CharacteristicType__Group__0 )
            // InternalDSL.g:119:4: rule__CharacteristicType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicType"


    // $ANTLR start "entryRuleCharacteristicClass"
    // InternalDSL.g:128:1: entryRuleCharacteristicClass : ruleCharacteristicClass EOF ;
    public final void entryRuleCharacteristicClass() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleCharacteristicClass EOF )
            // InternalDSL.g:130:1: ruleCharacteristicClass EOF
            {
             before(grammarAccess.getCharacteristicClassRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicClass();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassRule()); 
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
    // $ANTLR end "entryRuleCharacteristicClass"


    // $ANTLR start "ruleCharacteristicClass"
    // InternalDSL.g:137:1: ruleCharacteristicClass : ( ( rule__CharacteristicClass__Group__0 ) ) ;
    public final void ruleCharacteristicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__CharacteristicClass__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__CharacteristicClass__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__CharacteristicClass__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__CharacteristicClass__Group__0 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__CharacteristicClass__Group__0 )
            // InternalDSL.g:144:4: rule__CharacteristicClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicClass"


    // $ANTLR start "entryRuleCharacteristicTypeSelector"
    // InternalDSL.g:153:1: entryRuleCharacteristicTypeSelector : ruleCharacteristicTypeSelector EOF ;
    public final void entryRuleCharacteristicTypeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleCharacteristicTypeSelector EOF )
            // InternalDSL.g:155:1: ruleCharacteristicTypeSelector EOF
            {
             before(grammarAccess.getCharacteristicTypeSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicTypeSelectorRule()); 
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
    // $ANTLR end "entryRuleCharacteristicTypeSelector"


    // $ANTLR start "ruleCharacteristicTypeSelector"
    // InternalDSL.g:162:1: ruleCharacteristicTypeSelector : ( ( rule__CharacteristicTypeSelector__Group__0 ) ) ;
    public final void ruleCharacteristicTypeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__CharacteristicTypeSelector__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__CharacteristicTypeSelector__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__CharacteristicTypeSelector__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__CharacteristicTypeSelector__Group__0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__CharacteristicTypeSelector__Group__0 )
            // InternalDSL.g:169:4: rule__CharacteristicTypeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicTypeSelector"


    // $ANTLR start "entryRuleInclude"
    // InternalDSL.g:178:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleInclude EOF )
            // InternalDSL.g:180:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalDSL.g:187:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Include__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__Include__Group__0 )
            // InternalDSL.g:194:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleConstraint"
    // InternalDSL.g:203:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleConstraint EOF )
            // InternalDSL.g:205:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDSL.g:212:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Constraint__Group__0 )
            // InternalDSL.g:219:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRule"
    // InternalDSL.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleRule EOF )
            // InternalDSL.g:230:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDSL.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Rule__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__Rule__Group__0 )
            // InternalDSL.g:244:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDataSelector"
    // InternalDSL.g:253:1: entryRuleDataSelector : ruleDataSelector EOF ;
    public final void entryRuleDataSelector() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleDataSelector EOF )
            // InternalDSL.g:255:1: ruleDataSelector EOF
            {
             before(grammarAccess.getDataSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSelector();

            state._fsp--;

             after(grammarAccess.getDataSelectorRule()); 
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
    // $ANTLR end "entryRuleDataSelector"


    // $ANTLR start "ruleDataSelector"
    // InternalDSL.g:262:1: ruleDataSelector : ( ( rule__DataSelector__Alternatives ) ) ;
    public final void ruleDataSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__DataSelector__Alternatives ) ) )
            // InternalDSL.g:267:2: ( ( rule__DataSelector__Alternatives ) )
            {
            // InternalDSL.g:267:2: ( ( rule__DataSelector__Alternatives ) )
            // InternalDSL.g:268:3: ( rule__DataSelector__Alternatives )
            {
             before(grammarAccess.getDataSelectorAccess().getAlternatives()); 
            // InternalDSL.g:269:3: ( rule__DataSelector__Alternatives )
            // InternalDSL.g:269:4: rule__DataSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataSelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataSelectorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // InternalDSL.g:278:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleAttributeSelector EOF )
            // InternalDSL.g:280:1: ruleAttributeSelector EOF
            {
             before(grammarAccess.getAttributeSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeSelector();

            state._fsp--;

             after(grammarAccess.getAttributeSelectorRule()); 
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
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // InternalDSL.g:287:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__AttributeSelector__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__AttributeSelector__Group__0 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__AttributeSelector__Group__0 )
            // InternalDSL.g:294:4: rule__AttributeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleAttributeClassSelector"
    // InternalDSL.g:303:1: entryRuleAttributeClassSelector : ruleAttributeClassSelector EOF ;
    public final void entryRuleAttributeClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleAttributeClassSelector EOF )
            // InternalDSL.g:305:1: ruleAttributeClassSelector EOF
            {
             before(grammarAccess.getAttributeClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeClassSelector();

            state._fsp--;

             after(grammarAccess.getAttributeClassSelectorRule()); 
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
    // $ANTLR end "entryRuleAttributeClassSelector"


    // $ANTLR start "ruleAttributeClassSelector"
    // InternalDSL.g:312:1: ruleAttributeClassSelector : ( ( rule__AttributeClassSelector__Group__0 ) ) ;
    public final void ruleAttributeClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__AttributeClassSelector__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__AttributeClassSelector__Group__0 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__AttributeClassSelector__Group__0 )
            // InternalDSL.g:319:4: rule__AttributeClassSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeClassSelector"


    // $ANTLR start "entryRuleDestinationSelector"
    // InternalDSL.g:328:1: entryRuleDestinationSelector : ruleDestinationSelector EOF ;
    public final void entryRuleDestinationSelector() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleDestinationSelector EOF )
            // InternalDSL.g:330:1: ruleDestinationSelector EOF
            {
             before(grammarAccess.getDestinationSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDestinationSelector();

            state._fsp--;

             after(grammarAccess.getDestinationSelectorRule()); 
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
    // $ANTLR end "entryRuleDestinationSelector"


    // $ANTLR start "ruleDestinationSelector"
    // InternalDSL.g:337:1: ruleDestinationSelector : ( ( rule__DestinationSelector__Alternatives ) ) ;
    public final void ruleDestinationSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__DestinationSelector__Alternatives ) ) )
            // InternalDSL.g:342:2: ( ( rule__DestinationSelector__Alternatives ) )
            {
            // InternalDSL.g:342:2: ( ( rule__DestinationSelector__Alternatives ) )
            // InternalDSL.g:343:3: ( rule__DestinationSelector__Alternatives )
            {
             before(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 
            // InternalDSL.g:344:3: ( rule__DestinationSelector__Alternatives )
            // InternalDSL.g:344:4: rule__DestinationSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DestinationSelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDestinationSelector"


    // $ANTLR start "entryRulePropertySelector"
    // InternalDSL.g:353:1: entryRulePropertySelector : rulePropertySelector EOF ;
    public final void entryRulePropertySelector() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( rulePropertySelector EOF )
            // InternalDSL.g:355:1: rulePropertySelector EOF
            {
             before(grammarAccess.getPropertySelectorRule()); 
            pushFollow(FOLLOW_1);
            rulePropertySelector();

            state._fsp--;

             after(grammarAccess.getPropertySelectorRule()); 
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
    // $ANTLR end "entryRulePropertySelector"


    // $ANTLR start "rulePropertySelector"
    // InternalDSL.g:362:1: rulePropertySelector : ( ( rule__PropertySelector__Group__0 ) ) ;
    public final void rulePropertySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__PropertySelector__Group__0 ) ) )
            // InternalDSL.g:367:2: ( ( rule__PropertySelector__Group__0 ) )
            {
            // InternalDSL.g:367:2: ( ( rule__PropertySelector__Group__0 ) )
            // InternalDSL.g:368:3: ( rule__PropertySelector__Group__0 )
            {
             before(grammarAccess.getPropertySelectorAccess().getGroup()); 
            // InternalDSL.g:369:3: ( rule__PropertySelector__Group__0 )
            // InternalDSL.g:369:4: rule__PropertySelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectorAccess().getGroup()); 

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
    // $ANTLR end "rulePropertySelector"


    // $ANTLR start "entryRulePropertyClassSelector"
    // InternalDSL.g:378:1: entryRulePropertyClassSelector : rulePropertyClassSelector EOF ;
    public final void entryRulePropertyClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( rulePropertyClassSelector EOF )
            // InternalDSL.g:380:1: rulePropertyClassSelector EOF
            {
             before(grammarAccess.getPropertyClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyClassSelector();

            state._fsp--;

             after(grammarAccess.getPropertyClassSelectorRule()); 
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
    // $ANTLR end "entryRulePropertyClassSelector"


    // $ANTLR start "rulePropertyClassSelector"
    // InternalDSL.g:387:1: rulePropertyClassSelector : ( ( rule__PropertyClassSelector__Group__0 ) ) ;
    public final void rulePropertyClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__PropertyClassSelector__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__PropertyClassSelector__Group__0 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__PropertyClassSelector__Group__0 )
            // InternalDSL.g:394:4: rule__PropertyClassSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 

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
    // $ANTLR end "rulePropertyClassSelector"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:403:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleStatement EOF )
            // InternalDSL.g:405:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDSL.g:412:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__Statement__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__Statement__Group__0 )
            // InternalDSL.g:419:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatementType"
    // InternalDSL.g:428:1: entryRuleStatementType : ruleStatementType EOF ;
    public final void entryRuleStatementType() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleStatementType EOF )
            // InternalDSL.g:430:1: ruleStatementType EOF
            {
             before(grammarAccess.getStatementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStatementType();

            state._fsp--;

             after(grammarAccess.getStatementTypeRule()); 
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
    // $ANTLR end "entryRuleStatementType"


    // $ANTLR start "ruleStatementType"
    // InternalDSL.g:437:1: ruleStatementType : ( ( rule__StatementType__NameAssignment ) ) ;
    public final void ruleStatementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__StatementType__NameAssignment ) ) )
            // InternalDSL.g:442:2: ( ( rule__StatementType__NameAssignment ) )
            {
            // InternalDSL.g:442:2: ( ( rule__StatementType__NameAssignment ) )
            // InternalDSL.g:443:3: ( rule__StatementType__NameAssignment )
            {
             before(grammarAccess.getStatementTypeAccess().getNameAssignment()); 
            // InternalDSL.g:444:3: ( rule__StatementType__NameAssignment )
            // InternalDSL.g:444:4: rule__StatementType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StatementType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementTypeAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleStatementType"


    // $ANTLR start "entryRuleStatementModality"
    // InternalDSL.g:453:1: entryRuleStatementModality : ruleStatementModality EOF ;
    public final void entryRuleStatementModality() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleStatementModality EOF )
            // InternalDSL.g:455:1: ruleStatementModality EOF
            {
             before(grammarAccess.getStatementModalityRule()); 
            pushFollow(FOLLOW_1);
            ruleStatementModality();

            state._fsp--;

             after(grammarAccess.getStatementModalityRule()); 
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
    // $ANTLR end "entryRuleStatementModality"


    // $ANTLR start "ruleStatementModality"
    // InternalDSL.g:462:1: ruleStatementModality : ( ( rule__StatementModality__NameAssignment ) ) ;
    public final void ruleStatementModality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__StatementModality__NameAssignment ) ) )
            // InternalDSL.g:467:2: ( ( rule__StatementModality__NameAssignment ) )
            {
            // InternalDSL.g:467:2: ( ( rule__StatementModality__NameAssignment ) )
            // InternalDSL.g:468:3: ( rule__StatementModality__NameAssignment )
            {
             before(grammarAccess.getStatementModalityAccess().getNameAssignment()); 
            // InternalDSL.g:469:3: ( rule__StatementModality__NameAssignment )
            // InternalDSL.g:469:4: rule__StatementModality__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StatementModality__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatementModalityAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleStatementModality"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDSL.g:477:1: rule__AbstractElement__Alternatives : ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( RULE_SL_COMMENT ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:481:1: ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( RULE_SL_COMMENT ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case RULE_SL_COMMENT:
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
                    // InternalDSL.g:482:2: ( ruleInclude )
                    {
                    // InternalDSL.g:482:2: ( ruleInclude )
                    // InternalDSL.g:483:3: ruleInclude
                    {
                     before(grammarAccess.getAbstractElementAccess().getIncludeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIncludeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:488:2: ( ruleCharacteristicType )
                    {
                    // InternalDSL.g:488:2: ( ruleCharacteristicType )
                    // InternalDSL.g:489:3: ruleCharacteristicType
                    {
                     before(grammarAccess.getAbstractElementAccess().getCharacteristicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCharacteristicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:494:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:494:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:495:3: ruleCharacteristicClass
                    {
                     before(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:500:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:500:2: ( ruleConstraint )
                    // InternalDSL.g:501:3: ruleConstraint
                    {
                     before(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:506:2: ( RULE_SL_COMMENT )
                    {
                    // InternalDSL.g:506:2: ( RULE_SL_COMMENT )
                    // InternalDSL.g:507:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4()); 

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


    // $ANTLR start "rule__CharacteristicTypeSelector__Alternatives_2"
    // InternalDSL.g:516:1: rule__CharacteristicTypeSelector__Alternatives_2 : ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) );
    public final void rule__CharacteristicTypeSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:520:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==27) ) {
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
                    // InternalDSL.g:521:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:521:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    // InternalDSL.g:522:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:523:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    // InternalDSL.g:523:4: rule__CharacteristicTypeSelector__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:527:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:527:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    // InternalDSL.g:528:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:529:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    // InternalDSL.g:529:4: rule__CharacteristicTypeSelector__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Alternatives_2"


    // $ANTLR start "rule__DataSelector__Alternatives"
    // InternalDSL.g:537:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:542:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:542:2: ( ruleAttributeSelector )
                    // InternalDSL.g:543:3: ruleAttributeSelector
                    {
                     before(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeSelector();

                    state._fsp--;

                     after(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:548:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:548:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:549:3: ruleAttributeClassSelector
                    {
                     before(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeClassSelector();

                    state._fsp--;

                     after(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataSelector__Alternatives"


    // $ANTLR start "rule__DestinationSelector__Alternatives"
    // InternalDSL.g:558:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:562:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:563:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:563:2: ( rulePropertySelector )
                    // InternalDSL.g:564:3: rulePropertySelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePropertySelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:569:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:569:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:570:3: rulePropertyClassSelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyClassSelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 

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
    // $ANTLR end "rule__DestinationSelector__Alternatives"


    // $ANTLR start "rule__CharacteristicType__Group__0"
    // InternalDSL.g:579:1: rule__CharacteristicType__Group__0 : rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 ;
    public final void rule__CharacteristicType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:583:1: ( rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 )
            // InternalDSL.g:584:2: rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__1();

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
    // $ANTLR end "rule__CharacteristicType__Group__0"


    // $ANTLR start "rule__CharacteristicType__Group__0__Impl"
    // InternalDSL.g:591:1: rule__CharacteristicType__Group__0__Impl : ( 'type' ) ;
    public final void rule__CharacteristicType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:595:1: ( ( 'type' ) )
            // InternalDSL.g:596:1: ( 'type' )
            {
            // InternalDSL.g:596:1: ( 'type' )
            // InternalDSL.g:597:2: 'type'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__1"
    // InternalDSL.g:606:1: rule__CharacteristicType__Group__1 : rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 ;
    public final void rule__CharacteristicType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:610:1: ( rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 )
            // InternalDSL.g:611:2: rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CharacteristicType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__2();

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
    // $ANTLR end "rule__CharacteristicType__Group__1"


    // $ANTLR start "rule__CharacteristicType__Group__1__Impl"
    // InternalDSL.g:618:1: rule__CharacteristicType__Group__1__Impl : ( ( rule__CharacteristicType__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:622:1: ( ( ( rule__CharacteristicType__NameAssignment_1 ) ) )
            // InternalDSL.g:623:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            {
            // InternalDSL.g:623:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            // InternalDSL.g:624:2: ( rule__CharacteristicType__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:625:2: ( rule__CharacteristicType__NameAssignment_1 )
            // InternalDSL.g:625:3: rule__CharacteristicType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__2"
    // InternalDSL.g:633:1: rule__CharacteristicType__Group__2 : rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 ;
    public final void rule__CharacteristicType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:637:1: ( rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 )
            // InternalDSL.g:638:2: rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__3();

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
    // $ANTLR end "rule__CharacteristicType__Group__2"


    // $ANTLR start "rule__CharacteristicType__Group__2__Impl"
    // InternalDSL.g:645:1: rule__CharacteristicType__Group__2__Impl : ( ':' ) ;
    public final void rule__CharacteristicType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:649:1: ( ( ':' ) )
            // InternalDSL.g:650:1: ( ':' )
            {
            // InternalDSL.g:650:1: ( ':' )
            // InternalDSL.g:651:2: ':'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__3"
    // InternalDSL.g:660:1: rule__CharacteristicType__Group__3 : rule__CharacteristicType__Group__3__Impl ;
    public final void rule__CharacteristicType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:664:1: ( rule__CharacteristicType__Group__3__Impl )
            // InternalDSL.g:665:2: rule__CharacteristicType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__Group__3__Impl();

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
    // $ANTLR end "rule__CharacteristicType__Group__3"


    // $ANTLR start "rule__CharacteristicType__Group__3__Impl"
    // InternalDSL.g:671:1: rule__CharacteristicType__Group__3__Impl : ( ( rule__CharacteristicType__RefAssignment_3 ) ) ;
    public final void rule__CharacteristicType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:675:1: ( ( ( rule__CharacteristicType__RefAssignment_3 ) ) )
            // InternalDSL.g:676:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            {
            // InternalDSL.g:676:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            // InternalDSL.g:677:2: ( rule__CharacteristicType__RefAssignment_3 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 
            // InternalDSL.g:678:2: ( rule__CharacteristicType__RefAssignment_3 )
            // InternalDSL.g:678:3: rule__CharacteristicType__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicType__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 

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
    // $ANTLR end "rule__CharacteristicType__Group__3__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__0"
    // InternalDSL.g:687:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:692:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__1();

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
    // $ANTLR end "rule__CharacteristicClass__Group__0"


    // $ANTLR start "rule__CharacteristicClass__Group__0__Impl"
    // InternalDSL.g:699:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:703:1: ( ( 'class' ) )
            // InternalDSL.g:704:1: ( 'class' )
            {
            // InternalDSL.g:704:1: ( 'class' )
            // InternalDSL.g:705:2: 'class'
            {
             before(grammarAccess.getCharacteristicClassAccess().getClassKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getClassKeyword_0()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__1"
    // InternalDSL.g:714:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:718:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:719:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CharacteristicClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__2();

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
    // $ANTLR end "rule__CharacteristicClass__Group__1"


    // $ANTLR start "rule__CharacteristicClass__Group__1__Impl"
    // InternalDSL.g:726:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:730:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:731:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:731:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:732:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:733:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:733:3: rule__CharacteristicClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__2"
    // InternalDSL.g:741:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:745:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:746:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__3();

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
    // $ANTLR end "rule__CharacteristicClass__Group__2"


    // $ANTLR start "rule__CharacteristicClass__Group__2__Impl"
    // InternalDSL.g:753:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:757:1: ( ( '{' ) )
            // InternalDSL.g:758:1: ( '{' )
            {
            // InternalDSL.g:758:1: ( '{' )
            // InternalDSL.g:759:2: '{'
            {
             before(grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__3"
    // InternalDSL.g:768:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:772:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:773:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__4();

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
    // $ANTLR end "rule__CharacteristicClass__Group__3"


    // $ANTLR start "rule__CharacteristicClass__Group__3__Impl"
    // InternalDSL.g:780:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:784:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:785:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:785:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:786:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:787:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:787:3: rule__CharacteristicClass__MembersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__MembersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group__3__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__4"
    // InternalDSL.g:795:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:799:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:800:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__5();

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
    // $ANTLR end "rule__CharacteristicClass__Group__4"


    // $ANTLR start "rule__CharacteristicClass__Group__4__Impl"
    // InternalDSL.g:807:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:811:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:812:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:812:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:813:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:814:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:814:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CharacteristicClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group__4__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group__5"
    // InternalDSL.g:822:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:826:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:827:2: rule__CharacteristicClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group__5__Impl();

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
    // $ANTLR end "rule__CharacteristicClass__Group__5"


    // $ANTLR start "rule__CharacteristicClass__Group__5__Impl"
    // InternalDSL.g:833:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:837:1: ( ( '}' ) )
            // InternalDSL.g:838:1: ( '}' )
            {
            // InternalDSL.g:838:1: ( '}' )
            // InternalDSL.g:839:2: '}'
            {
             before(grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group__5__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group_4__0"
    // InternalDSL.g:849:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:853:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:854:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group_4__1();

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
    // $ANTLR end "rule__CharacteristicClass__Group_4__0"


    // $ANTLR start "rule__CharacteristicClass__Group_4__0__Impl"
    // InternalDSL.g:861:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:865:1: ( ( ',' ) )
            // InternalDSL.g:866:1: ( ',' )
            {
            // InternalDSL.g:866:1: ( ',' )
            // InternalDSL.g:867:2: ','
            {
             before(grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group_4__0__Impl"


    // $ANTLR start "rule__CharacteristicClass__Group_4__1"
    // InternalDSL.g:876:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:880:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:881:2: rule__CharacteristicClass__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__Group_4__1__Impl();

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
    // $ANTLR end "rule__CharacteristicClass__Group_4__1"


    // $ANTLR start "rule__CharacteristicClass__Group_4__1__Impl"
    // InternalDSL.g:887:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:891:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:892:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:892:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:893:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:894:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:894:3: rule__CharacteristicClass__MembersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicClass__MembersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 

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
    // $ANTLR end "rule__CharacteristicClass__Group_4__1__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__0"
    // InternalDSL.g:903:1: rule__CharacteristicTypeSelector__Group__0 : rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 ;
    public final void rule__CharacteristicTypeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:907:1: ( rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 )
            // InternalDSL.g:908:2: rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CharacteristicTypeSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__0__Impl"
    // InternalDSL.g:915:1: rule__CharacteristicTypeSelector__Group__0__Impl : ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:919:1: ( ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:920:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:920:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            // InternalDSL.g:921:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:922:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            // InternalDSL.g:922:3: rule__CharacteristicTypeSelector__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__1"
    // InternalDSL.g:930:1: rule__CharacteristicTypeSelector__Group__1 : rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 ;
    public final void rule__CharacteristicTypeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:934:1: ( rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 )
            // InternalDSL.g:935:2: rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CharacteristicTypeSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__2();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__1__Impl"
    // InternalDSL.g:942:1: rule__CharacteristicTypeSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicTypeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:946:1: ( ( '.' ) )
            // InternalDSL.g:947:1: ( '.' )
            {
            // InternalDSL.g:947:1: ( '.' )
            // InternalDSL.g:948:2: '.'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__2"
    // InternalDSL.g:957:1: rule__CharacteristicTypeSelector__Group__2 : rule__CharacteristicTypeSelector__Group__2__Impl ;
    public final void rule__CharacteristicTypeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:961:1: ( rule__CharacteristicTypeSelector__Group__2__Impl )
            // InternalDSL.g:962:2: rule__CharacteristicTypeSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group__2__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__2"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group__2__Impl"
    // InternalDSL.g:968:1: rule__CharacteristicTypeSelector__Group__2__Impl : ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:972:1: ( ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) )
            // InternalDSL.g:973:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:973:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            // InternalDSL.g:974:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:975:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            // InternalDSL.g:975:3: rule__CharacteristicTypeSelector__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__0"
    // InternalDSL.g:984:1: rule__CharacteristicTypeSelector__Group_2_0__0 : rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:988:1: ( rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 )
            // InternalDSL.g:989:2: rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1
            {
            pushFollow(FOLLOW_11);
            rule__CharacteristicTypeSelector__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_0__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__0__Impl"
    // InternalDSL.g:996:1: rule__CharacteristicTypeSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1000:1: ( ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:1001:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:1001:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:1002:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:1003:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1003:3: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__1"
    // InternalDSL.g:1011:1: rule__CharacteristicTypeSelector__Group_2_0__1 : rule__CharacteristicTypeSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1015:1: ( rule__CharacteristicTypeSelector__Group_2_0__1__Impl )
            // InternalDSL.g:1016:2: rule__CharacteristicTypeSelector__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_0__1__Impl"
    // InternalDSL.g:1022:1: rule__CharacteristicTypeSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1026:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:1027:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:1027:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:1028:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:1029:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:1029:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_0__1__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__0"
    // InternalDSL.g:1038:1: rule__CharacteristicTypeSelector__Group_2_1__0 : rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1042:1: ( rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 )
            // InternalDSL.g:1043:2: rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicTypeSelector__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__0__Impl"
    // InternalDSL.g:1050:1: rule__CharacteristicTypeSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1054:1: ( ( '[' ) )
            // InternalDSL.g:1055:1: ( '[' )
            {
            // InternalDSL.g:1055:1: ( '[' )
            // InternalDSL.g:1056:2: '['
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__1"
    // InternalDSL.g:1065:1: rule__CharacteristicTypeSelector__Group_2_1__1 : rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1069:1: ( rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 )
            // InternalDSL.g:1070:2: rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2
            {
            pushFollow(FOLLOW_12);
            rule__CharacteristicTypeSelector__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__2();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__1__Impl"
    // InternalDSL.g:1077:1: rule__CharacteristicTypeSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1081:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:1082:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:1082:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:1083:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:1084:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:1084:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__1__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__2"
    // InternalDSL.g:1092:1: rule__CharacteristicTypeSelector__Group_2_1__2 : rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1096:1: ( rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 )
            // InternalDSL.g:1097:2: rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3
            {
            pushFollow(FOLLOW_12);
            rule__CharacteristicTypeSelector__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__3();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__2"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__2__Impl"
    // InternalDSL.g:1104:1: rule__CharacteristicTypeSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1108:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) )
            // InternalDSL.g:1109:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            {
            // InternalDSL.g:1109:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            // InternalDSL.g:1110:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 
            // InternalDSL.g:1111:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:1111:3: rule__CharacteristicTypeSelector__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CharacteristicTypeSelector__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__2__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__3"
    // InternalDSL.g:1119:1: rule__CharacteristicTypeSelector__Group_2_1__3 : rule__CharacteristicTypeSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1123:1: ( rule__CharacteristicTypeSelector__Group_2_1__3__Impl )
            // InternalDSL.g:1124:2: rule__CharacteristicTypeSelector__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__3"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1__3__Impl"
    // InternalDSL.g:1130:1: rule__CharacteristicTypeSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1134:1: ( ( ']' ) )
            // InternalDSL.g:1135:1: ( ']' )
            {
            // InternalDSL.g:1135:1: ( ']' )
            // InternalDSL.g:1136:2: ']'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1__3__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__0"
    // InternalDSL.g:1146:1: rule__CharacteristicTypeSelector__Group_2_1_2__0 : rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1150:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 )
            // InternalDSL.g:1151:2: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1_2__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl"
    // InternalDSL.g:1158:1: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1162:1: ( ( ',' ) )
            // InternalDSL.g:1163:1: ( ',' )
            {
            // InternalDSL.g:1163:1: ( ',' )
            // InternalDSL.g:1164:2: ','
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__1"
    // InternalDSL.g:1173:1: rule__CharacteristicTypeSelector__Group_2_1_2__1 : rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1177:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl )
            // InternalDSL.g:1178:2: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl"
    // InternalDSL.g:1184:1: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1188:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) )
            // InternalDSL.g:1189:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            {
            // InternalDSL.g:1189:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            // InternalDSL.g:1190:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 
            // InternalDSL.g:1191:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            // InternalDSL.g:1191:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalDSL.g:1200:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1204:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalDSL.g:1205:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

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
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalDSL.g:1212:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1216:1: ( ( 'import' ) )
            // InternalDSL.g:1217:1: ( 'import' )
            {
            // InternalDSL.g:1217:1: ( 'import' )
            // InternalDSL.g:1218:2: 'import'
            {
             before(grammarAccess.getIncludeAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalDSL.g:1227:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1231:1: ( rule__Include__Group__1__Impl )
            // InternalDSL.g:1232:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__1__Impl();

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
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalDSL.g:1238:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1242:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalDSL.g:1243:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalDSL.g:1243:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalDSL.g:1244:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalDSL.g:1245:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalDSL.g:1245:3: rule__Include__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Include__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalDSL.g:1254:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1258:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:1259:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalDSL.g:1266:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1270:1: ( ( 'constraint' ) )
            // InternalDSL.g:1271:1: ( 'constraint' )
            {
            // InternalDSL.g:1271:1: ( 'constraint' )
            // InternalDSL.g:1272:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalDSL.g:1281:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1285:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:1286:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalDSL.g:1293:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1297:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:1298:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:1298:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:1299:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:1300:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:1300:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalDSL.g:1308:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1312:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:1313:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalDSL.g:1320:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1324:1: ( ( '{' ) )
            // InternalDSL.g:1325:1: ( '{' )
            {
            // InternalDSL.g:1325:1: ( '{' )
            // InternalDSL.g:1326:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalDSL.g:1335:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1339:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:1340:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

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
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalDSL.g:1347:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1351:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:1352:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:1352:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:1353:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:1354:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:1354:3: rule__Constraint__RuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__RuleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 

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
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalDSL.g:1362:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1366:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:1367:2: rule__Constraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

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
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalDSL.g:1373:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1377:1: ( ( '}' ) )
            // InternalDSL.g:1378:1: ( '}' )
            {
            // InternalDSL.g:1378:1: ( '}' )
            // InternalDSL.g:1379:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalDSL.g:1389:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1393:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:1394:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalDSL.g:1401:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1405:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:1406:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:1406:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:1407:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:1408:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:1408:3: rule__Rule__DataSelectorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DataSelectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalDSL.g:1416:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1420:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:1421:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalDSL.g:1428:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1432:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:1433:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:1433:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:1434:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:1435:2: ( rule__Rule__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:1435:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalDSL.g:1443:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1447:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:1448:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalDSL.g:1455:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1459:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:1460:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:1460:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:1461:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:1462:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:1462:3: rule__Rule__StatementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getStatementAssignment_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalDSL.g:1470:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1474:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:1475:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalDSL.g:1482:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1486:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:1487:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:1487:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:1488:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:1489:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:1489:3: rule__Rule__DestinationSelectorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DestinationSelectorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalDSL.g:1497:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1501:1: ( rule__Rule__Group__4__Impl )
            // InternalDSL.g:1502:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalDSL.g:1508:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1512:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:1513:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:1513:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:1514:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:1515:2: ( rule__Rule__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:1515:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // InternalDSL.g:1524:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1528:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:1529:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1();

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
    // $ANTLR end "rule__Rule__Group_1__0"


    // $ANTLR start "rule__Rule__Group_1__0__Impl"
    // InternalDSL.g:1536:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1540:1: ( ( '&' ) )
            // InternalDSL.g:1541:1: ( '&' )
            {
            // InternalDSL.g:1541:1: ( '&' )
            // InternalDSL.g:1542:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 

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
    // $ANTLR end "rule__Rule__Group_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_1__1"
    // InternalDSL.g:1551:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1555:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:1556:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_1__1"


    // $ANTLR start "rule__Rule__Group_1__1__Impl"
    // InternalDSL.g:1562:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1566:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:1567:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:1567:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:1568:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:1569:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:1569:3: rule__Rule__DataSelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DataSelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 

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
    // $ANTLR end "rule__Rule__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_4__0"
    // InternalDSL.g:1578:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1582:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:1583:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__1();

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
    // $ANTLR end "rule__Rule__Group_4__0"


    // $ANTLR start "rule__Rule__Group_4__0__Impl"
    // InternalDSL.g:1590:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1594:1: ( ( '&' ) )
            // InternalDSL.g:1595:1: ( '&' )
            {
            // InternalDSL.g:1595:1: ( '&' )
            // InternalDSL.g:1596:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 

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
    // $ANTLR end "rule__Rule__Group_4__0__Impl"


    // $ANTLR start "rule__Rule__Group_4__1"
    // InternalDSL.g:1605:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1609:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:1610:2: rule__Rule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_4__1"


    // $ANTLR start "rule__Rule__Group_4__1__Impl"
    // InternalDSL.g:1616:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1620:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:1621:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:1621:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:1622:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:1623:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:1623:3: rule__Rule__DestinationSelectorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__DestinationSelectorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 

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
    // $ANTLR end "rule__Rule__Group_4__1__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__0"
    // InternalDSL.g:1632:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1636:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:1637:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__1();

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
    // $ANTLR end "rule__AttributeSelector__Group__0"


    // $ANTLR start "rule__AttributeSelector__Group__0__Impl"
    // InternalDSL.g:1644:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1648:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:1649:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:1649:1: ( 'data.attribute.' )
            // InternalDSL.g:1650:2: 'data.attribute.'
            {
             before(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 

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
    // $ANTLR end "rule__AttributeSelector__Group__0__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__1"
    // InternalDSL.g:1659:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1663:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:1664:2: rule__AttributeSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeSelector__Group__1"


    // $ANTLR start "rule__AttributeSelector__Group__1__Impl"
    // InternalDSL.g:1670:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1674:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:1675:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:1675:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:1676:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:1677:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:1677:3: rule__AttributeSelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__AttributeSelector__Group__1__Impl"


    // $ANTLR start "rule__AttributeClassSelector__Group__0"
    // InternalDSL.g:1686:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1690:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:1691:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeClassSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__1();

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
    // $ANTLR end "rule__AttributeClassSelector__Group__0"


    // $ANTLR start "rule__AttributeClassSelector__Group__0__Impl"
    // InternalDSL.g:1698:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1702:1: ( ( 'data.class.' ) )
            // InternalDSL.g:1703:1: ( 'data.class.' )
            {
            // InternalDSL.g:1703:1: ( 'data.class.' )
            // InternalDSL.g:1704:2: 'data.class.'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 

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
    // $ANTLR end "rule__AttributeClassSelector__Group__0__Impl"


    // $ANTLR start "rule__AttributeClassSelector__Group__1"
    // InternalDSL.g:1713:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1717:1: ( rule__AttributeClassSelector__Group__1__Impl )
            // InternalDSL.g:1718:2: rule__AttributeClassSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeClassSelector__Group__1"


    // $ANTLR start "rule__AttributeClassSelector__Group__1__Impl"
    // InternalDSL.g:1724:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1728:1: ( ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:1729:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:1729:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:1730:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:1731:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            // InternalDSL.g:1731:3: rule__AttributeClassSelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeClassSelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__AttributeClassSelector__Group__1__Impl"


    // $ANTLR start "rule__PropertySelector__Group__0"
    // InternalDSL.g:1740:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1744:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:1745:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PropertySelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelector__Group__1();

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
    // $ANTLR end "rule__PropertySelector__Group__0"


    // $ANTLR start "rule__PropertySelector__Group__0__Impl"
    // InternalDSL.g:1752:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1756:1: ( ( 'node.property.' ) )
            // InternalDSL.g:1757:1: ( 'node.property.' )
            {
            // InternalDSL.g:1757:1: ( 'node.property.' )
            // InternalDSL.g:1758:2: 'node.property.'
            {
             before(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 

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
    // $ANTLR end "rule__PropertySelector__Group__0__Impl"


    // $ANTLR start "rule__PropertySelector__Group__1"
    // InternalDSL.g:1767:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1771:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:1772:2: rule__PropertySelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelector__Group__1__Impl();

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
    // $ANTLR end "rule__PropertySelector__Group__1"


    // $ANTLR start "rule__PropertySelector__Group__1__Impl"
    // InternalDSL.g:1778:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1782:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:1783:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:1783:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:1784:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:1785:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:1785:3: rule__PropertySelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__PropertySelector__Group__1__Impl"


    // $ANTLR start "rule__PropertyClassSelector__Group__0"
    // InternalDSL.g:1794:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1798:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:1799:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PropertyClassSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__1();

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
    // $ANTLR end "rule__PropertyClassSelector__Group__0"


    // $ANTLR start "rule__PropertyClassSelector__Group__0__Impl"
    // InternalDSL.g:1806:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1810:1: ( ( 'node.class.' ) )
            // InternalDSL.g:1811:1: ( 'node.class.' )
            {
            // InternalDSL.g:1811:1: ( 'node.class.' )
            // InternalDSL.g:1812:2: 'node.class.'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 

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
    // $ANTLR end "rule__PropertyClassSelector__Group__0__Impl"


    // $ANTLR start "rule__PropertyClassSelector__Group__1"
    // InternalDSL.g:1821:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1825:1: ( rule__PropertyClassSelector__Group__1__Impl )
            // InternalDSL.g:1826:2: rule__PropertyClassSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__Group__1__Impl();

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
    // $ANTLR end "rule__PropertyClassSelector__Group__1"


    // $ANTLR start "rule__PropertyClassSelector__Group__1__Impl"
    // InternalDSL.g:1832:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1836:1: ( ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:1837:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:1837:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:1838:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:1839:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            // InternalDSL.g:1839:3: rule__PropertyClassSelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyClassSelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__PropertyClassSelector__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalDSL.g:1848:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1852:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:1853:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalDSL.g:1860:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1864:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:1865:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:1865:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:1866:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:1867:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:1867:3: rule__Statement__ModalityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ModalityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getModalityAssignment_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalDSL.g:1875:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1879:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:1880:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalDSL.g:1886:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1890:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:1891:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:1891:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:1892:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:1893:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:1893:3: rule__Statement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalDSL.g:1902:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1906:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:1907:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:1907:2: ( ruleAbstractElement )
            // InternalDSL.g:1908:3: ruleAbstractElement
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


    // $ANTLR start "rule__CharacteristicType__NameAssignment_1"
    // InternalDSL.g:1917:1: rule__CharacteristicType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1921:1: ( ( RULE_ID ) )
            // InternalDSL.g:1922:2: ( RULE_ID )
            {
            // InternalDSL.g:1922:2: ( RULE_ID )
            // InternalDSL.g:1923:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CharacteristicType__NameAssignment_1"


    // $ANTLR start "rule__CharacteristicType__RefAssignment_3"
    // InternalDSL.g:1932:1: rule__CharacteristicType__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicType__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1936:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:1937:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:1937:2: ( ( RULE_ID ) )
            // InternalDSL.g:1938:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0()); 
            // InternalDSL.g:1939:3: ( RULE_ID )
            // InternalDSL.g:1940:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__CharacteristicType__RefAssignment_3"


    // $ANTLR start "rule__CharacteristicClass__NameAssignment_1"
    // InternalDSL.g:1951:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1955:1: ( ( RULE_ID ) )
            // InternalDSL.g:1956:2: ( RULE_ID )
            {
            // InternalDSL.g:1956:2: ( RULE_ID )
            // InternalDSL.g:1957:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CharacteristicClass__NameAssignment_1"


    // $ANTLR start "rule__CharacteristicClass__MembersAssignment_3"
    // InternalDSL.g:1966:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1970:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:1971:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:1971:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:1972:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CharacteristicClass__MembersAssignment_3"


    // $ANTLR start "rule__CharacteristicClass__MembersAssignment_4_1"
    // InternalDSL.g:1981:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1985:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:1986:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:1986:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:1987:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CharacteristicClass__MembersAssignment_4_1"


    // $ANTLR start "rule__CharacteristicTypeSelector__RefAssignment_0"
    // InternalDSL.g:1996:1: rule__CharacteristicTypeSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2000:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2001:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2001:2: ( ( RULE_ID ) )
            // InternalDSL.g:2002:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 
            // InternalDSL.g:2003:3: ( RULE_ID )
            // InternalDSL.g:2004:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__RefAssignment_0"


    // $ANTLR start "rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0"
    // InternalDSL.g:2015:1: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2019:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2020:2: ( ( '!' ) )
            {
            // InternalDSL.g:2020:2: ( ( '!' ) )
            // InternalDSL.g:2021:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:2022:3: ( '!' )
            // InternalDSL.g:2023:4: '!'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0"


    // $ANTLR start "rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1"
    // InternalDSL.g:2034:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2038:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2039:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2039:2: ( ( RULE_ID ) )
            // InternalDSL.g:2040:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0()); 
            // InternalDSL.g:2041:3: ( RULE_ID )
            // InternalDSL.g:2042:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1"


    // $ANTLR start "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1"
    // InternalDSL.g:2053:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2057:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2058:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2058:2: ( ( RULE_ID ) )
            // InternalDSL.g:2059:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0()); 
            // InternalDSL.g:2060:3: ( RULE_ID )
            // InternalDSL.g:2061:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1"


    // $ANTLR start "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1"
    // InternalDSL.g:2072:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2076:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2077:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2077:2: ( ( RULE_ID ) )
            // InternalDSL.g:2078:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0()); 
            // InternalDSL.g:2079:3: ( RULE_ID )
            // InternalDSL.g:2080:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralIDTerminalRuleCall_2_1_2_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1"


    // $ANTLR start "rule__Include__ImportURIAssignment_1"
    // InternalDSL.g:2091:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2095:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2096:2: ( RULE_STRING )
            {
            // InternalDSL.g:2096:2: ( RULE_STRING )
            // InternalDSL.g:2097:3: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Include__ImportURIAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalDSL.g:2106:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2110:1: ( ( RULE_ID ) )
            // InternalDSL.g:2111:2: ( RULE_ID )
            {
            // InternalDSL.g:2111:2: ( RULE_ID )
            // InternalDSL.g:2112:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__RuleAssignment_3"
    // InternalDSL.g:2121:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2125:1: ( ( ruleRule ) )
            // InternalDSL.g:2126:2: ( ruleRule )
            {
            // InternalDSL.g:2126:2: ( ruleRule )
            // InternalDSL.g:2127:3: ruleRule
            {
             before(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constraint__RuleAssignment_3"


    // $ANTLR start "rule__Rule__DataSelectorsAssignment_0"
    // InternalDSL.g:2136:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2140:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2141:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2141:2: ( ruleDataSelector )
            // InternalDSL.g:2142:3: ruleDataSelector
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rule__DataSelectorsAssignment_0"


    // $ANTLR start "rule__Rule__DataSelectorsAssignment_1_1"
    // InternalDSL.g:2151:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2155:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2156:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2156:2: ( ruleDataSelector )
            // InternalDSL.g:2157:3: ruleDataSelector
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Rule__DataSelectorsAssignment_1_1"


    // $ANTLR start "rule__Rule__StatementAssignment_2"
    // InternalDSL.g:2166:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2170:1: ( ( ruleStatement ) )
            // InternalDSL.g:2171:2: ( ruleStatement )
            {
            // InternalDSL.g:2171:2: ( ruleStatement )
            // InternalDSL.g:2172:3: ruleStatement
            {
             before(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__StatementAssignment_2"


    // $ANTLR start "rule__Rule__DestinationSelectorsAssignment_3"
    // InternalDSL.g:2181:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2185:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2186:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2186:2: ( ruleDestinationSelector )
            // InternalDSL.g:2187:3: ruleDestinationSelector
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__DestinationSelectorsAssignment_3"


    // $ANTLR start "rule__Rule__DestinationSelectorsAssignment_4_1"
    // InternalDSL.g:2196:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2200:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2201:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2201:2: ( ruleDestinationSelector )
            // InternalDSL.g:2202:3: ruleDestinationSelector
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationSelector();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Rule__DestinationSelectorsAssignment_4_1"


    // $ANTLR start "rule__AttributeSelector__RefAssignment_1"
    // InternalDSL.g:2211:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2215:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2216:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2216:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2217:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeSelector__RefAssignment_1"


    // $ANTLR start "rule__AttributeClassSelector__RefAssignment_1"
    // InternalDSL.g:2226:1: rule__AttributeClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2230:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2231:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2231:2: ( ( RULE_ID ) )
            // InternalDSL.g:2232:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:2233:3: ( RULE_ID )
            // InternalDSL.g:2234:4: RULE_ID
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__AttributeClassSelector__RefAssignment_1"


    // $ANTLR start "rule__PropertySelector__RefAssignment_1"
    // InternalDSL.g:2245:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2249:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2250:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2250:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2251:3: ruleCharacteristicTypeSelector
            {
             before(grammarAccess.getPropertySelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicTypeSelector();

            state._fsp--;

             after(grammarAccess.getPropertySelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PropertySelector__RefAssignment_1"


    // $ANTLR start "rule__PropertyClassSelector__RefAssignment_1"
    // InternalDSL.g:2260:1: rule__PropertyClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2264:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2265:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2265:2: ( ( RULE_ID ) )
            // InternalDSL.g:2266:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:2267:3: ( RULE_ID )
            // InternalDSL.g:2268:4: RULE_ID
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__PropertyClassSelector__RefAssignment_1"


    // $ANTLR start "rule__Statement__ModalityAssignment_0"
    // InternalDSL.g:2279:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2283:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:2284:2: ( ruleStatementModality )
            {
            // InternalDSL.g:2284:2: ( ruleStatementModality )
            // InternalDSL.g:2285:3: ruleStatementModality
            {
             before(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementModality();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statement__ModalityAssignment_0"


    // $ANTLR start "rule__Statement__TypeAssignment_1"
    // InternalDSL.g:2294:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2298:1: ( ( ruleStatementType ) )
            // InternalDSL.g:2299:2: ( ruleStatementType )
            {
            // InternalDSL.g:2299:2: ( ruleStatementType )
            // InternalDSL.g:2300:3: ruleStatementType
            {
             before(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementType();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__TypeAssignment_1"


    // $ANTLR start "rule__StatementType__NameAssignment"
    // InternalDSL.g:2309:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2313:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:2314:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:2314:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:2315:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:2316:3: ( 'FLOWS' )
            // InternalDSL.g:2317:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 

            }

             after(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 

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
    // $ANTLR end "rule__StatementType__NameAssignment"


    // $ANTLR start "rule__StatementModality__NameAssignment"
    // InternalDSL.g:2328:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2332:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:2333:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:2333:2: ( ( 'NEVER' ) )
            // InternalDSL.g:2334:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:2335:3: ( 'NEVER' )
            // InternalDSL.g:2336:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 

            }

             after(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 

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
    // $ANTLR end "rule__StatementModality__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000302812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008040020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});

}