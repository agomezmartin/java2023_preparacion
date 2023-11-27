package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestListas {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>(List.of(2,5,7,1,7));
		System.out.print(lst.remove(2));//7
		System.out.println(lst.get(0));//2

	}

}
