package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximosYMinimos {
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(6, 89, 90, 5, 88, 56, 100);
		
		// Usando programación imperativa(clásica)
		int min = numbers.get(0);
		for(Integer num: numbers) {
			if(num < min)
				min = num;
		}
		System.out.println("El valor más pequeño es " + min);
		
		// Usando streams y la interfaz Comparator con una ordenación natural
		min = Arrays.asList(6, 89, 90, 5, 88, 56, 100).stream().min(Comparator.naturalOrder()).get();
		System.out.println("El valor más pequeño es " + min);
	}
}
