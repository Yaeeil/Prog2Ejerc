package Tp6Ej1;

public class Pelicula extends Items{
String info;
int copias;
public Pelicula(boolean alquilado, String info, int copias) {
	super(alquilado);
	this.info=info;
	this.copias=copias;

}

@Override
public String toString() {
    return "Pelicula [info=" + info + ", copias=" + copias + ", alquilado=" + alquilado + "]";
}

public boolean isAlquilado() {
	return  getCopias()>0;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public int getCopias() {
	return copias;
}
public void setCopias(int copias) {
	this.copias = copias;
}
	

}
