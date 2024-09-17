package innerclasses;


class Externa {
	void foo() {
		System.out.println("Foo");
	}
	
	// Clase interna regular
	class Interna {
		void bar() {
			System.out.println("Bar");
		}
	}
}

public class ClasesInternasRegulares {
	public static void main(String[] args) {
		Externa ex = new Externa();
		ex.foo();
		// Esta es la manera de crear un objeto de una clase interna(Primero es necesario crear un objeto de la clase externa)
		Externa.Interna in = ex.new Interna();
		in.bar();
	}
}
