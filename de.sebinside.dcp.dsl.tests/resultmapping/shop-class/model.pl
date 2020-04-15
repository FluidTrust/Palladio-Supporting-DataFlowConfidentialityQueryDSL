 :- discontiguous(isDataType/1).
 :- discontiguous(dataTypeAttribute/2).
 :- discontiguous(isOperation/1).
 :- discontiguous(hasProperty/2).
 :- discontiguous(operationProperty/3).
 :- discontiguous(operationParameterType/3).
 :- discontiguous(operationReturnValueType/3).
 :- discontiguous(operationStateType/3).
 :- discontiguous(operationCall/3).
 :- discontiguous(isSystemUsage/1).
 :- discontiguous(defaultStateImpl/4).
 :- discontiguous(callArgumentImpl/4).
 :- discontiguous(returnValueImpl/4).
 :- discontiguous(preCallStateImpl/5).
 :- discontiguous(postCallStateImpl/5).
 :- discontiguous(not_callArgumentImpl/4).
 :- discontiguous(not_returnValueImpl/4).
 :- discontiguous(not_preCallStateImpl/5).
 :- discontiguous(not_postCallStateImpl/5).
 :- discontiguous(not_operationProperty/3).
 :- discontiguous(not_defaultStateImpl/4).
isAttribute(ATTRIB) :- attributeType(ATTRIB,_).
isProperty(ATTRIB) :- propertyType(ATTRIB,_).
operationParameter(OP,PARAM) :- operationParameterType(OP,PARAM,_).
operationReturnValue(OP,RVAL) :- operationReturnValueType(OP,RVAL,_).
operationState(OP,SVAL) :- operationStateType(OP,SVAL,_).
callArgument([OP|S],VAR,A,VAL) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL).
returnValue([OP|S],VAR,A,VAL) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL).
preCallState([SOP|S],OP,VAR,A,VAL) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),preCallStateImpl([SOP|S],OP,VAR,A,VAL).
postCallState([SOP|S],OP,VAR,A,VAL) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),postCallStateImpl([SOP|S],OP,VAR,A,VAL).
defaultState(OP,VAR,A,VAL) :- operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),defaultStateImpl(OP,VAR,A,VAL).
stackValid([SU]) :- isSystemUsage(SU).
stackValid([DEST,CALL,SOURCE | S]) :- operationCall(SOURCE,DEST,CALL), stackValid([SOURCE | S]).
lnot(lnot(A)) :- A.
lnot((A,B)) :- (lnot(A);lnot(B)).
lnot((A;B)) :- (lnot(A),lnot(B)).
lnot(true) :- fail.
lnot(fail) :- true.
lnot(callArgumentImpl(S,P,A,V)) :- not_callArgumentImpl(S,P,A,V).
lnot(returnValueImpl(S,P,A,V)) :- not_returnValueImpl(S,P,A,V).
lnot(operationProperty(OP,P,V)) :- not_operationProperty(OP,P,V).
lnot(preCallStateImpl(S,OP,P,A,V)) :- not_preCallStateImpl(S,OP,P,A,V).
lnot(postCallStateImpl(S,OP,P,A,V)) :- not_postCallStateImpl(S,OP,P,A,V).
lnot(defaultStateImpl(OP,VAR,A,V)) :- not_defaultStateImpl(OP,VAR,A,V).
lnot(callArgument([OP|S],VAR,A,VAL)) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_callArgumentImpl([OP|S],VAR,A,VAL).
lnot(returnValue([OP|S],VAR,A,VAL)) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_returnValueImpl([OP|S],VAR,A,VAL).
lnot(preCallState([SOP|S],OP,VAR,A,VAL)) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_preCallStateImpl([SOP|S],OP,VAR,A,VAL).
lnot(postCallState([SOP|S],OP,VAR,A,VAL)) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_postCallStateImpl([SOP|S],OP,VAR,A,VAL).
lnot(defaultState(OP,VAR,A,VAL)) :- operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_defaultStateImpl(OP,VAR,A,VAL).

%-------------------------Value Set Type Definitions-------------------------
valueSetMember('PrivacyLevel','Type-0').
valueSetMember('PrivacyLevel','Type-1').
valueSetMember('PrivacyLevel','Type-2').
valueSetMember('Locations','EU').
valueSetMember('Locations','US').
valueSetMember('Locations','Asia').

%-------------------------Property Type Definitions--------------------------
propertyType('location','Locations').

%-------------------------Attribute Type Definitions-------------------------
attributeType('level','PrivacyLevel').

%---------------------------Data Type Definitions----------------------------
isDataType('ProductId').
dataTypeAttribute('ProductId','level').
isDataType('ProductPage').
dataTypeAttribute('ProductPage','level').
isDataType('Recommendation').
dataTypeAttribute('Recommendation','level').
isDataType('Cart').
dataTypeAttribute('Cart','level').
isDataType('CustomerInfo').
dataTypeAttribute('CustomerInfo','level').
isDataType('TransactionLog').
dataTypeAttribute('TransactionLog','level').
isDataType('AnonymizedOrder').
dataTypeAttribute('AnonymizedOrder','level').


%----------------------------------------------------------------------------
%-------------------------Operation ShopServer_view--------------------------
%----------------------------------------------------------------------------
isOperation('ShopServer_view').
hasProperty('ShopServer_view','location').
operationProperty('ShopServer_view','location', 'EU').
not_operationProperty('ShopServer_view','location', 'US').
not_operationProperty('ShopServer_view','location', 'Asia').
operationParameterType('ShopServer_view','product','ProductId').
operationReturnValueType('ShopServer_view','productpage','ProductPage').

%------------------Default State Values of ShopServer_view-------------------

%---Call to RecommendationSystem_getRecommendations (fetchRecommendations)---
operationCall('ShopServer_view','RecommendationSystem_getRecommendations','fetchRecommendations').
callArgumentImpl(['RecommendationSystem_getRecommendations','fetchRecommendations'|['ShopServer_view'|S]], 'product', 'level', 'Type-0') :- callArgumentImpl(['ShopServer_view'|S],'product','level','Type-0').
not_callArgumentImpl(['RecommendationSystem_getRecommendations','fetchRecommendations'|['ShopServer_view'|S]], 'product', 'level', 'Type-0') :- lnot(callArgumentImpl(['ShopServer_view'|S],'product','level','Type-0')).
callArgumentImpl(['RecommendationSystem_getRecommendations','fetchRecommendations'|['ShopServer_view'|S]], 'product', 'level', 'Type-1') :- callArgumentImpl(['ShopServer_view'|S],'product','level','Type-1').
not_callArgumentImpl(['RecommendationSystem_getRecommendations','fetchRecommendations'|['ShopServer_view'|S]], 'product', 'level', 'Type-1') :- lnot(callArgumentImpl(['ShopServer_view'|S],'product','level','Type-1')).
callArgumentImpl(['RecommendationSystem_getRecommendations','fetchRecommendations'|['ShopServer_view'|S]], 'product', 'level', 'Type-2') :- callArgumentImpl(['ShopServer_view'|S],'product','level','Type-2').
not_callArgumentImpl(['RecommendationSystem_getRecommendations','fetchRecommendations'|['ShopServer_view'|S]], 'product', 'level', 'Type-2') :- lnot(callArgumentImpl(['ShopServer_view'|S],'product','level','Type-2')).

%---------------------Call to LogDB_store (logPageView)----------------------
operationCall('ShopServer_view','LogDB_store','logPageView').
callArgumentImpl(['LogDB_store','logPageView'|['ShopServer_view'|_]], 'log', 'level', 'Type-0') :- fail.
not_callArgumentImpl(['LogDB_store','logPageView'|['ShopServer_view'|_]], 'log', 'level', 'Type-0') :- lnot(fail).
callArgumentImpl(['LogDB_store','logPageView'|['ShopServer_view'|_]], 'log', 'level', 'Type-1') :- true.
not_callArgumentImpl(['LogDB_store','logPageView'|['ShopServer_view'|_]], 'log', 'level', 'Type-1') :- lnot(true).
callArgumentImpl(['LogDB_store','logPageView'|['ShopServer_view'|_]], 'log', 'level', 'Type-2') :- fail.
not_callArgumentImpl(['LogDB_store','logPageView'|['ShopServer_view'|_]], 'log', 'level', 'Type-2') :- lnot(fail).

%----------------------Return Values of ShopServer_view----------------------
returnValueImpl(['ShopServer_view'|_], 'productpage', 'level', 'Type-0') :- fail.
not_returnValueImpl(['ShopServer_view'|_], 'productpage', 'level', 'Type-0') :- lnot(fail).
returnValueImpl(['ShopServer_view'|_], 'productpage', 'level', 'Type-1') :- fail.
not_returnValueImpl(['ShopServer_view'|_], 'productpage', 'level', 'Type-1') :- lnot(fail).
returnValueImpl(['ShopServer_view'|_], 'productpage', 'level', 'Type-2') :- true.
not_returnValueImpl(['ShopServer_view'|_], 'productpage', 'level', 'Type-2') :- lnot(true).

%--------------------State Definitions of ShopServer_view--------------------


%----------------------------------------------------------------------------
%-------------Operation RecommendationSystem_getRecommendations--------------
%----------------------------------------------------------------------------
isOperation('RecommendationSystem_getRecommendations').
hasProperty('RecommendationSystem_getRecommendations','location').
operationProperty('RecommendationSystem_getRecommendations','location', 'US').
not_operationProperty('RecommendationSystem_getRecommendations','location', 'EU').
not_operationProperty('RecommendationSystem_getRecommendations','location', 'Asia').
operationParameterType('RecommendationSystem_getRecommendations','product','ProductId').
operationReturnValueType('RecommendationSystem_getRecommendations','recommendation','Recommendation').

%------Default State Values of RecommendationSystem_getRecommendations-------

%----------Return Values of RecommendationSystem_getRecommendations----------
returnValueImpl(['RecommendationSystem_getRecommendations'|_], 'recommendation', 'level', 'Type-0') :- fail.
not_returnValueImpl(['RecommendationSystem_getRecommendations'|_], 'recommendation', 'level', 'Type-0') :- lnot(fail).
returnValueImpl(['RecommendationSystem_getRecommendations'|_], 'recommendation', 'level', 'Type-1') :- fail.
not_returnValueImpl(['RecommendationSystem_getRecommendations'|_], 'recommendation', 'level', 'Type-1') :- lnot(fail).
returnValueImpl(['RecommendationSystem_getRecommendations'|_], 'recommendation', 'level', 'Type-2') :- true.
not_returnValueImpl(['RecommendationSystem_getRecommendations'|_], 'recommendation', 'level', 'Type-2') :- lnot(true).

%--------State Definitions of RecommendationSystem_getRecommendations--------


%----------------------------------------------------------------------------
%---------------------------Operation LogDB_store----------------------------
%----------------------------------------------------------------------------
isOperation('LogDB_store').
hasProperty('LogDB_store','location').
operationProperty('LogDB_store','location', 'US').
not_operationProperty('LogDB_store','location', 'EU').
not_operationProperty('LogDB_store','location', 'Asia').
operationParameterType('LogDB_store','log','TransactionLog').

%--------------------Default State Values of LogDB_store---------------------

%------------------------Return Values of LogDB_store------------------------

%----------------------State Definitions of LogDB_store----------------------


%----------------------------------------------------------------------------
%--------------------------Operation ShopServer_buy--------------------------
%----------------------------------------------------------------------------
isOperation('ShopServer_buy').
hasProperty('ShopServer_buy','location').
operationProperty('ShopServer_buy','location', 'EU').
not_operationProperty('ShopServer_buy','location', 'US').
not_operationProperty('ShopServer_buy','location', 'Asia').
operationParameterType('ShopServer_buy','cart','Cart').
operationParameterType('ShopServer_buy','customer','CustomerInfo').

%-------------------Default State Values of ShopServer_buy-------------------

%----------------------Call to UserDB_store (storeUser)----------------------
operationCall('ShopServer_buy','UserDB_store','storeUser').
callArgumentImpl(['UserDB_store','storeUser'|['ShopServer_buy'|S]], 'customer', 'level', 'Type-0') :- callArgumentImpl(['ShopServer_buy'|S],'customer','level','Type-0').
not_callArgumentImpl(['UserDB_store','storeUser'|['ShopServer_buy'|S]], 'customer', 'level', 'Type-0') :- lnot(callArgumentImpl(['ShopServer_buy'|S],'customer','level','Type-0')).
callArgumentImpl(['UserDB_store','storeUser'|['ShopServer_buy'|S]], 'customer', 'level', 'Type-1') :- callArgumentImpl(['ShopServer_buy'|S],'customer','level','Type-1').
not_callArgumentImpl(['UserDB_store','storeUser'|['ShopServer_buy'|S]], 'customer', 'level', 'Type-1') :- lnot(callArgumentImpl(['ShopServer_buy'|S],'customer','level','Type-1')).
callArgumentImpl(['UserDB_store','storeUser'|['ShopServer_buy'|S]], 'customer', 'level', 'Type-2') :- callArgumentImpl(['ShopServer_buy'|S],'customer','level','Type-2').
not_callArgumentImpl(['UserDB_store','storeUser'|['ShopServer_buy'|S]], 'customer', 'level', 'Type-2') :- lnot(callArgumentImpl(['ShopServer_buy'|S],'customer','level','Type-2')).

%--------Call to RecommendationSystem_update (updateRecommendations)---------
operationCall('ShopServer_buy','RecommendationSystem_update','updateRecommendations').
callArgumentImpl(['RecommendationSystem_update','updateRecommendations'|['ShopServer_buy'|_]], 'order', 'level', 'Type-0') :- fail.
not_callArgumentImpl(['RecommendationSystem_update','updateRecommendations'|['ShopServer_buy'|_]], 'order', 'level', 'Type-0') :- lnot(fail).
callArgumentImpl(['RecommendationSystem_update','updateRecommendations'|['ShopServer_buy'|_]], 'order', 'level', 'Type-1') :- true.
not_callArgumentImpl(['RecommendationSystem_update','updateRecommendations'|['ShopServer_buy'|_]], 'order', 'level', 'Type-1') :- lnot(true).
callArgumentImpl(['RecommendationSystem_update','updateRecommendations'|['ShopServer_buy'|_]], 'order', 'level', 'Type-2') :- fail.
not_callArgumentImpl(['RecommendationSystem_update','updateRecommendations'|['ShopServer_buy'|_]], 'order', 'level', 'Type-2') :- lnot(fail).

%-----------------------Call to LogDB_store (storeLog)-----------------------
operationCall('ShopServer_buy','LogDB_store','storeLog').
callArgumentImpl(['LogDB_store','storeLog'|['ShopServer_buy'|_]], 'log', 'level', 'Type-0') :- fail.
not_callArgumentImpl(['LogDB_store','storeLog'|['ShopServer_buy'|_]], 'log', 'level', 'Type-0') :- lnot(fail).
callArgumentImpl(['LogDB_store','storeLog'|['ShopServer_buy'|_]], 'log', 'level', 'Type-1') :- true.
not_callArgumentImpl(['LogDB_store','storeLog'|['ShopServer_buy'|_]], 'log', 'level', 'Type-1') :- lnot(true).
callArgumentImpl(['LogDB_store','storeLog'|['ShopServer_buy'|_]], 'log', 'level', 'Type-2') :- fail.
not_callArgumentImpl(['LogDB_store','storeLog'|['ShopServer_buy'|_]], 'log', 'level', 'Type-2') :- lnot(fail).

%----------------------Return Values of ShopServer_buy-----------------------

%--------------------State Definitions of ShopServer_buy---------------------


%----------------------------------------------------------------------------
%---------------------------Operation UserDB_store---------------------------
%----------------------------------------------------------------------------
isOperation('UserDB_store').
hasProperty('UserDB_store','location').
operationProperty('UserDB_store','location', 'Asia').
not_operationProperty('UserDB_store','location', 'EU').
not_operationProperty('UserDB_store','location', 'US').
operationParameterType('UserDB_store','customer','CustomerInfo').

%--------------------Default State Values of UserDB_store--------------------

%-----------------------Return Values of UserDB_store------------------------

%---------------------State Definitions of UserDB_store----------------------


%----------------------------------------------------------------------------
%-------------------Operation RecommendationSystem_update--------------------
%----------------------------------------------------------------------------
isOperation('RecommendationSystem_update').
hasProperty('RecommendationSystem_update','location').
operationProperty('RecommendationSystem_update','location', 'US').
not_operationProperty('RecommendationSystem_update','location', 'EU').
not_operationProperty('RecommendationSystem_update','location', 'Asia').
operationParameterType('RecommendationSystem_update','order','AnonymizedOrder').

%------------Default State Values of RecommendationSystem_update-------------

%----------------Return Values of RecommendationSystem_update----------------

%--------------State Definitions of RecommendationSystem_update--------------


%----------------------------------------------------------------------------
%-----------------------------System Usage usage-----------------------------
%----------------------------------------------------------------------------
isSystemUsage('usage').

%-----------------------Call to ShopServer_view (view)-----------------------
operationCall('usage','ShopServer_view','view').
callArgumentImpl(['ShopServer_view','view'|['usage'|_]], 'product', 'level', 'Type-0') :- fail.
not_callArgumentImpl(['ShopServer_view','view'|['usage'|_]], 'product', 'level', 'Type-0') :- lnot(fail).
callArgumentImpl(['ShopServer_view','view'|['usage'|_]], 'product', 'level', 'Type-1') :- fail.
not_callArgumentImpl(['ShopServer_view','view'|['usage'|_]], 'product', 'level', 'Type-1') :- lnot(fail).
callArgumentImpl(['ShopServer_view','view'|['usage'|_]], 'product', 'level', 'Type-2') :- true.
not_callArgumentImpl(['ShopServer_view','view'|['usage'|_]], 'product', 'level', 'Type-2') :- lnot(true).

%------------------------Call to ShopServer_buy (buy)------------------------
operationCall('usage','ShopServer_buy','buy').
callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'customer', 'level', 'Type-0') :- true.
not_callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'customer', 'level', 'Type-0') :- lnot(true).
callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'customer', 'level', 'Type-1') :- fail.
not_callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'customer', 'level', 'Type-1') :- lnot(fail).
callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'customer', 'level', 'Type-2') :- fail.
not_callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'customer', 'level', 'Type-2') :- lnot(fail).
callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'cart', 'level', 'Type-0') :- true.
not_callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'cart', 'level', 'Type-0') :- lnot(true).
callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'cart', 'level', 'Type-1') :- fail.
not_callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'cart', 'level', 'Type-1') :- lnot(fail).
callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'cart', 'level', 'Type-2') :- fail.
not_callArgumentImpl(['ShopServer_buy','buy'|['usage'|_]], 'cart', 'level', 'Type-2') :- lnot(fail).
