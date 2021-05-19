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
	
	
constraint_AuthorizedAccess_Input(QueryType, N, PIN, S, VarSet_authRoles, VarSet_accessRoles) :-
	QueryType = 'Input',
	inputPin(N, PIN), 
	setof(R, nodeCharacteristic(N, 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', R), VarSet_authRoles),
	setof_characteristics(N, PIN, 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', VarSet_accessRoles, S),
	intersection(VarSet_authRoles, VarSet_accessRoles, []).
	flowTree(N, PIN, S).
