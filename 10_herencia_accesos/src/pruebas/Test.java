package pruebas;

class C1{
	int x;
	public C1(){
		x++;
	}
	String print() {return "hello";}
}
class C2 extends C1{
	int x;
	int y=10;
	public C2(){	
		x++;
		super.x++; //2
	}
	String print() {return "by";}
}
public class Test {
	public static void main(String[] args) {
		C1 c=new C2();
		System.out.print(c.x);//ocultación, se ve la x del padre con la variable del tipo del padre
		System.out.println(c.print());//sobrescritura
		System.out.print(c.y); //NO
		System.out.println(((C2)c).y);
	}

}
