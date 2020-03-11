# DCPDSL

This is a first implementation of the constraint DSL for data-centric palladio.

## Characteristics

There are several characteristics files available for testing purposes. They can be found [here](https://github.com/sebinside/DCPDSL/tree/master/Characteristics).

## Snippets

### Geolocation

This snippet describes the Type0-constraint from the geolocation / shop example.

```smalltalk
import "Geolocation.xmi"

class isNotSafe {
	Locations.!EU
}

constraint "noType0Flow" {
	data.attribute.PrivacyLevel.Type0 & data.attribute.Locations.EU
	 NEVER FLOWS node.class.isNotSafe
} 
```

### Sample

This snippet is partly equivalent to the one from the *LanguageDesign*-Document.

```smalltalk
import "SimpleCharacteristics.xmi"

class example1 {
    Sizes.[small,medium],
    Colors.!red,
    Locations.USA
}
constraint "example1" {
	data.attribute.Sizes.small NEVER FLOWS node.property.Locations.USA
}

constraint "example2" {
	data.class.example1 NEVER FLOWS node.property.Colors.red
}
```