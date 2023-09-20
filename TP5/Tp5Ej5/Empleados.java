package Tp5Ej5;
import java.util.ArrayList;

public class Empleados {
    private String nombre;
    private int ventas;
    private int sueldoF;

    public Empleados(int sueldoF, String nombre) {
        this.sueldoF = sueldoF;
        this.nombre = nombre;
    }

    public Empleados(int sueldoF, int ventas, String nombre) {
        this.sueldoF = sueldoF;
        this.ventas = ventas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldoF() {
        return sueldoF;
    }

    public void setSueldoF(int sueldoF) {
        this.sueldoF = sueldoF;
    }

    public int getSueldoT() {
        return sueldoF;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public static void gastosTotales(ArrayList<Empleados> emp) {
        int gastoTotal = 0;
        for (int i = 0; i < emp.size(); i++) {
            gastoTotal += emp.get(i).getSueldoT();
        }
        System.out.println("Gasto Total en Sueldos: $" + gastoTotal);
    }

    public static void sueldo(Empleados emp) {
        System.out.println("Empleado: " + emp.getNombre() + " Sueldo: $" + emp.getSueldoT());
    }

    public static void main(String[] args) {
        // Crear instancias de empleados
        Empleados Emp1 = new EmpleadoComision(200000, 50, "Ana", 30, 10000);
        Empleados Emp2 = new EmpleadoExtra(200000, 10000, "Claudio", 200000, 20);
        Empleados Emp3 = new Empleados(200000, "Juan");
        Empleados Emp4 = new EmpleadoComision(200000, 100, "Julieta", 1000, 50000);

        ArrayList<Empleados> empleados = new ArrayList<>();
        empleados.add(Emp1);
        empleados.add(Emp2);
        empleados.add(Emp3);
        empleados.add(Emp4);

        for (int i = 0; i < empleados.size(); i++) {
            sueldo(empleados.get(i));
        }

        gastosTotales(empleados);
    }
}
