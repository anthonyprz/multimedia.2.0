package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int añoEdicion, String productora, ArrayList<Artista> interpretes) {
		super(titulo, autor, añoEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
	public Pelicula(Scanner sc){
		super(sc);
		System.out.println("introduce la productora");
		this.setProductora(sc.next());
		System.out.println("introduce el interprete");
		this.setInterpretes(Artistas.crearArtistas(sc));
		
	}
		
	public String getProductora() {
		
		return productora;
	}
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setProductora(String productora) {
		
		this.productora = productora;
	}
	
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	
	public String formattedObra() {
		String pelicula =
				super.formattedObra()+
				"\nproductora:\t" + this.getProductora()
				+ "interpretes:\t" + this.getInterpretes();
				return pelicula;
	}

}
