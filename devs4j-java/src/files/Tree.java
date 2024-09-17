package files;

import java.io.File;

public class Tree {
	
	// Este método "print" simula el funcionamiento del comando "tree" que, dada un ruta del sistema de archivos, lista todos los archivos y directorios encontrados
	private static void print(File[] files, String tabs) {
		// Añadimos un guión más, "-", a las tabulaciones o espacios
		String spaces = tabs.concat("-");
		// Comprobamos si el array de archivos y directorios que se recibe como parámetro de entrada existe y, en caso afirmativo, iteramos ese array
		if(files != null) {
			for(File file: files) {
				// Si se trata de un fichero, mostramos por consola las tabulaciones, o espacios, correspondientes y el nombre de ese fichero
				if(file.isFile())
					System.out.printf("%s %s\n", spaces, file.getName());
				// En caso contrario, se trata de un directorio y, en este caso, mostramos por consola las tabulaciones, o espacios, correspondientes y el nombre de ese directorio
				// Y, además, volvemos a llamar a este método de forma recursiva con la lista de archivos y directorios contenidos en ese directorio
				else {
					System.out.printf("%s %s\n", spaces, file.getName());
					print(file.listFiles(), spaces);
				}
			}
		}				
	}
	
	public static void main(String[] args) {
		File f = new File("G:\\manuel\\eclipse-workspace\\Udemy - Java a profundidad");
		System.out.println(f.getName());
		print(f.listFiles(), "-");
	}

}
