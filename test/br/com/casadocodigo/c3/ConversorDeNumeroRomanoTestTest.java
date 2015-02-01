/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.casadocodigo.c3;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author jeovane
 */
public class ConversorDeNumeroRomanoTestTest {

    @Test
    public void deveEntenderOSimboloI() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        assertEquals(1, numero);
    }

    @Test
    public void deveEntenderOSimboloV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("V");
        assertEquals(5, numero);
    }

    @Test
    public void deveEntenderDoisSimbolosComoII() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("II");
        assertEquals(2, numero);
    }

    @Test
    public void deveEntenderQuatroSimbolosComoXXII() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("XXII");
        assertEquals(22, numero);
    }

    @Test
    public void deveEntenderNumerosComoIX() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("IX");
        assertEquals(9, numero);
    }
    
    @Test
    public void deveEntenderNumerosComplexosComoXXIV(){
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("XXIV");
        assertEquals(24, numero);
    }
}
