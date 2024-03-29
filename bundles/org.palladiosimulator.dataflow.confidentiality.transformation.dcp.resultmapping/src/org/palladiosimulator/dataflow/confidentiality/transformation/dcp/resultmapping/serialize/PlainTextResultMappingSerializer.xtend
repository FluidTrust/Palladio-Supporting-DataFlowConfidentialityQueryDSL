package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector

import de.sebinside.dcp.dsl.dSL.CharacteristicVariableType
import java.util.List
import de.sebinside.dcp.dsl.dSL.CharacteristicSet

class PlainTextResultMappingSerializer extends AbstractResultMappingSerializer {

	protected new(boolean serializeFlowTree) {
		super(serializeFlowTree)
	}

	override mapCharacteristicTypeSelector(CharacteristicTypeSelector selector) {
		val characteristicName = selector.ref.name
		val literals = handleSelectorLiterals(selector)

		'''«escape(characteristicName)» «if(selector.negated) "not " else ""»set to «literals»'''
	}

	override makeTitle(String value) {
		val titleLength = 40
		val int dashCount = (titleLength - value.length) / 2 - 2
		val String dashes = "-".repeat(dashCount)
		val title = '''«dashes» «value.toUpperCase» «dashes»'''

		return title.length == titleLength - 3
			? '''«title»-''' : title
	}

	override makeSubTitle(String value) {
		makeTitle(value)
	}

	override fileExtension() {
		"txt"
	}

	override escape(String value) {
		'''"«value»"'''
	}

	override highlight(String value) {
		value
	}

	override protected mapClassVariable(CharacteristicTypeSelector variable, String value) {
		'''Parameter «escape(variable.ref.name)» (Class «escape(ResultMappingUtils.retrieveClass(variable).get.name)») set to «escape(value)»'''
	}

	override protected advancedEnumHeader(String... header) {
		""
	}

	override protected advancedEnumSeparator() {
		", "
	}

	override protected indent(String value) {
		// No extra indentation needed in plain text
		value
	}
	
	

	override protected mapCharacteristicVariable(CharacteristicVariableType variable, List<String> values) {
		val escapedValues = super.mapCharacteristicVariable(variable, values)
		'''«IF variable instanceof CharacteristicSet»set variable«ELSE»variable«ENDIF» «escape(variable.name)» has value «escapedValues»'''
	}

}
