package Tp9Ej5;

public class FiltroMonto implements Filtro {
int Monto;

	public FiltroMonto(int Monto) {
	this.Monto=Monto;
	}
	public boolean Cumple(Seguro s) {
		return s.getMonto()>Monto;
	}

}
