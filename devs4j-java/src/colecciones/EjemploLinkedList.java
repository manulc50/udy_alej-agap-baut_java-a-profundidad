package colecciones;

import java.util.LinkedList;

// LinkedList es una implementación de una lista doblemente enlazada
// Su rendimiento es mejor que un ArrayList cuando se tiene que agregar o eliminar elementos, pero es peor  que un ArrayList cuando se quiere obtener o modificar un elementos
// LinkedList implementa también la interfaz Queue y, por lo tanto, se puede usar también como una estructura de tipo FIFO(First In - First Out), es decir, se puede usar también como una cola

public class EjemploLinkedList {
	public static void main(String[] args) {
		// LinkedList que almacena cualquier tipo de objeto
		LinkedList<Object> lista1 = new LinkedList<Object>();
		lista1.add("raidentrance");
		lista1.add(5);
		lista1.add(Boolean.valueOf(true));
		System.out.println(lista1);
		
		// LinkedList que almacena objetos de tipo String
		LinkedList<String> lista2 = new LinkedList<String>();
		lista2.add("raidentrance");
		lista2.add("devs4j");
		lista2.add("alex");
		System.out.println(lista2);
		
		// Algunos métodos específicos de las colas
		System.out.println(lista2.poll()); // Devuelve el primer elemento de la lista y lo elimina
		System.out.println(lista2);
		System.out.println(lista2.peek()); // Devuelve el primer elemento de la lista pero no lo elimina
		System.out.println(lista2);
		
		System.out.println(lista2.getFirst()); // Devuelve el primer elemento de la lista sin eliminarlo
		System.out.println(lista2.getLast()); // Devuelve el último elemento de la lista sin eliminarlo
	}
}
