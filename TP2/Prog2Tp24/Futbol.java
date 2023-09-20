package Prog2Tp24;

public class Futbol {
    int numero;
    boolean[] horarios = new boolean[12];

    public Futbol(int numero) {
        this.numero = numero;
    }

    public boolean verificarDisponibilidad(int horaInicio, int duracion) {
        if (horaInicio < 0 || horaInicio + duracion > 12) {
            return false; // Horario inválido
        }

        for (int i = horaInicio; i < horaInicio + duracion; i++) {
            if (horarios[i]) {
                return false; // Horario ocupado
            }
        }
        return true; // Horario disponible
    }

    public void reservarTurno(Usuarios usuario, int horaInicio, int duracion) {
        for (int i = horaInicio; i < horaInicio + duracion; i++) {
            horarios[i] = true;
        }
        System.out.println("Turno reservado en la cancha de fútbol " + numero + " para " + usuario.nombre +
                " desde las " + horaInicio + " hasta las " + (horaInicio + duracion) + " horas.");
    }
}
