package TP4Ej6;

public class Usuario extends Persona {
private String nombreU;
private String password;
	public Usuario( String nombre, String apellido, int edad,String nombreU, String password) {
		super( nombre,apellido,edad);
		this.nombreU=nombreU;
		this.password=password;
	}
	public String getNombreU() {
		return nombreU;
	}
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
