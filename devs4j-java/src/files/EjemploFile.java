package files;

import java.io.File;

public class EjemploFile {
	public static void main(String[] args) {
		// Creamos un objeto de tipo File con la referencia al directorio "G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros"
		File f = new File("G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros");
		// Mostramos alguna información sobre el directorio
		System.out.println("Is file?: " + f.isFile());
		System.out.println("Is directory?: " + f.isDirectory());
		System.out.println("Name: " + f.getName());
		System.out.println("Can read?: " + f.canRead());
		System.out.println("----");
		// Obtenemos un array de objetos de tipo File con las referencias a los archivos y directorios que existen dentro del directorio "G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad\\ejemplosFicheros"
		File[] content = f.listFiles();
		// Recorremos ese array de referencias a archivos y directorios y mostramos alguna información sobre ellos
		for(File file: content) {
			System.out.println("Content - Is file?: " + file.isFile());
			System.out.println("Content - Is directory?: " + file.isDirectory());
			System.out.println("Content - Name: " + file.getName());
			System.out.println("Content - Can read?: " + file.canRead());
			System.out.println("----");
		}
		
	}
}
