package com.zubiri.multiteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Artistas {

	static ArrayList<Artista> artistas = new ArrayList<Artista>();
	Scanner sc = new Scanner(System.in);
	
	//Artista artista = new Artista();
	public Artistas(){}
	
/*	public void crearArtista(){
		
		System.out.println("Introduce el nombre del artista: ");
		artista.setNombre(sc.next());
		System.out.println("Introduce el año de nacimiento: ");
		artista.setAñoNacimiento(sc.nextInt());
		
	}*/
	public static ArrayList<Artista> crearArtistas(Scanner sc){
		int opcion;
		System.out.println("¿Cuantos artistas son?: ");
		opcion = sc.nextInt();
		for (int a = 0; a < opcion; a++) {
		artistas.add(new Artista(sc));
		}
		return artistas;
		}
	
	
	public Artista buscarArtista(String nombre){
		Artista artista = null;
		if (artistas == null) {
			System.out.println("No se han cargado artistas en la lista....");
		}else {
			for (int i = 0; i < artistas.size(); i++) {
				if (artistas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					artista = artistas.get(i);
				}
			}
		}
		return artista;
	}
	
	public static void anadirArtista(Artista artista){
		artistas.add(artista);
		}
	//Getters y setters
		public ArrayList<Artista> getArtistas() {
			return artistas;
		}

		public void setArtistas(ArrayList<Artista> artistas) {
			this.artistas = artistas;
		}

	
}

