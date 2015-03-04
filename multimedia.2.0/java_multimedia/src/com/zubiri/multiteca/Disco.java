package com.zubiri.multiteca;

import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int añoEdicion, String discografia, int nCanciones) {
		
	}
	public Disco(Scanner sc){
		super(sc);
		System.out.println("introduce la discografia");
		this.setDiscografia(sc.next());
		System.out.println("introduce el numero de canciones");
		this.setNCanciones(sc.nextInt());
		
	}
	
	public String getDiscografia() {
		
		return discografia;
	}
	
	public void setDiscografia(String discografia) {
		
		this.discografia = discografia;
	}
	
	public int getNCanciones() {
		
		return nCanciones;
	}
	
	public void setNCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	public String formattedObra() {
		String disco =
				super.formattedObra()+
				"\nEditorial:\t" + this.getDiscografia()
				+ "num Paginas:\t" + this.getNCanciones();
				return disco;
	}
}
