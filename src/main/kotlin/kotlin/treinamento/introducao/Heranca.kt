package br.com.controlar.kotlin.treinamento.introducao

open class Cachorro {

    open fun olaDog(){

        println("Olha dogs")
    }
}

class Viralada: Cachorro(){

    override fun olaDog() {
        super.olaDog()
    }
}

fun main(){

    val cachorro: Cachorro = Viralada()
    cachorro.olaDog()
}