package Prog2Tp2;

public class Temporada {
	private Episodio[] episodios;
	private int totalEpisodios;
	private int totalEpisodiosVistos;

	// Constructor

	public Temporada(int totalEpisodios) {
		
		this.totalEpisodios = totalEpisodios;
		episodios = new Episodio[totalEpisodios];
		for (int i = 0; i < totalEpisodios; i++) {
			episodios[i] = new Episodio("Episodio " + (i + 1), "Descripción del episodio " + (i + 1));
		}
	}

	public void marcarEpisodioComoVisto(int numeroEpisodio) {
		if (numeroEpisodio >= 0 && numeroEpisodio < episodios.length) {
			episodios[numeroEpisodio].estaVisto();
			totalEpisodiosVistos++;
		}
	}
	public boolean todosEpisodiosVistos() {
		if(totalEpisodios==totalEpisodiosVistos) {
			return true;
		}
		else {
			return false;
		} 
	}
	
	public double promedioTemporada () {
	        int totalCalificaciones = 0;
	        int totalEpisodiosVistos = 0;

	        for (int i=0; i<episodios.length; i++) {
	            if (episodios[i].estaVisto()) {
	                totalCalificaciones += episodios[i].getCalificacion();
	                totalEpisodiosVistos++;
	            }
	        }

	        if (totalEpisodiosVistos > 0) {
	            return (double) totalCalificaciones / totalEpisodiosVistos;
	        } else {
	            return 0.0;
	        }
	    }


	public int obtenerTotalEpisodiosVistos() {
		return totalEpisodiosVistos;
	}

	public Episodio[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(Episodio[] episodios) {
		this.episodios = episodios;
	}

	public int getTotalEpisodios() {
		return totalEpisodios;
	}

	public void setTotalEpisodios(int totalEpisodios) {
		this.totalEpisodios = totalEpisodios;
	}
}
