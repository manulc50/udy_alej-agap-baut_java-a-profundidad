package java8.streams;

import java.util.stream.IntStream;

// Podemos usar IntStream, DoubleStream, LongStreams, etc..., para generar un flujo de datos primitivos

public class PrimitiveStreams {
	public static void main(String[] args) {
		// Con progrmación imperativa(clásica)
		for(int i = 0; i < 10; i++)
			System.out.println(i);
		System.out.println();
		
		// Usando Primitive Streams y programación funcional
		IntStream.range(0, 10).forEach(num -> System.out.println(num));
	}
}
