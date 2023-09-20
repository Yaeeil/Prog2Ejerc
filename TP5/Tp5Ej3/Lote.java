package Tp5Ej3;
import java.util.ArrayList;
public class Lote {
private int hect;
String nombre;
private ArrayList<String> minerales;

public Lote(int hect, String nombre,  ArrayList<String> minerales) {
	this.nombre=nombre;
	this.hect = hect;
	this.minerales = minerales;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getHect() {
	return hect;
}
public void setHect(int hect) {
	this.hect = hect;
}
public ArrayList<String> getMinerales() {
	return minerales;
}
public void setMinerales(ArrayList<String> minerales) {
	this.minerales = minerales;
}

}
