package polimorfismo.figuras;

// Una clase que implemente una interfaz está obligada a implementar todos sus métodos

public class Rectangulo extends Figura implements Dibujable{
	private double altura;
	private double base;
	
	public Rectangulo(String color, double altura, double base) {
		super(color);
		this.altura = altura;
		this.base = base;
	}
	
	// Sobrescribimos el método "calcularArea" de la clase padre Figura para implementar el área de un rectangulo
	@Override
	public double calcularArea() {
		return base * altura;
	}

	// Sobrescribimos este método de la interfaz Dibujable para implementarlo
	@Override
	public void dibujar() {
		System.out.println("Dibujando un rectangulo");
		
	}

}
