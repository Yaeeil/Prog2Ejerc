package Tp5Ej3;
import java.util.ArrayList;
public class Cereales {
private String nombre;
private ArrayList <String> minerales;


public Cereales(String nombre, ArrayList<String> minerales) {
	this.nombre = nombre;
	this.minerales = minerales;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public ArrayList<String> getMinerales() {
	return minerales;
}
public void setMinerales(ArrayList<String> minerales) {
	this.minerales = minerales;
}

}
