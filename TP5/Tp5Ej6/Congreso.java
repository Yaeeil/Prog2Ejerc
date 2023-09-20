package Tp5Ej6;

import java.util.ArrayList;
import java.util.List;

public class Congreso {

    private List<Evaluador>evaluadores;
    private List<Trabajo>trabajos;
    private List<String>palabrasExperto;


    public Congreso(){
        evaluadores=new ArrayList<>();
        trabajos=new ArrayList<>();
        palabrasExperto=new ArrayList<>();
    }

    public void agregarPalabrasExperto(String p){
        if(!palabrasExperto.contains(p) && p!=null)
            palabrasExperto.add(p);
    }
    public void agregarEvaluador(Evaluador e){
        if(!evaluadores.contains(e) && e!=null)
            evaluadores.add(e);
    }
    public void agregarTrabajo(Trabajo t){
        if(!trabajos.contains(t) && t!=null)
            trabajos.add(t);
    }

    public boolean esExperto(Evaluador e){
        return e.getPalabrasClave().containsAll(palabrasExperto);
    }
    public Evaluador asignarEvaluador(Trabajo t){

        for (Evaluador e:evaluadores) {
            if(t.esApto(e)){
                return e;
            }
        }
        return null;
    }

    public List<Trabajo> TrabajosParaEvaluador(Evaluador e){

        List<Trabajo> listaTrabajos=new ArrayList<>();

        for (Trabajo t:trabajos) {
            if(t.esApto(e))
                listaTrabajos.add(t);
        }
        return listaTrabajos;
    }




}
