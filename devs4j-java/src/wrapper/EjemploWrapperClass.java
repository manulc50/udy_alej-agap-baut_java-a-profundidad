package wrapper;

public class EjemploWrapperClass {
	public static void main(String[] args) {
		// Tipo de dato primitivo(No es un objeto)
		int x = 10;
		// Tipo de dato Integer(Es un objeto) - Integer es una Wrapper Class
		Integer x1 = 10;
		System.out.println(x);
		System.out.println(x1.floatValue());
		String x1String = x1.toString();
		System.out.println(x1String);
	}
}
