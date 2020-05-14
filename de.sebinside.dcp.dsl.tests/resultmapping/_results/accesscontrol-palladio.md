# General

Case name: `accesscontrol-palladio`
Constraint count: 1

# Constraint 1

Constraint name: `AuthorizedAccess`
Violations found: 11

## Constraint Details

Data Characteristics: 

| Characteristic | Value |
| :-- | :-- |
| `authorizedRoles` | variable `authRoles` |
Condition: *NEVER* *FLOWS*
Destination Characteristics: 

| Characteristic | Value |
| :-- | :-- |
| `accessRoles` | variable `accessRoles` |
Condition: `!isEmpty(intersection(authRoles,accessRoles))`

## Constraint Violations

1. Parameter `requestData` is not allowed to be *parameter* in operation `getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Airline <Airline>.Airline.getFlightOffers` |
	| `TA - getFlightOffers - callAirline` |
	| `TA - getFlightOffers - returnFlights` |
	| `TravelAgency <TravelAgency>.TravelAgency.getFlightOffers` |
	| `TP - getFlightOffers - callTA` |
	| `TP - getFlightOffers - returnFlightOffers` |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.getFlightOffers` |
	| `UsageModel - RequestFlightOffers - CallTravelAgency` |
	| `UsageModel - SelectFlightOffer` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `Airline` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

2. Parameter `requestData` is not allowed to be *parameter* in operation `getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelAgency <TravelAgency>.TravelAgency.getFlightOffers` |
	| `TP - getFlightOffers - callTA` |
	| `TP - getFlightOffers - returnFlightOffers` |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.getFlightOffers` |
	| `UsageModel - RequestFlightOffers - CallTravelAgency` |
	| `UsageModel - SelectFlightOffer` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `TravelAgency` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

3. Parameter `ccd_decl` is not allowed to be *parameter* in operation `bookFlight`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Airline <Airline>.Airline.bookFlight` |
	| `TP - bookSelected - callAirline` |
	| `TP - bookSelected - returnConfirmation` |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.bookSelected` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `Airline` |
	| `authRoles` (Set) | `User`, `Airline` |

4. Parameter `offerId` is not allowed to be *parameter* in operation `bookFlight`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Airline <Airline>.Airline.bookFlight` |
	| `TP - bookSelected - callAirline` |
	| `TP - bookSelected - returnConfirmation` |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.bookSelected` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `Airline` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

5. Parameter `airline` is not allowed to be *parameter* in operation `confirmBooking`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.confirmBooking` |
	| `Airline - bookgFlight - callForBookingConfirmation` |
	| `Airline - bookFlight - discardUserConfirmation` |
	| `Airline <Airline>.Airline.bookFlight` |
	| `TP - bookSelected - callAirline` |
	| `TP - bookSelected - returnConfirmation` |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.bookSelected` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

6. Parameter `offerId` is not allowed to be *parameter* in operation `confirmBooking`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.confirmBooking` |
	| `Airline - bookgFlight - callForBookingConfirmation` |
	| `Airline - bookFlight - discardUserConfirmation` |
	| `Airline <Airline>.Airline.bookFlight` |
	| `TP - bookSelected - callAirline` |
	| `TP - bookSelected - returnConfirmation` |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.bookSelected` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

7. Parameter `offerId` is not allowed to be *parameter* in operation `payCommission`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelAgency <TravelAgency>.TravelAgency.payCommission` |
	| `Airline - bookFlight - callPayComission` |
	| `Airline - bookFlight - discardComissionConfirmation` |
	| `Airline <Airline>.Airline.bookFlight` |
	| `TP - bookSelected - callAirline` |
	| `TP - bookSelected - returnConfirmation` |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.bookSelected` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `TravelAgency` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

8. Parameter `requestData` is not allowed to be *parameter* in operation `getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.getFlightOffers` |
	| `UsageModel - RequestFlightOffers - CallTravelAgency` |
	| `UsageModel - SelectFlightOffer` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

9. Parameter `ccDetails` is not allowed to be *parameter* in operation `declassifyCCDForAirline`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `CreditCardCenter <CreditCardCenter>.CreditCardCenter.declassifyCCDForAirline` |
	| `UsageModel - DeclassifyCCD` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User` |

10. Parameter `flightOffer` is not allowed to be *parameter* in operation `bookSelected`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.bookSelected` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `TravelAgency`, `Airline` |

11. Parameter `cc_decl` is not allowed to be *parameter* in operation `bookSelected`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner <TravelPlanner>.TravelPlanner.bookSelected` |
	| `UsageModel - BookSelected` |
	| `UsageModel - ReadBookingConfirmation` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `Airline` |
