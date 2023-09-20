package Tp3E1;

public class PersonaEncuestada {
String nombre;
int documento;

public PersonaEncuestada(String nombre, int documento) {
	this.nombre=nombre;
	this.documento=documento;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getDocumento() {
	return documento;
}

public void setDocumento(int documento) {
	this.documento = documento;
}

}