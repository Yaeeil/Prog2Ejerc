package Tp9Ej4;
import java.util.ArrayList;

public abstract class ElementosS {
	String nombre;
	
	public ElementosS(String nombre) {
		this.nombre=nombre;
	}
	

	public abstract ArrayList <ElementosS> Busqueda(Filtro F);
	public abstract int getTamanio();
	public abstract ElementosS copias(Filtro f);


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}