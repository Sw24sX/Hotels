package hotels

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Hotel {

    String name
    Integer rating
    String site
    Country country

    static constraints = {
        name validator: {val, obj ->
            def hotels = Hotel.findAll().findAll{it.name == val && it.country == obj.country}
            return hotels.isEmpty()
        }
        rating min: 0, max: 5
        site nullable: true, validator: {val ->
            val == null || val.startsWith("http://") || val.startsWith("https://")
        }
    }

    String toString() {
        name
    }
}
