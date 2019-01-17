package com.iesvirgendelcarmen.test;

import java.util.Scanner;

import com.iesvirgendelcarmen.ejercicios.ColeccionDinamica;

public class TestColeccionDinamica {

	public static void main(String[] args) {

		ColeccionDinamica c = new ColeccionDinamica();
		System.out.println("Introduce palabras. Para acabar usa fin");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.next();
		if (!cadena.equalsIgnoreCase("fin"))
			c.addCadena(cadena);
		//System.out.println(cadena);
		while (!cadena.equalsIgnoreCase("FIN") && sc.hasNext()) {
			cadena = sc.next();
			if (!cadena.equalsIgnoreCase("fin"))
				c.addCadena(cadena);
			//System.out.println(cadena);
		}
		sc.close();
		c.quitarCadena("uno");
		System.out.printf("Lista de cadena de mayor longitud%n%s%n",
				c.obtenerCadenasMayorLongitud());
		System.out.println(c.getListaCadenas());
	}

}
