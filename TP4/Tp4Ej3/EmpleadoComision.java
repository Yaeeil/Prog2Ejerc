package Tp4Ej3;

public class EmpleadoComision extends Empleados{
int cantVentas;
double porcentaje;
int precioXVenta;

public EmpleadoComision(int cantVentas, double porcentaje, int precioXVenta) {
    super(50000);
    this.cantVentas = cantVentas;
    this.porcentaje = porcentaje;
    this.precioXVenta=precioXVenta;
}
public int getPrecioXVenta() {
	return precioXVenta;
}
public void setPrecioXVenta(int precioXVenta) {
	this.precioXVenta = precioXVenta;
}
public int getSueldoT() {
	int sueldo=  (int) (getSueldoF() + (getPrecioXVenta() * getCantVentas() * getPorcentaje() / 100));
	return sueldo;
}


public int getCantVentas() {
	return cantVentas;
}

public void setCantVentas(int cantVentas) {
	this.cantVentas = cantVentas;
}

public double getPorcentaje() {
	return porcentaje;
}

public void setPorcentaje(double porcentaje) {
	this.porcentaje = porcentaje;
}

}

