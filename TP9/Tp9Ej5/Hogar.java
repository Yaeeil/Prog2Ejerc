package Tp9Ej5;

public class Hogar implements Costo {
	double porc;



		public Hogar( double valorA, double porc) {
		this.porc = porc;
	}



		public double getPorc() {
			return porc;
		}



		public void setPorc(double porc) {
			this.porc = porc;
		}



		@Override
		public double calcularCosto(double monto) {
			return monto +monto*this.getPorc();
		}

}
