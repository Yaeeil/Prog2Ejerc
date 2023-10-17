package Tp9Ej5;

import java.util.ArrayList;
import java.util.Comparator;

public class Seguro extends SeguroAbstracto{
	private int poliza;
	private double monto;
	private Costo c;
	
	public Seguro(String descripcion, int dni, int poliza, double monto,  Costo c) {
		super(descripcion,dni);
		this.poliza=poliza;
		this.monto=monto;
		this.c=c;
	}

	public int getPoliza() {
		return poliza;
	}

	public void setPoliza(int poliza) {
		this.poliza = poliza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDni() {
		return dni;
	}

	

	public double getMonto() {
		return this.c.calcularCosto(monto);
	}


	public Costo getC() {
		return c;
	}

	public void setC(Costo c) {
		this.c = c;
	}

	@Override
	public ArrayList<SeguroAbstracto> busqueda(Filtro f, Comparator<SeguroAbstracto> c) {
		ArrayList <SeguroAbstracto> segurosLista=new ArrayList<>();
			if(f.Cumple(this)) {
				segurosLista.add(this);
			}
		 return segurosLista;
	}
	
	
	

}
