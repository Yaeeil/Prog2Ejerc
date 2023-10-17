package Tp9Ej4;

import java.util.ArrayList;

public class Noticia extends ElementosS {
	private String titulo;
	private String introduccion;
	private String texto;
	private String autor;
	private String link;
	private ArrayList <String> palabrasClaves;

	public Noticia(String nombre, String titulo, String introduccion, String texto, String autor, String link) {
		super(nombre);
		this.titulo = titulo;
		this.introduccion=introduccion;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
		palabrasClaves= new ArrayList <>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getintroduccion() {
		return introduccion;
	}

	public void setintroduccion(String introduccion) {
		this.introduccion = introduccion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public ArrayList <String> getPalabrasClaves(){
		ArrayList <String> palabras=new ArrayList <>();
		for(int i=0; i<palabrasClaves.size(); i++) {
			palabras.add(palabrasClaves.get(i));
			} return palabras;
	}

	@Override
	public ArrayList<ElementosS> Busqueda(Filtro F) {
		ArrayList <ElementosS> lista=new ArrayList <>();
		if(F.cumple(this)) {
			lista.add(this);
		}return lista;
	}

	@Override
	public Noticia copias(Filtro F) {
		if(F.cumple(this)) {
		Noticia N= new Noticia(this.getNombre(), this.getTitulo(), this.getintroduccion(), this.getTexto(), this.getAutor(), this.getLink());
		return N;
	}else {
		return null;
	}
	}

	@Override
	public int getTamanio() {
		return 1;
	}
	
	public String toString()
	{
		return "/" + this.getLink();
	}

}
