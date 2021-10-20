package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejercicio13 {

	
	  		private static Scanner sc = new Scanner(System.in);
	  		
	  		public static void main(String[] args) {
	  			
	  			System.out.println("Dame tu peso: ");
	  			double peso = sc.nextDouble();
	  			System.out.println("Dame tu altura: ");
	  			double altura = sc.nextDouble();
	  			
	  			double imc = peso / (Math.pow(altura, 2));
	  			
	  			if (imc < 16) {
	  				System.out.println("Hospital admission criteria");
	  			}else if (imc > 16 && imc < 17) {
	  				System.out.println("underweight");
	  			}else if (imc > 17 && imc < 18) {
	  				System.out.println("underweight");
	  			}else if (imc > 18 && imc < 25) {
	  				System.out.println("normal weight");
	  			}else if (imc > 25 && imc < 30) {
	  				System.out.println("overweight");
	  			}else if (imc > 30 && imc < 35) {
	  				System.out.println("chronically ");
	  			}else if (imc >35 && imc < 40) {
	  				System.out.println("premorbid");
	  			}else {
	  				System.out.println("morbid obesity");
	  			}
	  		}
}
