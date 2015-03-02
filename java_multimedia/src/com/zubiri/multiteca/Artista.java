package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int añoNacimiento;
	
	public Artista(){}

/*	public Artista(String nombre, int añoNacimiento) {
	
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
	}
	*/
	public Artista(String linedArtista, String separator){
		
		 String[] strArray = linedArtista.split(separator);
		 this.setNombre(strArray[0]);
		 this.setAñoNacimiento(Integer.parseInt(strArray[1]));
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAñoNacimiento() {
		
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		
		this.añoNacimiento = añoNacimiento;
	}
	
}
