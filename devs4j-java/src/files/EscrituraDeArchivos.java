package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraDeArchivos {
	public static void main(String[] args) throws FileNotFoundException {
		// Vamos a crear el archivo "texto.txt" en la ruta "G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros" del sistema de archivos
		File file = new File("G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros\\texto.txt");
		// Usamos un objeto de tipo PrintWriter como stream de escritura para escribir en el archivo
		// Como la clase PrintWriter es de tipo Closeable, en lugar de cerrar este stream de escritura manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de este stream de manera automática
		try(PrintWriter pw = new PrintWriter(file)){ // La clase PrintWriter puede lanzar una excepción FileNotFoundException que es de tipo Checked
			// Escribimos varias líneas de texto en el fichero
			pw.println("Hola");
			pw.println("Siganme en");
			pw.println("@raidentrance");
		}
	}
}
