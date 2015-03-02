package com.zubiri.multiteca;

public class Obra {
	
	private String titulo;
	private Artista autor;
	private int a�oEdicion;
	
	
	public Obra() {
		
	}
	
	/*public Obra(String titulo, Artista autor, int a�oEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.a�oEdicion = a�oEdicion;
	}*/
	public Obra(String linedObra, String separator) {

		String[] strArray = linedObra.split(separator);
		this.setTitulo(strArray[0]);		
		this.setAutor(new Artista(strArray[1],"-"));
		this.setA�oEdicion(Integer.parseInt(strArray[2]));
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
	
	public String formattedObra() {
		String obraStr =
				"titulo:" + this.titulo + "\n" +
				//"\t" + this.autor.formattedArtista() + "\n" +
				"a�o edicion:" + this.a�oEdicion + "\n" ;
				return obraStr;
				}
}