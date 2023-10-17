package Tp9Ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Aseguradora {
ArrayList <Seguro> seguros;

	public Aseguradora() {
		this.seguros=new ArrayList<>();
	}

	
	public void addSeguro(Seguro s) {
		seguros.add(s);
	}
}
	//Listar todos los seguros cuya descripción contenga la palabra “Automotor”,
	//ordenados por dni del asegurado, y luego por número de póliza si un asegurado posee
	//más de un seguro que coincida con la búsqueda
	