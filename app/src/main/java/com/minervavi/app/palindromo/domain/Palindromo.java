package com.minervavi.app.palindromo.domain;

/**
 * Created by victo on 02/07/2017.
 */

public class Palindromo {
    private String conteudo;

    public Palindromo( String c ){
        this.conteudo = c;
    }

    public boolean ehPalindromo(){
        String invertido = new StringBuilder( conteudo ).reverse().toString();

        return invertido.equalsIgnoreCase(conteudo);
    }

    public String getConteudo(){
        return conteudo.toLowerCase();
    }
}