package Prog2Tp22;

public class Participante {
private String nombre;
private String mail;
private int telefono;


public Participante(String nombre, String mail, int telefono) {
	this.nombre=nombre;
	this.mail=mail;
	this.telefono=telefono;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getMail() {
	return mail;
}


public void setMail(String mail) {
	this.mail = mail;
}


public int getTelefono() {
	return telefono;
}


public void setTelefono(int telefono) {
	this.telefono = telefono;
}
}

