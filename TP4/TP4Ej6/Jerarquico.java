package TP4Ej6;
import java.util.ArrayList;
public class Jerarquico extends Persona{
private	int numeroL;
private	int sueldo;
private ArrayList<Empleado> empleados;
public Jerarquico( String nombre, String apellido, int edad, int numeroL, int sueldo, ArrayList<Empleado> empleados) {
	super(nombre,apellido,edad);
	this.numeroL = numeroL;
	this.sueldo = sueldo;
	this.empleados = new ArrayList <Empleado>();
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
public ArrayList<Empleado> getEmpleados() {
	ArrayList<Empleado> aux=new ArrayList <Empleado>();
	for(int i=0; i<empleados.size(); i++) {
		aux.add(empleados.get(i));
	}
	return aux;
}


	



}
