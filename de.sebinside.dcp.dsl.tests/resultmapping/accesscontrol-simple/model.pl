 :- discontiguous(isDataType/1).
 :- discontiguous(dataTypeAttribute/2).
 :- discontiguous(isOperation/1).
 :- discontiguous(hasProperty/2).
 :- discontiguous(operationProperty/3).
 :- discontiguous(operationParameterType/3).
 :- discontiguous(operationReturnValueType/3).
 :- discontiguous(operationCall/3).
 :- discontiguous(isSystemUsage/1).
 :- discontiguous(callArgumentIndexed/5).
 :- discontiguous(returnValueIndexed/5).
 :- discontiguous(not_callArgumentIndexed/5).
 :- discontiguous(not_returnValueIndexed/5).
 :- discontiguous(not_operationProperty/3).
isAttribute(ATTRIB) :- attributeType(ATTRIB,_).
isProperty(ATTRIB) :- propertyType(ATTRIB,_).
operationParameter(OP,PARAM) :- operationParameterType(OP,PARAM,_).
operationReturnValue(OP,RVAL) :- operationReturnValueType(OP,RVAL,_).
callArgument([OP|S],VAR,A,VAL) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL).
returnValue([OP|S],VAR,A,VAL) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL).
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
lnot(callArgument([OP|S],VAR,A,VAL)) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_callArgumentImpl([OP|S],VAR,A,VAL).
lnot(returnValue([OP|S],VAR,A,VAL)) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_returnValueImpl([OP|S],VAR,A,VAL).
callArgumentImpl([OP|S],VAR,A,VAL) :- callArgumentIndexed(OP, [OP|S],VAR,A,VAL).
returnValueImpl([OP|S],VAR,A,VAL) :- returnValueIndexed(OP, [OP|S],VAR,A,VAL).
not_callArgumentImpl([OP|S],VAR,A,VAL) :- not_callArgumentIndexed(OP, [OP|S],VAR,A,VAL).
not_returnValueImpl([OP|S],VAR,A,VAL) :- not_returnValueIndexed(OP, [OP|S],VAR,A,VAL).

%-------------------------Value Set Type Definitions-------------------------
valueSetMember('role','User').
valueSetMember('role','Airline').
valueSetMember('role','TravelAgency').

%-------------------------Property Type Definitions--------------------------
propertyType('accessRoles','role').

%-------------------------Attribute Type Definitions-------------------------
attributeType('authorizedRoles','role').
attributeType('requestedRoles','role').

%---------------------------Data Type Definitions----------------------------
isDataType('RequestData').
dataTypeAttribute('RequestData','authorizedRoles').
isDataType('FlightOffers').
dataTypeAttribute('FlightOffers','authorizedRoles').
isDataType('SingleFlightOffer').
dataTypeAttribute('SingleFlightOffer','authorizedRoles').
isDataType('DeclassificationRequest').
dataTypeAttribute('DeclassificationRequest','requestedRoles').
isDataType('CreditCardData').
dataTypeAttribute('CreditCardData','authorizedRoles').


%----------------------------------------------------------------------------
%------------------Operation TravelPlanner_getFlightOffers-------------------
%----------------------------------------------------------------------------
isOperation('TravelPlanner_getFlightOffers').
hasProperty('TravelPlanner_getFlightOffers','accessRoles').
operationProperty('TravelPlanner_getFlightOffers','accessRoles', 'User').
not_operationProperty('TravelPlanner_getFlightOffers','accessRoles', 'Airline').
not_operationProperty('TravelPlanner_getFlightOffers','accessRoles', 'TravelAgency').
operationParameterType('TravelPlanner_getFlightOffers','input','RequestData').
operationReturnValueType('TravelPlanner_getFlightOffers','flightOffers','FlightOffers').

%-------------Call to TravelAgency_getFlightOffers (checkAgency)-------------
operationCall('TravelPlanner_getFlightOffers','TravelAgency_getFlightOffers','checkAgency').
callArgumentIndexed('TravelAgency_getFlightOffers',['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', A, V) :- dataTypeAttribute('RequestData', A),!,callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input',A,V).
not_callArgumentIndexed('TravelAgency_getFlightOffers',['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', A, V) :- dataTypeAttribute('RequestData', A),!,lnot(callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input',A,V)).

%---------------Return Values of TravelPlanner_getFlightOffers---------------
returnValueIndexed('TravelPlanner_getFlightOffers',['TravelPlanner_getFlightOffers'|S], 'flightOffers', A, V) :- dataTypeAttribute('FlightOffers', A),!,returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers',A,V).
not_returnValueIndexed('TravelPlanner_getFlightOffers',['TravelPlanner_getFlightOffers'|S], 'flightOffers', A, V) :- dataTypeAttribute('FlightOffers', A),!,lnot(returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers',A,V)).

%-------------State Definitions of TravelPlanner_getFlightOffers-------------


%----------------------------------------------------------------------------
%-------------------Operation TravelAgency_getFlightOffers-------------------
%----------------------------------------------------------------------------
isOperation('TravelAgency_getFlightOffers').
hasProperty('TravelAgency_getFlightOffers','accessRoles').
operationProperty('TravelAgency_getFlightOffers','accessRoles', 'TravelAgency').
not_operationProperty('TravelAgency_getFlightOffers','accessRoles', 'User').
not_operationProperty('TravelAgency_getFlightOffers','accessRoles', 'Airline').
operationParameterType('TravelAgency_getFlightOffers','input','RequestData').
operationReturnValueType('TravelAgency_getFlightOffers','flightOffers','FlightOffers').

%--------------Call to Airline_getFlightOffers (checkAirlines)---------------
operationCall('TravelAgency_getFlightOffers','Airline_getFlightOffers','checkAirlines').
callArgumentIndexed('Airline_getFlightOffers',['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', A, V) :- dataTypeAttribute('RequestData', A),!,callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input',A,V).
not_callArgumentIndexed('Airline_getFlightOffers',['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', A, V) :- dataTypeAttribute('RequestData', A),!,lnot(callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input',A,V)).

%---------------Return Values of TravelAgency_getFlightOffers----------------
returnValueIndexed('TravelAgency_getFlightOffers',['TravelAgency_getFlightOffers'|S], 'flightOffers', A, V) :- dataTypeAttribute('FlightOffers', A),!,returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers',A,V).
not_returnValueIndexed('TravelAgency_getFlightOffers',['TravelAgency_getFlightOffers'|S], 'flightOffers', A, V) :- dataTypeAttribute('FlightOffers', A),!,lnot(returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers',A,V)).

%-------------State Definitions of TravelAgency_getFlightOffers--------------


%----------------------------------------------------------------------------
%---------------------Operation Airline_getFlightOffers----------------------
%----------------------------------------------------------------------------
isOperation('Airline_getFlightOffers').
hasProperty('Airline_getFlightOffers','accessRoles').
operationProperty('Airline_getFlightOffers','accessRoles', 'Airline').
not_operationProperty('Airline_getFlightOffers','accessRoles', 'User').
not_operationProperty('Airline_getFlightOffers','accessRoles', 'TravelAgency').
operationParameterType('Airline_getFlightOffers','input','RequestData').
operationReturnValueType('Airline_getFlightOffers','flightOffers','FlightOffers').

%------------------Return Values of Airline_getFlightOffers------------------
returnValueIndexed('Airline_getFlightOffers',['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', V) :- !,callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles',V).
not_returnValueIndexed('Airline_getFlightOffers',['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', V) :- !,lnot(callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles',V)).

%----------------State Definitions of Airline_getFlightOffers----------------


%----------------------------------------------------------------------------
%---------------------Operation TravelPlanner_bookFlight---------------------
%----------------------------------------------------------------------------
isOperation('TravelPlanner_bookFlight').
hasProperty('TravelPlanner_bookFlight','accessRoles').
operationProperty('TravelPlanner_bookFlight','accessRoles', 'User').
not_operationProperty('TravelPlanner_bookFlight','accessRoles', 'Airline').
not_operationProperty('TravelPlanner_bookFlight','accessRoles', 'TravelAgency').
operationParameterType('TravelPlanner_bookFlight','selectedFlight','SingleFlightOffer').

%---------------Call to CCC_requestDeclassifiedCCD (fetchCCD)----------------
operationCall('TravelPlanner_bookFlight','CCC_requestDeclassifiedCCD','fetchCCD').
callArgumentIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'Airline') :- !,true.
not_callArgumentIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'Airline') :- !,lnot(true).
callArgumentIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', _) :- !,fail.
not_callArgumentIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', _) :- !,lnot(fail).

%---------------------Call to Airline_bookFlight (book)----------------------
operationCall('TravelPlanner_bookFlight','Airline_bookFlight','book').
callArgumentIndexed('Airline_bookFlight',['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', A, V) :- dataTypeAttribute('SingleFlightOffer', A),!,callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight',A,V).
not_callArgumentIndexed('Airline_bookFlight',['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', A, V) :- dataTypeAttribute('SingleFlightOffer', A),!,lnot(callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight',A,V)).
callArgumentIndexed('Airline_bookFlight',['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', A, V) :- dataTypeAttribute('CreditCardData', A),!,returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd',A,V).
not_callArgumentIndexed('Airline_bookFlight',['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', A, V) :- dataTypeAttribute('CreditCardData', A),!,lnot(returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd',A,V)).

%-----------------Return Values of TravelPlanner_bookFlight------------------

%---------------State Definitions of TravelPlanner_bookFlight----------------


%----------------------------------------------------------------------------
%------------------Operation askUserForCCDDeclassification-------------------
%----------------------------------------------------------------------------
isOperation('askUserForCCDDeclassification').
hasProperty('askUserForCCDDeclassification','accessRoles').
operationProperty('askUserForCCDDeclassification','accessRoles', 'User').
not_operationProperty('askUserForCCDDeclassification','accessRoles', 'Airline').
not_operationProperty('askUserForCCDDeclassification','accessRoles', 'TravelAgency').
operationParameterType('askUserForCCDDeclassification','declassRequest','DeclassificationRequest').
operationReturnValueType('askUserForCCDDeclassification','allowedRoles','DeclassificationRequest').

%---------------Return Values of askUserForCCDDeclassification---------------
returnValueIndexed('askUserForCCDDeclassification',['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', V) :- !,callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles',V).
not_returnValueIndexed('askUserForCCDDeclassification',['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', V) :- !,lnot(callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles',V)).

%-------------State Definitions of askUserForCCDDeclassification-------------


%----------------------------------------------------------------------------
%--------------------Operation CCC_requestDeclassifiedCCD--------------------
%----------------------------------------------------------------------------
isOperation('CCC_requestDeclassifiedCCD').
hasProperty('CCC_requestDeclassifiedCCD','accessRoles').
operationProperty('CCC_requestDeclassifiedCCD','accessRoles', 'User').
not_operationProperty('CCC_requestDeclassifiedCCD','accessRoles', 'Airline').
not_operationProperty('CCC_requestDeclassifiedCCD','accessRoles', 'TravelAgency').
operationParameterType('CCC_requestDeclassifiedCCD','declassRequest','DeclassificationRequest').
operationReturnValueType('CCC_requestDeclassifiedCCD','ccd','CreditCardData').

%-------------Call to askUserForCCDDeclassification (promptUser)-------------
operationCall('CCC_requestDeclassifiedCCD','askUserForCCDDeclassification','promptUser').
callArgumentIndexed('askUserForCCDDeclassification',['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', A, V) :- dataTypeAttribute('DeclassificationRequest', A),!,callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest',A,V).
not_callArgumentIndexed('askUserForCCDDeclassification',['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', A, V) :- dataTypeAttribute('DeclassificationRequest', A),!,lnot(callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest',A,V)).

%----------------Return Values of CCC_requestDeclassifiedCCD-----------------
returnValueIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD'|_], 'ccd', 'authorizedRoles', 'User') :- !,true.
not_returnValueIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD'|_], 'ccd', 'authorizedRoles', 'User') :- !,lnot(true).
returnValueIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD'|S], 'ccd', 'authorizedRoles', V) :- !,returnValueImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]],'allowedRoles','requestedRoles',V).
not_returnValueIndexed('CCC_requestDeclassifiedCCD',['CCC_requestDeclassifiedCCD'|S], 'ccd', 'authorizedRoles', V) :- !,lnot(returnValueImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]],'allowedRoles','requestedRoles',V)).

%--------------State Definitions of CCC_requestDeclassifiedCCD---------------


%----------------------------------------------------------------------------
%------------------------Operation Airline_bookFlight------------------------
%----------------------------------------------------------------------------
isOperation('Airline_bookFlight').
hasProperty('Airline_bookFlight','accessRoles').
operationProperty('Airline_bookFlight','accessRoles', 'Airline').
not_operationProperty('Airline_bookFlight','accessRoles', 'User').
not_operationProperty('Airline_bookFlight','accessRoles', 'TravelAgency').
operationParameterType('Airline_bookFlight','ccd','CreditCardData').
operationParameterType('Airline_bookFlight','flight','SingleFlightOffer').

%--------------------Return Values of Airline_bookFlight---------------------

%------------------State Definitions of Airline_bookFlight-------------------


%----------------------------------------------------------------------------
%-------------------------System Usage BookingUsage--------------------------
%----------------------------------------------------------------------------
isSystemUsage('BookingUsage').

%------------Call to TravelPlanner_getFlightOffers (fetchOffers)-------------
operationCall('BookingUsage','TravelPlanner_getFlightOffers','fetchOffers').
callArgumentIndexed('TravelPlanner_getFlightOffers',['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', _) :- !,true.
not_callArgumentIndexed('TravelPlanner_getFlightOffers',['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', _) :- !,lnot(true).

%------------------Call to TravelPlanner_bookFlight (book)-------------------
operationCall('BookingUsage','TravelPlanner_bookFlight','book').
callArgumentIndexed('TravelPlanner_bookFlight',['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'User') :- !,true.
not_callArgumentIndexed('TravelPlanner_bookFlight',['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'User') :- !,lnot(true).
callArgumentIndexed('TravelPlanner_bookFlight',['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'Airline') :- !,true.
not_callArgumentIndexed('TravelPlanner_bookFlight',['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'Airline') :- !,lnot(true).
callArgumentIndexed('TravelPlanner_bookFlight',['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', _) :- !,fail.
not_callArgumentIndexed('TravelPlanner_bookFlight',['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', _) :- !,lnot(fail).