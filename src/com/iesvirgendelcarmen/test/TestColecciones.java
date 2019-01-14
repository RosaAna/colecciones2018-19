package com.iesvirgendelcarmen.test;

import java.util.Arrays;

import com.iesvirgendelcarmen.ejercicios.Colecciones;

public class TestColecciones {

	public static void main(String[] args) {
		
		Colecciones colecciones = new Colecciones(22);
		int[] array1 = colecciones.getArray1();
		int[] array2 = colecciones.getArray2();
		System.out.println("array1: " + Arrays.toString(array1));
		System.out.println("array2: " + Arrays.toString(array2));
		colecciones.mostrarValores();

	}

}
