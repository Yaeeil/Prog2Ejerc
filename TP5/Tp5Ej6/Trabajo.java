package Tp5Ej6;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {

    private String tipo;
    private List<String>palabrasClave;

    public Trabajo(String tipo) {
        this.tipo = tipo;
        palabrasClave=new ArrayList<>();
    }

    public boolean esApto(Evaluador e){
        return e.getPalabrasClave().containsAll(palabrasClave);
    }
    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public String getNombre() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.tipo = nombre;
    }
    public void agregarPalabraClave(String p){
        if(!palabrasClave.contains(p) && p!= null)
            palabrasClave.add(p);
    }
}
