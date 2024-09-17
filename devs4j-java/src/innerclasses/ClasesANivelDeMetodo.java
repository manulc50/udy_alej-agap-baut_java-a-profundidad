package innerclasses;

public class ClasesANivelDeMetodo {
	static void foo() {
		// Esta clase sólo está disponible para este método "foo"
		class ClaseInternaDeMetodo{
			void bar() {
				System.out.println("Bar");
			}
		}
		
		ClaseInternaDeMetodo obj = new ClaseInternaDeMetodo();
		obj.bar();
	}
	
	static void test() {
		//ClaseInternaDeMetodo obj = new ClaseInternaDeMetodo(); // Error: La clase ClaseInternaDeMetodo sólo está disponible, o sólo es visible, para el método "foo"
	}
	
	public static void main(String[] args) {
		foo();
	}
}
