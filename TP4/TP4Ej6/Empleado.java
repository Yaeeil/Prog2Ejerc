package TP4Ej6;

public class Empleado extends Persona {
private int numeroL;
private int sueldo;
	public Empleado( String nombre, String apellido, int edad, int numeroL, int sueldo) {
		super( nombre,apellido,edad);
		this.numeroL = numeroL;
		this.sueldo = sueldo;
	}
	public int getNumeroL() {
		return numeroL;
	}
	public void setNumeroL(int numeroL) {
		this.numeroL = numeroL;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
