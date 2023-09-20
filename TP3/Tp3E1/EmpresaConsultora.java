package Tp3E1;

class EmpresaConsultora {
    private String tipoEmpresa;
    private Encuesta[] encuestas;
    private int cantidadEncuestas;

    public EmpresaConsultora(String tipo, int cantidad) {
        tipoEmpresa = tipo;
        encuestas = new Encuesta[cantidad];
        cantidadEncuestas = 0;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public int obtenerNumeroEncuestasPorEmpleado(Empleado empleado) {
        int contador = 0;
        for (int i = 0; i < cantidadEncuestas; i++) {
            if (encuestas[i] != null && encuestas[i].getEmpleado().equals(empleado)) {
                contador++;
            }
        }
        return contador;
    }

    public void realizarEncuesta(Encuesta encuesta) {
        if (cantidadEncuestas < encuestas.length) {
            encuestas[cantidadEncuestas] = encuesta;
            cantidadEncuestas++;
        } else {
            System.out.println("No se pueden agregar más encuestas.");
        }
    }

    public boolean personaYaRespondioEncuesta(PersonaEncuestada persona, Encuesta encuesta) {
        for (int i = 0; i < cantidadEncuestas; i++) {
            if (encuestas[i] != null && encuestas[i].equals(encuesta) && encuestas[i].getPersonaEncuestada().equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    	//falta hacer que puedan reaalizar mas de una encuesta
        Empleado emp1 = new Empleado("Empleado1");
        Empleado emp2 = new Empleado("Empleado2");
        Empleado emp3=new Empleado ("Empleado3");

        PersonaEncuestada p1 = new PersonaEncuestada("Juan", 12345);
        PersonaEncuestada p2 = new PersonaEncuestada("Pedro", 67890);
        PersonaEncuestada p3 = new PersonaEncuestada("Juanita", 55555);

        Encuesta encuesta1 = new Encuesta("Encuesta1", "Pregunta1", "Pregunta2", "Pregunta3", "Pregunta4", emp1, p1);
        Encuesta encuesta2 = new Encuesta("Encuesta2", "Pregunta1", "Pregunta2", "Pregunta3", "Pregunta4", emp1, p2);
        Encuesta encuesta3 = new Encuesta("Encuesta3", "Pregunta1", "Pregunta2", "Pregunta3", "Pregunta4", emp1, p3);
        Encuesta encuesta4 = new Encuesta("Encuesta2", "Pregunta1", "Pregunta2", "Pregunta3", "Pregunta4", emp2, p1);
        Encuesta encuesta5 = new Encuesta("Encuesta1", "Pregunta1", "Pregunta2", "Pregunta3", "Pregunta4", emp2, p2);
        Encuesta encuesta6 = new Encuesta("Encuesta3", "Pregunta1", "Pregunta2", "Pregunta3", "Pregunta4", emp2, p3); // Intento de respuesta duplicada

        EmpresaConsultora empresa = new EmpresaConsultora("ConsultoraX", 10);

        empresa.realizarEncuesta(encuesta1);
        empresa.realizarEncuesta(encuesta2);
        empresa.realizarEncuesta(encuesta3);
        empresa.realizarEncuesta(encuesta4);
        empresa.realizarEncuesta(encuesta5);
        empresa.realizarEncuesta(encuesta6);

        // Verificar si una persona ya respondió una encuesta
        if (empresa.personaYaRespondioEncuesta(p1, encuesta1)) {
            System.out.println("La persona 1 ya respondió la encuesta 1.");
        } else {
            System.out.println("La persona 1 no ha respondido la encuesta 1.");
        }

        // Obtener el número de encuestas realizadas por un empleado
        System.out.println("El empleado 1 realizó " + empresa.obtenerNumeroEncuestasPorEmpleado(emp1) + " encuestas.");
    }
}