package Tp5Ej4;

public class Contribuyente {
String nombre;
int codigoTrib;
int montofijo;
public Contribuyente(String nombre, int codigoTrib, int montofijo) {
	this.nombre = nombre;
	this.codigoTrib = codigoTrib;
	this.montofijo = montofijo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCodigoTrib() {
	return codigoTrib;
}
public void setCodigoTrib(int codigoTrib) {
	this.codigoTrib = codigoTrib;
}
public int getMontofijo() {
	return montofijo;
}
public void setMontofijo(int montofijo) {
	this.montofijo = montofijo;
}

public int impuesto() {
return this.getMontofijo();	
}
	
}
