package wrapper;

class Perro {
	private String nombre;
	
	public Perro(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	// Sobrescribimos este método de la clase Object para indicar nuestra propia implementación de este método "equals"
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Perro) {
			Perro p = (Perro)obj;
			if(p.getNombre().equals(this.getNombre()))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	
	
}

public class OperadorVsEquals {
	public static void main(String[] args) {
		// El operador == sobre objetos compara las referencias(direcciones de memoria) de esos objetos
		Perro p1 = new Perro("Bobby");
		Perro p2 = new Perro("Bobby");
		System.out.println(p1 == p2); // False porque p1 y p2 son dos objetos distintos y, por lo tanto, tienen referencias distintas
		Perro p3 = p1;
		System.out.println(p3 == p1); // True porque p3 y p1 son el mismo objeto y, por lo tanto, tienen la misma referencia
		System.out.println(p1.equals(p2)); // True porque nuestra implementación del método "equals" dice que si ambos objetos son de tipo Perro y tienen el mismo nombre, entonces son iguales
	
		// Nota: En los objetos de tipo Wrapper, tanto el operador == como el método "equals", funcionan de la misma manera, es decir, comparan el contenido de sus valores primitivos
		Integer x = 10;
		Integer y = 10;
		System.out.println(x == y);
		System.out.println(x.equals(y));
	}
}
