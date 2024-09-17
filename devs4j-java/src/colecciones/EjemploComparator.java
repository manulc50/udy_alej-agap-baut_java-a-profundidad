package colecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Se utiliza Comparable y Comparator para definir el orden de los elementos en colecciones como TreeSet y TreeMap(En general se utiliza para cualquier tipo de colección que requiera ordenamiento de sus elementos)

// Nota: Como estamos usando la clase personalizada Gato como tipo de dato de los elementos de un TreeSet, ese TreeSet no sabe cómo debe ordenar esos elementos
// Por esta razón y para evitar un error de ejecución como "java.lang.ClassCastException: class colecciones.Gato cannot be cast to class java.lang.Comparable...", se debe realizar una de las siguiente acciones:
// - Nuestra clase Gato debe implementar la interfaz Comparable para especificar cómo se debe realizar las comparaciones de objetos de este tipo
// - Se debe pasar al constructor del TreeSet una clase que implemente la interfaz Comparator con la especificación sobre cómo se debe realizar las comparaciones de objetos de este tipo

// Para este ejemplo, usamos la interfaz Comparator implementada en las clases OrenamientoPorNombre y OrenamientoPorApellido para usarlar en el constructor del TreeSet

class OrenamientoPorNombre implements Comparator<Gato> {

	// Implementamos este método de la interfaz Comparator para especificar cómo se debe realizar las comparaciones de objetos de la clase Gato(Comparación usando el atributo "nombre" de la clase Gato)
	@Override
	public int compare(Gato o1, Gato o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}

class OrenamientoPorApellido implements Comparator<Gato> {

	// Implementamos este método de la interfaz Comparator para especificar cómo se debe realizar las comparaciones de objetos de la clase Gato(Comparación usando el atributo "apellido" de la clase Gato)
	@Override
	public int compare(Gato o1, Gato o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}
	
}

class Gato {
	private String nombre;
	private String apellido;
	
	public Gato(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}

public class EjemploComparator {
	public static void main(String[] args) {
		// TreeSet que almacena objetos de tipo Gato
		// Este TreeSet realiza la ordenación de sus elementos de tipo Gato en función de la implementación de la interfaz Comparator indicada en la clase OrenamientoPorNombre(Comparación usando el atributo "nombre" de la clase Gato) 
		Set<Gato> gatos = new TreeSet<>(new OrenamientoPorNombre());
		// Este TreeSet realiza la ordenación de sus elementos de tipo Gato en función de la implementación de la interfaz Comparator indicada en la clase OrenamientoPorApellido(Comparación usando el atributo "apellido" de la clase Gato)
		//Set<Gato> gatos = new TreeSet<>(new OrenamientoPorApellido());
		// A media que se agregan elementos a un TreeSet, realiza una ordenación de esos elementos a partir de nuestra implementación de la interfaz Comparator en la clase OrenamientoPorNombre o en la clase OrenamientoPorApellido
		gatos.add(new Gato("Becquer", "Chucho"));
		gatos.add(new Gato("Becquer", "Chucho")); // No lo agrega porque no se permite elementos duplicados
		gatos.add(new Gato("Ozzy", "López"));
		gatos.add(new Gato("Pili", "Kinini"));
		System.out.println(gatos);
	}
}
