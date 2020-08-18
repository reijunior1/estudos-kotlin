package cursoalura

fun testaLacos() {

    for (i in 5 downTo 1 step 2) {

        val titular: String = "Reinaldo $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular da conta: $titular")
        println("numero da conta: $numeroConta")
        println("saldo da conta: $saldo")
        println()
    }
}