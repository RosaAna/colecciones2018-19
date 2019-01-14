package com.iesvirgendelcarmen.teoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColeccionesDinamicas1 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>(); //lista dinámica vacía

		lista.add(1);
		lista.add(3);
//		lista.add("hola");

		//introducimos datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nº de datos");
		int numeroDatos = sc.nextInt();
		for (int i = 0; i < numeroDatos; i++) {
			System.out.println("Introduce número:");
			int numero = sc.nextInt();
			lista.add(numero);
		}
		sc.close();
		
		//calcular el valor medio
		int suma = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i);
		}
		double valorMedio = 1.0 * suma / lista.size();
		System.out.printf("Valor medio %.2f%n", valorMedio);
		System.out.println(lista);
		
		//buscando valores máximo y mínimo
		int valorMaximo = lista.get(0);
		int valorMinimo = lista.get(0);
		
		/*for (int i = 1; i < lista.size(); i++){
		if (lista.get(i) > valorMaximo) {
			valorMaximo = lista.get(i);
			continue;
		}
		if (lista.get(i) < valorMinimo)
			valorMinimo = lista.get(i);
		}*/
		
		for (Integer integer : lista) {
			if (integer > valorMaximo) {
				valorMaximo = integer;
				continue;
			}
			if (integer < valorMinimo)
				valorMinimo = integer;
		}
		
		System.out.printf("Valor mas pequeño %d y mas grande %d%n",
				valorMinimo, valorMaximo);
		
		//volvemos a mostrar los datos de la colección con funcional
		lista.forEach(System.out::println);  // a partir java 8
		


	}

}
