package Tp5Ej3;
import java.util.ArrayList;

public class CosechaGruesa extends Cereales {
    public CosechaGruesa(String nombre) {
        super(nombre, new ArrayList<String>());
    }
    
    public ArrayList<String> getMinerales() {
        ArrayList<String> minerales = new ArrayList<String>();
        minerales.add("ef");
        minerales.add("gh");
        return minerales;
    }
}
