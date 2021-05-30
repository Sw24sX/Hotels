package hotels

class BootStrap {

    CountryService countryService

    def init = { servletContext ->
        Country russia = countryService.save("Russia", "Moscow")
    }
    def destroy = {
    }
}
