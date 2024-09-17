package sockets.simple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Devs4jServerSocket {
	public static void main(String[] args) throws IOException {
		
		// Crea un servidor Socket que escucha peticiones en el puerto 8090
		// Como la clase ServerSocket es de tipo Closeable, en lugar de cerrar el socket manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de este socket de manera automática
		try(ServerSocket socket = new ServerSocket(8090)){
			System.out.println("Escuchando peticiones...");
			// Se queda esperando a que un cliente se conecte
			Socket client = socket.accept();
			// Obtenemos y mostramos el nombre del Host del cliente
			System.out.printf("Cliente %s conectado\n", client.getInetAddress().getHostName());
			// Este objeto de tipo DataInputStream nos servirá para recibir los datos, o las peticiones, del cliente
			DataInputStream dis = new DataInputStream(client.getInputStream());
			// Leemos el contenido de los mensajes del cliente hasta que se reciba el mensaje "Salir"
			String message = null;
			do {
				message = dis.readUTF();
				// Obtenemos y mostramos el nombre del Host del cliente junto con el mensaje recibido
				System.out.printf("%s dice: %s\n", client.getInetAddress().getHostName(), message);
			}
			while(!message.equals("Salir"));
			System.out.println("Conexión cerrada");
			// En este punto de la aplicación servidor ya hemos finalizado la comunicación con el cliente y cerramos todos los recursos abiertos
			// Nota: Las clases DataInputStream y Socket también son de tipo Closeable, pero, en este caso, hemos cerrado el stream y el socket de manera manual en lugar de hacerlo automáticamente en un bloque try
			dis.close();
			client.close();
			// Como la clase ServerSocket es de tipo Closeable, en lugar de cerrar el socket manualmente, usamos un bloque try para que se invoque al método "close" de este socket de manera automática
			//socket.close();
		}
			
	}
}
