package br.com.alura.aluramais.dataclass

/*
Data class = É uma classe de dados, é uma classe onde vai ter apenas as suas
properties que nós queremos manter os seus valore

/*Com data Class: Já vem com algumas implementações padrões com base nas properties
Quando utilizamos a data class já vamos ter esses métodos implementados pra gente:
equals(), hashCode(), toString(), componentN()functions e copy()
 */
 */

/*
Importante: Quando utilizamos a data Class
o construtor primário sempre tem que ter uma property
e nunca um argumento, pois as suas implementações padrão são
com base nas properties do construtor primário
 */

fun main() {

    val documento = Documento(
        rg = "12345678-9",
        cpf = "313.313.313-01"
    )

    val documento2 = Documento(
        rg = "12345678-9",
        cpf = "313.313.313-01"
    )

    println(documento == documento2) //O resultado é true porque quando utilizo a data class
    //A implementação sempre é focada nas properties do construtor primário e nos seus conteúdos
    println(documento)


    //Utilizando Destructuring Declarations
    val document = Document(
        rg = "424234234324",
        cpf = "254254252"
    )

    val (rg, cpf) = document
    println("rg: $rg, cpf: $cpf")
}

//Utilizando Destructuring Declarations
data class Document(val rg: String, val cpf: String) {

}

data class Documento(val rg: String, val cpf: String) {
}