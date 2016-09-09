package demo

class EmbeddedThing {
    PersistedThingType thingType
    LooselyRelatedConcept related

    static constraints = {
        related nullable: true
        thingType nullable: true
    }
}
