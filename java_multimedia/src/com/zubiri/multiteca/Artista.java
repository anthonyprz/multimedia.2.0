package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int a�oNacimiento;

	public Artista(String nombre, int a�oNacimiento) {
	
		this.nombre = nombre;
		this.a�oNacimiento = a�oNacimiento;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getA�oNacimiento() {
		
		return a�oNacimiento;
	}

	public void setA�oNacimiento(int a�oNacimiento) {
		
		this.a�oNacimiento = a�oNacimiento;
	}
	
}
