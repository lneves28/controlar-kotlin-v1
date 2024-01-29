package br.com.controlar

import br.com.controlar.kotlin.treinamento.introducao.Funcoes


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val intanciFuncoes = Funcoes()
    intanciFuncoes.funcaoSemRetorno("funcao sem retorno")
    intanciFuncoes.funcaoSemCorpo(2, 5)
    intanciFuncoes.funcaoSemRetornoExcplicito("funcao sem retorno explicito")
    intanciFuncoes.funcaoComRetornoExplicito("funcao com retorno explicito")
    intanciFuncoes.funcaoComValorDefaultSemRetorno("funcao com valor defult. Utilizando o valor default ")
    intanciFuncoes.funcaoComValorDefaultSemRetorno("funcao com valor defult. Sem Utilizando o valor default ", "Ai")

}