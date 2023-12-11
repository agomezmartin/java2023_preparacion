package principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Persona;

public class TestLeer {

	public static void main(String[] args) {
		String ruta="c:\\temp\\person.obj";
		try (FileInputStream fis=new FileInputStream(ruta);
				ObjectInputStream in=new ObjectInputStream(fis)){
			Persona persona=(Persona)in.readObject();
			System.out.println("Nombre: "+persona.getNombre());
			System.out.println("DNI: "+persona.getDni());
			System.out.println("Edad: "+persona.getEdad());
			System.out.println("Codigo: "+persona.getEmp());
		}
		catch(IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
