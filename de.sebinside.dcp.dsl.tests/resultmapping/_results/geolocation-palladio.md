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
Destination Identity: ``

## Constraint Violations

1. Parameter `DB.store.param.input_STATE_5e4e3009` is not allowed to be *call state* in operation `ResourceDemandingSEFF (_GDFtwHKJEeq9tYpRa9lb6Q) - AC _q7weoHKJEeq9tYpRa9lb6Q`.
	- Call Stack: 	
	
	| Node |
	| :-- |
	| ResourceDemandingSEFF (_GDFtwHKJEeq9tYpRa9lb6Q) - AC _q7weoHKJEeq9tYpRa9lb6Q |
	| opCall_f7b0423c |
	| PerformDataTransmissionOperation USBuy.buy.storeCustomer.call (_C5tTQ3KPEeq9tYpRa9lb6Q) - AC _ojjRIHKJEeq9tYpRa9lb6Q |
	| opCall_158741f8 |
	| ResourceDemandingSEFF (_8i7mIHKIEeq9tYpRa9lb6Q) - AC _ojjRIHKJEeq9tYpRa9lb6Q |
	| opCall_3ccb3cc9 |
	| PerformDataTransmissionOperation EUBuyingAtUS.callBuyUS.performCall (_z6DH83KMEeq9tYpRa9lb6Q) - AC n/a |
	| opCall_eb823ab2 |
	| ScenarioBehaviour EU buying at US (_zJWLIHKJEeq9tYpRa9lb6Q)_dataOp |
	| opCall_bd4b2b13 |
	| ScenarioBehaviour EU buying at US (_zJWLIHKJEeq9tYpRa9lb6Q) |
