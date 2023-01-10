fun main() {
    // When Expression
    var nilai = "F"
    when (nilai) {
        "A" -> {
            println("Mantap")
        }
        "B" -> {
            println("Lumayan")
        }
        "C" -> {
            println("Aduhh bego")
        }
        else -> {
            println("Fix tolol")
        }
    }

    // When Expression Multiple Option
    when (nilai) {
        "A", "B", "C" -> {
            println("ANDA LULUS")
        }
        else -> {
            println("ANDA TIDAK LULUS")
        }
    }

    // When Expression In
    nilai = "D"
    val nilaiLulus = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("ANDA LULUSSS")
        !in nilaiLulus -> println("ANDA TIDAK LULUSSS")
    }

    // When Expression Is
    val name = "1"
    when (name) {
        is String -> println("name is string")
        !is String -> println("name is not string")
    }

    // When Tanda Variabel
    val nilaiUjian = 55
    when{
        nilaiUjian >= 90 -> {
            println("Mantapp")
        }
        nilaiUjian >= 75 -> {
            println("Lumayan")
        }
        nilaiUjian >= 65 -> {
            println("Aduhh begoo")
        }
        else -> {
            println("TOLOLL")
        }
    }
}