package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejerciciosbucles {

	
			private static Scanner sc = new Scanner(System.in);
			
			
			public static void main(String[] args) {
				//do while
				/*int numero;
				do {
					System.out.println("N� positivo: ");
					numero = sc.nextInt();
				} while (numero < 0);
				
				//while
				System.out.println("N� positivo: ");
				int numero2 = sc.nextInt();
				while(numero2 < 0) {
					System.out.println("N� positivo: ");
					numero2 = sc.nextInt();
					
				}*/
				//for
				/*for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}*/
				
				int total = 0;
				do {
					System.out.println("Cuantos numeros queires introducir: ");
					total = sc.nextInt();
				} while (total <= 0);
				double sumaPositivos, sumaNegativo, mediaPositiva, mediaNegativa;
				int contadorPos = 0, contadorNeg = 0, contadorceros;
				
				for(int i=0; i < total; i++) {
					System.out.println("N�: ");
					double numero = sc.nextDouble();
					if (numero>0) {
						sumaPositivos += numero;
						contadorPos++;
					}
				}
			}
			
			
}
