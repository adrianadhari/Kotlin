fun main() {
    val array = arrayOf("Adrian", "Fildza", "Rara")
    var total = 0
    for(name in array) {
        println(name)
        total++
    }
    println("Total perulangan adalah sebanyak $total")

    val ukuranArray = array.size - 1
    for(i in 0..ukuranArray) {
        println("Index ke [$i] = ${array.get(i)}")
    }
}