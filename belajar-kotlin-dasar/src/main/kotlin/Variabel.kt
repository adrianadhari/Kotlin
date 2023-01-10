const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    var firstName : String = "Adrian"
    var lastName = "Adhari"
    firstName = "Abdul"
    println(firstName)

    val fullName = "My name is $firstName $lastName"
    println(fullName)

    val address : String? = null
    println(address)
    println(address?.length)

    println("$APP $VERSION")
}