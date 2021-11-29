package es.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
			private static Scanner sc = new Scanner(System.in);
			
			public static void main(String[] args) {
				int cantidad1 = 0;
				int cantidad2 = 0;
				int j=0;
				int k=0;
				int cantidadtotal = 0;
				System.out.println("Cuantos numeros vas a guardar en la 1º array: ");
				cantidad1 = sc.nextInt();
				System.out.println("Cuantos numeros vas a guardar en la 2º array: ");
				cantidad2 = sc.nextInt();
				cantidadtotal = cantidad1 + cantidad2;
				int cadenaA [] = new int[cantidad1];
				int cadenaB [] = new int[cantidad2];
				int cadenaAB [] = new int[cantidadtotal];
				
				for (int i = 0; i < cadenaA.length; i++) {
					cadenaA[i] = new Random().nextInt(50)+1;
				}
				for (int i = 0; i < cadenaB.length; i++) {
					cadenaB[i] = new Random().nextInt(50)+1;
				}
				for (int i = 0; i < cadenaAB.length; i++) {
					if (i%2 == 0){
						if(cadenaA.length == j) {
							break;
						}else {
						cadenaAB[i] = cadenaA[j];
						j++;
						}
					}
				}
						
						for (int i = 0; i < cadenaAB.length; i++) {
							if (i%2 != 0){
								if(cadenaB.length == k) {
									break;
								}else {
								cadenaAB[i] = cadenaB[k];
								k++;
								}
							}
						}
						
						System.out.println( "1º cadena: " + Arrays.toString(cadenaA) + "\n2ª cadena: "+ Arrays.toString(cadenaB) + "\nCadena final: " + Arrays.toString(cadenaAB));
				}
				
			}
					
			
