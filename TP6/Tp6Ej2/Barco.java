package Tp6Ej2;
import java.util.ArrayList;

public class Barco extends colaDeEspera {
    int capacidad;
 
    

    public Barco(String nombre, int capacidad) {
        super(nombre);
    	this.capacidad = capacidad;
    
    }


	 @Override
	   public void agregar(Object o) {
		 Barco b= (Barco) o;
		 ArrayList <Barco> b1= new ArrayList <Barco>();
		      int i = 0;
	            while (i < b1.size() && b.getCapacidad()>b1.get(i).getCapacidad()) {
	                i++;
	            }

	            b1.add(i, b);
	        }
		 

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


}