package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.GlobalConstants
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import de.sebinside.dcp.dsl.resultmapping.generate.Violation
import de.sebinside.dcp.dsl.dSL.Condition
import org.eclipse.xtext.serializer.ISerializer
import com.google.inject.Injector
import com.google.inject.Guice
import de.sebinside.dcp.dsl.DSLRuntimeModule

abstract class AbstractResultMappingSerializer implements ResultMappingSerializer {

	protected Converter crossPlatformConverter
	protected ISerializer serializer

	package new() {
		val Injector injector = Guice.createInjector(new DSLRuntimeModule);  
		serializer = injector.getInstance(ISerializer);  
	}

	override serialize(String caseName, ResultMapping resultMapping) {
		var constraintCounter = 1
		this.crossPlatformConverter = resultMapping.targetModelCompliantConverter

		'''«makeTitle("General")»

Case name: «escape(caseName)»
Constraint count: «resultMapping.evaluatedConstraints.length»

«FOR constraint : resultMapping.evaluatedConstraints SEPARATOR "\n\n"»
«makeTitle('''Constraint «constraintCounter++»''')»

Constraint name: «escape(constraint.constraintName)»
Violations found: «constraint.violations.length»

«makeSubTitle("Constraint Details")»

«FOR selector : constraint.attributeSelectors BEFORE "Data Characteristics: " + advancedEnumHeader("Characteristic", "Value") SEPARATOR advancedEnumSeparator»«mapCharacteristicTypeSelector(selector)»«ENDFOR»
«FOR selector: constraint.attributeClasses BEFORE "Data Classes: " SEPARATOR ", "»«mapCharacteristicClass(selector)»«ENDFOR»
Condition: «highlight(constraint.statement.modality.name)» «highlight(constraint.statement.type.name)»
«FOR selector : constraint.propertySelectors BEFORE "Destination Characteristics: " + advancedEnumHeader("Characteristic", "Value") SEPARATOR advancedEnumSeparator»«mapCharacteristicTypeSelector(selector)»«ENDFOR»
«FOR selector: constraint.propertyClasses BEFORE "Destination Classes: " SEPARATOR ", "»«mapCharacteristicClass(selector)»«ENDFOR»
«FOR selector: constraint.nodeIdentities BEFORE "Destination Identity: " SEPARATOR ", "»«mapNodeIdentity(selector)»«ENDFOR»
«IF constraint.hasCondition»Condition: «mapCondition(constraint.condition)»«ENDIF»

«makeSubTitle("Constraint Violations")»

«FOR i : 0..(constraint.violations.size - 1) SEPARATOR "\n"»
«i+1». Parameter «escape(crossPlatformConverter.convertVariable(getParameterOrCallState(constraint.violations.get(i))))» is not allowed to be «highlight(mapQueryType(constraint.violations.get(i)))» in operation «escape(crossPlatformConverter.resolveQualifiedName(constraint.violations.get(i).operation, false))».
«FOR entry: constraint.violations.get(i).callStack.filter[e|crossPlatformConverter.qualifiedNameResolvable(e)] BEFORE "\t- Call Stack: " + indent(advancedEnumHeader("Node")) SEPARATOR advancedEnumSeparator»«indent(mapCallStackEntry(entry))»«ENDFOR»
«FOR variable: constraint.violations.get(i).classVariables.keySet BEFORE "\t- Characteristic Classes: " + indent(advancedEnumHeader("Parameter", "Class", "Value")) SEPARATOR advancedEnumSeparator»«indent(mapClassVariable(variable, constraint.violations.get(i).classVariables.get(variable)))»«ENDFOR»
«ENDFOR»
«ENDFOR»
'''
	}

	protected def getParameterOrCallState(Violation violation) {
		violation.parameter.isPresent ? violation.parameter.get : violation.callState.get
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
			selector.literals.map[literal|escape(literal.entityName)].join(", ")
		}
	}

	protected def String mapCondition(Condition condition) {
		val operation = condition.operation
		escape(serializer.serialize(operation).replaceAll(" ", ""))
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
