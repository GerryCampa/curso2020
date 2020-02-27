package bucles;

import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		// Alumnos, edades, alturas. Mayores de edad, edad media, miden m�s de
		// 1.75 m

		Scanner sc = new Scanner(System.in);

		
		int edad;
		double altura;
		int contadorMayoresEdad = 0;
		int contadorAltura = 0;
		int sumaEdades = 0;

		for (int i = 0; i<5; i++) {
			
			System.out.println("Introduzca la edad del alumno");
			edad = sc.nextInt();
			System.out.println("Introduzca la altura del alumno en m");
			altura = sc.nextDouble();
			
			if (edad >= 18) {
				contadorMayoresEdad++;
			}
			if (altura > 1.75) {
				contadorAltura++;

			}
			sumaEdades = sumaEdades + edad;

		}
		System.out.println("La cantidad de alumnos mayores de edad es " + contadorMayoresEdad);
		System.out.println("La cantidad de alumnos m�s altos de 1,75 m es  " + contadorAltura);
		System.out.println("La media de las edades es " + (sumaEdades / 5));

	}

}
