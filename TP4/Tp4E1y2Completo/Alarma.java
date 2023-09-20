package Tp4E1y2Completo;

public class Alarma {
    private Timbre timbre;
    protected Sensor[] sensores;
    protected int numSensores;

    public Alarma(int maxSensores) {
        this.timbre = new Timbre();
        this.sensores = new Sensor[maxSensores];
        this.numSensores = 0;
    }

    public void addSensor(Sensor sensor) {
        if (numSensores < this.sensores.length) {
            this.sensores[numSensores] = sensor;
            numSensores++;
        }
    }

    public String comprobar() {
        boolean conflicto = false;
        for (int i = 0; i < numSensores; i++) {
            if (this.sensores[i].isActivo()) {
                conflicto = true;
            }
        }
        if (conflicto) {
            this.sonarAlarma();
            return "Hay problemas en las siguientes zonas:\n" + getConflictos();
        } else {
            return "Todo está en orden.";
        }
    }

    public void sonarAlarma() {
        this.timbre.hacerSonar();
    }

    public String getConflictos() {
        String info = "";
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].isActivo()) {
                info += sensores[i].getZona() + ": " + sensores[i].getTipo() + "\n";
            }
        }
        return info;
    }
}
