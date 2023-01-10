fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if( i > 5) {
                break@loopI
            }
            println("$i * $j = ${i*j}")
        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if( j == 5) {
                break@loopI
            }
            println("$i * $j = ${i*j}")
        }
    }
}

fun main() {
    labelBreak()
    labelContinue()

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)
    test("") test@ {
        if(it == "") {
            return@test
        } else {
            println("Adrian")
        }
    }
}