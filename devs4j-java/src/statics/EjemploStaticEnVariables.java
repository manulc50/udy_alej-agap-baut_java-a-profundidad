package statics;

class SerVivo {
	public SerVivo() {
		System.out.println("Constructo vacío de SerVivo");
	}
}

class Humano extends SerVivo{
	// Este atributo, como es static, pertenece a la clase y no a los objetos de esta clase y, por lo tanto, accedemos a él, o lo usamos, directamente a través de la clase sin necesidad de tener objetos de esta clase creados
	static int numeroHumanos = 0;
	String nombre; // Este atributo no es static y, por lo tanto, pertence a los objetos de esta clase, es decir, cada objeto de esta clase que se cree va a tener su propio atributo "nombre"

	public Humano() {
		System.out.println("Constructo vacío");
	}
	
	public Humano(String nombre) {
		System.out.println("Constructo con parámetro de entrada 'nombre'");
		this.nombre = nombre;
	}
	
	// Nota: Los bloques anónimos se ejecutan en orden de aparición en la clase justo antes de invocarse cualquier constructor de esa clase
	// Nota: Si una clase contiene bloques anónimos y hereda de otra clase, primero se ejecuta el constructor de la clase padre, luego los bloques anónimos y, por último, el constructor de la clase hija 
	
	// Bloque anónimo
	// Este tipo de bloques nos permite poner un código común que queremos que se ejecute en cualquier constructor de una clase que se invoque, es decir, es útil cuando tenemos muchos constructores definidos en una clase y no queremos repetir código común en todos ellos
	{
		System.out.println("Bloque anónimo 1");
		// Usamos el atributos static "numeroHumanos" como contador de objetos de tipo Humano que se crean. Para ello, incrementamos el valor de este atributo dentro del constructor de esta clase
		numeroHumanos++;
	}
	
	// Otro bloque anónimo 
	{
		System.out.println("Bloque anónimo 2");
	}
}

public class EjemploStaticEnVariables {
	int x = 0; // Atributo que pertenece a cada objeto de esta clase
	
	public static void main(String args[]) {
		//System.out.println(x); // Error: Como "x" es un atributo que pertenece a los objetos de esta clase, no se puede usar directamente en métodos static, ya que estos métodos pertenecen a la clase y no a los objetos
		EjemploStaticEnVariables ejemploStaticEnVariables = new EjemploStaticEnVariables();
		System.out.println(ejemploStaticEnVariables.x); // Correcto porque accedemos a "x" a través del objeto "ejemploStaticEnVariables" y no accedemos a "x" directamente
		System.out.println(Humano.numeroHumanos); // Correcto porque el atributo "numeroHumanos" pertenece a la clase al ser declarado como static
		new Humano();
		new Humano();
		new Humano("Alex");
		new Humano();
		new Humano();
		System.out.println("Se han creado " + Humano.numeroHumanos + " objetos");
	}
}
