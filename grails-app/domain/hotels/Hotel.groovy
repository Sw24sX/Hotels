package hotels

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Hotel {

    String name
    Integer rating
    String site

    static belongsTo = [coutry: Country]

    static constraints = {
        //todo
//        name(unique: [name, country.getName()])
//        coutry
//        name
        rating min: 0, max: 5
        site nullable: true
    }

    String toString() {
        name
    }
}
