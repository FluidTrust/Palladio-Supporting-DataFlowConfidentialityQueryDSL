constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, P) :-
	ConstraintName = 'NoType0Flow',
	( constraint_NoType0Flow_PRE_CALL_STATE(QueryType, OP, S, ST);
	constraint_NoType0Flow_CALL_ARGUMENT(QueryType, OP, S, P);
	constraint_NoType0Flow_RETURN_VALUE(QueryType, OP, S, P);
	constraint_NoType0Flow_POST_CALL_STATE(QueryType, OP, S, ST) ).
constraint_NoType0Flow_PRE_CALL_STATE(QueryType, OP, S, ST) :-
	QueryType = 'PRE_CALL_STATE',
	S = [OP | _],
	stackValid(S),
	preCallState(S, OP, ST, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
constraint_NoType0Flow_CALL_ARGUMENT(QueryType, OP, S, P) :-
	QueryType = 'CALL_ARGUMENT',
	S = [OP | _],
	stackValid(S),
	callArgument(S, P, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
constraint_NoType0Flow_RETURN_VALUE(QueryType, OP, S, P) :-
	QueryType = 'RETURN_VALUE',
	S = [OP | _],
	stackValid(S),
	returnValue(S, P, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
constraint_NoType0Flow_POST_CALL_STATE(QueryType, OP, S, ST) :-
	QueryType = 'POST_CALL_STATE',
	S = [OP | _],
	stackValid(S),
	postCallState(S, OP, ST, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
