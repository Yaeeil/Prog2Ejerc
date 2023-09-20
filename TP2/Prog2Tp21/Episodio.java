package Prog2Tp21;

public class Episodio {

		private String titulo;
		private String descripcion;
		private boolean visto;
		private int calificacion;

		// Constructor
		public Episodio(String titulo, String descripcion) {
			this.titulo = titulo;
			this.descripcion = descripcion;
			this.visto = false; // Por defecto, el episodio no está visto
			this.calificacion = -1; // Por defecto, calificación negativa indica no vista
		}

		// Método para establecer/calificar el episodio/el set de calificacion, ademas cambia el valor de visto
		public void calificar(int calificacion) {
		    if (calificacion== 1 || calificacion==4 || calificacion==2 || calificacion==3 || calificacion== 5) {
		        this.calificacion = calificacion;
		     
		        visto = true; // Cambio aquí para considerar cualquier calificación mayor o igual a 1
		   
		    } else {
		        System.out.println("Calificación no válida. No se cambió la calificación anterior.");
		    }
		}


		public boolean estaVisto() {
			return visto;
		}

		// getter y setter
		public int getCalificacion() {
			return calificacion;
		}

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


	}


