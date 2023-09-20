package Tp5Ej6;

public class Main {

    public static void main(String[] args) {
        /*Congreso de ciencias de la computacion
        *
        * Evaluador
        *conjunto de palabras clave
        *
        *
        * trabajo
        * conjunto de palabras clave
        *
        * poster hija de trabajo cambia el metodo de calculo de evaluador
        *
        *
        * */

        Evaluador e= new Evaluador("jesus","rodriguez");
        Trabajo t= new Trabajo("debug");
        Trabajo p= new Poster("poster");


        e.agregarPalabraClave("a");



        p.agregarPalabraClave("a");
        p.agregarPalabraClave("b");
        p.agregarPalabraClave("c");

        System.out.println("es apto para poster?");
        System.out.println(p.esApto(e));

        e.agregarPalabraClave("b");
        e.agregarPalabraClave("c");


        t.agregarPalabraClave("a");
        t.agregarPalabraClave("b");
        t.agregarPalabraClave("d");
        System.out.println("--------------");

        System.out.println("es apto para debug?");
        System.out.println(t.esApto(e));





    }

}
