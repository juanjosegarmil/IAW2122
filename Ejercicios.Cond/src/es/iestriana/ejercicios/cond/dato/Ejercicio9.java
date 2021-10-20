package es.iestriana.ejercicios.cond.dato;

import java.util.Scanner;

public class Ejercicio9 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Dame el dia: ");
		int dia = sc.nextInt();
		System.out.println("Dame el mes: ");
		int mes = sc.nextInt();
		System.out.println("Dame el a�o: ");
		int anyo = sc.nextInt();
		
		if (fechaCorreta(dia,mes,anyo)) {
			int diasdelmes = 0;
			switch (mes) {
			case 2:
				diasdelmes = 28;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diasdelmes = 31;
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				diasdelmes = 30;
				break;
				
			default:
				
				break;
			}
			
			dia++;
			
			if (dia > diasdelmes) {
				dia = 1;
				mes++;
				if(mes > 12) {
					mes = 1;
					anyo++;
				}
			}
			System.out.println("Fecha nueva: " + dia + "/" + mes + "/" + anyo);
			
		}else {
			System.out.println("Fecha incorrecta");
		}
		sc.close();
	}

	private static boolean fechaCorreta(int dia, int mes, int anyo) {
		// TODO Auto-generated method stub
        boolean fechaCorrecta = false;
		
		// Voy a comprobar la fecha
		if (anyo >= 0) {
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31) {
						fechaCorrecta = true;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <= 30) {
						fechaCorrecta = true;
					}
					break;
				case 2:
					boolean esBisiesto = ((anyo%4==0 && anyo%100!=0) || (anyo%400==0));
					if (esBisiesto && (dia >= 1 && dia <=29)) {
						fechaCorrecta = true;
					} else if (!esBisiesto && (dia >= 1 && dia <=28)) {
						fechaCorrecta = true;
					}
					break;
				default:
					break;
				}
			}
		}
		
		return fechaCorrecta;
	}
}
