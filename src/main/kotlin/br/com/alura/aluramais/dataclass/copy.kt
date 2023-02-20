package br.com.alura.aluramais.dataclass

/*/Utilizando o copy() = possibilita fazer uma cópia do objeto com os mesmos valores
e também modificar os valores da property cópia em questão da property original
Implementação padrão do (data) class
 */
fun main() {

    val kevin = People(
        nome = "Kevin",
        idade = 20
    )

    val kevin2 = kevin.copy(nome = "Líder do campeonato")
    println(kevin == kevin2)
    println(kevin2)

}

data class People(val nome: String, val idade: Int) {

    fun fala() {
        println("Emite som")
    }


}