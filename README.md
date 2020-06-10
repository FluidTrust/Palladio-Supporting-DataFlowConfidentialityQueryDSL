# DCPDSL

This is a first implementation of the constraint DSL for data-centric palladio.

## Characteristics

There are several characteristics files available for testing purposes. They can be found [here](https://github.com/sebinside/DCPDSL/tree/master/Characteristics).
More ready-to-use cases can be found in the `resultmapping`-folder inside the test-project.

## More snippets

There are more cases which have been modeled but are not represented in result mapping.

### UMLsec secure links

```smalltalk
target DataCentricPalladio
import "links.xmi"

type Link: Link
type Sensitivity: Sensitivity

class AllSensitivities {
	Sensitivity.[High,Integrity,Secrecy]
}

class AllLinks {
	Link.[Encrypted,Internet,LAN]
}

// Insider attacker attacks all link type and has all threads thus attacks all sensitivity levels
constraint InsiderAttacker {
	data.class.AllSensitivities NEVER FLOWS node.class.AllLinks
}

// Default attacker can attack Internet links on all sensitivity levels as well
constraint DefaultAttackerInternet {
	data.class.AllSensitivities NEVER FLOWS node.property.Link.Internet
}

// Default attacker cannot read or insert on encrypted links 
constraint DefaultAttackerEncrypted {
	data.attribute.Sensitivity.High NEVER FLOWS node.property.Link.Encrypted
}
```

### UMLsec secure dependencies

Not possible, since `lnot` is a custom element an cannot be generated.