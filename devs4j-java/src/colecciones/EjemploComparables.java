package colecciones;

import java.util.TreeSet;

// Se utiliza Comparable y Comparator para definir el orden de los elementos en colecciones como TreeSet y TreeMap(En general se utiliza para cualquier tipo de colección que requiera ordenamiento de sus elementos)

// Nota: Como estamos usando la clase personalizada Perro como tipo de dato de los elementos de un TreeSet, ese TreeSet no sabe cómo debe ordenar esos elementos
// Por esta razón y para evitar un error de ejecución como "java.lang.ClassCastException: class colecciones.Perro cannot be cast to class java.lang.Comparable...", se debe realizar una de las siguiente acciones:
// - Nuestra clase Perro debe implementar la interfaz Comparable para especificar cómo se debe realizar las comparaciones de objetos de este tipo
// - Se debe pasar al constructor del TreeSet una clase que implemente la interfaz Comparator con la especificación sobre cómo se debe realizar las comparaciones de objetos de este tipo

// Para este ejemplo, usamos la interfaz Comparable que es implementada en la clase Perro

class Perro implements Comparable<Perro> {
	private String nombre;

	public Perro(String nombre) {
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
		return "Perro [nombre=" + nombre + "]";
	}

	// Implementamos este método de la interfaz Comparable para especificar cómo se debe realizar las comparaciones de objetos de esta clase
	@Override
	public int compareTo(Perro p) {
		return nombre.compareTo(p.getNombre()); // Para que la ordenación sea de manera ascendente
		//return p.getNombre().compareTo(nombre); // Para que la ordenación sea de manera descendente
	}
	
}

public class EjemploComparables {
	public static void main(String[] args) {
		// TreeSet que almacena objetos de tipo Perro
		TreeSet<Perro> set = new TreeSet<>();
		// A media que se agregan elementos a un TreeSet, realiza una ordenación de esos elementos a partir de nuestra implementación de la interfaz Comparable dentro de la clase Perro
		set.add(new Perro("Boby"));
		set.add(new Perro("Boby")); // No lo agrega porque no se permite elementos duplicados
		set.add(new Perro("Rocky"));

		System.out.println(set);
}
}
