package com.iesvirgendelcarmen.teoria;

public class ArraysBidimensionales {

	public static void main(String[] args) {

		//definimos el array bidimensional
		final int FILAS    = 5;
		final int COLUMNAS = 8;
		int[][] numeros = new int[FILAS][COLUMNAS];
		//rellenamos de manera aleatorio
		for(int i = 0; i < FILAS; i++) { //rellenar filas
			for(int j = 0; j < COLUMNAS; j++) { //rellenar cada columna
				numeros[i][j] = (int) (Math.random() * 500);
			}
		}
		//mostramos los datos del array
		for(int i = 0; i < FILAS; i++) {
			for(int j = 0; j < COLUMNAS; j++) { 
				System.out.printf("%5d",numeros[i][j]);
			}
			System.out.println();
		}
		//buscamos el número mas grande y mas pequeño
		int maximoValor = numeros[0][0], minimoValor = numeros[0][0];
		for(int i = 0; i < FILAS; i++) {
			for(int j = 0; j < COLUMNAS; j++) { 
				if (numeros[i][j] > maximoValor) {
					maximoValor = numeros[i][j];
					continue;  //continua el bucle for, sin evaluar la sentencia de abajo
				}
				if (numeros[i][j] < minimoValor) {
					minimoValor = numeros[i][j];
				}
			}
		}
		System.out.printf("El máximo valor es %d y el menor vale %d%n",
				maximoValor, minimoValor);



	}

}
