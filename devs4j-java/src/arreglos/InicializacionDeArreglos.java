package arreglos;

public class InicializacionDeArreglos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Inicialización de forma explícita
		String[] nombres = new String[2];
		nombres[0] = "raidentrance";
		nombres[1] = "devs4j";
		
		// Inicialización de forma implícita
		String nombres2[] = {"raidentrance", "devs4j"};
		
		// Inicialización de forma anónima
		String nombres3[] = new String[] {"raidentrance", "devs4j"};
	}
}
