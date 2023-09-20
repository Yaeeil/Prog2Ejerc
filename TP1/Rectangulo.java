package Prog2;

class Rectangulo {
    PuntoGeometrico verticeSuperiorIzquierdo;
    PuntoGeometrico verticeInferiorDerecho;

    public Rectangulo(PuntoGeometrico vSI, PuntoGeometrico vID) {
        verticeSuperiorIzquierdo = vSI;
        verticeInferiorDerecho = vID;
    }

    public void desplazar(int x, int y) {
        verticeSuperiorIzquierdo.desplazar(x, y);
        verticeInferiorDerecho.desplazar(x, y);
    }

    public double calcularArea() {
        int base = Math.abs(verticeInferiorDerecho.getX() - verticeSuperiorIzquierdo.getX());
        int altura = Math.abs(verticeInferiorDerecho.getY() - verticeSuperiorIzquierdo.getY());
        return base * altura;
    }

    public int compararCon(Rectangulo otroRectangulo) {
        double areaThis = this.calcularArea();
        double areaOtro = otroRectangulo.calcularArea();

        if (areaThis > areaOtro) {
            return 1;
        } else if (areaThis < areaOtro) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean esCuadrado() {
        int base = Math.abs(verticeInferiorDerecho.getX() - verticeSuperiorIzquierdo.getX());
        int altura = Math.abs(verticeInferiorDerecho.getY() - verticeSuperiorIzquierdo.getY());
        return base == altura;
    }

    public int obtenerLargoLadoSuperior() {
        return Math.abs(verticeInferiorDerecho.getX() - verticeSuperiorIzquierdo.getX());
    }

    public boolean estaAcostado() {
        int base = Math.abs(verticeInferiorDerecho.getX() - verticeSuperiorIzquierdo.getX());
        int altura = Math.abs(verticeInferiorDerecho.getY() - verticeSuperiorIzquierdo.getY());
        return altura > base;
    }
}

