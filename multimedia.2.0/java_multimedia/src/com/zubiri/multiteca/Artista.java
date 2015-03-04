package com.zubiri.multiteca;

import java.util.Scanner;

public class Artista {

	private static  String nombre;
	private static  int añoNacimiento;
	
	public Artista(){}

	public Artista(String nombre, int añoNacimiento) {
	
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
	} 
	
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el año de nacimiento: ");
		setAñoNacimiento(sc.nextInt());
	}

	 public String formattedArtista(){
		String artista =
				"\nNombre del artista: \t" + getNombre()
				+ " Año de nacimiento: \t" + getAñoNacimiento();
		
		return artista;
	}
	public static String getNombre() {
			
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