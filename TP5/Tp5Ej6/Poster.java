package Tp5Ej6;

public class Poster extends Trabajo{
    
    public Poster(String tipo){
        super(tipo);
    }

    @Override
    public boolean esApto(Evaluador e) {
        for (String p:this.getPalabrasClave()) {
            if(e.getPalabrasClave().contains(p)){//si tiene al menos una palabra clave es apto
                return true;
            }
        }
        return false;
    }
}
