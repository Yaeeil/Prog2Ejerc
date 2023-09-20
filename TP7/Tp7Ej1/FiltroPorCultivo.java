package Tp7Ej1;


public class FiltroPorCultivo extends Filtro{
	private Cultivo cultivoApto;
	private Enfermedad enfermedadBuscada;
	
	public FiltroPorCultivo(Cultivo cultivoApto, Enfermedad enfermedadBuscada){
		this.cultivoApto = cultivoApto;
		this.enfermedadBuscada = enfermedadBuscada;
	}
	@Override
	public boolean cumple(Producto p) {
		return !p.contieneCultivoDesaconsejado(cultivoApto) && this.enfermedadBuscada.trataEnfermedad(p); 
	}

}