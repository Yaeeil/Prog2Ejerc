package Prog2Tp22;

public class Agenda {
    private Reunion[] reuniones;
    private int cantidadReuniones;

    public Agenda(int capacidadMaxima) {
        reuniones = new Reunion[capacidadMaxima];
        cantidadReuniones = 0;
    }

    public void agregarReunion(Reunion reunion) {
        if (cantidadReuniones < reuniones.length) {
            reuniones[cantidadReuniones] = reunion;
            cantidadReuniones++;
        } else {
            System.out.println("No se puede agregar más reuniones, la agenda está llena.");
        }
    }


	    public boolean hayConflictoHorarios(Reunion nuevaReunion) {
	        for (Reunion reunionExistente : reuniones) {
	            if (reunionExistente != null) {
	                // Comparar horarios y duración para verificar si hay conflicto
	                if (seSuperponenHorarios(reunionExistente, nuevaReunion)) {
	                    return true; // Hay conflicto de horarios
	                }
	            }
	        }
	        return false; // No hay conflicto de horarios
	    }

	    private boolean seSuperponenHorarios(Reunion reunion1, Reunion reunion2) {
	        // Comparar horarios y duración para determinar si se superponen
	        int inicioReunion1 = obtenerHoraEnMinutos(reunion1.getHoraInicio());
	        int finReunion1 = inicioReunion1 + reunion1.getDuracion();
	        int inicioReunion2 = obtenerHoraEnMinutos(reunion2.getHoraInicio());
	        int finReunion2 = inicioReunion2 + reunion2.getDuracion();

	        // Verificar si los horarios se superponen
	        return (inicioReunion1 >= inicioReunion2 && inicioReunion1 < finReunion2) ||
	               (finReunion1 > inicioReunion2 && finReunion1 <= finReunion2) ||
	               (inicioReunion1 <= inicioReunion2 && finReunion1 >= finReunion2);
	    }

	    private int obtenerHoraEnMinutos(String hora) {
	        String[] partesHora = hora.split(":");
	        int horas = Integer.parseInt(partesHora[0]);
	        int minutos = Integer.parseInt(partesHora[1]);
	        return horas * 60 + minutos;
	    }

	    public int getCantidadReuniones() {
	        return cantidadReuniones;
	    }

	    public Reunion[] getReuniones() {
	        return reuniones;
	    }
	}

	

