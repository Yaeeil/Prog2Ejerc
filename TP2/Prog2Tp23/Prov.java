package Prog2Tp23;

public class Prov {
    String NombreProv;
    Ciudad[] ciudades;
    private int MIN;
    private int contador;

    public Prov(int cant, String nombre) {
        this.MIN = 100000;
        this.ciudades = new Ciudad[cant];
        this.NombreProv = nombre;
        this.contador = 0;
    }
    public void tenerCiudadEnCuenta() {
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].getHabitantes() > getMIN()) {
                if (ciudades[i].deficit()) {
                    contador++;
                }
            }
        }
    }

    public boolean masDeLaMitad() {
        return contador > (ciudades.length / 2);
    }


public String getNombreProv() {
	return NombreProv;
}
public void setNombreProv(String nombreProv) {
	NombreProv = nombreProv;
}
public Ciudad[] getCiudades() {
	return ciudades;
}
public void setCiudades(Ciudad[] ciudades) {
	this.ciudades = ciudades;
}
public int getContador() {
	return contador;
}
public void setContador(int contador) {
	this.contador = contador;
}
public int getMIN() {
	return 100000;
}

}