package primero;

import java.util.Scanner;

public class Nota {
	
	public static void main(String[] args){

	
	double nota;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduzca la nota del alumno");
	nota=sc.nextDouble();
	
	if (nota < 5) {
		  System.out.println("El alumno est� suspenso, solo ha sacado "+nota);
		} else if(nota>=5 && nota<=8.5){
		  System.out.println("El alumno est� aprobado, ha sacado un  "+nota);
		}else{
			System.out.println("El alumno tiene un sobresaliente, ha sacado un "+nota);
		}
}
}
