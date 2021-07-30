constraint_AuthorizedAccess(ConstraintName, QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles) :-
	ConstraintName = 'AuthorizedAccess',
	constraint_AuthorizedAccess_InputPin(QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles).
constraint_AuthorizedAccess_InputPin(QueryType, N, PIN, S, VarSet_accessRoles, VarSet_authRoles) :-
	QueryType = 'InputPin',
	flowTree(N, PIN, S),
	inputPin(N, PIN),
	setof(IteratorTemplate, characteristic(N, PIN, 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', IteratorTemplate, S), VarSet_authRoles),
	setof(IteratorTemplate, nodeCharacteristic(N, 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', IteratorTemplate), VarSet_accessRoles),
	(
		intersection(VarSet_authRoles, VarSet_accessRoles, Temp_0),
		\+ length(Temp_0, 0)
	).



Optional[:-discontiguous(actor/1).
:-discontiguous(actorProcess/2).
:-discontiguous(characteristic/5).
:-discontiguous(characteristic/6).
:-discontiguous(characteristicType/1).
:-discontiguous(characteristicTypeValue/3).
:-discontiguous(dataflow/5).
:-discontiguous(flowTree/3).
:-discontiguous(flowTree/4).
:-discontiguous(flowTreeForFlows/4).
:-discontiguous(inputFlow/5).
:-discontiguous(inputFlowSelection/3).
:-discontiguous(inputFlowsSelection/2).
:-discontiguous(inputPin/2).
:-discontiguous(inputPinsFlowSelection/2).
:-discontiguous(involvesNode/2).
:-discontiguous(nodeCharacteristic/3).
:-discontiguous(outputPin/2).
:-discontiguous(process/1).
:-discontiguous(setof_characteristics/5).
:-discontiguous(store/1).
:-discontiguous(traversedNode/2).

% ============================
% HELPER: input flow selection
% ============================
% Select the input flow (FLOW) for the pin (PIN) of node (P) from a set of available flows (AVAILABLE_FLOWS) but do not pick a flow listed in already visited flows (VISITED).
% Assumption: the set contains exactly one flow for the pin
inputFlow(P, PIN, AVAILABLE_FLOWS, FLOW, VISITED) :-
	inputPin(P, PIN),
	inputFlowsSelection(P, AVAILABLE_FLOWS),
	inputFlowSelection(PIN, AVAILABLE_FLOWS, FLOW),
	intersection(VISITED, [FLOW], []).

% Find one arbitrary set of flows (SELECTED_FLOWS) for a given node (P) in a way that for every input pin, there is exactly one input flow.
% Using this rule in conjunction with findall would yield all possible combinations of input flows that meet the described condition.
% This rule is non-deterministic because inputPinsFlowSelection/3 is non-deterministic.
inputFlowsSelection(P, SELECTED_FLOWS) :-
	findall(X, inputPin(P, X), INPUT_PINS),
	inputPinsFlowSelection(INPUT_PINS, SELECTED_FLOWS).

% Find one arbitrary set of flows for a given set of input pins in a way that for every input pin, there is exactly one input flow.
% This rule is non-deterministic because it succeeds many times if there are multiple possible combinations that meet the described condition.
inputPinsFlowSelection([], []).
inputPinsFlowSelection([PIN | T], [FLOW_TO_PIN | RECURSE_FLOWS]) :-
	dataflow(FLOW_TO_PIN, _, _, _, PIN),
	inputPinsFlowSelection(T, RECURSE_FLOWS).

% Select the input flow (FLOW) for the pin (PIN) from a set of available flows. Here: list head matches.
inputFlowSelection(PIN, [FLOW | _], FLOW) :-
	dataflow(FLOW, _, _, _, PIN),
	!.

% Select the input flow (FLOW) for the pin (PIN) from a set of available flows. Here: use an entry of list tail.
inputFlowSelection(PIN, [H | T], FLOW) :-
	dataflow(H, _, _, _, PIN2),
	PIN \= PIN2,
	inputFlowSelection(PIN, T, FLOW).

% ==============================
% HELPER: create valid flow tree
% ==============================
flowTree(N, PIN, S) :-
	flowTree(N, PIN, S, []).
flowTree(N, PIN, [], _) :-
	actor(N),
	outputPin(N, PIN),
	!.
flowTree(N, PIN, S, VISITED) :-
	inputPin(N, PIN),
	dataflow(F, NSRC, PINSRC, N, PIN),
	flowTree(NSRC, PINSRC, TMP, [F | VISITED]),
	S = [F | TMP].
flowTree(N, PIN, S, VISITED) :-
	outputPin(N, PIN),
	(
		process(N);
		store(N)
	),
	inputFlowsSelection(N, FLOWS),
	flowTreeForFlows(N, S, FLOWS, VISITED).
flowTreeForFlows(_, [], [], _).
flowTreeForFlows(N, S, [F | T], VISITED) :-
	intersection([F], VISITED, []),
	flowTreeForFlows(N, STAIL, T, VISITED),
	dataflow(F, NSRC, PINSRC, _, _),
	flowTree(NSRC, PINSRC, TMP, [F | VISITED]),
	SHEAD = [F | TMP],
	S = [SHEAD | STAIL].

% ===========================================
% HELPER: find traversed nodes from flow tree
% ===========================================
traversedNode(S, N) :-
	flatten(S, SFLAT),
	list_to_set(SFLAT, FLOWS),
	setof(X, involvesNode(FLOWS, X), NODES),
	member(N, NODES).
involvesNode([F | _], N) :-
	dataflow(F, N, _, _, _),
	\+ dataflow(F, _, _, N, _).
involvesNode([F | _], N) :-
	dataflow(F, _, _, N, _),
	\+ dataflow(F, N, _, _, _).
involvesNode([_ | T], N) :-
	involvesNode(T, N).

% ======================================
% HELPER: Shortcuts for common use cases
% ======================================
% Shortcut for characteristic queries
characteristic(N, PIN, CT, V, S) :-
	characteristic(N, PIN, CT, V, S, []).

% Always inherit node characteristics from parent
nodeCharacteristic(N, CT, V) :-
	actorProcess(N, A),
	nodeCharacteristic(A, CT, V).

% ==================================================
% HELPER: collect all available data characteristics
% ==================================================
setof_characteristics(N, PIN, CT, RESULT, S) :-
	flowTree(N, PIN, S),
	setof(V, characteristic(N, PIN, CT, V, S), RESULT).

% ==================================
% HELPER: find input characteristics
% ==================================
characteristic(N, PIN, CT, V, [F | S], VISITED) :-
	inputPin(N, PIN),
	dataflow(F, NSRC, PINSRC, N, PIN),
	intersection([F], VISITED, []),
	characteristic(NSRC, PINSRC, CT, V, S, [F | VISITED]).

% ====================
% Characteristic types
% ====================
characteristicType('AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)').
characteristicTypeValue('AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Agency (_qiLIENvTEeqNdo_V4bA-xw)', 0).
characteristicTypeValue('AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)', 1).
characteristicTypeValue('AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'User (_tkFZ4NvTEeqNdo_V4bA-xw)', 2).
characteristicType('Roles (_JvuuQ9vqEeqNdo_V4bA-xw)').
characteristicTypeValue('Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'Agency (_qiLIENvTEeqNdo_V4bA-xw)', 0).
characteristicTypeValue('Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)', 1).
characteristicTypeValue('Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'User (_tkFZ4NvTEeqNdo_V4bA-xw)', 2).

% =====
% Nodes
% =====
% Actor User
actor('User (__Sm0pdvUEeqNdo_V4bA-xw)').
nodeCharacteristic('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'User (_tkFZ4NvTEeqNdo_V4bA-xw)').
inputPin('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.in.confirmation (_Bu3bsNvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)').
outputPin('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.requestData (_CGi74dvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)').
characteristic('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.requestData (_CGi74dvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Agency (_qiLIENvTEeqNdo_V4bA-xw)', [], _) :-
	true.
characteristic('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.requestData (_CGi74dvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)', [], _) :-
	true.
characteristic('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.requestData (_CGi74dvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'User (_tkFZ4NvTEeqNdo_V4bA-xw)', [], _) :-
	true.
outputPin('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.ccd (_EtXNIdvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)').
characteristic('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.ccd (_EtXNIdvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Agency (_qiLIENvTEeqNdo_V4bA-xw)', [], _) :-
	false.
characteristic('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.ccd (_EtXNIdvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)', [], _) :-
	false.
characteristic('User (__Sm0pdvUEeqNdo_V4bA-xw)', 'User.out.ccd (_EtXNIdvVEeqNdo_V4bA-xw__Sm0pdvUEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'User (_tkFZ4NvTEeqNdo_V4bA-xw)', [], _) :-
	true.

% Actor FlightPlanner
actor('FlightPlanner (_PR93hdvZEeqNdo_V4bA-xw)').
nodeCharacteristic('FlightPlanner (_PR93hdvZEeqNdo_V4bA-xw)', 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)').
outputPin('FlightPlanner (_PR93hdvZEeqNdo_V4bA-xw)', 'FlightPlanner.out.flights (_mQuSQdvZEeqNdo_V4bA-xw_PR93hdvZEeqNdo_V4bA-xw)').
characteristic('FlightPlanner (_PR93hdvZEeqNdo_V4bA-xw)', 'FlightPlanner.out.flights (_mQuSQdvZEeqNdo_V4bA-xw_PR93hdvZEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Agency (_qiLIENvTEeqNdo_V4bA-xw)', [], _) :-
	true.
characteristic('FlightPlanner (_PR93hdvZEeqNdo_V4bA-xw)', 'FlightPlanner.out.flights (_mQuSQdvZEeqNdo_V4bA-xw_PR93hdvZEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)', [], _) :-
	true.
characteristic('FlightPlanner (_PR93hdvZEeqNdo_V4bA-xw)', 'FlightPlanner.out.flights (_mQuSQdvZEeqNdo_V4bA-xw_PR93hdvZEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'User (_tkFZ4NvTEeqNdo_V4bA-xw)', [], _) :-
	true.

% Store Airline.FlightStorage
store('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)').
nodeCharacteristic('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)').
inputPin('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'input (_jjMuUNvUEeqNdo_V4bA-xw_ua6FdtvZEeqNdo_V4bA-xw)').
outputPin('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'output (_j3IW8dvUEeqNdo_V4bA-xw_ua6FdtvZEeqNdo_V4bA-xw)').
characteristic('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'output (_j3IW8dvUEeqNdo_V4bA-xw_ua6FdtvZEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Agency (_qiLIENvTEeqNdo_V4bA-xw)', S, VISITED) :-
	inputFlow('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'input (_jjMuUNvUEeqNdo_V4bA-xw_ua6FdtvZEeqNdo_V4bA-xw)', _, F0, VISITED),
	S0 = [F0 | _],
	S = [S0],
	characteristic('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'input (_jjMuUNvUEeqNdo_V4bA-xw_ua6FdtvZEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Agency (_qiLIENvTEeqNdo_V4bA-xw)', S0, VISITED).
characteristic('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'output (_j3IW8dvUEeqNdo_V4bA-xw_ua6FdtvZEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)', S, VISITED) :-
	inputFlow('Airline.FlightStorage (_ua6FdtvZEeqNdo_V4bA-xw)', 'input (_jjMuU...
