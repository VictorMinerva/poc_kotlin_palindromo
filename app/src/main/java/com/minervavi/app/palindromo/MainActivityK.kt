package com.minervavi.app.palindromo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.minervavi.app.palindromo.domain.PalindromoK
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by victo on 02/07/2017.
 */
fun String.ehPalindromo() : String {
    return if (this == this.reversed())
        "${this.toLowerCase()} é um palíndromo"
    else
        "${this.toLowerCase()} NÃO é um palíndromo"
}

class MainActivityK :
        AppCompatActivity(),
        View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val palindromo = PalindromoK(et_palindromo.text.toString())
        tv_resposta.text = if (palindromo.ehPalindromo())
            "${palindromo.conteudo} é um palíndromo"
        else
            "${palindromo.conteudo} NÃO é um palíndromo"

        tv_resposta.text = et_palindromo.text.toString().ehPalindromo()
    }


}