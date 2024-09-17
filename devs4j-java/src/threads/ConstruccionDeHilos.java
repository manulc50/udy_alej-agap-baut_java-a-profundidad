package threads;

// Una de las formas de crear hilos es mediante una clase que herede la clase Thread sobrescribiendo su método "run" con la tarea que deseamos ejecutar en esos hilos
// La otra manera que exite de crear hilos es mediante una clase que implemente la interfaz Runnable
class Devs4jThread extends Thread {

	public Devs4jThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			// El método "getName" está disponible en la clase padre Thread
			System.out.printf("Hilo %s, índice %d\n", getName(), i);
			try {
				// Interrumpimos, o pausamos, la ejecución del hilo 100 ms para poder ver bien la concurrencia de hilos cuando hay varios de ellos creados
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

public class ConstruccionDeHilos {
	public static void main(String[] args) {
		Devs4jThread hilo1 = new Devs4jThread("Hilo 1");
		Devs4jThread hilo2 = new Devs4jThread("Hilo 2");
		
		// Cuando ejecutemos hilos, no se debe invocar a su método "run" porque, de esa manera, los hilos se ejecutan de manera síncrona y no de forma concurrente
		// Es decir, en este caso, se ejecutaría toda la tarea del hilo "hilo1" y después de ejecutaría toda la tarea del hilo "hilo2"
		//hilo1.run();
		//hilo2.run();
		
		// Para ejecutar los hilos de manera concurrente, que es la forma correcta de ejecutarlos, se debe invocar a sus métodos "start"
		hilo1.start();
		hilo2.start();
		
		// Este mensaje se mostrará por consola antes de la finalización de los hilos "hilo1" e "hilo2" porque estos hilos se ejecutan de manera concurrente
		System.out.println("Fin del programa");
	}
}
