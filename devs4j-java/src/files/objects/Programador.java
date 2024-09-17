package files.objects;

import java.io.Serializable;

// Nota: Para poder escribir objetos en archivos y para poder leer objetos desde archivos, es necesario que las clases de esos objetos implementen la interfaz Serializable

public class Programador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6235493255268429912L;
	
	private String nombre;
	private String lenguajeFavorito;
	
	public Programador() {

	}

	public Programador(String nombre, String lenguajeFavorito) {
		this.nombre = nombre;
		this.lenguajeFavorito = lenguajeFavorito;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLenguajeFavorito() {
		return lenguajeFavorito;
	}
	public void setLenguajeFavorito(String lenguajeFavorito) {
		this.lenguajeFavorito = lenguajeFavorito;
	}
	
}
