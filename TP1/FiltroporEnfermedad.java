package Tp7Ej1;


public class FiltroporEnfermedad extends Filtro{
	private Enfermedad enfermedadBuscada;
	
	public FiltroporEnfermedad (Enfermedad enfermedadBuscada){
		this.enfermedadBuscada= enfermedadBuscada;
	}

	@Override
	public boolean cumple(Producto p) {
		return  this.enfermedadBuscada.trataEnfermedad(p);
	}
}
