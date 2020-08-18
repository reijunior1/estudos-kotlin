package cursoalura

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("CONTA SALDO POSITIVO")
    } else if (saldo == 0.0) {
        println("SALDO DA CONTA ZERO")
    } else {
        println("CONTA NEGATIVA")
    }
}