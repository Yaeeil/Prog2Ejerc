package Tp4E1y2Completo;

public class Luz {
    private boolean prendida;

    public Luz() {
        this.prendida = false;
    }

    public boolean prendida() {
        return prendida;
    }

    public void encender() {
        this.prendida = true;
        System.out.println("Luz encendida.");
    }

    public void apagar() {
        this.prendida = false;
        System.out.println("Luz apagada.");
    }
}
