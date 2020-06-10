package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import de.sebinside.dcp.dsl.generator.GlobalConstants.QueryTypes
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral
import org.palladiosimulator.supporting.prolog.model.prolog.AtomicQuotedString

interface Converter {
	def AtomicQuotedString convert(CharacteristicType characteristicType)
	
	def AtomicQuotedString convertMember(CharacteristicType characteristicType)

	def AtomicQuotedString convert(EnumCharacteristicLiteral characteristicLiteral)

	def AtomicQuotedString convert(NodeIdentitiySelector selector)

	def String createQualifiedName(NodeIdentitiySelector selector)

	def String resolveQualifiedName(String id, Boolean fullName)

	def String convertVariable(String id)
	
	def String convertCharacteristicLiteral(String id)

	def String convertQueryType(QueryTypes queryType, String variableId) {
		switch (queryType) {
			case CALL_ARGUMENT: "call argument"
			case RETURN_VALUE: "return value"
			case PRE_CALL_STATE: "call state"
			case POST_CALL_STATE: "call state"
		}
	}
	
	def Boolean qualifiedNameResolvable(String id)
}
