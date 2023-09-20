package Tp7Ej1;

import java.util.ArrayList;

public class Cultivo {
private String nombre;
private ArrayList<Enfermedad> enfermedades;
	public Cultivo(String nombre) {
		this.nombre=nombre;
		enfermedades=new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addEnfermedad(Enfermedad e){
		this.enfermedades.add(e);
	}
	
	public boolean productoQuimicoEsUtil(Producto p){
		for(Enfermedad e: enfermedades){
			if (!p.contieneCultivoDesaconsejado(this) && e.trataEnfermedad(p)){
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean equals(Object o) {
		Cultivo otro = (Cultivo) o;
		return this.getNombre().equals(otro.getNombre());
	}
	
	public ArrayList<Enfermedad> getEnfermedades() {
			ArrayList<Enfermedad> aux=new ArrayList<>();
			for(int i=0; i<enfermedades.size(); i++) {
				aux.add(enfermedades.get(i));
			}
			return aux;
		}


}
