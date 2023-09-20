package Tp5Ej4;
import java.util.ArrayList;

public class Ciudad {
    private ArrayList<Contribuyente> contribuyentes;
    private int habitantes;
    private int gastos;

    public Ciudad(ArrayList<Contribuyente> contribuyentes, int habitantes, int gastos) {
        this.contribuyentes = contribuyentes;
        this.habitantes = habitantes;
        this.gastos = gastos;
    }

    public boolean deficit() {
        int imp = calcularImpuestosRecaudados(contribuyentes);
        return gastos > imp;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public ArrayList<Contribuyente> getContribuyentes() {
        return contribuyentes;
    }

    public static int calcularImpuestosRecaudados(ArrayList<Contribuyente> contribuyentes) {
        int impuestosRecaudados = 0;
        for (Contribuyente contribuyente : contribuyentes) {
            impuestosRecaudados += contribuyente.impuesto();
        }
        return impuestosRecaudados;
    }

    public static void impuestosC() {
        // Ejemplo de uso
        ArrayList<Contribuyente> contribuyentes = new ArrayList<>();
        Contribuyente c1 = new Contribuyente("Carlos", 5689, 2000);
        Contribuyente c2 = new ContribuyenteP("Juana", 5678, 300, 15);
        Contribuyente c3 = new ContribuyenteC("Juana", 5678, 20, 2);

        contribuyentes.add(c1);
        contribuyentes.add(c2);
        contribuyentes.add(c3);

   
    }
}

