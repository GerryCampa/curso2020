package bucles;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// Ejemplo bucle do. Pedir numeros hasta introducir cero
		//y decir si son positivos o negativos

		Scanner sc = new Scanner(System.in);

		int numero;

		do {
			System.out.println("Introduzca un n�mero");
			numero = sc.nextInt();
			if (numero >= 0) {
				System.out.println("El n�mero " + numero + " es positivo.");
			} else if (numero < 0) {
				System.out.println("El n�mero " + numero + " es negativo.");
			}

		} while (numero != 0);
	}
}
