package arreglos;

public class EjemploArreglosIrregulares {
	
	/*
	 * 10
	 * 10 20
	 * 30 40 50
	 * 50 50
	 */
	public static void main(String[] args) {
		int array[][] = new int[4][];
		
		array[0] = new int[1];
		array[0][0] = 10;
		
		array[1] = new int[2];
		array[1][0] = 10;
		array[1][1] = 20;
		
		array[2] = new int[3];
		array[2][0] = 30;
		array[2][1] = 40;
		array[2][2] = 50;
		
		array[3] = new int[2];
		array[3][0] = 50;
		array[3][1] = 50;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++)
				System.out.print(array[i][j] + "\t");
			System.out.println();
		}
		System.out.println();
		
		for(int[] fila: array) {
			for(int num: fila)
				System.out.print(num + "\t");
			System.out.println();
		}
	}

}
