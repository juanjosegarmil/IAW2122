package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Task23javaloops {
	
		private static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			int numero1 = 0;
			int numero2 = 0;
			int cont = 0;
			int contpares = 0;
			int sumaimpares = 0;
			do {
				System.out.println("1º Nº: ");
				numero1 = sc.nextInt();
				System.out.println("2º Nº: ");
				numero2 = sc.nextInt();
			} while (numero1 > numero2);
			for (int i = numero1 +7; i < numero2; i += 7) {
				System.out.println(i);
				cont++;
				if(i %2 == 0) {
					contpares++;
				}else {
					sumaimpares += i;
				}
			}
			System.out.println("Total de nº impresos: " + cont + "\nTotal de nº pares: " + contpares + "\nSuma de impares: " + sumaimpares);
			sc.close();
		}
}
