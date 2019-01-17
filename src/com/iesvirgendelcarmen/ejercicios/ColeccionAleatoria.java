package com.iesvirgendelcarmen.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ColeccionAleatoria {
	
	private static final int TAMANNO = 100;
	private int[] array = new int[TAMANNO];
	private int[] arrayOrdenado;
	
	public ColeccionAleatoria() {
		//rellenar con 100 valores aleatorios
		Random random = new Random();
		for (int i = 0; i < TAMANNO; i++) {
			array[i] = random.nextInt(100);
		}
		arrayOrdenado = array.clone();
		Arrays.sort(arrayOrdenado);
	}

	public int[] getArray() {
		return array;
	}
	
	public double calcularValorMedio() {
		double suma = 0;
		for (int i : array) {
			suma += i;
		}
		return suma / TAMANNO;
	}
	
	public double calcularDesviacionTipica() {
		double sumatorio = 0;
		double valorMedio = calcularValorMedio();
		for (int i : array) {
			sumatorio += Math.pow(i - valorMedio, 2);
		}
		return Math.sqrt(sumatorio / TAMANNO); 
	}
	
	public int[] devolverArrayOrdenado() {
		/*int[] arrayOrdenado = array;
		Arrays.sort(arrayOrdenado);
		return arrayOrdenado;*/
	//	int[] arrayOrdenado = array.clone();
	//	Arrays.sort(arrayOrdenado);
		return arrayOrdenado;
	}
	
	public List<Integer> devolverParesDelArray() {
		List<Integer> listaPares = new ArrayList();
		for (int i : array) {
			if (i % 2 == 0)
				listaPares.add(i);
		}
		return listaPares;
	}
	
	public int calcularValorMinimo() {
	//	int[] arrayOrdenado = devolverArrayOrdenado();
		return arrayOrdenado[0];
	}
	
	public int calcularValorMaximo() {
	//	int[] arrayOrdenado = devolverArrayOrdenado();
		return arrayOrdenado[TAMANNO - 1];
	}
	
	
	
}
