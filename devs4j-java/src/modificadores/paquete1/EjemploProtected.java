package modificadores.paquete1;

// Nota: Los atributos y métodos que tiene modificadores de acceso protected sólo son visibles por otras clases que se encuentran en el mismo paquete y por clases hijas(herencia) de esa clase que pueden estar tanto en el mismo paquete como fuera en otros paquetes

public class EjemploProtected {

	protected void foo() {
		System.out.println("Foo");
	}
}
