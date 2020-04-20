package de.sebinside.dcp.dsl.resultmapping.generate

import java.util.List
import java.util.Optional
import java.util.Map

class Violation {

	String queryType
	List<String> callStack
	String operation
	Optional<String> parameter
	Optional<String> callState
	Map<String, String> classVariables

	new() {
	}

	new(String queryType, List<String> callStack, String operation, Optional<String> parameter,
		Optional<String> callState, Map<String, String> classVariables) {
		this.queryType = queryType
		this.callStack = callStack
		this.operation = operation
		this.parameter = parameter
		this.callState = callState
		this.classVariables = classVariables
	}

}
