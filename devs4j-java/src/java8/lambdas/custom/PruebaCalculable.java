package java8.lambdas.custom;

public class PruebaCalculable {
	public static void main(String[] args) {
		
		// Sin usar lambas y usando clases anónimas
		// Como Calculable es una interfaz, podemos implementarla usando clases anónimas
		/*Calculable cal = new Calculable() {

			// Realiza y devuelve la media de los números que se reciben como argumentos de entrada
			// La expresión "double ...numbers" del argumento de entrada de este método se denomina "varargs" y significa que a este método se le puede pasar un número indeterminado, o variable, de argumentos de entrada(En este caso de tipo double)
			// Los "varargs" se tratan igual que los arreglos o arrays
			@Override
			public double avg(double... numbers) {
				double sum = 0.0;
				for(int i = 0; i < numbers.length; i++)
					sum += numbers[i];
				return sum / numbers.length;
			}
			
		};*/
		
		// Usando funciones lambda
		// Como Calculable es una interfaz funcional(aquellas que sólo tiene un método sin implementar), podemos usar funciones lambda para implementarla
		Calculable cal = numbers -> {
			double sum = 0.0;
			for(int i = 0; i < numbers.length; i++)
				sum += numbers[i];
			return sum / numbers.length;
		};
		
		System.out.println(cal.avg(10, 20, 30));
	}
}
