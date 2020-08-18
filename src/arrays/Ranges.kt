fun main() {

    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()

    val numeroPares = 0..100 step 2
    for (numeroPar in numeroPares) {
        print("$numeroPar ")
    }
    val numerosPares = 0.until(100) step 2
    for (numePar in numerosPares) {
        print("$numePar ")
    }

    val numeroParesReverso = 100 downTo 0 step 2
    numeroParesReverso.forEach { print("$it") }

    println()

    val intervalo = 1500.0..5000.0
    val salario = 4100.0
    if (salario in intervalo) {
        println("Esta dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

}
