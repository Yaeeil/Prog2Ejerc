package Tp6Ej2;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList <colaDeEspera> barcos;
    private ArrayList  <colaDeEspera> camiones;
 

    public Puerto(String nombre) {
        this.nombre = nombre;
        barcos = new ArrayList<>();
        camiones = new ArrayList<>();
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public static void agregarB(colaDeEspera c) {
    	
    }



    public static void main(String[] args) {
    	 Puerto pp = new Puerto("Puerto1");
        
        System.out.println("Nombre del Puerto: " + pp.getNombre());
        
        // Crear instancias de Barco y Camion
        colaDeEspera b1 = new Barco("B1", 10000);
        colaDeEspera b2 = new Barco("B2", 200000);
        colaDeEspera c3 = new Camion("C3", 2);
        colaDeEspera c4 = new Camion("C4", 1);
      
      //tengo problemas con el metodo agregar? le erre en algo? como lo soluciono?
    }


}
