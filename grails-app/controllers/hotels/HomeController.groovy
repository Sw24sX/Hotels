package hotels

class HomeController {

    def index() {
        List<Hotel> listResult = Hotel.findAll()
        def countries = Country.findAll()
        respond ([list: listResult, countries: countries])
    }

    def search(String query, String country) {
        redirect(controller: "search", params: [query: query, country: country])
    }

    def toCountry() {
        redirect(controller: "country")
    }

    def toHotels() {
        redirect(controller: "hotel")
    }
}
