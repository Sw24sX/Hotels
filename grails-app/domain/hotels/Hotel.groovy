package hotels

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Hotel {

    String name
    Integer rating
    String site
    static belongsTo = [country: Country]

    static constraints = {
        name(unique: ['name', 'country'])
        rating min: 0, max: 5
        site nullable: true, validator: {val ->
            val == null || val.startsWith("http://") || val.startsWith("https://")
        }
    }

    String toString() {
        name
    }
}
