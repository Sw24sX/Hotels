package hotels

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Transactional
class CountryService {

    Country save(String name, String capital) {
        Country result = Country.create()
        result.setProperty('name', name)
        result.setProperty('capital', capital)
        result.save()
        return result
    }
}
