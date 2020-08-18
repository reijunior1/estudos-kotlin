package cursoalura

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val reinaldo = Cliente(nome = "Reinaldo", cpf = "", senha = 1)
    val contaReinaldo = ContaCorrente(titular = reinaldo, numero = 1981) //opcional
    contaReinaldo.deposita(20.0)

    val patricia = Cliente(nome = "Patricia", cpf = "", senha = 1)
    val contaPatricia = ContaPoupanca(titular = patricia, numero =  1977)
    contaPatricia.deposita(10.0)

    val christian = Cliente(nome = "Christian", cpf = "", senha = 1)
    val contaChristian = ContaPoupanca(titular = christian, numero = 2015)
    contaChristian.deposita(30.0)


    println(" titular da conta ${contaChristian.titular}")
    println(" numero da conta ${contaChristian.numero}")
    println(" saldo da conta ${contaChristian.saldo}")
    println("-----------------------------------------")
    println(" titular da conta ${contaReinaldo.titular}")
    println(" numero da conta ${contaReinaldo.numero}")
    println(" saldo da conta ${contaReinaldo.saldo}")
    println("-----------------------------------------")
    println(" titular da conta ${contaPatricia.titular}")
    println(" numero da conta ${contaPatricia.numero}")
    println(" saldo da conta ${contaPatricia.saldo}")
    println("-----------------------------------------")

    println(" Depositando na conta do Reinaldo ")
    contaReinaldo.deposita(50.0)
    println(contaReinaldo.saldo)


    println(" Depositando na conta da Patricia ")
    contaPatricia.deposita(150.00)
    println(contaPatricia.saldo)

    println(" Depositando na conta do Christian ")
    contaChristian.deposita(250.00)
    println(contaChristian.saldo)

    println(" Sacando na conta do Christian")
    contaChristian.saca(800.0)
    println(contaChristian.saldo)


    println("sacando na conta do Reinaldo")
    contaReinaldo.saca(550.0)
    println(contaReinaldo.saldo)

    println("sacando na conta da Patricia")
    contaPatricia.saca(50.0)
    println(contaPatricia.saldo)

    if (contaPatricia.transfere(destino = contaReinaldo, valor = 100.0)) { // opcional
        println("transfencia bem sucedida")
    } else {
        println("Falha na tranferencia")
    }

    println("Saldo da Conta Poupança da ${contaPatricia.titular.nome} R$ ${contaPatricia.saldo}")
    println("Saldo da Conta Corrente do ${contaReinaldo.titular.nome} R$ ${contaReinaldo.saldo}")
    println("Saldo da Conta Poupança do ${contaChristian.titular.nome} R$ ${contaChristian.saldo}")
}