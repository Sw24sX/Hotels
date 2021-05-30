package hotels

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Hotel)
interface HotelService {
    Hotel save(String name, Integer rating, String site, Country country)
}
