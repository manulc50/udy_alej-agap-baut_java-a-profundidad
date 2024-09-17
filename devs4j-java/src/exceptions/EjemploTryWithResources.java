package exceptions;

class RecursoDevs4j implements AutoCloseable{

	void foo() {
		System.out.println("Foo");
	}
	
	@Override
	public void close() {
		System.out.println("Liberando recursos");	
	}
	
}

public class EjemploTryWithResources {
	public static void main(String[] args) {
		
		// Bloque try-catch-finally con liberación manual de recursos en el bloque finally
		try {
			// Imaginemos que aquí hay un código para acceder a una base de datos
		}
		catch (Exception e) {
			// Código en caso de error
		}
		finally {
			// Cerrar la conexión con la base de datos
		}
		
		// Si una clase implementa la interfaz AutoCloseable, no hace falta liberar de forma manual los recursos de esta clase en el bloque finally como en el bloque try-catch-finally anterior
		// Es decir, tanto si algo ha salido bien como si ha salido mal, si en el try se usa una clase que implementa la interfaz AutoCloseable, al final se invoca de manera automáticamente al método "close" de esa clase liberándose los recursos
		// Para ello, hay que crear el rescurso de la siguiente manera:
		try(RecursoDevs4j recurso = new RecursoDevs4j()) {
			recurso.foo();
		}
	}
}
