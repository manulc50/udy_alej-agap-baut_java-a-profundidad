package threads.producersconsumers;

import java.util.LinkedList;

// Esta clase representa un recurso compartido
public class Devs4jResource {
	private LinkedList<Integer> resources = new LinkedList<Integer>();
	
	// Usamos la palabra reservada "synchronized" para asegurarnos de que sólo un hilo consumidor puede acceder al recurso compartido al mismo tiempo
	public synchronized int consume() throws InterruptedException {
		// Mientras no haya valores en el recurso compartido, los hilos consumidores deben esperar. Para ello, usamos el método "wait" de la clase Object
		while(resources.size() <= 0)
			// Lo que realmente hace este método es interrumpir, o pausar, la ejecución del hilo que lo invoca hasta que reciba una notificación para reanudar su ejecución
			wait(); // Este método de la clase Object puede producir una excepción InterruptedException que es de tipo Checked
		// Este método devuelve el primer elemento de la lista y lo elimina
		return resources.poll();
	}
	
	// Usamos la palabra reservada "synchronized" para asegurarnos de que sólo un hilo productor puede acceder al recurso compartido al mismo tiempo
	public synchronized void produce(int value) {
		// Este método añade un elemento al final de la lista
		resources.offer(value);
		// Como en este punto del método ya hay valores en el recurso compartido, usamos el método "notifyAll" de la clase Object para notificar a los hilos consumidores que están en estado de espera(aquellos que han ejecutado el método "wait" previamente) que ya pueden consumir
		// Lo que hace realmente este método es volver a reanudar la ejecución de aquellos hilos que estaban previamente en estado de espera por haber invocado al método "wait" de la clase Object
		notifyAll();
	}
}
