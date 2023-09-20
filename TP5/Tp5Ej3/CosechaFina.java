package Tp5Ej3;
import java.util.ArrayList;

public class CosechaFina extends Cereales {
    public CosechaFina(String nombre) {
        super(nombre, new ArrayList<String>());
    }
    
    public ArrayList<String> getMinerales() {
        ArrayList<String> minerales = new ArrayList<String>();
        minerales.add("ab");
        minerales.add("cd");
        return minerales;
    }
}
