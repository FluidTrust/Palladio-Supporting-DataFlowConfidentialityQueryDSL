# DCPDSL

This is a first implementation of the constraint DSL for data-centric palladio.

## Characteristics

There are several characteristics files available for testing purposes. They can be found [here](https://github.com/sebinside/DCPDSL/tree/master/Characteristics).

## Snippets

### Shop

This snippet describes the Type0-constraint from the shop example.

```smalltalk
target OperationModel
import "shop.xmi"

type level: PrivacyLevel
type location: Locations

class isNotSafe {
	location.!EU
}

// No type 0 data flow to unsafe locations
constraint NoType0Flow {
	data.attribute.level.Type0 NEVER FLOWS node.class.isNotSafe
}
```

### Sample

This snippet is partly equivalent to the one from the *LanguageDesign*-Document.

```smalltalk
import "SimpleCharacteristics.xmi"

type Sizes: Sizes
type Locations: Locations
type Colors: Colors

class example1 {
    Sizes.[small,medium],
    Colors.!red,
    Locations.USA
}

constraint example1 {
	data.attribute.Sizes.small NEVER FLOWS node.property.Locations.USA
}

constraint example2 {
	data.class.example1 NEVER FLOWS node.property.Colors.red
}
```

### Geolocation

This snippet describes the constraint for the (newly developed) geolocation example.

```smalltalk
target DataCentricPalladio using geolocation,newAllocation,newUsageModel
import "geolocation.xmi"
import "newAllocation.allocation"
import "newAssembly.system"
import "newUsageModel.usagemodel"

type Encryption: Encryption
type Location: Location
type Origin: Origin
type PersonalInformation: PersonalInformation

// No flow of personal unencrypted information to the specified node 
constraint NoUnencryptedPersonalDataFlow {
	data.attribute.Origin.EU &
	data.attribute.PersonalInformation.true &
	data.attribute.Encryption.!true 
	NEVER FLOWS
	node.identity.Assembly_StoreDB.StoreDB.store
}
```