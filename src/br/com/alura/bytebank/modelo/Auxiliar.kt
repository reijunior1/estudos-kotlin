package br.com.alura.bytebank.modelo

class Auxiliar(
        nome: String,
        cpf: String,
        salario: Double,
        cargo: String) :
        Funcionario(
                nome = nome,
                cpf = cpf,
                salario = salario,
                cargo = cargo) {

    override val bonificacao: Double
        get() {
            return salario * 0.05
        }
}

