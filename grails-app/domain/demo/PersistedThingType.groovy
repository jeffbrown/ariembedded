package demo

class PersistedThingType {
    String name
    static constraints = {
        name nullable: false, unique: true, maxSize: 128
    }
}
