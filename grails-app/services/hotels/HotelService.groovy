package hotels

import grails.gorm.transactions.Transactional

@Transactional
class HotelService {

    def save() {
        Hotel first = Hotel.create()
    }
}
