package files.objects;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

// Nota: Para poder escribir objetos en archivos y para poder leer objetos desde archivos, es necesario que las clases de esos objetos implementen la interfaz Serializable

public class LecturaDeObjetos {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Vamos a leer el archivo "progrmadores.txt" de la ruta "G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros" del sistema de archivos
		File file = new File("G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros\\progrmadores.txt");
		if(file.exists()) {
			// Usamos un objeto de tipo FileInputStream como stream de entrada, o de lectura, del archivo
			// Usamos un objeto de tipo ObjectInputStream como stream de entrada, o de lectura, de objetos a partir del stream FileInputStream y así poder obtener objetos del archivo
			// Como las clases FileInputStream y ObjectInputStream son de tipo Closeable, en lugar de cerrar estos streams de lectura manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de estos streams de manera automática
			try(FileInputStream fis = new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(fis)) { // Las clases FileInputStream y ObjectInputStream pueden lanzar una excepción IOException que es de tipo Checked
				// Bucle que se ejecuta siempre para leer y obtener cada objeto de tipo Programador del archivo
				// Cuando se llegue al final del archivo, el método "readObject" lanzará una excepción de tipo EOFException que la manejaremos para finalizar la ejecución del bucle while usando la palabra reserbada "break"
				while(true) {
					try {
						// Leemos y obtenemos un objeto de tipo Programador del archivo
						Programador programador = (Programador)ois.readObject(); // Este método puede lanzar una excepción ClassNotFoundException o una excepción IOException que son de tipo Checked
						// Si el objeto Programador no es null, mostramos por consola el nombre y el lenguaje favorito del programador
						if(programador != null) {
							System.out.println(programador.getNombre());
							System.out.println(programador.getLenguajeFavorito());
						}
						// En caso contrario, es decir, si el objeto Programador es null, mostramos por consola el texto "Null"
						else
							System.out.println("Null");
					}
					// Si el método "readObject" lanza la excepción EOFException, significa que hemos llegado al final del archivo y, en este caso, finalizamos la ejecución del bucle while
					catch(EOFException e) {
						break;
					}
				}
			}
		}
		else
			System.out.println("El archivo no existe");
	}
}
