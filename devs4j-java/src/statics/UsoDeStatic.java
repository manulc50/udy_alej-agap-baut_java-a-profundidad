package statics;

public class UsoDeStatic {
	public static void main(String[] args) {
		// Math es una clase de Java que contiene muchos métodos static que realizan funciones matemáticas
		System.out.println(Math.sqrt(25)); // Correcto porque el método "sqrt" es static y pertenece a la clase Math(no a los objetos de esta clase) y, además, estamos invocando a este método dentro del método "main" que también es static
		//Math math = new Math(); // Error porque no se permite crear objetos de esta clase Math al tener su constructor como private. De esta manera, todos los métodos y atributos declarados en esta clase Math son static
	}
}
