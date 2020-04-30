package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.GlobalConstants
import de.sebinside.dcp.dsl.resultmapping.generate.Violation

import static de.sebinside.dcp.dsl.resultmapping.ResultMappingUtils.*

abstract class AbstractResultMappingSerializer implements ResultMappingSerializer {

	protected Converter crossPlatformConverter

	package new() {
	}

	override serialize(String caseName, ResultMapping resultMapping) {
		var constraintCounter = 1

		'''«makeTitle("General")»

Case name: «caseName»
Constraint count: «resultMapping.evaluatedConstraints.length»

«FOR constraint : resultMapping.evaluatedConstraints SEPARATOR "\n\n"»
«makeTitle('''Constraint «constraintCounter++»''')»

Constraint name: «constraint.constraintName»
Violations found: «constraint.violations.length»

«makeSubTitle("Constraint Details")»

«FOR selector : constraint.attributeSelectors BEFORE "Data Characteristics: " SEPARATOR ", "»«mapCharacteristicTypeSelector(selector)»«ENDFOR»
«FOR selector: constraint.attributeClasses BEFORE "Data Classes: " SEPARATOR ", "»«mapCharacteristicClass(selector)»«ENDFOR»
Condition: «constraint.statement.modality.name» «constraint.statement.type.name»
«FOR selector : constraint.propertySelectors BEFORE "Destination Characteristics: " SEPARATOR ", "»«mapCharacteristicTypeSelector(selector)»«ENDFOR»
«FOR selector: constraint.propertyClasses BEFORE "Destination Classes: " SEPARATOR ", "»«mapCharacteristicClass(selector)»«ENDFOR»
«FOR selector: constraint.nodeIdentities BEFORE "Destination Identity: " SEPARATOR ", "»«mapNodeIdentity(selector)»«ENDFOR»

«makeSubTitle("Constraint Violations")»

«FOR i : 0..(constraint.violations.size - 1) SEPARATOR "\n"»
«i+1». Parameter "«getParameterOrCallState(constraint.violations.get(i))»" is not allowed to be «mapQueryType(constraint.violations.get(i).queryType)» in operation "«constraint.violations.get(i).operation»".
«FOR entry: constraint.violations.get(i).callStack BEFORE "\t- Call Stack: " SEPARATOR " <- "»"«entry»"«ENDFOR»
«FOR variable: constraint.violations.get(i).classVariables.keySet BEFORE "\t- Characteristic Classes: " SEPARATOR ", "»
Parameter "«variable.ref.name»" (Class "«retrieveClass(variable).get.name»") set to "«constraint.violations.get(i).classVariables.get(variable)»"
«ENDFOR»
«ENDFOR»
«ENDFOR»
'''
	}

	protected def getParameterOrCallState(Violation violation) {
		violation.parameter.isPresent ? violation.parameter.get : violation.callState.get
	}

	protected def mapQueryType(String queryType) {

		val typeCandidates = GlobalConstants.QueryTypes.values.filter[value|value.toString.equals(queryType)]

		if (typeCandidates.length != 1) {
			throw new RuntimeException("Illegal query type.")
		}

		switch (typeCandidates.head) {
			case CALL_ARGUMENT: "call argument"
			case RETURN_VALUE: "return value"
			case PRE_CALL_STATE: "call state"
			case POST_CALL_STATE: "call state"
		}
	}

	abstract def String mapNodeIdentity(NodeIdentitiySelector selector)

	abstract def String mapCharacteristicClass(CharacteristicClass clazz)

	abstract def String makeTitle(String value)

	abstract def String makeSubTitle(String value)

	abstract def String mapCharacteristicTypeSelector(CharacteristicTypeSelector selector)

}
