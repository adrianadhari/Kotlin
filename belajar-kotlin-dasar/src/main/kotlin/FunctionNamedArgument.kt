fun fullName(firstName: String, lastName: String, middleName: String? = null) {
    if(middleName == null) {
        println("Hello $firstName $lastName")
    } else {
        println("Hello $firstName $middleName $lastName")
    }
}

fun main() {
    fullName("Adrian", "Adhari")
    fullName(firstName = "Adrian", lastName = "Adhari")
    fullName(middleName = "Fatharani", lastName = "Nur Shabrina", firstName = "Fildza")
}