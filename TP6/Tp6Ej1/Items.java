package Tp6Ej1;

import java.time.LocalDate;

public  abstract class Items {
	boolean alquilado;
	LocalDate fechaA;
	
	public Items(boolean alquilado) {
		this.alquilado=alquilado;
	}

	public abstract boolean isAlquilado();

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public LocalDate getFechaA() {
		return fechaA;
	}

	public void setFechaA(LocalDate fechaA) {
		this.fechaA = fechaA;
	}
	


}
