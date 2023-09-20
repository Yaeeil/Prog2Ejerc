package Tp6Ej1;


public class Auto extends Items {
String marca;
int km;
String patente;
String tipo;

	public Auto(boolean alquilado, String marca, int km, String patente, String tipo){
		super(alquilado);
		this.marca=marca;
		this.km=km;
		this.patente=patente;
		this.tipo=tipo;
		
	}
	@Override
	
	public String toString() {
	    return "Auto [marca=" + marca + ", km=" + km + ", patente=" + patente + ", tipo=" + tipo + ", alquilado=" + alquilado + "]";
	}

	public boolean isAlquilado() {
		return alquilado;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		

}
