package com.zubiri.multiteca;

import java.util.Scanner;

public class Artista {

	private static  String nombre;
	private static  int a�oNacimiento;
	
	public Artista(){}

	public Artista(String nombre, int a�oNacimiento) {
	
		this.nombre = nombre;
		this.a�oNacimiento = a�oNacimiento;
	} 
	
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el a�o de nacimiento: ");
		setA�oNacimiento(sc.nextInt());
	}

	 public String formattedArtista(){
		String artista =
				"\nNombre del artista: \t" + getNombre()
				+ " A�o de nacimiento: \t" + getA�oNacimiento();
		
		return artista;
	}
	public static String getNombre() {
			
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