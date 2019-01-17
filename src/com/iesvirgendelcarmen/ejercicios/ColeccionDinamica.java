package com.iesvirgendelcarmen.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDinamica {

	private List<String> listaCadenas = new ArrayList<>();

	//añadimos una cadena a la colección
	public void addCadena(String cadena) {
		listaCadenas.add(cadena);
	}
	//buscamos una cadena en la colección
	public boolean buscarCadena(String cadena) {
		return listaCadenas.contains(cadena);
	}
	//eliminamos una cadena de la colección
	public void quitarCadena(String cadena) {
		listaCadenas.remove(cadena);
	}
	//devolvemos una lista con las cadenas de mayor longitud
	public List<String> obtenerCadenasMayorLongitud(){
		List<String> listaCadenasMayorLongitud 
		= new ArrayList<>();
		int mayorLongitud = 0;
		for (String string : listaCadenas) {
			if (string.length() > mayorLongitud) {
				mayorLongitud = string.length(); //cambio a nueva longitud
				listaCadenasMayorLongitud.clear(); //limpio la colección de cadena de mayor longitud
				listaCadenasMayorLongitud.add(string); //añado la nueva cadena que es de mayor longitud
			}
			else if (string.length() == mayorLongitud)
				listaCadenasMayorLongitud.add(string);
		}
		return listaCadenasMayorLongitud;
	}
	public List<String> getListaCadenas() {
		return listaCadenas;
	}


}
