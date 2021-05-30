package hotels

class HomeController {

    def index() {
        List<Hotel> listResult = Hotel.findAll()
        respond ([list: listResult])
    }

    def search(String query) {
        redirect(controller: "search", params: [query: query])
    }

    def toCountry() {
        redirect(controller: "country")
    }

    def toHotels() {
        redirect(controller: "hotel")
    }
}
