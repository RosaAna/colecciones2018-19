package com.iesvirgendelcarmen.ejercicios;

import java.util.Arrays;

public class Colecciones {
	private static final int TAMANNO = 10;
	/*private int[] array1;
	private int[] array2;
	
	public Colecciones() {
		array1 = new int[10];
		array2 = new int[10];
	}*/
	private int[] array1 = new int[TAMANNO];
	private int[] array2 = new int[TAMANNO];
	
	//constructor 
	public Colecciones(int numero) {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = numero;
		}
		/*for (int i : array1) { No funciona para inicializar
			i = numero;
		}*/
		Arrays.fill(array2, numero);
	}
		
	//getters
	public int[] getArray1() {
		return array1;
	}
	public int[] getArray2() {
		return array2;
	}
 	//método que muestra los dos arrays de forma simultánea
	public void mostrarValores() {
		for (int i = 0; i < TAMANNO; i++) {
			System.out.printf("%5d%5d%n", array1[i], array2[i]);
		}
	}
	
	
	
	
	
	
}
