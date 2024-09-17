package encapsulamiento;

// En el encapsulamiento de una clase, todos sus atributos tienen que ser privados y sólo se pueden acceder a ellos desde fuera usando sus métodos getter y setter
// La encapsulación nos permite evitar que un usuario pueda asignar valores irreales, o que no tienen sentido, directamente a los atributos de una clase
// Porque obligamos al usuario a la única posibilidad de asignar valores a los atributos de una clase a través de sus métodos setter y estos métodos setter pueden tener implementaciones de reglas de negoción que eviten asignar valores irreales o sin sentido

class Examen {
	private float calificacion;
	private int numeroDePreguntas;
	private boolean activo;
	
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	public float getCalificacion() {
		return calificacion;
	}

	public int getNumeroDePreguntas() {
		return numeroDePreguntas;
	}

	public void setNumeroDePreguntas(int numeroDePreguntas) {
		this.numeroDePreguntas = numeroDePreguntas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}

public class PruebaExamen {
	
	public static void main() {
		Examen e = new Examen();
		//e.calificacion = -45; // Ejemplo de una asignación de valor directa a un atributo que no tiene sentido o es irreal 
		e.setCalificacion(9.25f);
	}
}
