package hotels

class SearchController {

    def index() {
        def query = (params.query as String)
        def country = Country.findByName(params.country as String)

        def c = Hotel.createCriteria()
        def result = c.list {
            ilike("name", "%" + query + "%")
            eq("country", country)
                .order("rating", "desc")
                .order("name")
        } as ArrayList<Hotel>

        if(!result.isEmpty()){
            respond ([list: result, countResult: result.size()])
        }
        else{
            render(view: "notFound")
        }
    }

    def toHome() {
        redirect(controller: "home")
    }
}
