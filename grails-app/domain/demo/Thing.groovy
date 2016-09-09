package demo

class Thing {

    EmbeddedThing embeddedThing = new EmbeddedThing()

    static embedded = ['embeddedThing']
    static constraints = { importFrom EmbeddedThing }
    static transients = ['thingType', 'related']

    PersistedThingType getThingType() {
        embeddedThing.thingType
    }

    LooselyRelatedConcept getRelated() {
        embeddedThing.related
    }
}
