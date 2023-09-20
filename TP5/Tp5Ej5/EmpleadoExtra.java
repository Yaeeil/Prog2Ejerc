package Tp5Ej5;
public class EmpleadoExtra extends Empleados {
    private double porcentaje;
    private int totalVentas;

    public EmpleadoExtra(int sueldoF, int ventas, String nombre, int totalVentas, double porcentaje) {
        super(sueldoF, ventas, nombre);
        this.totalVentas = totalVentas;
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getSueldoT() {
        return super.getSueldoF() + (int) ((totalVentas * porcentaje) / 100);
    }
}
