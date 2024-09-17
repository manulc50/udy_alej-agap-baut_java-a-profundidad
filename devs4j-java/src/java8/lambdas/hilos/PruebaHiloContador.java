package java8.lambdas.hilos;

public class PruebaHiloContador {
	public static void main(String args[]) {
		// Sin usar lambdas
		//HiloContador hiloContador = new HiloContador();
		
		// Sin usar lambdas y usando clases anónimas
		// Como Runnable es una interfaz, podemos implementarla usando clases anónimas
		/*Runnable hiloContador = new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};*/
		
		// Usando funciones lambda
		// Como Runnable es una interfaz funcional(aquellas que sólo tiene un método sin implementar), podemos usar funciones lambda para implementarla
		Runnable hiloContador = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(hiloContador);
		thread.start();
	}
}
