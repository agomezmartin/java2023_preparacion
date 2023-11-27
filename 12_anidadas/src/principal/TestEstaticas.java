package principal;
class Externa{
	static int k=10;
	int s;
	static class Interna{
		public void print() {
			System.out.println(k);
			//s++; //no es estático, error compilación
		}
	}
	
}


public class TestEstaticas {

	public static void main(String[] args) {
		Externa.Interna in=new Externa.Interna();
		in.print();
	}

}
