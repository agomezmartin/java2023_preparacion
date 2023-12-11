package pruebas;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		/*System.out.println(st
				.parallel() //Stream<Integer>
				.count());*/		
		st
		.parallel()
		.filter(n->n>0)
		.sequential() //convierte stream paralelo en secuencial
		.forEach(System.out::println);

	}

}
