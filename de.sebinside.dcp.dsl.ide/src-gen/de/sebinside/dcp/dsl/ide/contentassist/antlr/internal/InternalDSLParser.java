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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'target'", "'using'", "'type'", "':'", "'class'", "'{'", "'}'", "','", "'.'", "'['", "']'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'node.identity.'", "'WHERE'", "'|'", "'!'", "'('", "')'", "'=='", "'!='", "'isEmpty'", "'intersection'", "'union'", "'subtract'", "'elementOf'", "'DFD'", "'$'", "'FLOWS'", "'NEVER'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleCharacteristicVariableType"
    // InternalDSL.g:203:1: entryRuleCharacteristicVariableType : ruleCharacteristicVariableType EOF ;
    public final void entryRuleCharacteristicVariableType() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleCharacteristicVariableType EOF )
            // InternalDSL.g:205:1: ruleCharacteristicVariableType EOF
            {
             before(grammarAccess.getCharacteristicVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicVariableType();

            state._fsp--;

             after(grammarAccess.getCharacteristicVariableTypeRule()); 
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
    // $ANTLR end "entryRuleCharacteristicVariableType"


    // $ANTLR start "ruleCharacteristicVariableType"
    // InternalDSL.g:212:1: ruleCharacteristicVariableType : ( ( rule__CharacteristicVariableType__Alternatives ) ) ;
    public final void ruleCharacteristicVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__CharacteristicVariableType__Alternatives ) ) )
            // InternalDSL.g:217:2: ( ( rule__CharacteristicVariableType__Alternatives ) )
            {
            // InternalDSL.g:217:2: ( ( rule__CharacteristicVariableType__Alternatives ) )
            // InternalDSL.g:218:3: ( rule__CharacteristicVariableType__Alternatives )
            {
             before(grammarAccess.getCharacteristicVariableTypeAccess().getAlternatives()); 
            // InternalDSL.g:219:3: ( rule__CharacteristicVariableType__Alternatives )
            // InternalDSL.g:219:4: rule__CharacteristicVariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicVariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicVariableTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCharacteristicVariableType"


    // $ANTLR start "entryRuleCharacteristicVariable"
    // InternalDSL.g:228:1: entryRuleCharacteristicVariable : ruleCharacteristicVariable EOF ;
    public final void entryRuleCharacteristicVariable() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleCharacteristicVariable EOF )
            // InternalDSL.g:230:1: ruleCharacteristicVariable EOF
            {
             before(grammarAccess.getCharacteristicVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicVariable();

            state._fsp--;

             after(grammarAccess.getCharacteristicVariableRule()); 
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
    // $ANTLR end "entryRuleCharacteristicVariable"


    // $ANTLR start "ruleCharacteristicVariable"
    // InternalDSL.g:237:1: ruleCharacteristicVariable : ( ( rule__CharacteristicVariable__NameAssignment ) ) ;
    public final void ruleCharacteristicVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__CharacteristicVariable__NameAssignment ) ) )
            // InternalDSL.g:242:2: ( ( rule__CharacteristicVariable__NameAssignment ) )
            {
            // InternalDSL.g:242:2: ( ( rule__CharacteristicVariable__NameAssignment ) )
            // InternalDSL.g:243:3: ( rule__CharacteristicVariable__NameAssignment )
            {
             before(grammarAccess.getCharacteristicVariableAccess().getNameAssignment()); 
            // InternalDSL.g:244:3: ( rule__CharacteristicVariable__NameAssignment )
            // InternalDSL.g:244:4: rule__CharacteristicVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicVariableAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleCharacteristicVariable"


    // $ANTLR start "entryRuleCharacteristicSet"
    // InternalDSL.g:253:1: entryRuleCharacteristicSet : ruleCharacteristicSet EOF ;
    public final void entryRuleCharacteristicSet() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleCharacteristicSet EOF )
            // InternalDSL.g:255:1: ruleCharacteristicSet EOF
            {
             before(grammarAccess.getCharacteristicSetRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicSet();

            state._fsp--;

             after(grammarAccess.getCharacteristicSetRule()); 
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
    // $ANTLR end "entryRuleCharacteristicSet"


    // $ANTLR start "ruleCharacteristicSet"
    // InternalDSL.g:262:1: ruleCharacteristicSet : ( ( rule__CharacteristicSet__Group__0 ) ) ;
    public final void ruleCharacteristicSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__CharacteristicSet__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__CharacteristicSet__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__CharacteristicSet__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__CharacteristicSet__Group__0 )
            {
             before(grammarAccess.getCharacteristicSetAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__CharacteristicSet__Group__0 )
            // InternalDSL.g:269:4: rule__CharacteristicSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSetAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicSet"


    // $ANTLR start "entryRuleInclude"
    // InternalDSL.g:278:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleInclude EOF )
            // InternalDSL.g:280:1: ruleInclude EOF
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
    // InternalDSL.g:287:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Include__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__Include__Group__0 )
            // InternalDSL.g:294:4: rule__Include__Group__0
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
    // InternalDSL.g:303:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleConstraint EOF )
            // InternalDSL.g:305:1: ruleConstraint EOF
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
    // InternalDSL.g:312:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__Constraint__Group__0 )
            // InternalDSL.g:319:4: rule__Constraint__Group__0
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
    // InternalDSL.g:328:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleRule EOF )
            // InternalDSL.g:330:1: ruleRule EOF
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
    // InternalDSL.g:337:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__Rule__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__Rule__Group__0 )
            // InternalDSL.g:344:4: rule__Rule__Group__0
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
    // InternalDSL.g:353:1: entryRuleDataSelector : ruleDataSelector EOF ;
    public final void entryRuleDataSelector() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleDataSelector EOF )
            // InternalDSL.g:355:1: ruleDataSelector EOF
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
    // InternalDSL.g:362:1: ruleDataSelector : ( ( rule__DataSelector__Alternatives ) ) ;
    public final void ruleDataSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__DataSelector__Alternatives ) ) )
            // InternalDSL.g:367:2: ( ( rule__DataSelector__Alternatives ) )
            {
            // InternalDSL.g:367:2: ( ( rule__DataSelector__Alternatives ) )
            // InternalDSL.g:368:3: ( rule__DataSelector__Alternatives )
            {
             before(grammarAccess.getDataSelectorAccess().getAlternatives()); 
            // InternalDSL.g:369:3: ( rule__DataSelector__Alternatives )
            // InternalDSL.g:369:4: rule__DataSelector__Alternatives
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
    // InternalDSL.g:378:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleAttributeSelector EOF )
            // InternalDSL.g:380:1: ruleAttributeSelector EOF
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
    // InternalDSL.g:387:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__AttributeSelector__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__AttributeSelector__Group__0 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__AttributeSelector__Group__0 )
            // InternalDSL.g:394:4: rule__AttributeSelector__Group__0
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
    // InternalDSL.g:403:1: entryRuleAttributeClassSelector : ruleAttributeClassSelector EOF ;
    public final void entryRuleAttributeClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleAttributeClassSelector EOF )
            // InternalDSL.g:405:1: ruleAttributeClassSelector EOF
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
    // InternalDSL.g:412:1: ruleAttributeClassSelector : ( ( rule__AttributeClassSelector__Group__0 ) ) ;
    public final void ruleAttributeClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__AttributeClassSelector__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__AttributeClassSelector__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__AttributeClassSelector__Group__0 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__AttributeClassSelector__Group__0 )
            // InternalDSL.g:419:4: rule__AttributeClassSelector__Group__0
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
    // InternalDSL.g:428:1: entryRuleDestinationSelector : ruleDestinationSelector EOF ;
    public final void entryRuleDestinationSelector() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleDestinationSelector EOF )
            // InternalDSL.g:430:1: ruleDestinationSelector EOF
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
    // InternalDSL.g:437:1: ruleDestinationSelector : ( ( rule__DestinationSelector__Alternatives ) ) ;
    public final void ruleDestinationSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__DestinationSelector__Alternatives ) ) )
            // InternalDSL.g:442:2: ( ( rule__DestinationSelector__Alternatives ) )
            {
            // InternalDSL.g:442:2: ( ( rule__DestinationSelector__Alternatives ) )
            // InternalDSL.g:443:3: ( rule__DestinationSelector__Alternatives )
            {
             before(grammarAccess.getDestinationSelectorAccess().getAlternatives()); 
            // InternalDSL.g:444:3: ( rule__DestinationSelector__Alternatives )
            // InternalDSL.g:444:4: rule__DestinationSelector__Alternatives
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
    // InternalDSL.g:453:1: entryRulePropertySelector : rulePropertySelector EOF ;
    public final void entryRulePropertySelector() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( rulePropertySelector EOF )
            // InternalDSL.g:455:1: rulePropertySelector EOF
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
    // InternalDSL.g:462:1: rulePropertySelector : ( ( rule__PropertySelector__Group__0 ) ) ;
    public final void rulePropertySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__PropertySelector__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__PropertySelector__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__PropertySelector__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__PropertySelector__Group__0 )
            {
             before(grammarAccess.getPropertySelectorAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__PropertySelector__Group__0 )
            // InternalDSL.g:469:4: rule__PropertySelector__Group__0
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
    // InternalDSL.g:478:1: entryRulePropertyClassSelector : rulePropertyClassSelector EOF ;
    public final void entryRulePropertyClassSelector() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( rulePropertyClassSelector EOF )
            // InternalDSL.g:480:1: rulePropertyClassSelector EOF
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
    // InternalDSL.g:487:1: rulePropertyClassSelector : ( ( rule__PropertyClassSelector__Group__0 ) ) ;
    public final void rulePropertyClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__PropertyClassSelector__Group__0 ) ) )
            // InternalDSL.g:492:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            {
            // InternalDSL.g:492:2: ( ( rule__PropertyClassSelector__Group__0 ) )
            // InternalDSL.g:493:3: ( rule__PropertyClassSelector__Group__0 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getGroup()); 
            // InternalDSL.g:494:3: ( rule__PropertyClassSelector__Group__0 )
            // InternalDSL.g:494:4: rule__PropertyClassSelector__Group__0
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
    // InternalDSL.g:503:1: entryRuleNodeIdentitiySelector : ruleNodeIdentitiySelector EOF ;
    public final void entryRuleNodeIdentitiySelector() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleNodeIdentitiySelector EOF )
            // InternalDSL.g:505:1: ruleNodeIdentitiySelector EOF
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
    // InternalDSL.g:512:1: ruleNodeIdentitiySelector : ( ( rule__NodeIdentitiySelector__Alternatives ) ) ;
    public final void ruleNodeIdentitiySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__NodeIdentitiySelector__Alternatives ) ) )
            // InternalDSL.g:517:2: ( ( rule__NodeIdentitiySelector__Alternatives ) )
            {
            // InternalDSL.g:517:2: ( ( rule__NodeIdentitiySelector__Alternatives ) )
            // InternalDSL.g:518:3: ( rule__NodeIdentitiySelector__Alternatives )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAlternatives()); 
            // InternalDSL.g:519:3: ( rule__NodeIdentitiySelector__Alternatives )
            // InternalDSL.g:519:4: rule__NodeIdentitiySelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getAlternatives()); 

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
    // InternalDSL.g:528:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDSL.g:529:1: ( ruleStatement EOF )
            // InternalDSL.g:530:1: ruleStatement EOF
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
    // InternalDSL.g:537:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalDSL.g:542:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalDSL.g:542:2: ( ( rule__Statement__Group__0 ) )
            // InternalDSL.g:543:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalDSL.g:544:3: ( rule__Statement__Group__0 )
            // InternalDSL.g:544:4: rule__Statement__Group__0
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
    // InternalDSL.g:553:1: entryRuleStatementType : ruleStatementType EOF ;
    public final void entryRuleStatementType() throws RecognitionException {
        try {
            // InternalDSL.g:554:1: ( ruleStatementType EOF )
            // InternalDSL.g:555:1: ruleStatementType EOF
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
    // InternalDSL.g:562:1: ruleStatementType : ( ( rule__StatementType__NameAssignment ) ) ;
    public final void ruleStatementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:566:2: ( ( ( rule__StatementType__NameAssignment ) ) )
            // InternalDSL.g:567:2: ( ( rule__StatementType__NameAssignment ) )
            {
            // InternalDSL.g:567:2: ( ( rule__StatementType__NameAssignment ) )
            // InternalDSL.g:568:3: ( rule__StatementType__NameAssignment )
            {
             before(grammarAccess.getStatementTypeAccess().getNameAssignment()); 
            // InternalDSL.g:569:3: ( rule__StatementType__NameAssignment )
            // InternalDSL.g:569:4: rule__StatementType__NameAssignment
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
    // InternalDSL.g:578:1: entryRuleStatementModality : ruleStatementModality EOF ;
    public final void entryRuleStatementModality() throws RecognitionException {
        try {
            // InternalDSL.g:579:1: ( ruleStatementModality EOF )
            // InternalDSL.g:580:1: ruleStatementModality EOF
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
    // InternalDSL.g:587:1: ruleStatementModality : ( ( rule__StatementModality__NameAssignment ) ) ;
    public final void ruleStatementModality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:591:2: ( ( ( rule__StatementModality__NameAssignment ) ) )
            // InternalDSL.g:592:2: ( ( rule__StatementModality__NameAssignment ) )
            {
            // InternalDSL.g:592:2: ( ( rule__StatementModality__NameAssignment ) )
            // InternalDSL.g:593:3: ( rule__StatementModality__NameAssignment )
            {
             before(grammarAccess.getStatementModalityAccess().getNameAssignment()); 
            // InternalDSL.g:594:3: ( rule__StatementModality__NameAssignment )
            // InternalDSL.g:594:4: rule__StatementModality__NameAssignment
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


    // $ANTLR start "entryRuleCondition"
    // InternalDSL.g:603:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalDSL.g:604:1: ( ruleCondition EOF )
            // InternalDSL.g:605:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDSL.g:612:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:616:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalDSL.g:617:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalDSL.g:617:2: ( ( rule__Condition__Group__0 ) )
            // InternalDSL.g:618:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalDSL.g:619:3: ( rule__Condition__Group__0 )
            // InternalDSL.g:619:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCharacteristicReference"
    // InternalDSL.g:628:1: entryRuleCharacteristicReference : ruleCharacteristicReference EOF ;
    public final void entryRuleCharacteristicReference() throws RecognitionException {
        try {
            // InternalDSL.g:629:1: ( ruleCharacteristicReference EOF )
            // InternalDSL.g:630:1: ruleCharacteristicReference EOF
            {
             before(grammarAccess.getCharacteristicReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getCharacteristicReferenceRule()); 
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
    // $ANTLR end "entryRuleCharacteristicReference"


    // $ANTLR start "ruleCharacteristicReference"
    // InternalDSL.g:637:1: ruleCharacteristicReference : ( ( rule__CharacteristicReference__ValueAssignment ) ) ;
    public final void ruleCharacteristicReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:641:2: ( ( ( rule__CharacteristicReference__ValueAssignment ) ) )
            // InternalDSL.g:642:2: ( ( rule__CharacteristicReference__ValueAssignment ) )
            {
            // InternalDSL.g:642:2: ( ( rule__CharacteristicReference__ValueAssignment ) )
            // InternalDSL.g:643:3: ( rule__CharacteristicReference__ValueAssignment )
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueAssignment()); 
            // InternalDSL.g:644:3: ( rule__CharacteristicReference__ValueAssignment )
            // InternalDSL.g:644:4: rule__CharacteristicReference__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicReference__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicReferenceAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleCharacteristicReference"


    // $ANTLR start "entryRuleCharacteristicSetReference"
    // InternalDSL.g:653:1: entryRuleCharacteristicSetReference : ruleCharacteristicSetReference EOF ;
    public final void entryRuleCharacteristicSetReference() throws RecognitionException {
        try {
            // InternalDSL.g:654:1: ( ruleCharacteristicSetReference EOF )
            // InternalDSL.g:655:1: ruleCharacteristicSetReference EOF
            {
             before(grammarAccess.getCharacteristicSetReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getCharacteristicSetReferenceRule()); 
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
    // $ANTLR end "entryRuleCharacteristicSetReference"


    // $ANTLR start "ruleCharacteristicSetReference"
    // InternalDSL.g:662:1: ruleCharacteristicSetReference : ( ( rule__CharacteristicSetReference__Alternatives ) ) ;
    public final void ruleCharacteristicSetReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:666:2: ( ( ( rule__CharacteristicSetReference__Alternatives ) ) )
            // InternalDSL.g:667:2: ( ( rule__CharacteristicSetReference__Alternatives ) )
            {
            // InternalDSL.g:667:2: ( ( rule__CharacteristicSetReference__Alternatives ) )
            // InternalDSL.g:668:3: ( rule__CharacteristicSetReference__Alternatives )
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getAlternatives()); 
            // InternalDSL.g:669:3: ( rule__CharacteristicSetReference__Alternatives )
            // InternalDSL.g:669:4: rule__CharacteristicSetReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSetReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSetReferenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCharacteristicSetReference"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalDSL.g:678:1: entryRuleBooleanOperation : ruleBooleanOperation EOF ;
    public final void entryRuleBooleanOperation() throws RecognitionException {
        try {
            // InternalDSL.g:679:1: ( ruleBooleanOperation EOF )
            // InternalDSL.g:680:1: ruleBooleanOperation EOF
            {
             before(grammarAccess.getBooleanOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getBooleanOperationRule()); 
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
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalDSL.g:687:1: ruleBooleanOperation : ( ruleLogicalOrOperation ) ;
    public final void ruleBooleanOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:2: ( ( ruleLogicalOrOperation ) )
            // InternalDSL.g:692:2: ( ruleLogicalOrOperation )
            {
            // InternalDSL.g:692:2: ( ruleLogicalOrOperation )
            // InternalDSL.g:693:3: ruleLogicalOrOperation
            {
             before(grammarAccess.getBooleanOperationAccess().getLogicalOrOperationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOrOperation();

            state._fsp--;

             after(grammarAccess.getBooleanOperationAccess().getLogicalOrOperationParserRuleCall()); 

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
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCharacteristsicSetOperation"
    // InternalDSL.g:703:1: entryRuleCharacteristsicSetOperation : ruleCharacteristsicSetOperation EOF ;
    public final void entryRuleCharacteristsicSetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:704:1: ( ruleCharacteristsicSetOperation EOF )
            // InternalDSL.g:705:1: ruleCharacteristsicSetOperation EOF
            {
             before(grammarAccess.getCharacteristsicSetOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristsicSetOperation();

            state._fsp--;

             after(grammarAccess.getCharacteristsicSetOperationRule()); 
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
    // $ANTLR end "entryRuleCharacteristsicSetOperation"


    // $ANTLR start "ruleCharacteristsicSetOperation"
    // InternalDSL.g:712:1: ruleCharacteristsicSetOperation : ( ( rule__CharacteristsicSetOperation__Alternatives ) ) ;
    public final void ruleCharacteristsicSetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:716:2: ( ( ( rule__CharacteristsicSetOperation__Alternatives ) ) )
            // InternalDSL.g:717:2: ( ( rule__CharacteristsicSetOperation__Alternatives ) )
            {
            // InternalDSL.g:717:2: ( ( rule__CharacteristsicSetOperation__Alternatives ) )
            // InternalDSL.g:718:3: ( rule__CharacteristsicSetOperation__Alternatives )
            {
             before(grammarAccess.getCharacteristsicSetOperationAccess().getAlternatives()); 
            // InternalDSL.g:719:3: ( rule__CharacteristsicSetOperation__Alternatives )
            // InternalDSL.g:719:4: rule__CharacteristsicSetOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristsicSetOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristsicSetOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCharacteristsicSetOperation"


    // $ANTLR start "entryRuleLogicalOrOperation"
    // InternalDSL.g:728:1: entryRuleLogicalOrOperation : ruleLogicalOrOperation EOF ;
    public final void entryRuleLogicalOrOperation() throws RecognitionException {
        try {
            // InternalDSL.g:729:1: ( ruleLogicalOrOperation EOF )
            // InternalDSL.g:730:1: ruleLogicalOrOperation EOF
            {
             before(grammarAccess.getLogicalOrOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalOrOperation();

            state._fsp--;

             after(grammarAccess.getLogicalOrOperationRule()); 
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
    // $ANTLR end "entryRuleLogicalOrOperation"


    // $ANTLR start "ruleLogicalOrOperation"
    // InternalDSL.g:737:1: ruleLogicalOrOperation : ( ( rule__LogicalOrOperation__Group__0 ) ) ;
    public final void ruleLogicalOrOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:2: ( ( ( rule__LogicalOrOperation__Group__0 ) ) )
            // InternalDSL.g:742:2: ( ( rule__LogicalOrOperation__Group__0 ) )
            {
            // InternalDSL.g:742:2: ( ( rule__LogicalOrOperation__Group__0 ) )
            // InternalDSL.g:743:3: ( rule__LogicalOrOperation__Group__0 )
            {
             before(grammarAccess.getLogicalOrOperationAccess().getGroup()); 
            // InternalDSL.g:744:3: ( rule__LogicalOrOperation__Group__0 )
            // InternalDSL.g:744:4: rule__LogicalOrOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleLogicalOrOperation"


    // $ANTLR start "entryRuleLogicalAndOperation"
    // InternalDSL.g:753:1: entryRuleLogicalAndOperation : ruleLogicalAndOperation EOF ;
    public final void entryRuleLogicalAndOperation() throws RecognitionException {
        try {
            // InternalDSL.g:754:1: ( ruleLogicalAndOperation EOF )
            // InternalDSL.g:755:1: ruleLogicalAndOperation EOF
            {
             before(grammarAccess.getLogicalAndOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalAndOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationRule()); 
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
    // $ANTLR end "entryRuleLogicalAndOperation"


    // $ANTLR start "ruleLogicalAndOperation"
    // InternalDSL.g:762:1: ruleLogicalAndOperation : ( ( rule__LogicalAndOperation__Group__0 ) ) ;
    public final void ruleLogicalAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:766:2: ( ( ( rule__LogicalAndOperation__Group__0 ) ) )
            // InternalDSL.g:767:2: ( ( rule__LogicalAndOperation__Group__0 ) )
            {
            // InternalDSL.g:767:2: ( ( rule__LogicalAndOperation__Group__0 ) )
            // InternalDSL.g:768:3: ( rule__LogicalAndOperation__Group__0 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getGroup()); 
            // InternalDSL.g:769:3: ( rule__LogicalAndOperation__Group__0 )
            // InternalDSL.g:769:4: rule__LogicalAndOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleLogicalAndOperation"


    // $ANTLR start "entryRuleLogicalNegationOperation"
    // InternalDSL.g:778:1: entryRuleLogicalNegationOperation : ruleLogicalNegationOperation EOF ;
    public final void entryRuleLogicalNegationOperation() throws RecognitionException {
        try {
            // InternalDSL.g:779:1: ( ruleLogicalNegationOperation EOF )
            // InternalDSL.g:780:1: ruleLogicalNegationOperation EOF
            {
             before(grammarAccess.getLogicalNegationOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalNegationOperation();

            state._fsp--;

             after(grammarAccess.getLogicalNegationOperationRule()); 
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
    // $ANTLR end "entryRuleLogicalNegationOperation"


    // $ANTLR start "ruleLogicalNegationOperation"
    // InternalDSL.g:787:1: ruleLogicalNegationOperation : ( ( rule__LogicalNegationOperation__Alternatives ) ) ;
    public final void ruleLogicalNegationOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:791:2: ( ( ( rule__LogicalNegationOperation__Alternatives ) ) )
            // InternalDSL.g:792:2: ( ( rule__LogicalNegationOperation__Alternatives ) )
            {
            // InternalDSL.g:792:2: ( ( rule__LogicalNegationOperation__Alternatives ) )
            // InternalDSL.g:793:3: ( rule__LogicalNegationOperation__Alternatives )
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getAlternatives()); 
            // InternalDSL.g:794:3: ( rule__LogicalNegationOperation__Alternatives )
            // InternalDSL.g:794:4: rule__LogicalNegationOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalNegationOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLogicalNegationOperation"


    // $ANTLR start "entryRuleEncapsulatedLogicalOperation"
    // InternalDSL.g:803:1: entryRuleEncapsulatedLogicalOperation : ruleEncapsulatedLogicalOperation EOF ;
    public final void entryRuleEncapsulatedLogicalOperation() throws RecognitionException {
        try {
            // InternalDSL.g:804:1: ( ruleEncapsulatedLogicalOperation EOF )
            // InternalDSL.g:805:1: ruleEncapsulatedLogicalOperation EOF
            {
             before(grammarAccess.getEncapsulatedLogicalOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEncapsulatedLogicalOperation();

            state._fsp--;

             after(grammarAccess.getEncapsulatedLogicalOperationRule()); 
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
    // $ANTLR end "entryRuleEncapsulatedLogicalOperation"


    // $ANTLR start "ruleEncapsulatedLogicalOperation"
    // InternalDSL.g:812:1: ruleEncapsulatedLogicalOperation : ( ( rule__EncapsulatedLogicalOperation__Alternatives ) ) ;
    public final void ruleEncapsulatedLogicalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:816:2: ( ( ( rule__EncapsulatedLogicalOperation__Alternatives ) ) )
            // InternalDSL.g:817:2: ( ( rule__EncapsulatedLogicalOperation__Alternatives ) )
            {
            // InternalDSL.g:817:2: ( ( rule__EncapsulatedLogicalOperation__Alternatives ) )
            // InternalDSL.g:818:3: ( rule__EncapsulatedLogicalOperation__Alternatives )
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getAlternatives()); 
            // InternalDSL.g:819:3: ( rule__EncapsulatedLogicalOperation__Alternatives )
            // InternalDSL.g:819:4: rule__EncapsulatedLogicalOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEncapsulatedLogicalOperation"


    // $ANTLR start "entryRuleSimpleBooleanOperation"
    // InternalDSL.g:828:1: entryRuleSimpleBooleanOperation : ruleSimpleBooleanOperation EOF ;
    public final void entryRuleSimpleBooleanOperation() throws RecognitionException {
        try {
            // InternalDSL.g:829:1: ( ruleSimpleBooleanOperation EOF )
            // InternalDSL.g:830:1: ruleSimpleBooleanOperation EOF
            {
             before(grammarAccess.getSimpleBooleanOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getSimpleBooleanOperationRule()); 
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
    // $ANTLR end "entryRuleSimpleBooleanOperation"


    // $ANTLR start "ruleSimpleBooleanOperation"
    // InternalDSL.g:837:1: ruleSimpleBooleanOperation : ( ( rule__SimpleBooleanOperation__Alternatives ) ) ;
    public final void ruleSimpleBooleanOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:841:2: ( ( ( rule__SimpleBooleanOperation__Alternatives ) ) )
            // InternalDSL.g:842:2: ( ( rule__SimpleBooleanOperation__Alternatives ) )
            {
            // InternalDSL.g:842:2: ( ( rule__SimpleBooleanOperation__Alternatives ) )
            // InternalDSL.g:843:3: ( rule__SimpleBooleanOperation__Alternatives )
            {
             before(grammarAccess.getSimpleBooleanOperationAccess().getAlternatives()); 
            // InternalDSL.g:844:3: ( rule__SimpleBooleanOperation__Alternatives )
            // InternalDSL.g:844:4: rule__SimpleBooleanOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleBooleanOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleBooleanOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimpleBooleanOperation"


    // $ANTLR start "entryRuleVariableEqualityOperation"
    // InternalDSL.g:853:1: entryRuleVariableEqualityOperation : ruleVariableEqualityOperation EOF ;
    public final void entryRuleVariableEqualityOperation() throws RecognitionException {
        try {
            // InternalDSL.g:854:1: ( ruleVariableEqualityOperation EOF )
            // InternalDSL.g:855:1: ruleVariableEqualityOperation EOF
            {
             before(grammarAccess.getVariableEqualityOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableEqualityOperation();

            state._fsp--;

             after(grammarAccess.getVariableEqualityOperationRule()); 
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
    // $ANTLR end "entryRuleVariableEqualityOperation"


    // $ANTLR start "ruleVariableEqualityOperation"
    // InternalDSL.g:862:1: ruleVariableEqualityOperation : ( ( rule__VariableEqualityOperation__Group__0 ) ) ;
    public final void ruleVariableEqualityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:866:2: ( ( ( rule__VariableEqualityOperation__Group__0 ) ) )
            // InternalDSL.g:867:2: ( ( rule__VariableEqualityOperation__Group__0 ) )
            {
            // InternalDSL.g:867:2: ( ( rule__VariableEqualityOperation__Group__0 ) )
            // InternalDSL.g:868:3: ( rule__VariableEqualityOperation__Group__0 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getGroup()); 
            // InternalDSL.g:869:3: ( rule__VariableEqualityOperation__Group__0 )
            // InternalDSL.g:869:4: rule__VariableEqualityOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableEqualityOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableEqualityOperation"


    // $ANTLR start "entryRuleVariableInequalityOperation"
    // InternalDSL.g:878:1: entryRuleVariableInequalityOperation : ruleVariableInequalityOperation EOF ;
    public final void entryRuleVariableInequalityOperation() throws RecognitionException {
        try {
            // InternalDSL.g:879:1: ( ruleVariableInequalityOperation EOF )
            // InternalDSL.g:880:1: ruleVariableInequalityOperation EOF
            {
             before(grammarAccess.getVariableInequalityOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableInequalityOperation();

            state._fsp--;

             after(grammarAccess.getVariableInequalityOperationRule()); 
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
    // $ANTLR end "entryRuleVariableInequalityOperation"


    // $ANTLR start "ruleVariableInequalityOperation"
    // InternalDSL.g:887:1: ruleVariableInequalityOperation : ( ( rule__VariableInequalityOperation__Group__0 ) ) ;
    public final void ruleVariableInequalityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:891:2: ( ( ( rule__VariableInequalityOperation__Group__0 ) ) )
            // InternalDSL.g:892:2: ( ( rule__VariableInequalityOperation__Group__0 ) )
            {
            // InternalDSL.g:892:2: ( ( rule__VariableInequalityOperation__Group__0 ) )
            // InternalDSL.g:893:3: ( rule__VariableInequalityOperation__Group__0 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getGroup()); 
            // InternalDSL.g:894:3: ( rule__VariableInequalityOperation__Group__0 )
            // InternalDSL.g:894:4: rule__VariableInequalityOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableInequalityOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableInequalityOperation"


    // $ANTLR start "entryRuleEmptySetOperation"
    // InternalDSL.g:903:1: entryRuleEmptySetOperation : ruleEmptySetOperation EOF ;
    public final void entryRuleEmptySetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:904:1: ( ruleEmptySetOperation EOF )
            // InternalDSL.g:905:1: ruleEmptySetOperation EOF
            {
             before(grammarAccess.getEmptySetOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptySetOperation();

            state._fsp--;

             after(grammarAccess.getEmptySetOperationRule()); 
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
    // $ANTLR end "entryRuleEmptySetOperation"


    // $ANTLR start "ruleEmptySetOperation"
    // InternalDSL.g:912:1: ruleEmptySetOperation : ( ( rule__EmptySetOperation__Group__0 ) ) ;
    public final void ruleEmptySetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:916:2: ( ( ( rule__EmptySetOperation__Group__0 ) ) )
            // InternalDSL.g:917:2: ( ( rule__EmptySetOperation__Group__0 ) )
            {
            // InternalDSL.g:917:2: ( ( rule__EmptySetOperation__Group__0 ) )
            // InternalDSL.g:918:3: ( rule__EmptySetOperation__Group__0 )
            {
             before(grammarAccess.getEmptySetOperationAccess().getGroup()); 
            // InternalDSL.g:919:3: ( rule__EmptySetOperation__Group__0 )
            // InternalDSL.g:919:4: rule__EmptySetOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptySetOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleEmptySetOperation"


    // $ANTLR start "entryRuleIntersectionOperation"
    // InternalDSL.g:928:1: entryRuleIntersectionOperation : ruleIntersectionOperation EOF ;
    public final void entryRuleIntersectionOperation() throws RecognitionException {
        try {
            // InternalDSL.g:929:1: ( ruleIntersectionOperation EOF )
            // InternalDSL.g:930:1: ruleIntersectionOperation EOF
            {
             before(grammarAccess.getIntersectionOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleIntersectionOperation();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationRule()); 
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
    // $ANTLR end "entryRuleIntersectionOperation"


    // $ANTLR start "ruleIntersectionOperation"
    // InternalDSL.g:937:1: ruleIntersectionOperation : ( ( rule__IntersectionOperation__Group__0 ) ) ;
    public final void ruleIntersectionOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:941:2: ( ( ( rule__IntersectionOperation__Group__0 ) ) )
            // InternalDSL.g:942:2: ( ( rule__IntersectionOperation__Group__0 ) )
            {
            // InternalDSL.g:942:2: ( ( rule__IntersectionOperation__Group__0 ) )
            // InternalDSL.g:943:3: ( rule__IntersectionOperation__Group__0 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getGroup()); 
            // InternalDSL.g:944:3: ( rule__IntersectionOperation__Group__0 )
            // InternalDSL.g:944:4: rule__IntersectionOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleIntersectionOperation"


    // $ANTLR start "entryRuleUnionOperation"
    // InternalDSL.g:953:1: entryRuleUnionOperation : ruleUnionOperation EOF ;
    public final void entryRuleUnionOperation() throws RecognitionException {
        try {
            // InternalDSL.g:954:1: ( ruleUnionOperation EOF )
            // InternalDSL.g:955:1: ruleUnionOperation EOF
            {
             before(grammarAccess.getUnionOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleUnionOperation();

            state._fsp--;

             after(grammarAccess.getUnionOperationRule()); 
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
    // $ANTLR end "entryRuleUnionOperation"


    // $ANTLR start "ruleUnionOperation"
    // InternalDSL.g:962:1: ruleUnionOperation : ( ( rule__UnionOperation__Group__0 ) ) ;
    public final void ruleUnionOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:966:2: ( ( ( rule__UnionOperation__Group__0 ) ) )
            // InternalDSL.g:967:2: ( ( rule__UnionOperation__Group__0 ) )
            {
            // InternalDSL.g:967:2: ( ( rule__UnionOperation__Group__0 ) )
            // InternalDSL.g:968:3: ( rule__UnionOperation__Group__0 )
            {
             before(grammarAccess.getUnionOperationAccess().getGroup()); 
            // InternalDSL.g:969:3: ( rule__UnionOperation__Group__0 )
            // InternalDSL.g:969:4: rule__UnionOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleUnionOperation"


    // $ANTLR start "entryRuleSubtractOperation"
    // InternalDSL.g:978:1: entryRuleSubtractOperation : ruleSubtractOperation EOF ;
    public final void entryRuleSubtractOperation() throws RecognitionException {
        try {
            // InternalDSL.g:979:1: ( ruleSubtractOperation EOF )
            // InternalDSL.g:980:1: ruleSubtractOperation EOF
            {
             before(grammarAccess.getSubtractOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtractOperation();

            state._fsp--;

             after(grammarAccess.getSubtractOperationRule()); 
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
    // $ANTLR end "entryRuleSubtractOperation"


    // $ANTLR start "ruleSubtractOperation"
    // InternalDSL.g:987:1: ruleSubtractOperation : ( ( rule__SubtractOperation__Group__0 ) ) ;
    public final void ruleSubtractOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:991:2: ( ( ( rule__SubtractOperation__Group__0 ) ) )
            // InternalDSL.g:992:2: ( ( rule__SubtractOperation__Group__0 ) )
            {
            // InternalDSL.g:992:2: ( ( rule__SubtractOperation__Group__0 ) )
            // InternalDSL.g:993:3: ( rule__SubtractOperation__Group__0 )
            {
             before(grammarAccess.getSubtractOperationAccess().getGroup()); 
            // InternalDSL.g:994:3: ( rule__SubtractOperation__Group__0 )
            // InternalDSL.g:994:4: rule__SubtractOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleSubtractOperation"


    // $ANTLR start "entryRuleElementOfOperation"
    // InternalDSL.g:1003:1: entryRuleElementOfOperation : ruleElementOfOperation EOF ;
    public final void entryRuleElementOfOperation() throws RecognitionException {
        try {
            // InternalDSL.g:1004:1: ( ruleElementOfOperation EOF )
            // InternalDSL.g:1005:1: ruleElementOfOperation EOF
            {
             before(grammarAccess.getElementOfOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleElementOfOperation();

            state._fsp--;

             after(grammarAccess.getElementOfOperationRule()); 
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
    // $ANTLR end "entryRuleElementOfOperation"


    // $ANTLR start "ruleElementOfOperation"
    // InternalDSL.g:1012:1: ruleElementOfOperation : ( ( rule__ElementOfOperation__Group__0 ) ) ;
    public final void ruleElementOfOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1016:2: ( ( ( rule__ElementOfOperation__Group__0 ) ) )
            // InternalDSL.g:1017:2: ( ( rule__ElementOfOperation__Group__0 ) )
            {
            // InternalDSL.g:1017:2: ( ( rule__ElementOfOperation__Group__0 ) )
            // InternalDSL.g:1018:3: ( rule__ElementOfOperation__Group__0 )
            {
             before(grammarAccess.getElementOfOperationAccess().getGroup()); 
            // InternalDSL.g:1019:3: ( rule__ElementOfOperation__Group__0 )
            // InternalDSL.g:1019:4: rule__ElementOfOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementOfOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleElementOfOperation"


    // $ANTLR start "entryRuleCreateSetOperation"
    // InternalDSL.g:1028:1: entryRuleCreateSetOperation : ruleCreateSetOperation EOF ;
    public final void entryRuleCreateSetOperation() throws RecognitionException {
        try {
            // InternalDSL.g:1029:1: ( ruleCreateSetOperation EOF )
            // InternalDSL.g:1030:1: ruleCreateSetOperation EOF
            {
             before(grammarAccess.getCreateSetOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateSetOperation();

            state._fsp--;

             after(grammarAccess.getCreateSetOperationRule()); 
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
    // $ANTLR end "entryRuleCreateSetOperation"


    // $ANTLR start "ruleCreateSetOperation"
    // InternalDSL.g:1037:1: ruleCreateSetOperation : ( ( rule__CreateSetOperation__Group__0 ) ) ;
    public final void ruleCreateSetOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1041:2: ( ( ( rule__CreateSetOperation__Group__0 ) ) )
            // InternalDSL.g:1042:2: ( ( rule__CreateSetOperation__Group__0 ) )
            {
            // InternalDSL.g:1042:2: ( ( rule__CreateSetOperation__Group__0 ) )
            // InternalDSL.g:1043:3: ( rule__CreateSetOperation__Group__0 )
            {
             before(grammarAccess.getCreateSetOperationAccess().getGroup()); 
            // InternalDSL.g:1044:3: ( rule__CreateSetOperation__Group__0 )
            // InternalDSL.g:1044:4: rule__CreateSetOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateSetOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleCreateSetOperation"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDSL.g:1052:1: rule__AbstractElement__Alternatives : ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1056:1: ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 24:
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
                    // InternalDSL.g:1057:2: ( ruleInclude )
                    {
                    // InternalDSL.g:1057:2: ( ruleInclude )
                    // InternalDSL.g:1058:3: ruleInclude
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
                    // InternalDSL.g:1063:2: ( ruleCharacteristicType )
                    {
                    // InternalDSL.g:1063:2: ( ruleCharacteristicType )
                    // InternalDSL.g:1064:3: ruleCharacteristicType
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
                    // InternalDSL.g:1069:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:1069:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:1070:3: ruleCharacteristicClass
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
                    // InternalDSL.g:1075:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:1075:2: ( ruleConstraint )
                    // InternalDSL.g:1076:3: ruleConstraint
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
                    // InternalDSL.g:1081:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    {
                    // InternalDSL.g:1081:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    // InternalDSL.g:1082:3: ( rule__AbstractElement__Group_4__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_4()); 
                    // InternalDSL.g:1083:3: ( rule__AbstractElement__Group_4__0 )
                    // InternalDSL.g:1083:4: rule__AbstractElement__Group_4__0
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
    // InternalDSL.g:1091:1: rule__CharacteristicTypeSelector__Alternatives_2 : ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) );
    public final void rule__CharacteristicTypeSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1095:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 34:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 45:
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
                    // InternalDSL.g:1096:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:1096:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    // InternalDSL.g:1097:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:1098:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    // InternalDSL.g:1098:4: rule__CharacteristicTypeSelector__Group_2_0__0
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
                    // InternalDSL.g:1102:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:1102:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    // InternalDSL.g:1103:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:1104:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    // InternalDSL.g:1104:4: rule__CharacteristicTypeSelector__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1108:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    {
                    // InternalDSL.g:1108:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    // InternalDSL.g:1109:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_2()); 
                    // InternalDSL.g:1110:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    // InternalDSL.g:1110:4: rule__CharacteristicTypeSelector__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicTypeSelector__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_2()); 

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


    // $ANTLR start "rule__CharacteristicVariableType__Alternatives"
    // InternalDSL.g:1118:1: rule__CharacteristicVariableType__Alternatives : ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) );
    public final void rule__CharacteristicVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1122:1: ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==22) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=17 && LA3_1<=18)||LA3_1==25||LA3_1==32||LA3_1==47) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:1123:2: ( ruleCharacteristicVariable )
                    {
                    // InternalDSL.g:1123:2: ( ruleCharacteristicVariable )
                    // InternalDSL.g:1124:3: ruleCharacteristicVariable
                    {
                     before(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicVariable();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1129:2: ( ruleCharacteristicSet )
                    {
                    // InternalDSL.g:1129:2: ( ruleCharacteristicSet )
                    // InternalDSL.g:1130:3: ruleCharacteristicSet
                    {
                     before(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicSet();

                    state._fsp--;

                     after(grammarAccess.getCharacteristicVariableTypeAccess().getCharacteristicSetParserRuleCall_1()); 

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
    // $ANTLR end "rule__CharacteristicVariableType__Alternatives"


    // $ANTLR start "rule__DataSelector__Alternatives"
    // InternalDSL.g:1139:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1143:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:1144:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:1144:2: ( ruleAttributeSelector )
                    // InternalDSL.g:1145:3: ruleAttributeSelector
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
                    // InternalDSL.g:1150:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:1150:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:1151:3: ruleAttributeClassSelector
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
    // InternalDSL.g:1160:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1164:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
            case 31:
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
                    // InternalDSL.g:1165:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:1165:2: ( rulePropertySelector )
                    // InternalDSL.g:1166:3: rulePropertySelector
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
                    // InternalDSL.g:1171:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:1171:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:1172:3: rulePropertyClassSelector
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
                    // InternalDSL.g:1177:2: ( ruleNodeIdentitiySelector )
                    {
                    // InternalDSL.g:1177:2: ( ruleNodeIdentitiySelector )
                    // InternalDSL.g:1178:3: ruleNodeIdentitiySelector
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


    // $ANTLR start "rule__NodeIdentitiySelector__Alternatives"
    // InternalDSL.g:1187:1: rule__NodeIdentitiySelector__Alternatives : ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) );
    public final void rule__NodeIdentitiySelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1191:1: ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:1192:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    {
                    // InternalDSL.g:1192:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    // InternalDSL.g:1193:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_0()); 
                    // InternalDSL.g:1194:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    // InternalDSL.g:1194:4: rule__NodeIdentitiySelector__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeIdentitiySelector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1198:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    {
                    // InternalDSL.g:1198:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    // InternalDSL.g:1199:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1()); 
                    // InternalDSL.g:1200:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    // InternalDSL.g:1200:4: rule__NodeIdentitiySelector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeIdentitiySelector__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Alternatives"


    // $ANTLR start "rule__CharacteristicSetReference__Alternatives"
    // InternalDSL.g:1208:1: rule__CharacteristicSetReference__Alternatives : ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) );
    public final void rule__CharacteristicSetReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1212:1: ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==16||(LA7_0>=40 && LA7_0<=42)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1213:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    {
                    // InternalDSL.g:1213:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    // InternalDSL.g:1214:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getValueAssignment_0()); 
                    // InternalDSL.g:1215:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    // InternalDSL.g:1215:4: rule__CharacteristicSetReference__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicSetReference__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicSetReferenceAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1219:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    {
                    // InternalDSL.g:1219:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    // InternalDSL.g:1220:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getRefAssignment_1()); 
                    // InternalDSL.g:1221:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    // InternalDSL.g:1221:4: rule__CharacteristicSetReference__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharacteristicSetReference__RefAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicSetReferenceAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__CharacteristicSetReference__Alternatives"


    // $ANTLR start "rule__CharacteristsicSetOperation__Alternatives"
    // InternalDSL.g:1229:1: rule__CharacteristsicSetOperation__Alternatives : ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) | ( ruleUnionOperation ) | ( ruleSubtractOperation ) );
    public final void rule__CharacteristsicSetOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1233:1: ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) | ( ruleUnionOperation ) | ( ruleSubtractOperation ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            case 42:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:1234:2: ( ruleCreateSetOperation )
                    {
                    // InternalDSL.g:1234:2: ( ruleCreateSetOperation )
                    // InternalDSL.g:1235:3: ruleCreateSetOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getCreateSetOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateSetOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getCreateSetOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1240:2: ( ruleIntersectionOperation )
                    {
                    // InternalDSL.g:1240:2: ( ruleIntersectionOperation )
                    // InternalDSL.g:1241:3: ruleIntersectionOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntersectionOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getIntersectionOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1246:2: ( ruleUnionOperation )
                    {
                    // InternalDSL.g:1246:2: ( ruleUnionOperation )
                    // InternalDSL.g:1247:3: ruleUnionOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getUnionOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnionOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getUnionOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1252:2: ( ruleSubtractOperation )
                    {
                    // InternalDSL.g:1252:2: ( ruleSubtractOperation )
                    // InternalDSL.g:1253:3: ruleSubtractOperation
                    {
                     before(grammarAccess.getCharacteristsicSetOperationAccess().getSubtractOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtractOperation();

                    state._fsp--;

                     after(grammarAccess.getCharacteristsicSetOperationAccess().getSubtractOperationParserRuleCall_3()); 

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
    // $ANTLR end "rule__CharacteristsicSetOperation__Alternatives"


    // $ANTLR start "rule__LogicalNegationOperation__Alternatives"
    // InternalDSL.g:1262:1: rule__LogicalNegationOperation__Alternatives : ( ( ruleEncapsulatedLogicalOperation ) | ( ( rule__LogicalNegationOperation__Group_1__0 ) ) );
    public final void rule__LogicalNegationOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1266:1: ( ( ruleEncapsulatedLogicalOperation ) | ( ( rule__LogicalNegationOperation__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==35||LA9_0==39||LA9_0==43) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1267:2: ( ruleEncapsulatedLogicalOperation )
                    {
                    // InternalDSL.g:1267:2: ( ruleEncapsulatedLogicalOperation )
                    // InternalDSL.g:1268:3: ruleEncapsulatedLogicalOperation
                    {
                     before(grammarAccess.getLogicalNegationOperationAccess().getEncapsulatedLogicalOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEncapsulatedLogicalOperation();

                    state._fsp--;

                     after(grammarAccess.getLogicalNegationOperationAccess().getEncapsulatedLogicalOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1273:2: ( ( rule__LogicalNegationOperation__Group_1__0 ) )
                    {
                    // InternalDSL.g:1273:2: ( ( rule__LogicalNegationOperation__Group_1__0 ) )
                    // InternalDSL.g:1274:3: ( rule__LogicalNegationOperation__Group_1__0 )
                    {
                     before(grammarAccess.getLogicalNegationOperationAccess().getGroup_1()); 
                    // InternalDSL.g:1275:3: ( rule__LogicalNegationOperation__Group_1__0 )
                    // InternalDSL.g:1275:4: rule__LogicalNegationOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalNegationOperation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicalNegationOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LogicalNegationOperation__Alternatives"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Alternatives"
    // InternalDSL.g:1283:1: rule__EncapsulatedLogicalOperation__Alternatives : ( ( ruleSimpleBooleanOperation ) | ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) ) );
    public final void rule__EncapsulatedLogicalOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1287:1: ( ( ruleSimpleBooleanOperation ) | ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==39||LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1288:2: ( ruleSimpleBooleanOperation )
                    {
                    // InternalDSL.g:1288:2: ( ruleSimpleBooleanOperation )
                    // InternalDSL.g:1289:3: ruleSimpleBooleanOperation
                    {
                     before(grammarAccess.getEncapsulatedLogicalOperationAccess().getSimpleBooleanOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleBooleanOperation();

                    state._fsp--;

                     after(grammarAccess.getEncapsulatedLogicalOperationAccess().getSimpleBooleanOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1294:2: ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) )
                    {
                    // InternalDSL.g:1294:2: ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) )
                    // InternalDSL.g:1295:3: ( rule__EncapsulatedLogicalOperation__Group_1__0 )
                    {
                     before(grammarAccess.getEncapsulatedLogicalOperationAccess().getGroup_1()); 
                    // InternalDSL.g:1296:3: ( rule__EncapsulatedLogicalOperation__Group_1__0 )
                    // InternalDSL.g:1296:4: rule__EncapsulatedLogicalOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EncapsulatedLogicalOperation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEncapsulatedLogicalOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Alternatives"


    // $ANTLR start "rule__SimpleBooleanOperation__Alternatives"
    // InternalDSL.g:1304:1: rule__SimpleBooleanOperation__Alternatives : ( ( ruleEmptySetOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleElementOfOperation ) );
    public final void rule__SimpleBooleanOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1308:1: ( ( ruleEmptySetOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleElementOfOperation ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==38) ) {
                    alt11=3;
                }
                else if ( (LA11_2==37) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1309:2: ( ruleEmptySetOperation )
                    {
                    // InternalDSL.g:1309:2: ( ruleEmptySetOperation )
                    // InternalDSL.g:1310:3: ruleEmptySetOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getEmptySetOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptySetOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getEmptySetOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1315:2: ( ruleVariableEqualityOperation )
                    {
                    // InternalDSL.g:1315:2: ( ruleVariableEqualityOperation )
                    // InternalDSL.g:1316:3: ruleVariableEqualityOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableEqualityOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getVariableEqualityOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1321:2: ( ruleVariableInequalityOperation )
                    {
                    // InternalDSL.g:1321:2: ( ruleVariableInequalityOperation )
                    // InternalDSL.g:1322:3: ruleVariableInequalityOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableInequalityOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getVariableInequalityOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1327:2: ( ruleElementOfOperation )
                    {
                    // InternalDSL.g:1327:2: ( ruleElementOfOperation )
                    // InternalDSL.g:1328:3: ruleElementOfOperation
                    {
                     before(grammarAccess.getSimpleBooleanOperationAccess().getElementOfOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleElementOfOperation();

                    state._fsp--;

                     after(grammarAccess.getSimpleBooleanOperationAccess().getElementOfOperationParserRuleCall_3()); 

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
    // $ANTLR end "rule__SimpleBooleanOperation__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDSL.g:1337:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1341:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSL.g:1342:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDSL.g:1349:1: rule__Model__Group__0__Impl : ( ( rule__Model__TargetModelTypeAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1353:1: ( ( ( rule__Model__TargetModelTypeAssignment_0 )? ) )
            // InternalDSL.g:1354:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            {
            // InternalDSL.g:1354:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            // InternalDSL.g:1355:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 
            // InternalDSL.g:1356:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1356:3: rule__Model__TargetModelTypeAssignment_0
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
    // InternalDSL.g:1364:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1368:1: ( rule__Model__Group__1__Impl )
            // InternalDSL.g:1369:2: rule__Model__Group__1__Impl
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
    // InternalDSL.g:1375:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1379:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDSL.g:1380:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDSL.g:1380:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDSL.g:1381:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDSL.g:1382:2: ( rule__Model__ElementsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SL_COMMENT||LA13_0==13||LA13_0==15||(LA13_0>=23 && LA13_0<=24)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1382:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDSL.g:1391:1: rule__TargetModelTypeDef__Group__0 : rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 ;
    public final void rule__TargetModelTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1395:1: ( rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 )
            // InternalDSL.g:1396:2: rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1
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
    // InternalDSL.g:1403:1: rule__TargetModelTypeDef__Group__0__Impl : ( 'target' ) ;
    public final void rule__TargetModelTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1407:1: ( ( 'target' ) )
            // InternalDSL.g:1408:1: ( 'target' )
            {
            // InternalDSL.g:1408:1: ( 'target' )
            // InternalDSL.g:1409:2: 'target'
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalDSL.g:1418:1: rule__TargetModelTypeDef__Group__1 : rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 ;
    public final void rule__TargetModelTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1422:1: ( rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 )
            // InternalDSL.g:1423:2: rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TargetModelTypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__2();

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
    // InternalDSL.g:1430:1: rule__TargetModelTypeDef__Group__1__Impl : ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1434:1: ( ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) )
            // InternalDSL.g:1435:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            {
            // InternalDSL.g:1435:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            // InternalDSL.g:1436:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 
            // InternalDSL.g:1437:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            // InternalDSL.g:1437:3: rule__TargetModelTypeDef__TypeAssignment_1
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


    // $ANTLR start "rule__TargetModelTypeDef__Group__2"
    // InternalDSL.g:1445:1: rule__TargetModelTypeDef__Group__2 : rule__TargetModelTypeDef__Group__2__Impl rule__TargetModelTypeDef__Group__3 ;
    public final void rule__TargetModelTypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1449:1: ( rule__TargetModelTypeDef__Group__2__Impl rule__TargetModelTypeDef__Group__3 )
            // InternalDSL.g:1450:2: rule__TargetModelTypeDef__Group__2__Impl rule__TargetModelTypeDef__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__TargetModelTypeDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__3();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__2"


    // $ANTLR start "rule__TargetModelTypeDef__Group__2__Impl"
    // InternalDSL.g:1457:1: rule__TargetModelTypeDef__Group__2__Impl : ( 'using' ) ;
    public final void rule__TargetModelTypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1461:1: ( ( 'using' ) )
            // InternalDSL.g:1462:1: ( 'using' )
            {
            // InternalDSL.g:1462:1: ( 'using' )
            // InternalDSL.g:1463:2: 'using'
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__2__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group__3"
    // InternalDSL.g:1472:1: rule__TargetModelTypeDef__Group__3 : rule__TargetModelTypeDef__Group__3__Impl ;
    public final void rule__TargetModelTypeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1476:1: ( rule__TargetModelTypeDef__Group__3__Impl )
            // InternalDSL.g:1477:2: rule__TargetModelTypeDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__3__Impl();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__3"


    // $ANTLR start "rule__TargetModelTypeDef__Group__3__Impl"
    // InternalDSL.g:1483:1: rule__TargetModelTypeDef__Group__3__Impl : ( ( rule__TargetModelTypeDef__TypeContainerAssignment_3 ) ) ;
    public final void rule__TargetModelTypeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1487:1: ( ( ( rule__TargetModelTypeDef__TypeContainerAssignment_3 ) ) )
            // InternalDSL.g:1488:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_3 ) )
            {
            // InternalDSL.g:1488:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_3 ) )
            // InternalDSL.g:1489:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_3 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_3()); 
            // InternalDSL.g:1490:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_3 )
            // InternalDSL.g:1490:3: rule__TargetModelTypeDef__TypeContainerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__TypeContainerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_3()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__Group__3__Impl"


    // $ANTLR start "rule__AbstractElement__Group_4__0"
    // InternalDSL.g:1499:1: rule__AbstractElement__Group_4__0 : rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 ;
    public final void rule__AbstractElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1503:1: ( rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 )
            // InternalDSL.g:1504:2: rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1
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
    // InternalDSL.g:1511:1: rule__AbstractElement__Group_4__0__Impl : ( () ) ;
    public final void rule__AbstractElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1515:1: ( ( () ) )
            // InternalDSL.g:1516:1: ( () )
            {
            // InternalDSL.g:1516:1: ( () )
            // InternalDSL.g:1517:2: ()
            {
             before(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 
            // InternalDSL.g:1518:2: ()
            // InternalDSL.g:1518:3: 
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
    // InternalDSL.g:1526:1: rule__AbstractElement__Group_4__1 : rule__AbstractElement__Group_4__1__Impl ;
    public final void rule__AbstractElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1530:1: ( rule__AbstractElement__Group_4__1__Impl )
            // InternalDSL.g:1531:2: rule__AbstractElement__Group_4__1__Impl
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
    // InternalDSL.g:1537:1: rule__AbstractElement__Group_4__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__AbstractElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1541:1: ( ( RULE_SL_COMMENT ) )
            // InternalDSL.g:1542:1: ( RULE_SL_COMMENT )
            {
            // InternalDSL.g:1542:1: ( RULE_SL_COMMENT )
            // InternalDSL.g:1543:2: RULE_SL_COMMENT
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
    // InternalDSL.g:1553:1: rule__CharacteristicType__Group__0 : rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 ;
    public final void rule__CharacteristicType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1557:1: ( rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 )
            // InternalDSL.g:1558:2: rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1565:1: rule__CharacteristicType__Group__0__Impl : ( 'type' ) ;
    public final void rule__CharacteristicType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1569:1: ( ( 'type' ) )
            // InternalDSL.g:1570:1: ( 'type' )
            {
            // InternalDSL.g:1570:1: ( 'type' )
            // InternalDSL.g:1571:2: 'type'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:1580:1: rule__CharacteristicType__Group__1 : rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 ;
    public final void rule__CharacteristicType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1584:1: ( rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 )
            // InternalDSL.g:1585:2: rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:1592:1: rule__CharacteristicType__Group__1__Impl : ( ( rule__CharacteristicType__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1596:1: ( ( ( rule__CharacteristicType__NameAssignment_1 ) ) )
            // InternalDSL.g:1597:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1597:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            // InternalDSL.g:1598:2: ( rule__CharacteristicType__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1599:2: ( rule__CharacteristicType__NameAssignment_1 )
            // InternalDSL.g:1599:3: rule__CharacteristicType__NameAssignment_1
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
    // InternalDSL.g:1607:1: rule__CharacteristicType__Group__2 : rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 ;
    public final void rule__CharacteristicType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1611:1: ( rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 )
            // InternalDSL.g:1612:2: rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1619:1: rule__CharacteristicType__Group__2__Impl : ( ':' ) ;
    public final void rule__CharacteristicType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1623:1: ( ( ':' ) )
            // InternalDSL.g:1624:1: ( ':' )
            {
            // InternalDSL.g:1624:1: ( ':' )
            // InternalDSL.g:1625:2: ':'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:1634:1: rule__CharacteristicType__Group__3 : rule__CharacteristicType__Group__3__Impl ;
    public final void rule__CharacteristicType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1638:1: ( rule__CharacteristicType__Group__3__Impl )
            // InternalDSL.g:1639:2: rule__CharacteristicType__Group__3__Impl
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
    // InternalDSL.g:1645:1: rule__CharacteristicType__Group__3__Impl : ( ( rule__CharacteristicType__RefAssignment_3 ) ) ;
    public final void rule__CharacteristicType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1649:1: ( ( ( rule__CharacteristicType__RefAssignment_3 ) ) )
            // InternalDSL.g:1650:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            {
            // InternalDSL.g:1650:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            // InternalDSL.g:1651:2: ( rule__CharacteristicType__RefAssignment_3 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 
            // InternalDSL.g:1652:2: ( rule__CharacteristicType__RefAssignment_3 )
            // InternalDSL.g:1652:3: rule__CharacteristicType__RefAssignment_3
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
    // InternalDSL.g:1661:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1665:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:1666:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1673:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1677:1: ( ( 'class' ) )
            // InternalDSL.g:1678:1: ( 'class' )
            {
            // InternalDSL.g:1678:1: ( 'class' )
            // InternalDSL.g:1679:2: 'class'
            {
             before(grammarAccess.getCharacteristicClassAccess().getClassKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:1688:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1692:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:1693:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSL.g:1700:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1704:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:1705:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:1705:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:1706:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:1707:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:1707:3: rule__CharacteristicClass__NameAssignment_1
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
    // InternalDSL.g:1715:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1719:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1720:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1727:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1731:1: ( ( '{' ) )
            // InternalDSL.g:1732:1: ( '{' )
            {
            // InternalDSL.g:1732:1: ( '{' )
            // InternalDSL.g:1733:2: '{'
            {
             before(grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:1742:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1746:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1747:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:1754:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1758:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1759:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1759:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1760:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1761:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1761:3: rule__CharacteristicClass__MembersAssignment_3
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
    // InternalDSL.g:1769:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1773:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:1774:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:1781:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1785:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:1786:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:1786:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:1787:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:1788:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:1788:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CharacteristicClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDSL.g:1796:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1800:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:1801:2: rule__CharacteristicClass__Group__5__Impl
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
    // InternalDSL.g:1807:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1811:1: ( ( '}' ) )
            // InternalDSL.g:1812:1: ( '}' )
            {
            // InternalDSL.g:1812:1: ( '}' )
            // InternalDSL.g:1813:2: '}'
            {
             before(grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDSL.g:1823:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1827:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:1828:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:1835:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1839:1: ( ( ',' ) )
            // InternalDSL.g:1840:1: ( ',' )
            {
            // InternalDSL.g:1840:1: ( ',' )
            // InternalDSL.g:1841:2: ','
            {
             before(grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1850:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1854:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:1855:2: rule__CharacteristicClass__Group_4__1__Impl
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
    // InternalDSL.g:1861:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1865:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:1866:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:1866:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:1867:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:1868:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:1868:3: rule__CharacteristicClass__MembersAssignment_4_1
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
    // InternalDSL.g:1877:1: rule__CharacteristicTypeSelector__Group__0 : rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 ;
    public final void rule__CharacteristicTypeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1881:1: ( rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 )
            // InternalDSL.g:1882:2: rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDSL.g:1889:1: rule__CharacteristicTypeSelector__Group__0__Impl : ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1893:1: ( ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:1894:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:1894:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            // InternalDSL.g:1895:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:1896:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            // InternalDSL.g:1896:3: rule__CharacteristicTypeSelector__RefAssignment_0
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
    // InternalDSL.g:1904:1: rule__CharacteristicTypeSelector__Group__1 : rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 ;
    public final void rule__CharacteristicTypeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1908:1: ( rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 )
            // InternalDSL.g:1909:2: rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDSL.g:1916:1: rule__CharacteristicTypeSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicTypeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1920:1: ( ( '.' ) )
            // InternalDSL.g:1921:1: ( '.' )
            {
            // InternalDSL.g:1921:1: ( '.' )
            // InternalDSL.g:1922:2: '.'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSL.g:1931:1: rule__CharacteristicTypeSelector__Group__2 : rule__CharacteristicTypeSelector__Group__2__Impl ;
    public final void rule__CharacteristicTypeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1935:1: ( rule__CharacteristicTypeSelector__Group__2__Impl )
            // InternalDSL.g:1936:2: rule__CharacteristicTypeSelector__Group__2__Impl
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
    // InternalDSL.g:1942:1: rule__CharacteristicTypeSelector__Group__2__Impl : ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1946:1: ( ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) )
            // InternalDSL.g:1947:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:1947:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            // InternalDSL.g:1948:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:1949:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            // InternalDSL.g:1949:3: rule__CharacteristicTypeSelector__Alternatives_2
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
    // InternalDSL.g:1958:1: rule__CharacteristicTypeSelector__Group_2_0__0 : rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1962:1: ( rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 )
            // InternalDSL.g:1963:2: rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDSL.g:1970:1: rule__CharacteristicTypeSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1974:1: ( ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:1975:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:1975:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:1976:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:1977:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:1977:3: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0
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
    // InternalDSL.g:1985:1: rule__CharacteristicTypeSelector__Group_2_0__1 : rule__CharacteristicTypeSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1989:1: ( rule__CharacteristicTypeSelector__Group_2_0__1__Impl )
            // InternalDSL.g:1990:2: rule__CharacteristicTypeSelector__Group_2_0__1__Impl
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
    // InternalDSL.g:1996:1: rule__CharacteristicTypeSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2000:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:2001:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:2001:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:2002:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:2003:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:2003:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1
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
    // InternalDSL.g:2012:1: rule__CharacteristicTypeSelector__Group_2_1__0 : rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2016:1: ( rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 )
            // InternalDSL.g:2017:2: rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2024:1: rule__CharacteristicTypeSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2028:1: ( ( '[' ) )
            // InternalDSL.g:2029:1: ( '[' )
            {
            // InternalDSL.g:2029:1: ( '[' )
            // InternalDSL.g:2030:2: '['
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:2039:1: rule__CharacteristicTypeSelector__Group_2_1__1 : rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2043:1: ( rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 )
            // InternalDSL.g:2044:2: rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSL.g:2051:1: rule__CharacteristicTypeSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2055:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:2056:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:2056:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:2057:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:2058:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:2058:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1
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
    // InternalDSL.g:2066:1: rule__CharacteristicTypeSelector__Group_2_1__2 : rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2070:1: ( rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 )
            // InternalDSL.g:2071:2: rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSL.g:2078:1: rule__CharacteristicTypeSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2082:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) )
            // InternalDSL.g:2083:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            {
            // InternalDSL.g:2083:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            // InternalDSL.g:2084:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 
            // InternalDSL.g:2085:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:2085:3: rule__CharacteristicTypeSelector__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CharacteristicTypeSelector__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDSL.g:2093:1: rule__CharacteristicTypeSelector__Group_2_1__3 : rule__CharacteristicTypeSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2097:1: ( rule__CharacteristicTypeSelector__Group_2_1__3__Impl )
            // InternalDSL.g:2098:2: rule__CharacteristicTypeSelector__Group_2_1__3__Impl
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
    // InternalDSL.g:2104:1: rule__CharacteristicTypeSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2108:1: ( ( ']' ) )
            // InternalDSL.g:2109:1: ( ']' )
            {
            // InternalDSL.g:2109:1: ( ']' )
            // InternalDSL.g:2110:2: ']'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:2120:1: rule__CharacteristicTypeSelector__Group_2_1_2__0 : rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2124:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 )
            // InternalDSL.g:2125:2: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2132:1: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2136:1: ( ( ',' ) )
            // InternalDSL.g:2137:1: ( ',' )
            {
            // InternalDSL.g:2137:1: ( ',' )
            // InternalDSL.g:2138:2: ','
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:2147:1: rule__CharacteristicTypeSelector__Group_2_1_2__1 : rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2151:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl )
            // InternalDSL.g:2152:2: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl
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
    // InternalDSL.g:2158:1: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2162:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) )
            // InternalDSL.g:2163:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            {
            // InternalDSL.g:2163:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            // InternalDSL.g:2164:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 
            // InternalDSL.g:2165:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            // InternalDSL.g:2165:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1
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


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__0"
    // InternalDSL.g:2174:1: rule__CharacteristicTypeSelector__Group_2_2__0 : rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2178:1: ( rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 )
            // InternalDSL.g:2179:2: rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__CharacteristicTypeSelector__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_2__1();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__0"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__0__Impl"
    // InternalDSL.g:2186:1: rule__CharacteristicTypeSelector__Group_2_2__0__Impl : ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2190:1: ( ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) )
            // InternalDSL.g:2191:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            {
            // InternalDSL.g:2191:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            // InternalDSL.g:2192:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorAssignment_2_2_0()); 
            // InternalDSL.g:2193:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            // InternalDSL.g:2193:3: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorAssignment_2_2_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__0__Impl"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__1"
    // InternalDSL.g:2201:1: rule__CharacteristicTypeSelector__Group_2_2__1 : rule__CharacteristicTypeSelector__Group_2_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2205:1: ( rule__CharacteristicTypeSelector__Group_2_2__1__Impl )
            // InternalDSL.g:2206:2: rule__CharacteristicTypeSelector__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__1"


    // $ANTLR start "rule__CharacteristicTypeSelector__Group_2_2__1__Impl"
    // InternalDSL.g:2212:1: rule__CharacteristicTypeSelector__Group_2_2__1__Impl : ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2216:1: ( ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) )
            // InternalDSL.g:2217:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            {
            // InternalDSL.g:2217:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            // InternalDSL.g:2218:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableAssignment_2_2_1()); 
            // InternalDSL.g:2219:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            // InternalDSL.g:2219:3: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicTypeSelector__VariableAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableAssignment_2_2_1()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__Group_2_2__1__Impl"


    // $ANTLR start "rule__CharacteristicSet__Group__0"
    // InternalDSL.g:2228:1: rule__CharacteristicSet__Group__0 : rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 ;
    public final void rule__CharacteristicSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2232:1: ( rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 )
            // InternalDSL.g:2233:2: rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__CharacteristicSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__Group__1();

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
    // $ANTLR end "rule__CharacteristicSet__Group__0"


    // $ANTLR start "rule__CharacteristicSet__Group__0__Impl"
    // InternalDSL.g:2240:1: rule__CharacteristicSet__Group__0__Impl : ( ( rule__CharacteristicSet__NameAssignment_0 ) ) ;
    public final void rule__CharacteristicSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2244:1: ( ( ( rule__CharacteristicSet__NameAssignment_0 ) ) )
            // InternalDSL.g:2245:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            {
            // InternalDSL.g:2245:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            // InternalDSL.g:2246:2: ( rule__CharacteristicSet__NameAssignment_0 )
            {
             before(grammarAccess.getCharacteristicSetAccess().getNameAssignment_0()); 
            // InternalDSL.g:2247:2: ( rule__CharacteristicSet__NameAssignment_0 )
            // InternalDSL.g:2247:3: rule__CharacteristicSet__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicSetAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__CharacteristicSet__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicSet__Group__1"
    // InternalDSL.g:2255:1: rule__CharacteristicSet__Group__1 : rule__CharacteristicSet__Group__1__Impl ;
    public final void rule__CharacteristicSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2259:1: ( rule__CharacteristicSet__Group__1__Impl )
            // InternalDSL.g:2260:2: rule__CharacteristicSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicSet__Group__1__Impl();

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
    // $ANTLR end "rule__CharacteristicSet__Group__1"


    // $ANTLR start "rule__CharacteristicSet__Group__1__Impl"
    // InternalDSL.g:2266:1: rule__CharacteristicSet__Group__1__Impl : ( '{}' ) ;
    public final void rule__CharacteristicSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2270:1: ( ( '{}' ) )
            // InternalDSL.g:2271:1: ( '{}' )
            {
            // InternalDSL.g:2271:1: ( '{}' )
            // InternalDSL.g:2272:2: '{}'
            {
             before(grammarAccess.getCharacteristicSetAccess().getLeftCurlyBracketRightCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSetAccess().getLeftCurlyBracketRightCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CharacteristicSet__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalDSL.g:2282:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2286:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalDSL.g:2287:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDSL.g:2294:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2298:1: ( ( 'import' ) )
            // InternalDSL.g:2299:1: ( 'import' )
            {
            // InternalDSL.g:2299:1: ( 'import' )
            // InternalDSL.g:2300:2: 'import'
            {
             before(grammarAccess.getIncludeAccess().getImportKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSL.g:2309:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2313:1: ( rule__Include__Group__1__Impl )
            // InternalDSL.g:2314:2: rule__Include__Group__1__Impl
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
    // InternalDSL.g:2320:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2324:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalDSL.g:2325:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalDSL.g:2325:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalDSL.g:2326:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalDSL.g:2327:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalDSL.g:2327:3: rule__Include__ImportURIAssignment_1
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
    // InternalDSL.g:2336:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2340:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:2341:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2348:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2352:1: ( ( 'constraint' ) )
            // InternalDSL.g:2353:1: ( 'constraint' )
            {
            // InternalDSL.g:2353:1: ( 'constraint' )
            // InternalDSL.g:2354:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDSL.g:2363:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2367:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:2368:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSL.g:2375:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2379:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:2380:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:2380:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:2381:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:2382:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:2382:3: rule__Constraint__NameAssignment_1
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
    // InternalDSL.g:2390:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2394:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:2395:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:2402:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2406:1: ( ( '{' ) )
            // InternalDSL.g:2407:1: ( '{' )
            {
            // InternalDSL.g:2407:1: ( '{' )
            // InternalDSL.g:2408:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:2417:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2421:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:2422:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:2429:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2433:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:2434:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:2434:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:2435:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:2436:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:2436:3: rule__Constraint__RuleAssignment_3
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
    // InternalDSL.g:2444:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2448:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:2449:2: rule__Constraint__Group__4__Impl
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
    // InternalDSL.g:2455:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2459:1: ( ( '}' ) )
            // InternalDSL.g:2460:1: ( '}' )
            {
            // InternalDSL.g:2460:1: ( '}' )
            // InternalDSL.g:2461:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDSL.g:2471:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2475:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:2476:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:2483:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2487:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:2488:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:2488:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:2489:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:2490:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:2490:3: rule__Rule__DataSelectorsAssignment_0
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
    // InternalDSL.g:2498:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2502:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:2503:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:2510:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2514:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:2515:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:2515:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:2516:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:2517:2: ( rule__Rule__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2517:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDSL.g:2525:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2529:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:2530:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:2537:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2541:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:2542:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:2542:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:2543:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:2544:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:2544:3: rule__Rule__StatementAssignment_2
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
    // InternalDSL.g:2552:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2556:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:2557:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:2564:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2568:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:2569:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:2569:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:2570:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:2571:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:2571:3: rule__Rule__DestinationSelectorsAssignment_3
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
    // InternalDSL.g:2579:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2583:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalDSL.g:2584:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

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
    // InternalDSL.g:2591:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2595:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:2596:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:2596:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:2597:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:2598:2: ( rule__Rule__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:2598:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "rule__Rule__Group__5"
    // InternalDSL.g:2606:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2610:1: ( rule__Rule__Group__5__Impl )
            // InternalDSL.g:2611:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5__Impl();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalDSL.g:2617:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ConditionAssignment_5 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2621:1: ( ( ( rule__Rule__ConditionAssignment_5 )? ) )
            // InternalDSL.g:2622:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            {
            // InternalDSL.g:2622:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            // InternalDSL.g:2623:2: ( rule__Rule__ConditionAssignment_5 )?
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_5()); 
            // InternalDSL.g:2624:2: ( rule__Rule__ConditionAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:2624:3: rule__Rule__ConditionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__ConditionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_5()); 

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // InternalDSL.g:2633:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2637:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:2638:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:2645:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2649:1: ( ( '&' ) )
            // InternalDSL.g:2650:1: ( '&' )
            {
            // InternalDSL.g:2650:1: ( '&' )
            // InternalDSL.g:2651:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:2660:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2664:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:2665:2: rule__Rule__Group_1__1__Impl
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
    // InternalDSL.g:2671:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2675:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:2676:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:2676:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:2677:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:2678:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:2678:3: rule__Rule__DataSelectorsAssignment_1_1
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
    // InternalDSL.g:2687:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2691:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:2692:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:2699:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2703:1: ( ( '&' ) )
            // InternalDSL.g:2704:1: ( '&' )
            {
            // InternalDSL.g:2704:1: ( '&' )
            // InternalDSL.g:2705:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:2714:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2718:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:2719:2: rule__Rule__Group_4__1__Impl
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
    // InternalDSL.g:2725:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2729:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:2730:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:2730:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:2731:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:2732:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:2732:3: rule__Rule__DestinationSelectorsAssignment_4_1
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
    // InternalDSL.g:2741:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2745:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:2746:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2753:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2757:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:2758:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:2758:1: ( 'data.attribute.' )
            // InternalDSL.g:2759:2: 'data.attribute.'
            {
             before(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:2768:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2772:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:2773:2: rule__AttributeSelector__Group__1__Impl
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
    // InternalDSL.g:2779:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2783:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2784:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2784:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:2785:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2786:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:2786:3: rule__AttributeSelector__RefAssignment_1
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
    // InternalDSL.g:2795:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2799:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:2800:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2807:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2811:1: ( ( 'data.class.' ) )
            // InternalDSL.g:2812:1: ( 'data.class.' )
            {
            // InternalDSL.g:2812:1: ( 'data.class.' )
            // InternalDSL.g:2813:2: 'data.class.'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:2822:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2826:1: ( rule__AttributeClassSelector__Group__1__Impl )
            // InternalDSL.g:2827:2: rule__AttributeClassSelector__Group__1__Impl
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
    // InternalDSL.g:2833:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2837:1: ( ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2838:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2838:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:2839:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2840:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            // InternalDSL.g:2840:3: rule__AttributeClassSelector__RefAssignment_1
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
    // InternalDSL.g:2849:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2853:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:2854:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2861:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2865:1: ( ( 'node.property.' ) )
            // InternalDSL.g:2866:1: ( 'node.property.' )
            {
            // InternalDSL.g:2866:1: ( 'node.property.' )
            // InternalDSL.g:2867:2: 'node.property.'
            {
             before(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2876:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2880:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:2881:2: rule__PropertySelector__Group__1__Impl
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
    // InternalDSL.g:2887:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2891:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2892:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2892:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:2893:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2894:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:2894:3: rule__PropertySelector__RefAssignment_1
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
    // InternalDSL.g:2903:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2907:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:2908:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:2915:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2919:1: ( ( 'node.class.' ) )
            // InternalDSL.g:2920:1: ( 'node.class.' )
            {
            // InternalDSL.g:2920:1: ( 'node.class.' )
            // InternalDSL.g:2921:2: 'node.class.'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:2930:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2934:1: ( rule__PropertyClassSelector__Group__1__Impl )
            // InternalDSL.g:2935:2: rule__PropertyClassSelector__Group__1__Impl
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
    // InternalDSL.g:2941:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2945:1: ( ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:2946:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:2946:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:2947:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:2948:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            // InternalDSL.g:2948:3: rule__PropertyClassSelector__RefAssignment_1
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


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__0"
    // InternalDSL.g:2957:1: rule__NodeIdentitiySelector__Group_0__0 : rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 ;
    public final void rule__NodeIdentitiySelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2961:1: ( rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 )
            // InternalDSL.g:2962:2: rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__NodeIdentitiySelector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_0__1();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__0"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__0__Impl"
    // InternalDSL.g:2969:1: rule__NodeIdentitiySelector__Group_0__0__Impl : ( 'node.name.' ) ;
    public final void rule__NodeIdentitiySelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2973:1: ( ( 'node.name.' ) )
            // InternalDSL.g:2974:1: ( 'node.name.' )
            {
            // InternalDSL.g:2974:1: ( 'node.name.' )
            // InternalDSL.g:2975:2: 'node.name.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__0__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__1"
    // InternalDSL.g:2984:1: rule__NodeIdentitiySelector__Group_0__1 : rule__NodeIdentitiySelector__Group_0__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2988:1: ( rule__NodeIdentitiySelector__Group_0__1__Impl )
            // InternalDSL.g:2989:2: rule__NodeIdentitiySelector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_0__1__Impl();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__1"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_0__1__Impl"
    // InternalDSL.g:2995:1: rule__NodeIdentitiySelector__Group_0__1__Impl : ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2999:1: ( ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) )
            // InternalDSL.g:3000:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            {
            // InternalDSL.g:3000:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            // InternalDSL.g:3001:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNameAssignment_0_1()); 
            // InternalDSL.g:3002:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            // InternalDSL.g:3002:3: rule__NodeIdentitiySelector__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_0__1__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__0"
    // InternalDSL.g:3011:1: rule__NodeIdentitiySelector__Group_1__0 : rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 ;
    public final void rule__NodeIdentitiySelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3015:1: ( rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 )
            // InternalDSL.g:3016:2: rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__NodeIdentitiySelector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__1();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__0"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__0__Impl"
    // InternalDSL.g:3023:1: rule__NodeIdentitiySelector__Group_1__0__Impl : ( 'node.identity.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3027:1: ( ( 'node.identity.' ) )
            // InternalDSL.g:3028:1: ( 'node.identity.' )
            {
            // InternalDSL.g:3028:1: ( 'node.identity.' )
            // InternalDSL.g:3029:2: 'node.identity.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__0__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__1"
    // InternalDSL.g:3038:1: rule__NodeIdentitiySelector__Group_1__1 : rule__NodeIdentitiySelector__Group_1__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3042:1: ( rule__NodeIdentitiySelector__Group_1__1__Impl )
            // InternalDSL.g:3043:2: rule__NodeIdentitiySelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1__1__Impl();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__1"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1__1__Impl"
    // InternalDSL.g:3049:1: rule__NodeIdentitiySelector__Group_1__1__Impl : ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3053:1: ( ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1 ) ) )
            // InternalDSL.g:3054:1: ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1 ) )
            {
            // InternalDSL.g:3054:1: ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1 ) )
            // InternalDSL.g:3055:2: ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeAssignment_1_1()); 
            // InternalDSL.g:3056:2: ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1 )
            // InternalDSL.g:3056:3: rule__NodeIdentitiySelector__DiaNodeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__DiaNodeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeAssignment_1_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalDSL.g:3065:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3069:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:3070:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:3077:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3081:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:3082:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:3082:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:3083:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:3084:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:3084:3: rule__Statement__ModalityAssignment_0
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
    // InternalDSL.g:3092:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3096:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:3097:2: rule__Statement__Group__1__Impl
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
    // InternalDSL.g:3103:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3107:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:3108:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:3108:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:3109:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:3110:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:3110:3: rule__Statement__TypeAssignment_1
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


    // $ANTLR start "rule__Condition__Group__0"
    // InternalDSL.g:3119:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3123:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalDSL.g:3124:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalDSL.g:3131:1: rule__Condition__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3135:1: ( ( 'WHERE' ) )
            // InternalDSL.g:3136:1: ( 'WHERE' )
            {
            // InternalDSL.g:3136:1: ( 'WHERE' )
            // InternalDSL.g:3137:2: 'WHERE'
            {
             before(grammarAccess.getConditionAccess().getWHEREKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getWHEREKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalDSL.g:3146:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3150:1: ( rule__Condition__Group__1__Impl )
            // InternalDSL.g:3151:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalDSL.g:3157:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperationAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3161:1: ( ( ( rule__Condition__OperationAssignment_1 ) ) )
            // InternalDSL.g:3162:1: ( ( rule__Condition__OperationAssignment_1 ) )
            {
            // InternalDSL.g:3162:1: ( ( rule__Condition__OperationAssignment_1 ) )
            // InternalDSL.g:3163:2: ( rule__Condition__OperationAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperationAssignment_1()); 
            // InternalDSL.g:3164:2: ( rule__Condition__OperationAssignment_1 )
            // InternalDSL.g:3164:3: rule__Condition__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperationAssignment_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group__0"
    // InternalDSL.g:3173:1: rule__LogicalOrOperation__Group__0 : rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1 ;
    public final void rule__LogicalOrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3177:1: ( rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1 )
            // InternalDSL.g:3178:2: rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__LogicalOrOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group__1();

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
    // $ANTLR end "rule__LogicalOrOperation__Group__0"


    // $ANTLR start "rule__LogicalOrOperation__Group__0__Impl"
    // InternalDSL.g:3185:1: rule__LogicalOrOperation__Group__0__Impl : ( ruleLogicalAndOperation ) ;
    public final void rule__LogicalOrOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3189:1: ( ( ruleLogicalAndOperation ) )
            // InternalDSL.g:3190:1: ( ruleLogicalAndOperation )
            {
            // InternalDSL.g:3190:1: ( ruleLogicalAndOperation )
            // InternalDSL.g:3191:2: ruleLogicalAndOperation
            {
             before(grammarAccess.getLogicalOrOperationAccess().getLogicalAndOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalAndOperation();

            state._fsp--;

             after(grammarAccess.getLogicalOrOperationAccess().getLogicalAndOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__LogicalOrOperation__Group__0__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group__1"
    // InternalDSL.g:3200:1: rule__LogicalOrOperation__Group__1 : rule__LogicalOrOperation__Group__1__Impl ;
    public final void rule__LogicalOrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3204:1: ( rule__LogicalOrOperation__Group__1__Impl )
            // InternalDSL.g:3205:2: rule__LogicalOrOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group__1__Impl();

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
    // $ANTLR end "rule__LogicalOrOperation__Group__1"


    // $ANTLR start "rule__LogicalOrOperation__Group__1__Impl"
    // InternalDSL.g:3211:1: rule__LogicalOrOperation__Group__1__Impl : ( ( rule__LogicalOrOperation__Group_1__0 )* ) ;
    public final void rule__LogicalOrOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3215:1: ( ( ( rule__LogicalOrOperation__Group_1__0 )* ) )
            // InternalDSL.g:3216:1: ( ( rule__LogicalOrOperation__Group_1__0 )* )
            {
            // InternalDSL.g:3216:1: ( ( rule__LogicalOrOperation__Group_1__0 )* )
            // InternalDSL.g:3217:2: ( rule__LogicalOrOperation__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrOperationAccess().getGroup_1()); 
            // InternalDSL.g:3218:2: ( rule__LogicalOrOperation__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDSL.g:3218:3: rule__LogicalOrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__LogicalOrOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getLogicalOrOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LogicalOrOperation__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__0"
    // InternalDSL.g:3227:1: rule__LogicalOrOperation__Group_1__0 : rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1 ;
    public final void rule__LogicalOrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3231:1: ( rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1 )
            // InternalDSL.g:3232:2: rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__LogicalOrOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group_1__1();

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
    // $ANTLR end "rule__LogicalOrOperation__Group_1__0"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__0__Impl"
    // InternalDSL.g:3239:1: rule__LogicalOrOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3243:1: ( ( () ) )
            // InternalDSL.g:3244:1: ( () )
            {
            // InternalDSL.g:3244:1: ( () )
            // InternalDSL.g:3245:2: ()
            {
             before(grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0()); 
            // InternalDSL.g:3246:2: ()
            // InternalDSL.g:3246:3: 
            {
            }

             after(grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrOperation__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__1"
    // InternalDSL.g:3254:1: rule__LogicalOrOperation__Group_1__1 : rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2 ;
    public final void rule__LogicalOrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3258:1: ( rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2 )
            // InternalDSL.g:3259:2: rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__LogicalOrOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group_1__2();

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
    // $ANTLR end "rule__LogicalOrOperation__Group_1__1"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__1__Impl"
    // InternalDSL.g:3266:1: rule__LogicalOrOperation__Group_1__1__Impl : ( '|' ) ;
    public final void rule__LogicalOrOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3270:1: ( ( '|' ) )
            // InternalDSL.g:3271:1: ( '|' )
            {
            // InternalDSL.g:3271:1: ( '|' )
            // InternalDSL.g:3272:2: '|'
            {
             before(grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__LogicalOrOperation__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__2"
    // InternalDSL.g:3281:1: rule__LogicalOrOperation__Group_1__2 : rule__LogicalOrOperation__Group_1__2__Impl ;
    public final void rule__LogicalOrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3285:1: ( rule__LogicalOrOperation__Group_1__2__Impl )
            // InternalDSL.g:3286:2: rule__LogicalOrOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__LogicalOrOperation__Group_1__2"


    // $ANTLR start "rule__LogicalOrOperation__Group_1__2__Impl"
    // InternalDSL.g:3292:1: rule__LogicalOrOperation__Group_1__2__Impl : ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalOrOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3296:1: ( ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) ) )
            // InternalDSL.g:3297:1: ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:3297:1: ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) )
            // InternalDSL.g:3298:2: ( rule__LogicalOrOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrOperationAccess().getRightAssignment_1_2()); 
            // InternalDSL.g:3299:2: ( rule__LogicalOrOperation__RightAssignment_1_2 )
            // InternalDSL.g:3299:3: rule__LogicalOrOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOrOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrOperationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__LogicalOrOperation__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__0"
    // InternalDSL.g:3308:1: rule__LogicalAndOperation__Group__0 : rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 ;
    public final void rule__LogicalAndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3312:1: ( rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 )
            // InternalDSL.g:3313:2: rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__LogicalAndOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__1();

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
    // $ANTLR end "rule__LogicalAndOperation__Group__0"


    // $ANTLR start "rule__LogicalAndOperation__Group__0__Impl"
    // InternalDSL.g:3320:1: rule__LogicalAndOperation__Group__0__Impl : ( ruleLogicalNegationOperation ) ;
    public final void rule__LogicalAndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3324:1: ( ( ruleLogicalNegationOperation ) )
            // InternalDSL.g:3325:1: ( ruleLogicalNegationOperation )
            {
            // InternalDSL.g:3325:1: ( ruleLogicalNegationOperation )
            // InternalDSL.g:3326:2: ruleLogicalNegationOperation
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLogicalNegationOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalNegationOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationAccess().getLogicalNegationOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__LogicalAndOperation__Group__0__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group__1"
    // InternalDSL.g:3335:1: rule__LogicalAndOperation__Group__1 : rule__LogicalAndOperation__Group__1__Impl ;
    public final void rule__LogicalAndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3339:1: ( rule__LogicalAndOperation__Group__1__Impl )
            // InternalDSL.g:3340:2: rule__LogicalAndOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group__1__Impl();

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
    // $ANTLR end "rule__LogicalAndOperation__Group__1"


    // $ANTLR start "rule__LogicalAndOperation__Group__1__Impl"
    // InternalDSL.g:3346:1: rule__LogicalAndOperation__Group__1__Impl : ( ( rule__LogicalAndOperation__Group_1__0 )* ) ;
    public final void rule__LogicalAndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3350:1: ( ( ( rule__LogicalAndOperation__Group_1__0 )* ) )
            // InternalDSL.g:3351:1: ( ( rule__LogicalAndOperation__Group_1__0 )* )
            {
            // InternalDSL.g:3351:1: ( ( rule__LogicalAndOperation__Group_1__0 )* )
            // InternalDSL.g:3352:2: ( rule__LogicalAndOperation__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndOperationAccess().getGroup_1()); 
            // InternalDSL.g:3353:2: ( rule__LogicalAndOperation__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:3353:3: rule__LogicalAndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__LogicalAndOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getLogicalAndOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LogicalAndOperation__Group__1__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__0"
    // InternalDSL.g:3362:1: rule__LogicalAndOperation__Group_1__0 : rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1 ;
    public final void rule__LogicalAndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3366:1: ( rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1 )
            // InternalDSL.g:3367:2: rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__LogicalAndOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group_1__1();

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
    // $ANTLR end "rule__LogicalAndOperation__Group_1__0"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__0__Impl"
    // InternalDSL.g:3374:1: rule__LogicalAndOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3378:1: ( ( () ) )
            // InternalDSL.g:3379:1: ( () )
            {
            // InternalDSL.g:3379:1: ( () )
            // InternalDSL.g:3380:2: ()
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0()); 
            // InternalDSL.g:3381:2: ()
            // InternalDSL.g:3381:3: 
            {
            }

             after(grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndOperation__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__1"
    // InternalDSL.g:3389:1: rule__LogicalAndOperation__Group_1__1 : rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2 ;
    public final void rule__LogicalAndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3393:1: ( rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2 )
            // InternalDSL.g:3394:2: rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__LogicalAndOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group_1__2();

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
    // $ANTLR end "rule__LogicalAndOperation__Group_1__1"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__1__Impl"
    // InternalDSL.g:3401:1: rule__LogicalAndOperation__Group_1__1__Impl : ( '&' ) ;
    public final void rule__LogicalAndOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3405:1: ( ( '&' ) )
            // InternalDSL.g:3406:1: ( '&' )
            {
            // InternalDSL.g:3406:1: ( '&' )
            // InternalDSL.g:3407:2: '&'
            {
             before(grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__LogicalAndOperation__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__2"
    // InternalDSL.g:3416:1: rule__LogicalAndOperation__Group_1__2 : rule__LogicalAndOperation__Group_1__2__Impl ;
    public final void rule__LogicalAndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3420:1: ( rule__LogicalAndOperation__Group_1__2__Impl )
            // InternalDSL.g:3421:2: rule__LogicalAndOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__LogicalAndOperation__Group_1__2"


    // $ANTLR start "rule__LogicalAndOperation__Group_1__2__Impl"
    // InternalDSL.g:3427:1: rule__LogicalAndOperation__Group_1__2__Impl : ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalAndOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3431:1: ( ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) ) )
            // InternalDSL.g:3432:1: ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:3432:1: ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) )
            // InternalDSL.g:3433:2: ( rule__LogicalAndOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightAssignment_1_2()); 
            // InternalDSL.g:3434:2: ( rule__LogicalAndOperation__RightAssignment_1_2 )
            // InternalDSL.g:3434:3: rule__LogicalAndOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAndOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndOperationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__LogicalAndOperation__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__0"
    // InternalDSL.g:3443:1: rule__LogicalNegationOperation__Group_1__0 : rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1 ;
    public final void rule__LogicalNegationOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3447:1: ( rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1 )
            // InternalDSL.g:3448:2: rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__LogicalNegationOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group_1__1();

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
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__0"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__0__Impl"
    // InternalDSL.g:3455:1: rule__LogicalNegationOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalNegationOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3459:1: ( ( () ) )
            // InternalDSL.g:3460:1: ( () )
            {
            // InternalDSL.g:3460:1: ( () )
            // InternalDSL.g:3461:2: ()
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getLogicalNegationOperationAction_1_0()); 
            // InternalDSL.g:3462:2: ()
            // InternalDSL.g:3462:3: 
            {
            }

             after(grammarAccess.getLogicalNegationOperationAccess().getLogicalNegationOperationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__1"
    // InternalDSL.g:3470:1: rule__LogicalNegationOperation__Group_1__1 : rule__LogicalNegationOperation__Group_1__1__Impl rule__LogicalNegationOperation__Group_1__2 ;
    public final void rule__LogicalNegationOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3474:1: ( rule__LogicalNegationOperation__Group_1__1__Impl rule__LogicalNegationOperation__Group_1__2 )
            // InternalDSL.g:3475:2: rule__LogicalNegationOperation__Group_1__1__Impl rule__LogicalNegationOperation__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__LogicalNegationOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group_1__2();

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
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__1"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__1__Impl"
    // InternalDSL.g:3482:1: rule__LogicalNegationOperation__Group_1__1__Impl : ( '!' ) ;
    public final void rule__LogicalNegationOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3486:1: ( ( '!' ) )
            // InternalDSL.g:3487:1: ( '!' )
            {
            // InternalDSL.g:3487:1: ( '!' )
            // InternalDSL.g:3488:2: '!'
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_1()); 

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
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__2"
    // InternalDSL.g:3497:1: rule__LogicalNegationOperation__Group_1__2 : rule__LogicalNegationOperation__Group_1__2__Impl ;
    public final void rule__LogicalNegationOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3501:1: ( rule__LogicalNegationOperation__Group_1__2__Impl )
            // InternalDSL.g:3502:2: rule__LogicalNegationOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__2"


    // $ANTLR start "rule__LogicalNegationOperation__Group_1__2__Impl"
    // InternalDSL.g:3508:1: rule__LogicalNegationOperation__Group_1__2__Impl : ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) ) ;
    public final void rule__LogicalNegationOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3512:1: ( ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) ) )
            // InternalDSL.g:3513:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) )
            {
            // InternalDSL.g:3513:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) )
            // InternalDSL.g:3514:2: ( rule__LogicalNegationOperation__ValueAssignment_1_2 )
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getValueAssignment_1_2()); 
            // InternalDSL.g:3515:2: ( rule__LogicalNegationOperation__ValueAssignment_1_2 )
            // InternalDSL.g:3515:3: rule__LogicalNegationOperation__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalNegationOperation__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalNegationOperationAccess().getValueAssignment_1_2()); 

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
    // $ANTLR end "rule__LogicalNegationOperation__Group_1__2__Impl"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__0"
    // InternalDSL.g:3524:1: rule__EncapsulatedLogicalOperation__Group_1__0 : rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1 ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3528:1: ( rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1 )
            // InternalDSL.g:3529:2: rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__EncapsulatedLogicalOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Group_1__1();

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__0"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__0__Impl"
    // InternalDSL.g:3536:1: rule__EncapsulatedLogicalOperation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3540:1: ( ( '(' ) )
            // InternalDSL.g:3541:1: ( '(' )
            {
            // InternalDSL.g:3541:1: ( '(' )
            // InternalDSL.g:3542:2: '('
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__0__Impl"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__1"
    // InternalDSL.g:3551:1: rule__EncapsulatedLogicalOperation__Group_1__1 : rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2 ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3555:1: ( rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2 )
            // InternalDSL.g:3556:2: rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__EncapsulatedLogicalOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Group_1__2();

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__1"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__1__Impl"
    // InternalDSL.g:3563:1: rule__EncapsulatedLogicalOperation__Group_1__1__Impl : ( ruleLogicalOrOperation ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3567:1: ( ( ruleLogicalOrOperation ) )
            // InternalDSL.g:3568:1: ( ruleLogicalOrOperation )
            {
            // InternalDSL.g:3568:1: ( ruleLogicalOrOperation )
            // InternalDSL.g:3569:2: ruleLogicalOrOperation
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getLogicalOrOperationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOrOperation();

            state._fsp--;

             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getLogicalOrOperationParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__1__Impl"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__2"
    // InternalDSL.g:3578:1: rule__EncapsulatedLogicalOperation__Group_1__2 : rule__EncapsulatedLogicalOperation__Group_1__2__Impl ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3582:1: ( rule__EncapsulatedLogicalOperation__Group_1__2__Impl )
            // InternalDSL.g:3583:2: rule__EncapsulatedLogicalOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EncapsulatedLogicalOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__2"


    // $ANTLR start "rule__EncapsulatedLogicalOperation__Group_1__2__Impl"
    // InternalDSL.g:3589:1: rule__EncapsulatedLogicalOperation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3593:1: ( ( ')' ) )
            // InternalDSL.g:3594:1: ( ')' )
            {
            // InternalDSL.g:3594:1: ( ')' )
            // InternalDSL.g:3595:2: ')'
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEncapsulatedLogicalOperationAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__EncapsulatedLogicalOperation__Group_1__2__Impl"


    // $ANTLR start "rule__VariableEqualityOperation__Group__0"
    // InternalDSL.g:3605:1: rule__VariableEqualityOperation__Group__0 : rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 ;
    public final void rule__VariableEqualityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3609:1: ( rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 )
            // InternalDSL.g:3610:2: rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__VariableEqualityOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__1();

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__0"


    // $ANTLR start "rule__VariableEqualityOperation__Group__0__Impl"
    // InternalDSL.g:3617:1: rule__VariableEqualityOperation__Group__0__Impl : ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableEqualityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3621:1: ( ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:3622:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:3622:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:3623:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:3624:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            // InternalDSL.g:3624:3: rule__VariableEqualityOperation__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableEqualityOperationAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__0__Impl"


    // $ANTLR start "rule__VariableEqualityOperation__Group__1"
    // InternalDSL.g:3632:1: rule__VariableEqualityOperation__Group__1 : rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 ;
    public final void rule__VariableEqualityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3636:1: ( rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 )
            // InternalDSL.g:3637:2: rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VariableEqualityOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__2();

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__1"


    // $ANTLR start "rule__VariableEqualityOperation__Group__1__Impl"
    // InternalDSL.g:3644:1: rule__VariableEqualityOperation__Group__1__Impl : ( '==' ) ;
    public final void rule__VariableEqualityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3648:1: ( ( '==' ) )
            // InternalDSL.g:3649:1: ( '==' )
            {
            // InternalDSL.g:3649:1: ( '==' )
            // InternalDSL.g:3650:2: '=='
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__1__Impl"


    // $ANTLR start "rule__VariableEqualityOperation__Group__2"
    // InternalDSL.g:3659:1: rule__VariableEqualityOperation__Group__2 : rule__VariableEqualityOperation__Group__2__Impl ;
    public final void rule__VariableEqualityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3663:1: ( rule__VariableEqualityOperation__Group__2__Impl )
            // InternalDSL.g:3664:2: rule__VariableEqualityOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__Group__2__Impl();

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__2"


    // $ANTLR start "rule__VariableEqualityOperation__Group__2__Impl"
    // InternalDSL.g:3670:1: rule__VariableEqualityOperation__Group__2__Impl : ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableEqualityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3674:1: ( ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:3675:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:3675:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            // InternalDSL.g:3676:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:3677:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            // InternalDSL.g:3677:3: rule__VariableEqualityOperation__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableEqualityOperation__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableEqualityOperationAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__VariableEqualityOperation__Group__2__Impl"


    // $ANTLR start "rule__VariableInequalityOperation__Group__0"
    // InternalDSL.g:3686:1: rule__VariableInequalityOperation__Group__0 : rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 ;
    public final void rule__VariableInequalityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3690:1: ( rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 )
            // InternalDSL.g:3691:2: rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__VariableInequalityOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__1();

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__0"


    // $ANTLR start "rule__VariableInequalityOperation__Group__0__Impl"
    // InternalDSL.g:3698:1: rule__VariableInequalityOperation__Group__0__Impl : ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableInequalityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3702:1: ( ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:3703:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:3703:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:3704:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:3705:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            // InternalDSL.g:3705:3: rule__VariableInequalityOperation__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableInequalityOperationAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__0__Impl"


    // $ANTLR start "rule__VariableInequalityOperation__Group__1"
    // InternalDSL.g:3713:1: rule__VariableInequalityOperation__Group__1 : rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 ;
    public final void rule__VariableInequalityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3717:1: ( rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 )
            // InternalDSL.g:3718:2: rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VariableInequalityOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__2();

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__1"


    // $ANTLR start "rule__VariableInequalityOperation__Group__1__Impl"
    // InternalDSL.g:3725:1: rule__VariableInequalityOperation__Group__1__Impl : ( '!=' ) ;
    public final void rule__VariableInequalityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3729:1: ( ( '!=' ) )
            // InternalDSL.g:3730:1: ( '!=' )
            {
            // InternalDSL.g:3730:1: ( '!=' )
            // InternalDSL.g:3731:2: '!='
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__1__Impl"


    // $ANTLR start "rule__VariableInequalityOperation__Group__2"
    // InternalDSL.g:3740:1: rule__VariableInequalityOperation__Group__2 : rule__VariableInequalityOperation__Group__2__Impl ;
    public final void rule__VariableInequalityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3744:1: ( rule__VariableInequalityOperation__Group__2__Impl )
            // InternalDSL.g:3745:2: rule__VariableInequalityOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__Group__2__Impl();

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__2"


    // $ANTLR start "rule__VariableInequalityOperation__Group__2__Impl"
    // InternalDSL.g:3751:1: rule__VariableInequalityOperation__Group__2__Impl : ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableInequalityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3755:1: ( ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:3756:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:3756:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            // InternalDSL.g:3757:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:3758:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            // InternalDSL.g:3758:3: rule__VariableInequalityOperation__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableInequalityOperation__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableInequalityOperationAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__VariableInequalityOperation__Group__2__Impl"


    // $ANTLR start "rule__EmptySetOperation__Group__0"
    // InternalDSL.g:3767:1: rule__EmptySetOperation__Group__0 : rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 ;
    public final void rule__EmptySetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3771:1: ( rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 )
            // InternalDSL.g:3772:2: rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EmptySetOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__1();

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
    // $ANTLR end "rule__EmptySetOperation__Group__0"


    // $ANTLR start "rule__EmptySetOperation__Group__0__Impl"
    // InternalDSL.g:3779:1: rule__EmptySetOperation__Group__0__Impl : ( 'isEmpty' ) ;
    public final void rule__EmptySetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3783:1: ( ( 'isEmpty' ) )
            // InternalDSL.g:3784:1: ( 'isEmpty' )
            {
            // InternalDSL.g:3784:1: ( 'isEmpty' )
            // InternalDSL.g:3785:2: 'isEmpty'
            {
             before(grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0()); 

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
    // $ANTLR end "rule__EmptySetOperation__Group__0__Impl"


    // $ANTLR start "rule__EmptySetOperation__Group__1"
    // InternalDSL.g:3794:1: rule__EmptySetOperation__Group__1 : rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 ;
    public final void rule__EmptySetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3798:1: ( rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 )
            // InternalDSL.g:3799:2: rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__EmptySetOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__2();

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
    // $ANTLR end "rule__EmptySetOperation__Group__1"


    // $ANTLR start "rule__EmptySetOperation__Group__1__Impl"
    // InternalDSL.g:3806:1: rule__EmptySetOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EmptySetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3810:1: ( ( '(' ) )
            // InternalDSL.g:3811:1: ( '(' )
            {
            // InternalDSL.g:3811:1: ( '(' )
            // InternalDSL.g:3812:2: '('
            {
             before(grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__EmptySetOperation__Group__1__Impl"


    // $ANTLR start "rule__EmptySetOperation__Group__2"
    // InternalDSL.g:3821:1: rule__EmptySetOperation__Group__2 : rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3 ;
    public final void rule__EmptySetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3825:1: ( rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3 )
            // InternalDSL.g:3826:2: rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__EmptySetOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__3();

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
    // $ANTLR end "rule__EmptySetOperation__Group__2"


    // $ANTLR start "rule__EmptySetOperation__Group__2__Impl"
    // InternalDSL.g:3833:1: rule__EmptySetOperation__Group__2__Impl : ( ( rule__EmptySetOperation__ValueAssignment_2 ) ) ;
    public final void rule__EmptySetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3837:1: ( ( ( rule__EmptySetOperation__ValueAssignment_2 ) ) )
            // InternalDSL.g:3838:1: ( ( rule__EmptySetOperation__ValueAssignment_2 ) )
            {
            // InternalDSL.g:3838:1: ( ( rule__EmptySetOperation__ValueAssignment_2 ) )
            // InternalDSL.g:3839:2: ( rule__EmptySetOperation__ValueAssignment_2 )
            {
             before(grammarAccess.getEmptySetOperationAccess().getValueAssignment_2()); 
            // InternalDSL.g:3840:2: ( rule__EmptySetOperation__ValueAssignment_2 )
            // InternalDSL.g:3840:3: rule__EmptySetOperation__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmptySetOperationAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__EmptySetOperation__Group__2__Impl"


    // $ANTLR start "rule__EmptySetOperation__Group__3"
    // InternalDSL.g:3848:1: rule__EmptySetOperation__Group__3 : rule__EmptySetOperation__Group__3__Impl ;
    public final void rule__EmptySetOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3852:1: ( rule__EmptySetOperation__Group__3__Impl )
            // InternalDSL.g:3853:2: rule__EmptySetOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptySetOperation__Group__3__Impl();

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
    // $ANTLR end "rule__EmptySetOperation__Group__3"


    // $ANTLR start "rule__EmptySetOperation__Group__3__Impl"
    // InternalDSL.g:3859:1: rule__EmptySetOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__EmptySetOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3863:1: ( ( ')' ) )
            // InternalDSL.g:3864:1: ( ')' )
            {
            // InternalDSL.g:3864:1: ( ')' )
            // InternalDSL.g:3865:2: ')'
            {
             before(grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__EmptySetOperation__Group__3__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__0"
    // InternalDSL.g:3875:1: rule__IntersectionOperation__Group__0 : rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 ;
    public final void rule__IntersectionOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3879:1: ( rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 )
            // InternalDSL.g:3880:2: rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__IntersectionOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__1();

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
    // $ANTLR end "rule__IntersectionOperation__Group__0"


    // $ANTLR start "rule__IntersectionOperation__Group__0__Impl"
    // InternalDSL.g:3887:1: rule__IntersectionOperation__Group__0__Impl : ( 'intersection' ) ;
    public final void rule__IntersectionOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3891:1: ( ( 'intersection' ) )
            // InternalDSL.g:3892:1: ( 'intersection' )
            {
            // InternalDSL.g:3892:1: ( 'intersection' )
            // InternalDSL.g:3893:2: 'intersection'
            {
             before(grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0()); 

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
    // $ANTLR end "rule__IntersectionOperation__Group__0__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__1"
    // InternalDSL.g:3902:1: rule__IntersectionOperation__Group__1 : rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 ;
    public final void rule__IntersectionOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3906:1: ( rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 )
            // InternalDSL.g:3907:2: rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__IntersectionOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__2();

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
    // $ANTLR end "rule__IntersectionOperation__Group__1"


    // $ANTLR start "rule__IntersectionOperation__Group__1__Impl"
    // InternalDSL.g:3914:1: rule__IntersectionOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__IntersectionOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3918:1: ( ( '(' ) )
            // InternalDSL.g:3919:1: ( '(' )
            {
            // InternalDSL.g:3919:1: ( '(' )
            // InternalDSL.g:3920:2: '('
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IntersectionOperation__Group__1__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__2"
    // InternalDSL.g:3929:1: rule__IntersectionOperation__Group__2 : rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 ;
    public final void rule__IntersectionOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3933:1: ( rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 )
            // InternalDSL.g:3934:2: rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__IntersectionOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__3();

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
    // $ANTLR end "rule__IntersectionOperation__Group__2"


    // $ANTLR start "rule__IntersectionOperation__Group__2__Impl"
    // InternalDSL.g:3941:1: rule__IntersectionOperation__Group__2__Impl : ( ( rule__IntersectionOperation__LeftAssignment_2 ) ) ;
    public final void rule__IntersectionOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3945:1: ( ( ( rule__IntersectionOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:3946:1: ( ( rule__IntersectionOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:3946:1: ( ( rule__IntersectionOperation__LeftAssignment_2 ) )
            // InternalDSL.g:3947:2: ( rule__IntersectionOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:3948:2: ( rule__IntersectionOperation__LeftAssignment_2 )
            // InternalDSL.g:3948:3: rule__IntersectionOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getLeftAssignment_2()); 

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
    // $ANTLR end "rule__IntersectionOperation__Group__2__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__3"
    // InternalDSL.g:3956:1: rule__IntersectionOperation__Group__3 : rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 ;
    public final void rule__IntersectionOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3960:1: ( rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 )
            // InternalDSL.g:3961:2: rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__IntersectionOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__4();

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
    // $ANTLR end "rule__IntersectionOperation__Group__3"


    // $ANTLR start "rule__IntersectionOperation__Group__3__Impl"
    // InternalDSL.g:3968:1: rule__IntersectionOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__IntersectionOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3972:1: ( ( ',' ) )
            // InternalDSL.g:3973:1: ( ',' )
            {
            // InternalDSL.g:3973:1: ( ',' )
            // InternalDSL.g:3974:2: ','
            {
             before(grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__IntersectionOperation__Group__3__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__4"
    // InternalDSL.g:3983:1: rule__IntersectionOperation__Group__4 : rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5 ;
    public final void rule__IntersectionOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3987:1: ( rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5 )
            // InternalDSL.g:3988:2: rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__IntersectionOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__5();

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
    // $ANTLR end "rule__IntersectionOperation__Group__4"


    // $ANTLR start "rule__IntersectionOperation__Group__4__Impl"
    // InternalDSL.g:3995:1: rule__IntersectionOperation__Group__4__Impl : ( ( rule__IntersectionOperation__RightAssignment_4 ) ) ;
    public final void rule__IntersectionOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3999:1: ( ( ( rule__IntersectionOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4000:1: ( ( rule__IntersectionOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4000:1: ( ( rule__IntersectionOperation__RightAssignment_4 ) )
            // InternalDSL.g:4001:2: ( rule__IntersectionOperation__RightAssignment_4 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4002:2: ( rule__IntersectionOperation__RightAssignment_4 )
            // InternalDSL.g:4002:3: rule__IntersectionOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOperationAccess().getRightAssignment_4()); 

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
    // $ANTLR end "rule__IntersectionOperation__Group__4__Impl"


    // $ANTLR start "rule__IntersectionOperation__Group__5"
    // InternalDSL.g:4010:1: rule__IntersectionOperation__Group__5 : rule__IntersectionOperation__Group__5__Impl ;
    public final void rule__IntersectionOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4014:1: ( rule__IntersectionOperation__Group__5__Impl )
            // InternalDSL.g:4015:2: rule__IntersectionOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionOperation__Group__5__Impl();

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
    // $ANTLR end "rule__IntersectionOperation__Group__5"


    // $ANTLR start "rule__IntersectionOperation__Group__5__Impl"
    // InternalDSL.g:4021:1: rule__IntersectionOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__IntersectionOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4025:1: ( ( ')' ) )
            // InternalDSL.g:4026:1: ( ')' )
            {
            // InternalDSL.g:4026:1: ( ')' )
            // InternalDSL.g:4027:2: ')'
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__IntersectionOperation__Group__5__Impl"


    // $ANTLR start "rule__UnionOperation__Group__0"
    // InternalDSL.g:4037:1: rule__UnionOperation__Group__0 : rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1 ;
    public final void rule__UnionOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4041:1: ( rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1 )
            // InternalDSL.g:4042:2: rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__UnionOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__1();

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
    // $ANTLR end "rule__UnionOperation__Group__0"


    // $ANTLR start "rule__UnionOperation__Group__0__Impl"
    // InternalDSL.g:4049:1: rule__UnionOperation__Group__0__Impl : ( 'union' ) ;
    public final void rule__UnionOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4053:1: ( ( 'union' ) )
            // InternalDSL.g:4054:1: ( 'union' )
            {
            // InternalDSL.g:4054:1: ( 'union' )
            // InternalDSL.g:4055:2: 'union'
            {
             before(grammarAccess.getUnionOperationAccess().getUnionKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getUnionKeyword_0()); 

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
    // $ANTLR end "rule__UnionOperation__Group__0__Impl"


    // $ANTLR start "rule__UnionOperation__Group__1"
    // InternalDSL.g:4064:1: rule__UnionOperation__Group__1 : rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2 ;
    public final void rule__UnionOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4068:1: ( rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2 )
            // InternalDSL.g:4069:2: rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__UnionOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__2();

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
    // $ANTLR end "rule__UnionOperation__Group__1"


    // $ANTLR start "rule__UnionOperation__Group__1__Impl"
    // InternalDSL.g:4076:1: rule__UnionOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__UnionOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4080:1: ( ( '(' ) )
            // InternalDSL.g:4081:1: ( '(' )
            {
            // InternalDSL.g:4081:1: ( '(' )
            // InternalDSL.g:4082:2: '('
            {
             before(grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__UnionOperation__Group__1__Impl"


    // $ANTLR start "rule__UnionOperation__Group__2"
    // InternalDSL.g:4091:1: rule__UnionOperation__Group__2 : rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3 ;
    public final void rule__UnionOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4095:1: ( rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3 )
            // InternalDSL.g:4096:2: rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__UnionOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__3();

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
    // $ANTLR end "rule__UnionOperation__Group__2"


    // $ANTLR start "rule__UnionOperation__Group__2__Impl"
    // InternalDSL.g:4103:1: rule__UnionOperation__Group__2__Impl : ( ( rule__UnionOperation__LeftAssignment_2 ) ) ;
    public final void rule__UnionOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4107:1: ( ( ( rule__UnionOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4108:1: ( ( rule__UnionOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4108:1: ( ( rule__UnionOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4109:2: ( rule__UnionOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getUnionOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4110:2: ( rule__UnionOperation__LeftAssignment_2 )
            // InternalDSL.g:4110:3: rule__UnionOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnionOperationAccess().getLeftAssignment_2()); 

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
    // $ANTLR end "rule__UnionOperation__Group__2__Impl"


    // $ANTLR start "rule__UnionOperation__Group__3"
    // InternalDSL.g:4118:1: rule__UnionOperation__Group__3 : rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4 ;
    public final void rule__UnionOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4122:1: ( rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4 )
            // InternalDSL.g:4123:2: rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__UnionOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__4();

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
    // $ANTLR end "rule__UnionOperation__Group__3"


    // $ANTLR start "rule__UnionOperation__Group__3__Impl"
    // InternalDSL.g:4130:1: rule__UnionOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__UnionOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4134:1: ( ( ',' ) )
            // InternalDSL.g:4135:1: ( ',' )
            {
            // InternalDSL.g:4135:1: ( ',' )
            // InternalDSL.g:4136:2: ','
            {
             before(grammarAccess.getUnionOperationAccess().getCommaKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__UnionOperation__Group__3__Impl"


    // $ANTLR start "rule__UnionOperation__Group__4"
    // InternalDSL.g:4145:1: rule__UnionOperation__Group__4 : rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5 ;
    public final void rule__UnionOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4149:1: ( rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5 )
            // InternalDSL.g:4150:2: rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__UnionOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__5();

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
    // $ANTLR end "rule__UnionOperation__Group__4"


    // $ANTLR start "rule__UnionOperation__Group__4__Impl"
    // InternalDSL.g:4157:1: rule__UnionOperation__Group__4__Impl : ( ( rule__UnionOperation__RightAssignment_4 ) ) ;
    public final void rule__UnionOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4161:1: ( ( ( rule__UnionOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4162:1: ( ( rule__UnionOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4162:1: ( ( rule__UnionOperation__RightAssignment_4 ) )
            // InternalDSL.g:4163:2: ( rule__UnionOperation__RightAssignment_4 )
            {
             before(grammarAccess.getUnionOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4164:2: ( rule__UnionOperation__RightAssignment_4 )
            // InternalDSL.g:4164:3: rule__UnionOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUnionOperationAccess().getRightAssignment_4()); 

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
    // $ANTLR end "rule__UnionOperation__Group__4__Impl"


    // $ANTLR start "rule__UnionOperation__Group__5"
    // InternalDSL.g:4172:1: rule__UnionOperation__Group__5 : rule__UnionOperation__Group__5__Impl ;
    public final void rule__UnionOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4176:1: ( rule__UnionOperation__Group__5__Impl )
            // InternalDSL.g:4177:2: rule__UnionOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionOperation__Group__5__Impl();

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
    // $ANTLR end "rule__UnionOperation__Group__5"


    // $ANTLR start "rule__UnionOperation__Group__5__Impl"
    // InternalDSL.g:4183:1: rule__UnionOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__UnionOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4187:1: ( ( ')' ) )
            // InternalDSL.g:4188:1: ( ')' )
            {
            // InternalDSL.g:4188:1: ( ')' )
            // InternalDSL.g:4189:2: ')'
            {
             before(grammarAccess.getUnionOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUnionOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__UnionOperation__Group__5__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__0"
    // InternalDSL.g:4199:1: rule__SubtractOperation__Group__0 : rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1 ;
    public final void rule__SubtractOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4203:1: ( rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1 )
            // InternalDSL.g:4204:2: rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__SubtractOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__1();

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
    // $ANTLR end "rule__SubtractOperation__Group__0"


    // $ANTLR start "rule__SubtractOperation__Group__0__Impl"
    // InternalDSL.g:4211:1: rule__SubtractOperation__Group__0__Impl : ( 'subtract' ) ;
    public final void rule__SubtractOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4215:1: ( ( 'subtract' ) )
            // InternalDSL.g:4216:1: ( 'subtract' )
            {
            // InternalDSL.g:4216:1: ( 'subtract' )
            // InternalDSL.g:4217:2: 'subtract'
            {
             before(grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0()); 

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
    // $ANTLR end "rule__SubtractOperation__Group__0__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__1"
    // InternalDSL.g:4226:1: rule__SubtractOperation__Group__1 : rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2 ;
    public final void rule__SubtractOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4230:1: ( rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2 )
            // InternalDSL.g:4231:2: rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__SubtractOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__2();

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
    // $ANTLR end "rule__SubtractOperation__Group__1"


    // $ANTLR start "rule__SubtractOperation__Group__1__Impl"
    // InternalDSL.g:4238:1: rule__SubtractOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SubtractOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4242:1: ( ( '(' ) )
            // InternalDSL.g:4243:1: ( '(' )
            {
            // InternalDSL.g:4243:1: ( '(' )
            // InternalDSL.g:4244:2: '('
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SubtractOperation__Group__1__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__2"
    // InternalDSL.g:4253:1: rule__SubtractOperation__Group__2 : rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3 ;
    public final void rule__SubtractOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4257:1: ( rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3 )
            // InternalDSL.g:4258:2: rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__SubtractOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__3();

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
    // $ANTLR end "rule__SubtractOperation__Group__2"


    // $ANTLR start "rule__SubtractOperation__Group__2__Impl"
    // InternalDSL.g:4265:1: rule__SubtractOperation__Group__2__Impl : ( ( rule__SubtractOperation__LeftAssignment_2 ) ) ;
    public final void rule__SubtractOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4269:1: ( ( ( rule__SubtractOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4270:1: ( ( rule__SubtractOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4270:1: ( ( rule__SubtractOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4271:2: ( rule__SubtractOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4272:2: ( rule__SubtractOperation__LeftAssignment_2 )
            // InternalDSL.g:4272:3: rule__SubtractOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractOperationAccess().getLeftAssignment_2()); 

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
    // $ANTLR end "rule__SubtractOperation__Group__2__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__3"
    // InternalDSL.g:4280:1: rule__SubtractOperation__Group__3 : rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4 ;
    public final void rule__SubtractOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4284:1: ( rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4 )
            // InternalDSL.g:4285:2: rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__SubtractOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__4();

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
    // $ANTLR end "rule__SubtractOperation__Group__3"


    // $ANTLR start "rule__SubtractOperation__Group__3__Impl"
    // InternalDSL.g:4292:1: rule__SubtractOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SubtractOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4296:1: ( ( ',' ) )
            // InternalDSL.g:4297:1: ( ',' )
            {
            // InternalDSL.g:4297:1: ( ',' )
            // InternalDSL.g:4298:2: ','
            {
             before(grammarAccess.getSubtractOperationAccess().getCommaKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__SubtractOperation__Group__3__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__4"
    // InternalDSL.g:4307:1: rule__SubtractOperation__Group__4 : rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5 ;
    public final void rule__SubtractOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4311:1: ( rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5 )
            // InternalDSL.g:4312:2: rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__SubtractOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__5();

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
    // $ANTLR end "rule__SubtractOperation__Group__4"


    // $ANTLR start "rule__SubtractOperation__Group__4__Impl"
    // InternalDSL.g:4319:1: rule__SubtractOperation__Group__4__Impl : ( ( rule__SubtractOperation__RightAssignment_4 ) ) ;
    public final void rule__SubtractOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4323:1: ( ( ( rule__SubtractOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4324:1: ( ( rule__SubtractOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4324:1: ( ( rule__SubtractOperation__RightAssignment_4 ) )
            // InternalDSL.g:4325:2: ( rule__SubtractOperation__RightAssignment_4 )
            {
             before(grammarAccess.getSubtractOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4326:2: ( rule__SubtractOperation__RightAssignment_4 )
            // InternalDSL.g:4326:3: rule__SubtractOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubtractOperationAccess().getRightAssignment_4()); 

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
    // $ANTLR end "rule__SubtractOperation__Group__4__Impl"


    // $ANTLR start "rule__SubtractOperation__Group__5"
    // InternalDSL.g:4334:1: rule__SubtractOperation__Group__5 : rule__SubtractOperation__Group__5__Impl ;
    public final void rule__SubtractOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4338:1: ( rule__SubtractOperation__Group__5__Impl )
            // InternalDSL.g:4339:2: rule__SubtractOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubtractOperation__Group__5__Impl();

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
    // $ANTLR end "rule__SubtractOperation__Group__5"


    // $ANTLR start "rule__SubtractOperation__Group__5__Impl"
    // InternalDSL.g:4345:1: rule__SubtractOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SubtractOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4349:1: ( ( ')' ) )
            // InternalDSL.g:4350:1: ( ')' )
            {
            // InternalDSL.g:4350:1: ( ')' )
            // InternalDSL.g:4351:2: ')'
            {
             before(grammarAccess.getSubtractOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubtractOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__SubtractOperation__Group__5__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__0"
    // InternalDSL.g:4361:1: rule__ElementOfOperation__Group__0 : rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1 ;
    public final void rule__ElementOfOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4365:1: ( rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1 )
            // InternalDSL.g:4366:2: rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ElementOfOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__1();

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
    // $ANTLR end "rule__ElementOfOperation__Group__0"


    // $ANTLR start "rule__ElementOfOperation__Group__0__Impl"
    // InternalDSL.g:4373:1: rule__ElementOfOperation__Group__0__Impl : ( 'elementOf' ) ;
    public final void rule__ElementOfOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4377:1: ( ( 'elementOf' ) )
            // InternalDSL.g:4378:1: ( 'elementOf' )
            {
            // InternalDSL.g:4378:1: ( 'elementOf' )
            // InternalDSL.g:4379:2: 'elementOf'
            {
             before(grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0()); 

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
    // $ANTLR end "rule__ElementOfOperation__Group__0__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__1"
    // InternalDSL.g:4388:1: rule__ElementOfOperation__Group__1 : rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2 ;
    public final void rule__ElementOfOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4392:1: ( rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2 )
            // InternalDSL.g:4393:2: rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ElementOfOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__2();

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
    // $ANTLR end "rule__ElementOfOperation__Group__1"


    // $ANTLR start "rule__ElementOfOperation__Group__1__Impl"
    // InternalDSL.g:4400:1: rule__ElementOfOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ElementOfOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4404:1: ( ( '(' ) )
            // InternalDSL.g:4405:1: ( '(' )
            {
            // InternalDSL.g:4405:1: ( '(' )
            // InternalDSL.g:4406:2: '('
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ElementOfOperation__Group__1__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__2"
    // InternalDSL.g:4415:1: rule__ElementOfOperation__Group__2 : rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3 ;
    public final void rule__ElementOfOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4419:1: ( rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3 )
            // InternalDSL.g:4420:2: rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ElementOfOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__3();

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
    // $ANTLR end "rule__ElementOfOperation__Group__2"


    // $ANTLR start "rule__ElementOfOperation__Group__2__Impl"
    // InternalDSL.g:4427:1: rule__ElementOfOperation__Group__2__Impl : ( ( rule__ElementOfOperation__LeftAssignment_2 ) ) ;
    public final void rule__ElementOfOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4431:1: ( ( ( rule__ElementOfOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4432:1: ( ( rule__ElementOfOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4432:1: ( ( rule__ElementOfOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4433:2: ( rule__ElementOfOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4434:2: ( rule__ElementOfOperation__LeftAssignment_2 )
            // InternalDSL.g:4434:3: rule__ElementOfOperation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementOfOperationAccess().getLeftAssignment_2()); 

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
    // $ANTLR end "rule__ElementOfOperation__Group__2__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__3"
    // InternalDSL.g:4442:1: rule__ElementOfOperation__Group__3 : rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4 ;
    public final void rule__ElementOfOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4446:1: ( rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4 )
            // InternalDSL.g:4447:2: rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__ElementOfOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__4();

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
    // $ANTLR end "rule__ElementOfOperation__Group__3"


    // $ANTLR start "rule__ElementOfOperation__Group__3__Impl"
    // InternalDSL.g:4454:1: rule__ElementOfOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ElementOfOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4458:1: ( ( ',' ) )
            // InternalDSL.g:4459:1: ( ',' )
            {
            // InternalDSL.g:4459:1: ( ',' )
            // InternalDSL.g:4460:2: ','
            {
             before(grammarAccess.getElementOfOperationAccess().getCommaKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__ElementOfOperation__Group__3__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__4"
    // InternalDSL.g:4469:1: rule__ElementOfOperation__Group__4 : rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5 ;
    public final void rule__ElementOfOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4473:1: ( rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5 )
            // InternalDSL.g:4474:2: rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__ElementOfOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__5();

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
    // $ANTLR end "rule__ElementOfOperation__Group__4"


    // $ANTLR start "rule__ElementOfOperation__Group__4__Impl"
    // InternalDSL.g:4481:1: rule__ElementOfOperation__Group__4__Impl : ( ( rule__ElementOfOperation__RightAssignment_4 ) ) ;
    public final void rule__ElementOfOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4485:1: ( ( ( rule__ElementOfOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4486:1: ( ( rule__ElementOfOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4486:1: ( ( rule__ElementOfOperation__RightAssignment_4 ) )
            // InternalDSL.g:4487:2: ( rule__ElementOfOperation__RightAssignment_4 )
            {
             before(grammarAccess.getElementOfOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4488:2: ( rule__ElementOfOperation__RightAssignment_4 )
            // InternalDSL.g:4488:3: rule__ElementOfOperation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElementOfOperationAccess().getRightAssignment_4()); 

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
    // $ANTLR end "rule__ElementOfOperation__Group__4__Impl"


    // $ANTLR start "rule__ElementOfOperation__Group__5"
    // InternalDSL.g:4496:1: rule__ElementOfOperation__Group__5 : rule__ElementOfOperation__Group__5__Impl ;
    public final void rule__ElementOfOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4500:1: ( rule__ElementOfOperation__Group__5__Impl )
            // InternalDSL.g:4501:2: rule__ElementOfOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementOfOperation__Group__5__Impl();

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
    // $ANTLR end "rule__ElementOfOperation__Group__5"


    // $ANTLR start "rule__ElementOfOperation__Group__5__Impl"
    // InternalDSL.g:4507:1: rule__ElementOfOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ElementOfOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4511:1: ( ( ')' ) )
            // InternalDSL.g:4512:1: ( ')' )
            {
            // InternalDSL.g:4512:1: ( ')' )
            // InternalDSL.g:4513:2: ')'
            {
             before(grammarAccess.getElementOfOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getElementOfOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__ElementOfOperation__Group__5__Impl"


    // $ANTLR start "rule__CreateSetOperation__Group__0"
    // InternalDSL.g:4523:1: rule__CreateSetOperation__Group__0 : rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 ;
    public final void rule__CreateSetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4527:1: ( rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 )
            // InternalDSL.g:4528:2: rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CreateSetOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__1();

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
    // $ANTLR end "rule__CreateSetOperation__Group__0"


    // $ANTLR start "rule__CreateSetOperation__Group__0__Impl"
    // InternalDSL.g:4535:1: rule__CreateSetOperation__Group__0__Impl : ( '{' ) ;
    public final void rule__CreateSetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4539:1: ( ( '{' ) )
            // InternalDSL.g:4540:1: ( '{' )
            {
            // InternalDSL.g:4540:1: ( '{' )
            // InternalDSL.g:4541:2: '{'
            {
             before(grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__CreateSetOperation__Group__0__Impl"


    // $ANTLR start "rule__CreateSetOperation__Group__1"
    // InternalDSL.g:4550:1: rule__CreateSetOperation__Group__1 : rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 ;
    public final void rule__CreateSetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4554:1: ( rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 )
            // InternalDSL.g:4555:2: rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__CreateSetOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__2();

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
    // $ANTLR end "rule__CreateSetOperation__Group__1"


    // $ANTLR start "rule__CreateSetOperation__Group__1__Impl"
    // InternalDSL.g:4562:1: rule__CreateSetOperation__Group__1__Impl : ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) ;
    public final void rule__CreateSetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4566:1: ( ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) )
            // InternalDSL.g:4567:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            {
            // InternalDSL.g:4567:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            // InternalDSL.g:4568:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            {
             before(grammarAccess.getCreateSetOperationAccess().getValueAssignment_1()); 
            // InternalDSL.g:4569:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            // InternalDSL.g:4569:3: rule__CreateSetOperation__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateSetOperationAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__CreateSetOperation__Group__1__Impl"


    // $ANTLR start "rule__CreateSetOperation__Group__2"
    // InternalDSL.g:4577:1: rule__CreateSetOperation__Group__2 : rule__CreateSetOperation__Group__2__Impl ;
    public final void rule__CreateSetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4581:1: ( rule__CreateSetOperation__Group__2__Impl )
            // InternalDSL.g:4582:2: rule__CreateSetOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateSetOperation__Group__2__Impl();

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
    // $ANTLR end "rule__CreateSetOperation__Group__2"


    // $ANTLR start "rule__CreateSetOperation__Group__2__Impl"
    // InternalDSL.g:4588:1: rule__CreateSetOperation__Group__2__Impl : ( '}' ) ;
    public final void rule__CreateSetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4592:1: ( ( '}' ) )
            // InternalDSL.g:4593:1: ( '}' )
            {
            // InternalDSL.g:4593:1: ( '}' )
            // InternalDSL.g:4594:2: '}'
            {
             before(grammarAccess.getCreateSetOperationAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCreateSetOperationAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CreateSetOperation__Group__2__Impl"


    // $ANTLR start "rule__Model__TargetModelTypeAssignment_0"
    // InternalDSL.g:4604:1: rule__Model__TargetModelTypeAssignment_0 : ( ruleTargetModelTypeDef ) ;
    public final void rule__Model__TargetModelTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4608:1: ( ( ruleTargetModelTypeDef ) )
            // InternalDSL.g:4609:2: ( ruleTargetModelTypeDef )
            {
            // InternalDSL.g:4609:2: ( ruleTargetModelTypeDef )
            // InternalDSL.g:4610:3: ruleTargetModelTypeDef
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
    // InternalDSL.g:4619:1: rule__Model__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4623:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:4624:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:4624:2: ( ruleAbstractElement )
            // InternalDSL.g:4625:3: ruleAbstractElement
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
    // InternalDSL.g:4634:1: rule__TargetModelTypeDef__TypeAssignment_1 : ( ( 'DFD' ) ) ;
    public final void rule__TargetModelTypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4638:1: ( ( ( 'DFD' ) ) )
            // InternalDSL.g:4639:2: ( ( 'DFD' ) )
            {
            // InternalDSL.g:4639:2: ( ( 'DFD' ) )
            // InternalDSL.g:4640:3: ( 'DFD' )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeDFDKeyword_1_0()); 
            // InternalDSL.g:4641:3: ( 'DFD' )
            // InternalDSL.g:4642:4: 'DFD'
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeDFDKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getTypeDFDKeyword_1_0()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeDFDKeyword_1_0()); 

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


    // $ANTLR start "rule__TargetModelTypeDef__TypeContainerAssignment_3"
    // InternalDSL.g:4653:1: rule__TargetModelTypeDef__TypeContainerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__TypeContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4657:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4658:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4658:2: ( ( RULE_ID ) )
            // InternalDSL.g:4659:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedCrossReference_3_0()); 
            // InternalDSL.g:4660:3: ( RULE_ID )
            // InternalDSL.g:4661:4: RULE_ID
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedCrossReference_3_0()); 

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
    // $ANTLR end "rule__TargetModelTypeDef__TypeContainerAssignment_3"


    // $ANTLR start "rule__CharacteristicType__NameAssignment_1"
    // InternalDSL.g:4672:1: rule__CharacteristicType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4676:1: ( ( RULE_ID ) )
            // InternalDSL.g:4677:2: ( RULE_ID )
            {
            // InternalDSL.g:4677:2: ( RULE_ID )
            // InternalDSL.g:4678:3: RULE_ID
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
    // InternalDSL.g:4687:1: rule__CharacteristicType__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicType__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4691:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4692:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4692:2: ( ( RULE_ID ) )
            // InternalDSL.g:4693:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefEnumCharacteristicTypeCrossReference_3_0()); 
            // InternalDSL.g:4694:3: ( RULE_ID )
            // InternalDSL.g:4695:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefEnumCharacteristicTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeAccess().getRefEnumCharacteristicTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeAccess().getRefEnumCharacteristicTypeCrossReference_3_0()); 

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
    // InternalDSL.g:4706:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4710:1: ( ( RULE_ID ) )
            // InternalDSL.g:4711:2: ( RULE_ID )
            {
            // InternalDSL.g:4711:2: ( RULE_ID )
            // InternalDSL.g:4712:3: RULE_ID
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
    // InternalDSL.g:4721:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4725:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:4726:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:4726:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:4727:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:4736:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4740:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:4741:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:4741:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:4742:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:4751:1: rule__CharacteristicTypeSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4755:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4756:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4756:2: ( ( RULE_ID ) )
            // InternalDSL.g:4757:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 
            // InternalDSL.g:4758:3: ( RULE_ID )
            // InternalDSL.g:4759:4: RULE_ID
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
    // InternalDSL.g:4770:1: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4774:1: ( ( ( '!' ) ) )
            // InternalDSL.g:4775:2: ( ( '!' ) )
            {
            // InternalDSL.g:4775:2: ( ( '!' ) )
            // InternalDSL.g:4776:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:4777:3: ( '!' )
            // InternalDSL.g:4778:4: '!'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:4789:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4793:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4794:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4794:2: ( ( RULE_ID ) )
            // InternalDSL.g:4795:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_0_1_0()); 
            // InternalDSL.g:4796:3: ( RULE_ID )
            // InternalDSL.g:4797:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_0_1_0()); 

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
    // InternalDSL.g:4808:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4812:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4813:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4813:2: ( ( RULE_ID ) )
            // InternalDSL.g:4814:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_1_0()); 
            // InternalDSL.g:4815:3: ( RULE_ID )
            // InternalDSL.g:4816:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_1_0()); 

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
    // InternalDSL.g:4827:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4831:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:4832:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:4832:2: ( ( RULE_ID ) )
            // InternalDSL.g:4833:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_2_1_0()); 
            // InternalDSL.g:4834:3: ( RULE_ID )
            // InternalDSL.g:4835:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralIDTerminalRuleCall_2_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralIDTerminalRuleCall_2_1_2_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_2_1_0()); 

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


    // $ANTLR start "rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0"
    // InternalDSL.g:4846:1: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 : ( ( '$' ) ) ;
    public final void rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4850:1: ( ( ( '$' ) ) )
            // InternalDSL.g:4851:2: ( ( '$' ) )
            {
            // InternalDSL.g:4851:2: ( ( '$' ) )
            // InternalDSL.g:4852:3: ( '$' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            // InternalDSL.g:4853:3: ( '$' )
            // InternalDSL.g:4854:4: '$'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 

            }

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0"


    // $ANTLR start "rule__CharacteristicTypeSelector__VariableAssignment_2_2_1"
    // InternalDSL.g:4865:1: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 : ( ruleCharacteristicVariableType ) ;
    public final void rule__CharacteristicTypeSelector__VariableAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4869:1: ( ( ruleCharacteristicVariableType ) )
            // InternalDSL.g:4870:2: ( ruleCharacteristicVariableType )
            {
            // InternalDSL.g:4870:2: ( ruleCharacteristicVariableType )
            // InternalDSL.g:4871:3: ruleCharacteristicVariableType
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableCharacteristicVariableTypeParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicVariableType();

            state._fsp--;

             after(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableCharacteristicVariableTypeParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__CharacteristicTypeSelector__VariableAssignment_2_2_1"


    // $ANTLR start "rule__CharacteristicVariable__NameAssignment"
    // InternalDSL.g:4880:1: rule__CharacteristicVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__CharacteristicVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4884:1: ( ( RULE_ID ) )
            // InternalDSL.g:4885:2: ( RULE_ID )
            {
            // InternalDSL.g:4885:2: ( RULE_ID )
            // InternalDSL.g:4886:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicVariableAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CharacteristicVariable__NameAssignment"


    // $ANTLR start "rule__CharacteristicSet__NameAssignment_0"
    // InternalDSL.g:4895:1: rule__CharacteristicSet__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CharacteristicSet__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4899:1: ( ( RULE_ID ) )
            // InternalDSL.g:4900:2: ( RULE_ID )
            {
            // InternalDSL.g:4900:2: ( RULE_ID )
            // InternalDSL.g:4901:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicSetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSetAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CharacteristicSet__NameAssignment_0"


    // $ANTLR start "rule__Include__ImportURIAssignment_1"
    // InternalDSL.g:4910:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4914:1: ( ( RULE_STRING ) )
            // InternalDSL.g:4915:2: ( RULE_STRING )
            {
            // InternalDSL.g:4915:2: ( RULE_STRING )
            // InternalDSL.g:4916:3: RULE_STRING
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
    // InternalDSL.g:4925:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4929:1: ( ( RULE_ID ) )
            // InternalDSL.g:4930:2: ( RULE_ID )
            {
            // InternalDSL.g:4930:2: ( RULE_ID )
            // InternalDSL.g:4931:3: RULE_ID
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
    // InternalDSL.g:4940:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4944:1: ( ( ruleRule ) )
            // InternalDSL.g:4945:2: ( ruleRule )
            {
            // InternalDSL.g:4945:2: ( ruleRule )
            // InternalDSL.g:4946:3: ruleRule
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
    // InternalDSL.g:4955:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4959:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:4960:2: ( ruleDataSelector )
            {
            // InternalDSL.g:4960:2: ( ruleDataSelector )
            // InternalDSL.g:4961:3: ruleDataSelector
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
    // InternalDSL.g:4970:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4974:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:4975:2: ( ruleDataSelector )
            {
            // InternalDSL.g:4975:2: ( ruleDataSelector )
            // InternalDSL.g:4976:3: ruleDataSelector
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
    // InternalDSL.g:4985:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4989:1: ( ( ruleStatement ) )
            // InternalDSL.g:4990:2: ( ruleStatement )
            {
            // InternalDSL.g:4990:2: ( ruleStatement )
            // InternalDSL.g:4991:3: ruleStatement
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
    // InternalDSL.g:5000:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5004:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:5005:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:5005:2: ( ruleDestinationSelector )
            // InternalDSL.g:5006:3: ruleDestinationSelector
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
    // InternalDSL.g:5015:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5019:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:5020:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:5020:2: ( ruleDestinationSelector )
            // InternalDSL.g:5021:3: ruleDestinationSelector
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


    // $ANTLR start "rule__Rule__ConditionAssignment_5"
    // InternalDSL.g:5030:1: rule__Rule__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5034:1: ( ( ruleCondition ) )
            // InternalDSL.g:5035:2: ( ruleCondition )
            {
            // InternalDSL.g:5035:2: ( ruleCondition )
            // InternalDSL.g:5036:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Rule__ConditionAssignment_5"


    // $ANTLR start "rule__AttributeSelector__RefAssignment_1"
    // InternalDSL.g:5045:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5049:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5050:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5050:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5051:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5060:1: rule__AttributeClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5064:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5065:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5065:2: ( ( RULE_ID ) )
            // InternalDSL.g:5066:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:5067:3: ( RULE_ID )
            // InternalDSL.g:5068:4: RULE_ID
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
    // InternalDSL.g:5079:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5083:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5084:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5084:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5085:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5094:1: rule__PropertyClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5098:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5099:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5099:2: ( ( RULE_ID ) )
            // InternalDSL.g:5100:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:5101:3: ( RULE_ID )
            // InternalDSL.g:5102:4: RULE_ID
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


    // $ANTLR start "rule__NodeIdentitiySelector__NameAssignment_0_1"
    // InternalDSL.g:5113:1: rule__NodeIdentitiySelector__NameAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__NodeIdentitiySelector__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5117:1: ( ( RULE_STRING ) )
            // InternalDSL.g:5118:2: ( RULE_STRING )
            {
            // InternalDSL.g:5118:2: ( RULE_STRING )
            // InternalDSL.g:5119:3: RULE_STRING
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNameSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getNameSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__NameAssignment_0_1"


    // $ANTLR start "rule__NodeIdentitiySelector__DiaNodeAssignment_1_1"
    // InternalDSL.g:5128:1: rule__NodeIdentitiySelector__DiaNodeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__DiaNodeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5132:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5133:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5133:2: ( ( RULE_ID ) )
            // InternalDSL.g:5134:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeCrossReference_1_1_0()); 
            // InternalDSL.g:5135:3: ( RULE_ID )
            // InternalDSL.g:5136:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__DiaNodeAssignment_1_1"


    // $ANTLR start "rule__Statement__ModalityAssignment_0"
    // InternalDSL.g:5147:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5151:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:5152:2: ( ruleStatementModality )
            {
            // InternalDSL.g:5152:2: ( ruleStatementModality )
            // InternalDSL.g:5153:3: ruleStatementModality
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
    // InternalDSL.g:5162:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5166:1: ( ( ruleStatementType ) )
            // InternalDSL.g:5167:2: ( ruleStatementType )
            {
            // InternalDSL.g:5167:2: ( ruleStatementType )
            // InternalDSL.g:5168:3: ruleStatementType
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
    // InternalDSL.g:5177:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5181:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:5182:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:5182:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:5183:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:5184:3: ( 'FLOWS' )
            // InternalDSL.g:5185:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDSL.g:5196:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5200:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:5201:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:5201:2: ( ( 'NEVER' ) )
            // InternalDSL.g:5202:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:5203:3: ( 'NEVER' )
            // InternalDSL.g:5204:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,47,FOLLOW_2); 
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


    // $ANTLR start "rule__Condition__OperationAssignment_1"
    // InternalDSL.g:5215:1: rule__Condition__OperationAssignment_1 : ( ruleBooleanOperation ) ;
    public final void rule__Condition__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5219:1: ( ( ruleBooleanOperation ) )
            // InternalDSL.g:5220:2: ( ruleBooleanOperation )
            {
            // InternalDSL.g:5220:2: ( ruleBooleanOperation )
            // InternalDSL.g:5221:3: ruleBooleanOperation
            {
             before(grammarAccess.getConditionAccess().getOperationBooleanOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperationBooleanOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Condition__OperationAssignment_1"


    // $ANTLR start "rule__CharacteristicReference__ValueAssignment"
    // InternalDSL.g:5230:1: rule__CharacteristicReference__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5234:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5235:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5235:2: ( ( RULE_ID ) )
            // InternalDSL.g:5236:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableCrossReference_0()); 
            // InternalDSL.g:5237:3: ( RULE_ID )
            // InternalDSL.g:5238:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableCrossReference_0()); 

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
    // $ANTLR end "rule__CharacteristicReference__ValueAssignment"


    // $ANTLR start "rule__CharacteristicSetReference__ValueAssignment_0"
    // InternalDSL.g:5249:1: rule__CharacteristicSetReference__ValueAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicSetReference__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5253:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5254:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5254:2: ( ( RULE_ID ) )
            // InternalDSL.g:5255:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetCrossReference_0_0()); 
            // InternalDSL.g:5256:3: ( RULE_ID )
            // InternalDSL.g:5257:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetCrossReference_0_0()); 

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
    // $ANTLR end "rule__CharacteristicSetReference__ValueAssignment_0"


    // $ANTLR start "rule__CharacteristicSetReference__RefAssignment_1"
    // InternalDSL.g:5268:1: rule__CharacteristicSetReference__RefAssignment_1 : ( ruleCharacteristsicSetOperation ) ;
    public final void rule__CharacteristicSetReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5272:1: ( ( ruleCharacteristsicSetOperation ) )
            // InternalDSL.g:5273:2: ( ruleCharacteristsicSetOperation )
            {
            // InternalDSL.g:5273:2: ( ruleCharacteristsicSetOperation )
            // InternalDSL.g:5274:3: ruleCharacteristsicSetOperation
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getRefCharacteristsicSetOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristsicSetOperation();

            state._fsp--;

             after(grammarAccess.getCharacteristicSetReferenceAccess().getRefCharacteristsicSetOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CharacteristicSetReference__RefAssignment_1"


    // $ANTLR start "rule__LogicalOrOperation__RightAssignment_1_2"
    // InternalDSL.g:5283:1: rule__LogicalOrOperation__RightAssignment_1_2 : ( ruleLogicalAndOperation ) ;
    public final void rule__LogicalOrOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5287:1: ( ( ruleLogicalAndOperation ) )
            // InternalDSL.g:5288:2: ( ruleLogicalAndOperation )
            {
            // InternalDSL.g:5288:2: ( ruleLogicalAndOperation )
            // InternalDSL.g:5289:3: ruleLogicalAndOperation
            {
             before(grammarAccess.getLogicalOrOperationAccess().getRightLogicalAndOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalAndOperation();

            state._fsp--;

             after(grammarAccess.getLogicalOrOperationAccess().getRightLogicalAndOperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__LogicalOrOperation__RightAssignment_1_2"


    // $ANTLR start "rule__LogicalAndOperation__RightAssignment_1_2"
    // InternalDSL.g:5298:1: rule__LogicalAndOperation__RightAssignment_1_2 : ( ruleLogicalNegationOperation ) ;
    public final void rule__LogicalAndOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5302:1: ( ( ruleLogicalNegationOperation ) )
            // InternalDSL.g:5303:2: ( ruleLogicalNegationOperation )
            {
            // InternalDSL.g:5303:2: ( ruleLogicalNegationOperation )
            // InternalDSL.g:5304:3: ruleLogicalNegationOperation
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightLogicalNegationOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalNegationOperation();

            state._fsp--;

             after(grammarAccess.getLogicalAndOperationAccess().getRightLogicalNegationOperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__LogicalAndOperation__RightAssignment_1_2"


    // $ANTLR start "rule__LogicalNegationOperation__ValueAssignment_1_2"
    // InternalDSL.g:5313:1: rule__LogicalNegationOperation__ValueAssignment_1_2 : ( ruleEncapsulatedLogicalOperation ) ;
    public final void rule__LogicalNegationOperation__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5317:1: ( ( ruleEncapsulatedLogicalOperation ) )
            // InternalDSL.g:5318:2: ( ruleEncapsulatedLogicalOperation )
            {
            // InternalDSL.g:5318:2: ( ruleEncapsulatedLogicalOperation )
            // InternalDSL.g:5319:3: ruleEncapsulatedLogicalOperation
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getValueEncapsulatedLogicalOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEncapsulatedLogicalOperation();

            state._fsp--;

             after(grammarAccess.getLogicalNegationOperationAccess().getValueEncapsulatedLogicalOperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__LogicalNegationOperation__ValueAssignment_1_2"


    // $ANTLR start "rule__VariableEqualityOperation__LeftAssignment_0"
    // InternalDSL.g:5328:1: rule__VariableEqualityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5332:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5333:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5333:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5334:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableEqualityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariableEqualityOperation__LeftAssignment_0"


    // $ANTLR start "rule__VariableEqualityOperation__RightAssignment_2"
    // InternalDSL.g:5343:1: rule__VariableEqualityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5347:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5348:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5348:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5349:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableEqualityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VariableEqualityOperation__RightAssignment_2"


    // $ANTLR start "rule__VariableInequalityOperation__LeftAssignment_0"
    // InternalDSL.g:5358:1: rule__VariableInequalityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5362:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5363:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5363:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5364:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableInequalityOperationAccess().getLeftCharacteristicReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariableInequalityOperation__LeftAssignment_0"


    // $ANTLR start "rule__VariableInequalityOperation__RightAssignment_2"
    // InternalDSL.g:5373:1: rule__VariableInequalityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5377:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5378:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5378:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5379:3: ruleCharacteristicReference
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getVariableInequalityOperationAccess().getRightCharacteristicReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VariableInequalityOperation__RightAssignment_2"


    // $ANTLR start "rule__EmptySetOperation__ValueAssignment_2"
    // InternalDSL.g:5388:1: rule__EmptySetOperation__ValueAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__EmptySetOperation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5392:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5393:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5393:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5394:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getEmptySetOperationAccess().getValueCharacteristicSetReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EmptySetOperation__ValueAssignment_2"


    // $ANTLR start "rule__IntersectionOperation__LeftAssignment_2"
    // InternalDSL.g:5403:1: rule__IntersectionOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5407:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5408:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5408:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5409:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntersectionOperation__LeftAssignment_2"


    // $ANTLR start "rule__IntersectionOperation__RightAssignment_4"
    // InternalDSL.g:5418:1: rule__IntersectionOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5422:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5423:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5423:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5424:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getIntersectionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IntersectionOperation__RightAssignment_4"


    // $ANTLR start "rule__UnionOperation__LeftAssignment_2"
    // InternalDSL.g:5433:1: rule__UnionOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__UnionOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5437:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5438:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5438:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5439:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getUnionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getUnionOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UnionOperation__LeftAssignment_2"


    // $ANTLR start "rule__UnionOperation__RightAssignment_4"
    // InternalDSL.g:5448:1: rule__UnionOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__UnionOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5452:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5453:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5453:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5454:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getUnionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getUnionOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__UnionOperation__RightAssignment_4"


    // $ANTLR start "rule__SubtractOperation__LeftAssignment_2"
    // InternalDSL.g:5463:1: rule__SubtractOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__SubtractOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5467:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5468:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5468:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5469:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getSubtractOperationAccess().getLeftCharacteristicSetReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SubtractOperation__LeftAssignment_2"


    // $ANTLR start "rule__SubtractOperation__RightAssignment_4"
    // InternalDSL.g:5478:1: rule__SubtractOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__SubtractOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5482:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5483:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5483:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5484:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getSubtractOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getSubtractOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SubtractOperation__RightAssignment_4"


    // $ANTLR start "rule__ElementOfOperation__LeftAssignment_2"
    // InternalDSL.g:5493:1: rule__ElementOfOperation__LeftAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__ElementOfOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5497:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5498:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5498:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5499:3: ruleCharacteristicReference
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftCharacteristicReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getElementOfOperationAccess().getLeftCharacteristicReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElementOfOperation__LeftAssignment_2"


    // $ANTLR start "rule__ElementOfOperation__RightAssignment_4"
    // InternalDSL.g:5508:1: rule__ElementOfOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__ElementOfOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5512:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5513:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5513:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5514:3: ruleCharacteristicSetReference
            {
             before(grammarAccess.getElementOfOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicSetReference();

            state._fsp--;

             after(grammarAccess.getElementOfOperationAccess().getRightCharacteristicSetReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ElementOfOperation__RightAssignment_4"


    // $ANTLR start "rule__CreateSetOperation__ValueAssignment_1"
    // InternalDSL.g:5523:1: rule__CreateSetOperation__ValueAssignment_1 : ( ruleCharacteristicReference ) ;
    public final void rule__CreateSetOperation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5527:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5528:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5528:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5529:3: ruleCharacteristicReference
            {
             before(grammarAccess.getCreateSetOperationAccess().getValueCharacteristicReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristicReference();

            state._fsp--;

             after(grammarAccess.getCreateSetOperationAccess().getValueCharacteristicReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CreateSetOperation__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000180A010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000180A012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200400100020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000088C00000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000088800000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000070000010020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000040000L});

}