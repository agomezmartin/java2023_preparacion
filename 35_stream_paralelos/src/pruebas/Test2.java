package pruebas;

import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		//quitar duplicados y negativos, ordenar y mostrar
		st
		.parallel()
		.distinct() //p
		.filter(n->n>0) //p
		.sorted()//p :  1 5 6 8 9 11
		//.sequential()
		.forEachOrdered(System.out::println); //s

	}

}
