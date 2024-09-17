package herencia;

public class EjemploPersonas {
	
	public static void main(String args[]) {
		Estudiante e = new Estudiante(101415, "Alex", "19-08-1988");
		e.dormir();
		e.aprobar();
		e.suspender();
		System.out.println();
		
		Empleado emp = new Empleado(2300.54f, "Juan", "24-05-1990");
		emp.dormir();
		emp.trabajar();
		emp.cobrar();
	}

}
