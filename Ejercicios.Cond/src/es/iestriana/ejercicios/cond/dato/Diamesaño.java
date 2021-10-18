package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Diamesaño {
		
		private static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			System.out.println("Dame el día: ");
			int dia = sc.nextInt();
			
			System.out.println("Dame el mes: ");
			int mes = sc.nextInt();
			
			System.out.println("Dame el año: ");
			int año = sc.nextInt();
			
			
			if (mes % 2 == 0 && año >= 0) {
				if (mes == 2) {
					if (dia >-1 && dia < 29) {
						System.out.println(dia + "/" + mes + "/" + año + " correcto");
					}else {
						System.out.println("Fecha incorrecta");
					}
				if (mes == 10) {
					if (dia >-1 && dia < 32) {
						System.out.println(dia + "/" + mes + "/" + año + " correcto");
					}else {
						System.out.println("Fecha incorrecta");
					}
				}
				if (mes == 12) {
					if (dia >-1 && dia < 32) {
						System.out.println(dia + "/" + mes + "/" + año + " correcto");
					}else {
						System.out.println("Fecha incorrecta");
					}
				}
				}
				if (dia >-1 && dia < 31) {
					System.out.println(dia + "/" + mes + "/" + año + " correcto");
				}else {
					System.out.println("Fecha incorrecta");
				}
			}else if (mes %2 != 0 && año >= 0) {
				if (mes == 9) {
					if (dia >-1 && dia < 31) {
						System.out.println(dia + "/" + mes + "/" + año + " correcto");
					}else {
						System.out.println("Fecha incorrecta");
					}
			}
			if (mes == 11) {
				if (dia >-1 && dia < 31) {
					System.out.println(dia + "/" + mes + "/" + año + " correcto");
				}else {
					System.out.println("Fecha incorrecta");
				}
			}else {
				if (dia >-1 && dia < 32) {
					System.out.println(dia + "/" + mes + "/" + año + " correcto");
				}else {
					System.out.println("Fecha incorrecta");
				}
			}
		}
		}
}
