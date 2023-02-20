package br.com.alura.aluramais.classestring

/*
o Tipo String é imutável na sua instância (Diferente dos outros tipos primitivo
String é um Objeto e não um tipo primitivo
 */

fun main() {
    var palavra: String = "Palavra"//Conjunto de chars
    var palavraNova: String = "Nova Palavra"
    palavraNova = "Carro"

    println(palavra)
    println(palavraNova)

    for (c in palavraNova) {
        println(c == 'C')
    }

    var casa: String = palavra.substring(4)
    println(casa)
}