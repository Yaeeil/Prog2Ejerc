package TP5Ej1;
import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (!elementos.isEmpty()) {
            int ult = elementos.size() - 1;
            T elemento = elementos.get(ult);
            elementos.remove(ult);
            return elemento;
        } else {
            throw new IllegalStateException("La pila está vacía.");
        }
    }

    public T top() {
        if (!elementos.isEmpty()) {
            return elementos.get(elementos.size() - 1);
        } else {
            throw new IllegalStateException("La pila está vacía.");
        }
    }


    public int size() {
        return elementos.size();
    }

    public Pila<T> copy() {
        Pila<T> copia = new Pila<>();
        for (T elemento : elementos) {
            copia.push(elemento);
        }
        return copia;
    }
    
    public void imprimir() {
    	 System.out.println("Pila en orden:");
         for (T elemento : elementos) {
             System.out.println(elemento);
         }
    }

    public void reverse() {
        ArrayList<T> elementosInversos = new ArrayList<>();

        for (int i = elementos.size() - 1; i >= 0; i--) {
            elementosInversos.add(elementos.get(i));
        }

        System.out.println("Pila en orden inverso:");
        for (T elemento : elementosInversos) {
            System.out.println(elemento);
        }
    }


    public boolean isEmpty() {
        return elementos.isEmpty();
    }


    public static void main(String[] args) {
        Pila<Object> pila = new Pila<>();
        pila.push("Hola");
        pila.push("Chau");
        pila.push("Hello");

        System.out.println("Pila original:");
        pila.imprimir();
        pila.reverse();
        while (!pila.isEmpty()) {
        	System.out.println("size: " + pila.size());
            System.out.println("Top: " + pila.top());
            System.out.println("Pop: " + pila.pop());
        }
    }
}
