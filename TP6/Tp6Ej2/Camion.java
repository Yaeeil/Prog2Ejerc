package Tp6Ej2;

import java.util.ArrayList;

public class Camion extends colaDeEspera {
	int orden;
	
	
	public Camion(String nombre, int orden) {
		super(nombre);
		this.orden = orden;
	}
	   public void agregar(Object o) {
			Camion c1= (Camion) o;
			 ArrayList <Camion> cc= new ArrayList <Camion>();
			      int i = 0;
		            while (i < cc.size() && c1.getOrden()>cc.get(i).getOrden()) {
		                i++;
		            }

		            cc.add(i, c1);
		        }
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}

}
