fun penjumlahan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun pembagian(a: Int, b: Int): Int {
    if(a == 0 || b == 0) {
        return 0
    } else {
        val total = a / b
        return total
    }
}

fun main() {
    println(penjumlahan(150, 150))
    val result1 = penjumlahan(150, 150)
    println(result1)
    penjumlahan(150, 150)

    println(pembagian(50, 5))
    val result2 = pembagian(50, 5)
    println(result2)
    pembagian(50, 5)

    println(pembagian(0, 50))
    println(pembagian(50, 0))
}