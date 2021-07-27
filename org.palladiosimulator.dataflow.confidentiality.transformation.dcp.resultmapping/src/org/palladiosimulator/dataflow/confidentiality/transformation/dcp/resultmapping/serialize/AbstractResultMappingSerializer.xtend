package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize

import com.google.inject.Injector
import com.google.inject.Guice
import org.eclipse.xtext.serializer.ISerializer
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.GlobalConstants
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.dSL.Condition
import de.sebinside.dcp.dsl.DSLRuntimeModule
import de.sebinside.dcp.dsl.dSL.CharacteristicVariableType
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.ResultMapping
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize.ResultMappingSerializer
import org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.Violation

import java.util.List
import java.util.Set
import java.util.Map

abstract class AbstractResultMappingSerializer implements ResultMappingSerializer {

	protected Converter crossPlatformConverter
	protected ISerializer serializer

	package new() {
		val Injector injector = Guice.createInjector(new DSLRuntimeModule);  
		serializer = injector.getInstance(ISerializer); 
	}
	
	protected def getParameterOrCallState(Violation violation) {
		violation.parameter.isPresent ? violation.parameter.get : null
	}

	protected def mapQueryType(Violation violation) {

		val typeCandidates = GlobalConstants.QueryTypes.values.filter[value|value.toString.equals(violation.queryType)]
		val parameter = getParameterOrCallState(violation)

		if (typeCandidates.length != 1) {
			throw new RuntimeException("Illegal query type.")
		}

		crossPlatformConverter.convertQueryType(typeCandidates.head, parameter)
	}

	protected def String mapNodeIdentity(NodeIdentitiySelector selector) {
		escape(crossPlatformConverter.createQualifiedName(selector))
	}

	protected def String mapCharacteristicClass(CharacteristicClass clazz) {
		escape(clazz.name)
	}

	protected def String mapCallStackEntry(String entry) {
		escape(crossPlatformConverter.resolveQualifiedName(entry, true))
	}

	protected def String handleSelectorLiterals(CharacteristicTypeSelector selector) {
		if (selector.isIsVariableSelector) {
			'''variable «escape(selector.variable.name)»'''
		} else {
			selector.literals.map[literal|escape(literal.name)].join(", ")
		}
	}

	protected def String mapCondition(Condition condition) {
		val operation = condition.operation
		//escape(serializer.serialize(operation).replaceAll(" ", ""))
		// Currently not resolved
		""
	}
	
	protected def String mapCharacteristicVariable(CharacteristicVariableType variable, List<String> values) {
		values.map[value|crossPlatformConverter.convertCharacteristicLiteral(value)].map[value|escape(value)].join(", ")
	}

	override serialize(ResultMapping resultMapping) {
		var constraintCounter = 1
		this.crossPlatformConverter = resultMapping.converter
		
		'''
		«makeTitle("General")»
		Constraint count: «resultMapping.evaluatedConstraints.length»
		«FOR constraint : resultMapping.evaluatedConstraints SEPARATOR "\n\n"»
		«makeTitle('''Constraint «constraintCounter++»''')»
		Constraint name: «escape(constraint.constraintName)»
		Violations found: «constraint.violations.length»
		«makeSubTitle("Constraint Details")»
		«serializeAttributeSelectors(constraint.attributeSelectors)»
		«serializeAttributeClasses(constraint.attributeClasses)»
		Condition: «highlight(constraint.statement.modality.name)» «highlight(constraint.statement.type.name)»
		«serializePropertySelectors(constraint.propertySelectors)»
		«serializePropertyClasses(constraint.propertyClasses)»
		«serializeNodeIdentities(constraint.nodeIdentities)»
		«IF constraint.hasViolations»
			«makeSubTitle("Constraint Violations")»
			«serializeViolations(constraint.violations)»
		«ENDIF»
		«ENDFOR»
		'''
	} //«IF constraint.hasCondition»Condition: «mapCondition(constraint.condition)»«ENDIF»
	
	private def serializeAttributeSelectors(Iterable<CharacteristicTypeSelector> attributeSelectors) {
		'''«FOR selector : attributeSelectors BEFORE "Data Characteristics: " + advancedEnumHeader("Characteristic", "Value") SEPARATOR advancedEnumSeparator»«mapCharacteristicTypeSelector(selector)»«ENDFOR»'''
	}
	
	private def serializeAttributeClasses(Iterable<CharacteristicClass>  attributeClasses) {
		'''«FOR selector: attributeClasses BEFORE "Data Classes: " SEPARATOR ", "»«mapCharacteristicClass(selector)»«ENDFOR»'''
	}
	
	private def serializePropertySelectors(Iterable<CharacteristicTypeSelector> propertySelectors) {
		'''«FOR selector : propertySelectors BEFORE "Destination Characteristics: " + advancedEnumHeader("Characteristic", "Value") SEPARATOR advancedEnumSeparator»«mapCharacteristicTypeSelector(selector)»«ENDFOR»'''
	}
	
	private def serializePropertyClasses(Iterable<CharacteristicClass> propertyClasses) {
		'''«FOR selector: propertyClasses BEFORE "Destination Classes: " SEPARATOR ", "»«mapCharacteristicClass(selector)»«ENDFOR»'''
	}
	
	private def serializeNodeIdentities(Iterable<NodeIdentitiySelector> nodeIdentities) {
		'''«FOR selector: nodeIdentities BEFORE "Destination Identity: " SEPARATOR ", "»«mapNodeIdentity(selector)»«ENDFOR»'''
	}
	
	private def serializeViolations(List<Violation> violations) {
		'''
		«FOR i : 0..(violations.size - 1) SEPARATOR "\n"»
			«i+1». Parameter «escape(crossPlatformConverter.convertVariable(getParameterOrCallState(violations.get(i))))» is not allowed to be «highlight(mapQueryType(violations.get(i)))» in operation «escape(crossPlatformConverter.resolveQualifiedName(violations.get(i).operation, false))».
			«serializeViolationClassVariables(violations.get(i).classVariables)»
			«serializeViolationCharacteristicVariables(violations.get(i).characteristicVariables)»
			«serializeViolationCallStack(violations.get(i).callStack)»
		«ENDFOR»
		'''
	}
	
	private def serializeViolationCallStack(List<Object> callStack) {
		//recursive call of serializeCallStack
		'''«IF !callStack.isEmpty»«"\t- Flow Tree: \n\t\t" + serializeCallStack(callStack, "", true, true, true)»«ENDIF»'''
	}
	
	private def <E extends Object> String serializeCallStack(List<E> branch, String treeIndent, boolean lastElement, boolean multipleBranches, boolean root) {
		var newTreeIndent = treeIndent 
		if(multipleBranches && !lastElement) {
			newTreeIndent += "|\t"
		} else {
			newTreeIndent += "\t"
		}
		
		var String callStackEntryTreeIndent = ""
		if(!root) {
			if(lastElement) {
				callStackEntryTreeIndent = "└── "
			} else {
				callStackEntryTreeIndent = "├── "
			}
		}
		
		'''«FOR subBranch : branch SEPARATOR "\n\t" + newTreeIndent»«IF subBranch instanceof String»«serializeCallStackEntry(subBranch as String, callStackEntryTreeIndent)»«ELSEIF subBranch instanceof List»«indent(serializeCallStack(subBranch, newTreeIndent, branch.last.equals(subBranch), branch.size > 2, false))»«ENDIF»«ENDFOR»'''
	}
	
	private def serializeViolationClassVariables(Map<CharacteristicTypeSelector, String> classVariableMap) {
		'''«FOR variable: classVariableMap.keySet BEFORE "\t- Characteristic Classes: " + indent(advancedEnumHeader("Parameter", "Class", "Value")) SEPARATOR advancedEnumSeparator»«indent(mapClassVariable(variable, classVariableMap.get(variable)))»«ENDFOR»'''
	}
	
	private def serializeViolationCharacteristicVariables(Map<CharacteristicVariableType, List<String>> characteristicVariableMap) {
		'''«FOR variable: characteristicVariableMap.keySet BEFORE "\t- Characteristic Variables: " + indent(advancedEnumHeader("Variable", "Value")) SEPARATOR advancedEnumSeparator»«indent(mapCharacteristicVariable(variable, characteristicVariableMap.get(variable)))»«ENDFOR»'''
	}
	
	private def serializeCallStackEntry(String call, String treeIndent) {
		treeIndent + indent(mapCallStackEntry(call))
	}
	
	abstract protected def String indent(String value)
	
	abstract protected def String mapClassVariable(CharacteristicTypeSelector variable, String value)

	abstract protected def String advancedEnumHeader(String... entries)

	abstract protected def String advancedEnumSeparator()

	abstract protected def String makeTitle(String value)

	abstract protected def String makeSubTitle(String value)

	abstract protected def String mapCharacteristicTypeSelector(CharacteristicTypeSelector selector)

	abstract protected def String escape(String value)

	abstract protected def String highlight(String value)
}
