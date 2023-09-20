package TP4Ej6;
import java.util.ArrayList;

public class Persona {

private String nombre;
private String apellido;
private int edad;
public Persona( String nombre, String apellido, int edad) {

	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

public static void mostrarListado(ArrayList<Persona> pp) {
	for(int i=0; i<pp.size(); i++) {
		System.out.println(pp.get(i));
		
	}
}
@Override
public String toString() {
	return " Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + 
			" Edad: " + this.getEdad() + " Cargo: " + this.getClass() + "/n";
}
	public static void main(String [] args) {
		Persona e1=new Empleado( "Juan", "Riso", 33, 225678, 300000);
		Persona e2=new Empleado( "Juana", "Risos", 23, 225675, 250000);
		Persona j1=new Jerarquico( "Alberto", "Doto", 53, 115675, 500000, new ArrayList<Empleado>() );
		Persona u1=new Usuario("Rita", "Risa", 46, "LaRita", "RitaRisa");
	ArrayList<Persona> pp=new ArrayList <Persona>();
	pp.add(e1);
	pp.add(e2);
	pp.add(u1);
	pp.add(j1);
	mostrarListado(pp);
	
	}

}
