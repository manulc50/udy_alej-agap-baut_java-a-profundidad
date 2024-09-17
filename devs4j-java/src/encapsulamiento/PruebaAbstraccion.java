package encapsulamiento;

// El concepto de abstracción tiene que ver con el encapsulamiento de una clase y significa que aquellos métodos de una clase que implementen o definan funcionalidades internas de esa clase deben ser métodos privados para que no puedan ser accedidos, o invocados, desde fuera en otras clases
// Dicho de otra manera, los métodos de una clase deben ser públicos cuando se desea, o es lógico, que esos métodos puedan ser invocados desde fuera en otras clases y deben ser privados cuando definan funcionalidades internas de esa clase y no tiene ningún sentido invocarlos desde fuera
// Nota: Los métodos públicos de una clase deben estar documentados porque se exponen hacia a fuera para poder usarlos en otras clases y deben describir sus funcionamientos. Sin embargo, en los métodos privados de una clase, no es necesario documentarlos porque no se exponen hacia afuera al tratarse de implementaciones internas de esa clase

public class PruebaAbstraccion {
	
	public static void main(String[] args) {
		String s = new String("hola");
		s.toUpperCase(); // Es correcto porque este método es público dentro de la clase String porque implementa una funcionalidad que pueda ser usada como una utilidad hacia afuera y por eso está expuesto
		//s.indexOfNonWhitespace(); // Error: Este método es privado dentro de la clase String porque implementa alguna funcionalidad interna de esa clase y no está expuesto hacia afuera
	}

}
