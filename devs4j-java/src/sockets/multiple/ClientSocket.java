package sockets.multiple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocket {
	
	// Método que lee una línea de texto desde el teclado o línea de comandos
	public static String readMessage() throws IOException {
		// Muestra un prompt por consola
		System.out.printf("\n->");
		// Para leer del teclado o línea de comandos
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		// Devuelve la línea de texto introducida por el teclado
		return br.readLine();
	}
	
	public static void main(String args[]) throws IOException {
		// Crea un cliente Socket que se comunica con el servidor que se encuentra en el Host "localhost" escuchando peticiones en el puerto 8090	
		// Como las clases Socket y DataOutputStream son de tipo Closeable, en lugar de cerrar el socket y el stream de salida manualmente al finalizar, usamos un bloque try para que se invoque a los métodos "close" de este socket y de este stream de manera automática
		try(Socket socket = new Socket("localhost", 8090);
				// Este objeto de tipo DataOutputStream nos servirá para enviar los datos, o las peticiones, al servidor
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
			// Leemos y obtenemos los mensajes introducidos por el usuario desde el teclado o línea de comandos hasta que el mensaje sea "Salir"
			String message = null;
			do {
				message = readMessage();
				// Envía el mensaje  al servidor
				dos.writeUTF(message);
			}
			while(!message.equals("Salir"));
		}
	}
}
