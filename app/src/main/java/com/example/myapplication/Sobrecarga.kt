package com.example.myapplication

class Usuario{

    fun logar(email: String, senha: String){
        println("Usuário logado com email $email e senha $senha")
    }

    fun logar(numeroTelefone: String){
        println("Usuário logado com Telefone: $numeroTelefone")
    }


}

fun main() {
    val usuario = Usuario()

    //usuario.logar("jorge@mikael", "123123")

    usuario.logar("99999999")

}
