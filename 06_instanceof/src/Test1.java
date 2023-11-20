
class C1{}
interface I1{}
class C2 extends C1 implements I1{}
interface I2{}
class C3 extends C1{}
public class Test1 {

	public static void main(String[] args) {
		C1 c=new C2();
		System.out.println(c instanceof C2);
		System.out.println(c instanceof I1);
		System.out.println(c instanceof I2);
		System.out.println(c instanceof C3);
	}

}
