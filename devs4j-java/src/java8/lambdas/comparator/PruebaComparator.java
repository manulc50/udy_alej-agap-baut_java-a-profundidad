package java8.lambdas.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaComparator {
	public static void main(String[] args) {
		// Sin usar lambdas
		// Compara personas en función de su nombre de menor a mayor
		//Comparator<Persona> comparator = new NombrePersonaComparator();
		
		// Sin usar lambdas y usando clases anónimas
		// Como Comparator es una interfaz, podemos implementar usando clases anónimas
		// Compara personas en función de su edad de menor a mayor
		/*
		Comparator<Persona> comparator = new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getEdad().compareTo(o2.getEdad());
			}
			
		};*/
		
		// Usando funciones lambda
		// Como la interfaz Comparator es una interfaz funcional(aquellas que sólo tiene un método sin implementar), podemos usar funciones lambda para implementarla
		// Compara personas en función de su apellido de menor a mayor
		Comparator<Persona> comparator = (Persona p1, Persona p2) -> p1.getApellido().compareTo(p2.getApellido());
		
		// Creamos un TreeSet de tipo Persona y le pasamos nuestro comparador de tipo NombrePersonaComparator
		Set<Persona> personas = new TreeSet<Persona>(comparator);
		
		personas.add(new Persona("Alex", "Bautista", 32));
		personas.add(new Persona("Juan", "Lopez", 22));
		personas.add(new Persona("Zizu", "Mendez", 67));
		personas.add(new Persona("Arturo", "Sanchez", 54));
		
		// Muestra por consola los datos de los objetos Persona contenidos en el TreeSet "personas" ordenados en función del atributo "nombre" de cada objeto Persona de menor a mayor
		// Esta ordenación es debido a nuestro comparador de tipo NombrePersonaComparator
		System.out.println(personas); // Se invoca al método "toString" del TreeSet "personas" que, a su vez, se invoca a los métodos "toString" de cada objeto Persona contenido en ese TreeSet
	}
}
