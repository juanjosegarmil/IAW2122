package es.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
			
			private static Scanner sc = new Scanner(System.in);
			
			
			public static void main(String[] args) {
				int cantidad = 0;
				do {
					System.out.println("Cuantos numeros vas a guardar en la array: ");
					cantidad = sc.nextInt();
				} while (cantidad < 0);
				int numero [] = new int[cantidad];
				int num [] = new int[cantidad];
				for (int i = 0; i < numero.length; i++) {
					numero[i] = new Random().nextInt(50)+1;
				}
				System.out.println(Arrays.toString(numero));
				int numero2 = numero[0];
				int numero3 = numero[numero.length-1];
				for (int i = 0; i < numero.length-1; i++) {
						numero[i] = num[i+1];
						
				}
				num[0] = numero3;
				num[num.length -1] = numero2;
				System.out.println(Arrays.toString(num));
			}
}
