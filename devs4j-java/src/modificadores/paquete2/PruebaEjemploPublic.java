package modificadores.paquete2;

import modificadores.paquete1.EjemploPublic;

public class PruebaEjemploPublic {
	
	public static void main(String[] args) {
		EjemploPublic ejemploPublic = new EjemploPublic();
		ejemploPublic.foo(); // Podemos invocar el método "foo" de la clase "EjemploPublic" porque es público
	}
}
