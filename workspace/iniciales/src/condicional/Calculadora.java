package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Realizar un programa que pida dos numeros y un operador y devuelva el
		// resultado de la operacion.. Usar switch
		// La resta y la division tienen q ser entre el n�mero mayor y el n�mero
		// menor

		double numero1;
		double numero2;
		String operador;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el tipo de operaci�n");
		operador = sc.nextLine();
		System.out.println("Introduzca el primer n�mero");
		numero1 = sc.nextDouble();
		System.out.println("Introduzca el segundo n�mero");
		numero2 = sc.nextDouble();

		switch (operador) {

		case "+":
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + (numero1 + numero2));
			break;
		case "*":
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + (numero1 * numero2));
			break;
		case "-":
			if (numero1 < numero2) {
				System.out.println("La resta de " + numero2 + " y " + numero1 + " es " + (numero2 - numero1));
			} else {
				System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + (numero1 - numero2));
			}
			break;
		case "/":
			if (numero1 < numero2) {
				System.out.println("La divisi�n de " + numero2 + " y " + numero1 + " es " + (numero2 / numero1));
			} else {
				System.out.println("La divisi�n de " + numero1 + " y " + numero2 + " es " + (numero1 / numero2));
			}
			break;

		default:
			System.out.println("Has introducido una operaci�n incorrecta");

		}
	}
}
