package es.tablas.datos;

import java.util.Scanner;

public class Ejercicioexamen {
					
				
						//int amigos = numeroAmigos(numero,numero2);
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			int numero = 0;
			int numero2 = 0;
			
			System.out.println("Dame el número: ");
			numero = sc.nextInt();
			System.out.println("Dame el número 2: ");
			numero2 = sc.nextInt();
			int contador = 0;
			int contador2 = 0;
			for (int i = 0; i < numero; i++) {
				if (numero%i == 0) {
					contador = contador +i;
				}
				
			}
			for (int i = 0; i < numero2; i++) {
				if (numero2%i == 0) {
					contador2 = contador2 +i;
				}
			}
			if (contador == numero2 && contador2 == numero) {
				System.out.println("Son amigos");
			} else {
				System.out.println("No son amigos");
			}
	}
}

				/*private static int numeroAmigos(int numero, int numero2) {
					int contador = 0;
					int contador2 = 0;
					for (int i = 0; i < numero; i++) {
						if (numero%i == 0) {
							contador = contador +i;
						}
						
					}
					for (int i = 0; i < numero2; i++) {
						if (numero2%i == 0) {
							contador2 = contador2 +i;
						}
					}
					if (contador == numero2 && contador2 == numero) {
						return 1;
					} else {
						return 0;
					}
					
				}*/

