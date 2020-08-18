package br.com.alura.bytebank.modelo

class Cliente(
        val nome: String,
        val cpf: String,
        val endereco: Endereço = Endereço(),
        private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}