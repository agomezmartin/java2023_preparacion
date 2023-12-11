package pruebas;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test2 {

	public static void main(String[] args) {
		//se puede cambiar la localización por defecto
		Locale.setDefault(Locale.ENGLISH);
		ResourceBundle rb=ResourceBundle.getBundle("textos", Locale.JAPAN);
		System.out.println(rb.getString("t1"));
		System.out.println(rb.getString("t2"));

	}

}
