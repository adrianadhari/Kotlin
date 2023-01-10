fun main() {
    val nilaiUTS = 80
    val nilaiUAS = 75
    val nilaiQuiz = 76

    val syaratLulusUTS = nilaiUTS >= 75
    val syaratLulusUAS = nilaiUAS >= 75
    val syaratLulusQuiz = nilaiQuiz >= 75

    val syaratNaikTingkat = syaratLulusUTS && syaratLulusUAS && syaratLulusQuiz
    println(syaratNaikTingkat)
}