package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejercicio7 {
			private static Scanner sc = new Scanner(System.in);
			
			public static void main(String[] args) {
				int n = 0;
				int numero2 = 0;
				while (n<=10) {
					System.out.println("Tabla del " + n);
					for (int i = 0; i <= 10; i++) {
						
						numero2 = n * i;
						System.out.println(n + " * " + i + " = " + numero2);
					}
					n++;
				}
				int tabla = 0;
				do {
					System.out.println("Tabla que necesitas: ");
					tabla = sc.nextInt();
				} while (tabla <= 0);
				int numero = 0;
				int j = tabla;
				System.out.println("Tabla del " + tabla);
				for (int i = 0; i <= 10; i++) {
					numero = i * j;
					System.out.println(j + " * " + i + " = " + numero);
				}
				
				
				
				sc.close();
			}
}
