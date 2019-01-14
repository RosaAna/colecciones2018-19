package com.iesvirgendelcarmen.teoria;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosEnteros {

	public static void main(String[] args) {
		final int TAMANNO_ARRAY = 4; //tamaño del array
		int[] numerosEnteros = new int[TAMANNO_ARRAY]; //declaración del array
		Scanner sc =  new Scanner(System.in); //scanner para leer los números
		for (int i = 0; i < numerosEnteros.length; i++) {   //bucle de lectura
			System.out.println("Introduce posición " + i);
			numerosEnteros[i] = sc.nextInt();
		}
		sc.close(); //cerramos el scanner
		System.out.println("array original " + Arrays.toString(numerosEnteros));  //mostramos el array
		//calculamos valor medio
		//recorrer array, sumar los datos del array y dividir por el nº de datos
		int suma = 0;
		for (int i = 0; i < numerosEnteros.length; i++) {
			suma += numerosEnteros[i];
		}
		float valorMedio = 1.0f *  suma / TAMANNO_ARRAY  ;
		
		System.out.printf("El valor medio de los datos vale %.2f%n", valorMedio);
		//calculamos el valor máximo
		int valorMaximo = Integer.MIN_VALUE; //valor mas pequeño que puede existir
		for (int i = 0; i < numerosEnteros.length; i++) {
			if ( numerosEnteros[i] > valorMaximo) {
				valorMaximo = numerosEnteros[i];
			}
		}
		System.out.printf("El valor máximo es %d%n", valorMaximo);
		
		//buscamos el valor mas pequeño
		Arrays.sort(numerosEnteros); //ordena el array
		System.out.println("array ordenado " + Arrays.toString(numerosEnteros));
		System.out.printf("El valor mínimo es %d%n", numerosEnteros[0]);
		System.out.printf("El valor máximo es %d%n", 
				numerosEnteros[numerosEnteros.length - 1]);

		
		
		
		
		
		
		
		
		
		
		

	}

}
