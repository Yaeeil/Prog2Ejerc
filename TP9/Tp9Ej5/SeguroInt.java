package Tp9Ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeguroInt extends SeguroAbstracto {
	int dni;
ArrayList <SeguroAbstracto> seguros;


public SeguroInt( String descripcion, int dni) {
	super(descripcion,dni);
		this.dni=dni;
		seguros=new ArrayList <>();
	}

public ArrayList <SeguroAbstracto> getSeguros(){
	ArrayList <SeguroAbstracto> segurosC= new ArrayList <>();
	for(int i=0; i<seguros.size(); i++) {
		segurosC.add(seguros.get(i));
	}return segurosC;
}

@Override
public double getMonto() {
	double valor=0;
	for(int i=0; i<seguros.size(); i++) {
		valor+=seguros.get(i).getMonto();
	} return valor;
}

public int getPoliza() {
	int valor=0, valorM=0;
	for(int i=0; i<seguros.size(); i++) {
		valor=seguros.get(i).getPoliza();
		if(valor>valorM) {
			valorM=valor;

		}
	}return valorM;
}

@Override
public ArrayList<SeguroAbstracto> busqueda(Filtro f, Comparator<SeguroAbstracto> c) {
	ArrayList <SeguroAbstracto> seguroL= new ArrayList <>();
	for(int i=0; i<seguros.size(); i++) {
		seguroL.addAll(seguros.get(i).busqueda(f, c));
	}
	Collections.sort(seguroL, c);
	return seguroL;
}

}
