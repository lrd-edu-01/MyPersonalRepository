package com.cibertec.model;

public class Empleado {
	 int id ; 
	 String apellido; 
	 String nombre; 
	 int edad ; 
	 double salario; 
	 String sexo;
	 
	 public Empleado(){		
		}

	public Empleado(int id, String apellido, String nombre, int edad, double salario, String sexo) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	 
	 
}

