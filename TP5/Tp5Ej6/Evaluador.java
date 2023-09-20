package Tp5Ej6;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {

    private String nombre;
    private String apellido;
    private List<String> palabrasClave;
    private List<Trabajo> trabajos;
    public Evaluador(String nombre,String apellido) {
        this.nombre = nombre;
        palabrasClave=new ArrayList<>();
        trabajos=new ArrayList<>();
    }


    public void agregarPalabraClave(String p){
        if(!palabrasClave.contains(p) && p!= null)
            palabrasClave.add(p);
    }
    public void agregarTrabajo(Trabajo t){
        if(!trabajos.contains(t) && t!= null && t.esApto(this))
            trabajos.add(t);
    }
    public double getCantTrabajos(){
        return trabajos.size();
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
