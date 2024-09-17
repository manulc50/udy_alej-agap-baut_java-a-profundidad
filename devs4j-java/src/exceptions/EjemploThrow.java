package exceptions;

// Hay 2 tipos de excepciones en Java; las excepciones Checked y las excepciones Unchecked
// Las excepciones Checked son aquellas que el compilador requiere que manejemos obligatoriamente
// Las excepciones Unchecked son aquellas que el compilador no requiere que se manejen
// Todas las excepciones que heredan de la clase RuntimeException son consideradas como excepciones de tipo Unchecked
// Throws sólo es necesario para excepciones de tipo Checked
// Cuando se sobrescribe un método no es posible agregar throws con una excepción nueva de tipo Checked
// Cuando se llega a una sentencia throw, la ejecución se detiene, o se interrumpe, y se comienza a propagar la excepción
// Si la excepción no es manejada por nadie, al final será manejada por la JVM(Java Virtual Machine) que imprimirá el Stack Trace de la excepción
// Un método puede propagar más de una excepción con la palabra reservada throws
// Sólo se puede usar la palabra reservada throw con objetos de tipo Throwable, que es el padre de todas las excepciones

public class EjemploThrow {
	/*
	 * En el manejo de una excepción hay 2 opciones:
	 * - Atrapar y manejar la excepción con un bloque try-catch
	 * - Propagar(lanzar al siguiente nivel) la excepción al lugar donde se invocó al método que provocó esa excepción
	 */
	static double dividir(int a, int b) throws Exception { // Propagamos la excepción de tipo Exception
		double resultado = 0;
		if(b != 0)
			resultado =  a / b;
		else {
			// Si el parámetro "b" es 0, lanzamos una excepción de tipo IllegalArgumentException con un mensaje de error personalizado porque no se puede realizar la división de un número entre 0
			// Una excepción de tipo IllegalArgumentException es Unchecked porque hereda la clase RuntimeException. Por lo tanto, el compilador no obliga a que se maneje esta excepción en el lugar donde se invoque a este método 
			//throw new IllegalArgumentException("No se puede dividir entre 0");
			
			// La excpeción de tipo Exception es Checked porque no hereda la clase RuntimeException y el compilador obliga a manejarla
			// Una opción para manejar la excepción es usar un bloque try-catch
		
			/*try {
				throw new Exception("No se puede dividir entre 0");
			}
			catch(Exception e) {
				return 0;
			}*/
			
			// Otra opción es propagar la excepción al siguiente nivel y manejarla donde se invoque a este método
			throw new Exception("No se puede dividir entre 0");
		}
		// Si se lanza una excepción, todo el código que hay a partir de este punto no se ejecuta, es decir, si se lanza una excepción, se interrumpe la ejecución del método
		System.out.println("Fin del método");
		return resultado;
	}
	
	public static void main(String[] args) /*throws Exception*/ { // Propaga la excepción a la JVM(Java Virtual Machine)
		// Como el método "dividir" lanza o propaga una excepción de tipo Exception, tenemos 2 opciones
		// Manejamos esa excepción con un bloque try-catch o la volvemos a lanzar, o propagar, al siguiente nivel
		// Si la volvemos a propagar, el siguiente nivel es la JVM(Java Virtual Machine) que se encargará de manejarla
		double resultado;
		try {
			resultado = dividir(10, 0);
			System.out.println("Resultado: " + resultado);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
