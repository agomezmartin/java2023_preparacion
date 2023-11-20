package pruebas;

public class Test2 {
	public static void main(String[] args) {
		final String str1="hello ";
		final String str2="""
				hello
				""";
		final String str3="""
				hello""";
		final String str4="hello by";
		
		switch(args[0]) {
			case str1:
				System.out.print(0);
			case str2:
				System.out.print(1);
			case str3:
				System.out.print(2);
			case str4:
				System.out.print(3);
			default:
				System.out.print(4);
		}
	}
}
