fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0
    for(value in values) {
        total += value
    }
    println(name)
    return total
}

fun main() {
    val result = hitungTotal("Adrian", 50, 50, 50, 100, 150, 500, 200)
    println(result)
}