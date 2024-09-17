package java8.lambdas.custom;

public interface Calculable {
	
	// Realiza y devuelve la media de los números que se reciben como argumentos de entrada
	// La expresión "double ...numbers" del argumento de entrada de este método se denomina "varargs" y significa que a este método se le puede pasar un número indeterminado, o variable, de argumentos de entrada(En este caso de tipo double)
	// Los "varargs" se tratan igual que los arreglos o arrays
	double avg(double ...numbers);
}
