package Tp7Ej1;

import java.util.ArrayList;

public class Producto {
private String nombre;
private ArrayList <Cultivo> cultivosDes;
private ArrayList <String> estadosPat;

public Producto(String nombre) {
	this.nombre = nombre;
	cultivosDes = new ArrayList<>();
	estadosPat=new ArrayList<>();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


public void addEstadoPat(String estado){
	this.estadosPat.add(estado);
}
	public void addCultivoDes (Cultivo c){
		this.cultivosDes.add(c);
	}
	
	public boolean contieneCultivoDesaconsejado(Cultivo c){
		return this.cultivosDes.contains(c);
	}
	public boolean trataEstadoPatologico(String estado){
		return estadosPat.contains(estado);
	}

public ArrayList<Cultivo> getCultivos() {
	ArrayList<Cultivo> aux=new ArrayList<>();
	for(int i=0; i<cultivosDes.size(); i++) {
		aux.add(cultivosDes.get(i));
	}
	return aux;
}



public ArrayList<String> getEstadosPat() {
	ArrayList<String> aux=new ArrayList<>();
	for(int i=0; i<estadosPat.size(); i++) {
		aux.add(estadosPat.get(i));
	}
	return aux;
}



public String toString() {
	return this.getNombre();
}



}
