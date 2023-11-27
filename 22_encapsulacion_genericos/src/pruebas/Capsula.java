package pruebas;

public class Capsula<X> {
	X dato;
	public Capsula(X dato) {
		this.dato=dato;
	}
	
	public X getDato() {
		return dato;
	}
	
	public void setDato(X dato) {
		this.dato=dato;
	}
	
	public boolean isNull() {
		return dato==null;
	}
}
