package colecciones;

import java.util.Vector;

// Vector tiene una funcionalidad similar a un ArrayList con la diferencia de que Vector es Thread Safe
// Thread Safe quiere decir que, si se usa un Vector en un ambiente de hilos, te garantiza que sólo un hilo puede manipular(añadir, eliminar, etc...) ese Vector al mismo tiempo
// Para ello, sus métodos de manipulación están definidos usando la palabra reservada "synchronized"

public class EjemploVector {
	public static void main(String[] args) {
		// Vector que almacena objetos de tipo String
		Vector<String> v1 = new Vector<>();
		v1.add("Alex");
		System.out.println(v1);
	}
}
