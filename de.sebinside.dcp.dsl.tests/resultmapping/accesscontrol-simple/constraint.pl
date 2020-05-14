constraint_AuthorizedAccess(ConstraintName, QueryType, OP, S, VarSet_authRoles, VarSet_accessRoles, P) :-
	ConstraintName = 'AuthorizedAccess',
	( constraint_AuthorizedAccess_CallArgument(QueryType, OP, S, P, VarSet_authRoles, VarSet_accessRoles);
	constraint_AuthorizedAccess_ReturnValue(QueryType, OP, S, P, VarSet_authRoles, VarSet_accessRoles) ).
constraint_AuthorizedAccess_CallArgument(QueryType, OP, S, P, VarSet_authRoles, VarSet_accessRoles) :-
	QueryType = 'CallArgument',
	S = [OP | _],
	stackValid(S),
	operationParameter(OP, P),
	findall(IteratorTemplate, callArgument(S, P, 'authorizedRoles', IteratorTemplate), VarSet_authRoles),
	findall(IteratorTemplate, operationProperty(OP, 'accessRoles', IteratorTemplate), VarSet_accessRoles),
	( intersection(VarSet_authRoles, VarSet_accessRoles, Temp_0),
	\+ length(Temp_0, 0) ).
constraint_AuthorizedAccess_ReturnValue(QueryType, OP, S, P, VarSet_authRoles, VarSet_accessRoles) :-
	QueryType = 'ReturnValue',
	S = [OP | _],
	stackValid(S),
	operationReturnValue(OP, P),
	findall(IteratorTemplate, returnValue(S, P, 'authorizedRoles', IteratorTemplate), VarSet_authRoles),
	findall(IteratorTemplate, operationProperty(OP, 'accessRoles', IteratorTemplate), VarSet_accessRoles),
	( intersection(VarSet_authRoles, VarSet_accessRoles, Temp_0),
	\+ length(Temp_0, 0) ).