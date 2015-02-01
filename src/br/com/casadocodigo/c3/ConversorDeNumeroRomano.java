/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.casadocodigo.c3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jeovane
 */
public class ConversorDeNumeroRomano {

    private static final Map<Character, Integer> tabela = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public int converte(String numeroEmRomano) {
        int acumulador = 0;
        int ultimoVizinhoDaDireita = 0;

        for (int i = numeroEmRomano.length() - 1; i >= 0; i--) {
            int atual = tabela.get(numeroEmRomano.charAt(i));

            int multiplicador = 1;
            if (atual < ultimoVizinhoDaDireita) {
                multiplicador = -1;
            }
            
            acumulador += atual * multiplicador;
            
            ultimoVizinhoDaDireita = atual;
        }

        return acumulador;
    }
}
