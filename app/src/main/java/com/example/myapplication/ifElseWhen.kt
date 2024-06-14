package com.example.myapplication

//fun main() {
//
//    val notoAluno = 7
//    val condicao = notoAluno >= 6
//
//    if (condicao) {
//        println("Aprovado")
//    }
//
//
//}

fun main() {

    val opcao= 4
//    println("Cartão de credito")
//    println("Extrato Bancario")
//    println("Saldo")
    when( opcao ) {
        1 -> println("Cartão de credito")
        2 -> println("Extrato Bancario")
        in 3..5 -> println("Saldo")
        else -> println("Nenhuma opção selecionado")
    }



}
