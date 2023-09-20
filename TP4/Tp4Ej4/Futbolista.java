package Tp4Ej4;

public class Futbolista extends Integrante {
String pos;
String hab;
int goles;



public Futbolista(String nombre, String apellido, int pasaporte, String fechaNac, boolean concentrando, String paisOrigen, String paisAhora, String pos, String hab, int goles) {
	super(nombre, apellido, pasaporte, fechaNac, concentrando, paisOrigen,paisAhora);
	this.pos=pos;
	this.hab=hab;
	this.goles=goles;
}

public void infoF() {
	System.out.println(" Posicion: " + getPos() + " Habilidad: " + getHab() + " Goles: " + getGoles());
}


public String getPos() {
	return pos;
}



public void setPos(String pos) {
	this.pos = pos;
}



public String getHab() {
	return hab;
}



public void setHab(String hab) {
	this.hab = hab;
}



public int getGoles() {
	return goles;
}



public void setGoles(int goles) {
	this.goles = goles;
}
}
