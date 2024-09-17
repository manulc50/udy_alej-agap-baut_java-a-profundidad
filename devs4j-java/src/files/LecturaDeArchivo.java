package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivo {
	public static void main(String args[]) throws IOException {
		// Vamos a leer el archivo "texto.txt" de la ruta "G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros" del sistema de archivos
		File file = new File("G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros\\texto.txt");
		if(file.exists()) {
			// Usamos un objeto de tipo FileReader como stream de lectura del archivo y usamos un objeto de la clase BufferedReader como buffer de lectura de ese stream para poder leer líneas de texto de ese archivo
			// Como las clases FileReader y BufferedReader son de tipo Closeable, en lugar de cerrar este stream de lectura y este buffer de lectura manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de este stream y de este buffer de manera automática
			try(FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr)) { // La clase FileReader puede lanzar una excepción IOException que es de tipo Checked
				// Mientras haya líneas de texto para leer del archivo, las leemos y las mostramos por consola
				String cadena = null;
				do {
					cadena = br.readLine();
					System.out.println(cadena);
				}
				while(cadena != null);
			}
		}
		else
			System.out.println("El archivo no existe");
	}
}
