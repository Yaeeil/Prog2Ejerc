package Tp7Ej5;

public class RentableB extends Rentable {
private String generoA;
private String generoB;
private int año;
	public RentableB() {
	this.año=2017;
	this.generoA="infantil";
	this.generoB="documental";
	}
//	 Películas posteriores del 2017, a no ser que se trate de películas del género
//	 “infantil” o “documental”.
	public Pelicula esRentable(Pelicula pp) {
		if(pp.despuesDe(pp, año) || pp.contieneGenero(generoA) || pp.contieneGenero(generoB)) {
			System.out.println("Es rentable: " + pp);
			return pp;
	}System.out.println("No es rentable: " + pp);
	return null;
	}

}
