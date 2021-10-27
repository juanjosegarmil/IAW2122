package es.iestriana.ejercicios.cond.dato;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner sc = new Scanner(System.in);
	
			
	public static void main(String[] args) {
		int numero = 0;
		
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		int suma=0;
		
		for (int i = numero; i < numero + 100; i++) {
			suma += i;
		}
		/*int j = numero;
		while (j < numero + 100) {
			suma += j;
			j++;
		}*/
		
		System.out.println(suma);
		
		
		sc.close();
		
		
		
	}
}
