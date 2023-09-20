package Tp5Ej2;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;
    private ArrayList <Casa> casa;
  

    public Alumno(String nombre, ArrayList<String> cualidades, ArrayList<Alumno> familiares) {
        this.nombre = nombre;
        this.cualidades=new ArrayList <String>();
        this.familiares=new ArrayList <Alumno>();
        this.casa=new ArrayList<Casa>();
     
    }
    
    
    public ArrayList<String> getCualidades() {
    	ArrayList <String> aux= new ArrayList <String>();
		for(int i=0; i<cualidades.size(); i++) {
			aux.add(cualidades.get(i));
		}
		return aux;
	}
    
    public ArrayList<Casa> getCasa() {
    	ArrayList <Casa> aux= new ArrayList <Casa>();
		for(int i=0; i<casa.size(); i++) {
			aux.add(casa.get(i));
		}
		return aux;
	}



	public ArrayList<Alumno> getFamiliares() {
		ArrayList <Alumno> aux= new ArrayList <Alumno>();
		for(int i=0; i<familiares.size(); i++) {
			aux.add(familiares.get(i));
		}
		return aux;
	}


	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}