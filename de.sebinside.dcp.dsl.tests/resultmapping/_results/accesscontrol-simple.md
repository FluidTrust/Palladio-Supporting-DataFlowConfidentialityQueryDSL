# General

Case name: `accesscontrol-simple`
Constraint count: 1

# Constraint 1

Constraint name: `AuthorizedAccess`
Violations found: 10

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

1. Parameter `input` is not allowed to be *call argument* in operation `TravelAgency_getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelAgency_getFlightOffers` |
	| `checkAgency` |
	| `TravelPlanner_getFlightOffers` |
	| `fetchOffers` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `TravelAgency` |
	| `authRoles` (Set) | `User`, `Airline`, `TravelAgency` |

2. Parameter `input` is not allowed to be *call argument* in operation `Airline_getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Airline_getFlightOffers` |
	| `checkAirlines` |
	| `TravelAgency_getFlightOffers` |
	| `checkAgency` |
	| `TravelPlanner_getFlightOffers` |
	| `fetchOffers` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `Airline` |
	| `authRoles` (Set) | `User`, `Airline`, `TravelAgency` |

3. Parameter `ccd` is not allowed to be *call argument* in operation `Airline_bookFlight`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Airline_bookFlight` |
	| `book` |
	| `TravelPlanner_bookFlight` |
	| `book` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `Airline` |
	| `authRoles` (Set) | `User`, `Airline` |

4. Parameter `flight` is not allowed to be *call argument* in operation `Airline_bookFlight`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Airline_bookFlight` |
	| `book` |
	| `TravelPlanner_bookFlight` |
	| `book` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `Airline` |
	| `authRoles` (Set) | `User`, `Airline` |

5. Parameter `input` is not allowed to be *call argument* in operation `TravelPlanner_getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner_getFlightOffers` |
	| `fetchOffers` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `Airline`, `TravelAgency` |

6. Parameter `selectedFlight` is not allowed to be *call argument* in operation `TravelPlanner_bookFlight`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner_bookFlight` |
	| `book` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `Airline` |

7. Parameter `flightOffers` is not allowed to be *return value* in operation `TravelAgency_getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelAgency_getFlightOffers` |
	| `checkAgency` |
	| `TravelPlanner_getFlightOffers` |
	| `fetchOffers` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `TravelAgency` |
	| `authRoles` (Set) | `User`, `Airline`, `TravelAgency` |

8. Parameter `flightOffers` is not allowed to be *return value* in operation `Airline_getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Airline_getFlightOffers` |
	| `checkAirlines` |
	| `TravelAgency_getFlightOffers` |
	| `checkAgency` |
	| `TravelPlanner_getFlightOffers` |
	| `fetchOffers` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `Airline` |
	| `authRoles` (Set) | `User`, `Airline`, `TravelAgency` |

9. Parameter `ccd` is not allowed to be *return value* in operation `CCC_requestDeclassifiedCCD`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `CCC_requestDeclassifiedCCD` |
	| `fetchCCD` |
	| `TravelPlanner_bookFlight` |
	| `book` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `Airline` |

10. Parameter `flightOffers` is not allowed to be *return value* in operation `TravelPlanner_getFlightOffers`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `TravelPlanner_getFlightOffers` |
	| `fetchOffers` |
	| `BookingUsage` |
	- Characteristic Variables: 	
	
	| Variable | Value |
	| :-- | :-- |
	| `accessRoles` (Set) | `User` |
	| `authRoles` (Set) | `User`, `Airline`, `TravelAgency` |
