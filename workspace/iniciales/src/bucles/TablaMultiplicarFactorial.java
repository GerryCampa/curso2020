package bucles;

import java.util.Scanner;

public class TablaMultiplicarFactorial {

	public static void main(String[] args) {
		// Pedir n�mero. Hacer su tabla de multiplicar y su factorial

		Scanner sc = new Scanner(System.in);

		int numero;
		int fact=1;

		System.out.println("Introduzca un n�mero");

		numero = sc.nextInt();

		for (int i = 1; i < 11; i++) {

			System.out.println(numero + " multiplicado por " + i + " es " + numero * i);

		}

		for( int f=1;f<=numero;f++){
			
			fact=fact*f;
			}
			System.out.println("Factorial de "+numero+" es: "+fact);
	}

}
