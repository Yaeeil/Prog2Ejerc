package Prog2Tp24;

public class Usuarios {

	String nombre;
	boolean esSocio;
	int contadorTurnos;

	public Usuarios(String nombre) {
		this.nombre = nombre;
	}

	public void incrementarContadorTurnos() {
		contadorTurnos++;
	}
}
