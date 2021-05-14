package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector

import static de.sebinside.dcp.dsl.resultmapping.ResultMappingUtils.*
import de.sebinside.dcp.dsl.dSL.CharacteristicVariableType
import java.util.List
import de.sebinside.dcp.dsl.dSL.CharacteristicSet

class MarkdownResultMappingSerializer extends AbstractResultMappingSerializer {

	package new() {
	}

	override makeTitle(String value) {
		'''# «value»'''
	}

	override makeSubTitle(String value) {
		'''## «value»'''
	}

	override mapCharacteristicTypeSelector(CharacteristicTypeSelector selector) {
		val characteristicName = selector.ref.name
		val literals = handleSelectorLiterals(selector)

		'''| «escape(characteristicName)» | «if(selector.negated) "*not* " else ""»«literals» |'''
	}

	override fileExtension() {
		"md"
	}

	override escape(String value) {
		'''`«value»`'''
	}

	override highlight(String value) {
		'''*«value»*'''
	}

	override mapCallStackEntry(String entry) {
		'''| «super.mapCallStackEntry(entry)» |'''
	}

	override protected mapClassVariable(CharacteristicTypeSelector variable, String value) {
		'''| «escape(variable.ref.name)» | «escape(retrieveClass(variable).get.name)» | «escape(value)» |'''
	}

	override protected advancedEnumHeader(String... entries) {
		val header = '''«FOR entry : entries BEFORE "\n\n| " SEPARATOR " | " AFTER " |\n"»«entry»«ENDFOR»'''
		val align = '''«FOR entry : entries BEFORE "| " SEPARATOR " | " AFTER " |\n"»:--«ENDFOR»'''
		'''«header»«align»'''
	}

	override protected advancedEnumSeparator() {
		"\n"
	}
	
	override protected indent(String value) {
		'''«"\t"»«value.lines.toArray.join("\n\t")»«if(value.lines.toArray.size > 1) "\n" else ""»'''
	}
	
	override protected mapCharacteristicVariable(CharacteristicVariableType variable, List<String> values) {
		val escapedValues = super.mapCharacteristicVariable(variable, values)
		'''| «escape(variable.name)»«IF variable instanceof CharacteristicSet» (Set)«ENDIF» | «escapedValues» |'''
	
	}

}
