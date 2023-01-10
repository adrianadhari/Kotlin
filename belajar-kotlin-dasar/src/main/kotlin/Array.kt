fun main() {
    val members : Array<String> = arrayOf("Adrian", "Rara", "Zet")
    println(members[0])
    println(members[1])
    members.set(2, "Fildza")
    println(members[2])

    val customers: Array<String?> = arrayOfNulls(5)
    customers[0] = "Budi"
    customers[1] = "Jono"
    customers[2] = "Edi"
    customers[3] = "Joko"
    customers[4] = "Yadi"
    println(customers[3])
    println(customers.size)

    val client = arrayOf("budi", "jono", "joko")
    println(client[2])

}