package com.zubiri.multiteca;

import java.util.Scanner;

public class Artista {

	private String nombre;
	private int aņoNacimiento;
	
	public Artista(){}

	/*public Artista(String nombre, int aņoNacimiento) {
	
		this.nombre = nombre;
		this.aņoNacimiento = aņoNacimiento;
	} */
	
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el aņo de nacimiento: ");
		setAņoNacimiento(sc.nextInt());
	}


	public String getNombre() {
		
		return nombre;
	}
	 public String formattedArtista(){
		String artista =
				"\nNombre:\t" + getNombre()
				+ "Aņo de nacimiento:\t" + getAņoNacimiento();
		
		return artista;
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


/*	public Artista(String nombre, int aņoNacimiento) {

this.nombre = nombre;
this.aņoNacimiento = aņoNacimiento;
}
*/
/*public Artista(String linedArtista, String separator){

 String[] strArray = linedArtista.split(separator);
 this.setNombre(strArray[0]);
 this.setAņoNacimiento(Integer.parseInt(strArray[1]));
}*/
