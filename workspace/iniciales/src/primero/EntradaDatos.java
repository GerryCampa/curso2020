package primero;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		double numero2;
		String ciudad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el nombre de su ciudad");
		ciudad=sc.nextLine();
		System.out.println("Introduzca n�mero natural");
		numero1=sc.nextInt();
		System.out.println("Introduzca un n�mero decimal");
		numero2=sc.nextDouble();
		
		
		System.out.println("Has introducido el n�mero "+numero1+ " , el n�mero decimalGi "+numero2+ " y como ciudad "+ciudad);

	}

}
