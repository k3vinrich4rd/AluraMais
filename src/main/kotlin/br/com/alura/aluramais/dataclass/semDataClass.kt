package br.com.alura.aluramais.dataclass

//Utilizando o componentN() functions = Permite devolver um valor de uma variável
// sem a necessidade de utilizar o objeto com intermediário
//Implementação padrão do (data) class
fun main() {

    val kevin = Pessoa(
        nome = "Kevin",
        idade = 20
    )

    val (nome) = kevin

    val kevin2 = Pessoa(
        nome = "Kevin",
        idade = 20
    )

    println(kevin == kevin2)
    kevin.fala()

}

class Pessoa(val nome: String, val idade: Int) {

    fun fala() {
        println("Emite som")
    }

    //Possibilita fazer o uso da property sem a necessidade do objeto
    //É interessante o uso quando queremos pegar o valor das properties separadamente
    operator fun component1() = this.nome
}