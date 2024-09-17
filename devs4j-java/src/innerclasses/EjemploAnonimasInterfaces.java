package innerclasses;

// Una interfaz es una clase 100% abstracta, es decir, todos sus métodos están sin implementar
interface Jugable {
	void jugar();
}

public class EjemploAnonimasInterfaces {
	public static void main(String[] args) {
		//Jugable j = new Jugable(); // Error: No es posible crear objetos de una interfaz porque todos sus métodos están sin implementar
		// Podemos usar clases anónimas sobre interfaces para implementar sus métodos
		Jugable j = new Jugable() {
			@Override
			public void jugar() {
				System.out.println("Jugando");
				
			}
		};
		
		j.jugar();
	}
}
