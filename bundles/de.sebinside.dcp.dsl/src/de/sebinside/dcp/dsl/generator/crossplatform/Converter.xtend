package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.GlobalConstants.QueryTypes
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal
import org.palladiosimulator.supporting.prolog.model.prolog.AtomicQuotedString

interface Converter {
	def AtomicQuotedString convert(CharacteristicType characteristicType)
	
	def AtomicQuotedString convertMember(CharacteristicType characteristicType)

	def AtomicQuotedString convert(Literal characteristicLiteral)

	def AtomicQuotedString convert(NodeIdentitiySelector selector)

	def String createQualifiedName(NodeIdentitiySelector selector)

	def String resolveQualifiedName(String id, Boolean fullName)

	def String convertVariable(String id)
	
	def String convertCharacteristicLiteral(String id)

	def String convertQueryType(QueryTypes queryType, String variableId) {
		switch (queryType) {
			case INPUT_PIN: "input pin"
			case OUTPUT_PIN: "output pin"
		}
	}
	
	def Boolean qualifiedNameResolvable(String id)
}
