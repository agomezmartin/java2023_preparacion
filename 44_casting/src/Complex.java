import java.util.List;

public class Complex {
	class Building {}
	final class House extends Building {}
	public void convert() {
		Object ob=6.7;
		Integer n=(Integer)ob;
		
		
		Building b1 = new Building();
		House h1 = new House();
		Building b2 = new House();
		Building b3 = (House) b1;
		House h2 = (Building) h1;
		Building b4 = (Building) b2;
		House h3 = (House) b2;
	} 
	List<Number> process(List<Number> nums){
		//code
	}
	List<Number> process(List<Integer> nums){//code
		
	}
}
