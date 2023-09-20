package Tp3E13;

public class Juego {
    Jugadores j1, j2;
    Personajes p1, p2;

    public Juego(Jugadores j1, Jugadores j2, Personajes p1, Personajes p2) {
        this.j1 = j1;
        this.j2 = j2;
        this.p1 = p1;
        this.p2 = p2;

        j1.setPersonaje(p1);
        j2.setPersonaje(p2);
    }

    public Jugadores ganadorJ() {
        if (p1.getFuerza() > p2.getFuerza()) {
            return buscarJugadorPorPersonaje(p1);
        } else if (p2.getFuerza() > p1.getFuerza()) {
            return buscarJugadorPorPersonaje(p2);
        } else if (p1.getFuerza() == p2.getFuerza()) {
            if (p1.getVel() > p2.getVel()) {
                return buscarJugadorPorPersonaje(p1);
            } else if (p2.getVel() > p1.getVel()) {
                return buscarJugadorPorPersonaje(p2);
            }
        }
        return null; // Empate
    }

    private Jugadores buscarJugadorPorPersonaje(Personajes personaje) {
        if (j1.getPersonaje() == personaje) {
            return j1;
        } else if (j2.getPersonaje() == personaje) {
            return j2;
        }
        return null; // No se encontró el jugador
    }


    public static void main(String[] args) {
        Jugadores jugador1 = new Jugadores("Juan");
        Jugadores jugador2 = new Jugadores("Anita");
        Personajes personaje1 = new Personajes("Carlos", "SuperC", false, 400, 70.3, 1.70, 700);
        Personajes personaje2 = new Personajes("Clara", "SuperLuz", true, 500, 55.1, 1.60, 600);

        Juego juego = new Juego(jugador1, jugador2, personaje1, personaje2);

        Jugadores ganador = juego.ganadorJ();

        if (ganador != null) {
            System.out.println("El ganador es: " + ganador.getNombre() + " con el personaje " + ganador.getPersonaje().getNombreS());
        } else {
            System.out.println("Empate");
        }
    }
}
