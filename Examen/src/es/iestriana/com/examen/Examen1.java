package es.iestriana.com.examen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examen1 {

	
				private static Scanner sc = new Scanner(System.in);
				private static int [] numeros;
				private static int [] numeros2;
				
				public static void main(String[] args) {
						int n = 0;
						do {
							System.out.println("Dame el tamaño del array: ");
							n = sc.nextInt();
						} while (n<0);
						numeros = new int[n];
						numeros2 = new int[n];
						rellenarTabla();
						System.out.println(Arrays.toString(numeros));
						repetidos();
						System.out.println(Arrays.toString(numeros2));
				}

				private static void repetidos() {
					int cont = 0;
					int num = 0;
					
					for (int i = 0; i < numeros.length; i++) {
						num = numeros[i];
							for (int j = 0; j < numeros.length; j++) {
								if (num == numeros[j]) {
									cont++;
								}
							}
							if (cont > 1) {
								cont = 0;
							}else if (cont <= 1) {
								numeros2[i] = num;
								cont = 0;
							}
					}
					
				}

				private static void rellenarTabla() {
					for (int i = 0; i < numeros.length; i++) {
						numeros[i] = new Random().nextInt(15) + 1;
					}
					
				}
}
