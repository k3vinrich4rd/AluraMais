package br.com.alura.aluramais.classenumber //Domínio
// Importante:
// Todo o tipo primitivo numérico além de herdar da classe any,
//  também herda da classe Number, sabendo disso é possível fazer o polimorfismo
//  dos membros dessa classe quando queremos trabalhar com os tipos primitivos numéricos


fun main() {
    val x: Int = 10 //Conversão
    val y: Double = 10.0 //Conversão

    test(x)
    test(y)

    println(x.toDouble())
    println(y.toInt())
}

fun test(value: Number) {

}
