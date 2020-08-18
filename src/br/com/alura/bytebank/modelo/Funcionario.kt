package br.com.alura.bytebank.modelo

abstract class  Funcionario(
        val cargo : String,
        val nome: String,
        val cpf: String,
        val salario: Double
)
{
    abstract val bonificacao : Double //Modo mais enxuto se comparado com outras Classes

}
