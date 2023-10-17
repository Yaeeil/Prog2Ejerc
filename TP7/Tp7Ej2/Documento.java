package Tp7Ej2;

import java.util.ArrayList;

public class Documento {
private String titulo;
private ArrayList<String>autores;
private ArrayList<String>palabrasC;
private String contenido;


public Documento(String titulo, String contenido) {
	this.titulo = titulo;
	this.autores = new ArrayList<>();
	this.palabrasC = new ArrayList<>();
	this.contenido = contenido;
}


public void añadirAutor(String autor) {
	autores.add(autor);
}

public void añadirPalabrasC(String palabra) {
	palabrasC.add(palabra);
}
public boolean tituloEsIgual(String tituloA) {
	return this.getTitulo().equalsIgnoreCase(tituloA);
}

public String autorDet(String autor) {
	if(this.getAutores().contains(autor)) {
		return this.getTitulo() + "del autor: "  + autor;
	}
	return "no lo contiene";
}

public boolean tituloContiene(String tituloA) {
	return this.getTitulo().contains(tituloA);
}

public boolean contenidoContiene(String contenido) {
	return this.getContenido().contains(contenido);
}

public boolean noContiene(String contenido) {
	return !this.getContenido().contains(contenido);
}



public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public ArrayList<String> getAutores() {
	return new ArrayList<String>(autores);
}




public ArrayList<String> getPalabrasC() {
	return new ArrayList<String>(palabrasC);
}



public String getContenido() {
	return contenido;
}


public void setContenido(String contenido) {
	this.contenido = contenido;
}

	public static void main(String [] args) {
		Documento d1=new Documento("titulo1", "este es el contenido numero 1");
		d1.añadirAutor("Juan Perez");
		d1.añadirAutor("Juanita Dominguez");
		d1.añadirPalabrasC("palabra 1");
		d1.añadirPalabrasC("palabra 2");
		Documento d2=new Documento("titulo2", "este es el contenido numero 2");
		d2.añadirAutor("Emilio Red");
		d2.añadirAutor("Juan Doyu"); 
		d2.añadirPalabrasC("palabra 3");
		d2.añadirPalabrasC("palabra 4"); 
		System.out.println("d1 contiene autor: ");
		System.out.println(d1.autorDet("Juan Perez") + " " + d1.autorDet("Juanita Dominguez") + " "+
		d1.autorDet("Jyuj"));
		System.out.println(" d2 contiene autor: ");
		System.out.println(d2.autorDet("Emilio Red") + " "+ d2.autorDet("Juan Perez"));
		System.out.println("d1 titulo es igual: ");
		System.out.println(d1.tituloEsIgual("Titulo1") + " " + d1.tituloEsIgual("titulo1") + " "+ 
		d1.tituloEsIgual("uhh"));
		System.out.println("d2 titulo es igual: ");
		System.out.println(d2.tituloEsIgual("Titulo2") + " " + d2.tituloEsIgual("titulo2")+ " " + d2.tituloEsIgual("uhh"));
		System.out.println("d1 titulo contiene: ");
		System.out.println(d1.tituloContiene("1") + " "+ d1.tituloContiene("2"));
		System.out.println(" d2 titulo contiene: ");
		System.out.println(d2.tituloContiene("1") + " " + d2.tituloContiene("2"));
		
		System.out.println("d1 contiene en contenido: ");
	
		System.out.println(d1.contenidoContiene("este") + " " + d1.contenidoContiene("papaya"));
		System.out.println("d2 contiene en contenido: ");
		System.out.println(d1.contenidoContiene("contenido") + " " + d1.contenidoContiene("papayas"));
		System.out.println("d1 no contiene: ");
		System.out.println(d1.noContiene("este") + " " + d1.noContiene("papaya"));
		System.out.println("d2 no contiene: ");
		System.out.println(d1.noContiene("este") + " " + d1.noContiene("papaya"));
		
		
	}

}
