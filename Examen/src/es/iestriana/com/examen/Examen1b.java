package es.iestriana.com.examen;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Examen1b {
				
			private static Scanner sc = new Scanner(System.in);
			
			public static void main(String[] args) {
				int num = 0;
				int primo = 0;
				int suma = 0;
				for (int i = 0; i < 20; i++) {
					num = new Random().nextInt(100);
					System.out.println(num);
					if (num == 0) {
						System.out.println("El " + num + " es cero");
					}else if (num == 1) {
						System.out.println(num + " es primo");
					}else {
						for (int j = 2; j < num-1; j++) {
							if (num%j != 0) {
								primo = 1;
							}else {
								primo = 0;
								break;
							}
						}
					}
					if(num > 50) {
						System.out.println(num + " es >50");
					}else {
						System.out.println(num + " es <50");
					}
					if(primo == 1) {
						System.out.println(num + " es primo");
					}else {
						System.out.println(num + " no es primo");
					}
					for (int j = 1; j < num; j++) {
						if (num % j == 0) {
							suma += j;
						}
					}
					if (suma == num) {
						System.out.println(num + " es un nº completo");
					}
					
				}
			}
}
