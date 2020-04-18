characteristicsClass_isNotSafe_location_0_NEG('EU').
characteristicsClass_isNotSafe(ClassVar_location) :-
	valueSetMember('Locations', ClassVar_location),
	\+ characteristicsClass_isNotSafe_location_0_NEG(ClassVar_location).
constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, ClassVar_location, P) :-
	ConstraintName = 'NoType0Flow',
	( constraint_NoType0Flow_PreCallState(QueryType, OP, S, ST, ClassVar_location);
	constraint_NoType0Flow_PostCallState(QueryType, OP, S, ST, ClassVar_location);
	constraint_NoType0Flow_CallArgument(QueryType, OP, S, P, ClassVar_location);
	constraint_NoType0Flow_ReturnValue(QueryType, OP, S, P, ClassVar_location) ).
constraint_NoType0Flow_PreCallState(QueryType, OP, S, ST, ClassVar_location) :-
	QueryType = 'PreCallState',
	S = [OP | _],
	stackValid(S),
	preCallState(S, OP, ST, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_location),
	characteristicsClass_isNotSafe(ClassVar_location).
constraint_NoType0Flow_PostCallState(QueryType, OP, S, ST, ClassVar_location) :-
	QueryType = 'PostCallState',
	S = [OP | _],
	stackValid(S),
	postCallState(S, OP, ST, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_location),
	characteristicsClass_isNotSafe(ClassVar_location).
constraint_NoType0Flow_CallArgument(QueryType, OP, S, P, ClassVar_location) :-
	QueryType = 'CallArgument',
	S = [OP | _],
	stackValid(S),
	callArgument(S, P, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_location),
	characteristicsClass_isNotSafe(ClassVar_location).
constraint_NoType0Flow_ReturnValue(QueryType, OP, S, P, ClassVar_location) :-
	QueryType = 'ReturnValue',
	S = [OP | _],
	stackValid(S),
	returnValue(S, P, 'level', 'Type-0'),
	operationProperty(OP, 'location', ClassVar_location),
	characteristicsClass_isNotSafe(ClassVar_location).
