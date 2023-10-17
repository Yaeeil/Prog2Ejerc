package Tp9Ej4;

import java.util.ArrayList;

public class Categoria extends ElementosS {

	private String introduccion;
	private String imagen;
	private ArrayList<ElementosS> elementos;

public Categoria(String nombre, String introduccion, String imagen) {
	super(nombre);
	this.introduccion = introduccion;
	this.imagen = imagen;
	elementos=new ArrayList <>();
}

public void addElemento(ElementosS elem) {
	elementos.add(elem);
}
public String getIntroduccion() {
	return introduccion;
}
public void setIntroduccion(String introduccion) {
	this.introduccion = introduccion;
}
public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
@Override
public ArrayList<ElementosS> Busqueda(Filtro F) {
	ArrayList <ElementosS> elem= new ArrayList <>();
	for(int i=0; i<elementos.size(); i++) {
		elem.addAll(elementos.get(i).Busqueda(F));
	}return elem;
}

@Override
public int getTamanio() {
	int tam=0;
	for(int i=0; i<elementos.size(); i++) {
		tam+=elementos.get(i).getTamanio();
	}return tam;
}

@Override
public Categoria copias(Filtro f) {
	Categoria cat= new Categoria(this.getNombre(), this.getIntroduccion(), this.getImagen());
	for(int i=0; i<elementos.size(); i++) {
		ElementosS copiaHijo=elementos.get(i).copias(f);
		if (copiaHijo!=null) {
			cat.addElemento(copiaHijo);
		}
	}if(cat.getTamanio()==0) {
		return null;
	}else {
		return cat;
	}
}
public String toString()
{
	return "/" + this.getNombre();
}

}
