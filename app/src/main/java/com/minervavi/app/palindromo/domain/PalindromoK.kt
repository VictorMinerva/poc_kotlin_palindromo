package com.minervavi.app.palindromo.domain

/**
 * Created by victo on 02/07/2017.
 */
data class PalindromoK (var _conteudo: String){
    val conteudo: String = _conteudo
        get() {
            return field.toLowerCase()
        }

    fun ehPalindromo() : Boolean {
        return conteudo == conteudo.reversed()
    }
}