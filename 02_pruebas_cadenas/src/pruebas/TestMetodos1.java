package pruebas;

public class TestMetodos1 {

	public static void main(String[] args) {
		String cad="hello ";
		String b="hello";
		System.out.println(b==cad.trim());//false

		String x="car";
		x.toUpperCase();
		System.out.println(x.equals("CAR"));//false
	}

}
