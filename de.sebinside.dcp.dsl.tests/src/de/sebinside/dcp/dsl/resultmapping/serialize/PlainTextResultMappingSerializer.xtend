package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector

class PlainTextResultMappingSerializer extends AbstractResultMappingSerializer {

	package new() {
	}

	override mapNodeIdentity(NodeIdentitiySelector selector) {
		'''"«selector.name»"'''
	}

	override mapCharacteristicClass(CharacteristicClass clazz) {
		'''"«clazz.name»"'''
	}

	override mapCharacteristicTypeSelector(CharacteristicTypeSelector selector) {
		val characteristicName = selector.ref.name
		val literals = selector.literals.map[literal|'''"«literal.entityName»"'''].join(", ")

		'''"«characteristicName»" «if(selector.negated) "not " else ""»set to «literals»'''
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

}
