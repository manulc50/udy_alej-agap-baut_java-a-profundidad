package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverDatosDuplicados {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(6, 6, 6, 5, 88, 56, 100);
		
		// Usando streams y el método "distinct"
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
		
		// Usando streams y una colección de tipo Set(Conjunto)
		// Las colecciones de tipo Set(Conjuntos) no permiten que hayan elementos duplicados(tampoco mantienen el orden de los elementos en función del momento de su inserción en el Set)
		System.out.println(numbers.stream().collect(Collectors.toSet()));
	}
}
