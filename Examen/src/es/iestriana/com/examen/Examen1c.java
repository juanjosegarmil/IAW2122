package es.iestriana.com.examen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Examen1c {
				
					private static Scanner sc = new Scanner(System.in);
					private static int [] numeros;
					private static int [] numeros2;
						
					public static void main(String[] args) {
						int n = 0;
						do {
							System.out.println("Tamaño de los arrays: ");
							n = sc.nextInt();
						} while (n<0);
						numeros = new int[n];
						numeros2 = new int[n];
						rellenar();
						System.out.println(Arrays.toString(numeros));
						System.out.println(Arrays.toString(numeros2));
						cambiarParesImpares();
						System.out.println(Arrays.toString(numeros));
						System.out.println(Arrays.toString(numeros2));
						
					}

					private static void rellenar() {
						for (int i = 0; i < numeros.length; i++) {
							numeros[i] = new Random().nextInt(50) + 1;
							numeros2[i] = new Random().nextInt(50) + 1;
						}
						
					}

					private static void cambiarParesImpares() {
						int num = 0;
						int num2 = 0;
						for (int i = 0; i < numeros.length; i++) {
							num = numeros[i];
							num2 = numeros2[i];
								if (num%2 != 0) {
									numeros[i] += 1;
								}
								if (num2%2 == 0) {
									numeros2[i] += 1;
								}
						}
					}
}
