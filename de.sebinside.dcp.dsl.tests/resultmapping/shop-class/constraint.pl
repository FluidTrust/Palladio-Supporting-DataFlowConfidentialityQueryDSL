characteristicsClass_isNotSafe_location_0_NEG('EU').
characteristicClass_isNotSafe(Location) :-
	valueSetMember('Locations', Location),
	\+ characteristicsClass_isNotSafe_location_0_NEG(Location).
constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, Location, P) :-
	ConstraintName = 'NoType0Flow',
	( constraint_NoType0Flow_PRE_CALL_STATE(QueryType, OP, S, ST, Location);
	constraint_NoType0Flow_CALL_ARGUMENT(QueryType, OP, S, P, Location);
	constraint_NoType0Flow_RETURN_VALUE(QueryType, OP, S, P, Location);
	constraint_NoType0Flow_POST_CALL_STATE(QueryType, OP, S, ST, Location) ).
constraint_NoType0Flow_PRE_CALL_STATE(QueryType, OP, S, ST, Location) :-
	QueryType = 'PRE_CALL_STATE',
	S = [OP | _],
	stackValid(S),
	preCallState(S, OP, ST, 'level', 'Type-0'),
	operationProperty(OP, 'location', Location),
	characteristicClass_isNotSafe(Location).
constraint_NoType0Flow_CALL_ARGUMENT(QueryType, OP, S, P, Location) :-
	QueryType = 'CALL_ARGUMENT',
	S = [OP | _],
	stackValid(S),
	callArgument(S, P, 'level', 'Type-0'),
	operationProperty(OP, 'location', Location),
	characteristicClass_isNotSafe(Location).
constraint_NoType0Flow_RETURN_VALUE(QueryType, OP, S, P, Location) :-
	QueryType = 'RETURN_VALUE',
	S = [OP | _],
	stackValid(S),
	returnValue(S, P, 'level', 'Type-0'),
	operationProperty(OP, 'location', Location),
	characteristicClass_isNotSafe(Location).
constraint_NoType0Flow_POST_CALL_STATE(QueryType, OP, S, ST, Location) :-
	QueryType = 'POST_CALL_STATE',
	S = [OP | _],
	stackValid(S),
	postCallState(S, OP, ST, 'level', 'Type-0'),
	operationProperty(OP, 'location', Location),
	characteristicClass_isNotSafe(Location).
