package herencia;

// UNota: Si una clase está definida como "final", esa clase no se puede heredar
// Nota: Si un método de una clase está definido como "final", ese métono no se puede sobrescribir en clases hijas
// Nota: Si un dato(atributo de una clase o variable) primitivo está definido como "final", el valor original de ese dato no puede ser modificado
// Nota: Si un dato(atributo de una clase o variable) es un objeto y está definido como "final", la referencia original de ese objeto no puede ser cambiada pero sí se puede modificar los valores de sus atributos

class Animal {
	String nombre;
	
	void respirar() {
		System.out.println("Soy un animal y estoy respirando");
	}
}

class Perro extends Animal{
	
}

class Gato extends Animal{
	
}

class EjemploHerencia {
	
	public static void main(String[] args) {
		Perro perro = new Perro();
		perro.nombre = "Rocky";
		perro.respirar();
		
		Gato gato = new Gato();
		gato.respirar();
		
		Animal animal = new Animal();
		
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Object); // true poque todas las clases en Java heredan de la clase Object aunque no se indique con extends
		System.out.println(animal instanceof Perro);
		System.out.println(animal instanceof Gato);
		System.out.println(perro instanceof Animal);
		System.out.println(perro instanceof Perro);
	}

}
