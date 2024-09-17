package statics;

class A {
	
	static void foo() {
		System.out.println("Foo");
	}
}

class B extends A{
	
	// Error: Como el método "foo" de la clase que se hereda "A" es static y , por lo tanto, pertenece a la clase, no se puede sobrescribir porque el método "foo" de esta clase "B" no es static y, por lo tanto, es un método que pertence a instancias u objetos
	// Dicho de otra manera, un método que no es static y pertenece a las instancias u objetos no puede sobrescribir a un método static que pertenece a la clase que hereda
	/*@Override
	void foo() {
		System.out.println("Foo2");
	}*/
	
	// Si definimos este método como static al igual que el método "foo" de la clase que hereda "A", tampoco se puede sobrescribir
	// En general, los métodos static no pueden ser sobrescritos
	// Entonces, aunque esta clase "B" herede la clase "A" y tenga un método static con el mismo nombre y estructura que un método de la clase "A", no sobrescribe al método de la clase "A", sino que es un método que pertence a esta clase "B"
	static void foo() {
		System.out.println("Foo2");
	}
}

public class StaticYPolimorfismo {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		A a = new B();
		// Imprime por consola "Foo" porque, aunque el objeto "a" se ha creado usando una instancia de clase "B" pero "a" es de tipo "A", como el método "foo" es static, no se aplica polmorfismo y se invoca al método "foo" que pertenece a la clase "A"
		// Dicho de otra manera, el polimorfismo se aplica cuando se usan métodos que pertenecen a las instancias u objetos y no a las clases, es decir, se aplica a los métodos que no son static
		a.foo(); // Se produce un warning con el mensaje "The static method foo() from the type A should be accessed in a static way"
	}
}
