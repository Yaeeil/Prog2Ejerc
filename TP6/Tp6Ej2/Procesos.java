package Tp6Ej2;

public class Procesos extends Computadora {
boolean disponible;
int memoria; 
int velocidad;



public Procesos(String nombre, boolean disponible, int memoria, int velocidad) {
	super(nombre);
	this.disponible=disponible;
	this.memoria=memoria;
	this.velocidad=velocidad;
	
}

public boolean estadoD() {
	if(disponible==true) {
		return true;
	}
	return false;
}

public boolean isDisponible() {
	return disponible;
}

public void setDisponible(boolean disponible) {
	this.disponible = disponible;
}

public int getMemoria() {
return memoria;
}

public void setMemoria(int memoria) {
this.memoria = memoria;
}

public int getVelocidad() {
return velocidad;
}

public void setVelocidad(int velocidad) {
this.velocidad = velocidad;
}
}
