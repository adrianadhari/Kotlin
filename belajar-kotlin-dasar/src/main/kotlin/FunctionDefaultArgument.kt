fun sayHello2(firstname: String, lastName: String? = null) {
    if(lastName == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastName")
    }
}

fun main() {
    sayHello2("Adrian", "Adhari")
    sayHello2("Fildza")
    sayHello2("Arc", "Warden")
}