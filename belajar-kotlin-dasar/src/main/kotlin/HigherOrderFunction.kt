fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Adrian", lambdaUpper))
    println(hello("Adrian", {value: String -> value.toLowerCase()}))

    val result1 = hello("Adrian", {value: String -> value.toLowerCase()})
    val result2 = hello("Adrian") {
            value: String -> value.toLowerCase()
    }
    println(result1)
    println(result2)
}