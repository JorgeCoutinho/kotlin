import com.example.myapplication.Usuario


class Usuario constructor(// Construtor primario
    var nome: String = "",
    var sobrenome: String = ""
){// Contrutor primario

    init {
        //this.nome = nome
        //this.sobrenome = sobrenome
        println("Objeto inicializado")
        println("nome: $nome sobrenome: $sobrenome")
    }

    constructor(nome: String): this(nome, sobrenome = ""){// Construtor primario
        println("construtor secundario")
    }



}


fun main() {

    val usuario = Usuario("mikael")

}




