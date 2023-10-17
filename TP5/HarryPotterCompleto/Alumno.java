package HarryPotterCompleto;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

        private String nombre;
        private List<Alumno>familiares;
        private List<String>cualidades;

        private Casa casa;//al crearse el alumno, este no tiene casa
        public Alumno(String nombre){
            this.nombre=nombre;
            familiares=new ArrayList<Alumno>();
            cualidades=new ArrayList<String>();
            this.casa=null;
        }

        public void agregarFamiliar(Alumno f){
            familiares.add(f);
        }
        public void agregarCualidad(String c){
            cualidades.add(c.toLowerCase());
        }


    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getFamiliares() {
        return familiares;
    }

    public List<String> getCualidades() {
        return cualidades;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    public String toString(){
            return " nombre: "+ nombre+"\n" +casa;
    }
}
