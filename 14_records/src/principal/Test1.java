package principal;
record Persona(String nombre, int edad) { //constructor canónico
	//String email; //no variables de instancia adicionales
	static int s=10; //variables de instancia si
	Persona{
		if(edad<0) {
			edad=18;
		}
	}
	
	Persona(){ //otro constructor
		/*this.nombre="h";
		this.edad=30;*/
		this("h",30); //se dan los valores mediante llamada al canónico
	}
	public void print() {
		s++;
		System.out.println(this.nombre);
	}
}

public class Test1 {

	public static void main(String[] args) {
		var r=new Persona("pepe",22);
		r.print();
	}

}
