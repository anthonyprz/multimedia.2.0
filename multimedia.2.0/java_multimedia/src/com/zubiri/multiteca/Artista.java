package com.zubiri.multiteca;

import java.util.Scanner;

public class Artista {

	private static  String nombre;
	private static  int aņoNacimiento;
	
	public Artista(){}

	public Artista(String nombre, int aņoNacimiento) {
	
		this.nombre = nombre;
		this.aņoNacimiento = aņoNacimiento;
	} 
	
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el aņo de nacimiento: ");
		setAņoNacimiento(sc.nextInt());
	}

	 public String formattedArtista(){
		String artista =
				"\nNombre del artista: \t" + getNombre()
				+ " Aņo de nacimiento: \t" + getAņoNacimiento();
		
		return artista;
	}
	public static String getNombre() {
			
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