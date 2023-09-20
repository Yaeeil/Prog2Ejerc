package Tp7Ej1;

import java.util.ArrayList;

public class Enfermedad {
private String nombre;
private ArrayList<String> estadosPat;
public Enfermedad(String nombre) {
	this.nombre = nombre;
	estadosPat = new ArrayList<>();
}
public ArrayList<String> getEstadosPat() {
	ArrayList<String> aux=new ArrayList<>();
	for(int i=0; i<estadosPat.size(); i++) {
		aux.add(estadosPat.get(i));
	}
	return aux;
}

public void addEstados(String estado){
	this.estadosPat.add(estado);
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public boolean trataEnfermedad(Producto p){
	for(int i=0; i<estadosPat.size(); i++) {
			if (!p.trataEstadoPatologico(estadosPat.get(i))){
				return false;
			}
	}
	return true;
}

}
