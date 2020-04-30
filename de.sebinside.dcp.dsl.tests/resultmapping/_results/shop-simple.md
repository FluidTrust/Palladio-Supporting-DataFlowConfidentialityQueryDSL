# General

Case name: `shop-simple`
Constraint count: 1

# Constraint 1

Constraint name: `NoType0Flow`
Violations found: 1

## Constraint Details

Data Characteristics: 

| Characteristic | Value |
| :-- | :-- |
| `level` | `Type0` |
Condition: *NEVER* *FLOWS*
Destination Characteristics: 

| Characteristic | Value |
| :-- | :-- |
| `location` | *not* `EU` |

## Constraint Violations

1. Parameter `customer` is not allowed to be *call argument* in operation `UserDB_store`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| UserDB_store |
	| storeUser |
	| ShopServer_buy |
	| buy |
	| usage |
