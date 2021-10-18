package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Task21javafundamentals {
			
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca precio del producto: ");
		double precio = sc.nextDouble();
		double primero = precio * 0.21;
		double segundo = precio * 0.18;
		double tercero = precio * 0.09;
		double resultado1 = precio + primero;
		double resultado2 = precio + segundo;
		double resultado3 = precio + tercero;
		System.out.println("Precio al 21%: " + resultado1 + "\nPrecio al 18%: " + resultado2 + "\nPrecio al 9%: " + resultado3);
	}
}
