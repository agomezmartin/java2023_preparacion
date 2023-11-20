package pruebas;

public class Text1 {
	public static void main(String[] args){
		Integer data=10;
		int n=2;
		switch(data/n){
			case 1,3->
				System.out.print("low ");
			case 4,5->
				System.out.print("medium ");
			case 6,7,9->
				System.out.print("high");
		}
	}
}
