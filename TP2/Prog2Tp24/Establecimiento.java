package Prog2Tp24;
public class Establecimiento {
    Futbol[] canchasDeFutbol;
    Paddle[] canchasDePaddle;
    Usuarios[] socios;
    int numSocios = 0;

    public Establecimiento(int cantF, int cantPaddle, int cantU) {
        canchasDeFutbol = new Futbol[cantF];
        canchasDePaddle = new Paddle[cantPaddle];
        socios = new Usuarios[cantU];
    }

    public void registrarSocio(Usuarios usuario) {
        if (usuario.contadorTurnos >= 4) {
            usuario.esSocio = true;
            socios[numSocios] = usuario;
            numSocios++;
            System.out.println("Usuario " + usuario.nombre + " registrado como socio.");
        } else {
            System.out.println("Usuario " + usuario.nombre + " no cumple los requisitos para ser socio.");
        }
    }

    public void reservarTurno(Futbol cancha, Usuarios usuario, int horaInicio, int duracion) {
        if (cancha.verificarDisponibilidad(horaInicio, duracion)) {
            cancha.reservarTurno(usuario, horaInicio, duracion);
            usuario.incrementarContadorTurnos();
            System.out.println("Turno reservado en la cancha de fútbol.");
        } else {
            System.out.println("La cancha de fútbol no está disponible en ese horario.");
        }
    }

    public void reservarTurno(Paddle cancha, Usuarios usuario, int horaInicio, int duracion) {
        if (cancha.verificarDisponibilidad(horaInicio, duracion)) {
            cancha.reservarTurno(usuario, horaInicio, duracion);
            usuario.incrementarContadorTurnos();
            System.out.println("Turno reservado en la cancha de paddle.");
        } else {
            System.out.println("La cancha de paddle no está disponible en ese horario.");
        }
    }

    public static void main(String[] args) {
        Establecimiento establecimiento = new Establecimiento(2, 4, 2);

        Futbol canchaFutbol1 = new Futbol(1);
        establecimiento.canchasDeFutbol[0] = canchaFutbol1;

        Paddle canchaPaddle1 = new Paddle(1);
        establecimiento.canchasDePaddle[0] = canchaPaddle1;

        Paddle canchaPaddle2 = new Paddle(2);
        establecimiento.canchasDePaddle[1] = canchaPaddle2;

        Usuarios nuevoSocio = new Usuarios("Juan");
        nuevoSocio.contadorTurnos = 5;
        establecimiento.registrarSocio(nuevoSocio);

        Usuarios usuarioMaria = new Usuarios("María");
        establecimiento.registrarSocio(usuarioMaria);

        Usuarios otroUsuario = new Usuarios("Pedro");
        establecimiento.reservarTurno(canchaFutbol1, otroUsuario, 2, 2);
        establecimiento.reservarTurno(canchaPaddle1, otroUsuario, 3, 1);
        establecimiento.reservarTurno(canchaPaddle1, otroUsuario, 3, 1); // Superposición de horarios
        establecimiento.reservarTurno(canchaPaddle2, otroUsuario, 4, 1);
    }
}