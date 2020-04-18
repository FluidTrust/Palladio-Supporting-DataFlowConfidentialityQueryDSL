constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, P) :-
	ConstraintName = 'NoType0Flow',
	( constraint_NoType0Flow_PreCallState(QueryType, OP, S, ST);
	constraint_NoType0Flow_PostCallState(QueryType, OP, S, ST);
	constraint_NoType0Flow_CallArgument(QueryType, OP, S, P);
	constraint_NoType0Flow_ReturnValue(QueryType, OP, S, P) ).
constraint_NoType0Flow_PreCallState(QueryType, OP, S, ST) :-
	QueryType = 'PreCallState',
	S = [OP | _],
	stackValid(S),
	preCallState(S, OP, ST, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
constraint_NoType0Flow_PostCallState(QueryType, OP, S, ST) :-
	QueryType = 'PostCallState',
	S = [OP | _],
	stackValid(S),
	postCallState(S, OP, ST, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
constraint_NoType0Flow_CallArgument(QueryType, OP, S, P) :-
	QueryType = 'CallArgument',
	S = [OP | _],
	stackValid(S),
	callArgument(S, P, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
constraint_NoType0Flow_ReturnValue(QueryType, OP, S, P) :-
	QueryType = 'ReturnValue',
	S = [OP | _],
	stackValid(S),
	returnValue(S, P, 'level', 'Type-0'),
	\+ operationProperty(OP, 'location', 'EU').
