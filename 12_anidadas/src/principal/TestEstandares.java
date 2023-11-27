package principal;
class Externa2{
	static int n=5;
	int p=1;
	class Interna{
		public void print() {
			System.out.println(n+"-"+p);
		}
	}
}
public class TestEstandares {

	public static void main(String[] args) {
		Externa2.Interna in=(new Externa2()).new Interna();
		in.print();

	}

}
