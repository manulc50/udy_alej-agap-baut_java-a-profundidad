package polimorfismo.figuras;

// Clase para probar el polimorfismo en herencia

public class PruebaFiguras {
	
	void imprimirArea(Figura figura) {
		System.out.println("El color de la figura es " + figura.getColor() + " y tiene un área de " +  figura.calcularArea());
	}

	public static void main(String args[]) {
		PruebaFiguras pruebaFiguras = new PruebaFiguras();
		pruebaFiguras.imprimirArea(new Circulo("Rojo", 10.0));
		pruebaFiguras.imprimirArea(new Cuadrado("Verde", 125.2));
		pruebaFiguras.imprimirArea(new Rectangulo("Azul", 20, 10));
	}
}
