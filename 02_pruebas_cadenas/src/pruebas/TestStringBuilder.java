package pruebas;

public class TestStringBuilder {

	public static void main(String[] args) {
		/*StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("by");
		//StringBuilder sb3=sb1+sb2; //no
		StringBuilder s3=new StringBuilder(sb1+" "+sb2);*/
		
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("hello");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1.compareTo(sb2)==0);//true
		
		
		
		StringBuilder a=new StringBuilder("hello by");
		String b="hello";
		System.out.println(b.equals(a.delete(5,8).toString()));
		StringBuilder w=new StringBuilder(50);
		System.out.println(w.length());
	}

}
