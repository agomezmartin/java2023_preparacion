interface M1{}
interface M2{}
class A implements M1,M2{}
public class TestInterfaces {

	public static void main(String[] args) {
	M1 m1=new A();
	Runnable m2=(Runnable)m1;

	}

}
