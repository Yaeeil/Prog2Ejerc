package Tp9Ej5;

public class FiltroDescripcion implements Filtro {
String descripcion;

	public FiltroDescripcion(String descripcion) {
	this.descripcion=descripcion;
	}
	public boolean Cumple(Seguro s) {
		return s.getDescripcion().contains(descripcion);
	}

}
