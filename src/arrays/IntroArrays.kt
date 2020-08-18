fun main(){

    val idades: IntArray = intArrayOf(25,19,33,20,55)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades){
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menoridade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menoridade){
            menoridade = idade
        }
    }
    println(menoridade)
}