package hotels

class HomeController {

    def index() {
        ArrayList<String> listResult = new ArrayList<>()
        listResult.add("First")
        listResult.add("Second")
        listResult.add("third")
        listResult
        respond ([list: listResult])
    }
}
