package Tp4E1y2Completo;

public class Sensor {
    private boolean activo;
    private String zona, tipo;

    public Sensor(String tipo, String zona) {
        this.setTipo(tipo);
        this.setZona(zona);
        this.activo = false;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

}
