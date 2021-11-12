package es.iestriana.ejercicios.cond.dato;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio8 {

				private static Scanner sc = new Scanner(System.in);
				
				public static void main(String[] args) {
					int numero;
					do {
						System.out.println("N�: ");
						numero = sc.nextInt();
					} while (numero <= 0);
					
					int contadorPrimos = 0;
					
					for (int i = 1; i <= numero; i++) {
						if (esPrimo(i)) {
							contadorPrimos++;
						}
					}
					
					System.out.println("Entre 1 y " + numero + " hay " + 
									contadorPrimos + " n�meros primos");

					sc.close();
				}

				private static boolean esPrimo(int i) {
					boolean primo = true;
					
					for (int j = 2; j < i; j++) {
						if (i%j==0) {
							primo = false;
						}
					}
					
					return primo;
				}
					
}

