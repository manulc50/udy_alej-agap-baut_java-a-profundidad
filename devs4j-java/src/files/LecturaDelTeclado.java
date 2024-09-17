package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDelTeclado {
	
	// Método que recibe un prompt como argumento de entrada, lo muestra por consola y lee y devuelve una línea de texto introducida por el usuario usando la línea de comandos o el teclado
	public static String readMessage(String prompt) throws IOException {
		System.out.println(prompt);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine(); // Puede lanzar una excepción IOException que es tipo Checked
	}
	
	// Método que recibe un prompt como argumento de entrada , invoca al método "readMessage" pasándole ese prompt para leer y obtener de la línea de comandos un texto que represente un número entero, y, al final, convierte ese texto a un número entero y lo devuelve
	public static int readInteger(String prompt) throws IOException {
		return Integer.parseInt(readMessage(prompt)); // Nuestro método "readMessage" puede lanzar una exceptión "IOException" que es de tipo Checked
	}
	
	public static void main(String[] args) throws IOException {
		String nombre = readMessage("Cómo te llamas?:");
		System.out.println("Te llamas " + nombre);
		int edad = readInteger("Cuál es tu edad?:");
		System.out.println("Tu edad es " + edad + " años");
	}
}
