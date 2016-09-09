package demo

class LooselyRelatedConcept {
    String name
    Boolean flagValue = false

    // static belongsTo = [parent: ParentClass]

    // static hasMany = [children: ChildClass]

    static constraints = {
        name        nullable: false, blank: false, maxSize: 256
        flagValue   nullable: false
        // children    nullable: true
    }
}
