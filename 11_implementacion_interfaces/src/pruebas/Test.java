package pruebas;

interface I1{
	default void m() {
		
	}
}
interface I2{
	default void m() {
		
	}
}
public class Test implements I1,I2 {

	public void m() {}

}
