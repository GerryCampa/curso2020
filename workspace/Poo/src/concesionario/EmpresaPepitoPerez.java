package concesionario;

import biblioteca.Libro;

public class EmpresaPepitoPerez {

	public static void main(String[] args) {
		// EJECUTABLE. Este archivo es una clase ejecutable.

		// Definir dos objetos
		Coches cocheEmpresaVentas, cocheEmpresaDireccion;

		// Crear dos objetos
		cocheEmpresaVentas = new Coches("Seat", "Panda", "rojo", "5555KKK");
		cocheEmpresaDireccion = new Coches("0000BBB");

		// Invocar metodo para mostrar datos coche de ventas
		// cambiar color del coche de rojo a azul (requiere m�todo expresado en
		// coches.java
		cocheEmpresaVentas.setColor("azul");
		cocheEmpresaVentas.imprimeCoche();

		// Invocar metodo para visualizar ambas matriculas. PROBLEMA las
		// variables son private.
		// Para resolver esto creamos un metodo en coches.java

		System.out.println("La matr�cula del coche de ventas " + cocheEmpresaVentas.getMatricula());
		System.out.println("La matr�cula del coche del jefe " + cocheEmpresaDireccion.getMatricula());

		// crear coche hija del jefe 1234BJY
		Coches cocheHijaJefe = new Coches("1234BJY");

		// El coche sera un BMW SERIE A negro. Asignar esos valores A POSTERIORI
		cocheHijaJefe.setMarca("BMW");
		cocheHijaJefe.setModelo("Clase A");
		cocheHijaJefe.setColor("negro");

		// Mostrar marca y modelo de ese coche
		System.out.println("La marca del coche de la hija del jefe es " + cocheHijaJefe.getMarca() + " y el modelo es "
				+ cocheHijaJefe.getModelo());

	}

}
