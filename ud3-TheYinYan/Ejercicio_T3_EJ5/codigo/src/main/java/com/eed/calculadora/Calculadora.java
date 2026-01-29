package com.eed.calculadora;

/**
 * Comportamiento básico de una calculadora
 * 
 * @author lmagarin
 *
 */
public class Calculadora {

	public static int sumar(int numero1, int numero2) {
		final int suma = numero1 + numero2;
		return suma;
	}

	public static int restar(int numero1, int numero2) {
		final int resta = numero1 - numero2;
		return resta;
	}

	public static int multiplicar(int numero1, int numero2) {
		final int producto = numero1 * numero2;
		return producto;
	}

	public static int dividir(int numero1, int numero2) {
		final int division = numero1 / numero2;
		return division;
	}

}
