package wrapper;

public class MétodosDeConversion {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer x = 10;
		double d = x.doubleValue();
		float f = x.floatValue();
		long l = x.longValue();
		
		String valor = "10";
		int val = Integer.parseInt(valor);
		System.out.println(val);
		
		Double d2 = Double.valueOf("55");
		System.out.println(d2);
	}
}
