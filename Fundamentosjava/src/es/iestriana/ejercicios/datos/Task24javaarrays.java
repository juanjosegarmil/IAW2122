package es.iestriana.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task24javaarrays {

			
			
			private static int [] numeros;
			public static void main(String[] args) {
				numeros = new int[10];
				rellenarNumeros();
				System.out.println(Arrays.toString(numeros));
				contarNumeros();
				
			}
			private static void contarNumeros() {
				int num = 0;
				int cont = 0;
				int max = 0;
				int contmax = 0;
				int max2 = 0;
				int contmax2 = 0;
				
				for (int i = 0; i < numeros.length; i++) {
					num = numeros[i];
					for (int j = 0; j < numeros.length; j++) {
						if (num == numeros[j]) {
							cont++;
						}
					
					}
					if (cont > 1 ) {
						if (cont > contmax) {
							max = num;
							contmax = cont;
							cont = 0;
						}else if(cont == contmax && num != max) {
							max2 = num;
							contmax2 = cont;
							cont = 0;
						}else {
							cont = 0;
						}
					}else if (cont < 2) {
						cont = 0;
					}
					
					}
				
				
					if (contmax2 != 0) {
						System.out.println("Los nº que más se repiten son : " + max + ", " + max2 + " con un total de: " + contmax + " veces");
					}else {
						System.out.println("El nº que más se repite es : " + max + " con un total de: " + contmax + " veces");
					}
					
}
			
			private static void rellenarNumeros() {
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = new Random().nextInt(20) + 1;
				}
			}
}
