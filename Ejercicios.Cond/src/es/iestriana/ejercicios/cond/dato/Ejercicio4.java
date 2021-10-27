package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = 0;
		do {
			System.out.println("Dame el nº para empezar: ");
			numero = sc.nextInt();
		} while (numero <=0);
		int i = 1;
		long productoFinal = 1;
		while (numero <= 0) {
			productoFinal = productoFinal * i;
			i = i + 2;
			
			numero--;
		}
	System.out.println("Producto impares: " + productoFinal);
	}
}
