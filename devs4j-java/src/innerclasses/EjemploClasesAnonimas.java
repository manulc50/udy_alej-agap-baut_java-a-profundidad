package innerclasses;

class EjemploAnonima {
	void foo() {
		System.out.println("Foo");
	}
}

public class EjemploClasesAnonimas {
	public static void main(String[] args) {
		// Crea un objeto de la clase EjemploAnonima y a ese objeto se le asocia una clase anónima(Es anónima porque no tiene nombre)
		// Esta clase anónima, por lo tanto, va a heredar la clase EjemploAnonima ya que es la clase del objeto "obj"
		// Como la clase anónima hereda la clase EjemploAnonima, podemos sobrescribir sus métodos si así lo deseamos
		EjemploAnonima obj = new EjemploAnonima() {
			
			// En este caso, usamos esta clase anónima para sobrescribir el método "foo" de la clase EjemploAnonima que es la clase del objeto "obj"
			@Override
			void foo() {
				System.out.println("Bar");
			}
		};
		obj.foo();
	}
}
