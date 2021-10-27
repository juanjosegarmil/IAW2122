package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejerciciosbucles {

	
			private static Scanner sc = new Scanner(System.in);
			
			
			public static void main(String[] args) {
				//do while
				/*int numero;
				do {
					System.out.println("Nº positivo: ");
					numero = sc.nextInt();
				} while (numero < 0);
				
				//while
				System.out.println("Nª positivo: ");
				int numero2 = sc.nextInt();
				while(numero2 < 0) {
					System.out.println("Nº positivo: ");
					numero2 = sc.nextInt();
					
				}*/
				//for
				/*for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}*/
				
				/*
				 * int total = 0;
				 
				do {
					System.out.println("Cuantos numeros queires introducir: ");
					total = sc.nextInt();
				} while (total <= 0);
				double sumaPositivos = 0, sumaNegativo = 0, mediaPositiva, mediaNegativa;
				int contadorPos = 0, contadorNeg = 0, contadorceros = 0;
				
				for(int i=0; i < total; i++) {
					System.out.println("Nº: ");
					double numero = sc.nextDouble();
					if (numero>0) {
						sumaPositivos += numero;
						contadorPos++;
					}else if (numero < 0) {
						sumaNegativo += numero;
						contadorNeg++;
					} else {
						contadorceros++;
					}
				}
				System.out.println("Media positivos: " + (sumaPositivos/contadorPos));
				System.out.println("Media negativos: " + (sumaNegativo/contadorNeg));
				System.out.println("Contador 0s: " + contadorceros);
				*/
				
				//leer una serie de n números (del usuario). Mostrar si los números
				//están en orden creciente, decreciente o desordenado
				int total = 0;
				
				do {
					System.out.println("Cuantos numeros queires introducir: ");
					total = sc.nextInt();
				} while (total <= 0);
				
				int orden = comprobarOrden(total);
				switch (orden) {
				case -1:
					System.out.println("DECRECIENTE");
					break;
				case 0:
					System.out.println("DESORDENADO");
					break;
				case 1:
					System.out.println("CRECIENTE");
					break;

				default:
					break;
				}
			}


			private static int comprobarOrden(int total) {
				int numero = 0;
				int auxiliar = 0;
				boolean creciente = false;
				boolean decreciente = false;
				for(int i=0; i < total;i++) {
					System.out.println("Nº: ");
					numero = sc.nextInt();
					
					if (i == 0) {
					auxiliar = numero;
					}else {
						if (numero > auxiliar) {
							creciente = true;
						}else if (numero < auxiliar) {
							decreciente = true;
						}
					} 
					
						
					
				}
				if (creciente && decreciente) {
					return 0;
				}else if(creciente && !decreciente) {
					return 1;
				}else {
					return -1;
				}
			}
			
			
}
