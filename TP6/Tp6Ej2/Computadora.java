package Tp6Ej2;

import java.util.ArrayList;

public class Computadora extends colaDeEspera {
ArrayList <Procesos> p;

  
    public Computadora(String nombre) {
	super(nombre);
	ArrayList <Procesos> p=new ArrayList <Procesos>();
}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

@Override
	   public void agregar(Object o) {
		 Procesos c= (Procesos) o;
			 ArrayList <Procesos> CDis= new ArrayList <Procesos>();
			 ArrayList <Procesos> CNoDis= new ArrayList <Procesos>();
			 if(c.estadoD()) {
			      int i = 0;
		            while (i < CDis.size() && c.getMemoria()>CDis.get(i).getMemoria()) {
		                i++;
		            }

		            CDis.add(i, c);
		        }
			 else if(!c.estadoD()) {
				 int i = 0;
		            while (i < CNoDis.size() && c.getVelocidad()>CNoDis.get(i).getVelocidad()) {
		                i++;
		            }

		            CNoDis.add(i, c);
			 }
			 }

}