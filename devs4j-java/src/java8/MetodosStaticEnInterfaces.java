package java8;

// A partir de la versión 8 de Java, las interfaces, además de tener sus métodos abstractos sin implementar, también pueden tener métodos static, o estáticos, implementados
// Nota: Los métodos static, o estáticos, de una interfaz no pueden ser sobrescritos

// También, a partir de la versión 8 de Java, las interfaces pueden implementar métodos default o genéricos
// Los métodos default, o genéricos, son aquellos que tienen una implementación genérica sobre algún tema en concreto
// Si se desea implementar una nueva funcionalidad en alguno de estos métodos default, o genéricos, es posible hacerlo en las clases que implementan la interfaz donde están definidos dichos métodos
// Nota: Los métodos default, o genéricos, de una interfaz sí pueden ser sobrescritos

interface Follower {
	static void print() {
		System.out.println("Esto es un metodo static en una interfaz");
	}
	
	void unfollow();
	
	default void follow() {
		System.out.println("Esto es un método genérico para seguir a alguien");
	}
}

class TwitterFollower implements Follower {

	// Implementamos el método abstracto(sin implementar) de la interfaz Follower
	@Override
	public void unfollow() {
		System.out.println("Unfollow de Twitter");
	}

	// Sobrescribimos este método default, o genérico, de la interfaz Follower
	@Override
	public void follow() {
		System.out.println("Follow de Twitter");
	}
	
}

public class MetodosStaticEnInterfaces {
	public static void main(String[] args) {
		Follower.print();
		new TwitterFollower().follow();
	}
}
