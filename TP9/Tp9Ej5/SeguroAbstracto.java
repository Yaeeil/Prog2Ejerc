package Tp9Ej5;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class SeguroAbstracto {
	String descripcion;
	int dni;
	
	public SeguroAbstracto( String descripcion, int dni) {
		this.descripcion = descripcion;
		this.dni = dni;
	}
	
	public abstract ArrayList <SeguroAbstracto> busqueda(Filtro f, Comparator<SeguroAbstracto> c);
	public abstract double getMonto();
	public abstract int getPoliza();
	

}
