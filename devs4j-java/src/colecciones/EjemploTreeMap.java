package colecciones;

import java.util.TreeMap;

// TreeMap es una de las colecciones ordenadas, al igual que TreeSet
// Un TreeMap tiene la misma funcionalidad que un HashMap pero con la diferencia de que un TreeMap mantiene las claves, o llaves, de sus elementos ordenados de acuerdo a un orden natural

public class EjemploTreeMap {
	public static void main(String[] args) {
		// TreeMap que almacena elementos de pares clave-valor de tipo String-String
		TreeMap<String, String> map = new TreeMap<>();
		// A media que se agregan elementos a un TreeMap, realiza una ordenación natural por defecto de esos elementos en función de sus claves o llaves
		map.put("Zizu", "Futbolista");
		map.put("Alex", "Programador");
		map.put("Juan", "Hostelero");
		System.out.println(map); // Muestra los elementos del TreeMap ordenados en función del orden natural de sus claves o llaves
	}
}
