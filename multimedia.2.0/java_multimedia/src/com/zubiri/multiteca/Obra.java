package com.zubiri.multiteca;

import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int añoEdicion;
	
	Artistas artistas = new Artistas();
	Artista artista = new Artista();
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int añoEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.añoEdicion = añoEdicion;
	}
	
	public Obra(Scanner sc){
		System.out.println("Dime el nombre de la obra:");
		this.setTitulo(sc.next());
		System.out.println("dime el año de edicion:");
		this.setAñoEdicion(sc.nextInt());
		this.setAutor(new Artista(sc));
		Multiteca.sumarObra();
	}
	
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAñoEdicion() {
		
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		
		this.añoEdicion = añoEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public  String formattedObra() {
		String obra =
				
				"\nTítulo:\t" + this.getTitulo()
				+ "Año de edición:\t" + this.getAñoEdicion()
				 + artista.formattedArtista();
				
				return obra;
		
	} 
	
}