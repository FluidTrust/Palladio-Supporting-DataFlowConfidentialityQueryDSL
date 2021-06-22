constraint_AuthorizedAccess(ConstraintName, QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles) :-
	ConstraintName = 'AuthorizedAccess',
	constraint_AuthorizedAccess_InputPin(QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles).
constraint_AuthorizedAccess_InputPin(QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles) :-
	QueryType = 'InputPin',
	inputPin(N, PIN),
	flowTree(N, PIN, S),
	setof(R, nodeCharacteristic(N, 'EnumCharacteristicType Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', R), VarSet_accessRoles),
	setof(V, characteristic(N, PIN, 'EnumCharacteristicType AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', V, S), VarSet_authRoles),
	(
		intersection(VarSet_authRoles, VarSet_accessRoles, Temp_0),
		length(Temp_0, 0)
	).
