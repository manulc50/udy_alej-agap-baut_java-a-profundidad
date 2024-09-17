package java8.optional;

import java.util.Optional;

// Para evitar posibles NullPointerExceptions, es útil usar y manejar la clase Optional
// Es decir, si, por ejemplo, un método devuelve un null como resultado, es fácil que un programador no maneje bien ese null provocando excepciones de tipo NullPointerException
// Sin embargo, si este método devuelve un Optional en lugar de null, el programador está obligado a manejar este Optional evitando, de esta manera, NullPointerExceptions

public class PruebaOptional {
	private static String[] nombres = {"Alex", "raidentrance", "devs4j"};
	
	// Este método puede devolver un valor nulo, o null. Por esta razón, podemos usar la clase Optional y, en lugar, de devolver un String, podemos devolver un Optional<String>
	/*public static String buscarPorNombre(String nombre) {
		for(String nomb: nombres) {
			if(nomb.equals(nombre))
				return nomb;
		}
		return null;	
	}*/
	
	public static Optional<String> buscarPorNombre(String nombre) {
		for(String nomb: nombres) {
			if(nomb.equals(nombre))
				return Optional.of(nomb);
		}
		return Optional.empty(); // Este método ya no devuelve un valor nulo o null
	}
	
	public static void main(String[] args) {
		//System.out.println(buscarPorNombre("Alex").toUpperCase()); // No hay problema, devuelve "ALEX"
		//System.out.println(buscarPorNombre("Pedro").toUpperCase()); // Problema, devuelve una excepción de tipo  NullPointerException
		
		// Solución a posibles NullPointerExceptions; usar la Clase Optional y manejarla
		Optional<String> resultado = buscarPorNombre("Alex");
		if(resultado.isPresent())
			System.out.println(resultado.get().toUpperCase());
		else
			System.out.println("No se encontró el nombre");
		
		// Manera resumida del bloque de código anterior
		// Si el Optional que devuelve el método "buscarPorNombre" está vacío, nombre="Nombre por defecto". En caso contrario, nombre="Pepe"
		String nombre = buscarPorNombre("Pepe").orElse("Nombre por defecto");
		System.out.println(nombre);
		
		// Usando Optional, también podemos lanzar exceptiones en caso de que el Optional esté vacío
		// Si el Optional que devuelve el método "buscarPorNombre" está vacío, lanza una excepción de tipo IllegalArgumentException con el texto "No se encontró el nombre". En caso contrario, value="Pepe"
		String value = buscarPorNombre("Pepe").orElseThrow(() -> new IllegalArgumentException("No se encontró el nombre"));
		System.out.println(value);
	}
}
