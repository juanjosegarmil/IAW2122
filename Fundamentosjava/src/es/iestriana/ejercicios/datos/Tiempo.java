package es.iestriana.ejercicios.datos;

import java.util.Scanner;

public class Tiempo {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Dame el tiempo(segundos): ");
		int segundos = sc.nextInt();
		
		int horas = segundos/3600;
		int minutos = (segundos - (horas * 3600)) / 60;
		int segundos2 = segundos - (horas * 3600) - (minutos * 60);
		System.out.println(segundos2 + " seg\n" + minutos + " min\n" + horas + " horas");
	
}
}
