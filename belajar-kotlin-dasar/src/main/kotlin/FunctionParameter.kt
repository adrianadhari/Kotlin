fun sayHello(firstname: String, lastName: String?) {
    if(lastName == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastName")
    }
}

fun main() {
    sayHello("Adrian", "Adhari")
    sayHello("Fildza", null)
    sayHello("Arc", "Warden")
}