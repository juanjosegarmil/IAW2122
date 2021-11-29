package es.tablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	
		private static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			int cantidad = 0;
			System.out.println("Cuantos numeros vas a guardar: ");
			cantidad = sc.nextInt();
			int numeros2 [] = new int[cantidad];
			int par [] = new int[cantidad];
			int impar [] = new int[cantidad];
			
			for (int i = 0; i < numeros2.length; i++) {
				System.out.println("Dame el nº: ");
				numeros2[i] = sc.nextInt();
			}
			par(numeros2,par,impar);
			System.out.println(Arrays.toString(impar));
			System.out.println(Arrays.toString(par));
			sc.close();
		}
		private static void par(int[] numeros2, int[] impar, int[] par) {
			int j = 0;
			int k = 0;
			for (int i = 0; i < numeros2.length; i++) {
				if (numeros2[i] %2 == 0) {
					par[j] = numeros2[i];
					j++;
				}else {
					impar[k] = numeros2[i];
					k++;
				}
			}
			
		}
			
}

