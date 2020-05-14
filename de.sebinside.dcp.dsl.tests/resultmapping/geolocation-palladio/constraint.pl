constraint_NoUnencryptedPersonalDataFlow(ConstraintName, QueryType, OP, S, ST) :-
	ConstraintName = 'NoUnencryptedPersonalDataFlow',
	constraint_NoUnencryptedPersonalDataFlow_PreCallState(QueryType, OP, S, ST).
constraint_NoUnencryptedPersonalDataFlow_PreCallState(QueryType, OP, S, ST) :-
	QueryType = 'PreCallState',
	S = [OP | _],
	stackValid(S),
	operationState(OP, ST),
	( preCallState(S, OP, ST, 'EnumCharacteristicType Origin (_tN5q8HKKEeq9tYpRa9lb6Q)', 'EnumCharacteristicLiteral EU (_ryWS8HKKEeq9tYpRa9lb6Q)'),
	preCallState(S, OP, ST, 'EnumCharacteristicType PersonalInformation (__hrkUHKKEeq9tYpRa9lb6Q)', 'EnumCharacteristicLiteral true (_6MC8YHKKEeq9tYpRa9lb6Q)'),
	\+ preCallState(S, OP, ST, 'EnumCharacteristicType Encryption (_98iygHKKEeq9tYpRa9lb6Q)', 'EnumCharacteristicLiteral true (_6MC8YHKKEeq9tYpRa9lb6Q)') ),
	OP = 'ResourceDemandingSEFF (_GDFtwHKJEeq9tYpRa9lb6Q) - AC _q7weoHKJEeq9tYpRa9lb6Q'.
