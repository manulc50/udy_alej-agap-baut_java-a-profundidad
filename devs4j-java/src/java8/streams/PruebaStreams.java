package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}

public class PruebaStreams {
	public static void main(String[] args) {
		List<Persona> personas = Arrays.asList(new Persona("Juan", 10), new Persona("Pepe", 22),
				new Persona("Oscar", 43), new Persona("María", 18), new Persona("Martín", 76));
		
		// Con programación imperativa(clásica) - Problema: Implementación larga, mucho código
		/*List<Persona> result = new ArrayList<Persona>();
		int count = 0;
		for(Persona persona: personas) {
			if(persona.getEdad() >= 18) {
				result.add(persona);
				count++;
			}
			if(count == 3)
				break;
		}*/
		
		// Usando streams con clases anónimas
		// Como Predicate es una interfaz, podemos implementarla usando clases anónimas
		/*List<Persona> result = personas.stream().filter(new Predicate<Persona>() {

			@Override
			public boolean test(Persona p) {
				return p.getEdad() >= 18;
			}
			
		})
		.limit(3)
		.collect(Collectors.toList());*/
		
		// Usando streams con programación funcional - Mucho menos código en comparación con la programación imperativa(clásica)
		// El método "filter" recibe una implementación de la interfaz Predicate y, como dicha interfaz es una interfaz funcional(aquellas que sólo tienen un método sin implementar), podemos usar funciones lambda para su implementación
		List<Persona> result = personas.stream().filter(p -> p.getEdad() >= 18).limit(3).collect(Collectors.toList());
		
		System.out.println(result);
	}
	
	
}
