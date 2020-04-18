package de.sebinside.dcp.dsl.resultmapping

import de.sebinside.dcp.dsl.dSL.Model
import org.prolog4j.Solution

class ResultMapping {
	
	Model model = null
	Solution<Object> solution = null
	
	new(Model model, Solution<Object> solution) {
		this.model = model
		this.solution = solution
	}
	
}