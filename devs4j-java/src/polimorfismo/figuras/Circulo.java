package polimorfismo.figuras;

// Una clase que implemente una interfaz está obligada a implementar todos sus métodos

public class Circulo extends Figura implements Dibujable{

	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	// Sobrescribimos el método "calcularArea" de la clase padre Figura para implementar el área de un circulo
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	// Sobrescribimos este método de la interfaz Dibujable para implementarlo
	@Override
	public void dibujar() {
		System.out.println("Dibujando un circulo");
		
	}
	
}
