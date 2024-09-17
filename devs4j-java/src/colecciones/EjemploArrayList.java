package colecciones;

import java.util.ArrayList;

// Un ArrayList internamente maneja un array de objetos para almacenar los elementos
// Cuando se intancia un ArrayList, su array interno tiene una capacidad por defecto de 10 elementos y, a medida que se van agregando elementos, esta capacidad se va incrementando
// Un ArraList tiene una velocidad constante al agregar elementos(sin especificar posiciones) y al obtenerlos
// Un ArrayList no es muy eficiente cuando se tiene que agregar un elemento en una posición especifica o cuando se tiene que remover un elementos

public class EjemploArrayList {
	public static void main(String[] args) {
		// ArrayList que almacena cualquier tipo de objeto
		ArrayList<Object> array1 = new ArrayList<Object>();
		array1.add(1);
		array1.add("String");
		array1.add(new Object());
		System.out.println(array1);
		
		// ArrayList que almacena objetos de tipo String
		ArrayList<String> array2 = new ArrayList<>();
		array2.add("devs4j");
		array2.add("raidentrance");
		array2.add("devs4j");
		array2.add("raidentrance");
		array2.add("devs4j");
		array2.add("raidentrance");
		array2.add("devs4j");
		array2.add("raidentrance");
		array2.add("devs4j");
		array2.add("raidentrance");
		array2.add("devs4j");
		array2.add("raidentrance");
		
		// Añadir un elemento a un ArrayList especificando una posición no es una tarea muy eficiente
		array2.add(5, "Alex");
		
		System.out.println(array2);
	}
}
