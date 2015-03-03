package com.zubiri.multiteca;

import java.util.Scanner;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	public Libro(){}
	
	public Libro(String titulo, Artista autor, int añoEdicion, String editorial, int numPaginas) {
		
	}
	public Libro(Scanner sc){
		super();
		System.out.println("Añadir la editorial");
		this.setEditorial(sc.next());
		System.out.println("Dime el puto numero de paginas:");
		this.setNumPaginas(sc.nextInt());
		
	}
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	public String formattedObra() {
		String libro =
				"\nEditorial:\t" + this.getEditorial()
				+ "num Paginas:\t" + this.getAñoEdicion();
			//	 + formattedObra();
				
				return libro;
	}

}
