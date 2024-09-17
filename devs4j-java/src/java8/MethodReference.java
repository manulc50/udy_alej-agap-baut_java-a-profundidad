package java8;

import java.util.Arrays;
import java.util.List;

class StringUtils {
	
	static boolean isUpperCase(String cadena) {
		return cadena.toUpperCase().equals(cadena);
	}
}

class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
}

public class MethodReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("alex", "raidentrance", "juan", "FELIPE");
		
		// Con programación imperativa(clásica)
		for(String name: names) {
			if(StringUtils.isUpperCase(name)) 
				System.out.println(new Persona(name));
		}
		System.out.println();
		
		// Usando streams con programación funcional y Method Reference
		// Podemos usar Method Reference cuando una función lambda simplemente consiste en pasar los argumentos de entrada que recibe a los parámetros de entrada de un método de instancia o de un método static que se está invocando, o bien, pasarlos a un constructor de una clase
		names.stream()
			.filter(StringUtils::isUpperCase) // Uso de Method Reference(sobre métodos static) para simplificar la expresión "name -> StringUtils.isUpperCase(name)"
			.map(Persona::new) // Uso de Method Reference(sobre constructores) para simplificar la expresión "name -> new Persona(name)"
			.forEach(System.out::println); // Uso de Method Reference(sobre métodos de instancia) para simplificar la  expresión "name -> System.out.println(name)"
	}
}
