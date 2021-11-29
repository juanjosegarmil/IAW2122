package es.tablas.datos;

import java.util.Scanner;

public class Ejercicio6 {

	
				private static Scanner sc = new Scanner(System.in);
				private static int [] numeros;
				/* 
				 *
				 * */
				public static void main(String[] args) {
					int cantidad = 0;
					int buscador = 0;
					int auxiliar = 0;
					do {
						System.out.println("Longitud de la tabla: ");
						cantidad = sc.nextInt();
					} while (cantidad < 0);
					numeros = new int [cantidad];
					for (int i = 0; i < numeros.length;) {
						System.out.println("Numero: ");
						numeros[i] = sc.nextInt();
						auxiliar = numeros[i];
						if (i == 0) {
							System.out.println("Numero: ");
							numeros[i] = sc.nextInt();
							auxiliar = numeros[i];
							i++;
							
						}else { 
							if (auxiliar > numeros[i]) {
							System.out.println("Error nº más chico");
								
						}else if (auxiliar < numeros[i]){
							
							i++;
						}
					}
					}
					System.out.println("Dime el nº a buscar: ");
					buscador = sc.nextInt();
					
					for (int i = 0; i < numeros.length; i++) {
						if (numeros[i] == buscador) {
							System.out.println("Numero en posición: " + i);
						}else {
							System.out.println("Numero no encontrado");
						}
					}
				}
}
