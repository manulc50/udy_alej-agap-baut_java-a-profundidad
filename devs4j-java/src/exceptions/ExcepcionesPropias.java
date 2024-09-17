package exceptions;

// Cuando ninguna excepción de Java representa nuestra lógica de negocio, podemos definir nuestras propias excepciones

// Esta clase representa nuestra excepción personalizada de tipo Unchecked
// Para que sea de tipo Unchecked, heredamos la clase RuntimeException
// Si se desea que nuestra excepción sea de tipo Checked, en lugar de heredar la clase RuntimeException, heredamos la clase Exception que es de tipo Checked
class TituloIncorrectoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4037539706838423051L;
	
	// Constructor con el parámetro de entrada "error" de tipo String para poder pasar un mensaje de error personalizado
	public TituloIncorrectoException(String error) {
		super(error);
	}
	
}

public class ExcepcionesPropias {
	
	/*
	 * Regla de negocio:
	 * Si el nombre del título del curso no está en mayúsculas, es incorrecto
	 */
	static void crearCurso(String titulo) {
		if(!titulo.toUpperCase().equals(titulo))
			throw new TituloIncorrectoException("El título del curso debe estar en mayúsculas");
			
		System.out.println("Título del curso correcto");
	}
	
	public static void main(String[] args) {
		//crearCurso("JAVA DESDE CERO A PROFUNDIDAD"); // Ejecución correcta
		crearCurso("JAVA DESdE CERO A PROFUNDIDAD"); // Lanza nuestra excepción personalizada TituloIncorrectoException
	}
}
