package TP4Ej5;

public class CongAire extends ProductoRef {
private int porcN;
private int porcO;
private int porcD;
private int vaporAgua;

public CongAire(String fechaV, int lote, String granja, String fechaE, int cod, int temp, int porcN, int porcO,
		int porcD, int vaporAgua) {
	super(fechaV, lote, granja, fechaE, cod, temp);
	this.porcN = porcN;
	this.porcO = porcO;
	this.porcD = porcD;
	this.vaporAgua = vaporAgua;
}

public int getPorcN() {
	return porcN;
}

public void setPorcN(int porcN) {
	this.porcN = porcN;
}

public int getPorcO() {
	return porcO;
}

public void setPorcO(int porcO) {
	this.porcO = porcO;
}

public int getPorcD() {
	return porcD;
}

public void setPorcD(int porcD) {
	this.porcD = porcD;
}

public int getVaporAgua() {
	return vaporAgua;
}

public void setVaporAgua(int vaporAgua) {
	this.vaporAgua = vaporAgua;
}
public String toString() {
	return super.toString() +  " Porcentaje D: " + this.getPorcD() + 
			" Porcentaje N: " + this.getPorcN() + " Porcentaje O: " + this.getPorcO() + " Vapor Agua: " + this.getVaporAgua();
}
	
}
