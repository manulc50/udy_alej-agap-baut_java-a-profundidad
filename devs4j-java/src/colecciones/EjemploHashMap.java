package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// HashMap se utiliza cuando se necesita una colección que contenga pares, clave-valor
// Las claves, o llaves, pueden contener un valor nulo, o null, pero sólo en un elemento del HashMap
// En un HashMap no se permite claves, o llaves, duplicadas
// El acceso a los elementos de un HashMap se basa en el hashcode
// Cuanto mejor sea la implementación del hashcode, mejor será el rendimiento

public class EjemploHashMap {
	public static void main(String[] args) {
		// HashMap que almacena elementos de pares clave-valor de tipo String-String
		Map<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("raidentrance", "Es la cuenta de twitter");
		diccionario.put("java", "Es un lenguaje de programación");
		diccionario.put(null, "Representa la auseencia de un objeto");
		// Al añadir este elemento en el HashMap, como ya existe un elemento con clave, o llave, "java", se sobrescribe el valor de este elemento por el valor del elemento que ya estaba previamente 
		// Esto es debido a que en un HashMap no se permite elementos con clave, o llave, duplicada
		diccionario.put("java", "Esta aplicación está hecha en Java");
		System.out.println(diccionario);
		
		// Una manera de mostrar las claves, o llaves, de un HashMap y sus valores
		// Mostramos por consola cada una de las llaves, o claves, del HashMap y sus correspondientes valores
		for(String llave: diccionario.keySet())
			System.out.println(llave + "=" + diccionario.get(llave));
		System.out.println();
		
		// Otra manera de mostrar las claves, o llaves, de un HashMap y sus valores. En este caso usando Entry
		for(Entry<String, String> entry: diccionario.entrySet())
			System.out.println(entry.getKey() + "=" + entry.getValue());
		
		/*
		 * Funcionamiento interno de un HashMap:
		 * 
		 * Un HashMap internamente contiene una tabla de buckets, o espacios, que van inicialmente desde la posición 0 a la posición 15(16 buckets en total)
		 * Cada bucket, o espacio, es una lista enlazada o LinkedList
		 * Cuando se inserta un elemento en un HashMap, se realiza una operación modular sobre el hashcode de la clave, o llave, de ese elemento para obtener el índice o la posición de la tabla de buckets donde se va a insertar
		 * Por ejemplo(No es exáctamente esta operación modular pero para mostrar un ejemplo vale):
		 * "raidentrance".hashCode() % 16 = 0("raidentrance".hashCode() = 2009640000) - Se inserta en el bucket de la posición 0 de la tabla
		 * "java".hashCode() % 16 = 2("java".hashCode() = 2301506) - Se inserta en el bucket de la posición 2 de la tabla
		 * Si la clase, o llave, es null(Sólo se permite insertar un elemento con clave o llave null), ese elemento va directamente a la posición 0 de la tabla
		 * Antes de insertar un nuevo elemento en la tabla de buckets de un HashMap, si en la posición que se le asigna para ser insertado en la tabla contiene otros elementos, se compara el hashcode de su clave con los hashcodes de las claves de los elementos ya almacenados
		 * Si alguno de los hashcodes coincide, se invoca al método "equals" para verificar si se trata del mismo objeto y, en caso afirmativo, se modifica el valor de ese nuevo elemento
		 * En caso contrario, es decir, si no son el mismo objeto, se añade al final de la lista enlazada, o LinkedList, de esa posición de la tabla
		 * 
		 * Tabla de buckets que contienen listas enlazadas(LinkedList):
		 * 
		 * 0 - 2009640000, "raidentrance", "Es la cuenta de twitter" ---> 0, null, "Representa la auseencia de un objeto"
		 * 1
		 * 2 - 2301506, "java", "Esta aplicación está hecha en Java"
		 * 
		 * .
		 * .
		 * .
		 * 
		 * 15
		 */
	}
}
