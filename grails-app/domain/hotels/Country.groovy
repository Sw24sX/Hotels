package hotels

class Country {

    String name
    String capital

    static hasMany = [hotels: Hotel]

    static constraints = {
        name unique: true, maxSize: 255
        capital maxSize: 128
    }

    String toString() {
        name
    }
}
