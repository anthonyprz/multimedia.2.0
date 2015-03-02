package com.zubiri.multiteca;

public class Obra {
	
	private String titulo;
	private Artista autor;
	private int añoEdicion;
	
	
	public Obra() {
		
	}
	
	/*public Obra(String titulo, Artista autor, int añoEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.añoEdicion = añoEdicion;
	}*/
	public Obra(String linedObra, String separator) {

		String[] strArray = linedObra.split(separator);
		this.setTitulo(strArray[0]);		
		this.setAutor(new Artista(strArray[1],"-"));
		this.setAñoEdicion(Integer.parseInt(strArray[2]));
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
	
	public String formattedObra() {
		String obraStr =
				"titulo:" + this.titulo + "\n" +
				//"\t" + this.autor.formattedArtista() + "\n" +
				"año edicion:" + this.añoEdicion + "\n" ;
				return obraStr;
				}
}