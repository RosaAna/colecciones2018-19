package com.iesvirgendelcarmen.teoria;

public class ArrayInicializado {

	public static void main(String[] args) {
		
		int[] valores = {1, 3, -9, 8 ,7};
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		System.out.println("---------------------");
		for (int i : valores) { //la variable i apunta al primer valor
 			System.out.println(i); //luego va apuntando al resto de valores
		}

	}

}
