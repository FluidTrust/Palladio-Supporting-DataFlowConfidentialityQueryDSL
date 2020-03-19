# DCPDSL

This is a first implementation of the constraint DSL for data-centric palladio.

## Characteristics

There are several characteristics files available for testing purposes. They can be found [here](https://github.com/sebinside/DCPDSL/tree/master/Characteristics).

## Snippets

### Geolocation

This snippet describes the Type0-constraint from the geolocation / shop example.

```smalltalk
import "Geolocation.xmi"

type level: PrivacyLevel
type location: Locations

class isNotSafe {
	location.!EU
}

// No type 0 data flow to unsafe locations
constraint noType0Flow {
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