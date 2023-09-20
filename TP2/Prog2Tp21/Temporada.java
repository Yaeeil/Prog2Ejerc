package Prog2Tp21;


public class Temporada {
		private Episodio[] episodios;
		private int totalEpisodios;
		private int totalEpisodiosVistos;

		// Constructor

		public Temporada(int totalEpisodios) {
			
			this.totalEpisodios = totalEpisodios;
			episodios = new Episodio[totalEpisodios];
			for (int i = 0; i < totalEpisodios; i++) {
				episodios[i] = new Episodio("Episodio " + (i), "Descripción del episodio " + (i));
			}
		}

		public void marcarEpisodioComoVisto(int numeroEpisodio) {
			//System.out.println("entro");
			if (numeroEpisodio >= 0 && numeroEpisodio < episodios.length) {
				episodios[numeroEpisodio].estaVisto();
				totalEpisodiosVistos++;
				//System.out.println("vistp" +totalEpisodiosVistos);
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
		                totalCalificaciones += episodios[i].getCalificacion(); // xq seria la suma de todas las calificaciones
		                totalEpisodiosVistos++;
		               // System.out.println(totalEpisodiosVistos + "episodios Vistos");
		            }
		        }

		        if (totalEpisodiosVistos > 0) {
		        	//System.out.println("entro al if: " + " calificaciones " + totalCalificaciones);
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


