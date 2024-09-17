package exceptions;

// Un try puede tener muchos catch pero solo uno de ellos se ejecutará
// Se deben colocar los catch de la excepción más específica a la más general
// El bloque finally se ejecutará incluso si en el catch o en el try existe un sentencia return
// La única forma de evitar que se ejecute un bloque finally es declarando un System.exit(...);

public class ReglasTryCatchFinally {
	
	static void test() {
		try {
			System.out.println("Bloque try");
			System.exit(0); // Evita que se ejecute el bloque finally
			//return; // Esta sentencia return; no evita que se ejecute el bloque finally
		}
		finally {
			System.out.println("Bloque finally");
		}
	}
	
	public static void main(String[] args) {
		test();
		
		// Estructuras correctas de bloques try-catch-finally
		// Bloque con try y catch
		try {
			
		}
		// La captura de excepciones se hace empezando por la excepción más específica y terminando con la más general
		catch(NullPointerException e) {
			
		}
		catch(RuntimeException e) {
			
		}
		catch(Exception e) {
			
		}
		catch(Throwable e) {
			
		}
		
		// Bloque con try y finally
		try {
			
		}
		finally {
			
		}
		
		// Bloque con try, catch y finally
		try {
			
		}
		catch(Exception e) {
			
		}
		finally {
			
		}
	}
}
