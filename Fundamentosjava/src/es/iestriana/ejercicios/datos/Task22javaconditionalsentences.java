package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Task22javaconditionalsentences {

			private static Scanner sc = new Scanner(System.in);
			public static void main(String[] args) {
				
				System.out.println("Introduce n� entre 1 y 4 d�gitos: ");
				int numero = sc.nextInt();
				int numero2 = numero;
				int cont = 0;
				if (numero < 10000 && numero > 0) {
					while (numero2>0) {
						numero2 = numero2/10;
						cont++;
					}
					System.out.println("El n� " + numero + " tiene " + cont + " d�gitos");
				}else {
					System.out.println("Numero de m�s d�gitos o negativo");
				}
				
			
			}	
			
}
