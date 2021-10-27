package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = 0;
		do {
			System.out.println("Dame el nº para empezar: ");
			numero = sc.nextInt();
		} while (numero <=0);
		for (int i=numero; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
