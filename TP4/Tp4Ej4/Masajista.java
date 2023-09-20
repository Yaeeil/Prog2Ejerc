package Tp4Ej4;

public class Masajista extends Integrante {
String titulo;
int añosE;

public Masajista(String nombre, String apellido, int pasaporte, String fechaNac, boolean concentrando, String paisOrigen, String paisAhora,String titulo, int añosE) {
	super(nombre, apellido, pasaporte, fechaNac, concentrando, paisOrigen,paisAhora);
	this.titulo=titulo;
	this.añosE=añosE;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo( String titulo) {
	this.titulo = titulo;
}

public int getAñosE() {
	return añosE;
}

public void setAñosE(int añosE) {
	this.añosE = añosE;
}
public void infoM() {
	System.out.println(" Titulo: " + getTitulo() + " Años Exp: " + getAñosE());
}
}
