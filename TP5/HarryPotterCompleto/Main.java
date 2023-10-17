package HarryPotterCompleto;

public class Main {

    public static void main(String[] args) {
        /*modernizando el sombrero de Hogwarts
        *
        * Clase Alumno
        *
        * nombre
        *Conjunto de Cualidades(arraylist de Strings)
        *Conjunto de Familiares(arraylist de alumnos)
        * Casa a la que pertenece
        *
        *
        * Clase padre Casa:
        * Conjunto de Cualidades necesarias(arraylist de Strings)
        * cantidad alumnos, deberia sumarla cada vez que agrego uno
        * cantidad maxima de alumnos(chequear que no se supere cada vez que agrego)
        *
        *
        * clases hijas que redefinen metodo de aceptacion
        *
        * CasaPuraSangre
        *
        * CasaConEnemiga: esta deberia recibir una casa enemiga por parametro
        * */

        //hay conflicto con la casa puraSangre, la unica manera en que lo hice andar fue pudiendo setear la casa del alumno directamente y creando un metodo a parte, no puedo chequear si el alumno cumple los requisitos desde alumno, solo desde casa

        Alumno a1= new Alumno("Harry");
        Alumno a2= new Alumno("Lulo");

        Alumno a4= new Alumno("Tomás");

        //cualidades alumnos
        a1.agregarCualidad("valentia");
        a1.agregarCualidad("determinacion");
        a1.agregarCualidad("coraje");

        a2.agregarCualidad("inteligencia");
        a2.agregarCualidad("creatividad");
        a2.agregarCualidad("sabiduria");

        a4.agregarCualidad("astucia");
        a4.agregarCualidad("ambicion");
        a4.agregarCualidad("determinacion");



        Casa c1= new Casa("Gryffindor",400);
        CasaPuraSangre c2= new CasaPuraSangre("Slytherin",500);
        Casa c3= new Casa("Hufflepuff",200);
        Casa c4= new CasaEnemistada("Ravenclaw",380,c3);

        Alumno a3= new Alumno("Lucho");
        a3.setCasa(c2);
        a3.agregarCualidad("astucia");
        a3.agregarCualidad("ambicion");
        a3.agregarCualidad("determinacion");




        //cualidades casas
        c1.agregarCualidad("valentia");
        c1.agregarCualidad("determinacion");
        c1.agregarCualidad("coraje");

        c2.agregarCualidad("astucia");
        c2.agregarCualidad("ambicion");
        c2.agregarCualidad("determinacion");

        c3.agregarCualidad("lealtad");
        c3.agregarCualidad("amabilidad");
        c3.agregarCualidad("diligencia");

        c4.agregarCualidad("inteligencia");
        c4.agregarCualidad("creatividad");
        c4.agregarCualidad("sabiduria");




        //agrego alumno a su casa
        c1.agregarAlumno(a1);
        System.out.println(a1);

        System.out.println("---------------");



        //familiar a slytherin
        c2.agregarFamiliarACasa(a3);

        System.out.println(a3);
        System.out.println("---------------");
        //no deja porque no tiene familiar aun
        c2.agregarAlumno(a4);

        //agrego familiar a alumno
        a4.agregarFamiliar(a3);

        System.out.println(a4);

        //ahora si deja  agregar porque ya hay un familiar en esa casa
        c2.agregarAlumno(a4);

        System.out.println(a4);

        System.out.println("---------------");
        //casa enemistada

        c4.agregarAlumno(a2);


        System.out.println(a2);

        System.out.println("------------------");
        c4.agregarAlumno(a1);
        System.out.println(a1);





    }

}
