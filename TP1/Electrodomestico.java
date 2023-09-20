package Prog2;

public class Electrodomestico {
    private int valorConsumo = 45;
    private int vAltaGama = 3;
    private String nombre;
    private double precio;
    private String color;
    private double consumo;
    private double peso;

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
        color = "gris plata";
        consumo = 10;
        precio = 100;
        peso = 2;
    }

    public Electrodomestico(String nombre, String color, double consumo, double precio, double peso) {
        this.nombre = nombre;
        this.color = color;
        this.consumo = consumo;
        this.precio = precio;
        this.peso = peso;
    }

    public boolean bajoConsumo() {
        return consumo < valorConsumo;
    }

    public double balance() {
        double valorBalance = precio / peso;
        return valorBalance;
    }

    public boolean altaGama() {
        return balance() > vAltaGama;
    }

    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico("Sample Appliance");
        
        System.out.println("Es bajo consumo? " + electrodomestico.bajoConsumo());
        System.out.println("El balance es: " + electrodomestico.balance() + " Es alta gama? " + electrodomestico.altaGama());
    }
}
