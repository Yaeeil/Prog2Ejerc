package HarryPotterCompleto;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private String nombre;
    private List<Alumno>alumnos;
    private int cantAlumnos;
    private int cantMaxAlumnos;
    private List<String>cualidadesNecesarias;

    public Casa(String nombre,int cantMaxAlumnos){
        this.nombre=nombre;
        this.cantMaxAlumnos=cantMaxAlumnos;
        cantAlumnos=0;
        alumnos=new ArrayList<Alumno>();
        cualidadesNecesarias=new ArrayList<String>();
    }



    public void agregarCualidad(String c){
        cualidadesNecesarias.add(c.toLowerCase());
    }
    public void agregarAlumno(Alumno a){


        if (cantAlumnos<cantMaxAlumnos && esAceptado(a) ){

                alumnos.add(a);
                cantAlumnos++;
                a.setCasa(this);
                //si el alumno cumple y tengo espacio lo agrego


        }
        else{
            System.out.println("el alumno no cumple con las condiciones necesarias");
        }

    }


    public boolean esAceptado(Alumno a){

        if(a.getCualidades().containsAll(cualidadesNecesarias) && a.getCasa()==null){
            return true;
        }
        else return false;
    }

    public void agregarFamiliarACasa(Alumno f){
        alumnos.add(f);
        cantAlumnos++;
    }

    public String toString(){
        return " casa: "+nombre+ "\n alumnos: "+ cantAlumnos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantMaxAlumnos(int cantMaxAlumnos) {
        this.cantMaxAlumnos = cantMaxAlumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void sumarAlumno(){
        cantAlumnos++;
    }
    public int getCantMaxAlumnos() {
        return cantMaxAlumnos;
    }

    public List<String> getCualidadesNecesarias() {
        return cualidadesNecesarias;
    }

}
