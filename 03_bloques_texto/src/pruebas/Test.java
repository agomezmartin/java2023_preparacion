package pruebas;

public class Test {

	public static void main(String[] args) {
		String cad="""
				hello
				by""";
		System.out.println(cad.length()); //8
		
		String sql="""
				select * from \
				Empleados \
				Where nombre="paco"		
				""";
		System.out.println(sql);
	}

}
