package exceptions;

// Cuando se sobrescribe un método no es posible agregar throws con una excepción nueva de tipo Checked

class Foo {
	void print() throws Exception {
		
	}
	
	/*void print() {
		
	}*/
}

class Bar extends Foo {
	
	// Si no indicamos la propagación de la excepción de tipo Exception en la sobrescritura del método, es correcto
	/*@Override
	void print() {
		
	}*/
	
	// Si indicamos la propagación de la excepción de tipo Exception en la sobrescritura del método, también es correcto
	@Override
	void print() throws Exception{
		
	}
	
	// Si el método de la clase padre no propaga ninguna excepción y se sobrescribe propagando un excepción de tipo Checked, es incorrecto
	/*@Override
	void print() throws Exception{
	}*/
}

public class HerenciaThrows {

}
