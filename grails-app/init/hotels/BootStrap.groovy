package hotels

class BootStrap {

    CountryService countryService
    HotelService hotelService

    def init = { servletContext ->
        Country russia = countryService.save("Russia", "Moscow")
        Country germany = countryService.save("Germany", "Berlin")
        Country usa = countryService.save("USA", "Washington")
        Country greatBritain = countryService.save("Great Britain", "London")

        Hotel hotel_5 = hotelService.save("Test 5", 1, null, usa)
        hotelService.save("Test", 5, null, usa)
        Hotel hotel_1 = hotelService.save("Test 3", 5,
                "https://www.booking.com/hotel/ru/dot-space-84.ru.html?", russia)
        Hotel hotel_3 = hotelService.save("Test 0", 3, null, usa)
        Hotel hotel_2 = hotelService.save("Test 2", 5, null, germany)
        Hotel hotel_4 = hotelService.save("Test 4", 2, null, greatBritain)
    }
    def destroy = {
    }
}
