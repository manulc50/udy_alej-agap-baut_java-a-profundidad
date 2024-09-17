package colecciones;

// La expresión "<T>" indica que se va a utilizar un genérico, llamado T, dentro de la clase
// Este genérico T será de un tipo de dato en concreto cuando se creen instancias, u objetos, de la clase que lo utiliza

// Clase que utiliza un dato genérico(Puede ser de cualquier tipo)
class BeanGenerico<T> {
	private T valor;
	
	public BeanGenerico(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
}

class Transporte {
	
}

class Coche extends Transporte {
	
}

class Deportivo extends Coche {
	
}

// La clase BeanGenerico2 es un ejemplo de cómo podemos limitar los tipos de los genéricos a través de la herencia

// Clase que utiliza un dato genérico
// Como este dato genérico herada de Transporte, sólo puede ser de cualquier tipo que herede la clase Transporte(No puede ser de tipo String, Integer, etc...Sólo puede ser de una clase que herede la clase Transporte)
class BeanGenerico2<T extends Transporte> {
	private T valor;
	
	public BeanGenerico2(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
}

public class EjemploGenericos {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		// En este caso en concreto, el dato genérico que se usa en la clase BeanGenerico va a ser de tipo String
		BeanGenerico<String> bean1 = new BeanGenerico<>("Alex");
		System.out.println(bean1.getValor());
		bean1.setValor("Pepe");
		System.out.println(bean1.getValor());
		
		// En este caso en concreto, el dato genérico que se usa en la clase BeanGenerico va a ser de tipo Integer
		BeanGenerico<Integer> bean2 = new BeanGenerico<Integer>(41);
		System.out.println(bean2.getValor());
		bean2.setValor(5);
		System.out.println(bean2.getValor());
		
		//BeanGenerico2<Integer> bean3 = new BeanGenerico2<Integer>(41); // Error: El dato genérico sólo puede ser una clase que herede la clase Transporte
		BeanGenerico2<Transporte> bean3 = new BeanGenerico2<>(new Transporte()); // Es válido porque el dato generíco es de la clase Transporte
		BeanGenerico2<Transporte> bean4 = new BeanGenerico2<>(new Coche()); // Es válido porque el dato generíco es de la clase Coche que hereda la clase Transporte
		BeanGenerico2<Deportivo> bean5 = new BeanGenerico2<>(new Deportivo()); // Es válido porque el dato generíco es de la clase Deportivo que hereda la clase Transporte
	}
}
