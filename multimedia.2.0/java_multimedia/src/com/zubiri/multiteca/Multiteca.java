package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	public Multiteca() {
		
	}

	public Multiteca(ArrayList<Obra> multiteca) {
		Multiteca.multiteca = multiteca;
	}
	
	public static void setMultiteca(ArrayList<Obra> multiteca) {
		Multiteca.multiteca = multiteca;
		}
	
	 public static void addObra(Scanner sc){
		 int opcion;
		 System.out.println("¿Que tipo de obra quieres añadir?");
		 System.out.println("Pelicula------------------------1");
		 System.out.println("Libro---------------------------2");
		 System.out.println("Disco---------------------------3");
		 opcion = sc.nextInt();
		 switch (opcion) {
			 case 1:
			 multiteca.add(new Pelicula(sc));
			 break;
			 case 2:
			 multiteca.add(new Libro(sc));
			 break;
			 case 3:
			 multiteca.add(new Disco(sc));
			 default:
			 break;
		 }
	}
	 
	 public Obra obtainObraTitulo(String titulo){
		 Obra obra = null;
		 for (int i = 0; i < multiteca.size(); i++) {
		 if (multiteca.get(i).getTitulo().equalsIgnoreCase(titulo)) {
		 obra = multiteca.get(i);
		 }
		 }
		 return obra;
		 }
	 public Obra obtainObraAutor(String nombre){
		 Obra obra = null;
		 for (int l = 0; l < multiteca.size(); l++) {
		 multiteca.get(l).getAutor();
		 if (Artista.getNombre().equalsIgnoreCase(nombre)){
		 obra = multiteca.get(l);
		 }
		 }
		 return obra;
		 }
	 
	 public static void sumarObra(){
		 setNumObras(numObras++);
		 }
	 
	 public static int getNumObras() {
		 return numObras;
		 }
	 public static void setNumObras(int numObras) {
		 Multiteca.numObras = numObras;
		 }
	public ArrayList<Obra> getMultiteca() {
		 return multiteca;
	}
	
	public void addObra(Obra obra) {
		
	}
	
	public Obra obtainObra(int index) {
		 return multiteca.get(index - 1);
	}
	
	
//	public static counter() {}
	
	public static String formattedMultiteca() {
		String multitecaFormateada =
				"\n*******************************************" +
				"\n*----------Multiteca al completo----------*";
				for (int f = 0; f < multiteca.size(); f++) {
				multitecaFormateada += multiteca.get(f).formattedObra() + "\n" 
				+ "--------------------------------------------------";
				}
				multitecaFormateada +=
				"\n*------------------FIN--------------------*";
				return multitecaFormateada;

	}
	
}
