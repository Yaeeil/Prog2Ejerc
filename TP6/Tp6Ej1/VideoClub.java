package Tp6Ej1;
import java.time.LocalDate;
import java.util.ArrayList;

public class VideoClub {
    private LocalDate fechaA;
    private ArrayList<Items> items;
    private ArrayList<Cliente> clientes;

    public VideoClub(LocalDate fechaA) {
        this.fechaA = fechaA;
        this.items = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public boolean puedeSerAlquilado(Items ii) {
        return ii.isAlquilado();
    }

    public ArrayList<Cliente> clientesVencidos() {
        ArrayList<Cliente> aux = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (fechaA.isEqual(cliente.getFechaDeV()) || fechaA.isBefore(cliente.getFechaDeV())) {
                aux.add(cliente);
            }
        }
        return aux;
    }

    public LocalDate getFechaA() {
        return fechaA;
    }

    public void setFechaA(LocalDate fechaA) {
        this.fechaA = fechaA;
    }

    public static void main(String[] args) {
        VideoClub vv = new VideoClub(LocalDate.parse("2023-09-09"));

        // Crear y agregar clientes usando ArrayList
        ArrayList<Cliente> clientesList = new ArrayList<>();
        clientesList.add(new Cliente("Claudio", LocalDate.parse("2023-07-18"), LocalDate.parse("2023-08-09")));
        clientesList.add(new Cliente("Ana", LocalDate.parse("2023-05-13"), LocalDate.parse("2023-07-04")));

        vv.clientes.addAll(clientesList);

        // Crear y agregar objetos Items usando ArrayList
        ArrayList<Items> itemsList = new ArrayList<>();
        itemsList.add(new Auto(true, "Volsvagen", 10000, "ABC123", "Nafta"));
        itemsList.add(new Auto(false, "Peugeot", 200000, "ASD789", "Diesel"));
        itemsList.add(new Pelicula(true, "info ej1", 10));
        itemsList.add(new Pelicula(false, "info ej 2", 5));

        vv.items.addAll(itemsList);

        // Iterar sobre los objetos Items y verificar si pueden ser alquilados
        for (Items item : vv.items) {
            if (vv.puedeSerAlquilado(item)) {
                System.out.println("El item se puede alquilar: " + item.toString());
            } else {
                System.out.println("El item no se puede alquilar: " + item.toString());
            }
        }

        // Obtener clientes vencidos
        ArrayList<Cliente> clientesVencidos = vv.clientesVencidos();
        for (Cliente cliente : clientesVencidos) {
            System.out.println("Cliente vencido: " + cliente.toString());
        }
    }
}
