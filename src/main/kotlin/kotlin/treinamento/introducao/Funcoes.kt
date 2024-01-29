package br.com.controlar.kotlin.treinamento.introducao

class Funcoes {

    fun funcaoSemRetorno(msg: String): Unit{

        var texto: String
        texto = "Exemplo de uma funcao sem retorno: Nome do teste: $msg"
        println(texto)
    }

    fun funcaoComValorDefaultSemRetorno(msg: String, tipo: String = "A2"){

        println("$msg do tipo $tipo")
    }


    fun funcaoComRetornoExplicito(msg: String): String{

        return msg
    }

    fun funcaoSemRetornoExcplicito(msg: String) : String{

        return msg
    }

    fun funcaoSemCorpo(a: Int, b: Int) = a+b
}