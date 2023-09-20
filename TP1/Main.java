package Prog2;

class Main {
    public static void main(String[] args) {
        PuntoGeometrico punto1 = new PuntoGeometrico(3, 5);
        PuntoGeometrico punto2 = new PuntoGeometrico(8, 10);

        Rectangulo rectangulo1 = new Rectangulo(punto1, punto2);

        System.out.println("Área del rectángulo 1: " + rectangulo1.calcularArea());

        PuntoGeometrico punto3 = new PuntoGeometrico(1, 2);
        PuntoGeometrico punto4 = new PuntoGeometrico(5, 7);

        Rectangulo rectangulo2 = new Rectangulo(punto3, punto4);

        System.out.println("Comparación entre rectángulo 1 y rectángulo 2: " + rectangulo1.compararCon(rectangulo2));

        System.out.println("¿El rectángulo 1 es un cuadrado? " + rectangulo1.esCuadrado());

        System.out.println("Largo del lado superior del rectángulo 2: " + rectangulo2.obtenerLargoLadoSuperior());

        System.out.println("¿El rectángulo 2 está acostado? " + rectangulo2.estaAcostado());
    }
}
