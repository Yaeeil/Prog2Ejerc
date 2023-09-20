package TP4Ej5;

public class CongeladoNit extends ProductoRef {
private String metodoCong;
private int tiempoE;
public CongeladoNit(String fechaV, int lote, String granja, String fechaE, int cod, int temp, String metodoCong,
		int tiempoE) {
	super(fechaV, lote, granja, fechaE, cod, temp);
	this.metodoCong = metodoCong;
	this.tiempoE = tiempoE;
}
public String getMetodoCong() {
	return metodoCong;
}
public void setMetodoCong(String metodoCong) {
	this.metodoCong = metodoCong;
}
public int getTiempoE() {
	return tiempoE;
}
public void setTiempoE(int tiempoE) {
	this.tiempoE = tiempoE;
}
public String toString() {
	return super.toString() +  " Metodo cong: " + this.getMetodoCong() + " Tiempo exposicion: " + this.getTiempoE();
}


}
