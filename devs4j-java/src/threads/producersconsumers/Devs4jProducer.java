package threads.producersconsumers;

import java.util.Random;

// Esta clase se corresponde con un hilo productor de valores al recurso compartido representado por la clase Devs4jResource
public class Devs4jProducer extends Thread{
	private Devs4jResource resource;

	public Devs4jProducer(Devs4jResource resource, String name) {
		super(name); // Establecemos el nombre del hilo
		this.resource = resource;
	}

	@Override
	public void run() {
		// Bucle que se ejecuta siempre produciendo, o generando, valores al recurso compartido
		while(true) {
			try {
				int value = new Random().nextInt(200);
				// El método "getName" nos lo proporciona la clase padre Thread y nos da el nombre del hilo 
				System.out.printf("%s produce %d\n", getName(), value);
				resource.produce(value);
				// Interrumpimos, o pausamos, la ejecución de este hilo durante un tiempo en milisegundos aleatorio comprendido entre 0 y 300ms
				Thread.sleep(new Random().nextInt(300)); // Puede producir una excepción InterruptedException que es de tipo Checked
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
