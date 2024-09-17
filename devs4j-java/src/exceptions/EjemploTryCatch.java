package exceptions;

public class EjemploTryCatch {
	public static void main(String[] args) {
		try {
			//int x = 0;
			int x = 10;
			int y = 10/x; // Las divisiones entre 0 no se permiten y generan una excepción de tipo ArithmeticException
			System.out.println("Valor de la división: " + y);
			//String nombre = null;
			String nombre = "Alex";
			System.out.println(nombre.toString());
			String arr[] = {"raidentrance", "devs4j"};
			System.out.println(arr[3]);
			
		}
		// Union catch block - Maneja varios tipos de excepciones y ejecuta un bloque de código común para esas excepciones
		catch (ArithmeticException | NullPointerException e) {
			System.err.printf("Arithmetic o NullPointer Exception %s\n", e.getMessage());
		}
		catch(Exception e) {
			System.err.printf("Exception %s\n", e.getMessage());
		}
		// Este bloque de código siempre se ejecuta, es decir, se ejecuta tanto si algo ha ido bien como si ha ido mal
		finally{
			System.out.println("Siempre se ejecuta");
		}
	}
}
