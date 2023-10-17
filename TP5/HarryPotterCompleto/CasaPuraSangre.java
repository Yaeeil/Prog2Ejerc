package HarryPotterCompleto;

public class CasaPuraSangre extends Casa {


    public CasaPuraSangre(String nombre,int cantMaxAlumnos){
        super(nombre,cantMaxAlumnos);
    }


@Override
    public void agregarFamiliarACasa(Alumno familiar){
        if (familiar.getCasa().getNombre()==this.getNombre()){
            super.agregarFamiliarACasa(familiar);
        }
    }
    @Override
    public boolean esAceptado(Alumno a){
        boolean familiarEnCasa=false;
        for (Alumno familiar : a.getFamiliares()) {
            if (familiar.getCasa() == this) {
                familiarEnCasa=true; // Al menos un familiar está en la misma casa, se acepta al alumno.
            }
        }

        if(familiarEnCasa && super.esAceptado(a)){
            return true;
        }
        System.out.println(familiarEnCasa);
        return false;

    }


}
