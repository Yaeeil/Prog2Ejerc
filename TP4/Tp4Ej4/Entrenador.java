package Tp4Ej4;

public class Entrenador extends Integrante {
String federacion;

public Entrenador(String nombre, String apellido, int pasaporte, String fechaNac, boolean concentrando, String paisOrigen, String paisAhora, String federacion) {
	super(nombre, apellido, pasaporte, fechaNac, concentrando, paisOrigen,paisAhora);
	this.federacion=federacion;
}

public String getFederacion() {
	return federacion;
}

public void setFederacion(String federacion) {
	this.federacion = federacion;
}
public void infoE() {
	System.out.println(" Federacion: " + getFederacion());
}

}
