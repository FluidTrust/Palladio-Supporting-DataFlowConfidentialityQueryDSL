/*
 * generated by Xtext 2.21.0
 */
grammar InternalDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.sebinside.dcp.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.sebinside.dcp.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.sebinside.dcp.dsl.services.DSLGrammarAccess;

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getTargetModelTypeTargetModelTypeDefParserRuleCall_0_0());
				}
				lv_targetModelType_0_0=ruleTargetModelTypeDef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"targetModelType",
						lv_targetModelType_0_0,
						"de.sebinside.dcp.dsl.DSL.TargetModelTypeDef");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_1_0());
				}
				lv_elements_1_0=ruleAbstractElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_1_0,
						"de.sebinside.dcp.dsl.DSL.AbstractElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTargetModelTypeDef
entryRuleTargetModelTypeDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetModelTypeDefRule()); }
	iv_ruleTargetModelTypeDef=ruleTargetModelTypeDef
	{ $current=$iv_ruleTargetModelTypeDef.current; }
	EOF;

// Rule TargetModelTypeDef
ruleTargetModelTypeDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='target'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetModelTypeDefAccess().getTargetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetModelTypeDefAccess().getTypeTargetModelTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleTargetModelType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetModelTypeDefRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"de.sebinside.dcp.dsl.DSL.TargetModelType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='using'
			{
				newLeafNode(otherlv_2, grammarAccess.getTargetModelTypeDefAccess().getUsingKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getTargetModelTypeDefAccess().getTypeContainerCharacteristicTypeContainerCrossReference_2_1_0());
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getTargetModelTypeDefAccess().getAllocationModelAllocationCrossReference_2_2_1_0());
						}
					)
				)
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getTargetModelTypeDefAccess().getCommaKeyword_2_2_2());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTargetModelTypeDefRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getTargetModelTypeDefAccess().getUsageModelUsageModelCrossReference_2_2_3_0());
						}
					)
				)
			)?
		)?
	)
;

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	iv_ruleAbstractElement=ruleAbstractElement
	{ $current=$iv_ruleAbstractElement.current; }
	EOF;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getIncludeParserRuleCall_0());
		}
		this_Include_0=ruleInclude
		{
			$current = $this_Include_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicTypeParserRuleCall_1());
		}
		this_CharacteristicType_1=ruleCharacteristicType
		{
			$current = $this_CharacteristicType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getCharacteristicClassParserRuleCall_2());
		}
		this_CharacteristicClass_2=ruleCharacteristicClass
		{
			$current = $this_CharacteristicClass_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_3());
		}
		this_Constraint_3=ruleConstraint
		{
			$current = $this_Constraint_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAbstractElementAccess().getAbstractElementAction_4_0(),
						$current);
				}
			)
			this_SL_COMMENT_5=RULE_SL_COMMENT
			{
				newLeafNode(this_SL_COMMENT_5, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_4_1());
			}
		)
	)
;

// Entry rule entryRuleCharacteristicType
entryRuleCharacteristicType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacteristicTypeRule()); }
	iv_ruleCharacteristicType=ruleCharacteristicType
	{ $current=$iv_ruleCharacteristicType.current; }
	EOF;

// Rule CharacteristicType
ruleCharacteristicType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCharacteristicTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getCharacteristicTypeAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicTypeRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getCharacteristicTypeAccess().getRefCharacteristicTypeCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleCharacteristicClass
entryRuleCharacteristicClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacteristicClassRule()); }
	iv_ruleCharacteristicClass=ruleCharacteristicClass
	{ $current=$iv_ruleCharacteristicClass.current; }
	EOF;

// Rule CharacteristicClass
ruleCharacteristicClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getCharacteristicClassAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCharacteristicClassAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCharacteristicClassAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_3_0());
				}
				lv_members_3_0=ruleCharacteristicTypeSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
					}
					add(
						$current,
						"members",
						lv_members_3_0,
						"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getCharacteristicClassAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCharacteristicClassAccess().getMembersCharacteristicTypeSelectorParserRuleCall_4_1_0());
					}
					lv_members_5_0=ruleCharacteristicTypeSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCharacteristicClassRule());
						}
						add(
							$current,
							"members",
							lv_members_5_0,
							"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCharacteristicClassAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleCharacteristicTypeSelector
entryRuleCharacteristicTypeSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacteristicTypeSelectorRule()); }
	iv_ruleCharacteristicTypeSelector=ruleCharacteristicTypeSelector
	{ $current=$iv_ruleCharacteristicTypeSelector.current; }
	EOF;

// Rule CharacteristicTypeSelector
ruleCharacteristicTypeSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getCharacteristicTypeSelectorAccess().getRefCharacteristicTypeCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getCharacteristicTypeSelectorAccess().getFullStopKeyword_1());
		}
		(
			(
				(
					(
						lv_negated_2_0='!'
						{
							newLeafNode(lv_negated_2_0, grammarAccess.getCharacteristicTypeSelectorAccess().getNegatedExclamationMarkKeyword_2_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
							}
							setWithLastConsumed($current, "negated", true, "!");
						}
					)
				)?
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_0_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_4='['
				{
					newLeafNode(otherlv_4, grammarAccess.getCharacteristicTypeSelectorAccess().getLeftSquareBracketKeyword_2_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_1_0());
						}
					)
				)
				(
					otherlv_6=','
					{
						newLeafNode(otherlv_6, grammarAccess.getCharacteristicTypeSelectorAccess().getCommaKeyword_2_1_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
								}
							}
							otherlv_7=RULE_ID
							{
								newLeafNode(otherlv_7, grammarAccess.getCharacteristicTypeSelectorAccess().getLiteralsEnumCharacteristicLiteralCrossReference_2_1_2_1_0());
							}
						)
					)
				)*
				otherlv_8=']'
				{
					newLeafNode(otherlv_8, grammarAccess.getCharacteristicTypeSelectorAccess().getRightSquareBracketKeyword_2_1_3());
				}
			)
			    |
			(
				(
					(
						lv_isVariableSelector_9_0='$'
						{
							newLeafNode(lv_isVariableSelector_9_0, grammarAccess.getCharacteristicTypeSelectorAccess().getIsVariableSelectorDollarSignKeyword_2_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCharacteristicTypeSelectorRule());
							}
							setWithLastConsumed($current, "isVariableSelector", true, "\$");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getCharacteristicTypeSelectorAccess().getVariableCharacteristicVariableParserRuleCall_2_2_1_0());
						}
						lv_variable_10_0=ruleCharacteristicVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCharacteristicTypeSelectorRule());
							}
							set(
								$current,
								"variable",
								lv_variable_10_0,
								"de.sebinside.dcp.dsl.DSL.CharacteristicVariable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleCharacteristicVariable
entryRuleCharacteristicVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacteristicVariableRule()); }
	iv_ruleCharacteristicVariable=ruleCharacteristicVariable
	{ $current=$iv_ruleCharacteristicVariable.current; }
	EOF;

// Rule CharacteristicVariable
ruleCharacteristicVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCharacteristicVariableAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_isSet_1_0='{}'
				{
					newLeafNode(lv_isSet_1_0, grammarAccess.getCharacteristicVariableAccess().getIsSetLeftCurlyBracketRightCurlyBracketKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacteristicVariableRule());
					}
					setWithLastConsumed($current, "isSet", true, "{}");
				}
			)
		)?
	)
;

// Entry rule entryRuleInclude
entryRuleInclude returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIncludeRule()); }
	iv_ruleInclude=ruleInclude
	{ $current=$iv_ruleInclude.current; }
	EOF;

// Rule Include
ruleInclude returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
		}
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncludeRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='constraint'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintAccess().getRuleRuleParserRuleCall_3_0());
				}
				lv_rule_3_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintRule());
					}
					set(
						$current,
						"rule",
						lv_rule_3_0,
						"de.sebinside.dcp.dsl.DSL.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_0_0());
				}
				lv_dataSelectors_0_0=ruleDataSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"dataSelectors",
						lv_dataSelectors_0_0,
						"de.sebinside.dcp.dsl.DSL.DataSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='&'
			{
				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getAmpersandKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getDataSelectorsDataSelectorParserRuleCall_1_1_0());
					}
					lv_dataSelectors_2_0=ruleDataSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						add(
							$current,
							"dataSelectors",
							lv_dataSelectors_2_0,
							"de.sebinside.dcp.dsl.DSL.DataSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_2_0());
				}
				lv_statement_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"statement",
						lv_statement_3_0,
						"de.sebinside.dcp.dsl.DSL.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_3_0());
				}
				lv_destinationSelectors_4_0=ruleDestinationSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"destinationSelectors",
						lv_destinationSelectors_4_0,
						"de.sebinside.dcp.dsl.DSL.DestinationSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='&'
			{
				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getAmpersandKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getDestinationSelectorsDestinationSelectorParserRuleCall_4_1_0());
					}
					lv_destinationSelectors_6_0=ruleDestinationSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						add(
							$current,
							"destinationSelectors",
							lv_destinationSelectors_6_0,
							"de.sebinside.dcp.dsl.DSL.DestinationSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_5_0());
				}
				lv_condition_7_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"condition",
						lv_condition_7_0,
						"de.sebinside.dcp.dsl.DSL.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleDataSelector
entryRuleDataSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataSelectorRule()); }
	iv_ruleDataSelector=ruleDataSelector
	{ $current=$iv_ruleDataSelector.current; }
	EOF;

// Rule DataSelector
ruleDataSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeSelectorParserRuleCall_0());
		}
		this_AttributeSelector_0=ruleAttributeSelector
		{
			$current = $this_AttributeSelector_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataSelectorAccess().getAttributeClassSelectorParserRuleCall_1());
		}
		this_AttributeClassSelector_1=ruleAttributeClassSelector
		{
			$current = $this_AttributeClassSelector_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttributeSelector
entryRuleAttributeSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeSelectorRule()); }
	iv_ruleAttributeSelector=ruleAttributeSelector
	{ $current=$iv_ruleAttributeSelector.current; }
	EOF;

// Rule AttributeSelector
ruleAttributeSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data.attribute.'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeSelectorAccess().getDataAttributeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeSelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleCharacteristicTypeSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAttributeClassSelector
entryRuleAttributeClassSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeClassSelectorRule()); }
	iv_ruleAttributeClassSelector=ruleAttributeClassSelector
	{ $current=$iv_ruleAttributeClassSelector.current; }
	EOF;

// Rule AttributeClassSelector
ruleAttributeClassSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data.class.'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeClassSelectorAccess().getDataClassKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeClassSelectorRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getAttributeClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDestinationSelector
entryRuleDestinationSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDestinationSelectorRule()); }
	iv_ruleDestinationSelector=ruleDestinationSelector
	{ $current=$iv_ruleDestinationSelector.current; }
	EOF;

// Rule DestinationSelector
ruleDestinationSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertySelectorParserRuleCall_0());
		}
		this_PropertySelector_0=rulePropertySelector
		{
			$current = $this_PropertySelector_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getPropertyClassSelectorParserRuleCall_1());
		}
		this_PropertyClassSelector_1=rulePropertyClassSelector
		{
			$current = $this_PropertyClassSelector_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDestinationSelectorAccess().getNodeIdentitiySelectorParserRuleCall_2());
		}
		this_NodeIdentitiySelector_2=ruleNodeIdentitiySelector
		{
			$current = $this_NodeIdentitiySelector_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePropertySelector
entryRulePropertySelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertySelectorRule()); }
	iv_rulePropertySelector=rulePropertySelector
	{ $current=$iv_rulePropertySelector.current; }
	EOF;

// Rule PropertySelector
rulePropertySelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='node.property.'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertySelectorAccess().getNodePropertyKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertySelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0());
				}
				lv_ref_1_0=ruleCharacteristicTypeSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertySelectorRule());
					}
					set(
						$current,
						"ref",
						lv_ref_1_0,
						"de.sebinside.dcp.dsl.DSL.CharacteristicTypeSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePropertyClassSelector
entryRulePropertyClassSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyClassSelectorRule()); }
	iv_rulePropertyClassSelector=rulePropertyClassSelector
	{ $current=$iv_rulePropertyClassSelector.current; }
	EOF;

// Rule PropertyClassSelector
rulePropertyClassSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='node.class.'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyClassSelectorAccess().getNodeClassKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyClassSelectorRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleNodeIdentitiySelector
entryRuleNodeIdentitiySelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeIdentitiySelectorRule()); }
	iv_ruleNodeIdentitiySelector=ruleNodeIdentitiySelector
	{ $current=$iv_ruleNodeIdentitiySelector.current; }
	EOF;

// Rule NodeIdentitiySelector
ruleNodeIdentitiySelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='node.name.'
			{
				newLeafNode(otherlv_0, grammarAccess.getNodeIdentitiySelectorAccess().getNodeNameKeyword_0_0());
			}
			(
				(
					lv_name_1_0=RULE_STRING
					{
						newLeafNode(lv_name_1_0, grammarAccess.getNodeIdentitiySelectorAccess().getNameSTRINGTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			otherlv_2='node.identity.'
			{
				newLeafNode(otherlv_2, grammarAccess.getNodeIdentitiySelectorAccess().getNodeIdentityKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getNodeIdentitiySelectorAccess().getAssemblyAssemblyContextCrossReference_1_1_0());
					}
				)
			)
			otherlv_4='.'
			{
				newLeafNode(otherlv_4, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getNodeIdentitiySelectorAccess().getComponentBasicComponentCrossReference_1_3_0());
					}
				)
			)
			otherlv_6='.'
			{
				newLeafNode(otherlv_6, grammarAccess.getNodeIdentitiySelectorAccess().getFullStopKeyword_1_4());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeIdentitiySelectorRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getNodeIdentitiySelectorAccess().getSeffServiceEffectSpecificationCrossReference_1_5_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getModalityStatementModalityParserRuleCall_0_0());
				}
				lv_modality_0_0=ruleStatementModality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"modality",
						lv_modality_0_0,
						"de.sebinside.dcp.dsl.DSL.StatementModality");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getTypeStatementTypeParserRuleCall_1_0());
				}
				lv_type_1_0=ruleStatementType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"de.sebinside.dcp.dsl.DSL.StatementType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatementType
entryRuleStatementType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementTypeRule()); }
	iv_ruleStatementType=ruleStatementType
	{ $current=$iv_ruleStatementType.current; }
	EOF;

// Rule StatementType
ruleStatementType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0='FLOWS'
			{
				newLeafNode(lv_name_0_0, grammarAccess.getStatementTypeAccess().getNameFLOWSKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStatementTypeRule());
				}
				setWithLastConsumed($current, "name", lv_name_0_0, "FLOWS");
			}
		)
	)
;

// Entry rule entryRuleStatementModality
entryRuleStatementModality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementModalityRule()); }
	iv_ruleStatementModality=ruleStatementModality
	{ $current=$iv_ruleStatementModality.current; }
	EOF;

// Rule StatementModality
ruleStatementModality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0='NEVER'
			{
				newLeafNode(lv_name_0_0, grammarAccess.getStatementModalityAccess().getNameNEVERKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStatementModalityRule());
				}
				setWithLastConsumed($current, "name", lv_name_0_0, "NEVER");
			}
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WHERE'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWHEREKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getTodoCharacteristicVariableCrossReference_1_0());
				}
			)
		)
	)
;

// Rule TargetModelType
ruleTargetModelType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='OperationModel'
			{
				$current = grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTargetModelTypeAccess().getOperationModelEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='DataCentricPalladio'
			{
				$current = grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTargetModelTypeAccess().getDataCentricPalladioEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='ExtendedDFD'
			{
				$current = grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTargetModelTypeAccess().getExtendedDFDEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
