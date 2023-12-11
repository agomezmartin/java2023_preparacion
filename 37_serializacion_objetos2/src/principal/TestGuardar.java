package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Empleado;
import model.Persona;

public class TestGuardar {

	public static void main(String[] args) {
		String ruta="c:\\temp\\person.obj";
		Persona persona=new Persona("persona 1", "22222w", 30,new Empleado("A200"));
		try(FileOutputStream fos=new FileOutputStream(ruta);
				ObjectOutputStream out=new ObjectOutputStream(fos)){
			//guardamos objeto persona
			out.writeObject(persona);
			System.out.println("Persona guardada");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
