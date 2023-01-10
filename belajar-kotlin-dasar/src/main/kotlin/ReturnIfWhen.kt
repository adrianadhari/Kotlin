fun main() {
    fun sayHalo(name: String = ""): String {
        return when(name) {
            "" -> {
                "Hello Bro!"
            }
            else -> {
                "Hello $name!"
            }
        }
//        return if(name == "") {
//            "Hello Bro!"
//        } else {
//            "Hello $name!"
//        }
    }

    println(sayHalo("Adrian"))
}