package TP4Ej5;

public class CongAgua extends ProductoRef {
private int salinidad;

public CongAgua(String fechaV, int lote, String granja, String fechaE, int cod, int temp, int salinidad) {
	super(fechaV, lote, granja, fechaE, cod, temp);
	this.salinidad = salinidad;
}

public int getSalinidad() {
	return salinidad;
}

public void setSalinidad(int salinidad) {
	this.salinidad = salinidad;
}

public String toString() {
	return super.toString() +  " Salinidad: " + this.getSalinidad();
}
}
