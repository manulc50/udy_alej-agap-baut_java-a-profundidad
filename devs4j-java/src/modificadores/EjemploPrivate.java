package modificadores;

// Nota: Los atributos privados de una clase sólo son accesibles desde el interior de esa clase
// Nota: Los métodos privados de una clase sólo pueden ser invocados desde el interior de esa clase
// Nota: Podemos definir el constructor de una clase como privado si no queremos que se creen objetos de esa clase

class Prueba {
	
	@SuppressWarnings("unused") // Anotación para que no aparezcan warnings de tipo "unused"(sin usar) con respecto a este atributo
	private String nombre;
	
	// Si no queremos que se generen objetos de esta clase, definimos su constructor como privado
	/*private Prueba() {
		
	}*/
	
	@SuppressWarnings("unused") // Anotación para que no aparezcan warnings de tipo "unused"(sin usar) con respecto a este método
	private void foo() {
		
	}
}

public class EjemploPrivate {

	public static void main(String[] args) {
		@SuppressWarnings("unused") // Anotación para que no aparezcan warnings de tipo "unused"(sin usar) con respecto a este objeto
		Prueba p = new Prueba();
		//p.nombre = "Alex"; // Error: No se puede acceder al atributo "nombre" de la clase Prueba porque es un atributo privado
		//p.foo(); // Error: No se puede invocar al método "foo" de la clase Prueba porque es un método privado
	}
}
