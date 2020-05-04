# General

Case name: `geolocation-palladio`
Constraint count: 1

# Constraint 1

Constraint name: `NoUnencryptedPersonalDataFlow`
Violations found: 1

## Constraint Details

Data Characteristics: 

| Characteristic | Value |
| :-- | :-- |
| `Origin` | `EU` |
| `PersonalInformation` | `true` |
| `Encryption` | *not* `true` |
Condition: *NEVER* *FLOWS*
Destination Identity: `Assembly_StoreDB.StoreDB.store`

## Constraint Violations

1. Parameter `input` is not allowed to be *parameter* in operation `store`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| `Assembly_StoreDB.StoreDB.store` |
	| `USBuy.buy.storeCustomer.call` |
	| `Assembly_USBuy.USBuy.buy` |
	| `EUBuyingAtUS.callBuyUS.performCall` |
