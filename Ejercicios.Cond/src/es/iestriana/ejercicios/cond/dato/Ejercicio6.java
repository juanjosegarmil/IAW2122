package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejercicio6 {
	
				private static Scanner sc = new Scanner(System.in);
				
				public static void main(String[] args) {
					int numero = 0;
					
					System.out.println("Introduce un Nº: ");
					numero = sc.nextInt();
					int factorial = numero;
					if (numero > 0) {
						for (int i = (numero - 1); i > 0; i--) {
							factorial = factorial * i;
						}
					}else {
						if (numero %2 == 0) {
							for (int i = (numero + 1); i < 0; i++) {
								factorial = factorial * i;
							}
						}else
							for (int i = (numero + 1); i < 0; i++) {
								factorial = factorial * i;
							}
							factorial = -factorial;
					
					}
					System.out.println(factorial);
}
}
