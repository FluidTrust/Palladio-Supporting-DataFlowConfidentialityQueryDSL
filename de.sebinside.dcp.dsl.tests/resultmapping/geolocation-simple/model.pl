 :- discontiguous(isDataType/1).
 :- discontiguous(dataTypeAttribute/2).
 :- discontiguous(isOperation/1).
 :- discontiguous(hasProperty/2).
 :- discontiguous(operationProperty/3).
 :- discontiguous(operationParameterType/3).
 :- discontiguous(operationReturnValueType/3).
 :- discontiguous(operationCall/3).
 :- discontiguous(callArgumentImpl/4).
 :- discontiguous(returnValueImpl/4).
 :- discontiguous(isSystemUsage/1).
isAttribute(ATTRIB) :- attributeType(ATTRIB,_).
isProperty(ATTRIB) :- propertyType(ATTRIB,_).
operationParameter(OP,PARAM) :- operationParameterType(OP,PARAM,_).
operationReturnValue(OP,RVAL) :- operationReturnValueType(OP,RVAL,_).
callArgument([OP|S],VAR,A,VAL) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL).
returnValue([OP|S],VAR,A,VAL) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL).
stackValid([SU]) :- isSystemUsage(SU).
stackValid([DEST,CALL,SOURCE | S]) :- operationCall(SOURCE,DEST,CALL), stackValid([SOURCE | S]).

%-------------------------Value Set Type Definitions-------------------------
valueSetMember('geolocation','EU').
valueSetMember('geolocation','US').
valueSetMember('geolocation','Asia').
valueSetMember('FlagType','isTrue').

%-------------------------Property Type Definitions--------------------------
propertyType('deploymentLocation','geolocation').

%-------------------------Attribute Type Definitions-------------------------
attributeType('isPersonalInformation','FlagType').
attributeType('isEncrypted','FlagType').
attributeType('origin','geolocation').

%---------------------------Data Type Definitions----------------------------
isDataType('PersistedData').
dataTypeAttribute('PersistedData','isEncrypted').
dataTypeAttribute('PersistedData','isPersonalInformation').
dataTypeAttribute('PersistedData','origin').


%----------------------------------------------------------------------------
%-----------------------------Operation encrypt------------------------------
%----------------------------------------------------------------------------
isOperation('encrypt').
operationParameterType('encrypt','input','PersistedData').
operationReturnValueType('encrypt','result','PersistedData').

%--------------------------Return Values of encrypt--------------------------
returnValueImpl(['encrypt'|_], 'result', 'isEncrypted', 'isTrue') :- true.
returnValueImpl(['encrypt'|S], 'result', 'isPersonalInformation', 'isTrue') :- callArgumentImpl(['encrypt'|S],'input','isPersonalInformation','isTrue').
returnValueImpl(['encrypt'|S], 'result', 'origin', 'EU') :- callArgumentImpl(['encrypt'|S],'input','origin','EU').
returnValueImpl(['encrypt'|S], 'result', 'origin', 'US') :- callArgumentImpl(['encrypt'|S],'input','origin','US').
returnValueImpl(['encrypt'|S], 'result', 'origin', 'Asia') :- callArgumentImpl(['encrypt'|S],'input','origin','Asia').


%----------------------------------------------------------------------------
%------------------------------Operation buyEU-------------------------------
%----------------------------------------------------------------------------
isOperation('buyEU').
operationParameterType('buyEU','customerInformation','PersistedData').
operationParameterType('buyEU','orderInformation','PersistedData').

%-------------------Call to encrypt (encryptCustomerData)--------------------
operationCall('buyEU','encrypt','encryptCustomerData').
callArgumentImpl(['encrypt','encryptCustomerData'|['buyEU'|S]], 'input', 'isEncrypted', 'isTrue') :- callArgumentImpl(['buyEU'|S],'customerInformation','isEncrypted','isTrue').
callArgumentImpl(['encrypt','encryptCustomerData'|['buyEU'|S]], 'input', 'isPersonalInformation', 'isTrue') :- callArgumentImpl(['buyEU'|S],'customerInformation','isPersonalInformation','isTrue').
callArgumentImpl(['encrypt','encryptCustomerData'|['buyEU'|S]], 'input', 'origin', 'EU') :- callArgumentImpl(['buyEU'|S],'customerInformation','origin','EU').
callArgumentImpl(['encrypt','encryptCustomerData'|['buyEU'|S]], 'input', 'origin', 'US') :- callArgumentImpl(['buyEU'|S],'customerInformation','origin','US').
callArgumentImpl(['encrypt','encryptCustomerData'|['buyEU'|S]], 'input', 'origin', 'Asia') :- callArgumentImpl(['buyEU'|S],'customerInformation','origin','Asia').

%---------------------Call to storeInDB (storeCustomer)----------------------
operationCall('buyEU','storeInDB','storeCustomer').
callArgumentImpl(['storeInDB','storeCustomer'|['buyEU'|S]], 'datum', 'isEncrypted', 'isTrue') :- returnValueImpl(['encrypt','encryptCustomerData'|['buyEU'|S]],'result','isEncrypted','isTrue').
callArgumentImpl(['storeInDB','storeCustomer'|['buyEU'|S]], 'datum', 'isPersonalInformation', 'isTrue') :- returnValueImpl(['encrypt','encryptCustomerData'|['buyEU'|S]],'result','isPersonalInformation','isTrue').
callArgumentImpl(['storeInDB','storeCustomer'|['buyEU'|S]], 'datum', 'origin', 'EU') :- returnValueImpl(['encrypt','encryptCustomerData'|['buyEU'|S]],'result','origin','EU').
callArgumentImpl(['storeInDB','storeCustomer'|['buyEU'|S]], 'datum', 'origin', 'US') :- returnValueImpl(['encrypt','encryptCustomerData'|['buyEU'|S]],'result','origin','US').
callArgumentImpl(['storeInDB','storeCustomer'|['buyEU'|S]], 'datum', 'origin', 'Asia') :- returnValueImpl(['encrypt','encryptCustomerData'|['buyEU'|S]],'result','origin','Asia').

%------------------Call to storeInDB (updateStockQuantity)-------------------
operationCall('buyEU','storeInDB','updateStockQuantity').
callArgumentImpl(['storeInDB','updateStockQuantity'|['buyEU'|_]], 'datum', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['storeInDB','updateStockQuantity'|['buyEU'|_]], 'datum', 'isPersonalInformation', 'isTrue') :- fail.
callArgumentImpl(['storeInDB','updateStockQuantity'|['buyEU'|S]], 'datum', 'origin', 'EU') :- callArgumentImpl(['buyEU'|S],'orderInformation','origin','EU').
callArgumentImpl(['storeInDB','updateStockQuantity'|['buyEU'|S]], 'datum', 'origin', 'US') :- callArgumentImpl(['buyEU'|S],'orderInformation','origin','US').
callArgumentImpl(['storeInDB','updateStockQuantity'|['buyEU'|S]], 'datum', 'origin', 'Asia') :- callArgumentImpl(['buyEU'|S],'orderInformation','origin','Asia').

%---------------------------Return Values of buyEU---------------------------


%----------------------------------------------------------------------------
%-------------------------------Operation buy--------------------------------
%----------------------------------------------------------------------------
isOperation('buy').
operationParameterType('buy','customerInformation','PersistedData').
operationParameterType('buy','orderInformation','PersistedData').

%---------------------Call to storeInDB (storeCustomer)----------------------
operationCall('buy','storeInDB','storeCustomer').
callArgumentImpl(['storeInDB','storeCustomer'|['buy'|S]], 'datum', 'isEncrypted', 'isTrue') :- callArgumentImpl(['buy'|S],'customerInformation','isEncrypted','isTrue').
callArgumentImpl(['storeInDB','storeCustomer'|['buy'|S]], 'datum', 'isPersonalInformation', 'isTrue') :- callArgumentImpl(['buy'|S],'customerInformation','isPersonalInformation','isTrue').
callArgumentImpl(['storeInDB','storeCustomer'|['buy'|S]], 'datum', 'origin', 'EU') :- callArgumentImpl(['buy'|S],'customerInformation','origin','EU').
callArgumentImpl(['storeInDB','storeCustomer'|['buy'|S]], 'datum', 'origin', 'US') :- callArgumentImpl(['buy'|S],'customerInformation','origin','US').
callArgumentImpl(['storeInDB','storeCustomer'|['buy'|S]], 'datum', 'origin', 'Asia') :- callArgumentImpl(['buy'|S],'customerInformation','origin','Asia').

%------------------Call to storeInDB (updateStockQuantity)-------------------
operationCall('buy','storeInDB','updateStockQuantity').
callArgumentImpl(['storeInDB','updateStockQuantity'|['buy'|_]], 'datum', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['storeInDB','updateStockQuantity'|['buy'|_]], 'datum', 'isPersonalInformation', 'isTrue') :- fail.
callArgumentImpl(['storeInDB','updateStockQuantity'|['buy'|S]], 'datum', 'origin', 'EU') :- callArgumentImpl(['buy'|S],'orderInformation','origin','EU').
callArgumentImpl(['storeInDB','updateStockQuantity'|['buy'|S]], 'datum', 'origin', 'US') :- callArgumentImpl(['buy'|S],'orderInformation','origin','US').
callArgumentImpl(['storeInDB','updateStockQuantity'|['buy'|S]], 'datum', 'origin', 'Asia') :- callArgumentImpl(['buy'|S],'orderInformation','origin','Asia').

%----------------------------Return Values of buy----------------------------


%----------------------------------------------------------------------------
%----------------------------Operation storeInDB-----------------------------
%----------------------------------------------------------------------------
isOperation('storeInDB').
hasProperty('storeInDB','deploymentLocation').
operationProperty('storeInDB','deploymentLocation', 'US').
operationParameterType('storeInDB','datum','PersistedData').

%-------------------------Return Values of storeInDB-------------------------


%----------------------------------------------------------------------------
%-------------------------System Usage USOrderFromUS-------------------------
%----------------------------------------------------------------------------
isSystemUsage('USOrderFromUS').

%--------------------------Call to buy (performBuy)--------------------------
operationCall('USOrderFromUS','buy','performBuy').
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'customerInformation', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'customerInformation', 'isPersonalInformation', 'isTrue') :- true.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'customerInformation', 'origin', 'EU') :- fail.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'customerInformation', 'origin', 'US') :- true.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'customerInformation', 'origin', 'Asia') :- fail.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'orderInformation', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'orderInformation', 'isPersonalInformation', 'isTrue') :- true.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'orderInformation', 'origin', 'EU') :- fail.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'orderInformation', 'origin', 'US') :- true.
callArgumentImpl(['buy','performBuy'|['USOrderFromUS'|_]], 'orderInformation', 'origin', 'Asia') :- fail.


%----------------------------------------------------------------------------
%-------------------------System Usage EUOrderFromUS-------------------------
%----------------------------------------------------------------------------
isSystemUsage('EUOrderFromUS').

%--------------------------Call to buy (performBuy)--------------------------
operationCall('EUOrderFromUS','buy','performBuy').
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'customerInformation', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'customerInformation', 'isPersonalInformation', 'isTrue') :- true.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'customerInformation', 'origin', 'EU') :- true.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'customerInformation', 'origin', 'US') :- fail.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'customerInformation', 'origin', 'Asia') :- fail.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'orderInformation', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'orderInformation', 'isPersonalInformation', 'isTrue') :- true.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'orderInformation', 'origin', 'EU') :- true.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'orderInformation', 'origin', 'US') :- fail.
callArgumentImpl(['buy','performBuy'|['EUOrderFromUS'|_]], 'orderInformation', 'origin', 'Asia') :- fail.


%----------------------------------------------------------------------------
%-------------------------System Usage EUOrderFromEU-------------------------
%----------------------------------------------------------------------------
isSystemUsage('EUOrderFromEU').

%-------------------------Call to buyEU (performBuy)-------------------------
operationCall('EUOrderFromEU','buyEU','performBuy').
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'customerInformation', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'customerInformation', 'isPersonalInformation', 'isTrue') :- true.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'customerInformation', 'origin', 'EU') :- true.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'customerInformation', 'origin', 'US') :- fail.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'customerInformation', 'origin', 'Asia') :- fail.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'orderInformation', 'isEncrypted', 'isTrue') :- fail.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'orderInformation', 'isPersonalInformation', 'isTrue') :- true.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'orderInformation', 'origin', 'EU') :- true.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'orderInformation', 'origin', 'US') :- fail.
callArgumentImpl(['buyEU','performBuy'|['EUOrderFromEU'|_]], 'orderInformation', 'origin', 'Asia') :- fail.