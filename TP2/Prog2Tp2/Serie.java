package Prog2Tp2;

public class Serie {

	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private Temporada[] temporadas ;
	
	//constructores
	public Serie(String titulo, String descripcion, String creador, String genero, int totalTemporadas) {
		this.titulo=titulo;
		this.descripcion=descripcion;
		this.creador=creador;
		this.genero=genero;
		this.temporadas = new Temporada[totalTemporadas];
	}
	
	public double calcularPromedioCalificaciones() {
        int totalCalificaciones = 0;
        int totalEpisodiosVistos = 0;

        for (Temporada temporada : temporadas) {
            totalCalificaciones += temporada.promedioTemporada();
            totalEpisodiosVistos += temporada.obtenerTotalEpisodiosVistos();
        }

        if (totalEpisodiosVistos > 0) {
            return (double) totalCalificaciones / totalEpisodiosVistos;
        } else {
            return 0.0;
        }
    }

	public boolean seVieronTodosLosEpisodios() {
        for (int i=0; i<temporadas.length; i++) {
            if (!temporadas[i].todosEpisodiosVistos()) {
                return false; // Si una temporada tiene episodios no vistos, retornar false
            }
        }
        return true; // Todos los episodios de todas las temporadas están vistos
    }

	
	//setters y getters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public class Main {
	    public static void main(String[] args) {
	        // Crear una serie con 3 temporadas y 5 episodios en cada temporada
	        Serie miSerie = new Serie("Mi Serie", "Descripción de la serie", "Creador", "Género", 3);

	        // Configurar los episodios como vistos y darles calificaciones
	        for (Temporada temporada : miSerie.getTemporadas()) {
	            for (Episodio episodio : temporada.getEpisodios()) {
	                episodio.calificar(4); // Marcar como visto con calificación 4
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

	public Temporada[] getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Temporada[] temporadas) {
		this.temporadas = temporadas;
	}

}
