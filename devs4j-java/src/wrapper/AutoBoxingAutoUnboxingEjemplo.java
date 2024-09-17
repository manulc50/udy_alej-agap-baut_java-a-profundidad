package wrapper;

// AutoBoxing y AutoUnboxing aparecieron en la versión 5 de Java
// AutoBoxing: Es la conversión automática que realiza el compilador de Java de un tipo primitivo a su correspondiente Wrapper
// AutoUnboxing: Es la conversión automática que realiza el compilador de Java de un Wrapper a su correspondiente tipo primitivo

public class AutoBoxingAutoUnboxingEjemplo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer i = 10; // AutoBoxing
		int y = i; // AutoUnboxing
	}
}
