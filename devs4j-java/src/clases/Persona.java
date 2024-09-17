package clases;

// Definición de la clase
class Persona{
	
	// Atributos
	String nombre;
	int edad;
	char genero;
	
	// Constructores
	Persona(){
		// Invoca al constructor con parámetros de entrada
		// Este tipo de invocación hay que ponerlo siempre en la primera línea del constructor donde se invoca porque, de lo contrario, da error de compilación
		this("Nombre por defecto", 22, 'M');
		System.out.println("Constructor por defecto");
	}
	
	Persona(String nombre, int edad, char g){
		// Invoca al constructor vacío o por defecto
		// Este tipo de invocación hay que ponerlo siempre en la primera línea del constructor donde se invoca porque, de lo contrario, da error de compilación
		//this();
		this.nombre = nombre;
		this.edad = edad;
		genero = g;
	}
	
	// Métodos
	void jugarVideojuegos(Persona p) {
		System.out.println(nombre + " está jugando con " + p.nombre);
	}
	
	void imprimirInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Genero: " + genero);
	}
	
	public static void main(String args[]) {
		Persona p1 = new Persona("Alex", 32, 'M');
		p1.imprimirInformacion();
		System.out.println();
		
		Persona p2 = new Persona("Juan", 51, 'M');
		p2.imprimirInformacion();
		System.out.println();
		
		new Persona().imprimirInformacion();
		System.out.println();
		
		p1.jugarVideojuegos(p2);
	}
	
}
