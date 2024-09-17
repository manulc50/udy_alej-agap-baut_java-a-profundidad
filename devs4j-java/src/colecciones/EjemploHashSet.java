package colecciones;

import java.util.HashSet;

// HashSet es una colección que se utiliza cuando se necesita un conjunto de elementos que no estén duplicados y no importe el orden de estos elementos respecto a su momento de inserción

public class EjemploHashSet {
	public static void main(String[] args) {
		// HashSet que almacena objetos de tipo String
		HashSet<String> nombres = new HashSet<String>();
		nombres.add("raidentrance");
		nombres.add("raidentrance"); // No lo agrega porque no se permite elementos duplicados
		nombres.add("devs4j");
		nombres.add(null);
		System.out.println(nombres);
	}
}
