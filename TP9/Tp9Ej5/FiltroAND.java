package Tp9Ej5;

public class FiltroAND implements Filtro {
	Filtro f1;
	Filtro f2;
	

	public FiltroAND(Filtro f1, Filtro f2) {
		this.f1=f1;
		this.f2=f2;
	}


	@Override
	public boolean Cumple(Seguro s) {
		return f1.Cumple(s) && f2.Cumple(s);
	}
	
	

}
