package es.tablas.datos;

import java.util.Scanner;

public class Ejerciciorepaso {
				private static Scanner sc = new Scanner(System.in);
				
				
				public static void main(String[] args) {
					int numero = 0;
					int numerocua = 0;
					int numerosuma = 0;
					System.out.println("Dame el número:");
					numero = sc.nextInt();
					numerocua = numero * numero;
					if (numero%2 == 0) {
						for (int i = 0; i < numerocua; i++) {
							if (i%2 != 0) {
								numerosuma += i;
							}
						}
					}else {
						for (int i = 0; i < numerocua; i++) {
							if (i%2 == 0) {
								numerosuma += i;
							}
						}
					}
					
					System.out.println("El numero " + numero + " al cuadrado es: " + numerocua + " la suma de los pares/impares: " + numerosuma);
					
				}
					
}
