package com.zubiri.multiteca;

import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int a�oEdicion;
	
	Artistas artistas = new Artistas();
	Artista artista = new Artista();
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int a�oEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.a�oEdicion = a�oEdicion;
	}
	
	public Obra(Scanner sc){
		System.out.println("Dime el nombre de la obra:");
		this.setTitulo(sc.next());
		System.out.println("dime el a�o de edicion:");
		this.setA�oEdicion(sc.nextInt());
		this.setAutor(new Artista(sc));
		Multiteca.sumarObra();
	}
	
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getA�oEdicion() {
		
		return a�oEdicion;
	}

	public void setA�oEdicion(int a�oEdicion) {
		
		this.a�oEdicion = a�oEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public  String formattedObra() {
		String obra =
				
				"\nT�tulo:\t" + this.getTitulo()
				+ "A�o de edici�n:\t" + this.getA�oEdicion()
				 + artista.formattedArtista();
				
				return obra;
		
	} 
	
}