package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.resultmapping.serialize

import java.util.Optional
import org.prolog4j.SolutionIterator
import org.prolog4j.UnknownVariableException
import java.util.List
import java.util.ArrayList
import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector

class ResultMappingUtils {
	static def Optional<String> getSolutionVariable(SolutionIterator<Object> iterator, String variableName) {
		try {
			Optional.of(iterator.get(variableName).toString)
		} catch (UnknownVariableException e) {
			// This exception is thrown if the variable does not exist. There is no other way to get this information.
			Optional.empty
		} catch (RuntimeException e) {
			// This exception is thrown if the variable exists, but is empty. There is no other way to get this information.
			Optional.of("")
		}
	}

	static def Optional<List<Object>> getSolutionArray(SolutionIterator<Object> iterator, String variableName) {
		try {
			val value = iterator.get(variableName)
			Optional.of(value as List<Object>)
		} catch (UnknownVariableException e) {
			// This exception is thrown if the variable does not exist. There is no other way to get this information.
			Optional.empty
		} catch (RuntimeException e) {
			// This exception is thrown if the variable exists, but is empty. There is no other way to get this information.
			Optional.of(new ArrayList<Object>())
		}
	}
	
	static def Optional<List<String>> getSolutionStringArray(SolutionIterator<Object> iterator, String variableName) {
		try {
			val value = iterator.get(variableName)
			Optional.of(value as List<String>)
		} catch (UnknownVariableException e) {
			// This exception is thrown if the variable does not exist. There is no other way to get this information.
			Optional.empty
		} catch (RuntimeException e) {
			// This exception is thrown if the variable exists, but is empty. There is no other way to get this information.
			Optional.of(new ArrayList<String>())
		}
	}

	static def Optional<CharacteristicClass> retrieveClass(CharacteristicTypeSelector member) {
		val containment = member.eContainer

		if (containment instanceof CharacteristicClass) {
			Optional.of(containment as CharacteristicClass)
		} else {
			Optional.empty
		}
	}
	
}
