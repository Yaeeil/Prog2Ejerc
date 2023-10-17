package Tp9Ej4;

public class FiltroTextoL implements Filtro {
int tamanio;
	public FiltroTextoL(int tamanio) {
	this.tamanio=tamanio;
	}

	@Override
	public boolean cumple(Noticia n) {
		return n.getTexto().length()>this.getTamanio();
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

}
