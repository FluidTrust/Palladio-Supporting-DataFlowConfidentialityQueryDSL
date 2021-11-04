package de.sebinside.dcp.dsl.generator;

/**
 * This class contains a lot of "magic literals" needed for the transformation
 * and the result mapping. These are not supposed to be changed at any time but
 * still gathered here to separate syntax from semantics.
 */
public class GlobalConstants {

	public static enum Prefixes {
		CONSTRAINT("constraint_"), CHARACTERISTICS_CLASS("characteristicsClass_"), 
		CLASS_VARIABLE("ClassVar_"), CHARACTERISTIC_VARIABLE("Var_"), CHARACTERISTIC_SET_VARIABLE("VarSet_"),
		TEMPORAL_VARIABLE("Temp_");

		private String value;

		Prefixes(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}
	}
	
	public static enum Parameters {
        CONSTRAINT_NAME("ConstraintName"), QUERY_TYPE("QueryType"), NODE("N"), NODE_FROM("N_FROM"), PIN(
                "PIN"), CALL_STACK("S"), ITERATOR_TEMPLATE_1("V"), ITERATOR_TEMPLATE_2("R");

		private String value;

		Parameters(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}
	}

	public static enum QueryTypes {
		INPUT_PIN("InputPin", "inputPin"), OUTPUT_PIN("OutputPin", "outputPin");

		private String value;
		private String prolog;

		QueryTypes(String name, String prolog) {
			this.value = name;
			this.prolog = prolog;
		}
		
		public String prolog() {
			return this.prolog;
		}

		@Override
		public String toString() {
			return this.value;
		}
	}

}
