package pruebas;

public class TestIgualdad {

	public static void main(String[] args) {
		/*String a="hello";
		String b="hello";
		String c=new String("by");
		String d=new String("by");
		System.out.println(a==b);
		System.out.println(c==d);*/
		
		
		//String x=new String("cadena");
		/*String a="cadena";
		String b=a.toLowerCase();
		String c=a.trim();
		StringBuilder sb=new StringBuilder(a);
		String d="cadena";
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a==sb.toString());*/
		
		/*String a="cadena";
		String b="CADENA";
		String c=b.toLowerCase();
		System.out.println(a==c);*/
		
		String s="";
		StringBuilder a=new StringBuilder("alt  ");
		String p=a.delete(0,5).toString();
		//System.out.println(p.isBlank()?s==p.trim():s==p);
		System.out.println(s==p);
		System.out.println(s==p.trim());
		
		
		String x="";
		String y="      ";
		System.out.println(x==y);
		System.out.println(x==y.trim());
	}

}
