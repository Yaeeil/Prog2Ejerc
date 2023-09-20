package Tp5Ej4;

public class ContribuyenteC extends Contribuyente {
int montoventa;
int mitad=2;
double porc=3.5;

public ContribuyenteC(String nombre, int codigoTrib, int montofijo, int montoventa) {
	super(nombre, codigoTrib, montofijo);
	this.montoventa = montoventa;
}

public int getMontoventa() {
	return montoventa;
}

public void setMontoventa(int montoventa) {
	this.montoventa = montoventa;
}

public int impuesto() {
	return (int) ((super.getMontofijo()/mitad) + (this.getMontoventa()*porc/100));
}
}
