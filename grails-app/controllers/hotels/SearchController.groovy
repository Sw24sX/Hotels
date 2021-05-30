package hotels

class SearchController {

    def index() {
        def query = (params.query as String)
        def hotels = Hotel.findAll()
        def result = filter(hotels, query)
        if(!result.isEmpty()){
            respond ([list: result, countResult: result.size()])
        }
        else{
            render(view: "notFound")
        }
    }

    private static List<Hotel> filter(List<Hotel> input, String query) {
        def result = new ArrayList<Hotel>()
        input.each {
            if(it.name.indexOf(query) != -1)
                result.add(it)
        }
        return result
    }

    def toHome() {
        redirect(controller: "home")
    }
}
