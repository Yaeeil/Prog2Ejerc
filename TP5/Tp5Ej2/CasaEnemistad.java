package Tp5Ej2;

import java.util.ArrayList;

public class CasaEnemistad extends Casa {
	ArrayList <Casa> enemistadas;

	public CasaEnemistad(String nombre, ArrayList<String> cualidades, int capacidadMaxima, ArrayList<Alumno> alumnos, ArrayList<Casa> enemistadas) {
		super(nombre, cualidades, capacidadMaxima, alumnos);
		this.enemistadas=new ArrayList<>();
	}
	
	//redefino equals? como?
	 public boolean cumpleRequisitos(Alumno alumno) {
		  if(super.cumpleRequisitos(alumno)&& !enemistadas.containsAll(alumno.getCasa())) {
			  return true;
		  }return false;
	    }
	  
	public ArrayList<Casa> getEnemistadas() {
			ArrayList <Casa> aux= new ArrayList <Casa>();
			for(int i=0; i<enemistadas.size(); i++) {
				aux.add(enemistadas.get(i));
			}
			return aux;
		}
	
}
