package Tp3E13;

public class Personajes {
String nombreR;
String nombreS;
boolean visN;
int vel;
double peso;
double altura;
int fuerza;

public Personajes(String nombreR,String nombreS, boolean visN, int vel, double peso, double altura, int fuerza) {
	this.nombreR=nombreR;
	this.nombreS=nombreS;
	visN=true;
	this.vel=vel;
	this.peso=peso;
	this.altura=altura;
	this.fuerza=fuerza;
	
}

public String getNombreR() {
	return nombreR;
}

public void setNombreR(String nombreR) {
	this.nombreR = nombreR;
}

public String getNombreS() {
	return nombreS;
}

public void setNombreS(String nombreS) {
	this.nombreS = nombreS;
}

public boolean isVisN() {
	return visN;
}

public void setVisN(boolean visN) {
	this.visN = visN;
}

public int getVel() {
	return vel;
}

public void setVel(int vel) {
	this.vel = vel;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public int getFuerza() {
	return fuerza;
}

public void setFuerza(int fuerza) {
	this.fuerza = fuerza;
}

}
