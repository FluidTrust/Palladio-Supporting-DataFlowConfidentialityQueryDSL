# General

Case name: `geolocation-simple`
Constraint count: 1

# Constraint 1

Constraint name: `NoUnencryptedPersonalDataFlow`
Violations found: 1

## Constraint Details

Data Characteristics: 

| Characteristic | Value |
| :-- | :-- |
| `origin` | `EU` |
| `isPersonalInformation` | `isTrue` |
| `isEncrypted` | *not* `isTrue` |
Condition: *NEVER* *FLOWS*
Destination Identity: `storeInDB`

## Constraint Violations

1. Parameter `datum` is not allowed to be *call argument* in operation `storeInDB`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| storeInDB |
	| storeCustomer |
	| buy |
	| performBuy |
	| EUOrderFromUS |
