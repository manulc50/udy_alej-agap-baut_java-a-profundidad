package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Podemos usar el método "map" sobre un stream para transformar el tipo de dato de los elementos de un stream en otro tipo de dato

class Alumno {
	private String nombre;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
}

public class EjemploStreamMap {
	public static void main(String[] args) {
		List<Alumno> alumnos = Arrays.asList(new Alumno("Juan"), new Alumno("Pedro"), new Alumno("Marta"));
		
		// Usamos streams y su método "map" para pasar una lista de objetos Persona a una lista de objetos String
		List<String> nombres = alumnos.stream().map(a -> a.getNombre()).collect(Collectors.toList());
		System.out.println(nombres);
		
		// Usamos streams y su método "map" para pasar una lista de objetos String a una lista de objetos Persona
		List<Alumno> alumnos2 = nombres.stream().map(nombre -> new Alumno(nombre)).collect(Collectors.toList());
		System.out.println(alumnos2);
	}
}
