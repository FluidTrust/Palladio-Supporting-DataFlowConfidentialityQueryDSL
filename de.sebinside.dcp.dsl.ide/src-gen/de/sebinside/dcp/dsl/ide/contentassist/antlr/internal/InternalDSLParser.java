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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OperationModel'", "'DataCentricPalladio'", "'ExtendedDFD'", "'target'", "'using'", "','", "'type'", "':'", "'class'", "'{'", "'}'", "'.'", "'['", "']'", "'{}'", "'import'", "'constraint'", "'&'", "'data.attribute.'", "'data.class.'", "'node.property.'", "'node.class.'", "'node.name.'", "'node.identity.'", "'WHERE'", "'|'", "'!'", "'('", "')'", "'=='", "'!='", "'isEmpty'", "'intersection'", "'union'", "'subtract'", "'elementOf'", "'$'", "'FLOWS'", "'NEVER'"
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
    public static final int T__48=48;
    public static final int T__49=49;
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


    // $ANTLR start "ruleTargetModelType"
    // InternalDSL.g:1053:1: ruleTargetModelType : ( ( rule__TargetModelType__Alternatives ) ) ;
    public final void ruleTargetModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1057:1: ( ( ( rule__TargetModelType__Alternatives ) ) )
            // InternalDSL.g:1058:2: ( ( rule__TargetModelType__Alternatives ) )
            {
            // InternalDSL.g:1058:2: ( ( rule__TargetModelType__Alternatives ) )
            // InternalDSL.g:1059:3: ( rule__TargetModelType__Alternatives )
            {
             before(grammarAccess.getTargetModelTypeAccess().getAlternatives()); 
            // InternalDSL.g:1060:3: ( rule__TargetModelType__Alternatives )
            // InternalDSL.g:1060:4: rule__TargetModelType__Alternatives
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
    // InternalDSL.g:1068:1: rule__AbstractElement__Alternatives : ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1072:1: ( ( ruleInclude ) | ( ruleCharacteristicType ) | ( ruleCharacteristicClass ) | ( ruleConstraint ) | ( ( rule__AbstractElement__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 27:
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
                    // InternalDSL.g:1073:2: ( ruleInclude )
                    {
                    // InternalDSL.g:1073:2: ( ruleInclude )
                    // InternalDSL.g:1074:3: ruleInclude
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
                    // InternalDSL.g:1079:2: ( ruleCharacteristicType )
                    {
                    // InternalDSL.g:1079:2: ( ruleCharacteristicType )
                    // InternalDSL.g:1080:3: ruleCharacteristicType
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
                    // InternalDSL.g:1085:2: ( ruleCharacteristicClass )
                    {
                    // InternalDSL.g:1085:2: ( ruleCharacteristicClass )
                    // InternalDSL.g:1086:3: ruleCharacteristicClass
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
                    // InternalDSL.g:1091:2: ( ruleConstraint )
                    {
                    // InternalDSL.g:1091:2: ( ruleConstraint )
                    // InternalDSL.g:1092:3: ruleConstraint
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
                    // InternalDSL.g:1097:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    {
                    // InternalDSL.g:1097:2: ( ( rule__AbstractElement__Group_4__0 ) )
                    // InternalDSL.g:1098:3: ( rule__AbstractElement__Group_4__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_4()); 
                    // InternalDSL.g:1099:3: ( rule__AbstractElement__Group_4__0 )
                    // InternalDSL.g:1099:4: rule__AbstractElement__Group_4__0
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
    // InternalDSL.g:1107:1: rule__CharacteristicTypeSelector__Alternatives_2 : ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) );
    public final void rule__CharacteristicTypeSelector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1111:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) ) | ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 37:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 47:
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
                    // InternalDSL.g:1112:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    {
                    // InternalDSL.g:1112:2: ( ( rule__CharacteristicTypeSelector__Group_2_0__0 ) )
                    // InternalDSL.g:1113:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_0()); 
                    // InternalDSL.g:1114:3: ( rule__CharacteristicTypeSelector__Group_2_0__0 )
                    // InternalDSL.g:1114:4: rule__CharacteristicTypeSelector__Group_2_0__0
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
                    // InternalDSL.g:1118:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    {
                    // InternalDSL.g:1118:2: ( ( rule__CharacteristicTypeSelector__Group_2_1__0 ) )
                    // InternalDSL.g:1119:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1()); 
                    // InternalDSL.g:1120:3: ( rule__CharacteristicTypeSelector__Group_2_1__0 )
                    // InternalDSL.g:1120:4: rule__CharacteristicTypeSelector__Group_2_1__0
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
                    // InternalDSL.g:1124:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    {
                    // InternalDSL.g:1124:2: ( ( rule__CharacteristicTypeSelector__Group_2_2__0 ) )
                    // InternalDSL.g:1125:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    {
                     before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_2()); 
                    // InternalDSL.g:1126:3: ( rule__CharacteristicTypeSelector__Group_2_2__0 )
                    // InternalDSL.g:1126:4: rule__CharacteristicTypeSelector__Group_2_2__0
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
    // InternalDSL.g:1134:1: rule__CharacteristicVariableType__Alternatives : ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) );
    public final void rule__CharacteristicVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1138:1: ( ( ruleCharacteristicVariable ) | ( ruleCharacteristicSet ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==16||LA3_1==21||LA3_1==28||LA3_1==35||LA3_1==49) ) {
                    alt3=1;
                }
                else if ( (LA3_1==25) ) {
                    alt3=2;
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
                    // InternalDSL.g:1139:2: ( ruleCharacteristicVariable )
                    {
                    // InternalDSL.g:1139:2: ( ruleCharacteristicVariable )
                    // InternalDSL.g:1140:3: ruleCharacteristicVariable
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
                    // InternalDSL.g:1145:2: ( ruleCharacteristicSet )
                    {
                    // InternalDSL.g:1145:2: ( ruleCharacteristicSet )
                    // InternalDSL.g:1146:3: ruleCharacteristicSet
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
    // InternalDSL.g:1155:1: rule__DataSelector__Alternatives : ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) );
    public final void rule__DataSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1159:1: ( ( ruleAttributeSelector ) | ( ruleAttributeClassSelector ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:1160:2: ( ruleAttributeSelector )
                    {
                    // InternalDSL.g:1160:2: ( ruleAttributeSelector )
                    // InternalDSL.g:1161:3: ruleAttributeSelector
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
                    // InternalDSL.g:1166:2: ( ruleAttributeClassSelector )
                    {
                    // InternalDSL.g:1166:2: ( ruleAttributeClassSelector )
                    // InternalDSL.g:1167:3: ruleAttributeClassSelector
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
    // InternalDSL.g:1176:1: rule__DestinationSelector__Alternatives : ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) );
    public final void rule__DestinationSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1180:1: ( ( rulePropertySelector ) | ( rulePropertyClassSelector ) | ( ruleNodeIdentitiySelector ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
            case 34:
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
                    // InternalDSL.g:1181:2: ( rulePropertySelector )
                    {
                    // InternalDSL.g:1181:2: ( rulePropertySelector )
                    // InternalDSL.g:1182:3: rulePropertySelector
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
                    // InternalDSL.g:1187:2: ( rulePropertyClassSelector )
                    {
                    // InternalDSL.g:1187:2: ( rulePropertyClassSelector )
                    // InternalDSL.g:1188:3: rulePropertyClassSelector
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
                    // InternalDSL.g:1193:2: ( ruleNodeIdentitiySelector )
                    {
                    // InternalDSL.g:1193:2: ( ruleNodeIdentitiySelector )
                    // InternalDSL.g:1194:3: ruleNodeIdentitiySelector
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
    // InternalDSL.g:1203:1: rule__NodeIdentitiySelector__Alternatives : ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) );
    public final void rule__NodeIdentitiySelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1207:1: ( ( ( rule__NodeIdentitiySelector__Group_0__0 ) ) | ( ( rule__NodeIdentitiySelector__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:1208:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    {
                    // InternalDSL.g:1208:2: ( ( rule__NodeIdentitiySelector__Group_0__0 ) )
                    // InternalDSL.g:1209:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_0()); 
                    // InternalDSL.g:1210:3: ( rule__NodeIdentitiySelector__Group_0__0 )
                    // InternalDSL.g:1210:4: rule__NodeIdentitiySelector__Group_0__0
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
                    // InternalDSL.g:1214:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    {
                    // InternalDSL.g:1214:2: ( ( rule__NodeIdentitiySelector__Group_1__0 ) )
                    // InternalDSL.g:1215:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1()); 
                    // InternalDSL.g:1216:3: ( rule__NodeIdentitiySelector__Group_1__0 )
                    // InternalDSL.g:1216:4: rule__NodeIdentitiySelector__Group_1__0
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


    // $ANTLR start "rule__NodeIdentitiySelector__Alternatives_1_1"
    // InternalDSL.g:1224:1: rule__NodeIdentitiySelector__Alternatives_1_1 : ( ( ( rule__NodeIdentitiySelector__Group_1_1_0__0 ) ) | ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1 ) ) );
    public final void rule__NodeIdentitiySelector__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1228:1: ( ( ( rule__NodeIdentitiySelector__Group_1_1_0__0 ) ) | ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==22) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==21||LA7_1==28||LA7_1==35) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1229:2: ( ( rule__NodeIdentitiySelector__Group_1_1_0__0 ) )
                    {
                    // InternalDSL.g:1229:2: ( ( rule__NodeIdentitiySelector__Group_1_1_0__0 ) )
                    // InternalDSL.g:1230:3: ( rule__NodeIdentitiySelector__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1_1_0()); 
                    // InternalDSL.g:1231:3: ( rule__NodeIdentitiySelector__Group_1_1_0__0 )
                    // InternalDSL.g:1231:4: rule__NodeIdentitiySelector__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeIdentitiySelector__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeIdentitiySelectorAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1235:2: ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1 ) )
                    {
                    // InternalDSL.g:1235:2: ( ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1 ) )
                    // InternalDSL.g:1236:3: ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1 )
                    {
                     before(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeAssignment_1_1_1()); 
                    // InternalDSL.g:1237:3: ( rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1 )
                    // InternalDSL.g:1237:4: rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeAssignment_1_1_1()); 

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
    // $ANTLR end "rule__NodeIdentitiySelector__Alternatives_1_1"


    // $ANTLR start "rule__CharacteristicSetReference__Alternatives"
    // InternalDSL.g:1245:1: rule__CharacteristicSetReference__Alternatives : ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) );
    public final void rule__CharacteristicSetReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1249:1: ( ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) ) | ( ( rule__CharacteristicSetReference__RefAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==20||(LA8_0>=43 && LA8_0<=45)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:1250:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    {
                    // InternalDSL.g:1250:2: ( ( rule__CharacteristicSetReference__ValueAssignment_0 ) )
                    // InternalDSL.g:1251:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getValueAssignment_0()); 
                    // InternalDSL.g:1252:3: ( rule__CharacteristicSetReference__ValueAssignment_0 )
                    // InternalDSL.g:1252:4: rule__CharacteristicSetReference__ValueAssignment_0
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
                    // InternalDSL.g:1256:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    {
                    // InternalDSL.g:1256:2: ( ( rule__CharacteristicSetReference__RefAssignment_1 ) )
                    // InternalDSL.g:1257:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    {
                     before(grammarAccess.getCharacteristicSetReferenceAccess().getRefAssignment_1()); 
                    // InternalDSL.g:1258:3: ( rule__CharacteristicSetReference__RefAssignment_1 )
                    // InternalDSL.g:1258:4: rule__CharacteristicSetReference__RefAssignment_1
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
    // InternalDSL.g:1266:1: rule__CharacteristsicSetOperation__Alternatives : ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) | ( ruleUnionOperation ) | ( ruleSubtractOperation ) );
    public final void rule__CharacteristsicSetOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1270:1: ( ( ruleCreateSetOperation ) | ( ruleIntersectionOperation ) | ( ruleUnionOperation ) | ( ruleSubtractOperation ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 43:
                {
                alt9=2;
                }
                break;
            case 44:
                {
                alt9=3;
                }
                break;
            case 45:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1271:2: ( ruleCreateSetOperation )
                    {
                    // InternalDSL.g:1271:2: ( ruleCreateSetOperation )
                    // InternalDSL.g:1272:3: ruleCreateSetOperation
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
                    // InternalDSL.g:1277:2: ( ruleIntersectionOperation )
                    {
                    // InternalDSL.g:1277:2: ( ruleIntersectionOperation )
                    // InternalDSL.g:1278:3: ruleIntersectionOperation
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
                    // InternalDSL.g:1283:2: ( ruleUnionOperation )
                    {
                    // InternalDSL.g:1283:2: ( ruleUnionOperation )
                    // InternalDSL.g:1284:3: ruleUnionOperation
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
                    // InternalDSL.g:1289:2: ( ruleSubtractOperation )
                    {
                    // InternalDSL.g:1289:2: ( ruleSubtractOperation )
                    // InternalDSL.g:1290:3: ruleSubtractOperation
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
    // InternalDSL.g:1299:1: rule__LogicalNegationOperation__Alternatives : ( ( ruleEncapsulatedLogicalOperation ) | ( ( rule__LogicalNegationOperation__Group_1__0 ) ) );
    public final void rule__LogicalNegationOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1303:1: ( ( ruleEncapsulatedLogicalOperation ) | ( ( rule__LogicalNegationOperation__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==38||LA10_0==42||LA10_0==46) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1304:2: ( ruleEncapsulatedLogicalOperation )
                    {
                    // InternalDSL.g:1304:2: ( ruleEncapsulatedLogicalOperation )
                    // InternalDSL.g:1305:3: ruleEncapsulatedLogicalOperation
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
                    // InternalDSL.g:1310:2: ( ( rule__LogicalNegationOperation__Group_1__0 ) )
                    {
                    // InternalDSL.g:1310:2: ( ( rule__LogicalNegationOperation__Group_1__0 ) )
                    // InternalDSL.g:1311:3: ( rule__LogicalNegationOperation__Group_1__0 )
                    {
                     before(grammarAccess.getLogicalNegationOperationAccess().getGroup_1()); 
                    // InternalDSL.g:1312:3: ( rule__LogicalNegationOperation__Group_1__0 )
                    // InternalDSL.g:1312:4: rule__LogicalNegationOperation__Group_1__0
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
    // InternalDSL.g:1320:1: rule__EncapsulatedLogicalOperation__Alternatives : ( ( ruleSimpleBooleanOperation ) | ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) ) );
    public final void rule__EncapsulatedLogicalOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1324:1: ( ( ruleSimpleBooleanOperation ) | ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==42||LA11_0==46) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1325:2: ( ruleSimpleBooleanOperation )
                    {
                    // InternalDSL.g:1325:2: ( ruleSimpleBooleanOperation )
                    // InternalDSL.g:1326:3: ruleSimpleBooleanOperation
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
                    // InternalDSL.g:1331:2: ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) )
                    {
                    // InternalDSL.g:1331:2: ( ( rule__EncapsulatedLogicalOperation__Group_1__0 ) )
                    // InternalDSL.g:1332:3: ( rule__EncapsulatedLogicalOperation__Group_1__0 )
                    {
                     before(grammarAccess.getEncapsulatedLogicalOperationAccess().getGroup_1()); 
                    // InternalDSL.g:1333:3: ( rule__EncapsulatedLogicalOperation__Group_1__0 )
                    // InternalDSL.g:1333:4: rule__EncapsulatedLogicalOperation__Group_1__0
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
    // InternalDSL.g:1341:1: rule__SimpleBooleanOperation__Alternatives : ( ( ruleEmptySetOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleElementOfOperation ) );
    public final void rule__SimpleBooleanOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1345:1: ( ( ruleEmptySetOperation ) | ( ruleVariableEqualityOperation ) | ( ruleVariableInequalityOperation ) | ( ruleElementOfOperation ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==41) ) {
                    alt12=3;
                }
                else if ( (LA12_2==40) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1346:2: ( ruleEmptySetOperation )
                    {
                    // InternalDSL.g:1346:2: ( ruleEmptySetOperation )
                    // InternalDSL.g:1347:3: ruleEmptySetOperation
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
                    // InternalDSL.g:1352:2: ( ruleVariableEqualityOperation )
                    {
                    // InternalDSL.g:1352:2: ( ruleVariableEqualityOperation )
                    // InternalDSL.g:1353:3: ruleVariableEqualityOperation
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
                    // InternalDSL.g:1358:2: ( ruleVariableInequalityOperation )
                    {
                    // InternalDSL.g:1358:2: ( ruleVariableInequalityOperation )
                    // InternalDSL.g:1359:3: ruleVariableInequalityOperation
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
                    // InternalDSL.g:1364:2: ( ruleElementOfOperation )
                    {
                    // InternalDSL.g:1364:2: ( ruleElementOfOperation )
                    // InternalDSL.g:1365:3: ruleElementOfOperation
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


    // $ANTLR start "rule__TargetModelType__Alternatives"
    // InternalDSL.g:1374:1: rule__TargetModelType__Alternatives : ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) );
    public final void rule__TargetModelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1378:1: ( ( ( 'OperationModel' ) ) | ( ( 'DataCentricPalladio' ) ) | ( ( 'ExtendedDFD' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt13=1;
                }
                break;
            case 12:
                {
                alt13=2;
                }
                break;
            case 13:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDSL.g:1379:2: ( ( 'OperationModel' ) )
                    {
                    // InternalDSL.g:1379:2: ( ( 'OperationModel' ) )
                    // InternalDSL.g:1380:3: ( 'OperationModel' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1381:3: ( 'OperationModel' )
                    // InternalDSL.g:1381:4: 'OperationModel'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1385:2: ( ( 'DataCentricPalladio' ) )
                    {
                    // InternalDSL.g:1385:2: ( ( 'DataCentricPalladio' ) )
                    // InternalDSL.g:1386:3: ( 'DataCentricPalladio' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1387:3: ( 'DataCentricPalladio' )
                    // InternalDSL.g:1387:4: 'DataCentricPalladio'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1391:2: ( ( 'ExtendedDFD' ) )
                    {
                    // InternalDSL.g:1391:2: ( ( 'ExtendedDFD' ) )
                    // InternalDSL.g:1392:3: ( 'ExtendedDFD' )
                    {
                     before(grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1393:3: ( 'ExtendedDFD' )
                    // InternalDSL.g:1393:4: 'ExtendedDFD'
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
    // InternalDSL.g:1401:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1405:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSL.g:1406:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDSL.g:1413:1: rule__Model__Group__0__Impl : ( ( rule__Model__TargetModelTypeAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1417:1: ( ( ( rule__Model__TargetModelTypeAssignment_0 )? ) )
            // InternalDSL.g:1418:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            {
            // InternalDSL.g:1418:1: ( ( rule__Model__TargetModelTypeAssignment_0 )? )
            // InternalDSL.g:1419:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getTargetModelTypeAssignment_0()); 
            // InternalDSL.g:1420:2: ( rule__Model__TargetModelTypeAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1420:3: rule__Model__TargetModelTypeAssignment_0
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
    // InternalDSL.g:1428:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1432:1: ( rule__Model__Group__1__Impl )
            // InternalDSL.g:1433:2: rule__Model__Group__1__Impl
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
    // InternalDSL.g:1439:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1443:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDSL.g:1444:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDSL.g:1444:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDSL.g:1445:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDSL.g:1446:2: ( rule__Model__ElementsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SL_COMMENT||LA15_0==17||LA15_0==19||(LA15_0>=26 && LA15_0<=27)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1446:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDSL.g:1455:1: rule__TargetModelTypeDef__Group__0 : rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 ;
    public final void rule__TargetModelTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1459:1: ( rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1 )
            // InternalDSL.g:1460:2: rule__TargetModelTypeDef__Group__0__Impl rule__TargetModelTypeDef__Group__1
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
    // InternalDSL.g:1467:1: rule__TargetModelTypeDef__Group__0__Impl : ( 'target' ) ;
    public final void rule__TargetModelTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1471:1: ( ( 'target' ) )
            // InternalDSL.g:1472:1: ( 'target' )
            {
            // InternalDSL.g:1472:1: ( 'target' )
            // InternalDSL.g:1473:2: 'target'
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
    // InternalDSL.g:1482:1: rule__TargetModelTypeDef__Group__1 : rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 ;
    public final void rule__TargetModelTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1486:1: ( rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2 )
            // InternalDSL.g:1487:2: rule__TargetModelTypeDef__Group__1__Impl rule__TargetModelTypeDef__Group__2
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
    // InternalDSL.g:1494:1: rule__TargetModelTypeDef__Group__1__Impl : ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1498:1: ( ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) ) )
            // InternalDSL.g:1499:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            {
            // InternalDSL.g:1499:1: ( ( rule__TargetModelTypeDef__TypeAssignment_1 ) )
            // InternalDSL.g:1500:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeAssignment_1()); 
            // InternalDSL.g:1501:2: ( rule__TargetModelTypeDef__TypeAssignment_1 )
            // InternalDSL.g:1501:3: rule__TargetModelTypeDef__TypeAssignment_1
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
    // InternalDSL.g:1509:1: rule__TargetModelTypeDef__Group__2 : rule__TargetModelTypeDef__Group__2__Impl ;
    public final void rule__TargetModelTypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1513:1: ( rule__TargetModelTypeDef__Group__2__Impl )
            // InternalDSL.g:1514:2: rule__TargetModelTypeDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group__2__Impl();

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
    // InternalDSL.g:1520:1: rule__TargetModelTypeDef__Group__2__Impl : ( ( rule__TargetModelTypeDef__Group_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1524:1: ( ( ( rule__TargetModelTypeDef__Group_2__0 )? ) )
            // InternalDSL.g:1525:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            {
            // InternalDSL.g:1525:1: ( ( rule__TargetModelTypeDef__Group_2__0 )? )
            // InternalDSL.g:1526:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2()); 
            // InternalDSL.g:1527:2: ( rule__TargetModelTypeDef__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:1527:3: rule__TargetModelTypeDef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetModelTypeDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__0"
    // InternalDSL.g:1536:1: rule__TargetModelTypeDef__Group_2__0 : rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1540:1: ( rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1 )
            // InternalDSL.g:1541:2: rule__TargetModelTypeDef__Group_2__0__Impl rule__TargetModelTypeDef__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__TargetModelTypeDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2__1();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__0"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__0__Impl"
    // InternalDSL.g:1548:1: rule__TargetModelTypeDef__Group_2__0__Impl : ( 'using' ) ;
    public final void rule__TargetModelTypeDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1552:1: ( ( 'using' ) )
            // InternalDSL.g:1553:1: ( 'using' )
            {
            // InternalDSL.g:1553:1: ( 'using' )
            // InternalDSL.g:1554:2: 'using'
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__0__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__1"
    // InternalDSL.g:1563:1: rule__TargetModelTypeDef__Group_2__1 : rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1567:1: ( rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2 )
            // InternalDSL.g:1568:2: rule__TargetModelTypeDef__Group_2__1__Impl rule__TargetModelTypeDef__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__TargetModelTypeDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2__2();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__1"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__1__Impl"
    // InternalDSL.g:1575:1: rule__TargetModelTypeDef__Group_2__1__Impl : ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1579:1: ( ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) ) )
            // InternalDSL.g:1580:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            {
            // InternalDSL.g:1580:1: ( ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 ) )
            // InternalDSL.g:1581:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_2_1()); 
            // InternalDSL.g:1582:2: ( rule__TargetModelTypeDef__TypeContainerAssignment_2_1 )
            // InternalDSL.g:1582:3: rule__TargetModelTypeDef__TypeContainerAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__TypeContainerAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__1__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__2"
    // InternalDSL.g:1590:1: rule__TargetModelTypeDef__Group_2__2 : rule__TargetModelTypeDef__Group_2__2__Impl ;
    public final void rule__TargetModelTypeDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1594:1: ( rule__TargetModelTypeDef__Group_2__2__Impl )
            // InternalDSL.g:1595:2: rule__TargetModelTypeDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2__2__Impl();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__2"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2__2__Impl"
    // InternalDSL.g:1601:1: rule__TargetModelTypeDef__Group_2__2__Impl : ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) ;
    public final void rule__TargetModelTypeDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1605:1: ( ( ( rule__TargetModelTypeDef__Group_2_2__0 )? ) )
            // InternalDSL.g:1606:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            {
            // InternalDSL.g:1606:1: ( ( rule__TargetModelTypeDef__Group_2_2__0 )? )
            // InternalDSL.g:1607:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getGroup_2_2()); 
            // InternalDSL.g:1608:2: ( rule__TargetModelTypeDef__Group_2_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:1608:3: rule__TargetModelTypeDef__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetModelTypeDef__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__Group_2__2__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__0"
    // InternalDSL.g:1617:1: rule__TargetModelTypeDef__Group_2_2__0 : rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 ;
    public final void rule__TargetModelTypeDef__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1621:1: ( rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1 )
            // InternalDSL.g:1622:2: rule__TargetModelTypeDef__Group_2_2__0__Impl rule__TargetModelTypeDef__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__TargetModelTypeDef__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__1();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__0"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__0__Impl"
    // InternalDSL.g:1629:1: rule__TargetModelTypeDef__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1633:1: ( ( ',' ) )
            // InternalDSL.g:1634:1: ( ',' )
            {
            // InternalDSL.g:1634:1: ( ',' )
            // InternalDSL.g:1635:2: ','
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__0__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__1"
    // InternalDSL.g:1644:1: rule__TargetModelTypeDef__Group_2_2__1 : rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 ;
    public final void rule__TargetModelTypeDef__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1648:1: ( rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2 )
            // InternalDSL.g:1649:2: rule__TargetModelTypeDef__Group_2_2__1__Impl rule__TargetModelTypeDef__Group_2_2__2
            {
            pushFollow(FOLLOW_8);
            rule__TargetModelTypeDef__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__2();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__1"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__1__Impl"
    // InternalDSL.g:1656:1: rule__TargetModelTypeDef__Group_2_2__1__Impl : ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1660:1: ( ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) ) )
            // InternalDSL.g:1661:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            {
            // InternalDSL.g:1661:1: ( ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 ) )
            // InternalDSL.g:1662:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAssignment_2_2_1()); 
            // InternalDSL.g:1663:2: ( rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 )
            // InternalDSL.g:1663:3: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__1__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__2"
    // InternalDSL.g:1671:1: rule__TargetModelTypeDef__Group_2_2__2 : rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 ;
    public final void rule__TargetModelTypeDef__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1675:1: ( rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3 )
            // InternalDSL.g:1676:2: rule__TargetModelTypeDef__Group_2_2__2__Impl rule__TargetModelTypeDef__Group_2_2__3
            {
            pushFollow(FOLLOW_7);
            rule__TargetModelTypeDef__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__3();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__2"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__2__Impl"
    // InternalDSL.g:1683:1: rule__TargetModelTypeDef__Group_2_2__2__Impl : ( ',' ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1687:1: ( ( ',' ) )
            // InternalDSL.g:1688:1: ( ',' )
            {
            // InternalDSL.g:1688:1: ( ',' )
            // InternalDSL.g:1689:2: ','
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__2__Impl"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__3"
    // InternalDSL.g:1698:1: rule__TargetModelTypeDef__Group_2_2__3 : rule__TargetModelTypeDef__Group_2_2__3__Impl ;
    public final void rule__TargetModelTypeDef__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1702:1: ( rule__TargetModelTypeDef__Group_2_2__3__Impl )
            // InternalDSL.g:1703:2: rule__TargetModelTypeDef__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__3"


    // $ANTLR start "rule__TargetModelTypeDef__Group_2_2__3__Impl"
    // InternalDSL.g:1709:1: rule__TargetModelTypeDef__Group_2_2__3__Impl : ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) ;
    public final void rule__TargetModelTypeDef__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1713:1: ( ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) ) )
            // InternalDSL.g:1714:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            {
            // InternalDSL.g:1714:1: ( ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 ) )
            // InternalDSL.g:1715:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelAssignment_2_2_3()); 
            // InternalDSL.g:1716:2: ( rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 )
            // InternalDSL.g:1716:3: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3
            {
            pushFollow(FOLLOW_2);
            rule__TargetModelTypeDef__UsageModelAssignment_2_2_3();

            state._fsp--;


            }

             after(grammarAccess.getTargetModelTypeDefAccess().getUsageModelAssignment_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__Group_2_2__3__Impl"


    // $ANTLR start "rule__AbstractElement__Group_4__0"
    // InternalDSL.g:1725:1: rule__AbstractElement__Group_4__0 : rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 ;
    public final void rule__AbstractElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1729:1: ( rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1 )
            // InternalDSL.g:1730:2: rule__AbstractElement__Group_4__0__Impl rule__AbstractElement__Group_4__1
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
    // InternalDSL.g:1737:1: rule__AbstractElement__Group_4__0__Impl : ( () ) ;
    public final void rule__AbstractElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1741:1: ( ( () ) )
            // InternalDSL.g:1742:1: ( () )
            {
            // InternalDSL.g:1742:1: ( () )
            // InternalDSL.g:1743:2: ()
            {
             before(grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0()); 
            // InternalDSL.g:1744:2: ()
            // InternalDSL.g:1744:3: 
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
    // InternalDSL.g:1752:1: rule__AbstractElement__Group_4__1 : rule__AbstractElement__Group_4__1__Impl ;
    public final void rule__AbstractElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1756:1: ( rule__AbstractElement__Group_4__1__Impl )
            // InternalDSL.g:1757:2: rule__AbstractElement__Group_4__1__Impl
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
    // InternalDSL.g:1763:1: rule__AbstractElement__Group_4__1__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__AbstractElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1767:1: ( ( RULE_SL_COMMENT ) )
            // InternalDSL.g:1768:1: ( RULE_SL_COMMENT )
            {
            // InternalDSL.g:1768:1: ( RULE_SL_COMMENT )
            // InternalDSL.g:1769:2: RULE_SL_COMMENT
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
    // InternalDSL.g:1779:1: rule__CharacteristicType__Group__0 : rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 ;
    public final void rule__CharacteristicType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1783:1: ( rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1 )
            // InternalDSL.g:1784:2: rule__CharacteristicType__Group__0__Impl rule__CharacteristicType__Group__1
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
    // InternalDSL.g:1791:1: rule__CharacteristicType__Group__0__Impl : ( 'type' ) ;
    public final void rule__CharacteristicType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1795:1: ( ( 'type' ) )
            // InternalDSL.g:1796:1: ( 'type' )
            {
            // InternalDSL.g:1796:1: ( 'type' )
            // InternalDSL.g:1797:2: 'type'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDSL.g:1806:1: rule__CharacteristicType__Group__1 : rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 ;
    public final void rule__CharacteristicType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1810:1: ( rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2 )
            // InternalDSL.g:1811:2: rule__CharacteristicType__Group__1__Impl rule__CharacteristicType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSL.g:1818:1: rule__CharacteristicType__Group__1__Impl : ( ( rule__CharacteristicType__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1822:1: ( ( ( rule__CharacteristicType__NameAssignment_1 ) ) )
            // InternalDSL.g:1823:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1823:1: ( ( rule__CharacteristicType__NameAssignment_1 ) )
            // InternalDSL.g:1824:2: ( rule__CharacteristicType__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1825:2: ( rule__CharacteristicType__NameAssignment_1 )
            // InternalDSL.g:1825:3: rule__CharacteristicType__NameAssignment_1
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
    // InternalDSL.g:1833:1: rule__CharacteristicType__Group__2 : rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 ;
    public final void rule__CharacteristicType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1837:1: ( rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3 )
            // InternalDSL.g:1838:2: rule__CharacteristicType__Group__2__Impl rule__CharacteristicType__Group__3
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
    // InternalDSL.g:1845:1: rule__CharacteristicType__Group__2__Impl : ( ':' ) ;
    public final void rule__CharacteristicType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1849:1: ( ( ':' ) )
            // InternalDSL.g:1850:1: ( ':' )
            {
            // InternalDSL.g:1850:1: ( ':' )
            // InternalDSL.g:1851:2: ':'
            {
             before(grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1860:1: rule__CharacteristicType__Group__3 : rule__CharacteristicType__Group__3__Impl ;
    public final void rule__CharacteristicType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1864:1: ( rule__CharacteristicType__Group__3__Impl )
            // InternalDSL.g:1865:2: rule__CharacteristicType__Group__3__Impl
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
    // InternalDSL.g:1871:1: rule__CharacteristicType__Group__3__Impl : ( ( rule__CharacteristicType__RefAssignment_3 ) ) ;
    public final void rule__CharacteristicType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1875:1: ( ( ( rule__CharacteristicType__RefAssignment_3 ) ) )
            // InternalDSL.g:1876:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            {
            // InternalDSL.g:1876:1: ( ( rule__CharacteristicType__RefAssignment_3 ) )
            // InternalDSL.g:1877:2: ( rule__CharacteristicType__RefAssignment_3 )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefAssignment_3()); 
            // InternalDSL.g:1878:2: ( rule__CharacteristicType__RefAssignment_3 )
            // InternalDSL.g:1878:3: rule__CharacteristicType__RefAssignment_3
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
    // InternalDSL.g:1887:1: rule__CharacteristicClass__Group__0 : rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 ;
    public final void rule__CharacteristicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1891:1: ( rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1 )
            // InternalDSL.g:1892:2: rule__CharacteristicClass__Group__0__Impl rule__CharacteristicClass__Group__1
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
    // InternalDSL.g:1899:1: rule__CharacteristicClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__CharacteristicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1903:1: ( ( 'class' ) )
            // InternalDSL.g:1904:1: ( 'class' )
            {
            // InternalDSL.g:1904:1: ( 'class' )
            // InternalDSL.g:1905:2: 'class'
            {
             before(grammarAccess.getCharacteristicClassAccess().getClassKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSL.g:1914:1: rule__CharacteristicClass__Group__1 : rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 ;
    public final void rule__CharacteristicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1918:1: ( rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2 )
            // InternalDSL.g:1919:2: rule__CharacteristicClass__Group__1__Impl rule__CharacteristicClass__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:1926:1: rule__CharacteristicClass__Group__1__Impl : ( ( rule__CharacteristicClass__NameAssignment_1 ) ) ;
    public final void rule__CharacteristicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1930:1: ( ( ( rule__CharacteristicClass__NameAssignment_1 ) ) )
            // InternalDSL.g:1931:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            {
            // InternalDSL.g:1931:1: ( ( rule__CharacteristicClass__NameAssignment_1 ) )
            // InternalDSL.g:1932:2: ( rule__CharacteristicClass__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getNameAssignment_1()); 
            // InternalDSL.g:1933:2: ( rule__CharacteristicClass__NameAssignment_1 )
            // InternalDSL.g:1933:3: rule__CharacteristicClass__NameAssignment_1
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
    // InternalDSL.g:1941:1: rule__CharacteristicClass__Group__2 : rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 ;
    public final void rule__CharacteristicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1945:1: ( rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3 )
            // InternalDSL.g:1946:2: rule__CharacteristicClass__Group__2__Impl rule__CharacteristicClass__Group__3
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
    // InternalDSL.g:1953:1: rule__CharacteristicClass__Group__2__Impl : ( '{' ) ;
    public final void rule__CharacteristicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1957:1: ( ( '{' ) )
            // InternalDSL.g:1958:1: ( '{' )
            {
            // InternalDSL.g:1958:1: ( '{' )
            // InternalDSL.g:1959:2: '{'
            {
             before(grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:1968:1: rule__CharacteristicClass__Group__3 : rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 ;
    public final void rule__CharacteristicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1972:1: ( rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4 )
            // InternalDSL.g:1973:2: rule__CharacteristicClass__Group__3__Impl rule__CharacteristicClass__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSL.g:1980:1: rule__CharacteristicClass__Group__3__Impl : ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) ;
    public final void rule__CharacteristicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1984:1: ( ( ( rule__CharacteristicClass__MembersAssignment_3 ) ) )
            // InternalDSL.g:1985:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            {
            // InternalDSL.g:1985:1: ( ( rule__CharacteristicClass__MembersAssignment_3 ) )
            // InternalDSL.g:1986:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_3()); 
            // InternalDSL.g:1987:2: ( rule__CharacteristicClass__MembersAssignment_3 )
            // InternalDSL.g:1987:3: rule__CharacteristicClass__MembersAssignment_3
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
    // InternalDSL.g:1995:1: rule__CharacteristicClass__Group__4 : rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 ;
    public final void rule__CharacteristicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1999:1: ( rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5 )
            // InternalDSL.g:2000:2: rule__CharacteristicClass__Group__4__Impl rule__CharacteristicClass__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSL.g:2007:1: rule__CharacteristicClass__Group__4__Impl : ( ( rule__CharacteristicClass__Group_4__0 )* ) ;
    public final void rule__CharacteristicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2011:1: ( ( ( rule__CharacteristicClass__Group_4__0 )* ) )
            // InternalDSL.g:2012:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            {
            // InternalDSL.g:2012:1: ( ( rule__CharacteristicClass__Group_4__0 )* )
            // InternalDSL.g:2013:2: ( rule__CharacteristicClass__Group_4__0 )*
            {
             before(grammarAccess.getCharacteristicClassAccess().getGroup_4()); 
            // InternalDSL.g:2014:2: ( rule__CharacteristicClass__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:2014:3: rule__CharacteristicClass__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CharacteristicClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDSL.g:2022:1: rule__CharacteristicClass__Group__5 : rule__CharacteristicClass__Group__5__Impl ;
    public final void rule__CharacteristicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2026:1: ( rule__CharacteristicClass__Group__5__Impl )
            // InternalDSL.g:2027:2: rule__CharacteristicClass__Group__5__Impl
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
    // InternalDSL.g:2033:1: rule__CharacteristicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__CharacteristicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2037:1: ( ( '}' ) )
            // InternalDSL.g:2038:1: ( '}' )
            {
            // InternalDSL.g:2038:1: ( '}' )
            // InternalDSL.g:2039:2: '}'
            {
             before(grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:2049:1: rule__CharacteristicClass__Group_4__0 : rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 ;
    public final void rule__CharacteristicClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2053:1: ( rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1 )
            // InternalDSL.g:2054:2: rule__CharacteristicClass__Group_4__0__Impl rule__CharacteristicClass__Group_4__1
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
    // InternalDSL.g:2061:1: rule__CharacteristicClass__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2065:1: ( ( ',' ) )
            // InternalDSL.g:2066:1: ( ',' )
            {
            // InternalDSL.g:2066:1: ( ',' )
            // InternalDSL.g:2067:2: ','
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
    // InternalDSL.g:2076:1: rule__CharacteristicClass__Group_4__1 : rule__CharacteristicClass__Group_4__1__Impl ;
    public final void rule__CharacteristicClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2080:1: ( rule__CharacteristicClass__Group_4__1__Impl )
            // InternalDSL.g:2081:2: rule__CharacteristicClass__Group_4__1__Impl
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
    // InternalDSL.g:2087:1: rule__CharacteristicClass__Group_4__1__Impl : ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) ;
    public final void rule__CharacteristicClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2091:1: ( ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) ) )
            // InternalDSL.g:2092:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            {
            // InternalDSL.g:2092:1: ( ( rule__CharacteristicClass__MembersAssignment_4_1 ) )
            // InternalDSL.g:2093:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            {
             before(grammarAccess.getCharacteristicClassAccess().getMembersAssignment_4_1()); 
            // InternalDSL.g:2094:2: ( rule__CharacteristicClass__MembersAssignment_4_1 )
            // InternalDSL.g:2094:3: rule__CharacteristicClass__MembersAssignment_4_1
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
    // InternalDSL.g:2103:1: rule__CharacteristicTypeSelector__Group__0 : rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 ;
    public final void rule__CharacteristicTypeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2107:1: ( rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1 )
            // InternalDSL.g:2108:2: rule__CharacteristicTypeSelector__Group__0__Impl rule__CharacteristicTypeSelector__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDSL.g:2115:1: rule__CharacteristicTypeSelector__Group__0__Impl : ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2119:1: ( ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) ) )
            // InternalDSL.g:2120:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            {
            // InternalDSL.g:2120:1: ( ( rule__CharacteristicTypeSelector__RefAssignment_0 ) )
            // InternalDSL.g:2121:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefAssignment_0()); 
            // InternalDSL.g:2122:2: ( rule__CharacteristicTypeSelector__RefAssignment_0 )
            // InternalDSL.g:2122:3: rule__CharacteristicTypeSelector__RefAssignment_0
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
    // InternalDSL.g:2130:1: rule__CharacteristicTypeSelector__Group__1 : rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 ;
    public final void rule__CharacteristicTypeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2134:1: ( rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2 )
            // InternalDSL.g:2135:2: rule__CharacteristicTypeSelector__Group__1__Impl rule__CharacteristicTypeSelector__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDSL.g:2142:1: rule__CharacteristicTypeSelector__Group__1__Impl : ( '.' ) ;
    public final void rule__CharacteristicTypeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2146:1: ( ( '.' ) )
            // InternalDSL.g:2147:1: ( '.' )
            {
            // InternalDSL.g:2147:1: ( '.' )
            // InternalDSL.g:2148:2: '.'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSL.g:2157:1: rule__CharacteristicTypeSelector__Group__2 : rule__CharacteristicTypeSelector__Group__2__Impl ;
    public final void rule__CharacteristicTypeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2161:1: ( rule__CharacteristicTypeSelector__Group__2__Impl )
            // InternalDSL.g:2162:2: rule__CharacteristicTypeSelector__Group__2__Impl
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
    // InternalDSL.g:2168:1: rule__CharacteristicTypeSelector__Group__2__Impl : ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2172:1: ( ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) ) )
            // InternalDSL.g:2173:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            {
            // InternalDSL.g:2173:1: ( ( rule__CharacteristicTypeSelector__Alternatives_2 ) )
            // InternalDSL.g:2174:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getAlternatives_2()); 
            // InternalDSL.g:2175:2: ( rule__CharacteristicTypeSelector__Alternatives_2 )
            // InternalDSL.g:2175:3: rule__CharacteristicTypeSelector__Alternatives_2
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
    // InternalDSL.g:2184:1: rule__CharacteristicTypeSelector__Group_2_0__0 : rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2188:1: ( rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1 )
            // InternalDSL.g:2189:2: rule__CharacteristicTypeSelector__Group_2_0__0__Impl rule__CharacteristicTypeSelector__Group_2_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSL.g:2196:1: rule__CharacteristicTypeSelector__Group_2_0__0__Impl : ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2200:1: ( ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? ) )
            // InternalDSL.g:2201:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            {
            // InternalDSL.g:2201:1: ( ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )? )
            // InternalDSL.g:2202:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedAssignment_2_0_0()); 
            // InternalDSL.g:2203:2: ( rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:2203:3: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0
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
    // InternalDSL.g:2211:1: rule__CharacteristicTypeSelector__Group_2_0__1 : rule__CharacteristicTypeSelector__Group_2_0__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2215:1: ( rule__CharacteristicTypeSelector__Group_2_0__1__Impl )
            // InternalDSL.g:2216:2: rule__CharacteristicTypeSelector__Group_2_0__1__Impl
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
    // InternalDSL.g:2222:1: rule__CharacteristicTypeSelector__Group_2_0__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2226:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) ) )
            // InternalDSL.g:2227:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            {
            // InternalDSL.g:2227:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 ) )
            // InternalDSL.g:2228:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_0_1()); 
            // InternalDSL.g:2229:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 )
            // InternalDSL.g:2229:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1
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
    // InternalDSL.g:2238:1: rule__CharacteristicTypeSelector__Group_2_1__0 : rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2242:1: ( rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1 )
            // InternalDSL.g:2243:2: rule__CharacteristicTypeSelector__Group_2_1__0__Impl rule__CharacteristicTypeSelector__Group_2_1__1
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
    // InternalDSL.g:2250:1: rule__CharacteristicTypeSelector__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2254:1: ( ( '[' ) )
            // InternalDSL.g:2255:1: ( '[' )
            {
            // InternalDSL.g:2255:1: ( '[' )
            // InternalDSL.g:2256:2: '['
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSL.g:2265:1: rule__CharacteristicTypeSelector__Group_2_1__1 : rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2269:1: ( rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2 )
            // InternalDSL.g:2270:2: rule__CharacteristicTypeSelector__Group_2_1__1__Impl rule__CharacteristicTypeSelector__Group_2_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDSL.g:2277:1: rule__CharacteristicTypeSelector__Group_2_1__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2281:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) ) )
            // InternalDSL.g:2282:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:2282:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 ) )
            // InternalDSL.g:2283:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_1()); 
            // InternalDSL.g:2284:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 )
            // InternalDSL.g:2284:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1
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
    // InternalDSL.g:2292:1: rule__CharacteristicTypeSelector__Group_2_1__2 : rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2296:1: ( rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3 )
            // InternalDSL.g:2297:2: rule__CharacteristicTypeSelector__Group_2_1__2__Impl rule__CharacteristicTypeSelector__Group_2_1__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDSL.g:2304:1: rule__CharacteristicTypeSelector__Group_2_1__2__Impl : ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2308:1: ( ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* ) )
            // InternalDSL.g:2309:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            {
            // InternalDSL.g:2309:1: ( ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )* )
            // InternalDSL.g:2310:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getGroup_2_1_2()); 
            // InternalDSL.g:2311:2: ( rule__CharacteristicTypeSelector__Group_2_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDSL.g:2311:3: rule__CharacteristicTypeSelector__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CharacteristicTypeSelector__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDSL.g:2319:1: rule__CharacteristicTypeSelector__Group_2_1__3 : rule__CharacteristicTypeSelector__Group_2_1__3__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2323:1: ( rule__CharacteristicTypeSelector__Group_2_1__3__Impl )
            // InternalDSL.g:2324:2: rule__CharacteristicTypeSelector__Group_2_1__3__Impl
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
    // InternalDSL.g:2330:1: rule__CharacteristicTypeSelector__Group_2_1__3__Impl : ( ']' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2334:1: ( ( ']' ) )
            // InternalDSL.g:2335:1: ( ']' )
            {
            // InternalDSL.g:2335:1: ( ']' )
            // InternalDSL.g:2336:2: ']'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDSL.g:2346:1: rule__CharacteristicTypeSelector__Group_2_1_2__0 : rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2350:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1 )
            // InternalDSL.g:2351:2: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl rule__CharacteristicTypeSelector__Group_2_1_2__1
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
    // InternalDSL.g:2358:1: rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2362:1: ( ( ',' ) )
            // InternalDSL.g:2363:1: ( ',' )
            {
            // InternalDSL.g:2363:1: ( ',' )
            // InternalDSL.g:2364:2: ','
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
    // InternalDSL.g:2373:1: rule__CharacteristicTypeSelector__Group_2_1_2__1 : rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2377:1: ( rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl )
            // InternalDSL.g:2378:2: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl
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
    // InternalDSL.g:2384:1: rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl : ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2388:1: ( ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) ) )
            // InternalDSL.g:2389:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            {
            // InternalDSL.g:2389:1: ( ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 ) )
            // InternalDSL.g:2390:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsAssignment_2_1_2_1()); 
            // InternalDSL.g:2391:2: ( rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 )
            // InternalDSL.g:2391:3: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1
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
    // InternalDSL.g:2400:1: rule__CharacteristicTypeSelector__Group_2_2__0 : rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2404:1: ( rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1 )
            // InternalDSL.g:2405:2: rule__CharacteristicTypeSelector__Group_2_2__0__Impl rule__CharacteristicTypeSelector__Group_2_2__1
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
    // InternalDSL.g:2412:1: rule__CharacteristicTypeSelector__Group_2_2__0__Impl : ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2416:1: ( ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) ) )
            // InternalDSL.g:2417:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            {
            // InternalDSL.g:2417:1: ( ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 ) )
            // InternalDSL.g:2418:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorAssignment_2_2_0()); 
            // InternalDSL.g:2419:2: ( rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 )
            // InternalDSL.g:2419:3: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0
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
    // InternalDSL.g:2427:1: rule__CharacteristicTypeSelector__Group_2_2__1 : rule__CharacteristicTypeSelector__Group_2_2__1__Impl ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2431:1: ( rule__CharacteristicTypeSelector__Group_2_2__1__Impl )
            // InternalDSL.g:2432:2: rule__CharacteristicTypeSelector__Group_2_2__1__Impl
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
    // InternalDSL.g:2438:1: rule__CharacteristicTypeSelector__Group_2_2__1__Impl : ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) ;
    public final void rule__CharacteristicTypeSelector__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2442:1: ( ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) ) )
            // InternalDSL.g:2443:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            {
            // InternalDSL.g:2443:1: ( ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 ) )
            // InternalDSL.g:2444:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableAssignment_2_2_1()); 
            // InternalDSL.g:2445:2: ( rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 )
            // InternalDSL.g:2445:3: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1
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
    // InternalDSL.g:2454:1: rule__CharacteristicSet__Group__0 : rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 ;
    public final void rule__CharacteristicSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2458:1: ( rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1 )
            // InternalDSL.g:2459:2: rule__CharacteristicSet__Group__0__Impl rule__CharacteristicSet__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDSL.g:2466:1: rule__CharacteristicSet__Group__0__Impl : ( ( rule__CharacteristicSet__NameAssignment_0 ) ) ;
    public final void rule__CharacteristicSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2470:1: ( ( ( rule__CharacteristicSet__NameAssignment_0 ) ) )
            // InternalDSL.g:2471:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            {
            // InternalDSL.g:2471:1: ( ( rule__CharacteristicSet__NameAssignment_0 ) )
            // InternalDSL.g:2472:2: ( rule__CharacteristicSet__NameAssignment_0 )
            {
             before(grammarAccess.getCharacteristicSetAccess().getNameAssignment_0()); 
            // InternalDSL.g:2473:2: ( rule__CharacteristicSet__NameAssignment_0 )
            // InternalDSL.g:2473:3: rule__CharacteristicSet__NameAssignment_0
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
    // InternalDSL.g:2481:1: rule__CharacteristicSet__Group__1 : rule__CharacteristicSet__Group__1__Impl ;
    public final void rule__CharacteristicSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2485:1: ( rule__CharacteristicSet__Group__1__Impl )
            // InternalDSL.g:2486:2: rule__CharacteristicSet__Group__1__Impl
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
    // InternalDSL.g:2492:1: rule__CharacteristicSet__Group__1__Impl : ( '{}' ) ;
    public final void rule__CharacteristicSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2496:1: ( ( '{}' ) )
            // InternalDSL.g:2497:1: ( '{}' )
            {
            // InternalDSL.g:2497:1: ( '{}' )
            // InternalDSL.g:2498:2: '{}'
            {
             before(grammarAccess.getCharacteristicSetAccess().getLeftCurlyBracketRightCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:2508:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2512:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalDSL.g:2513:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:2520:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2524:1: ( ( 'import' ) )
            // InternalDSL.g:2525:1: ( 'import' )
            {
            // InternalDSL.g:2525:1: ( 'import' )
            // InternalDSL.g:2526:2: 'import'
            {
             before(grammarAccess.getIncludeAccess().getImportKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:2535:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2539:1: ( rule__Include__Group__1__Impl )
            // InternalDSL.g:2540:2: rule__Include__Group__1__Impl
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
    // InternalDSL.g:2546:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2550:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalDSL.g:2551:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalDSL.g:2551:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalDSL.g:2552:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalDSL.g:2553:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalDSL.g:2553:3: rule__Include__ImportURIAssignment_1
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
    // InternalDSL.g:2562:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2566:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDSL.g:2567:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalDSL.g:2574:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2578:1: ( ( 'constraint' ) )
            // InternalDSL.g:2579:1: ( 'constraint' )
            {
            // InternalDSL.g:2579:1: ( 'constraint' )
            // InternalDSL.g:2580:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:2589:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2593:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDSL.g:2594:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:2601:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2605:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDSL.g:2606:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDSL.g:2606:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDSL.g:2607:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDSL.g:2608:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDSL.g:2608:3: rule__Constraint__NameAssignment_1
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
    // InternalDSL.g:2616:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2620:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDSL.g:2621:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:2628:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2632:1: ( ( '{' ) )
            // InternalDSL.g:2633:1: ( '{' )
            {
            // InternalDSL.g:2633:1: ( '{' )
            // InternalDSL.g:2634:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:2643:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2647:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDSL.g:2648:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:2655:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__RuleAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2659:1: ( ( ( rule__Constraint__RuleAssignment_3 ) ) )
            // InternalDSL.g:2660:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            {
            // InternalDSL.g:2660:1: ( ( rule__Constraint__RuleAssignment_3 ) )
            // InternalDSL.g:2661:2: ( rule__Constraint__RuleAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getRuleAssignment_3()); 
            // InternalDSL.g:2662:2: ( rule__Constraint__RuleAssignment_3 )
            // InternalDSL.g:2662:3: rule__Constraint__RuleAssignment_3
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
    // InternalDSL.g:2670:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2674:1: ( rule__Constraint__Group__4__Impl )
            // InternalDSL.g:2675:2: rule__Constraint__Group__4__Impl
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
    // InternalDSL.g:2681:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2685:1: ( ( '}' ) )
            // InternalDSL.g:2686:1: ( '}' )
            {
            // InternalDSL.g:2686:1: ( '}' )
            // InternalDSL.g:2687:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:2697:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2701:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDSL.g:2702:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:2709:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DataSelectorsAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2713:1: ( ( ( rule__Rule__DataSelectorsAssignment_0 ) ) )
            // InternalDSL.g:2714:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            {
            // InternalDSL.g:2714:1: ( ( rule__Rule__DataSelectorsAssignment_0 ) )
            // InternalDSL.g:2715:2: ( rule__Rule__DataSelectorsAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_0()); 
            // InternalDSL.g:2716:2: ( rule__Rule__DataSelectorsAssignment_0 )
            // InternalDSL.g:2716:3: rule__Rule__DataSelectorsAssignment_0
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
    // InternalDSL.g:2724:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2728:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDSL.g:2729:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:2736:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2740:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // InternalDSL.g:2741:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // InternalDSL.g:2741:1: ( ( rule__Rule__Group_1__0 )* )
            // InternalDSL.g:2742:2: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // InternalDSL.g:2743:2: ( rule__Rule__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:2743:3: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDSL.g:2751:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2755:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalDSL.g:2756:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:2763:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__StatementAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2767:1: ( ( ( rule__Rule__StatementAssignment_2 ) ) )
            // InternalDSL.g:2768:1: ( ( rule__Rule__StatementAssignment_2 ) )
            {
            // InternalDSL.g:2768:1: ( ( rule__Rule__StatementAssignment_2 ) )
            // InternalDSL.g:2769:2: ( rule__Rule__StatementAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getStatementAssignment_2()); 
            // InternalDSL.g:2770:2: ( rule__Rule__StatementAssignment_2 )
            // InternalDSL.g:2770:3: rule__Rule__StatementAssignment_2
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
    // InternalDSL.g:2778:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2782:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalDSL.g:2783:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:2790:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2794:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_3 ) ) )
            // InternalDSL.g:2795:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            {
            // InternalDSL.g:2795:1: ( ( rule__Rule__DestinationSelectorsAssignment_3 ) )
            // InternalDSL.g:2796:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_3()); 
            // InternalDSL.g:2797:2: ( rule__Rule__DestinationSelectorsAssignment_3 )
            // InternalDSL.g:2797:3: rule__Rule__DestinationSelectorsAssignment_3
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
    // InternalDSL.g:2805:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2809:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalDSL.g:2810:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:2817:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2821:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // InternalDSL.g:2822:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // InternalDSL.g:2822:1: ( ( rule__Rule__Group_4__0 )* )
            // InternalDSL.g:2823:2: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // InternalDSL.g:2824:2: ( rule__Rule__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDSL.g:2824:3: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalDSL.g:2832:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2836:1: ( rule__Rule__Group__5__Impl )
            // InternalDSL.g:2837:2: rule__Rule__Group__5__Impl
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
    // InternalDSL.g:2843:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ConditionAssignment_5 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2847:1: ( ( ( rule__Rule__ConditionAssignment_5 )? ) )
            // InternalDSL.g:2848:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            {
            // InternalDSL.g:2848:1: ( ( rule__Rule__ConditionAssignment_5 )? )
            // InternalDSL.g:2849:2: ( rule__Rule__ConditionAssignment_5 )?
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_5()); 
            // InternalDSL.g:2850:2: ( rule__Rule__ConditionAssignment_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDSL.g:2850:3: rule__Rule__ConditionAssignment_5
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
    // InternalDSL.g:2859:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2863:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalDSL.g:2864:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:2871:1: rule__Rule__Group_1__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2875:1: ( ( '&' ) )
            // InternalDSL.g:2876:1: ( '&' )
            {
            // InternalDSL.g:2876:1: ( '&' )
            // InternalDSL.g:2877:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2886:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2890:1: ( rule__Rule__Group_1__1__Impl )
            // InternalDSL.g:2891:2: rule__Rule__Group_1__1__Impl
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
    // InternalDSL.g:2897:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2901:1: ( ( ( rule__Rule__DataSelectorsAssignment_1_1 ) ) )
            // InternalDSL.g:2902:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            {
            // InternalDSL.g:2902:1: ( ( rule__Rule__DataSelectorsAssignment_1_1 ) )
            // InternalDSL.g:2903:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getDataSelectorsAssignment_1_1()); 
            // InternalDSL.g:2904:2: ( rule__Rule__DataSelectorsAssignment_1_1 )
            // InternalDSL.g:2904:3: rule__Rule__DataSelectorsAssignment_1_1
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
    // InternalDSL.g:2913:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2917:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalDSL.g:2918:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:2925:1: rule__Rule__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2929:1: ( ( '&' ) )
            // InternalDSL.g:2930:1: ( '&' )
            {
            // InternalDSL.g:2930:1: ( '&' )
            // InternalDSL.g:2931:2: '&'
            {
             before(grammarAccess.getRuleAccess().getAmpersandKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2940:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2944:1: ( rule__Rule__Group_4__1__Impl )
            // InternalDSL.g:2945:2: rule__Rule__Group_4__1__Impl
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
    // InternalDSL.g:2951:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2955:1: ( ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) ) )
            // InternalDSL.g:2956:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            {
            // InternalDSL.g:2956:1: ( ( rule__Rule__DestinationSelectorsAssignment_4_1 ) )
            // InternalDSL.g:2957:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getDestinationSelectorsAssignment_4_1()); 
            // InternalDSL.g:2958:2: ( rule__Rule__DestinationSelectorsAssignment_4_1 )
            // InternalDSL.g:2958:3: rule__Rule__DestinationSelectorsAssignment_4_1
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
    // InternalDSL.g:2967:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2971:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalDSL.g:2972:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
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
    // InternalDSL.g:2979:1: rule__AttributeSelector__Group__0__Impl : ( 'data.attribute.' ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2983:1: ( ( 'data.attribute.' ) )
            // InternalDSL.g:2984:1: ( 'data.attribute.' )
            {
            // InternalDSL.g:2984:1: ( 'data.attribute.' )
            // InternalDSL.g:2985:2: 'data.attribute.'
            {
             before(grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:2994:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2998:1: ( rule__AttributeSelector__Group__1__Impl )
            // InternalDSL.g:2999:2: rule__AttributeSelector__Group__1__Impl
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
    // InternalDSL.g:3005:1: rule__AttributeSelector__Group__1__Impl : ( ( rule__AttributeSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3009:1: ( ( ( rule__AttributeSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:3010:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:3010:1: ( ( rule__AttributeSelector__RefAssignment_1 ) )
            // InternalDSL.g:3011:2: ( rule__AttributeSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:3012:2: ( rule__AttributeSelector__RefAssignment_1 )
            // InternalDSL.g:3012:3: rule__AttributeSelector__RefAssignment_1
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
    // InternalDSL.g:3021:1: rule__AttributeClassSelector__Group__0 : rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 ;
    public final void rule__AttributeClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3025:1: ( rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1 )
            // InternalDSL.g:3026:2: rule__AttributeClassSelector__Group__0__Impl rule__AttributeClassSelector__Group__1
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
    // InternalDSL.g:3033:1: rule__AttributeClassSelector__Group__0__Impl : ( 'data.class.' ) ;
    public final void rule__AttributeClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3037:1: ( ( 'data.class.' ) )
            // InternalDSL.g:3038:1: ( 'data.class.' )
            {
            // InternalDSL.g:3038:1: ( 'data.class.' )
            // InternalDSL.g:3039:2: 'data.class.'
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:3048:1: rule__AttributeClassSelector__Group__1 : rule__AttributeClassSelector__Group__1__Impl ;
    public final void rule__AttributeClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3052:1: ( rule__AttributeClassSelector__Group__1__Impl )
            // InternalDSL.g:3053:2: rule__AttributeClassSelector__Group__1__Impl
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
    // InternalDSL.g:3059:1: rule__AttributeClassSelector__Group__1__Impl : ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) ;
    public final void rule__AttributeClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3063:1: ( ( ( rule__AttributeClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:3064:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:3064:1: ( ( rule__AttributeClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:3065:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:3066:2: ( rule__AttributeClassSelector__RefAssignment_1 )
            // InternalDSL.g:3066:3: rule__AttributeClassSelector__RefAssignment_1
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
    // InternalDSL.g:3075:1: rule__PropertySelector__Group__0 : rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 ;
    public final void rule__PropertySelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3079:1: ( rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1 )
            // InternalDSL.g:3080:2: rule__PropertySelector__Group__0__Impl rule__PropertySelector__Group__1
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
    // InternalDSL.g:3087:1: rule__PropertySelector__Group__0__Impl : ( 'node.property.' ) ;
    public final void rule__PropertySelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3091:1: ( ( 'node.property.' ) )
            // InternalDSL.g:3092:1: ( 'node.property.' )
            {
            // InternalDSL.g:3092:1: ( 'node.property.' )
            // InternalDSL.g:3093:2: 'node.property.'
            {
             before(grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:3102:1: rule__PropertySelector__Group__1 : rule__PropertySelector__Group__1__Impl ;
    public final void rule__PropertySelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3106:1: ( rule__PropertySelector__Group__1__Impl )
            // InternalDSL.g:3107:2: rule__PropertySelector__Group__1__Impl
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
    // InternalDSL.g:3113:1: rule__PropertySelector__Group__1__Impl : ( ( rule__PropertySelector__RefAssignment_1 ) ) ;
    public final void rule__PropertySelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3117:1: ( ( ( rule__PropertySelector__RefAssignment_1 ) ) )
            // InternalDSL.g:3118:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:3118:1: ( ( rule__PropertySelector__RefAssignment_1 ) )
            // InternalDSL.g:3119:2: ( rule__PropertySelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertySelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:3120:2: ( rule__PropertySelector__RefAssignment_1 )
            // InternalDSL.g:3120:3: rule__PropertySelector__RefAssignment_1
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
    // InternalDSL.g:3129:1: rule__PropertyClassSelector__Group__0 : rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 ;
    public final void rule__PropertyClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3133:1: ( rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1 )
            // InternalDSL.g:3134:2: rule__PropertyClassSelector__Group__0__Impl rule__PropertyClassSelector__Group__1
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
    // InternalDSL.g:3141:1: rule__PropertyClassSelector__Group__0__Impl : ( 'node.class.' ) ;
    public final void rule__PropertyClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3145:1: ( ( 'node.class.' ) )
            // InternalDSL.g:3146:1: ( 'node.class.' )
            {
            // InternalDSL.g:3146:1: ( 'node.class.' )
            // InternalDSL.g:3147:2: 'node.class.'
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:3156:1: rule__PropertyClassSelector__Group__1 : rule__PropertyClassSelector__Group__1__Impl ;
    public final void rule__PropertyClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3160:1: ( rule__PropertyClassSelector__Group__1__Impl )
            // InternalDSL.g:3161:2: rule__PropertyClassSelector__Group__1__Impl
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
    // InternalDSL.g:3167:1: rule__PropertyClassSelector__Group__1__Impl : ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) ;
    public final void rule__PropertyClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3171:1: ( ( ( rule__PropertyClassSelector__RefAssignment_1 ) ) )
            // InternalDSL.g:3172:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            {
            // InternalDSL.g:3172:1: ( ( rule__PropertyClassSelector__RefAssignment_1 ) )
            // InternalDSL.g:3173:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefAssignment_1()); 
            // InternalDSL.g:3174:2: ( rule__PropertyClassSelector__RefAssignment_1 )
            // InternalDSL.g:3174:3: rule__PropertyClassSelector__RefAssignment_1
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
    // InternalDSL.g:3183:1: rule__NodeIdentitiySelector__Group_0__0 : rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 ;
    public final void rule__NodeIdentitiySelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3187:1: ( rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1 )
            // InternalDSL.g:3188:2: rule__NodeIdentitiySelector__Group_0__0__Impl rule__NodeIdentitiySelector__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:3195:1: rule__NodeIdentitiySelector__Group_0__0__Impl : ( 'node.name.' ) ;
    public final void rule__NodeIdentitiySelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3199:1: ( ( 'node.name.' ) )
            // InternalDSL.g:3200:1: ( 'node.name.' )
            {
            // InternalDSL.g:3200:1: ( 'node.name.' )
            // InternalDSL.g:3201:2: 'node.name.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:3210:1: rule__NodeIdentitiySelector__Group_0__1 : rule__NodeIdentitiySelector__Group_0__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3214:1: ( rule__NodeIdentitiySelector__Group_0__1__Impl )
            // InternalDSL.g:3215:2: rule__NodeIdentitiySelector__Group_0__1__Impl
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
    // InternalDSL.g:3221:1: rule__NodeIdentitiySelector__Group_0__1__Impl : ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3225:1: ( ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) ) )
            // InternalDSL.g:3226:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            {
            // InternalDSL.g:3226:1: ( ( rule__NodeIdentitiySelector__NameAssignment_0_1 ) )
            // InternalDSL.g:3227:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNameAssignment_0_1()); 
            // InternalDSL.g:3228:2: ( rule__NodeIdentitiySelector__NameAssignment_0_1 )
            // InternalDSL.g:3228:3: rule__NodeIdentitiySelector__NameAssignment_0_1
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
    // InternalDSL.g:3237:1: rule__NodeIdentitiySelector__Group_1__0 : rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 ;
    public final void rule__NodeIdentitiySelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3241:1: ( rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1 )
            // InternalDSL.g:3242:2: rule__NodeIdentitiySelector__Group_1__0__Impl rule__NodeIdentitiySelector__Group_1__1
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
    // InternalDSL.g:3249:1: rule__NodeIdentitiySelector__Group_1__0__Impl : ( 'node.identity.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3253:1: ( ( 'node.identity.' ) )
            // InternalDSL.g:3254:1: ( 'node.identity.' )
            {
            // InternalDSL.g:3254:1: ( 'node.identity.' )
            // InternalDSL.g:3255:2: 'node.identity.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:3264:1: rule__NodeIdentitiySelector__Group_1__1 : rule__NodeIdentitiySelector__Group_1__1__Impl ;
    public final void rule__NodeIdentitiySelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3268:1: ( rule__NodeIdentitiySelector__Group_1__1__Impl )
            // InternalDSL.g:3269:2: rule__NodeIdentitiySelector__Group_1__1__Impl
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
    // InternalDSL.g:3275:1: rule__NodeIdentitiySelector__Group_1__1__Impl : ( ( rule__NodeIdentitiySelector__Alternatives_1_1 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3279:1: ( ( ( rule__NodeIdentitiySelector__Alternatives_1_1 ) ) )
            // InternalDSL.g:3280:1: ( ( rule__NodeIdentitiySelector__Alternatives_1_1 ) )
            {
            // InternalDSL.g:3280:1: ( ( rule__NodeIdentitiySelector__Alternatives_1_1 ) )
            // InternalDSL.g:3281:2: ( rule__NodeIdentitiySelector__Alternatives_1_1 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAlternatives_1_1()); 
            // InternalDSL.g:3282:2: ( rule__NodeIdentitiySelector__Alternatives_1_1 )
            // InternalDSL.g:3282:3: rule__NodeIdentitiySelector__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getAlternatives_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__0"
    // InternalDSL.g:3291:1: rule__NodeIdentitiySelector__Group_1_1_0__0 : rule__NodeIdentitiySelector__Group_1_1_0__0__Impl rule__NodeIdentitiySelector__Group_1_1_0__1 ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3295:1: ( rule__NodeIdentitiySelector__Group_1_1_0__0__Impl rule__NodeIdentitiySelector__Group_1_1_0__1 )
            // InternalDSL.g:3296:2: rule__NodeIdentitiySelector__Group_1_1_0__0__Impl rule__NodeIdentitiySelector__Group_1_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__NodeIdentitiySelector__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1_1_0__1();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__0"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__0__Impl"
    // InternalDSL.g:3303:1: rule__NodeIdentitiySelector__Group_1_1_0__0__Impl : ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3307:1: ( ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0 ) ) )
            // InternalDSL.g:3308:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0 ) )
            {
            // InternalDSL.g:3308:1: ( ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0 ) )
            // InternalDSL.g:3309:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssignment_1_1_0_0()); 
            // InternalDSL.g:3310:2: ( rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0 )
            // InternalDSL.g:3310:3: rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssignment_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__1"
    // InternalDSL.g:3318:1: rule__NodeIdentitiySelector__Group_1_1_0__1 : rule__NodeIdentitiySelector__Group_1_1_0__1__Impl rule__NodeIdentitiySelector__Group_1_1_0__2 ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3322:1: ( rule__NodeIdentitiySelector__Group_1_1_0__1__Impl rule__NodeIdentitiySelector__Group_1_1_0__2 )
            // InternalDSL.g:3323:2: rule__NodeIdentitiySelector__Group_1_1_0__1__Impl rule__NodeIdentitiySelector__Group_1_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__NodeIdentitiySelector__Group_1_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1_1_0__2();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__1"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__1__Impl"
    // InternalDSL.g:3330:1: rule__NodeIdentitiySelector__Group_1_1_0__1__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3334:1: ( ( '.' ) )
            // InternalDSL.g:3335:1: ( '.' )
            {
            // InternalDSL.g:3335:1: ( '.' )
            // InternalDSL.g:3336:2: '.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__2"
    // InternalDSL.g:3345:1: rule__NodeIdentitiySelector__Group_1_1_0__2 : rule__NodeIdentitiySelector__Group_1_1_0__2__Impl rule__NodeIdentitiySelector__Group_1_1_0__3 ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3349:1: ( rule__NodeIdentitiySelector__Group_1_1_0__2__Impl rule__NodeIdentitiySelector__Group_1_1_0__3 )
            // InternalDSL.g:3350:2: rule__NodeIdentitiySelector__Group_1_1_0__2__Impl rule__NodeIdentitiySelector__Group_1_1_0__3
            {
            pushFollow(FOLLOW_13);
            rule__NodeIdentitiySelector__Group_1_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1_1_0__3();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__2"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__2__Impl"
    // InternalDSL.g:3357:1: rule__NodeIdentitiySelector__Group_1_1_0__2__Impl : ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3361:1: ( ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2 ) ) )
            // InternalDSL.g:3362:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2 ) )
            {
            // InternalDSL.g:3362:1: ( ( rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2 ) )
            // InternalDSL.g:3363:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentAssignment_1_1_0_2()); 
            // InternalDSL.g:3364:2: ( rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2 )
            // InternalDSL.g:3364:3: rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getComponentAssignment_1_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__2__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__3"
    // InternalDSL.g:3372:1: rule__NodeIdentitiySelector__Group_1_1_0__3 : rule__NodeIdentitiySelector__Group_1_1_0__3__Impl rule__NodeIdentitiySelector__Group_1_1_0__4 ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3376:1: ( rule__NodeIdentitiySelector__Group_1_1_0__3__Impl rule__NodeIdentitiySelector__Group_1_1_0__4 )
            // InternalDSL.g:3377:2: rule__NodeIdentitiySelector__Group_1_1_0__3__Impl rule__NodeIdentitiySelector__Group_1_1_0__4
            {
            pushFollow(FOLLOW_7);
            rule__NodeIdentitiySelector__Group_1_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1_1_0__4();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__3"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__3__Impl"
    // InternalDSL.g:3384:1: rule__NodeIdentitiySelector__Group_1_1_0__3__Impl : ( '.' ) ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3388:1: ( ( '.' ) )
            // InternalDSL.g:3389:1: ( '.' )
            {
            // InternalDSL.g:3389:1: ( '.' )
            // InternalDSL.g:3390:2: '.'
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_0_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__3__Impl"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__4"
    // InternalDSL.g:3399:1: rule__NodeIdentitiySelector__Group_1_1_0__4 : rule__NodeIdentitiySelector__Group_1_1_0__4__Impl ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3403:1: ( rule__NodeIdentitiySelector__Group_1_1_0__4__Impl )
            // InternalDSL.g:3404:2: rule__NodeIdentitiySelector__Group_1_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__Group_1_1_0__4__Impl();

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
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__4"


    // $ANTLR start "rule__NodeIdentitiySelector__Group_1_1_0__4__Impl"
    // InternalDSL.g:3410:1: rule__NodeIdentitiySelector__Group_1_1_0__4__Impl : ( ( rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4 ) ) ;
    public final void rule__NodeIdentitiySelector__Group_1_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3414:1: ( ( ( rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4 ) ) )
            // InternalDSL.g:3415:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4 ) )
            {
            // InternalDSL.g:3415:1: ( ( rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4 ) )
            // InternalDSL.g:3416:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4 )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffAssignment_1_1_0_4()); 
            // InternalDSL.g:3417:2: ( rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4 )
            // InternalDSL.g:3417:3: rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getSeffAssignment_1_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__Group_1_1_0__4__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalDSL.g:3426:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3430:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalDSL.g:3431:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDSL.g:3438:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__ModalityAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3442:1: ( ( ( rule__Statement__ModalityAssignment_0 ) ) )
            // InternalDSL.g:3443:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            {
            // InternalDSL.g:3443:1: ( ( rule__Statement__ModalityAssignment_0 ) )
            // InternalDSL.g:3444:2: ( rule__Statement__ModalityAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getModalityAssignment_0()); 
            // InternalDSL.g:3445:2: ( rule__Statement__ModalityAssignment_0 )
            // InternalDSL.g:3445:3: rule__Statement__ModalityAssignment_0
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
    // InternalDSL.g:3453:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3457:1: ( rule__Statement__Group__1__Impl )
            // InternalDSL.g:3458:2: rule__Statement__Group__1__Impl
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
    // InternalDSL.g:3464:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__TypeAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3468:1: ( ( ( rule__Statement__TypeAssignment_1 ) ) )
            // InternalDSL.g:3469:1: ( ( rule__Statement__TypeAssignment_1 ) )
            {
            // InternalDSL.g:3469:1: ( ( rule__Statement__TypeAssignment_1 ) )
            // InternalDSL.g:3470:2: ( rule__Statement__TypeAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_1()); 
            // InternalDSL.g:3471:2: ( rule__Statement__TypeAssignment_1 )
            // InternalDSL.g:3471:3: rule__Statement__TypeAssignment_1
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
    // InternalDSL.g:3480:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3484:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalDSL.g:3485:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:3492:1: rule__Condition__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3496:1: ( ( 'WHERE' ) )
            // InternalDSL.g:3497:1: ( 'WHERE' )
            {
            // InternalDSL.g:3497:1: ( 'WHERE' )
            // InternalDSL.g:3498:2: 'WHERE'
            {
             before(grammarAccess.getConditionAccess().getWHEREKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDSL.g:3507:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3511:1: ( rule__Condition__Group__1__Impl )
            // InternalDSL.g:3512:2: rule__Condition__Group__1__Impl
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
    // InternalDSL.g:3518:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperationAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3522:1: ( ( ( rule__Condition__OperationAssignment_1 ) ) )
            // InternalDSL.g:3523:1: ( ( rule__Condition__OperationAssignment_1 ) )
            {
            // InternalDSL.g:3523:1: ( ( rule__Condition__OperationAssignment_1 ) )
            // InternalDSL.g:3524:2: ( rule__Condition__OperationAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperationAssignment_1()); 
            // InternalDSL.g:3525:2: ( rule__Condition__OperationAssignment_1 )
            // InternalDSL.g:3525:3: rule__Condition__OperationAssignment_1
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
    // InternalDSL.g:3534:1: rule__LogicalOrOperation__Group__0 : rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1 ;
    public final void rule__LogicalOrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3538:1: ( rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1 )
            // InternalDSL.g:3539:2: rule__LogicalOrOperation__Group__0__Impl rule__LogicalOrOperation__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDSL.g:3546:1: rule__LogicalOrOperation__Group__0__Impl : ( ruleLogicalAndOperation ) ;
    public final void rule__LogicalOrOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3550:1: ( ( ruleLogicalAndOperation ) )
            // InternalDSL.g:3551:1: ( ruleLogicalAndOperation )
            {
            // InternalDSL.g:3551:1: ( ruleLogicalAndOperation )
            // InternalDSL.g:3552:2: ruleLogicalAndOperation
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
    // InternalDSL.g:3561:1: rule__LogicalOrOperation__Group__1 : rule__LogicalOrOperation__Group__1__Impl ;
    public final void rule__LogicalOrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3565:1: ( rule__LogicalOrOperation__Group__1__Impl )
            // InternalDSL.g:3566:2: rule__LogicalOrOperation__Group__1__Impl
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
    // InternalDSL.g:3572:1: rule__LogicalOrOperation__Group__1__Impl : ( ( rule__LogicalOrOperation__Group_1__0 )* ) ;
    public final void rule__LogicalOrOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3576:1: ( ( ( rule__LogicalOrOperation__Group_1__0 )* ) )
            // InternalDSL.g:3577:1: ( ( rule__LogicalOrOperation__Group_1__0 )* )
            {
            // InternalDSL.g:3577:1: ( ( rule__LogicalOrOperation__Group_1__0 )* )
            // InternalDSL.g:3578:2: ( rule__LogicalOrOperation__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrOperationAccess().getGroup_1()); 
            // InternalDSL.g:3579:2: ( rule__LogicalOrOperation__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDSL.g:3579:3: rule__LogicalOrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__LogicalOrOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalDSL.g:3588:1: rule__LogicalOrOperation__Group_1__0 : rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1 ;
    public final void rule__LogicalOrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3592:1: ( rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1 )
            // InternalDSL.g:3593:2: rule__LogicalOrOperation__Group_1__0__Impl rule__LogicalOrOperation__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDSL.g:3600:1: rule__LogicalOrOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3604:1: ( ( () ) )
            // InternalDSL.g:3605:1: ( () )
            {
            // InternalDSL.g:3605:1: ( () )
            // InternalDSL.g:3606:2: ()
            {
             before(grammarAccess.getLogicalOrOperationAccess().getLogicalOrOperationLeftAction_1_0()); 
            // InternalDSL.g:3607:2: ()
            // InternalDSL.g:3607:3: 
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
    // InternalDSL.g:3615:1: rule__LogicalOrOperation__Group_1__1 : rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2 ;
    public final void rule__LogicalOrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3619:1: ( rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2 )
            // InternalDSL.g:3620:2: rule__LogicalOrOperation__Group_1__1__Impl rule__LogicalOrOperation__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:3627:1: rule__LogicalOrOperation__Group_1__1__Impl : ( '|' ) ;
    public final void rule__LogicalOrOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3631:1: ( ( '|' ) )
            // InternalDSL.g:3632:1: ( '|' )
            {
            // InternalDSL.g:3632:1: ( '|' )
            // InternalDSL.g:3633:2: '|'
            {
             before(grammarAccess.getLogicalOrOperationAccess().getVerticalLineKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDSL.g:3642:1: rule__LogicalOrOperation__Group_1__2 : rule__LogicalOrOperation__Group_1__2__Impl ;
    public final void rule__LogicalOrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3646:1: ( rule__LogicalOrOperation__Group_1__2__Impl )
            // InternalDSL.g:3647:2: rule__LogicalOrOperation__Group_1__2__Impl
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
    // InternalDSL.g:3653:1: rule__LogicalOrOperation__Group_1__2__Impl : ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalOrOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3657:1: ( ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) ) )
            // InternalDSL.g:3658:1: ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:3658:1: ( ( rule__LogicalOrOperation__RightAssignment_1_2 ) )
            // InternalDSL.g:3659:2: ( rule__LogicalOrOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrOperationAccess().getRightAssignment_1_2()); 
            // InternalDSL.g:3660:2: ( rule__LogicalOrOperation__RightAssignment_1_2 )
            // InternalDSL.g:3660:3: rule__LogicalOrOperation__RightAssignment_1_2
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
    // InternalDSL.g:3669:1: rule__LogicalAndOperation__Group__0 : rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 ;
    public final void rule__LogicalAndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3673:1: ( rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1 )
            // InternalDSL.g:3674:2: rule__LogicalAndOperation__Group__0__Impl rule__LogicalAndOperation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDSL.g:3681:1: rule__LogicalAndOperation__Group__0__Impl : ( ruleLogicalNegationOperation ) ;
    public final void rule__LogicalAndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3685:1: ( ( ruleLogicalNegationOperation ) )
            // InternalDSL.g:3686:1: ( ruleLogicalNegationOperation )
            {
            // InternalDSL.g:3686:1: ( ruleLogicalNegationOperation )
            // InternalDSL.g:3687:2: ruleLogicalNegationOperation
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
    // InternalDSL.g:3696:1: rule__LogicalAndOperation__Group__1 : rule__LogicalAndOperation__Group__1__Impl ;
    public final void rule__LogicalAndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3700:1: ( rule__LogicalAndOperation__Group__1__Impl )
            // InternalDSL.g:3701:2: rule__LogicalAndOperation__Group__1__Impl
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
    // InternalDSL.g:3707:1: rule__LogicalAndOperation__Group__1__Impl : ( ( rule__LogicalAndOperation__Group_1__0 )* ) ;
    public final void rule__LogicalAndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3711:1: ( ( ( rule__LogicalAndOperation__Group_1__0 )* ) )
            // InternalDSL.g:3712:1: ( ( rule__LogicalAndOperation__Group_1__0 )* )
            {
            // InternalDSL.g:3712:1: ( ( rule__LogicalAndOperation__Group_1__0 )* )
            // InternalDSL.g:3713:2: ( rule__LogicalAndOperation__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndOperationAccess().getGroup_1()); 
            // InternalDSL.g:3714:2: ( rule__LogicalAndOperation__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDSL.g:3714:3: rule__LogicalAndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__LogicalAndOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalDSL.g:3723:1: rule__LogicalAndOperation__Group_1__0 : rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1 ;
    public final void rule__LogicalAndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3727:1: ( rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1 )
            // InternalDSL.g:3728:2: rule__LogicalAndOperation__Group_1__0__Impl rule__LogicalAndOperation__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDSL.g:3735:1: rule__LogicalAndOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3739:1: ( ( () ) )
            // InternalDSL.g:3740:1: ( () )
            {
            // InternalDSL.g:3740:1: ( () )
            // InternalDSL.g:3741:2: ()
            {
             before(grammarAccess.getLogicalAndOperationAccess().getLogicalAndOperationLeftAction_1_0()); 
            // InternalDSL.g:3742:2: ()
            // InternalDSL.g:3742:3: 
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
    // InternalDSL.g:3750:1: rule__LogicalAndOperation__Group_1__1 : rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2 ;
    public final void rule__LogicalAndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3754:1: ( rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2 )
            // InternalDSL.g:3755:2: rule__LogicalAndOperation__Group_1__1__Impl rule__LogicalAndOperation__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:3762:1: rule__LogicalAndOperation__Group_1__1__Impl : ( '&' ) ;
    public final void rule__LogicalAndOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3766:1: ( ( '&' ) )
            // InternalDSL.g:3767:1: ( '&' )
            {
            // InternalDSL.g:3767:1: ( '&' )
            // InternalDSL.g:3768:2: '&'
            {
             before(grammarAccess.getLogicalAndOperationAccess().getAmpersandKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:3777:1: rule__LogicalAndOperation__Group_1__2 : rule__LogicalAndOperation__Group_1__2__Impl ;
    public final void rule__LogicalAndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3781:1: ( rule__LogicalAndOperation__Group_1__2__Impl )
            // InternalDSL.g:3782:2: rule__LogicalAndOperation__Group_1__2__Impl
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
    // InternalDSL.g:3788:1: rule__LogicalAndOperation__Group_1__2__Impl : ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalAndOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3792:1: ( ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) ) )
            // InternalDSL.g:3793:1: ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:3793:1: ( ( rule__LogicalAndOperation__RightAssignment_1_2 ) )
            // InternalDSL.g:3794:2: ( rule__LogicalAndOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndOperationAccess().getRightAssignment_1_2()); 
            // InternalDSL.g:3795:2: ( rule__LogicalAndOperation__RightAssignment_1_2 )
            // InternalDSL.g:3795:3: rule__LogicalAndOperation__RightAssignment_1_2
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
    // InternalDSL.g:3804:1: rule__LogicalNegationOperation__Group_1__0 : rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1 ;
    public final void rule__LogicalNegationOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3808:1: ( rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1 )
            // InternalDSL.g:3809:2: rule__LogicalNegationOperation__Group_1__0__Impl rule__LogicalNegationOperation__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:3816:1: rule__LogicalNegationOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalNegationOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3820:1: ( ( () ) )
            // InternalDSL.g:3821:1: ( () )
            {
            // InternalDSL.g:3821:1: ( () )
            // InternalDSL.g:3822:2: ()
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getLogicalNegationOperationAction_1_0()); 
            // InternalDSL.g:3823:2: ()
            // InternalDSL.g:3823:3: 
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
    // InternalDSL.g:3831:1: rule__LogicalNegationOperation__Group_1__1 : rule__LogicalNegationOperation__Group_1__1__Impl rule__LogicalNegationOperation__Group_1__2 ;
    public final void rule__LogicalNegationOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3835:1: ( rule__LogicalNegationOperation__Group_1__1__Impl rule__LogicalNegationOperation__Group_1__2 )
            // InternalDSL.g:3836:2: rule__LogicalNegationOperation__Group_1__1__Impl rule__LogicalNegationOperation__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDSL.g:3843:1: rule__LogicalNegationOperation__Group_1__1__Impl : ( '!' ) ;
    public final void rule__LogicalNegationOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3847:1: ( ( '!' ) )
            // InternalDSL.g:3848:1: ( '!' )
            {
            // InternalDSL.g:3848:1: ( '!' )
            // InternalDSL.g:3849:2: '!'
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getExclamationMarkKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDSL.g:3858:1: rule__LogicalNegationOperation__Group_1__2 : rule__LogicalNegationOperation__Group_1__2__Impl ;
    public final void rule__LogicalNegationOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3862:1: ( rule__LogicalNegationOperation__Group_1__2__Impl )
            // InternalDSL.g:3863:2: rule__LogicalNegationOperation__Group_1__2__Impl
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
    // InternalDSL.g:3869:1: rule__LogicalNegationOperation__Group_1__2__Impl : ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) ) ;
    public final void rule__LogicalNegationOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3873:1: ( ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) ) )
            // InternalDSL.g:3874:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) )
            {
            // InternalDSL.g:3874:1: ( ( rule__LogicalNegationOperation__ValueAssignment_1_2 ) )
            // InternalDSL.g:3875:2: ( rule__LogicalNegationOperation__ValueAssignment_1_2 )
            {
             before(grammarAccess.getLogicalNegationOperationAccess().getValueAssignment_1_2()); 
            // InternalDSL.g:3876:2: ( rule__LogicalNegationOperation__ValueAssignment_1_2 )
            // InternalDSL.g:3876:3: rule__LogicalNegationOperation__ValueAssignment_1_2
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
    // InternalDSL.g:3885:1: rule__EncapsulatedLogicalOperation__Group_1__0 : rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1 ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3889:1: ( rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1 )
            // InternalDSL.g:3890:2: rule__EncapsulatedLogicalOperation__Group_1__0__Impl rule__EncapsulatedLogicalOperation__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:3897:1: rule__EncapsulatedLogicalOperation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3901:1: ( ( '(' ) )
            // InternalDSL.g:3902:1: ( '(' )
            {
            // InternalDSL.g:3902:1: ( '(' )
            // InternalDSL.g:3903:2: '('
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:3912:1: rule__EncapsulatedLogicalOperation__Group_1__1 : rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2 ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3916:1: ( rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2 )
            // InternalDSL.g:3917:2: rule__EncapsulatedLogicalOperation__Group_1__1__Impl rule__EncapsulatedLogicalOperation__Group_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:3924:1: rule__EncapsulatedLogicalOperation__Group_1__1__Impl : ( ruleLogicalOrOperation ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3928:1: ( ( ruleLogicalOrOperation ) )
            // InternalDSL.g:3929:1: ( ruleLogicalOrOperation )
            {
            // InternalDSL.g:3929:1: ( ruleLogicalOrOperation )
            // InternalDSL.g:3930:2: ruleLogicalOrOperation
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
    // InternalDSL.g:3939:1: rule__EncapsulatedLogicalOperation__Group_1__2 : rule__EncapsulatedLogicalOperation__Group_1__2__Impl ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3943:1: ( rule__EncapsulatedLogicalOperation__Group_1__2__Impl )
            // InternalDSL.g:3944:2: rule__EncapsulatedLogicalOperation__Group_1__2__Impl
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
    // InternalDSL.g:3950:1: rule__EncapsulatedLogicalOperation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EncapsulatedLogicalOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3954:1: ( ( ')' ) )
            // InternalDSL.g:3955:1: ( ')' )
            {
            // InternalDSL.g:3955:1: ( ')' )
            // InternalDSL.g:3956:2: ')'
            {
             before(grammarAccess.getEncapsulatedLogicalOperationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:3966:1: rule__VariableEqualityOperation__Group__0 : rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 ;
    public final void rule__VariableEqualityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3970:1: ( rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1 )
            // InternalDSL.g:3971:2: rule__VariableEqualityOperation__Group__0__Impl rule__VariableEqualityOperation__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDSL.g:3978:1: rule__VariableEqualityOperation__Group__0__Impl : ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableEqualityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3982:1: ( ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:3983:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:3983:1: ( ( rule__VariableEqualityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:3984:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:3985:2: ( rule__VariableEqualityOperation__LeftAssignment_0 )
            // InternalDSL.g:3985:3: rule__VariableEqualityOperation__LeftAssignment_0
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
    // InternalDSL.g:3993:1: rule__VariableEqualityOperation__Group__1 : rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 ;
    public final void rule__VariableEqualityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3997:1: ( rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2 )
            // InternalDSL.g:3998:2: rule__VariableEqualityOperation__Group__1__Impl rule__VariableEqualityOperation__Group__2
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
    // InternalDSL.g:4005:1: rule__VariableEqualityOperation__Group__1__Impl : ( '==' ) ;
    public final void rule__VariableEqualityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4009:1: ( ( '==' ) )
            // InternalDSL.g:4010:1: ( '==' )
            {
            // InternalDSL.g:4010:1: ( '==' )
            // InternalDSL.g:4011:2: '=='
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDSL.g:4020:1: rule__VariableEqualityOperation__Group__2 : rule__VariableEqualityOperation__Group__2__Impl ;
    public final void rule__VariableEqualityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4024:1: ( rule__VariableEqualityOperation__Group__2__Impl )
            // InternalDSL.g:4025:2: rule__VariableEqualityOperation__Group__2__Impl
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
    // InternalDSL.g:4031:1: rule__VariableEqualityOperation__Group__2__Impl : ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableEqualityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4035:1: ( ( ( rule__VariableEqualityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:4036:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:4036:1: ( ( rule__VariableEqualityOperation__RightAssignment_2 ) )
            // InternalDSL.g:4037:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableEqualityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:4038:2: ( rule__VariableEqualityOperation__RightAssignment_2 )
            // InternalDSL.g:4038:3: rule__VariableEqualityOperation__RightAssignment_2
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
    // InternalDSL.g:4047:1: rule__VariableInequalityOperation__Group__0 : rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 ;
    public final void rule__VariableInequalityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4051:1: ( rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1 )
            // InternalDSL.g:4052:2: rule__VariableInequalityOperation__Group__0__Impl rule__VariableInequalityOperation__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDSL.g:4059:1: rule__VariableInequalityOperation__Group__0__Impl : ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) ;
    public final void rule__VariableInequalityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4063:1: ( ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) ) )
            // InternalDSL.g:4064:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            {
            // InternalDSL.g:4064:1: ( ( rule__VariableInequalityOperation__LeftAssignment_0 ) )
            // InternalDSL.g:4065:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getLeftAssignment_0()); 
            // InternalDSL.g:4066:2: ( rule__VariableInequalityOperation__LeftAssignment_0 )
            // InternalDSL.g:4066:3: rule__VariableInequalityOperation__LeftAssignment_0
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
    // InternalDSL.g:4074:1: rule__VariableInequalityOperation__Group__1 : rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 ;
    public final void rule__VariableInequalityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4078:1: ( rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2 )
            // InternalDSL.g:4079:2: rule__VariableInequalityOperation__Group__1__Impl rule__VariableInequalityOperation__Group__2
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
    // InternalDSL.g:4086:1: rule__VariableInequalityOperation__Group__1__Impl : ( '!=' ) ;
    public final void rule__VariableInequalityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4090:1: ( ( '!=' ) )
            // InternalDSL.g:4091:1: ( '!=' )
            {
            // InternalDSL.g:4091:1: ( '!=' )
            // InternalDSL.g:4092:2: '!='
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getExclamationMarkEqualsSignKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDSL.g:4101:1: rule__VariableInequalityOperation__Group__2 : rule__VariableInequalityOperation__Group__2__Impl ;
    public final void rule__VariableInequalityOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4105:1: ( rule__VariableInequalityOperation__Group__2__Impl )
            // InternalDSL.g:4106:2: rule__VariableInequalityOperation__Group__2__Impl
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
    // InternalDSL.g:4112:1: rule__VariableInequalityOperation__Group__2__Impl : ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) ;
    public final void rule__VariableInequalityOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4116:1: ( ( ( rule__VariableInequalityOperation__RightAssignment_2 ) ) )
            // InternalDSL.g:4117:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            {
            // InternalDSL.g:4117:1: ( ( rule__VariableInequalityOperation__RightAssignment_2 ) )
            // InternalDSL.g:4118:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            {
             before(grammarAccess.getVariableInequalityOperationAccess().getRightAssignment_2()); 
            // InternalDSL.g:4119:2: ( rule__VariableInequalityOperation__RightAssignment_2 )
            // InternalDSL.g:4119:3: rule__VariableInequalityOperation__RightAssignment_2
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
    // InternalDSL.g:4128:1: rule__EmptySetOperation__Group__0 : rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 ;
    public final void rule__EmptySetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4132:1: ( rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1 )
            // InternalDSL.g:4133:2: rule__EmptySetOperation__Group__0__Impl rule__EmptySetOperation__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:4140:1: rule__EmptySetOperation__Group__0__Impl : ( 'isEmpty' ) ;
    public final void rule__EmptySetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4144:1: ( ( 'isEmpty' ) )
            // InternalDSL.g:4145:1: ( 'isEmpty' )
            {
            // InternalDSL.g:4145:1: ( 'isEmpty' )
            // InternalDSL.g:4146:2: 'isEmpty'
            {
             before(grammarAccess.getEmptySetOperationAccess().getIsEmptyKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDSL.g:4155:1: rule__EmptySetOperation__Group__1 : rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 ;
    public final void rule__EmptySetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4159:1: ( rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2 )
            // InternalDSL.g:4160:2: rule__EmptySetOperation__Group__1__Impl rule__EmptySetOperation__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4167:1: rule__EmptySetOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EmptySetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4171:1: ( ( '(' ) )
            // InternalDSL.g:4172:1: ( '(' )
            {
            // InternalDSL.g:4172:1: ( '(' )
            // InternalDSL.g:4173:2: '('
            {
             before(grammarAccess.getEmptySetOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:4182:1: rule__EmptySetOperation__Group__2 : rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3 ;
    public final void rule__EmptySetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4186:1: ( rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3 )
            // InternalDSL.g:4187:2: rule__EmptySetOperation__Group__2__Impl rule__EmptySetOperation__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:4194:1: rule__EmptySetOperation__Group__2__Impl : ( ( rule__EmptySetOperation__ValueAssignment_2 ) ) ;
    public final void rule__EmptySetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4198:1: ( ( ( rule__EmptySetOperation__ValueAssignment_2 ) ) )
            // InternalDSL.g:4199:1: ( ( rule__EmptySetOperation__ValueAssignment_2 ) )
            {
            // InternalDSL.g:4199:1: ( ( rule__EmptySetOperation__ValueAssignment_2 ) )
            // InternalDSL.g:4200:2: ( rule__EmptySetOperation__ValueAssignment_2 )
            {
             before(grammarAccess.getEmptySetOperationAccess().getValueAssignment_2()); 
            // InternalDSL.g:4201:2: ( rule__EmptySetOperation__ValueAssignment_2 )
            // InternalDSL.g:4201:3: rule__EmptySetOperation__ValueAssignment_2
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
    // InternalDSL.g:4209:1: rule__EmptySetOperation__Group__3 : rule__EmptySetOperation__Group__3__Impl ;
    public final void rule__EmptySetOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4213:1: ( rule__EmptySetOperation__Group__3__Impl )
            // InternalDSL.g:4214:2: rule__EmptySetOperation__Group__3__Impl
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
    // InternalDSL.g:4220:1: rule__EmptySetOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__EmptySetOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4224:1: ( ( ')' ) )
            // InternalDSL.g:4225:1: ( ')' )
            {
            // InternalDSL.g:4225:1: ( ')' )
            // InternalDSL.g:4226:2: ')'
            {
             before(grammarAccess.getEmptySetOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:4236:1: rule__IntersectionOperation__Group__0 : rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 ;
    public final void rule__IntersectionOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4240:1: ( rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1 )
            // InternalDSL.g:4241:2: rule__IntersectionOperation__Group__0__Impl rule__IntersectionOperation__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:4248:1: rule__IntersectionOperation__Group__0__Impl : ( 'intersection' ) ;
    public final void rule__IntersectionOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4252:1: ( ( 'intersection' ) )
            // InternalDSL.g:4253:1: ( 'intersection' )
            {
            // InternalDSL.g:4253:1: ( 'intersection' )
            // InternalDSL.g:4254:2: 'intersection'
            {
             before(grammarAccess.getIntersectionOperationAccess().getIntersectionKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDSL.g:4263:1: rule__IntersectionOperation__Group__1 : rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 ;
    public final void rule__IntersectionOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4267:1: ( rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2 )
            // InternalDSL.g:4268:2: rule__IntersectionOperation__Group__1__Impl rule__IntersectionOperation__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4275:1: rule__IntersectionOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__IntersectionOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4279:1: ( ( '(' ) )
            // InternalDSL.g:4280:1: ( '(' )
            {
            // InternalDSL.g:4280:1: ( '(' )
            // InternalDSL.g:4281:2: '('
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:4290:1: rule__IntersectionOperation__Group__2 : rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 ;
    public final void rule__IntersectionOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4294:1: ( rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3 )
            // InternalDSL.g:4295:2: rule__IntersectionOperation__Group__2__Impl rule__IntersectionOperation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:4302:1: rule__IntersectionOperation__Group__2__Impl : ( ( rule__IntersectionOperation__LeftAssignment_2 ) ) ;
    public final void rule__IntersectionOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4306:1: ( ( ( rule__IntersectionOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4307:1: ( ( rule__IntersectionOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4307:1: ( ( rule__IntersectionOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4308:2: ( rule__IntersectionOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4309:2: ( rule__IntersectionOperation__LeftAssignment_2 )
            // InternalDSL.g:4309:3: rule__IntersectionOperation__LeftAssignment_2
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
    // InternalDSL.g:4317:1: rule__IntersectionOperation__Group__3 : rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 ;
    public final void rule__IntersectionOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4321:1: ( rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4 )
            // InternalDSL.g:4322:2: rule__IntersectionOperation__Group__3__Impl rule__IntersectionOperation__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4329:1: rule__IntersectionOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__IntersectionOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4333:1: ( ( ',' ) )
            // InternalDSL.g:4334:1: ( ',' )
            {
            // InternalDSL.g:4334:1: ( ',' )
            // InternalDSL.g:4335:2: ','
            {
             before(grammarAccess.getIntersectionOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:4344:1: rule__IntersectionOperation__Group__4 : rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5 ;
    public final void rule__IntersectionOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4348:1: ( rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5 )
            // InternalDSL.g:4349:2: rule__IntersectionOperation__Group__4__Impl rule__IntersectionOperation__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:4356:1: rule__IntersectionOperation__Group__4__Impl : ( ( rule__IntersectionOperation__RightAssignment_4 ) ) ;
    public final void rule__IntersectionOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4360:1: ( ( ( rule__IntersectionOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4361:1: ( ( rule__IntersectionOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4361:1: ( ( rule__IntersectionOperation__RightAssignment_4 ) )
            // InternalDSL.g:4362:2: ( rule__IntersectionOperation__RightAssignment_4 )
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4363:2: ( rule__IntersectionOperation__RightAssignment_4 )
            // InternalDSL.g:4363:3: rule__IntersectionOperation__RightAssignment_4
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
    // InternalDSL.g:4371:1: rule__IntersectionOperation__Group__5 : rule__IntersectionOperation__Group__5__Impl ;
    public final void rule__IntersectionOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4375:1: ( rule__IntersectionOperation__Group__5__Impl )
            // InternalDSL.g:4376:2: rule__IntersectionOperation__Group__5__Impl
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
    // InternalDSL.g:4382:1: rule__IntersectionOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__IntersectionOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4386:1: ( ( ')' ) )
            // InternalDSL.g:4387:1: ( ')' )
            {
            // InternalDSL.g:4387:1: ( ')' )
            // InternalDSL.g:4388:2: ')'
            {
             before(grammarAccess.getIntersectionOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:4398:1: rule__UnionOperation__Group__0 : rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1 ;
    public final void rule__UnionOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4402:1: ( rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1 )
            // InternalDSL.g:4403:2: rule__UnionOperation__Group__0__Impl rule__UnionOperation__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:4410:1: rule__UnionOperation__Group__0__Impl : ( 'union' ) ;
    public final void rule__UnionOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4414:1: ( ( 'union' ) )
            // InternalDSL.g:4415:1: ( 'union' )
            {
            // InternalDSL.g:4415:1: ( 'union' )
            // InternalDSL.g:4416:2: 'union'
            {
             before(grammarAccess.getUnionOperationAccess().getUnionKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDSL.g:4425:1: rule__UnionOperation__Group__1 : rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2 ;
    public final void rule__UnionOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4429:1: ( rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2 )
            // InternalDSL.g:4430:2: rule__UnionOperation__Group__1__Impl rule__UnionOperation__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4437:1: rule__UnionOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__UnionOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4441:1: ( ( '(' ) )
            // InternalDSL.g:4442:1: ( '(' )
            {
            // InternalDSL.g:4442:1: ( '(' )
            // InternalDSL.g:4443:2: '('
            {
             before(grammarAccess.getUnionOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:4452:1: rule__UnionOperation__Group__2 : rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3 ;
    public final void rule__UnionOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4456:1: ( rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3 )
            // InternalDSL.g:4457:2: rule__UnionOperation__Group__2__Impl rule__UnionOperation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:4464:1: rule__UnionOperation__Group__2__Impl : ( ( rule__UnionOperation__LeftAssignment_2 ) ) ;
    public final void rule__UnionOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4468:1: ( ( ( rule__UnionOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4469:1: ( ( rule__UnionOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4469:1: ( ( rule__UnionOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4470:2: ( rule__UnionOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getUnionOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4471:2: ( rule__UnionOperation__LeftAssignment_2 )
            // InternalDSL.g:4471:3: rule__UnionOperation__LeftAssignment_2
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
    // InternalDSL.g:4479:1: rule__UnionOperation__Group__3 : rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4 ;
    public final void rule__UnionOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4483:1: ( rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4 )
            // InternalDSL.g:4484:2: rule__UnionOperation__Group__3__Impl rule__UnionOperation__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4491:1: rule__UnionOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__UnionOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4495:1: ( ( ',' ) )
            // InternalDSL.g:4496:1: ( ',' )
            {
            // InternalDSL.g:4496:1: ( ',' )
            // InternalDSL.g:4497:2: ','
            {
             before(grammarAccess.getUnionOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:4506:1: rule__UnionOperation__Group__4 : rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5 ;
    public final void rule__UnionOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4510:1: ( rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5 )
            // InternalDSL.g:4511:2: rule__UnionOperation__Group__4__Impl rule__UnionOperation__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:4518:1: rule__UnionOperation__Group__4__Impl : ( ( rule__UnionOperation__RightAssignment_4 ) ) ;
    public final void rule__UnionOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4522:1: ( ( ( rule__UnionOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4523:1: ( ( rule__UnionOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4523:1: ( ( rule__UnionOperation__RightAssignment_4 ) )
            // InternalDSL.g:4524:2: ( rule__UnionOperation__RightAssignment_4 )
            {
             before(grammarAccess.getUnionOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4525:2: ( rule__UnionOperation__RightAssignment_4 )
            // InternalDSL.g:4525:3: rule__UnionOperation__RightAssignment_4
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
    // InternalDSL.g:4533:1: rule__UnionOperation__Group__5 : rule__UnionOperation__Group__5__Impl ;
    public final void rule__UnionOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4537:1: ( rule__UnionOperation__Group__5__Impl )
            // InternalDSL.g:4538:2: rule__UnionOperation__Group__5__Impl
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
    // InternalDSL.g:4544:1: rule__UnionOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__UnionOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4548:1: ( ( ')' ) )
            // InternalDSL.g:4549:1: ( ')' )
            {
            // InternalDSL.g:4549:1: ( ')' )
            // InternalDSL.g:4550:2: ')'
            {
             before(grammarAccess.getUnionOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:4560:1: rule__SubtractOperation__Group__0 : rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1 ;
    public final void rule__SubtractOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4564:1: ( rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1 )
            // InternalDSL.g:4565:2: rule__SubtractOperation__Group__0__Impl rule__SubtractOperation__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:4572:1: rule__SubtractOperation__Group__0__Impl : ( 'subtract' ) ;
    public final void rule__SubtractOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4576:1: ( ( 'subtract' ) )
            // InternalDSL.g:4577:1: ( 'subtract' )
            {
            // InternalDSL.g:4577:1: ( 'subtract' )
            // InternalDSL.g:4578:2: 'subtract'
            {
             before(grammarAccess.getSubtractOperationAccess().getSubtractKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDSL.g:4587:1: rule__SubtractOperation__Group__1 : rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2 ;
    public final void rule__SubtractOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4591:1: ( rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2 )
            // InternalDSL.g:4592:2: rule__SubtractOperation__Group__1__Impl rule__SubtractOperation__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4599:1: rule__SubtractOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SubtractOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4603:1: ( ( '(' ) )
            // InternalDSL.g:4604:1: ( '(' )
            {
            // InternalDSL.g:4604:1: ( '(' )
            // InternalDSL.g:4605:2: '('
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:4614:1: rule__SubtractOperation__Group__2 : rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3 ;
    public final void rule__SubtractOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4618:1: ( rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3 )
            // InternalDSL.g:4619:2: rule__SubtractOperation__Group__2__Impl rule__SubtractOperation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:4626:1: rule__SubtractOperation__Group__2__Impl : ( ( rule__SubtractOperation__LeftAssignment_2 ) ) ;
    public final void rule__SubtractOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4630:1: ( ( ( rule__SubtractOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4631:1: ( ( rule__SubtractOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4631:1: ( ( rule__SubtractOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4632:2: ( rule__SubtractOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getSubtractOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4633:2: ( rule__SubtractOperation__LeftAssignment_2 )
            // InternalDSL.g:4633:3: rule__SubtractOperation__LeftAssignment_2
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
    // InternalDSL.g:4641:1: rule__SubtractOperation__Group__3 : rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4 ;
    public final void rule__SubtractOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4645:1: ( rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4 )
            // InternalDSL.g:4646:2: rule__SubtractOperation__Group__3__Impl rule__SubtractOperation__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4653:1: rule__SubtractOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SubtractOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4657:1: ( ( ',' ) )
            // InternalDSL.g:4658:1: ( ',' )
            {
            // InternalDSL.g:4658:1: ( ',' )
            // InternalDSL.g:4659:2: ','
            {
             before(grammarAccess.getSubtractOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:4668:1: rule__SubtractOperation__Group__4 : rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5 ;
    public final void rule__SubtractOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4672:1: ( rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5 )
            // InternalDSL.g:4673:2: rule__SubtractOperation__Group__4__Impl rule__SubtractOperation__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:4680:1: rule__SubtractOperation__Group__4__Impl : ( ( rule__SubtractOperation__RightAssignment_4 ) ) ;
    public final void rule__SubtractOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4684:1: ( ( ( rule__SubtractOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4685:1: ( ( rule__SubtractOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4685:1: ( ( rule__SubtractOperation__RightAssignment_4 ) )
            // InternalDSL.g:4686:2: ( rule__SubtractOperation__RightAssignment_4 )
            {
             before(grammarAccess.getSubtractOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4687:2: ( rule__SubtractOperation__RightAssignment_4 )
            // InternalDSL.g:4687:3: rule__SubtractOperation__RightAssignment_4
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
    // InternalDSL.g:4695:1: rule__SubtractOperation__Group__5 : rule__SubtractOperation__Group__5__Impl ;
    public final void rule__SubtractOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4699:1: ( rule__SubtractOperation__Group__5__Impl )
            // InternalDSL.g:4700:2: rule__SubtractOperation__Group__5__Impl
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
    // InternalDSL.g:4706:1: rule__SubtractOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SubtractOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4710:1: ( ( ')' ) )
            // InternalDSL.g:4711:1: ( ')' )
            {
            // InternalDSL.g:4711:1: ( ')' )
            // InternalDSL.g:4712:2: ')'
            {
             before(grammarAccess.getSubtractOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:4722:1: rule__ElementOfOperation__Group__0 : rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1 ;
    public final void rule__ElementOfOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4726:1: ( rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1 )
            // InternalDSL.g:4727:2: rule__ElementOfOperation__Group__0__Impl rule__ElementOfOperation__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:4734:1: rule__ElementOfOperation__Group__0__Impl : ( 'elementOf' ) ;
    public final void rule__ElementOfOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4738:1: ( ( 'elementOf' ) )
            // InternalDSL.g:4739:1: ( 'elementOf' )
            {
            // InternalDSL.g:4739:1: ( 'elementOf' )
            // InternalDSL.g:4740:2: 'elementOf'
            {
             before(grammarAccess.getElementOfOperationAccess().getElementOfKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDSL.g:4749:1: rule__ElementOfOperation__Group__1 : rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2 ;
    public final void rule__ElementOfOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4753:1: ( rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2 )
            // InternalDSL.g:4754:2: rule__ElementOfOperation__Group__1__Impl rule__ElementOfOperation__Group__2
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
    // InternalDSL.g:4761:1: rule__ElementOfOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ElementOfOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4765:1: ( ( '(' ) )
            // InternalDSL.g:4766:1: ( '(' )
            {
            // InternalDSL.g:4766:1: ( '(' )
            // InternalDSL.g:4767:2: '('
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:4776:1: rule__ElementOfOperation__Group__2 : rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3 ;
    public final void rule__ElementOfOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4780:1: ( rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3 )
            // InternalDSL.g:4781:2: rule__ElementOfOperation__Group__2__Impl rule__ElementOfOperation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSL.g:4788:1: rule__ElementOfOperation__Group__2__Impl : ( ( rule__ElementOfOperation__LeftAssignment_2 ) ) ;
    public final void rule__ElementOfOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4792:1: ( ( ( rule__ElementOfOperation__LeftAssignment_2 ) ) )
            // InternalDSL.g:4793:1: ( ( rule__ElementOfOperation__LeftAssignment_2 ) )
            {
            // InternalDSL.g:4793:1: ( ( rule__ElementOfOperation__LeftAssignment_2 ) )
            // InternalDSL.g:4794:2: ( rule__ElementOfOperation__LeftAssignment_2 )
            {
             before(grammarAccess.getElementOfOperationAccess().getLeftAssignment_2()); 
            // InternalDSL.g:4795:2: ( rule__ElementOfOperation__LeftAssignment_2 )
            // InternalDSL.g:4795:3: rule__ElementOfOperation__LeftAssignment_2
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
    // InternalDSL.g:4803:1: rule__ElementOfOperation__Group__3 : rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4 ;
    public final void rule__ElementOfOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4807:1: ( rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4 )
            // InternalDSL.g:4808:2: rule__ElementOfOperation__Group__3__Impl rule__ElementOfOperation__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:4815:1: rule__ElementOfOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ElementOfOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4819:1: ( ( ',' ) )
            // InternalDSL.g:4820:1: ( ',' )
            {
            // InternalDSL.g:4820:1: ( ',' )
            // InternalDSL.g:4821:2: ','
            {
             before(grammarAccess.getElementOfOperationAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:4830:1: rule__ElementOfOperation__Group__4 : rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5 ;
    public final void rule__ElementOfOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4834:1: ( rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5 )
            // InternalDSL.g:4835:2: rule__ElementOfOperation__Group__4__Impl rule__ElementOfOperation__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:4842:1: rule__ElementOfOperation__Group__4__Impl : ( ( rule__ElementOfOperation__RightAssignment_4 ) ) ;
    public final void rule__ElementOfOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4846:1: ( ( ( rule__ElementOfOperation__RightAssignment_4 ) ) )
            // InternalDSL.g:4847:1: ( ( rule__ElementOfOperation__RightAssignment_4 ) )
            {
            // InternalDSL.g:4847:1: ( ( rule__ElementOfOperation__RightAssignment_4 ) )
            // InternalDSL.g:4848:2: ( rule__ElementOfOperation__RightAssignment_4 )
            {
             before(grammarAccess.getElementOfOperationAccess().getRightAssignment_4()); 
            // InternalDSL.g:4849:2: ( rule__ElementOfOperation__RightAssignment_4 )
            // InternalDSL.g:4849:3: rule__ElementOfOperation__RightAssignment_4
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
    // InternalDSL.g:4857:1: rule__ElementOfOperation__Group__5 : rule__ElementOfOperation__Group__5__Impl ;
    public final void rule__ElementOfOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4861:1: ( rule__ElementOfOperation__Group__5__Impl )
            // InternalDSL.g:4862:2: rule__ElementOfOperation__Group__5__Impl
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
    // InternalDSL.g:4868:1: rule__ElementOfOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ElementOfOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4872:1: ( ( ')' ) )
            // InternalDSL.g:4873:1: ( ')' )
            {
            // InternalDSL.g:4873:1: ( ')' )
            // InternalDSL.g:4874:2: ')'
            {
             before(grammarAccess.getElementOfOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:4884:1: rule__CreateSetOperation__Group__0 : rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 ;
    public final void rule__CreateSetOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4888:1: ( rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1 )
            // InternalDSL.g:4889:2: rule__CreateSetOperation__Group__0__Impl rule__CreateSetOperation__Group__1
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
    // InternalDSL.g:4896:1: rule__CreateSetOperation__Group__0__Impl : ( '{' ) ;
    public final void rule__CreateSetOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4900:1: ( ( '{' ) )
            // InternalDSL.g:4901:1: ( '{' )
            {
            // InternalDSL.g:4901:1: ( '{' )
            // InternalDSL.g:4902:2: '{'
            {
             before(grammarAccess.getCreateSetOperationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:4911:1: rule__CreateSetOperation__Group__1 : rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 ;
    public final void rule__CreateSetOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4915:1: ( rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2 )
            // InternalDSL.g:4916:2: rule__CreateSetOperation__Group__1__Impl rule__CreateSetOperation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:4923:1: rule__CreateSetOperation__Group__1__Impl : ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) ;
    public final void rule__CreateSetOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4927:1: ( ( ( rule__CreateSetOperation__ValueAssignment_1 ) ) )
            // InternalDSL.g:4928:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            {
            // InternalDSL.g:4928:1: ( ( rule__CreateSetOperation__ValueAssignment_1 ) )
            // InternalDSL.g:4929:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            {
             before(grammarAccess.getCreateSetOperationAccess().getValueAssignment_1()); 
            // InternalDSL.g:4930:2: ( rule__CreateSetOperation__ValueAssignment_1 )
            // InternalDSL.g:4930:3: rule__CreateSetOperation__ValueAssignment_1
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
    // InternalDSL.g:4938:1: rule__CreateSetOperation__Group__2 : rule__CreateSetOperation__Group__2__Impl ;
    public final void rule__CreateSetOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4942:1: ( rule__CreateSetOperation__Group__2__Impl )
            // InternalDSL.g:4943:2: rule__CreateSetOperation__Group__2__Impl
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
    // InternalDSL.g:4949:1: rule__CreateSetOperation__Group__2__Impl : ( '}' ) ;
    public final void rule__CreateSetOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4953:1: ( ( '}' ) )
            // InternalDSL.g:4954:1: ( '}' )
            {
            // InternalDSL.g:4954:1: ( '}' )
            // InternalDSL.g:4955:2: '}'
            {
             before(grammarAccess.getCreateSetOperationAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:4965:1: rule__Model__TargetModelTypeAssignment_0 : ( ruleTargetModelTypeDef ) ;
    public final void rule__Model__TargetModelTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4969:1: ( ( ruleTargetModelTypeDef ) )
            // InternalDSL.g:4970:2: ( ruleTargetModelTypeDef )
            {
            // InternalDSL.g:4970:2: ( ruleTargetModelTypeDef )
            // InternalDSL.g:4971:3: ruleTargetModelTypeDef
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
    // InternalDSL.g:4980:1: rule__Model__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4984:1: ( ( ruleAbstractElement ) )
            // InternalDSL.g:4985:2: ( ruleAbstractElement )
            {
            // InternalDSL.g:4985:2: ( ruleAbstractElement )
            // InternalDSL.g:4986:3: ruleAbstractElement
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
    // InternalDSL.g:4995:1: rule__TargetModelTypeDef__TypeAssignment_1 : ( ruleTargetModelType ) ;
    public final void rule__TargetModelTypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4999:1: ( ( ruleTargetModelType ) )
            // InternalDSL.g:5000:2: ( ruleTargetModelType )
            {
            // InternalDSL.g:5000:2: ( ruleTargetModelType )
            // InternalDSL.g:5001:3: ruleTargetModelType
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


    // $ANTLR start "rule__TargetModelTypeDef__TypeContainerAssignment_2_1"
    // InternalDSL.g:5010:1: rule__TargetModelTypeDef__TypeContainerAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__TypeContainerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5014:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5015:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5015:2: ( ( RULE_ID ) )
            // InternalDSL.g:5016:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedCrossReference_2_1_0()); 
            // InternalDSL.g:5017:3: ( RULE_ID )
            // InternalDSL.g:5018:4: RULE_ID
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getTypeContainerDataDictionaryCharacterizedCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__TypeContainerAssignment_2_1"


    // $ANTLR start "rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1"
    // InternalDSL.g:5029:1: rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5033:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5034:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5034:2: ( ( RULE_ID ) )
            // InternalDSL.g:5035:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0()); 
            // InternalDSL.g:5036:3: ( RULE_ID )
            // InternalDSL.g:5037:4: RULE_ID
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__AllocationModelAssignment_2_2_1"


    // $ANTLR start "rule__TargetModelTypeDef__UsageModelAssignment_2_2_3"
    // InternalDSL.g:5048:1: rule__TargetModelTypeDef__UsageModelAssignment_2_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelTypeDef__UsageModelAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5052:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5053:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5053:2: ( ( RULE_ID ) )
            // InternalDSL.g:5054:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0()); 
            // InternalDSL.g:5055:3: ( RULE_ID )
            // InternalDSL.g:5056:4: RULE_ID
            {
             before(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelIDTerminalRuleCall_2_2_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelIDTerminalRuleCall_2_2_3_0_1()); 

            }

             after(grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelTypeDef__UsageModelAssignment_2_2_3"


    // $ANTLR start "rule__CharacteristicType__NameAssignment_1"
    // InternalDSL.g:5067:1: rule__CharacteristicType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5071:1: ( ( RULE_ID ) )
            // InternalDSL.g:5072:2: ( RULE_ID )
            {
            // InternalDSL.g:5072:2: ( RULE_ID )
            // InternalDSL.g:5073:3: RULE_ID
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
    // InternalDSL.g:5082:1: rule__CharacteristicType__RefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicType__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5086:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5087:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5087:2: ( ( RULE_ID ) )
            // InternalDSL.g:5088:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeAccess().getRefEnumCharacteristicTypeCrossReference_3_0()); 
            // InternalDSL.g:5089:3: ( RULE_ID )
            // InternalDSL.g:5090:4: RULE_ID
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
    // InternalDSL.g:5101:1: rule__CharacteristicClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacteristicClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5105:1: ( ( RULE_ID ) )
            // InternalDSL.g:5106:2: ( RULE_ID )
            {
            // InternalDSL.g:5106:2: ( RULE_ID )
            // InternalDSL.g:5107:3: RULE_ID
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
    // InternalDSL.g:5116:1: rule__CharacteristicClass__MembersAssignment_3 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5120:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5121:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5121:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5122:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5131:1: rule__CharacteristicClass__MembersAssignment_4_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__CharacteristicClass__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5135:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5136:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5136:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5137:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5146:1: rule__CharacteristicTypeSelector__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5150:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5151:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5151:2: ( ( RULE_ID ) )
            // InternalDSL.g:5152:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0()); 
            // InternalDSL.g:5153:3: ( RULE_ID )
            // InternalDSL.g:5154:4: RULE_ID
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
    // InternalDSL.g:5165:1: rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0 : ( ( '!' ) ) ;
    public final void rule__CharacteristicTypeSelector__NegatedAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5169:1: ( ( ( '!' ) ) )
            // InternalDSL.g:5170:2: ( ( '!' ) )
            {
            // InternalDSL.g:5170:2: ( ( '!' ) )
            // InternalDSL.g:5171:3: ( '!' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            // InternalDSL.g:5172:3: ( '!' )
            // InternalDSL.g:5173:4: '!'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDSL.g:5184:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5188:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5189:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5189:2: ( ( RULE_ID ) )
            // InternalDSL.g:5190:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_0_1_0()); 
            // InternalDSL.g:5191:3: ( RULE_ID )
            // InternalDSL.g:5192:4: RULE_ID
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
    // InternalDSL.g:5203:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5207:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5208:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5208:2: ( ( RULE_ID ) )
            // InternalDSL.g:5209:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_1_0()); 
            // InternalDSL.g:5210:3: ( RULE_ID )
            // InternalDSL.g:5211:4: RULE_ID
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
    // InternalDSL.g:5222:1: rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicTypeSelector__LiteralsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5226:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5227:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5227:2: ( ( RULE_ID ) )
            // InternalDSL.g:5228:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsLiteralCrossReference_2_1_2_1_0()); 
            // InternalDSL.g:5229:3: ( RULE_ID )
            // InternalDSL.g:5230:4: RULE_ID
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
    // InternalDSL.g:5241:1: rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0 : ( ( '$' ) ) ;
    public final void rule__CharacteristicTypeSelector__IsVariableSelectorAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5245:1: ( ( ( '$' ) ) )
            // InternalDSL.g:5246:2: ( ( '$' ) )
            {
            // InternalDSL.g:5246:2: ( ( '$' ) )
            // InternalDSL.g:5247:3: ( '$' )
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            // InternalDSL.g:5248:3: ( '$' )
            // InternalDSL.g:5249:4: '$'
            {
             before(grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDSL.g:5260:1: rule__CharacteristicTypeSelector__VariableAssignment_2_2_1 : ( ruleCharacteristicVariableType ) ;
    public final void rule__CharacteristicTypeSelector__VariableAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5264:1: ( ( ruleCharacteristicVariableType ) )
            // InternalDSL.g:5265:2: ( ruleCharacteristicVariableType )
            {
            // InternalDSL.g:5265:2: ( ruleCharacteristicVariableType )
            // InternalDSL.g:5266:3: ruleCharacteristicVariableType
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
    // InternalDSL.g:5275:1: rule__CharacteristicVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__CharacteristicVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5279:1: ( ( RULE_ID ) )
            // InternalDSL.g:5280:2: ( RULE_ID )
            {
            // InternalDSL.g:5280:2: ( RULE_ID )
            // InternalDSL.g:5281:3: RULE_ID
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
    // InternalDSL.g:5290:1: rule__CharacteristicSet__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CharacteristicSet__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5294:1: ( ( RULE_ID ) )
            // InternalDSL.g:5295:2: ( RULE_ID )
            {
            // InternalDSL.g:5295:2: ( RULE_ID )
            // InternalDSL.g:5296:3: RULE_ID
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
    // InternalDSL.g:5305:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5309:1: ( ( RULE_STRING ) )
            // InternalDSL.g:5310:2: ( RULE_STRING )
            {
            // InternalDSL.g:5310:2: ( RULE_STRING )
            // InternalDSL.g:5311:3: RULE_STRING
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
    // InternalDSL.g:5320:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5324:1: ( ( RULE_ID ) )
            // InternalDSL.g:5325:2: ( RULE_ID )
            {
            // InternalDSL.g:5325:2: ( RULE_ID )
            // InternalDSL.g:5326:3: RULE_ID
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
    // InternalDSL.g:5335:1: rule__Constraint__RuleAssignment_3 : ( ruleRule ) ;
    public final void rule__Constraint__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5339:1: ( ( ruleRule ) )
            // InternalDSL.g:5340:2: ( ruleRule )
            {
            // InternalDSL.g:5340:2: ( ruleRule )
            // InternalDSL.g:5341:3: ruleRule
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
    // InternalDSL.g:5350:1: rule__Rule__DataSelectorsAssignment_0 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5354:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:5355:2: ( ruleDataSelector )
            {
            // InternalDSL.g:5355:2: ( ruleDataSelector )
            // InternalDSL.g:5356:3: ruleDataSelector
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
    // InternalDSL.g:5365:1: rule__Rule__DataSelectorsAssignment_1_1 : ( ruleDataSelector ) ;
    public final void rule__Rule__DataSelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5369:1: ( ( ruleDataSelector ) )
            // InternalDSL.g:5370:2: ( ruleDataSelector )
            {
            // InternalDSL.g:5370:2: ( ruleDataSelector )
            // InternalDSL.g:5371:3: ruleDataSelector
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
    // InternalDSL.g:5380:1: rule__Rule__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Rule__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5384:1: ( ( ruleStatement ) )
            // InternalDSL.g:5385:2: ( ruleStatement )
            {
            // InternalDSL.g:5385:2: ( ruleStatement )
            // InternalDSL.g:5386:3: ruleStatement
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
    // InternalDSL.g:5395:1: rule__Rule__DestinationSelectorsAssignment_3 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5399:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:5400:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:5400:2: ( ruleDestinationSelector )
            // InternalDSL.g:5401:3: ruleDestinationSelector
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
    // InternalDSL.g:5410:1: rule__Rule__DestinationSelectorsAssignment_4_1 : ( ruleDestinationSelector ) ;
    public final void rule__Rule__DestinationSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5414:1: ( ( ruleDestinationSelector ) )
            // InternalDSL.g:5415:2: ( ruleDestinationSelector )
            {
            // InternalDSL.g:5415:2: ( ruleDestinationSelector )
            // InternalDSL.g:5416:3: ruleDestinationSelector
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
    // InternalDSL.g:5425:1: rule__Rule__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5429:1: ( ( ruleCondition ) )
            // InternalDSL.g:5430:2: ( ruleCondition )
            {
            // InternalDSL.g:5430:2: ( ruleCondition )
            // InternalDSL.g:5431:3: ruleCondition
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
    // InternalDSL.g:5440:1: rule__AttributeSelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__AttributeSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5444:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5445:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5445:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5446:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5455:1: rule__AttributeClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5459:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5460:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5460:2: ( ( RULE_ID ) )
            // InternalDSL.g:5461:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:5462:3: ( RULE_ID )
            // InternalDSL.g:5463:4: RULE_ID
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
    // InternalDSL.g:5474:1: rule__PropertySelector__RefAssignment_1 : ( ruleCharacteristicTypeSelector ) ;
    public final void rule__PropertySelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5478:1: ( ( ruleCharacteristicTypeSelector ) )
            // InternalDSL.g:5479:2: ( ruleCharacteristicTypeSelector )
            {
            // InternalDSL.g:5479:2: ( ruleCharacteristicTypeSelector )
            // InternalDSL.g:5480:3: ruleCharacteristicTypeSelector
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
    // InternalDSL.g:5489:1: rule__PropertyClassSelector__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyClassSelector__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5493:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5494:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5494:2: ( ( RULE_ID ) )
            // InternalDSL.g:5495:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0()); 
            // InternalDSL.g:5496:3: ( RULE_ID )
            // InternalDSL.g:5497:4: RULE_ID
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
    // InternalDSL.g:5508:1: rule__NodeIdentitiySelector__NameAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__NodeIdentitiySelector__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5512:1: ( ( RULE_STRING ) )
            // InternalDSL.g:5513:2: ( RULE_STRING )
            {
            // InternalDSL.g:5513:2: ( RULE_STRING )
            // InternalDSL.g:5514:3: RULE_STRING
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


    // $ANTLR start "rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0"
    // InternalDSL.g:5523:1: rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5527:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5528:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5528:2: ( ( RULE_ID ) )
            // InternalDSL.g:5529:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0_0_0()); 
            // InternalDSL.g:5530:3: ( RULE_ID )
            // InternalDSL.g:5531:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextIDTerminalRuleCall_1_1_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextIDTerminalRuleCall_1_1_0_0_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__AssemblyAssignment_1_1_0_0"


    // $ANTLR start "rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2"
    // InternalDSL.g:5542:1: rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5546:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5547:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5547:2: ( ( RULE_ID ) )
            // InternalDSL.g:5548:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_1_0_2_0()); 
            // InternalDSL.g:5549:3: ( RULE_ID )
            // InternalDSL.g:5550:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentIDTerminalRuleCall_1_1_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentIDTerminalRuleCall_1_1_0_2_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__ComponentAssignment_1_1_0_2"


    // $ANTLR start "rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4"
    // InternalDSL.g:5561:1: rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5565:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5566:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5566:2: ( ( RULE_ID ) )
            // InternalDSL.g:5567:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_1_0_4_0()); 
            // InternalDSL.g:5568:3: ( RULE_ID )
            // InternalDSL.g:5569:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationIDTerminalRuleCall_1_1_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationIDTerminalRuleCall_1_1_0_4_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__SeffAssignment_1_1_0_4"


    // $ANTLR start "rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1"
    // InternalDSL.g:5580:1: rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5584:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5585:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5585:2: ( ( RULE_ID ) )
            // InternalDSL.g:5586:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeCrossReference_1_1_1_0()); 
            // InternalDSL.g:5587:3: ( RULE_ID )
            // InternalDSL.g:5588:4: RULE_ID
            {
             before(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getNodeIdentitiySelectorAccess().getDiaNodeCharacterizedNodeCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeIdentitiySelector__DiaNodeAssignment_1_1_1"


    // $ANTLR start "rule__Statement__ModalityAssignment_0"
    // InternalDSL.g:5599:1: rule__Statement__ModalityAssignment_0 : ( ruleStatementModality ) ;
    public final void rule__Statement__ModalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5603:1: ( ( ruleStatementModality ) )
            // InternalDSL.g:5604:2: ( ruleStatementModality )
            {
            // InternalDSL.g:5604:2: ( ruleStatementModality )
            // InternalDSL.g:5605:3: ruleStatementModality
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
    // InternalDSL.g:5614:1: rule__Statement__TypeAssignment_1 : ( ruleStatementType ) ;
    public final void rule__Statement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5618:1: ( ( ruleStatementType ) )
            // InternalDSL.g:5619:2: ( ruleStatementType )
            {
            // InternalDSL.g:5619:2: ( ruleStatementType )
            // InternalDSL.g:5620:3: ruleStatementType
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
    // InternalDSL.g:5629:1: rule__StatementType__NameAssignment : ( ( 'FLOWS' ) ) ;
    public final void rule__StatementType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5633:1: ( ( ( 'FLOWS' ) ) )
            // InternalDSL.g:5634:2: ( ( 'FLOWS' ) )
            {
            // InternalDSL.g:5634:2: ( ( 'FLOWS' ) )
            // InternalDSL.g:5635:3: ( 'FLOWS' )
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            // InternalDSL.g:5636:3: ( 'FLOWS' )
            // InternalDSL.g:5637:4: 'FLOWS'
            {
             before(grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDSL.g:5648:1: rule__StatementModality__NameAssignment : ( ( 'NEVER' ) ) ;
    public final void rule__StatementModality__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5652:1: ( ( ( 'NEVER' ) ) )
            // InternalDSL.g:5653:2: ( ( 'NEVER' ) )
            {
            // InternalDSL.g:5653:2: ( ( 'NEVER' ) )
            // InternalDSL.g:5654:3: ( 'NEVER' )
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            // InternalDSL.g:5655:3: ( 'NEVER' )
            // InternalDSL.g:5656:4: 'NEVER'
            {
             before(grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDSL.g:5667:1: rule__Condition__OperationAssignment_1 : ( ruleBooleanOperation ) ;
    public final void rule__Condition__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5671:1: ( ( ruleBooleanOperation ) )
            // InternalDSL.g:5672:2: ( ruleBooleanOperation )
            {
            // InternalDSL.g:5672:2: ( ruleBooleanOperation )
            // InternalDSL.g:5673:3: ruleBooleanOperation
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
    // InternalDSL.g:5682:1: rule__CharacteristicReference__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5686:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5687:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5687:2: ( ( RULE_ID ) )
            // InternalDSL.g:5688:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicReferenceAccess().getValueCharacteristicVariableCrossReference_0()); 
            // InternalDSL.g:5689:3: ( RULE_ID )
            // InternalDSL.g:5690:4: RULE_ID
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
    // InternalDSL.g:5701:1: rule__CharacteristicSetReference__ValueAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicSetReference__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5705:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5706:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5706:2: ( ( RULE_ID ) )
            // InternalDSL.g:5707:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicSetReferenceAccess().getValueCharacteristicSetCrossReference_0_0()); 
            // InternalDSL.g:5708:3: ( RULE_ID )
            // InternalDSL.g:5709:4: RULE_ID
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
    // InternalDSL.g:5720:1: rule__CharacteristicSetReference__RefAssignment_1 : ( ruleCharacteristsicSetOperation ) ;
    public final void rule__CharacteristicSetReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5724:1: ( ( ruleCharacteristsicSetOperation ) )
            // InternalDSL.g:5725:2: ( ruleCharacteristsicSetOperation )
            {
            // InternalDSL.g:5725:2: ( ruleCharacteristsicSetOperation )
            // InternalDSL.g:5726:3: ruleCharacteristsicSetOperation
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
    // InternalDSL.g:5735:1: rule__LogicalOrOperation__RightAssignment_1_2 : ( ruleLogicalAndOperation ) ;
    public final void rule__LogicalOrOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5739:1: ( ( ruleLogicalAndOperation ) )
            // InternalDSL.g:5740:2: ( ruleLogicalAndOperation )
            {
            // InternalDSL.g:5740:2: ( ruleLogicalAndOperation )
            // InternalDSL.g:5741:3: ruleLogicalAndOperation
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
    // InternalDSL.g:5750:1: rule__LogicalAndOperation__RightAssignment_1_2 : ( ruleLogicalNegationOperation ) ;
    public final void rule__LogicalAndOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5754:1: ( ( ruleLogicalNegationOperation ) )
            // InternalDSL.g:5755:2: ( ruleLogicalNegationOperation )
            {
            // InternalDSL.g:5755:2: ( ruleLogicalNegationOperation )
            // InternalDSL.g:5756:3: ruleLogicalNegationOperation
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
    // InternalDSL.g:5765:1: rule__LogicalNegationOperation__ValueAssignment_1_2 : ( ruleEncapsulatedLogicalOperation ) ;
    public final void rule__LogicalNegationOperation__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5769:1: ( ( ruleEncapsulatedLogicalOperation ) )
            // InternalDSL.g:5770:2: ( ruleEncapsulatedLogicalOperation )
            {
            // InternalDSL.g:5770:2: ( ruleEncapsulatedLogicalOperation )
            // InternalDSL.g:5771:3: ruleEncapsulatedLogicalOperation
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
    // InternalDSL.g:5780:1: rule__VariableEqualityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5784:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5785:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5785:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5786:3: ruleCharacteristicReference
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
    // InternalDSL.g:5795:1: rule__VariableEqualityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableEqualityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5799:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5800:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5800:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5801:3: ruleCharacteristicReference
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
    // InternalDSL.g:5810:1: rule__VariableInequalityOperation__LeftAssignment_0 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5814:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5815:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5815:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5816:3: ruleCharacteristicReference
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
    // InternalDSL.g:5825:1: rule__VariableInequalityOperation__RightAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__VariableInequalityOperation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5829:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5830:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5830:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5831:3: ruleCharacteristicReference
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
    // InternalDSL.g:5840:1: rule__EmptySetOperation__ValueAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__EmptySetOperation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5844:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5845:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5845:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5846:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5855:1: rule__IntersectionOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5859:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5860:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5860:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5861:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5870:1: rule__IntersectionOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__IntersectionOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5874:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5875:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5875:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5876:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5885:1: rule__UnionOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__UnionOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5889:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5890:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5890:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5891:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5900:1: rule__UnionOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__UnionOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5904:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5905:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5905:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5906:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5915:1: rule__SubtractOperation__LeftAssignment_2 : ( ruleCharacteristicSetReference ) ;
    public final void rule__SubtractOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5919:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5920:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5920:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5921:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5930:1: rule__SubtractOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__SubtractOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5934:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5935:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5935:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5936:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5945:1: rule__ElementOfOperation__LeftAssignment_2 : ( ruleCharacteristicReference ) ;
    public final void rule__ElementOfOperation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5949:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5950:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5950:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5951:3: ruleCharacteristicReference
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
    // InternalDSL.g:5960:1: rule__ElementOfOperation__RightAssignment_4 : ( ruleCharacteristicSetReference ) ;
    public final void rule__ElementOfOperation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5964:1: ( ( ruleCharacteristicSetReference ) )
            // InternalDSL.g:5965:2: ( ruleCharacteristicSetReference )
            {
            // InternalDSL.g:5965:2: ( ruleCharacteristicSetReference )
            // InternalDSL.g:5966:3: ruleCharacteristicSetReference
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
    // InternalDSL.g:5975:1: rule__CreateSetOperation__ValueAssignment_1 : ( ruleCharacteristicReference ) ;
    public final void rule__CreateSetOperation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5979:1: ( ( ruleCharacteristicReference ) )
            // InternalDSL.g:5980:2: ( ruleCharacteristicReference )
            {
            // InternalDSL.g:5980:2: ( ruleCharacteristicReference )
            // InternalDSL.g:5981:3: ruleCharacteristicReference
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000C0A0010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000C0A0012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000802000800020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000446000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000444000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000380000100020L});

}