package herencia;

// Nota: Si una clase está definida como "final", esa clase no se puede heredar
// Nota: Si un método de una clase está definido como "final", ese métono no se puede sobrescribir en clases hijas
// Nota: Si un dato(atributo de una clase o variable) primitivo está definido como "final", el valor original de ese dato no puede ser modificado
// Nota: Si un dato(atributo de una clase o variable) es un objeto y está definido como "final", la referencia original de ese objeto no puede ser cambiada pero sí se puede modificar los valores de sus atributos

public class Empleado extends Persona {

	float sueldo;
	
	Empleado(float sueldo, String nombre, String fechaDeNacimiento) {
		super(nombre, fechaDeNacimiento);
		this.sueldo = sueldo;
	}
	
	void trabajar() {
		System.out.println("Soy " + nombre + " y trabajo");
	}
	
	void cobrar() {
		System.out.println("Soy " + nombre + " y estoy cobrando " + sueldo);
	}
}
