package es.tablas.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	
	//Rellenar tabla con 20 nº positivos randowms
	//preguntar nº a usuario y mostrar la posicion del nº
				private static Scanner sc = new Scanner(System.in);
				
				private static int [] numeros = new int[20];
				
				public static void main(String[] args) {
					rellenarTabla();
					int num = 0;
					do {
						System.out.println("Indica nº: ");
						num = sc.nextInt();
					} while (num<=0);
					
					calcularPosicion(num);
					sc.close();
				}

				private static void calcularPosicion(int num) {
					int contador = 0;
					for (int i = 0; i < numeros.length; i++) {
						if (numeros[i] == num) {
							System.out.println("Posición " + i);
							contador++;
						}
				
					}
					if (contador == 0) {
						System.out.println("No encontrado");
					}
					
				}

				private static void rellenarTabla() {
					for (int i = 0; i < numeros.length; i++) {
						numeros[i] = new Random().nextInt(30)+1;
					}
					
				}

				
				
}
