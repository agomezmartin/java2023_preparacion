package pruebas;

import java.util.List;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		/*List<Integer> lst=List.of(8,1,-2,6,5,11,9,-3,5,8);
		lst.stream()
		.peek(System.out::println) //Stream<Integer>
		.anyMatch(n->n<0); //boolean*/
		//List<Integer> lst=List.of(8,1,-2,6,5,11,9,-3,5,8);
		Stream.of(8,1,-2,6,5,11,9,-3,5,8)
		.filter(n->n>0)
		.peek(System.out::println)
		.count();

	}

}
