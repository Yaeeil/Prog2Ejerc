package HarryPotterCompleto;

public class CasaEnemistada extends  Casa{

    private Casa casaEnemiga;

    public CasaEnemistada(String nombre,int cantMaxAlumnos,Casa casaEnemiga){
        super(nombre,cantMaxAlumnos);
        this.casaEnemiga=casaEnemiga;
    }

    @Override
    public boolean esAceptado(Alumno a){
        if(!a.getCualidades().containsAll(casaEnemiga.getCualidadesNecesarias()) && super.esAceptado(a)){//si no cumple con las cualidades de la enemiga pero si cumple con las propias se acepta
            return true;
        }
        return false;
    }


}
