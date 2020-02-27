package bucles;

import java.util.Scanner;

public class EjemploWhile {

	public static void main(String[] args) {
		// TEjemplo de bucle while.Pedir numeros hasta introducir cero
		//decir si son positivos o negativos

		Scanner sc=  new Scanner(System.in);
		int numero;
		System.out.println("Introduzca un numero");
		numero=sc nextInt();
		
		while(numero!=0){
			if(numero>=0){
				System.out.println("El número "+numero+" es positivo.");
			}else{
				System.out.println("El número "+numero+" es negativo.");
			}
		}
		
	}

}
