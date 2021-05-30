package hotels

class BootStrap {

    CountryService countryService
    HotelService hotelService

    def init = { servletContext ->
        Country russia = countryService.save("Russia", "Moscow")
        Country germany = countryService.save("Germany", "Berlin")
        Country usa = countryService.save("USA", "Washington")
        Country greatBritain = countryService.save("Great Britain", "London")

        Hotel hotel_1 = hotelService.save("Test 1", 5, null, russia)
        Hotel hotel_2 = hotelService.save("Test 2", 4, null, germany)
        Hotel hotel_3 = hotelService.save("Test 3", 3, null, usa)
        Hotel hotel_4 = hotelService.save("Test 4", 2, null, greatBritain)
        Hotel hotel_5 = hotelService.save("Test 5", 1, null, usa)
    }
    def destroy = {
    }
}
