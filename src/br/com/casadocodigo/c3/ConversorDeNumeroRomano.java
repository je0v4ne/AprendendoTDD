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

    private static final Map<String, Integer> tabela = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public int converte(String numeroEmRomano) {
        return tabela.get(numeroEmRomano);
    }
}
