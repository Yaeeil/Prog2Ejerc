package Tp5Ej2;
import java.util.ArrayList;

public class Casa {
    String nombre;
    private ArrayList<String> cualidades;
    private int capacidadMaxima;
    private ArrayList<Alumno> alumnos;

    public Casa(String nombre, ArrayList<String> cualidades, int capacidadMaxima, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.cualidades = cualidades; // No necesitas crear un nuevo ArrayList aquí
        this.capacidadMaxima = capacidadMaxima;
        this.alumnos = alumnos; // No necesitas crear un nuevo ArrayList aquí
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumnos.size() < capacidadMaxima && cumpleRequisitos(alumno)) {
            alumnos.add(alumno);
        }
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public boolean cumpleRequisitos(Alumno alumno) {
        return cualidades.containsAll(alumno.getCualidades());
    }

    
    //como redefino el equals ?? tipo como tendria que hacer? 
    ///porque asi solo no funca el contains all
    
    
    public static void main(String[] args) {
        // Crear alumnos
        Alumno alumno1 = new Alumno("Alumno1", new ArrayList<>(), new ArrayList<>());
        Alumno alumno2 = new Alumno("Alumno2", new ArrayList<>(), new ArrayList<>());
       alumno1.getCualidades().add("Amor");
        alumno1.getCualidades().add("Plata");
        alumno2.getCualidades().add("Valentia");
       alumno2.getCualidades().add("Pasion");
        
        // Crear familias
        Alumno f1 = new Alumno("F1", new ArrayList<>(), new ArrayList<>());
        Alumno f2 = new Alumno("F2", new ArrayList<>(), new ArrayList<>());
        f1.getCualidades().add("Amor");
        f1.getCualidades().add("Plata");
        f2.getCualidades().add("Valentia");
        f2.getCualidades().add("Pasion");
        
        //para agregar los arreglos de familiares a la casa Linaje como hago?
        //misma duda para la casaEnemistada

        // Agregar familiares a alumnos
        alumno1.getFamiliares().add(f1);
        alumno2.getFamiliares().add(f2);

        // Crear casas
        CasaLinaje casa1 = new CasaLinaje("Casa1", new ArrayList<>(), 10, new ArrayList<>(), new ArrayList<>());
        Casa casa2 = new Casa("Casa2", new ArrayList<>(), 10, new ArrayList<>());

        // Agregar cualidades después de la creación
        casa1.getCualidades().add("Valentia");
        casa1.getCualidades().add("Pasion");
        casa1.agregarAlumno(alumno1);
        casa1.getFamiliares().add(f1);

        casa2.getCualidades().add("Amor");
        casa2.getCualidades().add("Plata");
        casa2.agregarAlumno(alumno2);
        
        

        // Comprobar la lista de alumnos en cada casa
        System.out.println("Alumnos en Casa1:");
        for (Alumno alumno : casa1.getAlumnos()) {
            System.out.println(alumno.getNombre());
        }

        System.out.println("\nAlumnos en Casa2:");
        for (Alumno alumno : casa2.getAlumnos()) {
            System.out.println(alumno.getNombre());
        }
    }
}
