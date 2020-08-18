package cursoalura

import br.com.alura.bytebank.modelo.*


fun testaFuncionarios() {
        val Reinaldo = Desenvolvedor(
                nome = "Reinaldo",
                cpf = "111.111.111-11",
                salario = 1000.0,
                cargo = "Desenvolvedor Java",
                senha = 1111
        )
        val ReinaldoCouto = Desenvolvedor(
                nome = "Reinaldo Couto",
                cpf = "222.222.22-22",
                salario = 1000.0,
                senha = 1234,
                cargo = "Desenvolvedor"
        )
        val ReinaldoVicente = Diretor(
                nome = "Reinaldo Vicente",
                cpf = "333.333.333-33",
                salario = 1000.0,
                senha = 2255,
                plr = 200.0
        )
        val ReinaldoJunior = Desenvolvedor(
                nome = "Reinaldo Junior",
                cpf = "444.444.444-44",
                salario = 1000.0,
                senha = 2233,
                cargo = "Desenvolvedor"

        )
        val Patricia = Analista(
                nome = "Patricia",
                cpf = "555.555.555-55",
                salario = 3000.0,
                cargo = "Analista",
                senha = 1122

        )
        val Christian = Auxiliar(
                nome = "Christian",
                cpf = "777.777.77-77",
                salario = 1000.0,
                cargo = "Auxiliar"
        )


        println("-----------------------------------------")
        println("nome: ${Reinaldo.nome}")
        println("CPF: ${Reinaldo.cpf}")
        println("salario R$ : ${Reinaldo.salario}")
        println("Cargo de : ${Reinaldo.cargo}")
        println("Bonificação de R$: ${Reinaldo.bonificacao}")
        println("-----------------------------------------")



        println("-----------------------------------------")
        println("nome: ${ReinaldoCouto.nome}")
        println("CPF: ${ReinaldoCouto.cpf}")
        println("salario: ${ReinaldoCouto.salario}")
        println("Cargo: ${Reinaldo.cargo}")
        println("autenticaçao: ${ReinaldoCouto.autentica(1234)}")
        println("Bonificação: ${ReinaldoCouto.bonificacao}")
        if (ReinaldoCouto.autentica(1234)) {
            println("Autenticação com Sucesso")
        } else {
            println("Falha na Autenticação")
        }

        println("-----------------------------------------")


        println("-----------------------------------------")
        println("nome: ${ReinaldoVicente.nome}")
        println("CPF: ${ReinaldoVicente.cpf}")
        println("salario: ${ReinaldoVicente.salario}")
        println("Cargo de : ${ReinaldoVicente.cargo}")
        println("autenticaçao: ${ReinaldoVicente.autentica(2255)}")
        println("Bonificação: ${ReinaldoVicente.bonificacao}")
        println("PLR: ${ReinaldoVicente.plr}")
        if (ReinaldoVicente.autentica(2255)) {
            println("Autenticação com Sucesso")
        } else {
            println("Falha na Autenticaçao")
        }
        println("-----------------------------------------")


        println("-----------------------------------------")
        println("nome: ${ReinaldoJunior.nome}")
        println("CPF: ${ReinaldoJunior.cpf}")
        println("salario: ${ReinaldoJunior.salario}")
        println("Cargo de : ${ReinaldoJunior.cargo}")
        println("autenticaçao: ${ReinaldoJunior.autentica(2233)}")
        println("Bonificação: ${ReinaldoJunior.bonificacao}")
        if (ReinaldoJunior.autentica(2233)) {
            println("Autenticação com Sucesso")
        } else {
            println("Falha na Autenticação")
        }
        println("-----------------------------------------")

        println("nome: ${Patricia.nome}")
        println("CPF: ${Patricia.cpf}")
        println("salario: ${Patricia.salario}")
        println("cargo: ${Patricia.cargo}")
        println("Bonificação : ${Patricia.bonificacao}")

        println("-----------------------------------------")

        println("nome: ${Christian.nome}")
        println("CPF: ${Christian.cpf}")
        println("salario: ${Christian.salario}")
        println("cargo: ${Christian.cargo}")
        println("Bonificação: ${Christian.bonificacao}")


        val calculadora = CalculadoraBonificacao()
        calculadora.registra(Reinaldo)
        calculadora.registra(ReinaldoCouto)
        calculadora.registra(ReinaldoVicente)
        calculadora.registra(ReinaldoJunior)
        calculadora.registra(Patricia)
        calculadora.registra(Christian)

        println("-----------------------------------------")

        println("Total de bonificação dos Funcionarios R$: ${calculadora.total}")
    }
