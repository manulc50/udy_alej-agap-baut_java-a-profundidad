package herencia;

// Nota: Si una clase está definida como "final", esa clase no se puede heredar
// Nota: Si un método de una clase está definido como "final", ese métono no se puede sobrescribir en clases hijas
// Nota: Si un dato(atributo de una clase o variable) primitivo está definido como "final", el valor original de ese dato no puede ser modificado
// Nota: Si un dato(atributo de una clase o variable) es un objeto y está definido como "final", la referencia original de ese objeto no puede ser cambiada pero sí se puede modificar los valores de sus atributos

public class Estudiante extends Persona{
	
	int numeroDeCuenta;
	
	Estudiante(int numeroDeCuenta, String nombre, String fechaDeNacimiento){
		super(nombre, fechaDeNacimiento);
		this.numeroDeCuenta = numeroDeCuenta;
	}
	
	// Sobrescribimos este método de la clase padre "Persona" para darle una nueva funcionalidad
	@Override
	void dormir() {
		System.out.println("Soy " + nombre + ", soy estudiante y no duermo");
		super.dormir(); // Invocamos al método "dormir" de la clase padre "Persona"
	}
	
	void aprobar() {
		System.out.println("Soy " + nombre + " y aprobé mi examen");
	}
	
	void suspender() {
		System.out.println("Soy " + nombre + " y suspendí mi examen");
	}

}
