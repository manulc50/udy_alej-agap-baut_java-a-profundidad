package java8.lambdas.comparator;

import java.util.Comparator;

public class NombrePersonaComparator implements Comparator<Persona> {

	// Sobrescribimos este método de la interfaz Comparator para que compare los nombres de dos objetos de tipo Persona mediante el método "compareTo" 
	// El método "compareTo" devuelve un número negativo si el nombre de la primera persona es menor que el nombre de la segunda persona, devuelve un número positivo si el nombre de la primera persona es mayor que el nombre de la segunda persona, y devuelve 0 si los nombres de ambas personas son iguales
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
