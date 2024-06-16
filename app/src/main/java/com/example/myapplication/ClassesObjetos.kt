package com.example.myapplication




class Jogador {

    var kart     = ""
    var pneu     = ""
    var planador = ""

    fun acelerar( aceleracao: Int=0 ){
        println("Acelerar na velocicade: $aceleracao")
    }

    fun retornarPoder(): String{
        return "Casco Vermelho"
    }

}

fun main() {

    val jogador = Jogador()
    jogador.acelerar(80)
    //jogador.kart = "Kart do Mario "

    val poder = jogador.retornarPoder()
    println(poder)

}

