package Tp5Ej2;

import java.util.ArrayList;

public class CasaLinaje extends Casa {
	ArrayList <Alumno> familiares;

	public CasaLinaje(String nombre, ArrayList<String> cualidades, int capacidadMaxima, ArrayList<Alumno> alumnos, ArrayList<Alumno> familiares) {
		super(nombre, cualidades, capacidadMaxima, alumnos);
		this.familiares=new ArrayList<>();
	}

	//redefino equals? como?
	  public boolean cumpleRequisitos(Alumno alumno) {
		  if(super.cumpleRequisitos(alumno)&& familiares.containsAll(alumno.getFamiliares())) {
			  return true;
		  }return false;
	    }
	  
	public ArrayList<Alumno> getFamiliares() {
			ArrayList <Alumno> aux= new ArrayList <Alumno>();
			for(int i=0; i<familiares.size(); i++) {
				aux.add(familiares.get(i));
			}
			return aux;
		}

}
