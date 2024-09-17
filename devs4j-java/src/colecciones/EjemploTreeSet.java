package colecciones;

import java.util.TreeSet;

// TreeSet es una colección ordenada de elementos e implementa una estructura de tipo árbol rojo-negro
// Garantiza que los elementos son únicos(no permiten elementos duplicados) y están ordenados de manera ascendente de acuerdo a un orden natural

public class EjemploTreeSet {
	public static void main(String[] args) {
		// TreeSet que almacena objetos de tipo String
		TreeSet<String> set = new TreeSet<>();
		// A media que se agregan elementos a un TreeSet, realiza una ordenación natural por defecto de esos elementos
		set.add("raidentrance");
		set.add("raidentrance"); // No lo agrega porque no se permite elementos duplicados
		set.add("zizu");
		set.add("alex");
		set.add("jaime");
		System.out.println(set); // Muestra [alex, jaime, raidentrance, zizu] debido a la ordenación natural que realiza por defecto
	}
}
