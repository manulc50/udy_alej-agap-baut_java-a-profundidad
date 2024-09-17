package modificadores.paquete2;

//import modificadores.paquete1.EjemploDefault; // Error: No se puede acceder a la clase EjemploDefault porque es default y se encuentra en otro paquete(modificadores.paquete1) distinto al paquete(modificadores.paquete2) de esta clase

public class PruebaEjemploDefault {
	
	public static void main(String[] args) {
		//EjemploDefault ejemploDefault = new EjemploDefault(); Error: No se puede acceder a la clase EjemploDefault porque es default y se encuentra en otro paquete(modificadores.paquete1) distinto al paquete(modificadores.paquete2) de esta clase
		//ejemploDefault.foo(); Error: No se puede invocar al método "foo" de la  clase EjemploDefault porque es default y esa clase se encuentra en otro paquete(modificadores.paquete1) distinto al paquete(modificadores.paquete2) de esta clase
	}
}
