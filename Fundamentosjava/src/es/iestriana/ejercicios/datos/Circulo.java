package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Circulo {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Dame el radio: ");
		double radio = sc.nextDouble();
		double area = 3.1415 * Math.pow(radio, 2);
		double perimetro = 2 * 3.1415 * radio;
		System.out.println(area + " Área del circulo\n" + perimetro + " Perímetro del circulo");
	
}
}
