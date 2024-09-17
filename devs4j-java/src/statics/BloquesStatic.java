package statics;

public class BloquesStatic {
	
	// Si una clase tiene varios bloques static, éstos se ejecutan en orden de aparición en esa clase
	
	// Bloque static - Primero se ejecuta este bloque porque es el primero en crearse dentro de la clase
	// Un bloque static es un bloque de código que se ejecuta en el momento que se carga la clase en la JVM(Java Virtual Machine)
	// El objetivo de los bloques static es similar al de los constructores de objetos, es decir, si un constructor se utiliza para inicializar un objeto, un bloque static se utiliza para inicializar una clase de cara a sus métodos static o atributos static 
	static {
		System.out.println("Hola Mundo");
	}
	
	// Otro bloque static - Después se ejecuta este bloque porque es el segundo y último en crearse dentro de la clase
	static {
		System.out.println("Hola Mundo 2");
	}

	public static void main(String[] args) {
		// Aunque no haya ninguna línea de código aquí, se imprime por consola "Hola Mundo" y después "Hola Mundo 2" porque el código de los bloques static se ejecutan en orden de su creación en la clase cuando se carga la clase en la JVM 
	}
}
