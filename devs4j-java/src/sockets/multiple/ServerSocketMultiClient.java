package sockets.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// Esta clase representa un hilo que establece un canal, o stream, de entrada con un cliente conectado al servidor para recibir sus mensajes o peticiones hasta que se reciba el mensaje "Salir"
class WorkerSocket extends Thread {
	private Socket client;

	public WorkerSocket(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		// Este objeto de tipo DataInputStream nos servirá para recibir los datos, o las peticiones, del cliente
		// Como la clase DataInputStream es de tipo Closeable, en lugar de cerrar el stream manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de este stream de manera automática
		try(DataInputStream dis = new DataInputStream(client.getInputStream())) {
			// Leemos el contenido de los mensajes del cliente hasta que se reciba el mensaje "Salir"
			String message = null;
			do {
				message = dis.readUTF();
				// Obtenemos y mostramos el nombre del Host del cliente junto con el mensaje recibido
				System.out.printf("%s dice: %s\n", client.getInetAddress().getHostName(), message);
			}
			while(!message.equals("Salir"));
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
}

public class ServerSocketMultiClient {
	public static void main(String[] args) throws IOException {
		// Crea un servidor Socket que escucha peticiones en el puerto 8090
		// Como la clase ServerSocket es de tipo Closeable, en lugar de cerrar el socket manualmente al finalizar, usamos un bloque try para que se invoque al método "close" de este socket de manera automática
		try(ServerSocket ss = new ServerSocket(8090)) {
			// Bucle que se ejecuta siempre para ir escuchando y aceptando las conexiones de más de un cliente
			// Para salir, pulsar CTRL+C
			while(true) {
				System.out.println("Escuchando clientes...");
				// Se queda esperando a que un cliente se conecte
				Socket client = ss.accept();
				// Obtenemos y mostramos el nombre del Host del cliente
				System.out.println("Cliente conextado: " + client.getInetAddress().getHostName());
				// Crea un hilo de tipo WorkerSocket para cada cliente conectado y se ejecuta de manera concurrente
				new WorkerSocket(client).start();
			}
		}
	}
}
