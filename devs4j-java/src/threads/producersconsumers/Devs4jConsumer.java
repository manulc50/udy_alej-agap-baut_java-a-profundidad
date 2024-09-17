package threads.producersconsumers;

import java.util.Random;

// Esta clase se corresponde con un hilo consumidor de valores del recurso compartido representado por la clase Devs4jResource
public class Devs4jConsumer extends Thread{
	private Devs4jResource resource;

	public Devs4jConsumer(Devs4jResource resource, String name) {
		super(name); // Establecemos el nombre del hilo
		this.resource = resource;
	}

	@Override
	public void run() {
		// Bucle que se ejecuta siempre consumiendo valores del recurso compartido
		while(true) {
			try {
				int value = resource.consume();
				// El método "getName" nos lo proporciona la clase padre Thread y nos da el nombre del hilo 
				System.out.printf("%s consume %d\n", getName(), value);
				// Interrumpimos, o pausamos, la ejecución de este hilo durante un tiempo en milisegundos aleatorio comprendido entre 0 y 200ms
				Thread.sleep(new Random().nextInt(200)); // Puede producir una excepción InterruptedException que es de tipo Checked
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
