package Tp5Ej4;

public class ContribuyenteP extends Contribuyente {
int montoDes;
int porc1;
int porc2;

public ContribuyenteP(String nombre, int codigoTrib, int montofijo, int montoDes) {
	super(nombre, codigoTrib, montofijo);
	this.montoDes = montoDes;
}

public int getMontoDes() {
	return montoDes;
}

public void setMontoDes(int montoDes) {
	this.montoDes = montoDes;
}
public int impuesto() {
	return (int) ((super.getMontofijo()/porc1) + (this.getMontoDes()*porc2/100));
}
}
