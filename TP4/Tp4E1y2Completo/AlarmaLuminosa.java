package Tp4E1y2Completo;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(int maxSensores) {
        super(maxSensores);
        this.luz = new Luz();
    }

    public void sonarAlarma() {
        super.sonarAlarma(); // Hacer sonar el timbre normal
        if (hayConflictosEnCocina()) {
            this.luz.encender(); // Encender la luz solo si hay conflictos en la cocina
        }
    }

    private boolean hayConflictosEnCocina() {
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].isActivo() && sensores[i].getZona().equals("cocina")) {
                return true;
            }
        }
        return false;
    }
}



