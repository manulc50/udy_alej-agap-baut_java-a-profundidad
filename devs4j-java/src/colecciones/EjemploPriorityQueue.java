package colecciones;

import java.util.PriorityQueue;

// PriorityQueue es un tipo de colección que fue agregado en la versión 5 de Java
// Al igual que la colección LinkedList, soporta el comportamiento por defecto de una estructura FIFO(First In, First Out), es decir, el comportamiento de una cola
// PriorityQueue ordena los elementos de acuerdo a una prioridad
// De esta manera, podemos acceder primero a los elementos que tiene una mayor prioridad

public class EjemploPriorityQueue {
	public static void main(String[] args) {
		// PriorityQueue que almacena objetos de tipo Integer
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		// A media que se agregan elementos a una PriorityQueue, realiza una ordenación natural por defecto de esos elementos
		pq1.add(1000);
		pq1.add(200);
		pq1.offer(5); // El método "offer" es equivalente al método "add", es decir, ambos añaden elementos
		pq1.offer(100);
		System.out.println(pq1); // Muestra [5, 100, 200, 1000] debido a la ordenación natural que realiza por defecto
		System.out.println(pq1.peek()); // Devuelve el primer elemento sin eliminarlo
		System.out.println(pq1);
		System.out.println(pq1.poll()); // Devuelve el primer elemento y lo elimina
		System.out.println(pq1);
	}
}
