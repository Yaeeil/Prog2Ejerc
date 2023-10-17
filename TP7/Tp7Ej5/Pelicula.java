package Tp7Ej5;

import java.util.ArrayList;

//De cada película se guarda el título, la sinopsis, los géneros (“acción”,
//“terror”, “drama”, etc), el director, los actores, el año de estreno, 
//la duración de la película
//(en minutos), y la edad mínima requerida para ver la película.

public class Pelicula {
private String titulo;
private String sinopsis;
private ArrayList<String> generos;
private String director;
private ArrayList<String> actores;
private int añoE;
private int duracion;
private int edadM;

public Pelicula(String titulo, String sinopsis, String director,
		int añoE, int duracion, int edadM) {
	super();
	this.titulo = titulo;
	this.sinopsis = sinopsis;
	this.generos = new ArrayList<>();
	this.director = director;
	this.actores = new ArrayList<>();
	this.añoE = añoE;
	this.duracion = duracion;
	this.edadM = edadM;
}




public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getSinopsis() {
	return sinopsis;
}

public void setSinopsis(String sinopsis) {
	this.sinopsis = sinopsis;
}

public ArrayList<String> getGeneros() {
	return  new ArrayList<String>(generos);
}


public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

public ArrayList<String> getActores() {
	return new ArrayList<String>(actores);
}

public int getAñoE() {
	return añoE;
}

public void setAñoE(int añoE) {
	this.añoE = añoE;
}

public int getDuracion() {
	return duracion;
}

public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public int getEdadM() {
	return edadM;
}

public void setEdadM(int edadM) {
	this.edadM = edadM;
}


//agregar
public void agregarGeneros(String g) {
	generos.add(g);
}
public void agregarActor(String a) {
	actores.add(a);
}



//Filtros que serian clases para ir filtrado y faltaria un metodo filtro para aplicar el que quiera


//Buscar todas las películas que en el título contenga la palabra “luna”.
public boolean contieneTitulo(String palabra) {
	return this.getTitulo().contains(palabra);
}
//● Buscar todas las películas que contengan un género específico (por ejemplo,
//“terror”).

public boolean contieneGenero(String palabra) {
	return this.getGeneros().contains(palabra);
}
public boolean contieneActor(String actor) {
	return this.getActores().contains(actor);
}

public boolean contieneDirector(String dire) {
	return this.getDirector().equals(dire);
}

public boolean antesDe(Pelicula pp, int año) {
	if(pp.getAñoE()<año) {
		 System.out.println(pp.getTitulo() + " esta antes de: " + año + " ya que salio en: " + pp.getAñoE() );
	return true;}
	else {
		System.out.println("No ya que el estreno fue en: " + pp.getAñoE() + " y el año es > a: " + año);
	return false;}
}

public boolean duraMenos(Pelicula pp, int dura) {
	if(pp.getDuracion()<dura) {
		 System.out.println(pp.getTitulo() + " dura menos: " + dura+ " ya que dura: " + pp.getDuracion() );
	return true;}
	else {
		System.out.println("No ya que dura: " + pp.getDuracion() + " y es < a: " + dura);
	return false;}
}

public boolean duraMas(Pelicula pp, int dura) {
	if(pp.getDuracion()>dura) {
		 System.out.println(pp.getTitulo() + " dura mas: " + dura+ " ya que dura: " + pp.getDuracion() );
	return true;}
	else {
		System.out.println("No ya que dura: " + pp.getDuracion() + " y es > a: " + dura);
	return false;}
}

public boolean despuesDe(Pelicula pp, int año) {
	if(pp.getAñoE()>año) {
		 System.out.println(pp.getTitulo() + " esta despues de: " + año + " ya que salio en: " + pp.getAñoE() );
	return true;}
	else {
		System.out.println("No ya que el estreno fue en: " + pp.getAñoE() + " y el año es < a: " + año);
	return false;}
}

public String toString() {
	return " titulo: " + this.getTitulo();
}

//● Buscar todas las películas en las que haya actuado Will Smith y cuyo director
//NO haya sido Martin Scorsese.

public Pelicula filtroAyD(Pelicula pp, String a, String  d) {
	if(pp.contieneActor(a) && !pp.contieneDirector(d)) {
		return pp;
	}return null;
}
//● Buscar todas las películas que se hayan grabado antes del 2015 y cuya
//duración sea menor a 95 minutos.
public Pelicula filtroAyD(Pelicula pp, int año, int dura) {
	if(pp.antesDe(pp, año) && pp.duraMenos(pp, dura)) {
	return pp;	
	}return null;
}
}
