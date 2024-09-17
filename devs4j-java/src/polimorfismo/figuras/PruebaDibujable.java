package polimorfismo.figuras;

/*
	Ejemplo de uso de una iterfaz:
	Nos dicen que tiene que ser posible dibujar clases que representen figuras y clases que no representen figuras
	No todas las clases que representen figuras se pueden dibujar
*/


// Clase para probar el polimorfismo en interfaces

public class PruebaDibujable {
	
	void probarDibujar(Dibujable dibujable) {
		dibujable.dibujar();
	}
	
	public static void main(String[] args) {
		PruebaDibujable pruebaDibujable = new PruebaDibujable();
		pruebaDibujable.probarDibujar(new Circulo("Verde", 10.5)); // Es correcto porque la clase Circulo implementa la interfaz Dibujable
		pruebaDibujable.probarDibujar(new Rectangulo("Azul", 35.7, 23.3)); // Es correcto porque la clase Rectangulo implementa la interfaz Dibujable
		//pruebaDibujable.probarDibujar(new Cuadrado("Rojo", 12.8)); // Error: No es correcto porque la clase Cuadrado no implementa la interfaz Dibujable
		pruebaDibujable.probarDibujar(new Imagen()); // Es correcto porque la clase Imagen implementa la interfaz Dibujable
	
		System.out.println(new Circulo("Verde", 10.5) instanceof Dibujable);
	}
}
