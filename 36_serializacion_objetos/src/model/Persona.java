package model;

import java.io.Serializable;

class Empleado{
	private String codigo;
	public Empleado() {}
	public Empleado(String codigo) {
		super();
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
}

public class Persona extends Empleado implements Serializable{
	private String nombre;
	private String dni;
	private transient int edad;
	public Persona() {}
	public Persona(String nombre, String dni, int edad, String codigo) {
		super(codigo);
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
