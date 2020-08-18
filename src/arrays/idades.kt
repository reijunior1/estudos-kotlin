fun main(){

    val idades : IntArray = intArrayOf(10, 12, 18, 33, 42, 68)
    val maiorIdade = idades.max()
    println("Maior idade : $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media : Double = idades.average()
    println("Media: $media")

    val todosMaiores = idades.all {it >= 18}
    println("Todos Maiores ? : $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade ? $existeMaior")

    val existeMaiores = idades.filter { it >= 18 }
    println("Maiores de 18 ? $existeMaiores")

    val encontrar = idades.find { it >= 18 }
    println("Encontra idade : $encontrar ")
}