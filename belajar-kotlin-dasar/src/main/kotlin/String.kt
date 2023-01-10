fun main() {
    var firstName : String = "Adrian"
    var lastName : String = "Adhari"
    var fullName : String = "Adrian Adhari"
    var address : String = """
        |Kedung Halang,
        |Bogor Utara,
        |Kota Bogor
    """.trimMargin()

    var namaLengkap : String = "$firstName $lastName"
    var desc : String = "$namaLengkap length = ${namaLengkap.length}"

    println(namaLengkap)
    println(address)
    println(desc)
}