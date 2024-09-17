package colecciones;

import java.util.Arrays;
import java.util.List;

// El caracter Wildcard(?) indica que se puede usar cualquier tipo de dato

public class EjemploGenericosEnMetodos {
	
	// Este método sólo puede sumar datos de tipo Double
	static double sumarValores(List<Double> valores) {
		double suma = 0.0;
		for(Double valor: valores)
			suma += valor;
		return suma;
	}
	
	// Este método puede sumar cualquier dato que herede la clase Number, es decir, puede sumar cualquier tipo de dato numérico
	// Ésto es posible gracias al wildcard "? extends Number"
	static double sumarValores2(List<? extends Number> valores) {
		double suma = 0.0;
		for(Number valor: valores)
			suma += valor.doubleValue();
		return suma;
	}
	
	public static void main(String[] args) {
		double suma1 = EjemploGenericosEnMetodos.sumarValores(Arrays.asList(10.45, 11.23));
		System.out.println("Suma: " + suma1);
		double suma2 = EjemploGenericosEnMetodos.sumarValores2(Arrays.asList(10.45, 11.23, Integer.valueOf(10), Float.valueOf(3.7f)));
		System.out.println("Suma: " + suma2);
	}
}
