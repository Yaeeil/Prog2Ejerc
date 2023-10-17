package Tp7Ej5;


public class RentableA extends Rentable {
private int dura;
private String NOgenero;
	public RentableA() {
		this.dura=120;
		this.NOgenero="comedia";
	}
	
//	Películas cuya duración sea menor a 120 minutos, que no sean del género
//	“comedia”
	public Pelicula esRentable(Pelicula pp) {
		if(pp.duraMenos(pp,this.getDura()) && !pp.contieneGenero(NOgenero)) {
			System.out.println("Es rentable: " + pp);
			return pp;
	}System.out.println("No es rentable: " + pp);
	return null;
	}

	public int getDura() {
		return dura;
	}

	public void setDura(int dura) {
		this.dura = dura;
	}

	public String getNOgenero() {
		return NOgenero;
	}

	public void setNOgenero(String nOgenero) {
		NOgenero = nOgenero;
	}
	
	
}
