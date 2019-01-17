package com.iesvirgendelcarmen.test;

import java.util.Arrays;
import java.util.List;

import com.iesvirgendelcarmen.ejercicios.ColeccionAleatoria;

public class TestColeccionesAleatoria {

	public static void main(String[] args) {
		
		ColeccionAleatoria c = new ColeccionAleatoria();
		
		int[] array = c.getArray();
		System.out.println(Arrays.toString(array));
		System.out.printf("Valor medio de los datos %.2f%n",
				c.calcularValorMedio());
		System.out.printf("Desviación típica %.2f%n",
				c.calcularDesviacionTipica());
		int[] arrayOrdenado = c.devolverArrayOrdenado();
		System.out.println(Arrays.toString(arrayOrdenado));
		System.out.println(Arrays.toString(array));
		List<Integer> coleccionPares = c.devolverParesDelArray();
		System.out.println(coleccionPares);
		System.out.printf("Valor mas pequeño %d%n",
				c.calcularValorMinimo());
		System.out.printf("Valor mas grande %d%n",
				c.calcularValorMaximo());
		
	}
		

}
