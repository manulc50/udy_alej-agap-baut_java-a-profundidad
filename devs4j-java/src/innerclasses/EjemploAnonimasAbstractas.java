package innerclasses;

abstract class FiguraAnonima {
	abstract void foo();
}

public class EjemploAnonimasAbstractas {
	public static void main(String[] args) {
		//FiguraAnonima figura = new FiguraAnonima(); // Error: No es posible crear objetos de una clase abstracta porque contiene métodos sin implementar
		// Podemos usar clases anónimas sobre clases abstractas para implementar sus métodos abstractos
		FiguraAnonima figura = new FiguraAnonima() {
			@Override
			void foo() {
				System.out.println("Foo");
				
			}
		};
		figura.foo();
	}
}
