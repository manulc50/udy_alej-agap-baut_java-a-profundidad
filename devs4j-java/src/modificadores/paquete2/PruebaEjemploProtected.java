package modificadores.paquete2;

import modificadores.paquete1.EjemploProtected;

public class PruebaEjemploProtected extends EjemploProtected{

	public static void main(String[] args) {
		PruebaEjemploProtected pruebaEjemploProtected = new PruebaEjemploProtected();
		pruebaEjemploProtected.foo();
	}
}
