package files.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Nota: Para poder escribir objetos en archivos y para poder leer objetos desde archivos, es necesario que las clases de esos objetos implementen la interfaz Serializable

public class EscrituraDeObjetos {
	public static void main(String args[]) throws IOException {
		// Creamos un array de objetos tipo Programador de manera implícita
		// Los objetos null también se pueden escribir en un archivo
		Programador programadores[] = {new Programador("Manuel","Java"), new Programador("Alex","Python"), new Programador("Paco","Javascript"), null};
		// Vamos a crear el archivo "progrmadores.txt" en la ruta "G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros" del sistema de archivos
		File file = new File("G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros\\progrmadores.txt");
		// Usamos un objeto de tipo FileOutputStream como stream de salida, o de escritura, del archivo
		// Usamos un objeto de tipo ObjectOutputStream como stream de salida, o de escritura, de objetos a partir del stream FileOutputStream y así poder escribir objetos en el archivo
		// Como las clases FileOutputStream y ObjectOutputStream son de tipo Closeable, en lugar de cerrar estos streams de escritura manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de estos streams de manera automática
		try(FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { // Las clases FileOutputStream y ObjectOutputStream pueden lanzar una excepción IOException que es de tipo Checked
			// Recorremos el array de objetos tipo Programador y escribimos cada objeto Programador en el archivo
			for(Programador programador: programadores)
				oos.writeObject(programador);
		}
	}
}
