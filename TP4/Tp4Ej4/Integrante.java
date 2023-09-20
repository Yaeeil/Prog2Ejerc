package Tp4Ej4;

public class Integrante {
String nombre;
String apellido;
int pasaporte;
String fechaNac;
boolean concentrando;
String paisOrigen;
String paisAhora;


public Integrante(String nombre, String apellido, int pasaporte, String fechaNac, boolean concentrando, String paisOrigen, String paisAhora) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.pasaporte=pasaporte;
	this.fechaNac=fechaNac;
	this.concentrando=concentrando;
	this.paisOrigen=paisOrigen;
	this.paisAhora=paisAhora;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public int getPasaporte() {
	return pasaporte;
}


public void setPasaporte(int pasaporte) {
	this.pasaporte = pasaporte;
}


public String getFechaNac() {
	return fechaNac;
}


public void setFechaNac(String fechaNac) {
	this.fechaNac = fechaNac;
}


public boolean isConcentrando() {
	return concentrando;
}


public void setConcentrando(boolean concentrando) {
	this.concentrando = concentrando;
}


public String getPaisOrigen() {
	return paisOrigen;
}


public void setPaisOrigen(String paisOrigen) {
	this.paisOrigen = paisOrigen;
}


public String getPaisAhora() {
	return paisAhora;
}


public void setPaisAhora(String paisAhora) {
	this.paisAhora = paisAhora;
}
public void infoIntegrantes() {
	System.out.println(" Nombre: " + getNombre()+" Apellido:"+getApellido()+" Pasaporte:" +getPasaporte() + " Fecha de Nacimiento: " + getFechaNac());
}
public static void Estado(Integrante[] integrantes) {
    for (int i = 0; i < integrantes.length; i++) {
        if (integrantes[i].getPaisOrigen().equals(integrantes[i].getPaisAhora()) && integrantes[i].isConcentrando()) {
            System.out.println("Está disponible: " + integrantes[i].getNombre());
        } else {
            System.out.println("No está disponible: " + integrantes[i].getNombre());
        }
    }
}

public static void main(String[] args) {
    Integrante I1 = new Futbolista("Juan", "Nicou", 87900, "5 de enero 2000", true, "argentina", "argentina", "Delantero", "Derecho", 12);
    Integrante I2 = new Entrenador("Pedro", "treadg", 35678, "10 de marzo 1988", false, "argentina", "argentina", "FIFA");
    Integrante I3 = new Masajista("Alberto", "Fourst", 563839, "22 de diciembre 1975", true, "argentina", "Africa", "Masajista Profesional", 20);

    Integrante[] integrantes = { I1, I2, I3 };

    Estado(integrantes);

      I1.infoIntegrantes();
      ((Futbolista) I1).infoF();
      I2.infoIntegrantes();
      ((Entrenador) I2).infoE();
      I3.infoIntegrantes();
      ((Masajista) I3).infoM();
  }
}

