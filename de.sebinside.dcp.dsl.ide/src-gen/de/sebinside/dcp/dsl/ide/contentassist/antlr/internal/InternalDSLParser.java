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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'", "'target'", "'type'", "':'", "'class'", "'{'", "'}'", "','", "'.'", "'['", "']'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'!'", "'FLOWS'", "'NEVER'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTargetModelTypeDef"
    // InternalDSL.g:78:1: entryRuleTargetModelTypeDef : ruleTargetModelTypeDef EOF ;
    public final void entryRuleTargetModelTypeDef() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleTargetModelTypeDef EOF )
            // InternalDSL.g:80:1: ruleTargetModelTypeDef EOF
            {
             before(grammarAccess.getTargetModelTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetModelTypeDef();

            state._fsp--;

             after(grammarAccess.getTargetModelTypeDefRule()); 
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
    // $ANTLR end "entryRuleTargetModelTypeDef"


    // $ANTLR start "ruleTargetModelTypeDef"
    // InternalDSL.g:87:1: ruleTargetModelTypeDef : ( ( rule__TargetModelTypeDef__Group__0 ) ) ;
    public final void ruleTargetModelTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__TargetModelTypeDef__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__TargetModelTypeDef__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__TargetModelTypeDef__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__TargetModelTypeDef__Group__0 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__TargetModelTypeDef__Group__0 )
            // InternalDSL.g:94:4: rule__TargetModelTypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getGroup()); 

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
    // $ANTLR end "ruleTargetModelTypeDef"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDSL.g:103:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleAbstractElement EOF )
            // InternalDSL.g:105:1: ruleAbstractElement EOF
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
    // InternalDSL.g:112:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalDSL.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalDSL.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalDSL.g:118:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalDSL.g:119:3: ( rule__AbstractElement__Alternatives )
            // InternalDSL.g:119:4: rule__AbstractElement__Alternatives
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
    // InternalDSL.g:128:1: entryRuleCharacteristicType : ruleCharacteristicType EOF ;
    public final void entryRuleCharacteristicType() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleCharacteristicType EOF )
            // InternalDSL.g:130:1: ruleCharacteristicType EOF
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
    // InternalDSL.g:137:1: ruleCharacteristicType : ( ( rule__CharacteristicType__Group__0 ) ) ;
    public final void ruleCharacteristicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__CharacteristicType__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__CharacteristicType__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__CharacteristicType__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__CharacteristicType__Group__0 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__CharacteristicType__Group__0 )
            // InternalDSL.g:144:4: rule__CharacteristicType__Group__0
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
    // InternalDSL.g:153:1: entryRuleCharacteristicClass : ruleCharacteristicClass EOF ;
    public final void entryRuleCharacteristicClass() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleCharacteristicClass EOF )
            // InternalDSL.g:155:1: ruleCharacteristicClass EOF
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
    // InternalDSL.g:162:1: ruleCharacteristicClass : ( ( rule__CharacteristicClass__Group__0 ) ) ;
    public final void ruleCharacteristicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__CharacteristicClass__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__CharacteristicClass__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__CharacteristicClass__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__CharacteristicClass__Group__0 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__CharacteristicClass__Group__0 )
            // InternalDSL.g:169:4: rule__CharacteristicClass__Group__0
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
    // InternalDSL.g:178:1: entryRuleCharacteristicTypeSelector : ruleCharacteristicTypeSelector EOF ;
    public final void entryRuleCharacteristicTypeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleCharacteristicTypeSelector EOF )
            // InternalDSL.g:180:1: ruleCharacteristicTypeSelector EOF
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
    // InternalDSL.g:187:1: ruleCharacteristicTypeSelector : ( ( rule__CharacteristicTypeSelector__Group__0 ) ) ;
    public final void ruleCharacteristicTypeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__CharacteristicTypeSelector__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__CharacteristicTypeSelector__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__CharacteristicTypeSelector__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__CharacteristicTypeSelector__Group__0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__CharacteristicTypeSelector__Group__0 )
            // InternalDSL.g:194:4: rule__CharacteristicTypeSelector__Group__0
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
    // InternalDSL.g:203:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleInclude EOF )
            // InternalDSL.g:205:1: ruleInclude EOF
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
    // InternalDSL.g:212:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Include__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Include__Group__0 )
            // InternalDSL.g:219:4: rule__Include__Group__0
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
    // InternalDSL.g:228:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleConstraint EOF )
            // InternalDSL.g:230:1: ruleConstraint EOF
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
    // InternalDSL.g:237:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__Constraint__Group__0 )
            // InternalDSL.g:244:4: rule__Constraint__Group__0
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
    // InternalDSL.g:253:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleRule EOF )
            // InternalDSL.g:255:1: ruleRule EOF
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
    // InternalDSL.g:262:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Rule__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__Rule__Group__0 )
            // InternalDSL.g:269:4: rule__Rule__Group__0
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
    // InternalDSL.g:278:1: entryRuleDataSelector : ruleDataSelector EOF ;
    public final void entryRuleDataSelector() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleDataSelector EOF )
            // InternalDSL.g:280:1: ruleDataSelector EOF
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
    // InternalDSL.g:287:1: ruleDataSelector : ( ( rule__DataSelector__Alternatives ) ) ;
    public final void ruleDataSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__DataSelector__Alternatives ) ) )
            // InternalDSL.g:292:2: ( ( rule__DataSelector__Alternatives ) )
            {
            // InternalDSL.g:292:2: ( ( rule__DataSelector__Alternatives ) )
            // InternalDSL.g:293:3: ( rule__DataSelector__Alternatives )
            {
             before(grammarAccess.getDataSelectorAccess().getAlternatives()); 
            // InternalDSL.g:294:3: ( rule__DataSelector__Alternatives )
            // InternalDSL.g:294:4: rule__DataSelector__Alternatives
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
    // InternalDSL.g:303:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleAttributeSelector EOF )
            // InternalDSL.g:305:1: ruleAttributeSelector EOF
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
    // InternalDSL.g:312:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__AttributeSelector__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__AttributeSelector__Group__0 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__AttributeSelector__Group__0 )
            // InternalDSL.g:319:4: rule__AttributeSelector__Group__0
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
    // InternalDSL.g:328:1: entryRuleAttributeClassSelector : ruleAttributeClassSelector EOF ;
    public final void entryRuleAttributeClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleAttributeClassSelector EOF )
            // InternalDSL.g:330:1: ruleAttributeClassSelector EOF
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
    // InternalDSL.g:337:1: ruleAttributeClassSelector : ( ( rule__AttributeClassSelector__Group__0 ) ) ;
    public final void ruleAttributeClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__AttributeClassSelector__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__AttributeClassSelector__Group__0 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__AttributeClassSelector__Group__0 )
            // InternalDSL.g:344:4: rule__AttributeClassSelector__Group__0
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
    // InternalDSL.g:353:1: entryRuleDestinationSelector : ruleDestinationSelector EOF ;
    public final void entryRuleDestinationSelector() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleDestinationSelector EOF )
            // InternalDSL.g:355:1: ruleDestinationSelector EOF
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
    // InternalDSL.g:362:1: ruleDestinationSelector : ( ( rule__DestinationSelector__Alternatives ) ) ;
    public final void ruleDestinationSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__DestinationSelector__Alternatives ) ) )
            // InternalDSL.g:367:2: ( ( rule__DestinationSelector__Alternatives ) )
            {
            // InternalDSL.g:367:2: ( ( rule__DestinationSelector__Alternatives ) )
            // InternalDSL.g:368:3: ( rule__DestinationSelector__Alternatives )
            {
             before(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 
            // InternalDSL.g:369:3: ( rule__DestinationSelector__Alternatives )
            // InternalDSL.g:369:4: rule__DestinationSelector__Alternatives
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
    // InternalDSL.g:378:1: entryRulePropertySelector : rulePropertySelector EOF ;
    public final void entryRulePropertySelector() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( rulePropertySelector EOF )
            // InternalDSL.g:380:1: rulePropertySelector EOF
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
    // InternalDSL.g:387:1: rulePropertySelector : ( ( rule__PropertySelector__Group__0 ) ) ;
    public final void rulePropertySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__PropertySelector__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__PropertySelector__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__PropertySelector__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__PropertySelector__Group__0 )
            {
             before(grammarAccess.getPropertySelectorAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__PropertySelector__Group__0 )
            // InternalDSL.g:394:4: rule__PropertySelector__Group__0
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
    // InternalDSL.g:403:1: entryRulePropertyClassSelector : rulePropertyClassSelector EOF ;
    public final void entryRulePropertyClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( rulePropertyClassSelector EOF )
            // InternalDSL.g:405:1: rulePropertyClassSelector EOF
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
    // InternalDSL.g:412:1: rulePropertyClassSelector : ( ( rule__PropertyClassSelector__Group__0 ) ) ;
    public final void rulePropertyClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__PropertyClassSelector__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__PropertyClassSelector__Group__0 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__PropertyClassSelector__Group__0 )
            // InternalDSL.g:419:4: rule__PropertyClassSelector__Group__0
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


    // $ANTLR start "entryRuleNodeIdentitiySelector"
    // InternalDSL.g:428:1: entryRuleNodeIdentitiySelector : ruleNodeIdentitiySelector EOF ;
    public final void entryRuleNodeIdentitiySelector() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleNodeIdentitiySelector EOF )
            // InternalDSL.g:430:1: ruleNodeIdentitiySelector EOF
            {
             before(grammarAccess.getNodeIdentitiySelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeIdentitiySelector();

            state._fsp--;

             after(grammarAccess.getNodeIdentitiySelectorRule()); 
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
    // $ANTLR end "entryRuleNodeIdentitiySelector"


    // $ANTLR start "ruleNodeIdentitiySelector"
    // InternalDSL.g:437:1: ruleNodeIdentitiySelector : ( ( rule__NodeIdentitiySelector__Group__0 ) ) ;
    public final void ruleNodeIdentitiySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__NodeIdentitiySelector__Group__0 ) ) )
            // InternalDSL.g:442:2: ( ( rule__NodeIdentitiySelector__Group__0 ) )
            {
            // InternalDSL.g:442:2: ( ( rule__NodeIdentitiySelector__Group__0 ) )
            // InternalDSL.g:443:3: ( rule__NodeIdentitiySelector__Group__0 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup()); 
            // InternalDSL.g:444:3: ( rule__NodeIdentitiySelector__Group__0 )
            // InternalDSL.g:444:4: rule__NodeIdentitiySelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleNodeIdentitiySelector"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:453:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleStatement EOF )
            // InternalDSL.g:455:1: ruleStatement EOF
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
    // InternalDSL.g:462:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__Statement__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__Statement__Group__0 )
            // InternalDSL.g:469:4: rule__Statement__Group__0
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
    // InternalDSL.g:478:1: entryRuleStatementType : ruleStatementType EOF ;
    public final void entryRuleStatementType() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleStatementType EOF )
            // InternalDSL.g:480:1: ruleStatementType EOF
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
    // InternalDSL.g:487:1: ruleStatementType : ( ( rule__StatementType__NameAssignment ) ) ;
    public final void ruleStatementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__StatementType__NameAssignment ) ) )
            // InternalDSL.g:492:2: ( ( rule__StatementType__NameAssignment ) )
            {
            // InternalDSL.g:492:2: ( ( rule__StatementType__NameAssignment ) )
            // InternalDSL.g:493:3: ( rule__StatementType__NameAssignment )
            {
             before(grammarAccess.getStatementTypeAccess().getNameAssignment()); 
            // InternalDSL.g:494:3: ( rule__StatementType__NameAssignment )
            // InternalDSL.g:494:4: rule__StatementType__NameAssignment
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
    // InternalDSL.g:503:1: entryRuleStatementModality : ruleStatementModality EOF ;
    public final void entryRuleStatementModality() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleStatementModality EOF )
            // InternalDSL.g:505:1: ruleStatementModality EOF
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
    // InternalDSL.g:512:1: ruleStatementModality : ( ( rule__StatementModality__NameAssignment ) ) ;
    public final void ruleStatementModality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__StatementModality__NameAssignment ) ) )
            // InternalDSL.g:517:2: ( ( rule__StatementModality__NameAssignment ) )
            {
            // InternalDSL.g:517:2: ( ( rule__StatementModality__NameAssignment ) )
            // InternalDSL.g:518:3: ( rule__StatementModality__NameAssignment )
            {
             before(grammarAccess.getStatementModalityAccess().getNameAssignment()); 
            // InternalDSL.g:519:3: ( rule__StatementModality__NameAssignment )
            // InternalDSL.g:519:4: rule__StatementModality__NameAssignment
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


    // $ANTLR start "ruleTargetModelType"
    // InternalDSL.g:528:1: ruleTargetModelType : ( ( rule__TargetModelType__Alternatives ) ) ;
    public final void ruleTargetModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:532:1: ( ( ( rule__TargetModelType__Alternatives ) ) )
            // InternalDSL.g:533:2: ( ( rule__TargetModelType__Alternatives ) )
            {
            // InternalDSL.g:533:2: ( ( rule__TargetModelType__Alternatives ) )
            // InternalDSL.g:534:3: ( rule__TargetModelType__Alternatives )
            {
             before(grammarAccess.getTargetModelTypeAccess().getAlternatives()); 
            // InternalDSL.g:535:3: ( rule__TargetModelType__Alternatives )
            // InternalDSL.g:535:4: rule__TargetModelType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTargetModelType"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDSL.g:543:1: rule__AbstractElement__Alternatives : ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:547:1: ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSL.g:548:2: ( ruleInclude )
                    {
                    // InternalDSL.g:548:2: ( ruleInclude )
                    // InternalDSL.g:549:3: ruleInclude
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
                    // InternalDSL.g:554:2: ( ruleCharacteristicType )
                    {
                    // InternalDSL.g:554:2: ( ruleCharacteristicType )
                    // InternalDSL.g:555:3: ruleCharacteristicType
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
                    // InternalDSL.g:560:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:560:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:561:3: ruleCharacteristicClass
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
                    // InternalDSL.g:566:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:566:2: ( ruleConstraint )
                    // InternalDSL.g:567:3: ruleConstraint
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
                    // InternalDSL.g:572:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    {
                    // InternalDSL.g:572:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    // InternalDSL.g:573:3: ( rule__AbstractElement__Group_4__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_4()); 
                    // InternalDSL.g:574:3: ( rule__AbstractElement__Group_4__0 )
                    // InternalDSL.g:574:4: rule__AbstractElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractElement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractElementAccess().getGroup_4()); 

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
    // InternalDSL.g:582:1: rule__CharacteristicTypeSelector__Alternatives_2 : ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) );
    public final void rule__CharacteristicTypeSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:586:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:587:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:587:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    // InternalDSL.g:588:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:589:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    // InternalDSL.g:589:4: rule__CharacteristicTypeSelector__Group_2_0__0
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
                    // InternalDSL.g:593:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:593:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    // InternalDSL.g:594:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:595:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    // InternalDSL.g:595:4: rule__CharacteristicTypeSelector__Group_2_1__0
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
    // InternalDSL.g:603:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:607:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:608:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:608:2: ( ruleAttributeSelector )
                    // InternalDSL.g:609:3: ruleAttributeSelector
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
                    // InternalDSL.g:614:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:614:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:615:3: ruleAttributeClassSelector
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
    // InternalDSL.g:624:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:628:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:629:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:629:2: ( rulePropertySelector )
                    // InternalDSL.g:630:3: rulePropertySelector
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
                    // InternalDSL.g:635:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:635:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:636:3: rulePropertyClassSelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyClassSelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:641:2: ( ruleNodeIdentitiySelector )
                    {
                    // InternalDSL.g:641:2: ( ruleNodeIdentitiySelector )
                    // InternalDSL.g:642:3: ruleNodeIdentitiySelector
                    {
                     before(grammarAccess.getDestinationSelectorAccess().getNodeIdentitiySelectorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeIdentitiySelector();

                    state._fsp--;

                     after(grammarAccess.getDestinationSelectorAccess().getNodeIdentitiySelectorParserRuleCall_2()); 

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


    // $ANTLR start "rule__TargetModelType__Alternatives"
    // InternalDSL.g:651:1: rule__TargetModelType__Alternatives : ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) );
    public final void rule__TargetModelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:655:1: ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:656:2: ( ( 'OperationModel' ) )
                    {
                    // InternalDSL.g:656:2: ( ( 'OperationModel' ) )
                    // InternalDSL.g:657:3: ( 'OperationModel' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:658:3: ( 'OperationModel' )
                    // InternalDSL.g:658:4: 'OperationModel'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:662:2: ( ( 'DataCentricPalladio' ) )
                    {
                    // InternalDSL.g:662:2: ( ( 'DataCentricPalladio' ) )
                    // InternalDSL.g:663:3: ( 'DataCentricPalladio' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:664:3: ( 'DataCentricPalladio' )
                    // InternalDSL.g:664:4: 'DataCentricPalladio'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:668:2: ( ( 'ExtendedDFD' ) )
                    {
                    // InternalDSL.g:668:2: ( ( 'ExtendedDFD' ) )
                    // InternalDSL.g:669:3: ( 'ExtendedDFD' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:670:3: ( 'ExtendedDFD' )
                    // InternalDSL.g:670:4: 'ExtendedDFD'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TargetModelType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDSL.g:678:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:682:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSL.g:683:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDSL.g:690:1: rule__Model__Group__0__Impl : ( ( rule__Model__TargetModelTypeAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:694:1: ( ( ( rule__Model__TargetModelTypeAssignment_0 )? ) )
            // InternalDSL.g:695:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            {
            // InternalDSL.g:695:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            // InternalDSL.g:696:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 
            // InternalDSL.g:697:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:697:3: rule__Model__TargetModelTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__TargetModelTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDSL.g:705:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:709:1: ( rule__Model__Group__1__Impl )
            // InternalDSL.g:710:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDSL.g:716:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:720:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDSL.g:721:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDSL.g:721:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDSL.g:722:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDSL.g:723:2: ( rule__Model__ElementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SL_COMMENT||LA7_0==15||LA7_0==17||(LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:723:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group__0"
    // InternalDSL.g:732:1: rule__TargetModelTypeDef__Group__0 : rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 ;
    public final void rule__TargetModelTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:736:1: ( rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 )
            // InternalDSL.g:737:2: rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TargetModelTypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__1();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__0"


    // $ANTLR start "rule__TargetModelTypeDef__Group__0__Impl"
    // InternalDSL.g:744:1: rule__TargetModelTypeDef__Group__0__Impl : ( 'target' ) ;
    public final void rule__TargetModelTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:748:1: ( ( 'target' ) )
            // InternalDSL.g:749:1: ( 'target' )
            {
            // InternalDSL.g:749:1: ( 'target' )
            // InternalDSL.g:750:2: 'target'
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__0__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group__1"
    // InternalDSL.g:759:1: rule__TargetModelTypeDef__Group__1 : rule__TargetModelTypeDef__Group__1__Impl ;
    public final void rule__TargetModelTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:763:1: ( rule__TargetModelTypeDef__Group__1__Impl )
            // InternalDSL.g:764:2: rule__TargetModelTypeDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__1__Impl();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__1"


    // $ANTLR start "rule__TargetModelTypeDef__Group__1__Impl"
    // InternalDSL.g:770:1: rule__TargetModelTypeDef__Group__1__Impl : ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:774:1: ( ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) )
            // InternalDSL.g:775:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            {
            // InternalDSL.g:775:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            // InternalDSL.g:776:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 
            // InternalDSL.g:777:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            // InternalDSL.g:777:3: rule__TargetModelTypeDef__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__1__Impl"


    // $ANTLR start "rule__AbstractElement__Group_4__0"
    // InternalDSL.g:786:1: rule__AbstractElement__Group_4__0 : rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 ;
    public final void rule__AbstractElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:790:1: ( rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 )
            // InternalDSL.g:791:2: rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__AbstractElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractElement__Group_4__1();

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
    // $ANTLR end "rule__AbstractElement__Group_4__0"


    // $ANTLR start "rule__AbstractElement__Group_4__0__Impl"
    // InternalDSL.g:798:1: rule__AbstractElement__Group_4__0__Impl : ( () ) ;
    public final void rule__AbstractElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:802:1: ( ( () ) )
            // InternalDSL.g:803:1: ( () )
            {
            // InternalDSL.g:803:1: ( () )
            // InternalDSL.g:804:2: ()
            {
             before(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 
            // InternalDSL.g:805:2: ()
            // InternalDSL.g:805:3: 
            {
            }

             after(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_4__0__Impl"


    // $ANTLR start "rule__AbstractElement__Group_4__1"
    // InternalDSL.g:813:1: rule__AbstractElement__Group_4__1 : rule__AbstractElement__Group_4__1__Impl ;
    public final void rule__AbstractElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:817:1: ( rule__AbstractElement__Group_4__1__Impl )
            // InternalDSL.g:818:2: rule__AbstractElement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Group_4__1__Impl();

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
    // $ANTLR end "rule__AbstractElement__Group_4__1"


    // $ANTLR start "rule__AbstractElement__Group_4__1__Impl"
    // InternalDSL.g:824:1: rule__AbstractElement__Group_4__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__AbstractElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:828:1: ( ( RULE_SL_COMMENT ) )
            // InternalDSL.g:829:1: ( RULE_SL_COMMENT )
            {
            // InternalDSL.g:829:1: ( RULE_SL_COMMENT )
            // InternalDSL.g:830:2: RULE_SL_COMMENT
            {
             before(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4_1()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__AbstractElement__Group_4__1__Impl"


    // $ANTLR start "rule__CharacteristicType__Group__0"
    // InternalDSL.g:840:1: rule__CharacteristicType__Group__0 : rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 ;
    public final void rule__CharacteristicType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:844:1: ( rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 )
            // InternalDSL.g:845:2: rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:852:1: rule__CharacteristicType__Group__0__Impl : ( 'type' ) ;
    public final void rule__CharacteristicType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:856:1: ( ( 'type' ) )
            // InternalDSL.g:857:1: ( 'type' )
            {
            // InternalDSL.g:857:1: ( 'type' )
            // InternalDSL.g:858:2: 'type'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:867:1: rule__CharacteristicType__Group__1 : rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 ;
    public final void rule__CharacteristicType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:871:1: ( rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 )
            // InternalDSL.g:872:2: rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:879:1: rule__CharacteristicType__Group__1__Impl : ( ( rule__CharacteristicType__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:883:1: ( ( ( rule__CharacteristicType__NameAssignment_1 ) ) )
            // InternalDSL.g:884:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            {
            // InternalDSL.g:884:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            // InternalDSL.g:885:2: ( rule__CharacteristicType__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:886:2: ( rule__CharacteristicType__NameAssignment_1 )
            // InternalDSL.g:886:3: rule__CharacteristicType__NameAssignment_1
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
    // InternalDSL.g:894:1: rule__CharacteristicType__Group__2 : rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 ;
    public final void rule__CharacteristicType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:898:1: ( rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 )
            // InternalDSL.g:899:2: rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:906:1: rule__CharacteristicType__Group__2__Impl : ( ':' ) ;
    public final void rule__CharacteristicType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:910:1: ( ( ':' ) )
            // InternalDSL.g:911:1: ( ':' )
            {
            // InternalDSL.g:911:1: ( ':' )
            // InternalDSL.g:912:2: ':'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:921:1: rule__CharacteristicType__Group__3 : rule__CharacteristicType__Group__3__Impl ;
    public final void rule__CharacteristicType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:925:1: ( rule__CharacteristicType__Group__3__Impl )
            // InternalDSL.g:926:2: rule__CharacteristicType__Group__3__Impl
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
    // InternalDSL.g:932:1: rule__CharacteristicType__Group__3__Impl : ( ( rule__CharacteristicType__RefAssignment_3 ) ) ;
    public final void rule__CharacteristicType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:936:1: ( ( ( rule__CharacteristicType__RefAssignment_3 ) ) )
            // InternalDSL.g:937:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            {
            // InternalDSL.g:937:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            // InternalDSL.g:938:2: ( rule__CharacteristicType__RefAssignment_3 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 
            // InternalDSL.g:939:2: ( rule__CharacteristicType__RefAssignment_3 )
            // InternalDSL.g:939:3: rule__CharacteristicType__RefAssignment_3
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
    // InternalDSL.g:948:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:952:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:953:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:960:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:964:1: ( ( 'class' ) )
            // InternalDSL.g:965:1: ( 'class' )
            {
            // InternalDSL.g:965:1: ( 'class' )
            // InternalDSL.g:966:2: 'class'
            {
             before(grammarAccess.getCharacteristicClassAccess().getClassKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDSL.g:975:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:979:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:980:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:987:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:991:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:992:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:992:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:993:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:994:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:994:3: rule__CharacteristicClass__NameAssignment_1
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
    // InternalDSL.g:1002:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1006:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1007:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1014:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1018:1: ( ( '{' ) )
            // InternalDSL.g:1019:1: ( '{' )
            {
            // InternalDSL.g:1019:1: ( '{' )
            // InternalDSL.g:1020:2: '{'
            {
             before(grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1029:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1033:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1034:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSL.g:1041:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1045:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1046:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1046:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1047:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1048:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1048:3: rule__CharacteristicClass__MembersAssignment_3
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
    // InternalDSL.g:1056:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1060:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:1061:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSL.g:1068:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1072:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:1073:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:1073:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:1074:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:1075:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:1075:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CharacteristicClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDSL.g:1083:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1087:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:1088:2: rule__CharacteristicClass__Group__5__Impl
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
    // InternalDSL.g:1094:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1098:1: ( ( '}' ) )
            // InternalDSL.g:1099:1: ( '}' )
            {
            // InternalDSL.g:1099:1: ( '}' )
            // InternalDSL.g:1100:2: '}'
            {
             before(grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSL.g:1110:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1114:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:1115:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1122:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1126:1: ( ( ',' ) )
            // InternalDSL.g:1127:1: ( ',' )
            {
            // InternalDSL.g:1127:1: ( ',' )
            // InternalDSL.g:1128:2: ','
            {
             before(grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:1137:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1141:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:1142:2: rule__CharacteristicClass__Group_4__1__Impl
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
    // InternalDSL.g:1148:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1152:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:1153:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:1153:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:1154:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:1155:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:1155:3: rule__CharacteristicClass__MembersAssignment_4_1
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
    // InternalDSL.g:1164:1: rule__CharacteristicTypeSelector__Group__0 : rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 ;
    public final void rule__CharacteristicTypeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1168:1: ( rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 )
            // InternalDSL.g:1169:2: rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSL.g:1176:1: rule__CharacteristicTypeSelector__Group__0__Impl : ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1180:1: ( ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:1181:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:1181:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            // InternalDSL.g:1182:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:1183:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            // InternalDSL.g:1183:3: rule__CharacteristicTypeSelector__RefAssignment_0
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
    // InternalDSL.g:1191:1: rule__CharacteristicTypeSelector__Group__1 : rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 ;
    public final void rule__CharacteristicTypeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1195:1: ( rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 )
            // InternalDSL.g:1196:2: rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalDSL.g:1203:1: rule__CharacteristicTypeSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicTypeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1207:1: ( ( '.' ) )
            // InternalDSL.g:1208:1: ( '.' )
            {
            // InternalDSL.g:1208:1: ( '.' )
            // InternalDSL.g:1209:2: '.'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:1218:1: rule__CharacteristicTypeSelector__Group__2 : rule__CharacteristicTypeSelector__Group__2__Impl ;
    public final void rule__CharacteristicTypeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1222:1: ( rule__CharacteristicTypeSelector__Group__2__Impl )
            // InternalDSL.g:1223:2: rule__CharacteristicTypeSelector__Group__2__Impl
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
    // InternalDSL.g:1229:1: rule__CharacteristicTypeSelector__Group__2__Impl : ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1233:1: ( ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) )
            // InternalDSL.g:1234:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:1234:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            // InternalDSL.g:1235:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:1236:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            // InternalDSL.g:1236:3: rule__CharacteristicTypeSelector__Alternatives_2
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
    // InternalDSL.g:1245:1: rule__CharacteristicTypeSelector__Group_2_0__0 : rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1249:1: ( rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 )
            // InternalDSL.g:1250:2: rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDSL.g:1257:1: rule__CharacteristicTypeSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1261:1: ( ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:1262:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:1262:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:1263:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:1264:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1264:3: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0
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
    // InternalDSL.g:1272:1: rule__CharacteristicTypeSelector__Group_2_0__1 : rule__CharacteristicTypeSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1276:1: ( rule__CharacteristicTypeSelector__Group_2_0__1__Impl )
            // InternalDSL.g:1277:2: rule__CharacteristicTypeSelector__Group_2_0__1__Impl
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
    // InternalDSL.g:1283:1: rule__CharacteristicTypeSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1287:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:1288:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:1288:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:1289:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:1290:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:1290:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1
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
    // InternalDSL.g:1299:1: rule__CharacteristicTypeSelector__Group_2_1__0 : rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1303:1: ( rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 )
            // InternalDSL.g:1304:2: rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1311:1: rule__CharacteristicTypeSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1315:1: ( ( '[' ) )
            // InternalDSL.g:1316:1: ( '[' )
            {
            // InternalDSL.g:1316:1: ( '[' )
            // InternalDSL.g:1317:2: '['
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSL.g:1326:1: rule__CharacteristicTypeSelector__Group_2_1__1 : rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1330:1: ( rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 )
            // InternalDSL.g:1331:2: rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDSL.g:1338:1: rule__CharacteristicTypeSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1342:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:1343:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:1343:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:1344:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:1345:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:1345:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1
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
    // InternalDSL.g:1353:1: rule__CharacteristicTypeSelector__Group_2_1__2 : rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1357:1: ( rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 )
            // InternalDSL.g:1358:2: rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDSL.g:1365:1: rule__CharacteristicTypeSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1369:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) )
            // InternalDSL.g:1370:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            {
            // InternalDSL.g:1370:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            // InternalDSL.g:1371:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 
            // InternalDSL.g:1372:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:1372:3: rule__CharacteristicTypeSelector__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CharacteristicTypeSelector__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDSL.g:1380:1: rule__CharacteristicTypeSelector__Group_2_1__3 : rule__CharacteristicTypeSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1384:1: ( rule__CharacteristicTypeSelector__Group_2_1__3__Impl )
            // InternalDSL.g:1385:2: rule__CharacteristicTypeSelector__Group_2_1__3__Impl
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
    // InternalDSL.g:1391:1: rule__CharacteristicTypeSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1395:1: ( ( ']' ) )
            // InternalDSL.g:1396:1: ( ']' )
            {
            // InternalDSL.g:1396:1: ( ']' )
            // InternalDSL.g:1397:2: ']'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSL.g:1407:1: rule__CharacteristicTypeSelector__Group_2_1_2__0 : rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1411:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 )
            // InternalDSL.g:1412:2: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1419:1: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1423:1: ( ( ',' ) )
            // InternalDSL.g:1424:1: ( ',' )
            {
            // InternalDSL.g:1424:1: ( ',' )
            // InternalDSL.g:1425:2: ','
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:1434:1: rule__CharacteristicTypeSelector__Group_2_1_2__1 : rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1438:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl )
            // InternalDSL.g:1439:2: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl
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
    // InternalDSL.g:1445:1: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1449:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) )
            // InternalDSL.g:1450:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            {
            // InternalDSL.g:1450:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            // InternalDSL.g:1451:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 
            // InternalDSL.g:1452:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            // InternalDSL.g:1452:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1
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
    // InternalDSL.g:1461:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1465:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalDSL.g:1466:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSL.g:1473:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1477:1: ( ( 'import' ) )
            // InternalDSL.g:1478:1: ( 'import' )
            {
            // InternalDSL.g:1478:1: ( 'import' )
            // InternalDSL.g:1479:2: 'import'
            {
             before(grammarAccess.getIncludeAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDSL.g:1488:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1492:1: ( rule__Include__Group__1__Impl )
            // InternalDSL.g:1493:2: rule__Include__Group__1__Impl
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
    // InternalDSL.g:1499:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1503:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalDSL.g:1504:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalDSL.g:1504:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalDSL.g:1505:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalDSL.g:1506:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalDSL.g:1506:3: rule__Include__ImportURIAssignment_1
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
    // InternalDSL.g:1515:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1519:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:1520:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1527:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1531:1: ( ( 'constraint' ) )
            // InternalDSL.g:1532:1: ( 'constraint' )
            {
            // InternalDSL.g:1532:1: ( 'constraint' )
            // InternalDSL.g:1533:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:1542:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1546:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:1547:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:1554:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1558:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:1559:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:1559:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:1560:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:1561:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:1561:3: rule__Constraint__NameAssignment_1
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
    // InternalDSL.g:1569:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1573:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:1574:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDSL.g:1581:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1585:1: ( ( '{' ) )
            // InternalDSL.g:1586:1: ( '{' )
            {
            // InternalDSL.g:1586:1: ( '{' )
            // InternalDSL.g:1587:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1596:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1600:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:1601:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalDSL.g:1608:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1612:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:1613:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:1613:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:1614:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:1615:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:1615:3: rule__Constraint__RuleAssignment_3
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
    // InternalDSL.g:1623:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1627:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:1628:2: rule__Constraint__Group__4__Impl
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
    // InternalDSL.g:1634:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1638:1: ( ( '}' ) )
            // InternalDSL.g:1639:1: ( '}' )
            {
            // InternalDSL.g:1639:1: ( '}' )
            // InternalDSL.g:1640:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSL.g:1650:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1654:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:1655:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:1662:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1666:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:1667:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:1667:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:1668:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:1669:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:1669:3: rule__Rule__DataSelectorsAssignment_0
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
    // InternalDSL.g:1677:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1681:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:1682:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:1689:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1693:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:1694:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:1694:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:1695:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:1696:2: ( rule__Rule__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1696:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDSL.g:1704:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1708:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:1709:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:1716:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1720:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:1721:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:1721:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:1722:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:1723:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:1723:3: rule__Rule__StatementAssignment_2
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
    // InternalDSL.g:1731:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1735:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:1736:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:1743:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1747:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:1748:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:1748:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:1749:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:1750:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:1750:3: rule__Rule__DestinationSelectorsAssignment_3
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
    // InternalDSL.g:1758:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1762:1: ( rule__Rule__Group__4__Impl )
            // InternalDSL.g:1763:2: rule__Rule__Group__4__Impl
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
    // InternalDSL.g:1769:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1773:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:1774:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:1774:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:1775:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:1776:2: ( rule__Rule__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1776:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDSL.g:1785:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1789:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:1790:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDSL.g:1797:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1801:1: ( ( '&' ) )
            // InternalDSL.g:1802:1: ( '&' )
            {
            // InternalDSL.g:1802:1: ( '&' )
            // InternalDSL.g:1803:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:1812:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1816:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:1817:2: rule__Rule__Group_1__1__Impl
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
    // InternalDSL.g:1823:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1827:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:1828:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:1828:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:1829:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:1830:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:1830:3: rule__Rule__DataSelectorsAssignment_1_1
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
    // InternalDSL.g:1839:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1843:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:1844:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:1851:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1855:1: ( ( '&' ) )
            // InternalDSL.g:1856:1: ( '&' )
            {
            // InternalDSL.g:1856:1: ( '&' )
            // InternalDSL.g:1857:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:1866:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1870:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:1871:2: rule__Rule__Group_4__1__Impl
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
    // InternalDSL.g:1877:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1881:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:1882:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:1882:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:1883:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:1884:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:1884:3: rule__Rule__DestinationSelectorsAssignment_4_1
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
    // InternalDSL.g:1893:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1897:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:1898:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1905:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1909:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:1910:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:1910:1: ( 'data.attribute.' )
            // InternalDSL.g:1911:2: 'data.attribute.'
            {
             before(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:1920:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1924:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:1925:2: rule__AttributeSelector__Group__1__Impl
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
    // InternalDSL.g:1931:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1935:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:1936:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:1936:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:1937:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:1938:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:1938:3: rule__AttributeSelector__RefAssignment_1
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
    // InternalDSL.g:1947:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1951:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:1952:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1959:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1963:1: ( ( 'data.class.' ) )
            // InternalDSL.g:1964:1: ( 'data.class.' )
            {
            // InternalDSL.g:1964:1: ( 'data.class.' )
            // InternalDSL.g:1965:2: 'data.class.'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:1974:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1978:1: ( rule__AttributeClassSelector__Group__1__Impl )
            // InternalDSL.g:1979:2: rule__AttributeClassSelector__Group__1__Impl
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
    // InternalDSL.g:1985:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1989:1: ( ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:1990:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:1990:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:1991:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:1992:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            // InternalDSL.g:1992:3: rule__AttributeClassSelector__RefAssignment_1
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
    // InternalDSL.g:2001:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2005:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:2006:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:2013:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2017:1: ( ( 'node.property.' ) )
            // InternalDSL.g:2018:1: ( 'node.property.' )
            {
            // InternalDSL.g:2018:1: ( 'node.property.' )
            // InternalDSL.g:2019:2: 'node.property.'
            {
             before(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:2028:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2032:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:2033:2: rule__PropertySelector__Group__1__Impl
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
    // InternalDSL.g:2039:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2043:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2044:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2044:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:2045:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2046:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:2046:3: rule__PropertySelector__RefAssignment_1
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
    // InternalDSL.g:2055:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2059:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:2060:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:2067:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2071:1: ( ( 'node.class.' ) )
            // InternalDSL.g:2072:1: ( 'node.class.' )
            {
            // InternalDSL.g:2072:1: ( 'node.class.' )
            // InternalDSL.g:2073:2: 'node.class.'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:2082:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2086:1: ( rule__PropertyClassSelector__Group__1__Impl )
            // InternalDSL.g:2087:2: rule__PropertyClassSelector__Group__1__Impl
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
    // InternalDSL.g:2093:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2097:1: ( ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2098:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2098:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:2099:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2100:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            // InternalDSL.g:2100:3: rule__PropertyClassSelector__RefAssignment_1
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


    // $ANTLR start "rule__NodeIdentitiySelector__Group__0"
    // InternalDSL.g:2109:1: rule__NodeIdentitiySelector__Group__0 : rule__NodeIdentitiySelector__Group__0__Impl rule__NodeIdentitiySelector__Group__1 ;
    public final void rule__NodeIdentitiySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2113:1: ( rule__NodeIdentitiySelector__Group__0__Impl rule__NodeIdentitiySelector__Group__1 )
            // InternalDSL.g:2114:2: rule__NodeIdentitiySelector__Group__0__Impl rule__NodeIdentitiySelector__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__NodeIdentitiySelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group__1();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group__0"


    // $ANTLR start "rule__NodeIdentitiySelector__Group__0__Impl"
    // InternalDSL.g:2121:1: rule__NodeIdentitiySelector__Group__0__Impl : ( 'node.name.' ) ;
    public final void rule__NodeIdentitiySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2125:1: ( ( 'node.name.' ) )
            // InternalDSL.g:2126:1: ( 'node.name.' )
            {
            // InternalDSL.g:2126:1: ( 'node.name.' )
            // InternalDSL.g:2127:2: 'node.name.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group__0__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group__1"
    // InternalDSL.g:2136:1: rule__NodeIdentitiySelector__Group__1 : rule__NodeIdentitiySelector__Group__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2140:1: ( rule__NodeIdentitiySelector__Group__1__Impl )
            // InternalDSL.g:2141:2: rule__NodeIdentitiySelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group__1__Impl();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group__1"


    // $ANTLR start "rule__NodeIdentitiySelector__Group__1__Impl"
    // InternalDSL.g:2147:1: rule__NodeIdentitiySelector__Group__1__Impl : ( ( rule__NodeIdentitiySelector__RefAssignment_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2151:1: ( ( ( rule__NodeIdentitiySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2152:1: ( ( rule__NodeIdentitiySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2152:1: ( ( rule__NodeIdentitiySelector__RefAssignment_1 ) )
            // InternalDSL.g:2153:2: ( rule__NodeIdentitiySelector__RefAssignment_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2154:2: ( rule__NodeIdentitiySelector__RefAssignment_1 )
            // InternalDSL.g:2154:3: rule__NodeIdentitiySelector__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalDSL.g:2163:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2167:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:2168:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:2175:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2179:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:2180:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:2180:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:2181:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:2182:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:2182:3: rule__Statement__ModalityAssignment_0
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
    // InternalDSL.g:2190:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2194:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:2195:2: rule__Statement__Group__1__Impl
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
    // InternalDSL.g:2201:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2205:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:2206:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:2206:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:2207:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:2208:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:2208:3: rule__Statement__TypeAssignment_1
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


    // $ANTLR start "rule__Model__TargetModelTypeAssignment_0"
    // InternalDSL.g:2217:1: rule__Model__TargetModelTypeAssignment_0 : ( ruleTargetModelTypeDef ) ;
    public final void rule__Model__TargetModelTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2221:1: ( ( ruleTargetModelTypeDef ) )
            // InternalDSL.g:2222:2: ( ruleTargetModelTypeDef )
            {
            // InternalDSL.g:2222:2: ( ruleTargetModelTypeDef )
            // InternalDSL.g:2223:3: ruleTargetModelTypeDef
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeTargetModelTypeDefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetModelTypeDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTargetModelTypeTargetModelTypeDefParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__TargetModelTypeAssignment_0"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // InternalDSL.g:2232:1: rule__Model__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2236:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:2237:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:2237:2: ( ruleAbstractElement )
            // InternalDSL.g:2238:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__TargetModelTypeDef__TypeAssignment_1"
    // InternalDSL.g:2247:1: rule__TargetModelTypeDef__TypeAssignment_1 : ( ruleTargetModelType ) ;
    public final void rule__TargetModelTypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2251:1: ( ( ruleTargetModelType ) )
            // InternalDSL.g:2252:2: ( ruleTargetModelType )
            {
            // InternalDSL.g:2252:2: ( ruleTargetModelType )
            // InternalDSL.g:2253:3: ruleTargetModelType
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetModelType();

            state._fsp--;

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__TypeAssignment_1"


    // $ANTLR start "rule__CharacteristicType__NameAssignment_1"
    // InternalDSL.g:2262:1: rule__CharacteristicType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2266:1: ( ( RULE_ID ) )
            // InternalDSL.g:2267:2: ( RULE_ID )
            {
            // InternalDSL.g:2267:2: ( RULE_ID )
            // InternalDSL.g:2268:3: RULE_ID
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
    // InternalDSL.g:2277:1: rule__CharacteristicType__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicType__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2281:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2282:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2282:2: ( ( RULE_ID ) )
            // InternalDSL.g:2283:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0()); 
            // InternalDSL.g:2284:3: ( RULE_ID )
            // InternalDSL.g:2285:4: RULE_ID
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
    // InternalDSL.g:2296:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2300:1: ( ( RULE_ID ) )
            // InternalDSL.g:2301:2: ( RULE_ID )
            {
            // InternalDSL.g:2301:2: ( RULE_ID )
            // InternalDSL.g:2302:3: RULE_ID
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
    // InternalDSL.g:2311:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2315:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2316:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2316:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2317:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:2326:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2330:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2331:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2331:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2332:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:2341:1: rule__CharacteristicTypeSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2345:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2346:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2346:2: ( ( RULE_ID ) )
            // InternalDSL.g:2347:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 
            // InternalDSL.g:2348:3: ( RULE_ID )
            // InternalDSL.g:2349:4: RULE_ID
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
    // InternalDSL.g:2360:1: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2364:1: ( ( ( '!' ) ) )
            // InternalDSL.g:2365:2: ( ( '!' ) )
            {
            // InternalDSL.g:2365:2: ( ( '!' ) )
            // InternalDSL.g:2366:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:2367:3: ( '!' )
            // InternalDSL.g:2368:4: '!'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:2379:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2383:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2384:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2384:2: ( ( RULE_ID ) )
            // InternalDSL.g:2385:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0()); 
            // InternalDSL.g:2386:3: ( RULE_ID )
            // InternalDSL.g:2387:4: RULE_ID
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
    // InternalDSL.g:2398:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2402:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2403:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2403:2: ( ( RULE_ID ) )
            // InternalDSL.g:2404:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0()); 
            // InternalDSL.g:2405:3: ( RULE_ID )
            // InternalDSL.g:2406:4: RULE_ID
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
    // InternalDSL.g:2417:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2421:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2422:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2422:2: ( ( RULE_ID ) )
            // InternalDSL.g:2423:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0()); 
            // InternalDSL.g:2424:3: ( RULE_ID )
            // InternalDSL.g:2425:4: RULE_ID
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
    // InternalDSL.g:2436:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2440:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2441:2: ( RULE_STRING )
            {
            // InternalDSL.g:2441:2: ( RULE_STRING )
            // InternalDSL.g:2442:3: RULE_STRING
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
    // InternalDSL.g:2451:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2455:1: ( ( RULE_ID ) )
            // InternalDSL.g:2456:2: ( RULE_ID )
            {
            // InternalDSL.g:2456:2: ( RULE_ID )
            // InternalDSL.g:2457:3: RULE_ID
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
    // InternalDSL.g:2466:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2470:1: ( ( ruleRule ) )
            // InternalDSL.g:2471:2: ( ruleRule )
            {
            // InternalDSL.g:2471:2: ( ruleRule )
            // InternalDSL.g:2472:3: ruleRule
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
    // InternalDSL.g:2481:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2485:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2486:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2486:2: ( ruleDataSelector )
            // InternalDSL.g:2487:3: ruleDataSelector
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
    // InternalDSL.g:2496:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2500:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:2501:2: ( ruleDataSelector )
            {
            // InternalDSL.g:2501:2: ( ruleDataSelector )
            // InternalDSL.g:2502:3: ruleDataSelector
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
    // InternalDSL.g:2511:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2515:1: ( ( ruleStatement ) )
            // InternalDSL.g:2516:2: ( ruleStatement )
            {
            // InternalDSL.g:2516:2: ( ruleStatement )
            // InternalDSL.g:2517:3: ruleStatement
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
    // InternalDSL.g:2526:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2530:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2531:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2531:2: ( ruleDestinationSelector )
            // InternalDSL.g:2532:3: ruleDestinationSelector
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
    // InternalDSL.g:2541:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2545:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:2546:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:2546:2: ( ruleDestinationSelector )
            // InternalDSL.g:2547:3: ruleDestinationSelector
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
    // InternalDSL.g:2556:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2560:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2561:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2561:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2562:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:2571:1: rule__AttributeClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2575:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2576:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2576:2: ( ( RULE_ID ) )
            // InternalDSL.g:2577:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:2578:3: ( RULE_ID )
            // InternalDSL.g:2579:4: RULE_ID
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
    // InternalDSL.g:2590:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2594:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:2595:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:2595:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:2596:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:2605:1: rule__PropertyClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2609:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2610:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2610:2: ( ( RULE_ID ) )
            // InternalDSL.g:2611:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:2612:3: ( RULE_ID )
            // InternalDSL.g:2613:4: RULE_ID
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


    // $ANTLR start "rule__NodeIdentitiySelector__RefAssignment_1"
    // InternalDSL.g:2624:1: rule__NodeIdentitiySelector__RefAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NodeIdentitiySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2628:1: ( ( RULE_STRING ) )
            // InternalDSL.g:2629:2: ( RULE_STRING )
            {
            // InternalDSL.g:2629:2: ( RULE_STRING )
            // InternalDSL.g:2630:3: RULE_STRING
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getRefSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getRefSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__RefAssignment_1"


    // $ANTLR start "rule__Statement__ModalityAssignment_0"
    // InternalDSL.g:2639:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2643:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:2644:2: ( ruleStatementModality )
            {
            // InternalDSL.g:2644:2: ( ruleStatementModality )
            // InternalDSL.g:2645:3: ruleStatementModality
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
    // InternalDSL.g:2654:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2658:1: ( ( ruleStatementType ) )
            // InternalDSL.g:2659:2: ( ruleStatementType )
            {
            // InternalDSL.g:2659:2: ( ruleStatementType )
            // InternalDSL.g:2660:3: ruleStatementType
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
    // InternalDSL.g:2669:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2673:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:2674:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:2674:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:2675:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:2676:3: ( 'FLOWS' )
            // InternalDSL.g:2677:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:2688:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2692:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:2693:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:2693:2: ( ( 'NEVER' ) )
            // InternalDSL.g:2694:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:2695:3: ( 'NEVER' )
            // InternalDSL.g:2696:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003028010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003028012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100400020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});

}