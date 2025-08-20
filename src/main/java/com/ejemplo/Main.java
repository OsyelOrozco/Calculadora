package com.ejemplo;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(10, 4));
        System.out.println("Multiplicación: " + calc.multiplicar(6, 7));
        System.out.println("División: " + calc.dividir(20, 4));
        System.out.println("Promedio del historial: " + calc.promedioHistorial());

        System.out.println("Historial: " + calc.obtenerHistorial());
    }
}
