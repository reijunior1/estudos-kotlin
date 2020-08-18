package cursoalura

import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
            nome = "Reinaldo",
            cpf = "1111.111.11",
            salario = 1000.0,
            senha = 1234
    )

    val diretora = Diretor(
            nome = "Reinaldo Couto",
            cpf = "222.222.11",
            salario = 2000.0,
            senha = 4321,
            plr = 200.0
    )

    val cliente = Cliente(
            nome = "Reinaldo",
            cpf = "111.111.111-11",
            senha = 1234

    )

    val Reinaldo = Desenvolvedor(
            nome = "Reinaldo",
            cpf = "111.111.11-11",
            salario = 1.000,
            cargo = "Dev",
            senha = 1111
    )

    val Patricia = Analista(
            nome = "Patricia",
            cpf = "111.111.11.11",
            salario = 1.000,
            cargo = "Analista",
            senha = 1122
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretora, 4321)
    sistema.entra(cliente, 1234)
    sistema.entra(Reinaldo,1111)
    sistema.entra(Patricia,1122)

}