package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Ejercicios {
	/*
	 * 	Programa que realice la conversión de grados celsius a farengeiht 
	 * los grados celsius debe introducirlo el ususario
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Grados Celsius: ");
		double gradosCelsius = sc.nextDouble();
		//convertir = faren
		double gradosFahrenheit = (gradosCelsius * 1.8) + 32;
		
		System.out.println(gradosCelsius + " grados celsius son: " + gradosFahrenheit + " grados Fahrenheit");
	}

}

