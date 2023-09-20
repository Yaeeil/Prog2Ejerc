package Tp6Ej1;
import java.time.LocalDate;
public class Cliente {
String nombre;
LocalDate fechaDeAlquiler;
LocalDate fechaDeV;
	public Cliente(String nombre,
	LocalDate fechaDeAlquiler, LocalDate fechaDeV) {
	this.nombre=nombre;
	this.fechaDeAlquiler=fechaDeAlquiler;
	this.fechaDeV=fechaDeV;
	}
	@Override
	public String toString() {
	    return "Cliente [nombre=" + nombre + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeV=" + fechaDeV + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeAlquiler() {
		return fechaDeAlquiler;
	}
	public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
		this.fechaDeAlquiler = fechaDeAlquiler;
	}
	public LocalDate getFechaDeV() {
		return fechaDeV;
	}
	public void setFechaDeV(LocalDate fechaDeV) {
		this.fechaDeV = fechaDeV;
	}

}
