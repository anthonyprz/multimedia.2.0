package com.zubiri.multiteca;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int a�oEdicion;
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int a�oEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.a�oEdicion = a�oEdicion;
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
	
	public String formattedObra() {
		
	}
}