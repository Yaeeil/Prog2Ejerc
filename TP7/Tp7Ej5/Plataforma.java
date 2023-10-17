package Tp7Ej5;

import java.util.ArrayList;

public class Plataforma {
ArrayList<Pelicula>peliculas;
	public Plataforma() {
	this.peliculas=new ArrayList<>();
	}

	public ArrayList<Pelicula> peliculas(){
		return new ArrayList<>(peliculas);
	}
	public void añadirPeliculas(Pelicula pp) {
		peliculas.add(pp);
	}
	public void buscar( Rentable rr ){
	    for (int i = 0; i < peliculas.size(); i++) {
	        Pelicula actual = peliculas.get(i);
	       rr.esRentable(actual);
	    }
	}
	public static void main(String [] args) {
		Plataforma pp=new Plataforma();
		//se guarda el título, la sinopsis, los géneros (“acción”,
		//“terror”, “drama”, etc), el director, los actores, el año de estreno, 
		//la duración de la película
		Pelicula p1=new Pelicula("titulo1", "esta es la sinopsis1 ", "el pepe", 2000, 130, 14);
		Pelicula p2=new Pelicula("la luna", "esta es la sinopsis 2", "rojaz", 2018, 110, 17);
		p1.agregarActor("Will Smith");
		p1.agregarActor("Don Juan");
		p1.agregarActor("La Doña");
		p2.agregarActor("El pepe");
		p2.agregarActor("Mario casas");
		p2.agregarActor("La señora");
		p1.agregarGeneros("comedia");
		p2.agregarGeneros("drama");
		System.out.println("Despues  de: " + " " + 
				p1.despuesDe(p1, 1999) + " " + 
				p2.despuesDe(p2, 2005) + " " + 
		"Antes de: " + " " + 
		p1.antesDe(p1, 1999) + " " + 
		p2.antesDe(p2, 2005) + " " + 
		" contiene actores: " + " " + 
		p1.contieneActor("Don Juan")+ " " + 
		p1.contieneActor("Will Smith") + " " + 
		p1.contieneActor("Roli Serrano") + " "+ 
		p2.contieneActor("Tom Hams") + " " + 
		p2.contieneActor("La señora") + " " + "contiene directores: "  + 
		p1.contieneDirector("rojaz")+ " " + 
		p1.contieneDirector("el pepe")+ " " + 
		p2.contieneDirector("rojaz")+ " " + 
		p2.contieneDirector("el pepe"));

		pp.añadirPeliculas(p1);
		pp.añadirPeliculas(p2);
		System.out.println();
		Rentable r1=new RentableA();
		Rentable r2=new RentableB();
		System.out.println("buscar: ");
		pp.buscar(r1);
		pp.buscar(r2);
		
		
		
		
	}
}
