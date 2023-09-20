package Tp4Ej3;

public class EmpleadoExtra extends Empleados{
int horasExtras;
int pagoHorasExtras;

public EmpleadoExtra(int horasExtras, int pagoHorasExtras) {
	super(50000);
	this.horasExtras=horasExtras;
	this.pagoHorasExtras=pagoHorasExtras;
}

public int getSueldoT() {
	int sueldo =(int) (getSueldoF() + (getHorasExtras() * getPagoHorasExtras()));
    return sueldo;
}


public int getHorasExtras() {
	return horasExtras;
}

public void setHorasExtras(int horasExtras) {
	this.horasExtras = horasExtras;
}

public int getPagoHorasExtras() {
	return pagoHorasExtras;
}

public void setPagoHorasExtras(int pagoHorasExtras) {
	this.pagoHorasExtras = pagoHorasExtras;
}

}
