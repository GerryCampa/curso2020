package biblioteca;

public class Libro {

	// propiedades
	private String titulo;
	private String autor;
	private boolean prestado;

	// constructor

	public Libro(String a, String b) {
		this.titulo = a;
		this.autor = b;
		this.prestado = false;

	}
	// constructor 2

	public Libro(String a) {
		this.titulo = a;
		this.autor = null;
		this.prestado = false;
	}

	// m�todo pr�stamo
	public void prestamo() {
		if (this.prestado == true) {
			System.out.println("EL libro est� en pr�stamo. Espera unos d�as");

		} else {
			this.prestado = true;
			System.out.println("EL libro " + this.titulo + " lo lleva en pr�stamo");
		}
	}

	// m�todo devoluci�n
	public void devoluci�n() {
		if (this.prestado == false) {
			System.out.println("No puede devolver el libro " + this.titulo + " porque no est� en pr�stamo");
		} else {
			prestado = false;
			System.out.println("Has devuelto el libro " + this.titulo);

		}
	}

	public void mostrar() {
		System.out.println(
				"Datos del libro:" + this.titulo + "\nAutor:" + this.autor + "\nPrestado:" + this.prestado);
	}
}