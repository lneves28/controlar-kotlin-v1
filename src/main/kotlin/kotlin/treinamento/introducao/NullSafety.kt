package br.com.controlar.kotlin.treinamento.introducao

class NullSafety {

    //variavel que nao precisa ser inicializada
    lateinit var naoPodeSerNulo: String
    var podeSerNulo: String? = "Pode vir com valor nulo"



    fun classePrincipal(){

        naoPodeSerNulo = "Não pode ser nulo"
        println("Chamando variaveis nulas $naoPodeSerNulo")

        podeSerNulo = null

    }
}

fun main(){

    var intancia = NullSafety()
    intancia.classePrincipal()

}