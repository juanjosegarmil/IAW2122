package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Calcularrectangulo {

		private static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Dame la base: ");
			int lado = sc.nextInt();
			System.out.println("Dame la altura: ");
			int altura = sc.nextInt();
			int area = (lado * altura);
			int perimetro = (lado * 2) + (altura * 2);
			System.out.println(area + " Área del rectángulo\n" + perimetro + " Perímetro del rectángulo");
		
}
}
