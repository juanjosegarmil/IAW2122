package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Task22javaconditionalsentences {

			private static Scanner sc = new Scanner(System.in);
			public static void main(String[] args) {
				
				System.out.println("Introduce nº entre 1 y 4 dígitos: ");
				int numero = sc.nextInt();
				int numero2 = numero;
				int cont = 0;
				if (numero < 10000 && numero > 0) {
					while (numero2>0) {
						numero2 = numero2/10;
						cont++;
					}
					System.out.println("El nº " + numero + " tiene " + cont + " dígitos");
				}else {
					System.out.println("Numero de más dígitos o negativo");
				}
				
			
			}	
			
}
