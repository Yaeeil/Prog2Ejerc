package Prog2Tp21;
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
	int totalTemporadas=0;
	for(int i=0; i<temporadas.length; i++) {
	totalTemporadas+=temporadas[i].promedioTemporada();
	} return totalTemporadas/temporadas.length;
	}

	public boolean seVieronTodosLosEpisodios() {
	    for (Temporada temporada : temporadas) {
	        if (!temporada.todosEpisodiosVistos()) {
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
	
	

	public Temporada[] getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Temporada[] temporadas) {
		this.temporadas = temporadas;
}
}