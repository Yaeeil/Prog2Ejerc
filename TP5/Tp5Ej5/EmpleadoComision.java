package Tp5Ej5;
public class EmpleadoComision extends Empleados {
    private int cantVentas;
    private int bono;

    public EmpleadoComision(int sueldoF, int ventas, String nombre, int cantVentas, int bono) {
        super(sueldoF, ventas, nombre);
        this.cantVentas = cantVentas;
        this.bono = bono;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getSueldoT() {
        int sueldoBase = super.getSueldoF();
        if (cantVentas >= super.getVentas()) {
            return sueldoBase + getBono();
        } else {
            return sueldoBase;
        }
    }
}