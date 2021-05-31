package hotels

class BootStrap {

    CountryService countryService
    HotelService hotelService

    def init = { servletContext ->
        Country russia = countryService.save("Russia", "Moscow")
        Country germany = countryService.save("Germany", "Berlin")
        Country usa = countryService.save("USA", "Washington")
        Country greatBritain = countryService.save("Great Britain", "London")

        def russiaHashSet = new HashSet<Country>()
        russiaHashSet.add(russia)
        hotelService.save("Capsule hotel Dot Space 84", 5, "https://www.booking.com/hotel/ru/dot-space-84.ru.html", russia)
        hotelService.save("AZIMUT Отель Смоленская", 4, "https://www.booking.com/hotel/ru/azimut-smolenskaya-moscow.ru.html", russia)

        def usaHashSet = new HashSet<Country>()
        usaHashSet.add(usa)
        hotelService.save("Hyatt Place Washington DC/White House", 4,
                "https://www.booking.com/hotel/us/hyatt-place-dc-downtown-k-street.ru.html", usa)
        hotelService.save("InterContinental - Washington D.C. - The Wharf, an IHG Hotel", 5,
                "https://www.booking.com/hotel/us/intercontinental-washington-dc-the-wharf.ru.html", usa)

        def germanyHashSet = new HashSet<Country>()
        germanyHashSet.add(germany)
        hotelService.save("AZIMUT Hotel Kurfuerstendamm Berlin", 3, null, germany)
        hotelService.save("Riu Plaza Berlin", 5, null, germany)


//        hotelService.save("Pestana Chelsea Bridge Hotel & Spa", 4, null, greatBritain)

        hotelService.save("test_1", 1, null, russia)
        hotelService.save("test_2", 1, null, russia)
    }
    def destroy = {
    }
}
