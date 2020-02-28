package biblioteca;

public class Biblioteca {

	public static void main(String[] args) {
		
		Libro l1, l2, l3;
		
		l1= new Libro("The Caves of Steel", "Isaac Asimov");
		l2= new Libro("El lazarillo de Tormes");
		l3=new Libro("La vuelta al mundo en 80 días", "Julio Verne");
		
		l1.mostrar();
		l2.mostrar();
		l3.mostrar();
		l1.prestamo();
		l2.prestamo();
		l3.prestamo();

	}

}
