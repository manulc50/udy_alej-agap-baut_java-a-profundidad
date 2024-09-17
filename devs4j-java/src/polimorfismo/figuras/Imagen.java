package polimorfismo.figuras;

// La clase Imagen no representa una figura y, por esta razón, no hereda la clase Figura, pero implementa la interfa Dibujable porque, por reglas de negocio, se decide que una imagen sí se puede dibujar

public class Imagen implements Dibujable{

	// Sobrescribimos este método de la interfaz Dibujable para implementarlo
	@Override
	public void dibujar() {
		System.out.println("Dibujando una imagen");
		
	}


}
