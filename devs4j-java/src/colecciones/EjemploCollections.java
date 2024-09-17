package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// La clase java.util.Collections contiene un conjunto de métodos static, o estáticos, útiles para trabajar con colecciones

public class EjemploCollections {
	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		// Se mantiene el orden de los elementos a medida que se insertan en el ArrayList
		nombres.add("Pepe");
		nombres.add("Alex");
		nombres.add("Juan");
		System.out.println(nombres);
		// Ordena los elementos del ArrayList siguiendo un orden natural de Strings o candenas de texto
		Collections.sort(nombres);
		System.out.println(nombres);
		// Devuelve el índice del ArrayList donde se encuentra el elemento localizado
		int index = Collections.binarySearch(nombres, "Alex"); // Este método sólo funciona si los elementos de la colección están ordenados previamente en orden ascendente
		System.out.println(nombres.get(index));
	}
}
