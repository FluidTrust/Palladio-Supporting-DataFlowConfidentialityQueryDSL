characteristicsClass_isNotSafe_location_0_NEG('EU').
characteristicsClass_isNotSafe(ClassVar_isNotSafe_location) :-
	valueSetMember('Locations', ClassVar_isNotSafe_location),
	\+ characteristicsClass_isNotSafe_location_0_NEG(ClassVar_isNotSafe_location).
	
constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, ClassVar_isNotSafe_location, P) :-
	ConstraintName = 'NoType0Flow',
	( constraint_NoType0Flow_PreCallState(QueryType, OP, S, ST, ClassVar_isNotSafe_location);
	constraint_NoType0Flow_PostCallState(QueryType, OP, S, ST, ClassVar_isNotSafe_location);
	constraint_NoType0Flow_CallArgument(QueryType, OP, S, P, ClassVar_isNotSafe_location);
	constraint_NoType0Flow_ReturnValue(QueryType, OP, S, P, ClassVar_isNotSafe_location) ).
	
	
constraint_NoType0Flow_PreCallState(QueryType, OP, S, ST, ClassVar_isNotSafe_location) :-
	QueryType = 'PreCallState',
	S = [OP | _],
	stackValid(S),
	operationState(OP, ST),
	preCallState(S, OP, ST, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_isNotSafe_location),
	characteristicsClass_isNotSafe(ClassVar_isNotSafe_location).
	
constraint_NoType0Flow_PostCallState(QueryType, OP, S, ST, ClassVar_isNotSafe_location) :-
	QueryType = 'PostCallState',
	S = [OP | _],
	stackValid(S),
	operationState(OP, ST),
	postCallState(S, OP, ST, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_isNotSafe_location),
	characteristicsClass_isNotSafe(ClassVar_isNotSafe_location).
	
constraint_NoType0Flow_CallArgument(QueryType, OP, S, P, ClassVar_isNotSafe_location) :-
	QueryType = 'CallArgument',
	S = [OP | _],
	stackValid(S),
	operationParameter(OP, P),
	callArgument(S, P, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_isNotSafe_location),
	characteristicsClass_isNotSafe(ClassVar_isNotSafe_location).

constraint_NoType0Flow_ReturnValue(QueryType, OP, S, P, ClassVar_isNotSafe_location) :-
	QueryType = 'ReturnValue',
	S = [OP | _],
	stackValid(S),
	operationReturnValue(OP, P),
	returnValue(S, P, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_isNotSafe_location),
	characteristicsClass_isNotSafe(ClassVar_isNotSafe_location).
