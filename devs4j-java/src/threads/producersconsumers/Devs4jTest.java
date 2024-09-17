package threads.producersconsumers;

public class Devs4jTest {
	public static void main(String[] args) {
		// Creamos un recurso compartido representado por la clase Devs4jResource
		Devs4jResource resource = new Devs4jResource();
		
		// Creamos dos hilos consumidores de valores del recurso compartido llamados "Consumer 1" y "Consumer 2"
		Devs4jConsumer consumer1 = new Devs4jConsumer(resource, "Consumer 1");
		Devs4jConsumer consumer2 = new Devs4jConsumer(resource, "Consumer 2");
		
		// Creamos dos hilos productores de valores al recurso compartido llamados "Producer 1" y "Producer 2"
		Devs4jProducer producer1 = new Devs4jProducer(resource, "Producer 1");
		Devs4jProducer producer2 = new Devs4jProducer(resource, "Producer 2");
		
		// Ejecutamos de manera concurrente todos los hilos productores y consumidores
		// Nota: Si ejecutamos esta aplicación y no hay sincronización entre los hilos productores y los hilos consumidores, la aplicación fallará porque se puede dar el caso de que un hilo consumidor consuma un valor del recurso compartido que no existe porque aún ningún hilo productor ha producido, o generado, algún valor a ese recurso compartido
		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();
	}
}
