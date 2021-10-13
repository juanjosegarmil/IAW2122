package es.iestriana.fundamentosjava.datos;

import javax.sound.midi.SysexMessage;

public class Tipos {

	public static void main(String[] args) {
		System.out.println("Tipos");
		//comentario de 1 línea
		/*
		 comentario en bloque
		 */
		
		// Tipos de variables
		//tipo enteros
		byte b; // (8 bits)
		short sh; // (16 bits)
		int i; // (32 bits)
		long l; // (64 bits)
		
		char c; //
		char a = 'a';
		System.out.println((int)a);
		
		// Tipos Real
		float f = 3.1416f ; // (32 bits)
		double d = 3.1416; // (64 bits)
		System.out.println(d);
		
		// Tipo lógico
		boolean bol = true;
		
		// cadenas
		String cadena = "Hola que tal";
		String cadena2 = "\nestás";
		System.out.println(cadena + cadena2);
		
		// Tipos complejos
		
		Integer ii = 23;
		
	}
	
}
