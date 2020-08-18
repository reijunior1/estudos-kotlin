package br.com.alura.bytebank.modelo

import cursoalura.FuncionarioAdmin

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int

) : FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        cargo = "Gerente",
        senha = senha

) {
    override val bonificacao: Double
        get() {
            return salario * 0.3
        }
}


