package modificadores.paquete1;

// Nota: Si no se indica modificadores de acceso a atributos de una clase, métodos de una clase, o a las propias clases, por defecto el modificador de acceso que se aplica es default
// Nota: Las clases, atributos de un clase y métodos de una clase que tengan el modificador de acceso default únicamente son visibles en otras clases que estén dentro del mismo paquete, pero no son visibles en clases que estén fuera en otros paquetes

class EjemploDefault {

	// Si no se indica un modificador, por defecto el modificador de acceso es default
	void foo() {
		System.out.println("Foo");
	}
}
