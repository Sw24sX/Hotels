package hotels

class SearchController {

    def index() {
        def query = (params.query as String).toLowerCase()
        def country = Country.findByName(params.country as String)

        def c = Hotel.createCriteria()
        def result = c.list {
            //                .in("name", query)
            like("name", "%" + query + "%")
            eq("country", country)
                .order("rating", "desc")
                .order("name")
        }


//        def result = filter(Hotel.findAll(), query, countryName)
//        sort(result)
        if(!result.isEmpty()){
            respond ([list: result, countResult: result.size()])
        }
        else{
            render(view: "notFound")
        }
    }

    private static List<Hotel> filter(List<Hotel> input, String query, String country) {
        return input.findAll {it.name.toLowerCase().indexOf(query) != -1 && it.country.name == country}
    }

    private static List<Hotel> sort(List<Hotel> input) {
        Comparator mc = {a,b -> a.rating == b.rating ?
                a.name > b.name ? 1 : -1 :
                a.rating < b.rating ? 1 : -1}
        return input.sort(mc)
    }

    def toHome() {
        redirect(controller: "home")
    }
}
