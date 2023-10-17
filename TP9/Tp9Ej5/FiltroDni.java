package Tp9Ej5;

public class FiltroDni implements Filtro {
int dni;

	public FiltroDni (int dni) {
	this.dni=dni;
	}
	
	public boolean Cumple(Seguro s) {
		return s.getDni()==dni;
	}


}
