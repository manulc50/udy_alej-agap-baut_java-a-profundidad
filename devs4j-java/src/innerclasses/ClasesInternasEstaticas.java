package innerclasses;

class ExternaStatic {
	public void foo() {
		System.out.println("Foo");
	}
	
	// Clase interna estática
	static class InternaStatic {
		public void bar() {
			System.out.println("Bar");
		}
		
	}
}

public class ClasesInternasEstaticas {
	public static void main(String[] args) {
		// Como la clase interna es estática, en este caso, para crear un objeto de esta clase interna, no es necesario crear previamente un objeto de la clase externa como sí ocurre con las clases internas regulares
		ExternaStatic.InternaStatic in = new ExternaStatic.InternaStatic();
		in.bar();
	}
}
