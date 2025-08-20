package com.ejemplo;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora c = new Calculadora();
        assertEquals(8, c.sumar(5, 3));
    }

    @Test
    public void testRestar() {
        Calculadora c = new Calculadora();
        assertEquals(6, c.restar(10, 4));
    }

    @Test
    public void testMultiplicar() {
        Calculadora c = new Calculadora();
        assertEquals(42, c.multiplicar(6, 7));
    }

    @Test
    public void testDividir() {
        Calculadora c = new Calculadora();
        assertEquals(5.0, c.dividir(20, 4), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirEntreCero() {
        Calculadora c = new Calculadora();
        c.dividir(1, 0);
    }
}
