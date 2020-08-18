package cursoalura

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereço
import kotlin.concurrent.timer

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
            titular = Cliente(nome = "Reinaldo", cpf = "", senha = 1), numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
            titular = Cliente(
                    nome = "Patricia",
                    cpf = "",
                    senha = 2,
                    endereco = Endereço(logradouro = "Av Governador Adhemar")
            ),
            numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo da conta corrente: ${contaCorrente.saldo}")
    println("saldo da conta Poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo apos transferencia para Poupança: R$ ${contaCorrente.saldo}")
    println("Saldo apos credito da Conta Corrente : R$ ${contaPoupanca.saldo}")


    contaPoupanca.transfere(200.0, contaCorrente)

    println("Saldo apos transferencia para Conta Corrente: R$ ${contaPoupanca.saldo}")
    println("Saldo apos credito da Conta poupança : R$ ${contaCorrente.saldo}")
    println("endereço titular: ${contaPoupanca.titular.endereco.logradouro}")
}
