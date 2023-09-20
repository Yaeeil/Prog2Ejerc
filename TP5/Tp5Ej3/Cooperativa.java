package Tp5Ej3;
import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Cereales> Cereal;
    private ArrayList<Lote> Lotes;
    private String nombreC;

    public Cooperativa(ArrayList<Cereales> cereal, ArrayList<Lote> lotes, String nombreC) {
        Cereal = cereal;
        Lotes = lotes;
        this.nombreC = nombreC;
    }

    public ArrayList<Cereales> getCereal() {
        return Cereal;
    }

    public void setCereal(ArrayList<Cereales> cereal) {
        Cereal = cereal;
    }

    public ArrayList<Lote> getLotes() {
        return Lotes;
    }

    public void setLotes(ArrayList<Lote> lotes) {
        Lotes = lotes;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void Especial(ArrayList<String> mineralesEspeciales) {
        for (int i = 0; i < Lotes.size(); i++) {
            ArrayList<String> mineralesLote = Lotes.get(i).getMinerales();
            boolean esEspecial = false;

            for (String mineralEspecial : mineralesEspeciales) {
                if (mineralesLote.contains(mineralEspecial)) {
                    esEspecial = true;
                    break; // Puedes salir del bucle si encuentras un mineral especial
                }
            }

            if (esEspecial) {
                System.out.println("Es especial: " + Lotes.get(i).getNombre());
            } else {
                System.out.println("Es normal: " + Lotes.get(i).getNombre());
            }
        }
    }


    public void AptoLote(Cereales cereal) {
        for (int i = 0; i < Lotes.size(); i++) {
        	System.out.print("Para: " + cereal.getNombre() + " ");
            if (cereal.getMinerales().containsAll(Lotes.get(i).getMinerales())) {
                System.out.println("El lote: " + Lotes.get(i).getNombre() + " es apto");
            } else {
                System.out.println("El lote: " + Lotes.get(i).getNombre() + " no es apto");
            }
        }
    }

    public void AptoCereal(Lote lote) {
        for (int i = 0; i < Cereal.size(); i++) {
        	System.out.print("Para el lote: " + lote.getNombre() + " ");
            if (lote.getMinerales().containsAll(Cereal.get(i).getMinerales())) {
                System.out.println("El cereal: " + Cereal.get(i).getNombre() + " es apto");
            } else {
                System.out.println("El Cereal: " + Cereal.get(i).getNombre() + " no es apto");
            }
        }
    }
    
    public void getInfo(Cooperativa Cop ) {
    	 //especial
        ArrayList<String> mineralesEspeciales = new ArrayList<>();
        mineralesEspeciales.add("ab");
        mineralesEspeciales.add("cd");
 
        System.out.println("Nombre de la cooperativa es: " + Cop.getNombreC());
        for(int i=0; i<Cereal.size(); i++) {
        	 Cop.AptoLote(Cereal.get(i));
        }
        for(int i=0; i<Lotes.size(); i++) {
        	Cop.AptoCereal(Lotes.get(i));
       }
        
        Cop.Especial(mineralesEspeciales);;
    }

    public static void main(String[] args) {
        // Crear instancias de Cereales
        CosechaGruesa C1 = new CosechaGruesa("Cosecha Gruesa");
        C1.getMinerales().add("ef");
        C1.getMinerales().add("gh");

        CosechaFina C2 = new CosechaFina("Cosecha Fina");
        C2.getMinerales().add("ab");
        C2.getMinerales().add("cd");

        Pastura C3 = new Pastura("Pastura");
        C3.getMinerales().add("ij");
        C3.getMinerales().add("kl");

        ArrayList<String> mineralesLote1 = new ArrayList<>();
        mineralesLote1.add("ef");
        mineralesLote1.add("gh");
        ArrayList<String> mineralesLote2 = new ArrayList<>();
        mineralesLote2.add("ab");
        mineralesLote2.add("cd");


        Lote Lote1 = new Lote(100, "Lote1", mineralesLote1);

        Lote Lote2=new Lote(200, "Lote2", mineralesLote2);

        // Crear la cooperativa
        ArrayList<Cereales> cereales = new ArrayList<>();
        cereales.add(C1);
        cereales.add(C2);
        cereales.add(C3);

        ArrayList<Lote> lotes = new ArrayList<>();
        lotes.add(Lote1);
        lotes.add(Lote2);
        
        
        Cooperativa cooperativa = new Cooperativa(cereales, lotes, "Super Cooperativa");
        
        cooperativa.getInfo(cooperativa);
   
    }
}
