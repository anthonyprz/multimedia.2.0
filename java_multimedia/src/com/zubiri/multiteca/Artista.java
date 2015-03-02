package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int aņoNacimiento;

	public Artista(String nombre, int aņoNacimiento) {
	
		this.nombre = nombre;
		this.aņoNacimiento = aņoNacimiento;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAņoNacimiento() {
		
		return aņoNacimiento;
	}

	public void setAņoNacimiento(int aņoNacimiento) {
		
		this.aņoNacimiento = aņoNacimiento;
	}
	
}
