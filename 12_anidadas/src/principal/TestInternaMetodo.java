package principal;

class Externa3{
	static int n=2;
	int p=10;
	public void pr() {
		int w=1; //se puede usar en la clase interna si no se modifica
		class Interna {
			int s=1;
			public void print() {
				System.out.println(s+"-"+n+"-"+p+"-"+w);
			}
		}
		Interna in=new Interna();
		in.print();
		
	}
}

public class TestInternaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
