package statics;

// Las importaciones static, o estáticas, nos permiten usar métodos y atributos estáticos de una clase en otra como si estuvieran definidas, o declaras, en esa otra clase
// Es decir, nos permiten usar esos métodos y atributos estáticos sin usar el operador de acceso "."

//import static java.lang.Math.sqrt;
//import static java.lang.Math.pow;
import static java.lang.Math.*;

public class StaticImports {
	public static void main(String[] args) {
		System.out.println(sqrt(25));
		System.out.println(pow(9,2));
		System.out.println(PI);
	}
}
