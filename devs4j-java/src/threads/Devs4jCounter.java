package threads;

// Una de las formas de crear hilos es mediante una clase que implemente la interfaz Runnable y su método "run" con la tarea que deseamos ejecutar en esos hilos
// La otra manera que exite de crear hilos es mediante una clase que herede la clase Thread sobrescribiendo su método "run" con la tarea que deseamos ejecutar en esos hilos
class Counter implements Runnable {
	private int value;
	
	public Counter(int value) {
		this.value = value;
	}
	
	@Override
	public void run() {
		// El método estático "currentThread" de la clase Thread nos da el hilo en ejecución y el método "getState" de ese hilo en ejecución nos de su estado del ciclo de vida de un hilo
		System.out.printf("Estado: %s\n",Thread.currentThread().getState());
		for(int i = value; i >= 0; i--) {
			// El método estático "currentThread" de la clase Thread nos da el hilo en ejecución y el método "getName" de ese hilo en ejecución nos da su nombre
			System.out.printf("%s, valor: %d\n", Thread.currentThread().getName() ,i);
			try {
				// Interrumpimos, o pausamos, la ejecución del hilo 1000 ms para poder ver bien la concurrencia de hilos cuando hay varios de ellos creados
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Devs4jCounter {
	public static void main(String[] args) throws InterruptedException {
		Thread hilo1 = new Thread(new Counter(10), "Hilo 1");
		Thread hilo2 = new Thread(new Counter(20), "Hilo 2");
		
		// Mostramos por consola los estados del ciclo de vida de un hilo de los hilos "hilo1" e "hilo2" en este momento
		System.out.printf("Estado: %s\n",hilo1.getState());
		System.out.printf("Estado: %s\n",hilo2.getState());
		
		// Cuando ejecutemos hilos, no se debe invocar a su método "run" porque, de esa manera, los hilos se ejecutan de manera síncrona y no de forma concurrente
		// Es decir, en este caso, se ejecutaría toda la tarea del hilo "hilo1" y después de ejecutaría toda la tarea del hilo "hilo2"
		//hilo1.run();
		//hilo2.run();
		
		// Para ejecutar los hilos de manera concurrente, que es la forma correcta de ejecutarlos, se debe invocar a sus métodos "start"
		hilo1.start();
		hilo2.start();
		
		// El método "Join" de un hilo interrumpe la ejecución hasta que las tareas de ese hilo hayan finalizado
		// Por lo tanto, en este momento de la ejecución de la aplicación, se realiza una pausa hasta que las tareas de los hilos "hilo1" e "hilo2" finalicen
		hilo1.join();
		hilo2.join();
		
		// Volvemos a mostrar por consola los estados del ciclo de vida de un hilo de los hilos "hilo1" e "hilo2" en este momento
		System.out.printf("Estado: %s\n",hilo1.getState());
		System.out.printf("Estado: %s\n",hilo2.getState());
		
		// Error: Un hilo que ha finalizado su ejecución no se puede volver a iniciar
		// En este punto de la aplicación sabemos que los hilos "hilo1" e "hilo2" han finalizado sus ejecuciones porque previamente hemos invocado a sus métodos "join"
		//hilo1.start();
		//hilo2.start();
	}
}
