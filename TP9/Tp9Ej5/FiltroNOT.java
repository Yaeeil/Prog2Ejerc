package Tp9Ej5;

public class FiltroNOT implements Filtro {
	Filtro f1;

	public FiltroNOT(Filtro f1) {
	this.f1=f1;
	}

	@Override
	public boolean Cumple(Seguro s) {
		return !f1.Cumple(s);
	}
	
	
	

}
