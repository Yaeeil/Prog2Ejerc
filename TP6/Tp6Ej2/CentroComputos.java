package Tp6Ej2;

import java.util.ArrayList;

public class CentroComputos {
    private String nombre;
    private ArrayList<colaDeEspera> computadoras;


    public CentroComputos(String nombre) {
        this.nombre = nombre;
        computadoras = new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public static void main(String[] args) {
        CentroComputos cc = new CentroComputos("CentroComputos1");
        System.out.println("Nombre del centro: " + cc.getNombre());

        //tengo problemas con el metodo agregar? le erre en algo? como lo soluciono?
    }
  
    }

