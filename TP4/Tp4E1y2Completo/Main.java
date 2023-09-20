package Tp4E1y2Completo;

public class Main {
    public static void main(String[] args) {
        AlarmaLuminosa alarma = new AlarmaLuminosa(5);
        Sensor s1 = new Sensor("vidrio", "cocina");
        Sensor s2 = new Sensor("puerta", "living");
        Sensor s3 = new Sensor("movimiento", "habitacion");

        alarma.addSensor(s1);
        alarma.addSensor(s2);
        alarma.addSensor(s3);
        s1.desactivar();
        s2.activar();
        s3.activar();

        System.out.println(alarma.comprobar());
    }
}
