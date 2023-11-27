package principal;
//enum Dias{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES;}
public class Test1 {

	public static void main(String[] args) {
		enum Dias{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES;}
		Dias d=Dias.JUEVES;
		String result=switch(d){
			case LUNES,MARTES,MIERCOLES->"pronto";
			case JUEVES->"correcto";
			case VIERNES->"tarde";
		};

	}

}
