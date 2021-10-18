package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejercicioscond {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Dime tu nota: ");
		
		int num1 = sc.nextInt();
		/*
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		
		boolean condicion = num1 == num2;
		
		if (condicion) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		
		if (num1 % num2 == 0) 
			System.out.println(num1 + " es múltiplo de " + num2);
		else if (num2 % num1 == 0)
			System.out.println(num2 + " es múltiplo de " + num1);
		else
			System.out.println("no son múltiplos");
		
		System.out.println("Nº 3: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			}else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		}else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			}else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		}else {
			if (num1 > num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
			}else {
				System.out.println(num3 + " " + num2 + " " + num1);
			}
		}
		*/
		if (num1 == 5) {
			System.out.println("Tu nota es un suficiente");
		}else if (num1 < 5 && num1 > -1) {
			System.out.println("Tu nota es un insuficiente");
		}else if (num1 ==6) {
			System.out.println("Tu nota es bien");
		}else if (num1 > 6 && num1 < 9) {
			System.out.println("Tu nota es notable");
		}else if (num1 >8 && num1 < 11) {
			System.out.println("Tu nota es sobresaliente");
		} else {
			System.out.println("Error número fuera de rango (0-10)");
		}
		sc.close();
	}
		
}
