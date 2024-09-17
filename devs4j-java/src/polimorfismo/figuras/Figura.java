package polimorfismo.figuras;

// Si una clase tiene métodos implementados y otros métodos sin implementar, esos métodos sin implementar se tienen que definir como abstractos
// Una clase que tiene métodos abstractos se tiene que definir como una clase abstracta
// Si una clase hereda una clase abstracta y no implementa sus métodos asbstractos, esa clase hija también se tiene que definir como una clase abstracta
// No se pueden crear objetos de una clase abstracta porque tiene métodos sin implementar y no se permite
// Aunque no se pueden crear objetos de una clase abstracta, sí se pueden definir constructores en esa clase para que sean invocados desde las clases hijas que hereden esa clase abstracta
// Una clase abstracta no pude definirse como final porque no se permite heredar una clase final, y, si no se puede heredar, ninguna otra clase puede implementar los métodos abstractos
// Un método abstracto de una clase abstracta tampoco se puede definir como final porque no se permite sobrescribir un método final, y, si no se puede sobrescribir, ninguna otra clase puede implementar ese método
// Un método abstracto tampoco puede definirse como static porque los métodos static pertenecen a la clase y esa clase no tiene la implementación de ese método. Por lo tanto, ese método no se puede invocar directamente desde esa clase

public abstract class Figura {
	
	private String color;

	public Figura(String color) {
		this.color = color;
	}

	// Este método es abstracto porque, dentro del contexto de una figura, no se puede implementar
	// Dicho de otra manera, una figura es un término generico, ya que hay muchos tipos de figuras, y, por esta razón, se desconoce la implementación de este método a este nivel
    // Las clases hijas que hereden esta clase y se correspondan con figuras concretas, como un circulo, un rectangulo, etc..., deben implementar este método porque en ese nivel se conoce el área de un circulo, también se conoce el área de un rectangulo, etc...
	public abstract double calcularArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
