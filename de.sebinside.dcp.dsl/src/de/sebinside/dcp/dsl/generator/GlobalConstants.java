package de.sebinside.dcp.dsl.generator;

/**
 * This class contains a lot of "magic literals" needed for the transformation
 * and the result mapping. These are not supposed to be changed at any time but
 * still gathered here to separate syntax from semantics.
 */
public class GlobalConstants {

	public static enum Prefixes {
		CONSTRAINT("constraint_"), CHARACTERISTICS_CLASS("characteristicsClass_"), CLASS_VARIABLE("ClassVar_");

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
		CONSTRAINT_NAME("ConstraintName"), QUERY_TYPE("QueryType"), CALL_STACK("S"), OPERATION("OP"), PARAMETER("P"),
		CALL_STATE("ST");

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
		CALL_ARGUMENT("CallArgument"), RETURN_VALUE("ReturnValue"), PRE_CALL_STATE("PreCallState"),
		POST_CALL_STATE("PostCallState");

		private String value;

		QueryTypes(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}
	}

}
