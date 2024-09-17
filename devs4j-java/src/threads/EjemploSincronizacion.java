package threads;

// Esta clase representa un recurso estático que va a ser accedido, o consumido, por varios hilos
class SyncCounter {
	static int counter = 10;
	
	// Como este método es usado por los hilos para decrementar el valor del contador, que es el recurso compartido, y como los hilos se ejcutan de manera concurrente, para evitar que un hilo acceda a este recurso compartido mientras otro hilo está decrementando su valor, tenemos que usar la palabra reservada "synchronized" 
	// Dicho de otra manera, al usar la palabra reservada "synchronized" nos aseguramos de que sólo un hilo consuma el recurso compartido al mismo tiempo
	// De esta manera, evitamos problemas de sincronización
	public synchronized static void decrement() {
		counter--;
		System.out.println(counter);
	}
}

// Una de las formas de crear hilos es mediante una clase que herede la clase Thread sobrescribiendo su método "run" con la tarea que deseamos ejecutar en esos hilos
// La otra manera que exite de crear hilos es mediante una clase que implemente la interfaz Runnable
class Decrementor extends Thread{

	// La tarea del hilo consiste en decrementar el valor del recurso compartido "counter", contenido en la clase SyncCounter, a través del método estático "decrement"
	@Override
	public void run() {
		System.out.println("Decrementando SyncCounter");
		SyncCounter.decrement();
	}
	
	
}

public class EjemploSincronizacion {
	public static void main(String[] args) {
		// Bucle que crea 10 hilos de tipo Decrementor y los ejecuta de manera concurrente
		for(int i = 0; i < 10; i++)
			new Decrementor().start();
	}
}
