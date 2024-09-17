package statics;

public class Calculadora {

	// Como no esta declarado como static, este método pertenece a los objetos de esta clase que se creen y no pertenece a la clase, es decir, cada objeto de esta clase que se cree va a tener su propio método "suma"
	int suma(int x, int y) {
		return x + y;
	}
	
	// Este método, como es static, pertenece a la clase y no a los objetos de esta clase y, por lo tanto, accedemos a él, o lo usamos, directamente a través de la clase sin necesidad de tener objetos de esta clase creados
	static int suma2(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		//System.out.println(suma(5,5)); // Error: Como "suma" es un método que pertenece a los objetos de esta clase, no se puede usar directamente en métodos static, ya que estos métodos static pertenecen a la clase y no a los objetos
		Calculadora c = new Calculadora();
		System.out.println(c.suma(5,5)); // Correcto porque accedemos a "suma" a través del objeto "c" y no accedemos a "suma" directamente
		System.out.println(Calculadora.suma2(7,5)); // Correcto porque el método "suma2" pertenece a la clase al ser declarado como static
		System.out.println(suma2(7,5)); // También es correcto porque el método "suma2" pertenece a la clase al ser declarado como static y, como este método "main" también es static y está definido dentro de la clase Calculadora, podemos invocarlo directamente
	}
}
