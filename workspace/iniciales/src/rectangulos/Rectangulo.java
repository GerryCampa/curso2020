package rectangulos;

public class Rectangulo {
	// definir atributos propiedades
	public double base;
	public double altura;

	// crear constructor
	public Rectangulo(double a, double b) {
		this.base = b;
		this.altura = a;

	}

	// m�todos

	public double perimetro() {
		return(2*base+2*altura);

	}

	public double area(){
		return(base*altura);
	}
	
	public void mostrar(){
		
		
		System.out.println("RECT�NGULO \nBASE: "+this.base+"\nALTURA: "+this.altura+"\nPERIMETRO:"+this.perimetro());
	}

	
}
