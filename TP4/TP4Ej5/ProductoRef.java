package TP4Ej5;

public class ProductoRef extends AvicolaPFrescos {
private int cod;
private int temp;
public ProductoRef(String fechaV, int lote, String granja, String fechaE, int cod, int temp) {
	super(fechaV, lote, granja, fechaE);
	this.cod = cod;
	this.temp = temp;
}
public int getCod() {
	return cod;
}
public void setCod(int cod) {
	this.cod = cod;
}
public int getTemp() {
	return temp;
}
public void setTemp(int temp) {
	this.temp = temp;
}
public String toString() {
	return super.toString() +  " Codigo: " + this.getCod() + " Temperatura: " + this.getTemp();
}


}
