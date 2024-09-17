package arreglos;

// Las enumeriaciones son una serie de constantes agrupadas en un contexto que se comporta como una clase, es decir, las enumeraciones pueden tener sus propios constructores, sus propio atributos y sus propios métodos

enum SaborPalomitas {
	// Cada vez que se crea una enumeración, se invoca al constructor privado de esta clase con unos valores correspondientes al tipo de enumeración 
	CHILE("Chile", 20.0f), MANTEQUILLA("Mantequilla",30.0f), QUESO("Quesito", 35.0f);
	
	private String nombreDeVenta;
	private float precio;
	
	private SaborPalomitas(String nombreDeVenta, float precio) {
		this.nombreDeVenta = nombreDeVenta;
		this.precio = precio;
	}

	public String getNombreDeVenta() {
		return nombreDeVenta;
	}

	public float getPrecio() {
		return precio;
	}
	
};

public class EjemploEnumeraciones {
	public static void main(String[] args) {
		SaborPalomitas queso = SaborPalomitas.QUESO;
		System.out.println(queso.name());
		System.out.println(queso.getNombreDeVenta());
		System.out.println(queso.getPrecio());
	}
}
