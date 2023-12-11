package pruebas;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> lst=List.of(11,3,2,8,4,22,7,6);
		
		//implementar dos tareas que se ejecuten concurrentemente
		//una calcula al valor medio de la lista y otra
		//el mayor de los números
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.submit(()->
				System.out.println(lst.stream()
				.collect(Collectors.averagingDouble(n->n)))
				);
		executor.submit(()->
			System.out.println(lst.stream()
				.max((a,b)->a-b).orElse(-1))
		);

	}

}
