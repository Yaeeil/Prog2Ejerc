package Tp4Ej3;


	public class Empleados {
	    int sueldoF;

	    public Empleados(int sueldoF) {
	        this.sueldoF = sueldoF;
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

	public static void sueldos() {
		Empleados E1= new Empleados(50000);
		System.out.println("Empleado Fijo: " + E1.getSueldoT());
		EmpleadoExtra E2=new EmpleadoExtra(4, 3000);
		System.out.println("Empleado Horas Extra: " + E2.getSueldoT());
        EmpleadoComision E3 = new EmpleadoComision(50, 40, 1000);
        System.out.println("Empleado comision: " + E3.getSueldoT());
    }
	
	
	public static void main(String [] args) {
		sueldos();
	}
	 
}
