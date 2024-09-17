package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Devs4jEditor {
	
	// Constante BASE_PATH
	private static final String BASE_PATH = "G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros";
	
	// Método que lee y devuelve una línea de texto introducida por el usuario usando la línea de comandos o el teclado
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine(); // Puede lanzar una excepción IOException que es tipo Checked
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Indica el nombre del archivo");
		// Leemos y obtenemos el nombre del archivo introducido por el usuario a través del teclado o línea de comandos
		String fileName = readMessage(); // Nuestro método "readMessage" puede lanzar una excepción IOException que es tipo Checked
		// Vamos a crear un archivo de texto a partir de la ruta base del sistema de archivos indicado por el contenido de la constante BASE_PATH seguido del nombre del archivo introducido por el usuario en la línea de código anterior
		File file = new File(BASE_PATH.concat("\\").concat(fileName));
		// Usamos un objeto de tipo PrintWriter como stream de escritura para escribir en el archivo
		// Como la clase PrintWriter es de tipo Closeable, en lugar de cerrar este stream de escritura manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de este stream de manera automática
		try(PrintWriter pw = new PrintWriter(file)){ // La clase PrintWriter puede lanzar una excepción FileNotFoundException que es de tipo Checked
			System.out.println("Empieza a escribir y escribe \"salir\" para terminar");
			// Leemos y obtenemos las cadenas de texto introducidas por el usuario a través del teclado o línea de comandos hasta que una de ellas sea el texto "salir"
			String cadena = null;
			do {
				cadena = readMessage(); // Nuestro método "readMessage" puede lanzar una excepción IOException que es tipo Checked
				// Escribimos las cadenas de texto en el archivo excepto si se trata de la cadena de texto "salir" que es para finalizar la escritura en el archivo
				if(!cadena.equals("salir"))
					pw.println(cadena);
			}
			while(!cadena.equals("salir"));
		}
	}
}
