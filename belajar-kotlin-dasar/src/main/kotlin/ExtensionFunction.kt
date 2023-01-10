fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")
fun main() {
    val name = "Adrian"
    println(name.hello())
    name.printHello()
    "Adrian".printHello()
}