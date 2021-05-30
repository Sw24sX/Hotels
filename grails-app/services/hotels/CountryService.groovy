package hotels

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Country)
interface CountryService {

    Country save(String name, String capital)
}
