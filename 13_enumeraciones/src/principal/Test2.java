package principal;
enum Dir{A,B;}
enum Direction implements Runnable{
	X(10),Y(20), Z(30);
	int inc;
	Direction(int inc) {
		this.inc=inc;
	}
	public void change(int s) {
		inc+=s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class Test2 {

	public static void main(String[] args) {
		var ob=Direction.X;
		ob.change(10);
		System.out.println(ob.inc);

	}

}
