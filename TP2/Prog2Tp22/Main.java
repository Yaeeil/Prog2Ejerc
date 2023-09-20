package Prog2Tp22;

public class Main {
    public static void main(String[] args) {
        Participante contacto1 = new Participante("Juan", "juan@example.com", 123456789);
        Participante contacto2 = new Participante("María", "maria@example.com", 987654321);

        Participante[] participantes = new Participante[]{contacto1, contacto2};

        Reunion reunion1 = new Reunion("10:00", 120, "Planificación anual", "Oficina 101", participantes);
        Reunion reunion2 = new Reunion("11:30", 45, "Presentación de proyecto", "Sala de conferencias", participantes);

        Agenda agenda = new Agenda(10); 
        agenda.agregarReunion(reunion1);
        agenda.agregarReunion(reunion2);

        //datos
        for (int i = 0; i < agenda.getCantidadReuniones(); i++) {
            Reunion reunion = agenda.getReuniones()[i];
            System.out.println("Reunión " + (i + 1) + ":");
            System.out.println("Hora de inicio: " + reunion.getHoraInicio());
            System.out.println("Duración: " + reunion.getDuracion() + " minutos");
            System.out.println("Tema: " + reunion.getTema());
            System.out.println("Lugar: " + reunion.getLugar());

            Participante[] participantesReunion = reunion.getParticipantes();
            System.out.println("Participantes:");
            for (Participante participante : participantesReunion) {
                System.out.println("Nombre: " + participante.getNombre());
                System.out.println("Email: " + participante.getMail());
                System.out.println("Teléfono: " + participante.getTelefono());
            }

            System.out.println("-");
        }

        if (agenda.hayConflictoHorarios(reunion2)) {
            System.out.println("La reunión 2 tiene conflicto de horarios.");
        } else {
            System.out.println("La reunión 2 no tiene conflicto de horarios.");
        }
    }
}
