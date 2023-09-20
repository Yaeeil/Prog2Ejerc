package Prog2Tp21;

public class MainSerie {
    public static void main(String[] args) {
        // Crear una serie con 3 temporadas y 5 episodios en cada temporada
        Serie miSerie = new Serie("Mi Serie", "Descripción de la serie", "Creador", "Género", 3);

        // Configurar temporadas y episodios
        for (int i = 0; i < miSerie.getTemporadas().length; i++) {
            Temporada temporada = new Temporada(5); //  5 episodios por temporada
            for (int j = 0; j < temporada.getEpisodios().length; j++) {
                Episodio episodio = temporada.getEpisodios()[j];
                episodio.calificar(4); // Marcar como visto con calificación 4
                temporada.marcarEpisodioComoVisto(j); // Marcar el episodio como visto
            }
            miSerie.getTemporadas()[i] = temporada; // Asignar la temporada creada al arreglo de temporadas
        }

        // Información de la serie y sus temporadas
        System.out.println("Datos de la serie:");
        System.out.println("Nombre: " + miSerie.getTitulo());
        System.out.println("Cantidad de temporadas: " + miSerie.getTemporadas().length);
        
        for (int i = 0; i < miSerie.getTemporadas().length; i++) {
            Temporada temporada = miSerie.getTemporadas()[i];
            System.out.println("Temporada " + (i + 1) + ": Cant Episodios: " + temporada.getEpisodios().length);
            System.out.println("Temporada: " + (i+1) + " Promedio: " + temporada.promedioTemporada());
            for (int j = 0; j < temporada.getEpisodios().length; j++) {
                Episodio episodio = temporada.getEpisodios()[j];
                System.out.println("Episodio " + (j + 1) + " - Calificación: " + episodio.getCalificacion());
            }
        }

        // Calcular el promedio de calificaciones de la serie
        double promedioCalificaciones = miSerie.calcularPromedioCalificaciones();
        System.out.println("Promedio de calificaciones de la serie: " + promedioCalificaciones);

        // Verificar si se vieron todos los episodios de la serie
        boolean todosEpisodiosVistos = miSerie.seVieronTodosLosEpisodios();
        System.out.println("¿Se vieron todos los episodios de la serie? " + todosEpisodiosVistos);
    }
}
