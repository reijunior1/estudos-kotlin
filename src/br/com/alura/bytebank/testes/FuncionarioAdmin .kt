package cursoalura

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin(
        nome: String,
        cpf: String,
        salario: Double,
        cargo: String,
       protected val senha: Int
) : Funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario,
        cargo = cargo
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}
