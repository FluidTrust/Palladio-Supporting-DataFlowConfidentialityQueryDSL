package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector

import static de.sebinside.dcp.dsl.resultmapping.ResultMappingUtils.*

class PlainTextResultMappingSerializer extends AbstractResultMappingSerializer {

	package new() {
	}

	override mapCharacteristicTypeSelector(CharacteristicTypeSelector selector) {
		val characteristicName = selector.ref.name
		val literals = selector.literals.map[literal|escape(literal.entityName)].join(", ")

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
		'''Parameter «escape(variable.ref.name)» (Class «escape(retrieveClass(variable).get.name)») set to «escape(value)»'''
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

}
