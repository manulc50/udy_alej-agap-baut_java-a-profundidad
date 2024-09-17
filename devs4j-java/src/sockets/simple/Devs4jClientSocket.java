package sockets.simple;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Devs4jClientSocket {
	public static void main(String args[]) throws UnknownHostException, IOException {
		
		// Crea un cliente Socket que se comunica con el servidor que se encuentra en el Host "localhost" escuchando peticiones en el puerto 8090	
		// Como las clases Socket y DataOutputStream son de tipo Closeable, en lugar de cerrar el socket y el stream de salida manualmente al finalizar, usamos un bloque try para que se invoque a los métodos "close" de este socket y de este stream de manera automática
		try(Socket socket = new Socket("localhost", 8090);
				// Este objeto de tipo DataOutputStream nos servirá para enviar los datos, o las peticiones, al servidor
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
			
			// Envía un mensaje de texto al servidor
			dos.writeUTF("Hola soy un cliente del socket");
			// Envía el mensaje de texto "Salir" al servidor para finalizar la conexión
			dos.writeUTF("Salir");
		}
	}
}
