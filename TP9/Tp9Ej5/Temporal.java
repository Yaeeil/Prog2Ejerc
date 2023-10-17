package Tp9Ej5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Temporal extends SeguroAbstracto {
LocalDate fechaI;
LocalDate fechaF;
Seguro S;

	public Temporal(String descripcion, double monto,int dni, LocalDate fechaI, LocalDate fechaF, Seguro S ) {
		super(descripcion, dni);
		this.fechaI=fechaI;
		this.fechaF=fechaF;
		this.S=S;
		
	}

	public LocalDate getFechaI() {
		return fechaI;
	}

	public void setFechaI(LocalDate fechaI) {
		this.fechaI = fechaI;
	}

	public LocalDate getFechaF() {
		return fechaF;
	}

	public void setFechaF(LocalDate fechaF) {
		this.fechaF = fechaF;
	}

@Override
public ArrayList<SeguroAbstracto> busqueda(Filtro f, Comparator<SeguroAbstracto> c) {
	ArrayList <SeguroAbstracto> segurosLista=S.busqueda(f,c);
	
 return segurosLista;
}

@Override
public double getMonto() {
	double monto=S.getMonto();
	return monto;
	}

@Override
public int getPoliza() {
	return S.getPoliza();
}

}
