constraint_NoUnencryptedPersonalDataFlow(ConstraintName, QueryType, OP, S, P) :-
	ConstraintName = 'NoUnencryptedPersonalDataFlow',
	( constraint_NoUnencryptedPersonalDataFlow_CallArgument(QueryType, OP, S, P);
	constraint_NoUnencryptedPersonalDataFlow_ReturnValue(QueryType, OP, S, P) ).
constraint_NoUnencryptedPersonalDataFlow_CallArgument(QueryType, OP, S, P) :-
	QueryType = 'CallArgument',
	S = [OP | _],
	stackValid(S),
	( callArgument(S, P, 'origin', 'EU'),
	callArgument(S, P, 'isPersonalInformation', 'isTrue'),
	\+ callArgument(S, P, 'isEncrypted', 'isTrue') ),
	OP = 'storeInDB'.
constraint_NoUnencryptedPersonalDataFlow_ReturnValue(QueryType, OP, S, P) :-
	QueryType = 'ReturnValue',
	S = [OP | _],
	stackValid(S),
	( returnValue(S, P, 'origin', 'EU'),
	returnValue(S, P, 'isPersonalInformation', 'isTrue'),
	\+ returnValue(S, P, 'isEncrypted', 'isTrue') ),
	OP = 'storeInDB'.