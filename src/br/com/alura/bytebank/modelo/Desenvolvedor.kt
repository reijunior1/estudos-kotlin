package br.com.alura.bytebank.modelo

import cursoalura.FuncionarioAdmin

class Desenvolvedor(
        nome: String,
        cpf: String,
        salario: Double,
        cargo: String,
        senha: Int

) : FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        cargo = cargo,
        senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario * 0.2
        }
}


