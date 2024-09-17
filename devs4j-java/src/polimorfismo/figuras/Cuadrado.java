package polimorfismo.figuras;

// La clase Cuadrado no implementa la interfaz Dibujable porque se ha decidido, como regla de negocio, que un cuadrado no se puede dibujar

public class Cuadrado extends Figura{
	
	private double lado;

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	// Sobrescribimos el método "calcularArea" de la clase padre Figura para implementar el área de un cuadrado
	@Override
	public double calcularArea() {
		return lado * lado;
	}
}
