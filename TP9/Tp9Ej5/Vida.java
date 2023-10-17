package Tp9Ej5;

public class Vida implements Costo {

	double porc;


	public Vida(double valorA, double porc) {

	this.porc=porc;
	}

	@Override
	public double calcularCosto(double monto) {
		return monto*this.getPorc();
	}


	public double getPorc() {
		return porc;
	}

	public void setPorc(double porc) {
		this.porc = porc;
	}
	

}
