package model;

import java.io.Serializable;



public class Persona implements Serializable{
	private String nombre;
	private String dni;
	private transient int edad;
	private transient Empleado emp;
	public Persona() {}
	
	public Persona(String nombre, String dni, int edad, Empleado emp) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.emp = emp;
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

	public Empleado getEmp() {
		return emp;
	}

	public void setEmp(Empleado emp) {
		this.emp = emp;
	}
	
}
