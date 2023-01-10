fun main() {
    // val range = 1..100
    val range = 1000 downTo 500 step 5
    println(range.count())
    println(range.contains(505))
    println(range.contains(999))
    println(range.first)
    println(range.last)
    println(range.step)
}