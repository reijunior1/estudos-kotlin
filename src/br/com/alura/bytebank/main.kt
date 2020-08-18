package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Conta
import cursoalura.testaComportamentosConta

fun main() {

    testaComportamentosConta()
    println("Total de contas : ${Conta.total}")

}